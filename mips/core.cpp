#include "core.h"

#include <arpa/inet.h>
#include <stdio.h>

/*------------------------------------------------------------*/
/* LLVMのための変数群
 */

Module *module;
LLVMContext context;
IRBuilder<> builder(context);
ExecutionEngine *engine;
/* basic_blocks アドレス番目に入っていることが前提 */
std::vector<BasicBlock *> basic_blocks;

/*------------------------------------------------------------*/
/* A sample code
 */

int insts[] = {
		ADDI(0, 0, 0), //0: 0
		ADDI(1, 0, 1), //1: counter
		ADDI(2, 0, 0), //2; sum
		ADDI(3, 0, 1), //3: 1
		ADDI(4, 0, 10001), //4: 10001
		ADD(2, 2, 1), //9: r2 += r1
		ADD(1, 1, 3), //10: r1 += r3
		BNE(1, 4, 5), //11: if (counter != r3) => jmp 9
		0 //8: terminator
};

/*------------------------------------------------------------*/
/* Simulator Structure
 */

int _program_counter = 0;
int _flags = 0;
int _regs[10] = { 0 };

GlobalVariable *program_counter;
GlobalVariable *flags;
GlobalVariable *regs;

/*------------------------------------------------------------*/

void address2label(char *label, int n, int address) {
	snprintf(label, n, "pc:%x", address);
}

/* offset は 0 が前提 */
void basic_block_prepare(Function *function, int num) {
	int pc = 0;
	for (int i = 0; i < num; i++) {
		char label[20];
		address2label(label, 20, pc);
		basic_blocks.push_back(BasicBlock::Create(context, label, function));
		pc++;
	}
}
/*------------------------------------------------------------*/
/* register 操作
 */

Value *
ir_reg(int reg) {
	return builder.CreateConstInBoundsGEP2_32(regs, 0, reg);
}

Value *
ir_reg_load(int reg) {
	return builder.CreateLoad(ir_reg(reg));
}

Value *
ir_pc_load() {
	return builder.CreateLoad(program_counter);
}

Value *
ir_flags_load() {
	return builder.CreateLoad(flags);
}

void ir_pc_set(int pc) {
	builder.CreateStore(ConstantInt::get(Type::getInt32Ty(context), pc),
			program_counter);
}

/*------------------------------------------------------------*/
/* emit LLVM IRs
 */

Function *
emit_body() {
	Function *function = cast<Function> (module->getOrInsertFunction("main",
			Type::getVoidTy(context), (Type *) 0));

	/* 命令数分のBBをあらかじめ準備 */
	basic_block_prepare(function, sizeof(insts) / sizeof(int));

	/* 1命令ごとに1 Basic Block(BB)生成。
	 命令に対応するBB名を命名 pc:<address> */
	Function::BasicBlockListType &list = function->getBasicBlockList();
	Function::BasicBlockListType::iterator it = list.begin();
	for (int pc = 0; pc < sizeof(insts)/sizeof(int); pc++) {
		// printf ("%x: %8x\n", pc, insts[pc]);
		builder.SetInsertPoint(it);

		/* 制御はLLVMの世界で実行するため,
		 program_counterはdebug用においているだけ。
		 各BBのアドレスは自明なのでそれを設定している。*/
		ir_pc_set(pc);
		decode (pc, insts[pc]);
		it++;
	}

	return function;
}

GlobalVariable *
emit_register(const Type *T, const Twine &Name, void *address) {
	GlobalVariable *g = new GlobalVariable(*module, T, false,
			GlobalValue::ExternalLinkage, NULL, Name);
	engine->addGlobalMapping(g, address);
	return g;
}

void emit_structure() {
	program_counter = emit_register(Type::getInt32Ty(context),
			"program_counter", &_program_counter);
	flags = emit_register(Type::getInt1Ty(context), "flags", &_flags);
	regs = emit_register(ArrayType::get(Type::getInt32Ty(context), 10), "regs",
			_regs);
	// メモリは?
}

void dump(void) {
	/* なぜかBig Endianで変数にアクセスしているので、変換している。
	 本来はllvm世界をLittle Endianで、というか、ホストと同じendianで
	 動作させるべきと思うが・・・。
	 */
	printf("==========\n");
	printf("pc: %x\n", ntohl (_program_counter));
	printf("reg: ");
	for (int i = 0; i < 10; i++) {
		printf("%x ", ntohl (_regs[i]));
	}
	printf("\n");
}

int main() {
	/* emit llvm ir */
	module = new Module("test", context);
	engine = EngineBuilder(module).create();
	emit_structure();
	Function *f = emit_body();
	// f->dump();

	/* verify */
	if (verifyModule(*module)) {
		errs() << "Error constructing function!\n";
		return 1;
	}

	/* setup optimizer */
	FunctionPassManager fpm(new ExistingModuleProvider(module));
	fpm.add(new TargetData(*engine->getTargetData()));
	fpm.add(createInstructionCombiningPass());
	fpm.add(createReassociatePass());
	fpm.add(createGVNPass());
	fpm.add(createCFGSimplificationPass());
	fpm.doInitialization();

	/* optimize */
	/* emit  0.51s user 0.01s system 97% cpu 0.533 total
	 * =>
	 * emit  0.26s user 0.01s system 97% cpu 0.269 total
	 */
	fpm.run(*f);
	// f->dump();

	/* run */
	dump();

	std::vector<GenericValue> args(0);
	GenericValue GV = engine->runFunction(f, args);

	dump();

	return 0;
}

