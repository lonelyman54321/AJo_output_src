/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.adinterfaces.JioAdView$ORIENTATION_TYPE;

public abstract class I {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE;
        int n7 = JioAdView$ORIENTATION_TYPE.values().length;
        int[] nArray = new int[n7];
        try {
            jioAdView$ORIENTATION_TYPE = JioAdView$ORIENTATION_TYPE.PORTRAIT;
            n4 = jioAdView$ORIENTATION_TYPE.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAdView$ORIENTATION_TYPE = JioAdView$ORIENTATION_TYPE.LANDSCAPE;
            n4 = jioAdView$ORIENTATION_TYPE.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

