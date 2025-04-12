/*
 * Decompiled with CFR 0.152.
 */
package com.jioads.mediation;

import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;

public abstract class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        int n7 = JioAdView$AD_TYPE.values().length;
        int[] nArray = new int[n7];
        try {
            jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO;
            n4 = jioAdView$AD_TYPE.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL;
            n4 = jioAdView$AD_TYPE.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

