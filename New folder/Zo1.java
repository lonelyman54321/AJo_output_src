/*
 * Decompiled with CFR 0.152.
 */
public final class Zo1
extends Enum {
    private static final /* synthetic */ Zo1[] $VALUES;
    public static final /* enum */ Zo1 ADD;
    public static final /* enum */ Zo1 COLOR;
    public static final /* enum */ Zo1 COLOR_BURN;
    public static final /* enum */ Zo1 COLOR_DODGE;
    public static final /* enum */ Zo1 DARKEN;
    public static final /* enum */ Zo1 DIFFERENCE;
    public static final /* enum */ Zo1 EXCLUSION;
    public static final /* enum */ Zo1 HARD_LIGHT;
    public static final /* enum */ Zo1 HARD_MIX;
    public static final /* enum */ Zo1 HUE;
    public static final /* enum */ Zo1 LIGHTEN;
    public static final /* enum */ Zo1 LUMINOSITY;
    public static final /* enum */ Zo1 MULTIPLY;
    public static final /* enum */ Zo1 NORMAL;
    public static final /* enum */ Zo1 OVERLAY;
    public static final /* enum */ Zo1 SATURATION;
    public static final /* enum */ Zo1 SCREEN;
    public static final /* enum */ Zo1 SOFT_LIGHT;

    private static /* synthetic */ Zo1[] $values() {
        Zo1 zo1 = NORMAL;
        zo1 = MULTIPLY;
        zo1 = SCREEN;
        zo1 = OVERLAY;
        zo1 = DARKEN;
        zo1 = LIGHTEN;
        zo1 = COLOR_DODGE;
        zo1 = COLOR_BURN;
        zo1 = HARD_LIGHT;
        zo1 = SOFT_LIGHT;
        zo1 = DIFFERENCE;
        zo1 = EXCLUSION;
        zo1 = HUE;
        zo1 = SATURATION;
        zo1 = COLOR;
        zo1 = LUMINOSITY;
        zo1 = ADD;
        zo1 = HARD_MIX;
        Zo1[] zo1Array = new Zo1[]{zo1, zo1, zo1, zo1, zo1, zo1, zo1, zo1, zo1, zo1, zo1, zo1, zo1, zo1, zo1, zo1, zo1, zo1};
        return zo1Array;
    }

    static {
        Zo1 zo1;
        NORMAL = zo1 = new Zo1("NORMAL", 0);
        MULTIPLY = zo1 = new Zo1("MULTIPLY", 1);
        SCREEN = zo1 = new Zo1("SCREEN", 2);
        OVERLAY = zo1 = new Zo1("OVERLAY", 3);
        DARKEN = zo1 = new Zo1("DARKEN", 4);
        LIGHTEN = zo1 = new Zo1("LIGHTEN", 5);
        COLOR_DODGE = zo1 = new Zo1("COLOR_DODGE", 6);
        COLOR_BURN = zo1 = new Zo1("COLOR_BURN", 7);
        HARD_LIGHT = zo1 = new Zo1("HARD_LIGHT", 8);
        SOFT_LIGHT = zo1 = new Zo1("SOFT_LIGHT", 9);
        DIFFERENCE = zo1 = new Zo1("DIFFERENCE", 10);
        EXCLUSION = zo1 = new Zo1("EXCLUSION", 11);
        HUE = zo1 = new Zo1("HUE", 12);
        SATURATION = zo1 = new Zo1("SATURATION", 13);
        COLOR = zo1 = new Zo1("COLOR", 14);
        LUMINOSITY = zo1 = new Zo1("LUMINOSITY", 15);
        ADD = zo1 = new Zo1("ADD", 16);
        HARD_MIX = zo1 = new Zo1("HARD_MIX", 17);
        $VALUES = Zo1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Zo1() {
        void var2_-1;
        void var1_-1;
    }

    public static Zo1 valueOf(String string2) {
        return Enum.valueOf(Zo1.class, string2);
    }

    public static Zo1[] values() {
        return (Zo1[])$VALUES.clone();
    }

    public hy_0 toNativeBlendMode() {
        int n3;
        int n4 = this.ordinal();
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 != n3) {
                        n3 = 5;
                        if (n4 != n3) {
                            n3 = 16;
                            if (n4 != n3) {
                                return null;
                            }
                            return hy_0.PLUS;
                        }
                        return hy_0.LIGHTEN;
                    }
                    return hy_0.DARKEN;
                }
                return hy_0.OVERLAY;
            }
            return hy_0.SCREEN;
        }
        return hy_0.MODULATE;
    }
}

