/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFe1cSDK
extends Enum {
    private static final /* synthetic */ AFe1cSDK[] AFAdRevenueData;
    public static final /* enum */ AFe1cSDK getMediationNetwork;
    public static final /* enum */ AFe1cSDK getMonetizationNetwork;
    public static final /* enum */ AFe1cSDK getRevenue;

    static {
        AFe1cSDK aFe1cSDK;
        AFe1cSDK aFe1cSDK2;
        AFe1cSDK aFe1cSDK3;
        getRevenue = aFe1cSDK3 = new AFe1cSDK("SUCCESS", 0);
        int n3 = 1;
        getMonetizationNetwork = aFe1cSDK2 = new AFe1cSDK("FAILURE", n3);
        int n4 = 2;
        getMediationNetwork = aFe1cSDK = new AFe1cSDK("TIMEOUT", n4);
        AFe1cSDK[] aFe1cSDKArray = new AFe1cSDK[3];
        aFe1cSDKArray[0] = aFe1cSDK3;
        aFe1cSDKArray[n3] = aFe1cSDK2;
        aFe1cSDKArray[n4] = aFe1cSDK;
        AFAdRevenueData = aFe1cSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFe1cSDK() {
        void var2_-1;
        void var1_-1;
    }

    public static AFe1cSDK valueOf(String string2) {
        return Enum.valueOf(AFe1cSDK.class, string2);
    }

    public static AFe1cSDK[] values() {
        return (AFe1cSDK[])AFAdRevenueData.clone();
    }
}

