/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFg1hSDK
extends Enum {
    private static final /* synthetic */ AFg1hSDK[] component3;
    public static final /* enum */ AFg1hSDK getCurrencyIso4217Code;
    public static final /* enum */ AFg1hSDK getMediationNetwork;
    private final boolean AFAdRevenueData;
    private final boolean getMonetizationNetwork;
    private final String getRevenue;

    static {
        AFg1hSDK aFg1hSDK;
        AFg1hSDK aFg1hSDK2;
        getMediationNetwork = aFg1hSDK2 = new AFg1hSDK("IS_SAMSUNG_PRELOAD_REFERRER_COLLECTION_ENABLED", 0, "isSamsungPreloadReferrerEnabled", false);
        int n3 = 1;
        getCurrencyIso4217Code = aFg1hSDK = new AFg1hSDK("IS_PLAY_INTEGRITY_DATA_COLLECTION_ENABLED", n3, "isPlayIntegrityDataCollectionEnabled", n3 != 0);
        AFg1hSDK[] aFg1hSDKArray = new AFg1hSDK[2];
        aFg1hSDKArray[0] = aFg1hSDK2;
        aFg1hSDKArray[n3] = aFg1hSDK;
        component3 = aFg1hSDKArray;
    }

    /*
     * WARNING - void declaration
     */
    private AFg1hSDK() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.getRevenue = var3_2;
        this.AFAdRevenueData = var4_1;
        this.getMonetizationNetwork = false;
    }

    public static AFg1hSDK valueOf(String string2) {
        return Enum.valueOf(AFg1hSDK.class, string2);
    }

    public static AFg1hSDK[] values() {
        return (AFg1hSDK[])component3.clone();
    }

    public final boolean AFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    public final boolean getRevenue() {
        return this.getMonetizationNetwork;
    }
}

