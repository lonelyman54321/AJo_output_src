/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFa1kSDK$AFa1ySDK
extends Enum {
    public static final /* enum */ AFa1kSDK$AFa1ySDK AFAdRevenueData;
    public static final /* enum */ AFa1kSDK$AFa1ySDK areAllFieldsValid;
    private static final /* synthetic */ AFa1kSDK$AFa1ySDK[] component4;
    public static final /* enum */ AFa1kSDK$AFa1ySDK getCurrencyIso4217Code;
    public static final /* enum */ AFa1kSDK$AFa1ySDK getMediationNetwork;
    public static final /* enum */ AFa1kSDK$AFa1ySDK getMonetizationNetwork;
    public static final /* enum */ AFa1kSDK$AFa1ySDK getRevenue;

    static {
        AFa1kSDK$AFa1ySDK aFa1kSDK$AFa1ySDK;
        AFa1kSDK$AFa1ySDK aFa1kSDK$AFa1ySDK2;
        AFa1kSDK$AFa1ySDK aFa1kSDK$AFa1ySDK3;
        AFa1kSDK$AFa1ySDK aFa1kSDK$AFa1ySDK4;
        AFa1kSDK$AFa1ySDK aFa1kSDK$AFa1ySDK5;
        AFa1kSDK$AFa1ySDK aFa1kSDK$AFa1ySDK6;
        getMonetizationNetwork = aFa1kSDK$AFa1ySDK6 = new AFa1kSDK$AFa1ySDK("EMPTY_ARRAY", 0);
        int n3 = 1;
        getCurrencyIso4217Code = aFa1kSDK$AFa1ySDK5 = new AFa1kSDK$AFa1ySDK("NONEMPTY_ARRAY", n3);
        int n4 = 2;
        AFAdRevenueData = aFa1kSDK$AFa1ySDK4 = new AFa1kSDK$AFa1ySDK("EMPTY_OBJECT", n4);
        int n7 = 3;
        getMediationNetwork = aFa1kSDK$AFa1ySDK3 = new AFa1kSDK$AFa1ySDK("DANGLING_KEY", n7);
        int n8 = 4;
        getRevenue = aFa1kSDK$AFa1ySDK2 = new AFa1kSDK$AFa1ySDK("NONEMPTY_OBJECT", n8);
        int n10 = 5;
        areAllFieldsValid = aFa1kSDK$AFa1ySDK = new AFa1kSDK$AFa1ySDK("NULL", n10);
        AFa1kSDK$AFa1ySDK[] aFa1kSDK$AFa1ySDKArray = new AFa1kSDK$AFa1ySDK[6];
        aFa1kSDK$AFa1ySDKArray[0] = aFa1kSDK$AFa1ySDK6;
        aFa1kSDK$AFa1ySDKArray[n3] = aFa1kSDK$AFa1ySDK5;
        aFa1kSDK$AFa1ySDKArray[n4] = aFa1kSDK$AFa1ySDK4;
        aFa1kSDK$AFa1ySDKArray[n7] = aFa1kSDK$AFa1ySDK3;
        aFa1kSDK$AFa1ySDKArray[n8] = aFa1kSDK$AFa1ySDK2;
        aFa1kSDK$AFa1ySDKArray[n10] = aFa1kSDK$AFa1ySDK;
        component4 = aFa1kSDK$AFa1ySDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFa1kSDK$AFa1ySDK() {
        void var2_-1;
        void var1_-1;
    }

    public static AFa1kSDK$AFa1ySDK valueOf(String string2) {
        return Enum.valueOf(AFa1kSDK$AFa1ySDK.class, string2);
    }

    public static AFa1kSDK$AFa1ySDK[] values() {
        return (AFa1kSDK$AFa1ySDK[])component4.clone();
    }
}

