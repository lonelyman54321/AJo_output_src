/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFh1sSDK
extends Enum {
    public static final /* enum */ AFh1sSDK AFAdRevenueData;
    private static final /* synthetic */ AFh1sSDK[] getMediationNetwork;
    public static final /* enum */ AFh1sSDK getMonetizationNetwork;
    public static final /* enum */ AFh1sSDK getRevenue;

    static {
        AFh1sSDK aFh1sSDK;
        AFh1sSDK aFh1sSDK2;
        AFh1sSDK aFh1sSDK3;
        getMonetizationNetwork = aFh1sSDK3 = new AFh1sSDK("application", 0);
        int n3 = 1;
        AFAdRevenueData = aFh1sSDK2 = new AFh1sSDK("activity", n3);
        int n4 = 2;
        getRevenue = aFh1sSDK = new AFh1sSDK("other", n4);
        AFh1sSDK[] aFh1sSDKArray = new AFh1sSDK[3];
        aFh1sSDKArray[0] = aFh1sSDK3;
        aFh1sSDKArray[n3] = aFh1sSDK2;
        aFh1sSDKArray[n4] = aFh1sSDK;
        getMediationNetwork = aFh1sSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFh1sSDK() {
        void var2_-1;
        void var1_-1;
    }

    public static AFh1sSDK valueOf(String string2) {
        return Enum.valueOf(AFh1sSDK.class, string2);
    }

    public static AFh1sSDK[] values() {
        return (AFh1sSDK[])getMediationNetwork.clone();
    }
}

