/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

public final class AppsFlyerProperties$EmailsCryptType
extends Enum {
    public static final /* enum */ AppsFlyerProperties$EmailsCryptType NONE;
    public static final /* enum */ AppsFlyerProperties$EmailsCryptType SHA256;
    private static final /* synthetic */ AppsFlyerProperties$EmailsCryptType[] getCurrencyIso4217Code;
    private final int getMediationNetwork;

    static {
        AppsFlyerProperties$EmailsCryptType appsFlyerProperties$EmailsCryptType;
        AppsFlyerProperties$EmailsCryptType appsFlyerProperties$EmailsCryptType2;
        NONE = appsFlyerProperties$EmailsCryptType2 = new AppsFlyerProperties$EmailsCryptType("NONE", 0, 0);
        int n3 = 1;
        SHA256 = appsFlyerProperties$EmailsCryptType = new AppsFlyerProperties$EmailsCryptType("SHA256", n3, 3);
        AppsFlyerProperties$EmailsCryptType[] appsFlyerProperties$EmailsCryptTypeArray = new AppsFlyerProperties$EmailsCryptType[2];
        appsFlyerProperties$EmailsCryptTypeArray[0] = appsFlyerProperties$EmailsCryptType2;
        appsFlyerProperties$EmailsCryptTypeArray[n3] = appsFlyerProperties$EmailsCryptType;
        getCurrencyIso4217Code = appsFlyerProperties$EmailsCryptTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AppsFlyerProperties$EmailsCryptType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.getMediationNetwork = var3_2;
    }

    public static AppsFlyerProperties$EmailsCryptType valueOf(String string2) {
        return Enum.valueOf(AppsFlyerProperties$EmailsCryptType.class, string2);
    }

    public static AppsFlyerProperties$EmailsCryptType[] values() {
        return (AppsFlyerProperties$EmailsCryptType[])getCurrencyIso4217Code.clone();
    }

    public final int getValue() {
        return this.getMediationNetwork;
    }
}

