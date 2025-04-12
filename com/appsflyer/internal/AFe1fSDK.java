/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFe1fSDK
extends Enum {
    private static final /* synthetic */ AFe1fSDK[] AFAdRevenueData;
    public static final /* enum */ AFe1fSDK getCurrencyIso4217Code;
    public static final /* enum */ AFe1fSDK getMediationNetwork;
    public static final /* enum */ AFe1fSDK getRevenue;
    public final String getMonetizationNetwork;

    static {
        AFe1fSDK aFe1fSDK;
        AFe1fSDK aFe1fSDK2;
        AFe1fSDK aFe1fSDK3;
        getRevenue = aFe1fSDK3 = new AFe1fSDK("API", 0, "api");
        int n3 = 1;
        getMediationNetwork = aFe1fSDK2 = new AFe1fSDK("RC", n3, "rc");
        int n4 = 2;
        getCurrencyIso4217Code = aFe1fSDK = new AFe1fSDK("DEFAULT", n4, "");
        AFe1fSDK[] aFe1fSDKArray = new AFe1fSDK[3];
        aFe1fSDKArray[0] = aFe1fSDK3;
        aFe1fSDKArray[n3] = aFe1fSDK2;
        aFe1fSDKArray[n4] = aFe1fSDK;
        AFAdRevenueData = aFe1fSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFe1fSDK() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.getMonetizationNetwork = var3_2;
    }

    public static AFe1fSDK valueOf(String string2) {
        return Enum.valueOf(AFe1fSDK.class, string2);
    }

    public static AFe1fSDK[] values() {
        return (AFe1fSDK[])AFAdRevenueData.clone();
    }
}

