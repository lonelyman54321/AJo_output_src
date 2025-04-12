/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFh1qSDK
extends Enum {
    private static final /* synthetic */ AFh1qSDK[] AFAdRevenueData;
    public static final /* enum */ AFh1qSDK getCurrencyIso4217Code;
    public static final /* enum */ AFh1qSDK getMediationNetwork;
    public static final /* enum */ AFh1qSDK getMonetizationNetwork;
    public static final /* enum */ AFh1qSDK getRevenue;

    static {
        AFh1qSDK aFh1qSDK;
        AFh1qSDK aFh1qSDK2;
        AFh1qSDK aFh1qSDK3;
        AFh1qSDK aFh1qSDK4;
        getMonetizationNetwork = aFh1qSDK4 = new AFh1qSDK("onReceive", 0);
        int n3 = 1;
        getCurrencyIso4217Code = aFh1qSDK3 = new AFh1qSDK("logSession", n3);
        int n4 = 2;
        getMediationNetwork = aFh1qSDK2 = new AFh1qSDK("logEvent", n4);
        int n7 = 3;
        getRevenue = aFh1qSDK = new AFh1qSDK("setCustomerIdAndLogSession", n7);
        AFh1qSDK[] aFh1qSDKArray = new AFh1qSDK[4];
        aFh1qSDKArray[0] = aFh1qSDK4;
        aFh1qSDKArray[n3] = aFh1qSDK3;
        aFh1qSDKArray[n4] = aFh1qSDK2;
        aFh1qSDKArray[n7] = aFh1qSDK;
        AFAdRevenueData = aFh1qSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFh1qSDK() {
        void var2_-1;
        void var1_-1;
    }

    public static AFh1qSDK valueOf(String string2) {
        return Enum.valueOf(AFh1qSDK.class, string2);
    }

    public static AFh1qSDK[] values() {
        return (AFh1qSDK[])AFAdRevenueData.clone();
    }
}

