/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdEvent$AdEventType;

/*
 * Renamed from com.jio.jioads.adinterfaces.u
 */
public abstract class u_0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        JioAdEvent$AdEventType jioAdEvent$AdEventType;
        int n7 = JioAdEvent$AdEventType.values().length;
        int[] nArray = new int[n7];
        try {
            jioAdEvent$AdEventType = JioAdEvent$AdEventType.AD_BREAK_READY;
            n4 = jioAdEvent$AdEventType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAdEvent$AdEventType = JioAdEvent$AdEventType.ALL_ADS_COMPLETED;
            n4 = jioAdEvent$AdEventType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            jioAdEvent$AdEventType = JioAdEvent$AdEventType.CONTENT_RESUME_REQUESTED;
            n4 = jioAdEvent$AdEventType.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

