/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdView$MediaPlayBack;

public abstract class C {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        JioAdView$MediaPlayBack jioAdView$MediaPlayBack;
        int n7 = JioAdView$MediaPlayBack.values().length;
        int[] nArray = new int[n7];
        try {
            jioAdView$MediaPlayBack = JioAdView$MediaPlayBack.PAUSE;
            n4 = jioAdView$MediaPlayBack.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAdView$MediaPlayBack = JioAdView$MediaPlayBack.RESUME;
            n4 = jioAdView$MediaPlayBack.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

