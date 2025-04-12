/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.view;

import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;

public final class BaseActivity$c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        AjioCustomToolbar$DisplayMode ajioCustomToolbar$DisplayMode;
        int n7 = AjioCustomToolbar$DisplayMode.values().length;
        int[] nArray = new int[n7];
        try {
            ajioCustomToolbar$DisplayMode = AjioCustomToolbar$DisplayMode.TITLE;
            n4 = ajioCustomToolbar$DisplayMode.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ajioCustomToolbar$DisplayMode = AjioCustomToolbar$DisplayMode.LOGO;
            n4 = ajioCustomToolbar$DisplayMode.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ajioCustomToolbar$DisplayMode = AjioCustomToolbar$DisplayMode.SIS;
            n4 = ajioCustomToolbar$DisplayMode.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ajioCustomToolbar$DisplayMode = AjioCustomToolbar$DisplayMode.BRAND_LOGO;
            n4 = ajioCustomToolbar$DisplayMode.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ajioCustomToolbar$DisplayMode = AjioCustomToolbar$DisplayMode.PRODUCTINFO;
            n4 = ajioCustomToolbar$DisplayMode.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ajioCustomToolbar$DisplayMode = AjioCustomToolbar$DisplayMode.BLANK;
            n4 = ajioCustomToolbar$DisplayMode.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

