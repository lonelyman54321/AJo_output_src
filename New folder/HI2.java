/*
 * Decompiled with CFR 0.152.
 */
public final class HI2
extends Enum {
    private static final /* synthetic */ HI2[] $VALUES;
    public static final /* enum */ HI2 LAUNCH_INITIAL_REFRESH;
    public static final /* enum */ HI2 SKIP_INITIAL_REFRESH;

    private static final /* synthetic */ HI2[] $values() {
        HI2 hI2 = LAUNCH_INITIAL_REFRESH;
        hI2 = SKIP_INITIAL_REFRESH;
        HI2[] hI2Array = new HI2[]{hI2, hI2};
        return hI2Array;
    }

    static {
        HI2 hI2;
        LAUNCH_INITIAL_REFRESH = hI2 = new HI2("LAUNCH_INITIAL_REFRESH", 0);
        SKIP_INITIAL_REFRESH = hI2 = new HI2("SKIP_INITIAL_REFRESH", 1);
        $VALUES = HI2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HI2() {
        void var2_-1;
        void var1_-1;
    }

    public static HI2 valueOf(String string2) {
        return Enum.valueOf(HI2.class, string2);
    }

    public static HI2[] values() {
        return (HI2[])$VALUES.clone();
    }
}

