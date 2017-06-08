#include "core.h"

void add_emit(int pc, int inst) {

	builder.CreateStore(

			builder.CreateAdd(

					ir_reg_load(RS(inst))

					,

					ir_reg_load(RT(inst))

			)

			, ir_reg(RD(inst)));

	builder.CreateBr(basic_blocks.at(pc + 1));

}

void addi_emit(int pc, int inst) {

	builder.CreateStore(

			builder.CreateAdd(

					ir_reg_load(RS(inst))

					,

					ConstantInt::get(Type::getInt32Ty(context), IM(inst))

			)

			, ir_reg(RT(inst)));

	builder.CreateBr(basic_blocks.at(pc + 1));

}

void bne_emit(int pc, int inst) {

	builder.CreateCondBr(builder.CreateICmpNE(

			ir_reg_load(RS(inst))

			,

			ir_reg_load(RT(inst))

	), basic_blocks.at(IM(inst)), basic_blocks.at(pc + 1));

}

void decode(int pc, int inst) {
	switch (OP(inst)) {

	case 0x2: /* add */
		add_emit(pc, inst);
		break;

	case 0x1: /* addi */
		addi_emit(pc, inst);
		break;

	case 0x3: /* bne */
		bne_emit(pc, inst);
		break;

	case 0:
		builder.CreateRetVoid();
		break;

	default:
		printf("unsupported instruction ");
		break;
	}
}
