/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;

final class AFf1fSDK$2 {
    static final /* synthetic */ int[] getCurrencyIso4217Code;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        AFj1sSDK$AFa1zSDK aFj1sSDK$AFa1zSDK;
        int n7 = AFj1sSDK$AFa1zSDK.values().length;
        int[] nArray = new int[n7];
        getCurrencyIso4217Code = nArray;
        try {
            aFj1sSDK$AFa1zSDK = AFj1sSDK$AFa1zSDK.getRevenue;
            n4 = aFj1sSDK$AFa1zSDK.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = getCurrencyIso4217Code;
            aFj1sSDK$AFa1zSDK = AFj1sSDK$AFa1zSDK.AFAdRevenueData;
            n4 = aFj1sSDK$AFa1zSDK.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

