/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

final class AFa1ySDK$AFa1uSDK
extends Enum {
    public static final /* enum */ AFa1ySDK$AFa1uSDK getCurrencyIso4217Code;
    private static final /* synthetic */ AFa1ySDK$AFa1uSDK[] getMediationNetwork;
    public static final /* enum */ AFa1ySDK$AFa1uSDK getRevenue;
    String AFAdRevenueData;

    static {
        AFa1ySDK$AFa1uSDK aFa1ySDK$AFa1uSDK;
        AFa1ySDK$AFa1uSDK aFa1ySDK$AFa1uSDK2;
        getCurrencyIso4217Code = aFa1ySDK$AFa1uSDK2 = new AFa1ySDK$AFa1uSDK("XPOSED", 0, "xps");
        int n3 = 1;
        getRevenue = aFa1ySDK$AFa1uSDK = new AFa1ySDK$AFa1uSDK("FRIDA", n3, "frd");
        AFa1ySDK$AFa1uSDK[] aFa1ySDK$AFa1uSDKArray = new AFa1ySDK$AFa1uSDK[2];
        aFa1ySDK$AFa1uSDKArray[0] = aFa1ySDK$AFa1uSDK2;
        aFa1ySDK$AFa1uSDKArray[n3] = aFa1ySDK$AFa1uSDK;
        getMediationNetwork = aFa1ySDK$AFa1uSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFa1ySDK$AFa1uSDK() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.AFAdRevenueData = var3_2;
    }

    public static AFa1ySDK$AFa1uSDK valueOf(String string2) {
        return Enum.valueOf(AFa1ySDK$AFa1uSDK.class, string2);
    }

    public static AFa1ySDK$AFa1uSDK[] values() {
        return (AFa1ySDK$AFa1uSDK[])getMediationNetwork.clone();
    }
}

