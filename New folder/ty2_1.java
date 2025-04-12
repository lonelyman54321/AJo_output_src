/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ty2
 */
public final class ty2_1
extends Enum {
    private static final /* synthetic */ ty2_1[] $VALUES;
    public static final /* enum */ ty2_1 DISPLAY_P3;
    public static final /* enum */ ty2_1 SRGB;

    private static /* synthetic */ ty2_1[] $values() {
        ty2_1 ty2_12 = SRGB;
        ty2_12 = DISPLAY_P3;
        ty2_1[] ty2_1Array = new ty2_1[]{ty2_12, ty2_12};
        return ty2_1Array;
    }

    static {
        ty2_1 ty2_12;
        SRGB = ty2_12 = new ty2_1("SRGB", 0);
        DISPLAY_P3 = ty2_12 = new ty2_1("DISPLAY_P3", 1);
        $VALUES = ty2_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ty2_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ty2_1 valueOf(String string2) {
        return Enum.valueOf(ty2_1.class, string2);
    }

    public static ty2_1[] values() {
        return (ty2_1[])$VALUES.clone();
    }
}

