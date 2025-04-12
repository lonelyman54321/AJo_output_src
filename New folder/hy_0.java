/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Hy
 */
public final class hy_0
extends Enum {
    private static final /* synthetic */ hy_0[] $VALUES;
    public static final /* enum */ hy_0 CLEAR;
    public static final /* enum */ hy_0 COLOR;
    public static final /* enum */ hy_0 COLOR_BURN;
    public static final /* enum */ hy_0 COLOR_DODGE;
    public static final /* enum */ hy_0 DARKEN;
    public static final /* enum */ hy_0 DIFFERENCE;
    public static final /* enum */ hy_0 DST;
    public static final /* enum */ hy_0 DST_ATOP;
    public static final /* enum */ hy_0 DST_IN;
    public static final /* enum */ hy_0 DST_OUT;
    public static final /* enum */ hy_0 DST_OVER;
    public static final /* enum */ hy_0 EXCLUSION;
    public static final /* enum */ hy_0 HARD_LIGHT;
    public static final /* enum */ hy_0 HUE;
    public static final /* enum */ hy_0 LIGHTEN;
    public static final /* enum */ hy_0 LUMINOSITY;
    public static final /* enum */ hy_0 MODULATE;
    public static final /* enum */ hy_0 MULTIPLY;
    public static final /* enum */ hy_0 OVERLAY;
    public static final /* enum */ hy_0 PLUS;
    public static final /* enum */ hy_0 SATURATION;
    public static final /* enum */ hy_0 SCREEN;
    public static final /* enum */ hy_0 SOFT_LIGHT;
    public static final /* enum */ hy_0 SRC;
    public static final /* enum */ hy_0 SRC_ATOP;
    public static final /* enum */ hy_0 SRC_IN;
    public static final /* enum */ hy_0 SRC_OUT;
    public static final /* enum */ hy_0 SRC_OVER;
    public static final /* enum */ hy_0 XOR;

    private static /* synthetic */ hy_0[] $values() {
        hy_0 hy_02 = CLEAR;
        hy_02 = SRC;
        hy_02 = DST;
        hy_02 = SRC_OVER;
        hy_02 = DST_OVER;
        hy_02 = SRC_IN;
        hy_02 = DST_IN;
        hy_02 = SRC_OUT;
        hy_02 = DST_OUT;
        hy_02 = SRC_ATOP;
        hy_02 = DST_ATOP;
        hy_02 = XOR;
        hy_02 = PLUS;
        hy_02 = MODULATE;
        hy_02 = SCREEN;
        hy_02 = OVERLAY;
        hy_02 = DARKEN;
        hy_02 = LIGHTEN;
        hy_02 = COLOR_DODGE;
        hy_02 = COLOR_BURN;
        hy_02 = HARD_LIGHT;
        hy_02 = SOFT_LIGHT;
        hy_02 = DIFFERENCE;
        hy_02 = EXCLUSION;
        hy_02 = MULTIPLY;
        hy_02 = HUE;
        hy_02 = SATURATION;
        hy_02 = COLOR;
        hy_02 = LUMINOSITY;
        hy_0[] hy_0Array = new hy_0[]{hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02, hy_02};
        return hy_0Array;
    }

    static {
        hy_0 hy_02;
        CLEAR = hy_02 = new hy_0("CLEAR", 0);
        SRC = hy_02 = new hy_0("SRC", 1);
        DST = hy_02 = new hy_0("DST", 2);
        SRC_OVER = hy_02 = new hy_0("SRC_OVER", 3);
        DST_OVER = hy_02 = new hy_0("DST_OVER", 4);
        SRC_IN = hy_02 = new hy_0("SRC_IN", 5);
        DST_IN = hy_02 = new hy_0("DST_IN", 6);
        SRC_OUT = hy_02 = new hy_0("SRC_OUT", 7);
        DST_OUT = hy_02 = new hy_0("DST_OUT", 8);
        SRC_ATOP = hy_02 = new hy_0("SRC_ATOP", 9);
        DST_ATOP = hy_02 = new hy_0("DST_ATOP", 10);
        XOR = hy_02 = new hy_0("XOR", 11);
        PLUS = hy_02 = new hy_0("PLUS", 12);
        MODULATE = hy_02 = new hy_0("MODULATE", 13);
        SCREEN = hy_02 = new hy_0("SCREEN", 14);
        OVERLAY = hy_02 = new hy_0("OVERLAY", 15);
        DARKEN = hy_02 = new hy_0("DARKEN", 16);
        LIGHTEN = hy_02 = new hy_0("LIGHTEN", 17);
        COLOR_DODGE = hy_02 = new hy_0("COLOR_DODGE", 18);
        COLOR_BURN = hy_02 = new hy_0("COLOR_BURN", 19);
        HARD_LIGHT = hy_02 = new hy_0("HARD_LIGHT", 20);
        SOFT_LIGHT = hy_02 = new hy_0("SOFT_LIGHT", 21);
        DIFFERENCE = hy_02 = new hy_0("DIFFERENCE", 22);
        EXCLUSION = hy_02 = new hy_0("EXCLUSION", 23);
        MULTIPLY = hy_02 = new hy_0("MULTIPLY", 24);
        HUE = hy_02 = new hy_0("HUE", 25);
        SATURATION = hy_02 = new hy_0("SATURATION", 26);
        COLOR = hy_02 = new hy_0("COLOR", 27);
        LUMINOSITY = hy_02 = new hy_0("LUMINOSITY", 28);
        $VALUES = hy_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hy_0() {
        void var2_-1;
        void var1_-1;
    }

    public static hy_0 valueOf(String string2) {
        return Enum.valueOf(hy_0.class, string2);
    }

    public static hy_0[] values() {
        return (hy_0[])$VALUES.clone();
    }
}

