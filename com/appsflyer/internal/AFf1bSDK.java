/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFf1bSDK
extends Enum {
    private static final /* synthetic */ AFf1bSDK[] AFAdRevenueData;
    public static final /* enum */ AFf1bSDK getCurrencyIso4217Code;
    public static final /* enum */ AFf1bSDK getMediationNetwork;
    public static final /* enum */ AFf1bSDK getRevenue;

    static {
        AFf1bSDK aFf1bSDK;
        AFf1bSDK aFf1bSDK2;
        AFf1bSDK aFf1bSDK3;
        getCurrencyIso4217Code = aFf1bSDK3 = new AFf1bSDK("SUCCESS", 0);
        int n3 = 1;
        getRevenue = aFf1bSDK2 = new AFf1bSDK("USE_CACHED", n3);
        int n4 = 2;
        getMediationNetwork = aFf1bSDK = new AFf1bSDK("FAILURE", n4);
        AFf1bSDK[] aFf1bSDKArray = new AFf1bSDK[3];
        aFf1bSDKArray[0] = aFf1bSDK3;
        aFf1bSDKArray[n3] = aFf1bSDK2;
        aFf1bSDKArray[n4] = aFf1bSDK;
        AFAdRevenueData = aFf1bSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFf1bSDK() {
        void var2_-1;
        void var1_-1;
    }

    public static AFf1bSDK valueOf(String string2) {
        return Enum.valueOf(AFf1bSDK.class, string2);
    }

    public static AFf1bSDK[] values() {
        return (AFf1bSDK[])AFAdRevenueData.clone();
    }
}

