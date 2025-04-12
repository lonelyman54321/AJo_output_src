/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.controller;

import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;

public abstract class d {
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
            jioAdView$AD_TYPE = JioAdView$AD_TYPE.INFEED;
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
        try {
            jioAdView$AD_TYPE = JioAdView$AD_TYPE.CUSTOM_NATIVE;
            n4 = jioAdView$AD_TYPE.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO;
            n4 = jioAdView$AD_TYPE.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAdView$AD_TYPE = JioAdView$AD_TYPE.CONTENT_STREAM;
            n4 = jioAdView$AD_TYPE.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
            n4 = jioAdView$AD_TYPE.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_AUDIO;
            n4 = jioAdView$AD_TYPE.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

