/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews.widgets;

public final class AjioCustomToolbar$DisplayMode
extends Enum {
    private static final /* synthetic */ AjioCustomToolbar$DisplayMode[] $VALUES;
    public static final /* enum */ AjioCustomToolbar$DisplayMode BLANK;
    public static final /* enum */ AjioCustomToolbar$DisplayMode BRAND_LOGO;
    public static final /* enum */ AjioCustomToolbar$DisplayMode LOGO;
    public static final /* enum */ AjioCustomToolbar$DisplayMode PRODUCTINFO;
    public static final /* enum */ AjioCustomToolbar$DisplayMode SIS;
    public static final /* enum */ AjioCustomToolbar$DisplayMode TITLE;

    private static /* synthetic */ AjioCustomToolbar$DisplayMode[] $values() {
        AjioCustomToolbar$DisplayMode ajioCustomToolbar$DisplayMode = LOGO;
        ajioCustomToolbar$DisplayMode = TITLE;
        ajioCustomToolbar$DisplayMode = PRODUCTINFO;
        ajioCustomToolbar$DisplayMode = BLANK;
        ajioCustomToolbar$DisplayMode = SIS;
        ajioCustomToolbar$DisplayMode = BRAND_LOGO;
        AjioCustomToolbar$DisplayMode[] ajioCustomToolbar$DisplayModeArray = new AjioCustomToolbar$DisplayMode[]{ajioCustomToolbar$DisplayMode, ajioCustomToolbar$DisplayMode, ajioCustomToolbar$DisplayMode, ajioCustomToolbar$DisplayMode, ajioCustomToolbar$DisplayMode, ajioCustomToolbar$DisplayMode};
        return ajioCustomToolbar$DisplayModeArray;
    }

    static {
        AjioCustomToolbar$DisplayMode ajioCustomToolbar$DisplayMode;
        LOGO = ajioCustomToolbar$DisplayMode = new AjioCustomToolbar$DisplayMode("LOGO", 0);
        TITLE = ajioCustomToolbar$DisplayMode = new AjioCustomToolbar$DisplayMode("TITLE", 1);
        PRODUCTINFO = ajioCustomToolbar$DisplayMode = new AjioCustomToolbar$DisplayMode("PRODUCTINFO", 2);
        BLANK = ajioCustomToolbar$DisplayMode = new AjioCustomToolbar$DisplayMode("BLANK", 3);
        SIS = ajioCustomToolbar$DisplayMode = new AjioCustomToolbar$DisplayMode("SIS", 4);
        BRAND_LOGO = ajioCustomToolbar$DisplayMode = new AjioCustomToolbar$DisplayMode("BRAND_LOGO", 5);
        $VALUES = AjioCustomToolbar$DisplayMode.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AjioCustomToolbar$DisplayMode() {
        void var2_-1;
        void var1_-1;
    }

    public static AjioCustomToolbar$DisplayMode valueOf(String string2) {
        return Enum.valueOf(AjioCustomToolbar$DisplayMode.class, string2);
    }

    public static AjioCustomToolbar$DisplayMode[] values() {
        return (AjioCustomToolbar$DisplayMode[])$VALUES.clone();
    }
}

