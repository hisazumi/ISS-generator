instruction add {
        type r;
        coding 0x2;
        behavior{
                regs[RD]=regs[RS]+regs[RT];
        }
}

instruction addi {
        type i;
        coding 0x1;
        behavior{
                regs[RT]=regs[RS]+RD;
        }
}

instruction bne {
        type i;
        coding 0x3;
        behavior{
                if (regs[RS] != regs[RT], IM, NEXT);
        }
}
