/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Bp1
 */
public final class bp1_0
extends Enum {
    private static final /* synthetic */ bp1_0[] $VALUES;
    public static final /* enum */ bp1_0 Ltr;
    public static final /* enum */ bp1_0 Rtl;

    private static final /* synthetic */ bp1_0[] $values() {
        bp1_0 bp1_02 = Ltr;
        bp1_02 = Rtl;
        bp1_0[] bp1_0Array = new bp1_0[]{bp1_02, bp1_02};
        return bp1_0Array;
    }

    static {
        bp1_0 bp1_02;
        Ltr = bp1_02 = new bp1_0("Ltr", 0);
        Rtl = bp1_02 = new bp1_0("Rtl", 1);
        $VALUES = bp1_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bp1_0() {
        void var2_-1;
        void var1_-1;
    }

    public static bp1_0 valueOf(String string2) {
        return Enum.valueOf(bp1_0.class, string2);
    }

    public static bp1_0[] values() {
        return (bp1_0[])$VALUES.clone();
    }
}

