/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdView$AdState;

public abstract class b0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        JioAdView$AdState jioAdView$AdState;
        int n7 = JioAdView$AdState.values().length;
        int[] nArray = new int[n7];
        try {
            jioAdView$AdState = JioAdView$AdState.PREPARED;
            n4 = jioAdView$AdState.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAdView$AdState = JioAdView$AdState.REQUESTED;
            n4 = jioAdView$AdState.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

