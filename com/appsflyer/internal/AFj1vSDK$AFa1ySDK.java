/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFj1xSDK;

public final class AFj1vSDK$AFa1ySDK {
    public static final /* synthetic */ int[] getMediationNetwork;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        AFj1xSDK aFj1xSDK;
        int n7 = AFj1xSDK.values().length;
        int[] nArray = new int[n7];
        try {
            aFj1xSDK = AFj1xSDK.getRevenue;
            n4 = aFj1xSDK.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aFj1xSDK = AFj1xSDK.getCurrencyIso4217Code;
            n4 = aFj1xSDK.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aFj1xSDK = AFj1xSDK.getMediationNetwork;
            n4 = aFj1xSDK.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        getMediationNetwork = nArray;
    }
}

