/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.controller;

import com.jio.jioads.adinterfaces.JioAds$Environment;

public abstract class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        JioAds$Environment jioAds$Environment;
        int n7 = JioAds$Environment.values().length;
        int[] nArray = new int[n7];
        try {
            jioAds$Environment = JioAds$Environment.PROD;
            n4 = jioAds$Environment.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAds$Environment = JioAds$Environment.STG;
            n4 = jioAds$Environment.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAds$Environment = JioAds$Environment.SIT;
            n4 = jioAds$Environment.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAds$Environment = JioAds$Environment.DEV;
            n4 = jioAds$Environment.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

