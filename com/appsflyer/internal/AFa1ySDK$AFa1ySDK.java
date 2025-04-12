/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

final class AFa1ySDK$AFa1ySDK
extends Enum {
    private static final /* synthetic */ AFa1ySDK$AFa1ySDK[] AFAdRevenueData;
    public static final /* enum */ AFa1ySDK$AFa1ySDK getCurrencyIso4217Code;
    public static final /* enum */ AFa1ySDK$AFa1ySDK getRevenue;
    String getMonetizationNetwork;

    static {
        AFa1ySDK$AFa1ySDK aFa1ySDK$AFa1ySDK;
        AFa1ySDK$AFa1ySDK aFa1ySDK$AFa1ySDK2;
        getRevenue = aFa1ySDK$AFa1ySDK2 = new AFa1ySDK$AFa1ySDK("HOOKING", 0, "hk");
        int n3 = 1;
        getCurrencyIso4217Code = aFa1ySDK$AFa1ySDK = new AFa1ySDK$AFa1ySDK("DEBUGGABLE", n3, "dbg");
        AFa1ySDK$AFa1ySDK[] aFa1ySDK$AFa1ySDKArray = new AFa1ySDK$AFa1ySDK[2];
        aFa1ySDK$AFa1ySDKArray[0] = aFa1ySDK$AFa1ySDK2;
        aFa1ySDK$AFa1ySDKArray[n3] = aFa1ySDK$AFa1ySDK;
        AFAdRevenueData = aFa1ySDK$AFa1ySDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFa1ySDK$AFa1ySDK() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.getMonetizationNetwork = var3_2;
    }

    public static AFa1ySDK$AFa1ySDK valueOf(String string2) {
        return Enum.valueOf(AFa1ySDK$AFa1ySDK.class, string2);
    }

    public static AFa1ySDK$AFa1ySDK[] values() {
        return (AFa1ySDK$AFa1ySDK[])AFAdRevenueData.clone();
    }
}

