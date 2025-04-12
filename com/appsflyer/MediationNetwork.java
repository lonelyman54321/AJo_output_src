/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

public final class MediationNetwork
extends Enum {
    public static final /* enum */ MediationNetwork ADMOST;
    public static final /* enum */ MediationNetwork APPLOVIN_MAX;
    public static final /* enum */ MediationNetwork APPODEAL;
    public static final /* enum */ MediationNetwork CHARTBOOST;
    public static final /* enum */ MediationNetwork CUSTOM_MEDIATION;
    public static final /* enum */ MediationNetwork DIRECT_MONETIZATION_NETWORK;
    public static final /* enum */ MediationNetwork FYBER;
    public static final /* enum */ MediationNetwork GOOGLE_ADMOB;
    public static final /* enum */ MediationNetwork IRONSOURCE;
    public static final /* enum */ MediationNetwork TOPON;
    public static final /* enum */ MediationNetwork TOPON_PTE;
    public static final /* enum */ MediationNetwork TRADPLUS;
    public static final /* enum */ MediationNetwork UNITY;
    public static final /* enum */ MediationNetwork YANDEX;
    private static final /* synthetic */ MediationNetwork[] getRevenue;
    private final String value;

    static {
        MediationNetwork mediationNetwork;
        MediationNetwork mediationNetwork2;
        MediationNetwork mediationNetwork3;
        MediationNetwork mediationNetwork4;
        MediationNetwork mediationNetwork5;
        MediationNetwork mediationNetwork6;
        MediationNetwork mediationNetwork7;
        MediationNetwork mediationNetwork8;
        MediationNetwork mediationNetwork9;
        MediationNetwork mediationNetwork10;
        MediationNetwork mediationNetwork11;
        MediationNetwork mediationNetwork12;
        MediationNetwork mediationNetwork13;
        IRONSOURCE = mediationNetwork13 = new MediationNetwork("IRONSOURCE", 0, "ironsource");
        APPLOVIN_MAX = mediationNetwork12 = new MediationNetwork("APPLOVIN_MAX", 1, "applovinmax");
        GOOGLE_ADMOB = mediationNetwork11 = new MediationNetwork("GOOGLE_ADMOB", 2, "googleadmob");
        FYBER = mediationNetwork10 = new MediationNetwork("FYBER", 3, "fyber");
        APPODEAL = mediationNetwork9 = new MediationNetwork("APPODEAL", 4, "appodeal");
        ADMOST = mediationNetwork8 = new MediationNetwork("ADMOST", 5, "Admost");
        TOPON = mediationNetwork7 = new MediationNetwork("TOPON", 6, "Topon");
        TRADPLUS = mediationNetwork6 = new MediationNetwork("TRADPLUS", 7, "Tradplus");
        YANDEX = mediationNetwork5 = new MediationNetwork("YANDEX", 8, "Yandex");
        CHARTBOOST = mediationNetwork4 = new MediationNetwork("CHARTBOOST", 9, "chartboost");
        UNITY = mediationNetwork3 = new MediationNetwork("UNITY", 10, "Unity");
        TOPON_PTE = mediationNetwork2 = new MediationNetwork("TOPON_PTE", 11, "toponpte");
        MediationNetwork[] mediationNetworkArray = new MediationNetwork("CUSTOM_MEDIATION", 12, "customMediation");
        CUSTOM_MEDIATION = mediationNetworkArray;
        int n3 = 13;
        MediationNetwork[] mediationNetworkArray2 = mediationNetworkArray;
        DIRECT_MONETIZATION_NETWORK = mediationNetwork = new MediationNetwork("DIRECT_MONETIZATION_NETWORK", n3, "directMonetizationNetwork");
        mediationNetworkArray = new MediationNetwork[14];
        mediationNetworkArray[0] = mediationNetwork13;
        mediationNetworkArray[1] = mediationNetwork12;
        mediationNetworkArray[2] = mediationNetwork11;
        mediationNetworkArray[3] = mediationNetwork10;
        mediationNetworkArray[4] = mediationNetwork9;
        mediationNetworkArray[5] = mediationNetwork8;
        mediationNetworkArray[6] = mediationNetwork7;
        mediationNetworkArray[7] = mediationNetwork6;
        mediationNetworkArray[8] = mediationNetwork5;
        mediationNetworkArray[9] = mediationNetwork4;
        mediationNetworkArray[10] = mediationNetwork3;
        mediationNetworkArray[11] = mediationNetwork2;
        mediationNetworkArray[12] = mediationNetworkArray2;
        mediationNetworkArray[n3] = mediationNetwork;
        getRevenue = mediationNetworkArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MediationNetwork() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static MediationNetwork valueOf(String string2) {
        return Enum.valueOf(MediationNetwork.class, string2);
    }

    public static MediationNetwork[] values() {
        return (MediationNetwork[])getRevenue.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

