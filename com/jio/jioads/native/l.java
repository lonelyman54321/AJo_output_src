/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native;

import com.jio.jioads.utils.Constants$AdTouchEvents;

public abstract class l {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Constants$AdTouchEvents constants$AdTouchEvents;
        int n7 = Constants$AdTouchEvents.values().length;
        int[] nArray = new int[n7];
        try {
            constants$AdTouchEvents = Constants$AdTouchEvents.SWIPE_UP;
            n4 = constants$AdTouchEvents.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            constants$AdTouchEvents = Constants$AdTouchEvents.SWIPE_DOWN;
            n4 = constants$AdTouchEvents.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            constants$AdTouchEvents = Constants$AdTouchEvents.SWIPE_LEFT;
            n4 = constants$AdTouchEvents.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            constants$AdTouchEvents = Constants$AdTouchEvents.SWIPE_RIGHT;
            n4 = constants$AdTouchEvents.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

