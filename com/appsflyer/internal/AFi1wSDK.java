/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.util.Locale;

public final class AFi1wSDK
extends Enum {
    public static final /* enum */ AFi1wSDK AFAdRevenueData;
    public static final /* enum */ AFi1wSDK getCurrencyIso4217Code;
    private static final /* synthetic */ AFi1wSDK[] getMediationNetwork;
    public static final /* enum */ AFi1wSDK getMonetizationNetwork;
    public static final /* enum */ AFi1wSDK getRevenue;

    static {
        AFi1wSDK aFi1wSDK;
        AFi1wSDK aFi1wSDK2;
        AFi1wSDK aFi1wSDK3;
        AFi1wSDK aFi1wSDK4;
        getMonetizationNetwork = aFi1wSDK4 = new AFi1wSDK("SUCCESS", 0);
        int n3 = 1;
        getRevenue = aFi1wSDK3 = new AFi1wSDK("FAILURE", n3);
        int n4 = 2;
        AFAdRevenueData = aFi1wSDK2 = new AFi1wSDK("NA", n4);
        int n7 = 3;
        getCurrencyIso4217Code = aFi1wSDK = new AFi1wSDK("INTERNAL_ERROR", n7);
        AFi1wSDK[] aFi1wSDKArray = new AFi1wSDK[4];
        aFi1wSDKArray[0] = aFi1wSDK4;
        aFi1wSDKArray[n3] = aFi1wSDK3;
        aFi1wSDKArray[n4] = aFi1wSDK2;
        aFi1wSDKArray[n7] = aFi1wSDK;
        getMediationNetwork = aFi1wSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFi1wSDK() {
        void var2_-1;
        void var1_-1;
    }

    public static AFi1wSDK valueOf(String string2) {
        return Enum.valueOf(AFi1wSDK.class, string2);
    }

    public static AFi1wSDK[] values() {
        return (AFi1wSDK[])getMediationNetwork.clone();
    }

    public final String toString() {
        String string2 = super.toString();
        Locale locale = Locale.getDefault();
        return string2.toLowerCase(locale);
    }
}

