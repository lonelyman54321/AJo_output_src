/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType
 */
package com.jioads.mediation.partners.videoutils;

import com.google.ads.interactivemedia.v3.api.AdEvent;

public final class JioMediationVideoController$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        AdEvent.AdEventType adEventType;
        int n7 = AdEvent.AdEventType.values().length;
        int[] nArray = new int[n7];
        try {
            adEventType = AdEvent.AdEventType.LOADED;
            n4 = adEventType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            adEventType = AdEvent.AdEventType.CLICKED;
            n4 = adEventType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            adEventType = AdEvent.AdEventType.SKIPPABLE_STATE_CHANGED;
            n4 = adEventType.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            adEventType = AdEvent.AdEventType.SKIPPED;
            n4 = adEventType.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            adEventType = AdEvent.AdEventType.STARTED;
            n4 = adEventType.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

