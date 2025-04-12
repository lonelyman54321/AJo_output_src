/*
 * Decompiled with CFR 0.152.
 */
public final class Tj1
extends Enum {
    private static final /* synthetic */ Tj1[] $VALUES;
    public static final /* enum */ Tj1 Max;
    public static final /* enum */ Tj1 Min;

    private static final /* synthetic */ Tj1[] $values() {
        Tj1 tj1 = Min;
        tj1 = Max;
        Tj1[] tj1Array = new Tj1[]{tj1, tj1};
        return tj1Array;
    }

    static {
        Tj1 tj1;
        Min = tj1 = new Tj1("Min", 0);
        Max = tj1 = new Tj1("Max", 1);
        $VALUES = Tj1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Tj1() {
        void var2_-1;
        void var1_-1;
    }

    public static Tj1 valueOf(String string2) {
        return Enum.valueOf(Tj1.class, string2);
    }

    public static Tj1[] values() {
        return (Tj1[])$VALUES.clone();
    }
}

