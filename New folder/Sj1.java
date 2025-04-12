/*
 * Decompiled with CFR 0.152.
 */
public final class Sj1
extends Enum {
    private static final /* synthetic */ Sj1[] $VALUES;
    public static final /* enum */ Sj1 Max;
    public static final /* enum */ Sj1 Min;

    private static final /* synthetic */ Sj1[] $values() {
        Sj1 sj1 = Min;
        sj1 = Max;
        Sj1[] sj1Array = new Sj1[]{sj1, sj1};
        return sj1Array;
    }

    static {
        Sj1 sj1;
        Min = sj1 = new Sj1("Min", 0);
        Max = sj1 = new Sj1("Max", 1);
        $VALUES = Sj1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Sj1() {
        void var2_-1;
        void var1_-1;
    }

    public static Sj1 valueOf(String string2) {
        return Enum.valueOf(Sj1.class, string2);
    }

    public static Sj1[] values() {
        return (Sj1[])$VALUES.clone();
    }
}

