/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFj1xSDK
extends Enum {
    public static final /* enum */ AFj1xSDK getCurrencyIso4217Code;
    public static final /* enum */ AFj1xSDK getMediationNetwork;
    private static final /* synthetic */ AFj1xSDK[] getMonetizationNetwork;
    public static final /* enum */ AFj1xSDK getRevenue;

    static {
        AFj1xSDK aFj1xSDK;
        AFj1xSDK aFj1xSDK2;
        AFj1xSDK aFj1xSDK3;
        getRevenue = aFj1xSDK3 = new AFj1xSDK("FACEBOOK", 0);
        int n3 = 1;
        getCurrencyIso4217Code = aFj1xSDK2 = new AFj1xSDK("INSTAGRAM", n3);
        int n4 = 2;
        getMediationNetwork = aFj1xSDK = new AFj1xSDK("FACEBOOK_LITE", n4);
        AFj1xSDK[] aFj1xSDKArray = new AFj1xSDK[3];
        aFj1xSDKArray[0] = aFj1xSDK3;
        aFj1xSDKArray[n3] = aFj1xSDK2;
        aFj1xSDKArray[n4] = aFj1xSDK;
        getMonetizationNetwork = aFj1xSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFj1xSDK() {
        void var2_-1;
        void var1_-1;
    }

    public static AFj1xSDK valueOf(String string2) {
        return Enum.valueOf(AFj1xSDK.class, string2);
    }

    public static AFj1xSDK[] values() {
        return (AFj1xSDK[])getMonetizationNetwork.clone();
    }
}

