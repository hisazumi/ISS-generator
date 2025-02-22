#include "llvm/Support/IRBuilder.h"
#include "llvm/LLVMContext.h"
#include "llvm/Module.h"
#include "llvm/Function.h"
#include "llvm/DerivedTypes.h"
#include "llvm/Constants.h"
#include "llvm/Instructions.h"
#include "llvm/ModuleProvider.h"
#include "llvm/Analysis/Verifier.h"
#include "llvm/ExecutionEngine/JIT.h"
#include "llvm/ExecutionEngine/Interpreter.h"
#include "llvm/ExecutionEngine/GenericValue.h"
#include "llvm/Support/raw_ostream.h"
#include "llvm/GlobalVariable.h"
#include "llvm/Target/TargetData.h"
#include "llvm/LinkAllPasses.h"
#include "llvm/PassManager.h"

using namespace llvm;

extern Module *module;
extern LLVMContext context;
extern ExecutionEngine *engine;
extern std::vector<BasicBlock *> basic_blocks;
extern IRBuilder<> builder;

/*
 * MIPS like Instruction Set
 */

enum {
	RET = 0, ADDI=1, ADD=2, BNE=3
};

#define R(op, rs, rt, rd) ((op << (32-6)) | (rs << (32-6-5)) | (rt << (32-6-5-5)) | (rd << (32-6-5-5-5)))
#define I(op, rs, rt, im) ((op << (32-6)) | (rs << (32-6-5)) | (rt << (32-6-5-5)) | (im & 0xffff))

#define OP(inst) ((inst >> (32-6)) & 0x3f)
#define RS(inst) ((inst >> (32-6-5)) & 0x1f)
#define RT(inst) ((inst >> (32-6-5-5)) & 0x1f)
#define RD(inst) ((inst >> (32-6-5-5-5)) & 0x1f)
#define IM(inst) (inst & 0x0000ffff)

#define ADD(rd, rs, rt)  R(ADD,  rs, rt, rd)
#define ADDI(rt, rs, im) I(ADDI, rs, rt, im)
#define BNE(rt, rs, im)  I(BNE,  rs, rt, im)


/*
 * レジスタ操作関数
 */

Value *
ir_reg(int reg);

Value *
ir_reg_load(int reg) ;

Value *
ir_pc_load() ;

Value *
ir_flags_load() ;

void ir_pc_set(int pc) ;

void decode (int pc, int inst);

