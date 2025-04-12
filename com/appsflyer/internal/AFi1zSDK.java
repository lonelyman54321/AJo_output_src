/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFi1zSDK
extends Enum {
    private static final /* synthetic */ AFi1zSDK[] getCurrencyIso4217Code;
    public static final /* enum */ AFi1zSDK getMonetizationNetwork;
    public static final /* enum */ AFi1zSDK getRevenue;

    static {
        AFi1zSDK aFi1zSDK;
        AFi1zSDK aFi1zSDK2;
        getRevenue = aFi1zSDK2 = new AFi1zSDK("DEFAULT", 0);
        int n3 = 1;
        getMonetizationNetwork = aFi1zSDK = new AFi1zSDK("CUSTOM", n3);
        AFi1zSDK[] aFi1zSDKArray = new AFi1zSDK[2];
        aFi1zSDKArray[0] = aFi1zSDK2;
        aFi1zSDKArray[n3] = aFi1zSDK;
        getCurrencyIso4217Code = aFi1zSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFi1zSDK() {
        void var2_-1;
        void var1_-1;
    }

    public static AFi1zSDK valueOf(String string2) {
        return Enum.valueOf(AFi1zSDK.class, string2);
    }

    public static AFi1zSDK[] values() {
        return (AFi1zSDK[])getCurrencyIso4217Code.clone();
    }
}

