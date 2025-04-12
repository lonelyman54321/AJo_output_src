/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from sL1
 */
public final class sl1_0
extends Enum {
    private static final /* synthetic */ sl1_0[] $VALUES;
    public static final /* enum */ sl1_0 Max;
    public static final /* enum */ sl1_0 Min;

    private static final /* synthetic */ sl1_0[] $values() {
        sl1_0 sl1_02 = Min;
        sl1_02 = Max;
        sl1_0[] sl1_0Array = new sl1_0[]{sl1_02, sl1_02};
        return sl1_0Array;
    }

    static {
        sl1_0 sl1_02;
        Min = sl1_02 = new sl1_0("Min", 0);
        Max = sl1_02 = new sl1_0("Max", 1);
        $VALUES = sl1_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private sl1_0() {
        void var2_-1;
        void var1_-1;
    }

    public static sl1_0 valueOf(String string2) {
        return Enum.valueOf(sl1_0.class, string2);
    }

    public static sl1_0[] values() {
        return (sl1_0[])$VALUES.clone();
    }
}

