/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFe1uSDK
extends Enum {
    private static /* enum */ AFe1uSDK AFAdRevenueData;
    private static final /* synthetic */ AFe1uSDK[] areAllFieldsValid;
    private static /* enum */ AFe1uSDK component1;
    private static /* enum */ AFe1uSDK component2;
    private static /* enum */ AFe1uSDK component3;
    private static /* enum */ AFe1uSDK component4;
    public static final /* enum */ AFe1uSDK getCurrencyIso4217Code;
    private static /* enum */ AFe1uSDK getMonetizationNetwork;
    public static final /* enum */ AFe1uSDK getRevenue;
    public final String getMediationNetwork;

    static {
        AFe1uSDK aFe1uSDK;
        AFe1uSDK aFe1uSDK2;
        AFe1uSDK aFe1uSDK3;
        AFe1uSDK aFe1uSDK4;
        getMonetizationNetwork = aFe1uSDK4 = new AFe1uSDK("TEXT", 0, "text/plain");
        int n3 = 1;
        getRevenue = aFe1uSDK4 = new AFe1uSDK("JSON", n3, "application/json");
        int n4 = 2;
        getCurrencyIso4217Code = aFe1uSDK3 = new AFe1uSDK("OCTET_STREAM", n4, "application/octet-stream");
        int n7 = 3;
        AFAdRevenueData = aFe1uSDK2 = new AFe1uSDK("XML", n7, "application/xml");
        int n8 = 4;
        component4 = aFe1uSDK2 = new AFe1uSDK("HTML", n8, "text/html");
        int n10 = 5;
        component3 = aFe1uSDK2 = new AFe1uSDK("FORM", n10, "application/x-www-form-urlencoded");
        int n14 = 6;
        component1 = aFe1uSDK2 = new AFe1uSDK("IMAGE_JPEG", n14, "image/jpeg");
        int n15 = 7;
        component2 = aFe1uSDK2 = new AFe1uSDK("IMAGE_PNG", n15, "image/png");
        AFe1uSDK[] aFe1uSDKArray = new AFe1uSDK[8];
        aFe1uSDKArray[0] = aFe1uSDK = getMonetizationNetwork;
        aFe1uSDKArray[n3] = aFe1uSDK4;
        aFe1uSDKArray[n4] = aFe1uSDK3;
        aFe1uSDKArray[n7] = aFe1uSDK4 = AFAdRevenueData;
        aFe1uSDKArray[n8] = aFe1uSDK4 = component4;
        aFe1uSDKArray[n10] = aFe1uSDK4 = component3;
        aFe1uSDKArray[n14] = aFe1uSDK4 = component1;
        aFe1uSDKArray[n15] = aFe1uSDK2;
        areAllFieldsValid = aFe1uSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFe1uSDK() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.getMediationNetwork = var3_2;
    }

    public static AFe1uSDK valueOf(String string2) {
        return Enum.valueOf(AFe1uSDK.class, string2);
    }

    public static AFe1uSDK[] values() {
        return (AFe1uSDK[])areAllFieldsValid.clone();
    }
}

