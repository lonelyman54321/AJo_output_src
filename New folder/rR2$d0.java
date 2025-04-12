/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$d0
extends Enum {
    private static final /* synthetic */ rR2$d0[] $VALUES;
    public static final /* enum */ rR2$d0 cm;
    public static final /* enum */ rR2$d0 em;
    public static final /* enum */ rR2$d0 ex;
    public static final /* enum */ rR2$d0 in;
    public static final /* enum */ rR2$d0 mm;
    public static final /* enum */ rR2$d0 pc;
    public static final /* enum */ rR2$d0 percent;
    public static final /* enum */ rR2$d0 pt;
    public static final /* enum */ rR2$d0 px;

    static {
        rR2$d0 rR2$d0;
        rR2$d0 rR2$d02;
        rR2$d0 rR2$d03;
        rR2$d0 rR2$d04;
        rR2$d0 rR2$d05;
        rR2$d0 rR2$d06;
        rR2$d0 rR2$d07;
        rR2$d0 rR2$d08;
        rR2$d0 rR2$d09;
        px = rR2$d09 = new rR2$d0("px", 0);
        int n3 = 1;
        em = rR2$d08 = new rR2$d0("em", n3);
        int n4 = 2;
        ex = rR2$d07 = new rR2$d0("ex", n4);
        int n7 = 3;
        in = rR2$d06 = new rR2$d0("in", n7);
        int n8 = 4;
        cm = rR2$d05 = new rR2$d0("cm", n8);
        mm = rR2$d04 = new rR2$d0("mm", 5);
        pt = rR2$d03 = new rR2$d0("pt", 6);
        pc = rR2$d02 = new rR2$d0("pc", 7);
        int n10 = 8;
        percent = rR2$d0 = new rR2$d0("percent", n10);
        rR2$d0[] rR2$d0Array = new rR2$d0[9];
        rR2$d0Array[0] = rR2$d09;
        rR2$d0Array[n3] = rR2$d08;
        rR2$d0Array[n4] = rR2$d07;
        rR2$d0Array[n7] = rR2$d06;
        rR2$d0Array[n8] = rR2$d05;
        rR2$d0Array[5] = rR2$d04;
        rR2$d0Array[6] = rR2$d03;
        rR2$d0Array[7] = rR2$d02;
        rR2$d0Array[n10] = rR2$d0;
        $VALUES = rR2$d0Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rR2$d0() {
        void var2_-1;
        void var1_-1;
    }

    public static rR2$d0 valueOf(String string2) {
        return Enum.valueOf(rR2$d0.class, string2);
    }

    public static rR2$d0[] values() {
        return (rR2$d0[])$VALUES.clone();
    }
}

