/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

public final class AppsFlyerAdNetworkEventType
extends Enum {
    public static final /* enum */ AppsFlyerAdNetworkEventType APP_OPEN;
    public static final /* enum */ AppsFlyerAdNetworkEventType BANNER;
    public static final /* enum */ AppsFlyerAdNetworkEventType INTERSTITIAL;
    public static final /* enum */ AppsFlyerAdNetworkEventType NATIVE;
    public static final /* enum */ AppsFlyerAdNetworkEventType REWARDED;
    private static final /* synthetic */ AppsFlyerAdNetworkEventType[] getMediationNetwork;

    static {
        AppsFlyerAdNetworkEventType appsFlyerAdNetworkEventType;
        AppsFlyerAdNetworkEventType appsFlyerAdNetworkEventType2;
        AppsFlyerAdNetworkEventType appsFlyerAdNetworkEventType3;
        AppsFlyerAdNetworkEventType appsFlyerAdNetworkEventType4;
        AppsFlyerAdNetworkEventType appsFlyerAdNetworkEventType5;
        BANNER = appsFlyerAdNetworkEventType5 = new AppsFlyerAdNetworkEventType("BANNER", 0);
        int n3 = 1;
        INTERSTITIAL = appsFlyerAdNetworkEventType4 = new AppsFlyerAdNetworkEventType("INTERSTITIAL", n3);
        int n4 = 2;
        NATIVE = appsFlyerAdNetworkEventType3 = new AppsFlyerAdNetworkEventType("NATIVE", n4);
        int n7 = 3;
        REWARDED = appsFlyerAdNetworkEventType2 = new AppsFlyerAdNetworkEventType("REWARDED", n7);
        int n8 = 4;
        APP_OPEN = appsFlyerAdNetworkEventType = new AppsFlyerAdNetworkEventType("APP_OPEN", n8);
        AppsFlyerAdNetworkEventType[] appsFlyerAdNetworkEventTypeArray = new AppsFlyerAdNetworkEventType[5];
        appsFlyerAdNetworkEventTypeArray[0] = appsFlyerAdNetworkEventType5;
        appsFlyerAdNetworkEventTypeArray[n3] = appsFlyerAdNetworkEventType4;
        appsFlyerAdNetworkEventTypeArray[n4] = appsFlyerAdNetworkEventType3;
        appsFlyerAdNetworkEventTypeArray[n7] = appsFlyerAdNetworkEventType2;
        appsFlyerAdNetworkEventTypeArray[n8] = appsFlyerAdNetworkEventType;
        getMediationNetwork = appsFlyerAdNetworkEventTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AppsFlyerAdNetworkEventType() {
        void var2_-1;
        void var1_-1;
    }

    public static AppsFlyerAdNetworkEventType valueOf(String string2) {
        return Enum.valueOf(AppsFlyerAdNetworkEventType.class, string2);
    }

    public static AppsFlyerAdNetworkEventType[] values() {
        return (AppsFlyerAdNetworkEventType[])getMediationNetwork.clone();
    }
}

