/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFf1zSDK
extends Enum {
    public static final /* enum */ AFf1zSDK AFAdRevenueData;
    public static final /* enum */ AFf1zSDK AFInAppEventParameterName;
    public static final /* enum */ AFf1zSDK AFInAppEventType;
    public static final /* enum */ AFf1zSDK AFKeystoreWrapper;
    public static final /* enum */ AFf1zSDK areAllFieldsValid;
    public static final /* enum */ AFf1zSDK component1;
    public static final /* enum */ AFf1zSDK component2;
    public static final /* enum */ AFf1zSDK component3;
    public static final /* enum */ AFf1zSDK component4;
    public static final /* enum */ AFf1zSDK copy;
    public static final /* enum */ AFf1zSDK copydefault;
    private static final /* synthetic */ AFf1zSDK[] d;
    public static final /* enum */ AFf1zSDK equals;
    public static final /* enum */ AFf1zSDK getCurrencyIso4217Code;
    public static final /* enum */ AFf1zSDK getMediationNetwork;
    public static final /* enum */ AFf1zSDK getMonetizationNetwork;
    public static final /* enum */ AFf1zSDK getRevenue;
    public static final /* enum */ AFf1zSDK hashCode;
    public static final /* enum */ AFf1zSDK toString;
    public static final /* enum */ AFf1zSDK unregisterClient;
    public static final /* enum */ AFf1zSDK valueOf;
    public static final /* enum */ AFf1zSDK values;
    public final int AFLogger;

    static {
        AFf1zSDK aFf1zSDK;
        AFf1zSDK aFf1zSDK2;
        AFf1zSDK aFf1zSDK3;
        AFf1zSDK aFf1zSDK4;
        AFf1zSDK aFf1zSDK5;
        AFf1zSDK aFf1zSDK6;
        AFf1zSDK aFf1zSDK7;
        AFf1zSDK aFf1zSDK8;
        AFf1zSDK aFf1zSDK9;
        AFf1zSDK aFf1zSDK10;
        AFf1zSDK aFf1zSDK11;
        AFf1zSDK aFf1zSDK12;
        AFf1zSDK aFf1zSDK13;
        AFf1zSDK aFf1zSDK14;
        int n3 = 1;
        getRevenue = aFf1zSDK14 = new AFf1zSDK("RC_CDN", 0, n3);
        AFAdRevenueData = aFf1zSDK13 = new AFf1zSDK("FETCH_ADVERTISING_ID", n3, n3);
        int n4 = 2;
        getMediationNetwork = aFf1zSDK12 = new AFf1zSDK("LOAD_CACHE", n4, n4);
        int n7 = 3;
        getCurrencyIso4217Code = aFf1zSDK11 = new AFf1zSDK("CACHED_EVENT", n7, n4);
        int n8 = 4;
        getMonetizationNetwork = aFf1zSDK10 = new AFf1zSDK("CONVERSION", n8, n4);
        component4 = aFf1zSDK9 = new AFf1zSDK("PLAY_INTEGRITY_API", 5, n4);
        component1 = aFf1zSDK8 = new AFf1zSDK("REGISTER_TRIGGER", 6, n4);
        areAllFieldsValid = aFf1zSDK7 = new AFf1zSDK("ONELINK", 7, n4);
        component3 = aFf1zSDK6 = new AFf1zSDK("DLSDK", 8, n4);
        component2 = aFf1zSDK5 = new AFf1zSDK("RESOLVE_ESP", 9, n4);
        toString = aFf1zSDK4 = new AFf1zSDK("ATTR", 10, n4);
        copydefault = aFf1zSDK3 = new AFf1zSDK("GCDSDK", 11, n7);
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK("REGISTER", 12, n8);
        hashCode = aFf1zSDKArray;
        AFf1zSDK[] aFf1zSDKArray2 = aFf1zSDKArray;
        equals = aFf1zSDK2 = new AFf1zSDK("LAUNCH", 13, n8);
        AFf1zSDK aFf1zSDK15 = aFf1zSDK2;
        copy = aFf1zSDK = new AFf1zSDK("INAPP", 14, n8);
        AFf1zSDK aFf1zSDK16 = aFf1zSDK;
        aFf1zSDKArray = new AFf1zSDK("MANUAL_PURCHASE_VALIDATION", 15, n8);
        values = aFf1zSDKArray;
        AFf1zSDK[] aFf1zSDKArray3 = aFf1zSDKArray;
        valueOf = aFf1zSDK2 = new AFf1zSDK("PURCHASE_VALIDATE", 16, n8);
        AFf1zSDK aFf1zSDK17 = aFf1zSDK2;
        AFInAppEventType = aFf1zSDK = new AFf1zSDK("SDK_SERVICES", 17, n8);
        AFf1zSDK aFf1zSDK18 = aFf1zSDK;
        aFf1zSDKArray = new AFf1zSDK("IMPRESSIONS", 18, n8);
        AFKeystoreWrapper = aFf1zSDKArray;
        AFf1zSDK[] aFf1zSDKArray4 = aFf1zSDKArray;
        AFInAppEventParameterName = aFf1zSDK2 = new AFf1zSDK("ARS_VALIDATE", 19, n8);
        n4 = 20;
        unregisterClient = aFf1zSDK = new AFf1zSDK("ADREVENUE", n4, n8);
        aFf1zSDKArray = new AFf1zSDK[21];
        aFf1zSDKArray[0] = aFf1zSDK14;
        aFf1zSDKArray[1] = aFf1zSDK13;
        aFf1zSDKArray[2] = aFf1zSDK12;
        aFf1zSDKArray[3] = aFf1zSDK11;
        aFf1zSDKArray[n8] = aFf1zSDK10;
        aFf1zSDKArray[5] = aFf1zSDK9;
        aFf1zSDKArray[6] = aFf1zSDK8;
        aFf1zSDKArray[7] = aFf1zSDK7;
        aFf1zSDKArray[8] = aFf1zSDK6;
        aFf1zSDKArray[9] = aFf1zSDK5;
        aFf1zSDKArray[10] = aFf1zSDK4;
        aFf1zSDKArray[11] = aFf1zSDK3;
        aFf1zSDKArray[12] = aFf1zSDKArray2;
        aFf1zSDKArray[13] = aFf1zSDK15;
        aFf1zSDKArray[14] = aFf1zSDK16;
        aFf1zSDKArray[15] = aFf1zSDKArray3;
        aFf1zSDKArray[16] = aFf1zSDK17;
        aFf1zSDKArray[17] = aFf1zSDK18;
        aFf1zSDKArray[18] = aFf1zSDKArray4;
        aFf1zSDKArray[19] = aFf1zSDK2;
        aFf1zSDKArray[n4] = aFf1zSDK;
        d = aFf1zSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFf1zSDK() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.AFLogger = var3_2;
    }

    public static AFf1zSDK valueOf(String string2) {
        return Enum.valueOf(AFf1zSDK.class, string2);
    }

    public static AFf1zSDK[] values() {
        return (AFf1zSDK[])d.clone();
    }
}

