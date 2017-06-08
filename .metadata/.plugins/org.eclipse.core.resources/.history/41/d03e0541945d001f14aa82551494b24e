union _Inst {
	unsigned int value;
	struct {
		unsigned int op :6;
		unsigned int rest :27;
	} op;

	struct {
		unsigned int op :6;
		unsigned int rs :5;
		unsigned int rt :5;
		unsigned int rd :5;
	} reg;

	struct {
		unsigned int op :6;
		unsigned int rs :5;
		unsigned int rt :5;
		unsigned int rd :5;
		unsigned int sa :5;
		unsigned int func :6;
	} r;

	struct {
		unsigned int op :6;
		unsigned int rs :5;
		unsigned int rt :5;
		unsigned int im :16;
	} i;

	struct {
		unsigned int op :6;
		unsigned int addr :26;
	} j;
};
typedef union _Inst Inst;

void add_emit(Inst inst) {

	builder.CreateStore(

	builder.CreateAdd(

	ir_reg_load(inst.reg.rs)

	,

	ir_reg_load(inst.reg.rt)

	)

	, ir_reg(inst.reg.rd));

	builder.CreateBr(basic_blocks.at(pc + 1));
}

void addi_emit(Inst inst) {

	builder.CreateStore(

	builder.CreateAdd(

	ir_reg_load(inst.reg.rs)

	,

	ConstantInt::get(Type::getInt32Ty(context), inst.i.im)

	)

	, ir_reg(inst.reg.rt));

	builder.CreateBr(basic_blocks.at(pc + 1));
}

void bne_emit(Inst inst) {

	builder.CreateCondBr(builder.CreateICmpNE(

	ir_reg_load(inst.reg.rs)

	,

	ir_reg_load(inst.reg.rt)

	), basic_blocks.at(inst.i.im), basic_blocks.at(pc + 1));

	builder.CreateBr(basic_blocks.at(pc + 1));
}

void decode(int _inst) {
	Inst inst;
	inst.value = _inst;
	switch (inst.op.op) {

	case 0x0: /* add */
		add_emit(inst);
		break;

	case 0x1: /* addi */
		addi_emit(inst);
		break;

	case 0x2: /* bne */
		bne_emit(inst);
		break;

	}
}
