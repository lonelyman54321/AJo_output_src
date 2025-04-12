/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFj1sSDK$AFa1zSDK
extends Enum {
    public static final /* enum */ AFj1sSDK$AFa1zSDK AFAdRevenueData;
    public static final /* enum */ AFj1sSDK$AFa1zSDK getMediationNetwork;
    private static final /* synthetic */ AFj1sSDK$AFa1zSDK[] getMonetizationNetwork;
    public static final /* enum */ AFj1sSDK$AFa1zSDK getRevenue;

    static {
        AFj1sSDK$AFa1zSDK aFj1sSDK$AFa1zSDK;
        AFj1sSDK$AFa1zSDK aFj1sSDK$AFa1zSDK2;
        AFj1sSDK$AFa1zSDK aFj1sSDK$AFa1zSDK3;
        getMediationNetwork = aFj1sSDK$AFa1zSDK3 = new AFj1sSDK$AFa1zSDK("NOT_STARTED", 0);
        int n3 = 1;
        AFAdRevenueData = aFj1sSDK$AFa1zSDK2 = new AFj1sSDK$AFa1zSDK("STARTED", n3);
        int n4 = 2;
        getRevenue = aFj1sSDK$AFa1zSDK = new AFj1sSDK$AFa1zSDK("FINISHED", n4);
        AFj1sSDK$AFa1zSDK[] aFj1sSDK$AFa1zSDKArray = new AFj1sSDK$AFa1zSDK[3];
        aFj1sSDK$AFa1zSDKArray[0] = aFj1sSDK$AFa1zSDK3;
        aFj1sSDK$AFa1zSDKArray[n3] = aFj1sSDK$AFa1zSDK2;
        aFj1sSDK$AFa1zSDKArray[n4] = aFj1sSDK$AFa1zSDK;
        getMonetizationNetwork = aFj1sSDK$AFa1zSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFj1sSDK$AFa1zSDK() {
        void var2_-1;
        void var1_-1;
    }

    public static AFj1sSDK$AFa1zSDK valueOf(String string2) {
        return Enum.valueOf(AFj1sSDK$AFa1zSDK.class, string2);
    }

    public static AFj1sSDK$AFa1zSDK[] values() {
        return (AFj1sSDK$AFa1zSDK[])getMonetizationNetwork.clone();
    }
}

