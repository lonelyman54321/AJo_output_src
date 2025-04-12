/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from vj3
 */
public final class vj3_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ vj3_2[] $VALUES;
    public static final /* enum */ vj3_2 AUTO_CAROUSEL;
    public static final /* enum */ vj3_2 BASIC;
    public static final /* enum */ vj3_2 CANCEL;
    public static final vj3$a Companion;
    public static final /* enum */ vj3_2 FIVE_ICONS;
    public static final /* enum */ vj3_2 INPUT_BOX;
    public static final /* enum */ vj3_2 MANUAL_CAROUSEL;
    public static final /* enum */ vj3_2 PRODUCT_DISPLAY;
    public static final /* enum */ vj3_2 RATING;
    public static final /* enum */ vj3_2 TIMER;
    public static final /* enum */ vj3_2 VIDEO;
    public static final /* enum */ vj3_2 ZERO_BEZEL;
    private final String templateType;

    private static final /* synthetic */ vj3_2[] $values() {
        vj3_2 vj3_22 = BASIC;
        vj3_22 = AUTO_CAROUSEL;
        vj3_22 = MANUAL_CAROUSEL;
        vj3_22 = RATING;
        vj3_22 = FIVE_ICONS;
        vj3_22 = PRODUCT_DISPLAY;
        vj3_22 = ZERO_BEZEL;
        vj3_22 = TIMER;
        vj3_22 = INPUT_BOX;
        vj3_22 = VIDEO;
        vj3_22 = CANCEL;
        vj3_2[] vj3_2Array = new vj3_2[]{vj3_22, vj3_22, vj3_22, vj3_22, vj3_22, vj3_22, vj3_22, vj3_22, vj3_22, vj3_22, vj3_22};
        return vj3_2Array;
    }

    static {
        Object object = new vj3_2("BASIC", 0, "pt_basic");
        BASIC = object;
        object = new vj3_2("AUTO_CAROUSEL", 1, "pt_carousel");
        AUTO_CAROUSEL = object;
        object = new vj3_2("MANUAL_CAROUSEL", 2, "pt_manual_carousel");
        MANUAL_CAROUSEL = object;
        object = new vj3_2("RATING", 3, "pt_rating");
        RATING = object;
        object = new vj3_2("FIVE_ICONS", 4, "pt_five_icons");
        FIVE_ICONS = object;
        object = new vj3_2("PRODUCT_DISPLAY", 5, "pt_product_display");
        PRODUCT_DISPLAY = object;
        object = new vj3_2("ZERO_BEZEL", 6, "pt_zero_bezel");
        ZERO_BEZEL = object;
        object = new vj3_2("TIMER", 7, "pt_timer");
        TIMER = object;
        object = new vj3_2("INPUT_BOX", 8, "pt_input");
        INPUT_BOX = object;
        object = new vj3_2("VIDEO", 9, "pt_video");
        VIDEO = object;
        object = new vj3_2("CANCEL", 10, "pt_cancel");
        CANCEL = object;
        object = vj3_2.$values();
        $VALUES = object;
        $ENTRIES = ha0_2.a(object);
        Companion = object = new Object();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private vj3_2() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.templateType = var3_2;
    }

    public static final vj3_2 fromString(String string2) {
        Companion.getClass();
        return vj3$a.a(string2);
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static vj3_2 valueOf(String string2) {
        return Enum.valueOf(vj3_2.class, string2);
    }

    public static vj3_2[] values() {
        return (vj3_2[])$VALUES.clone();
    }

    public String toString() {
        return this.templateType;
    }
}

