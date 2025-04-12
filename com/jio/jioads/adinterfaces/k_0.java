/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAds$MediaType;

/*
 * Renamed from com.jio.jioads.adinterfaces.k
 */
public abstract class k_0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        JioAds$MediaType jioAds$MediaType;
        int n7 = JioAds$MediaType.values().length;
        int[] nArray = new int[n7];
        try {
            jioAds$MediaType = JioAds$MediaType.VIDEO;
            n4 = jioAds$MediaType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAds$MediaType = JioAds$MediaType.AUDIO;
            n4 = jioAds$MediaType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAds$MediaType = JioAds$MediaType.IMAGE;
            n4 = jioAds$MediaType.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAds$MediaType = JioAds$MediaType.ALL;
            n4 = jioAds$MediaType.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

