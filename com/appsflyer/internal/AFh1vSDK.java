/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFh1vSDK
extends Enum {
    public static final /* enum */ AFh1vSDK AFInAppEventParameterName;
    public static final /* enum */ AFh1vSDK AFInAppEventType;
    public static final /* enum */ AFh1vSDK AFKeystoreWrapper;
    public static final /* enum */ AFh1vSDK AFLogger;
    private static /* enum */ AFh1vSDK afDebugLog;
    private static /* enum */ AFh1vSDK afErrorLog;
    public static final /* enum */ AFh1vSDK afInfoLog;
    private static final /* synthetic */ AFh1vSDK[] afRDLog;
    public static final /* enum */ AFh1vSDK afVerboseLog;
    private static /* enum */ AFh1vSDK afWarnLog;
    public static final /* enum */ AFh1vSDK areAllFieldsValid;
    public static final /* enum */ AFh1vSDK component1;
    public static final /* enum */ AFh1vSDK component2;
    public static final /* enum */ AFh1vSDK component3;
    public static final /* enum */ AFh1vSDK component4;
    public static final /* enum */ AFh1vSDK copy;
    public static final /* enum */ AFh1vSDK copydefault;
    public static final /* enum */ AFh1vSDK d;
    public static final /* enum */ AFh1vSDK e;
    public static final /* enum */ AFh1vSDK equals;
    public static final /* enum */ AFh1vSDK force;
    public static final /* enum */ AFh1vSDK getCurrencyIso4217Code;
    public static final /* enum */ AFh1vSDK getMediationNetwork;
    public static final /* enum */ AFh1vSDK getMonetizationNetwork;
    public static final /* enum */ AFh1vSDK getRevenue;
    public static final /* enum */ AFh1vSDK hashCode;
    public static final /* enum */ AFh1vSDK i;
    public static final /* enum */ AFh1vSDK registerClient;
    public static final /* enum */ AFh1vSDK toString;
    public static final /* enum */ AFh1vSDK unregisterClient;
    public static final /* enum */ AFh1vSDK v;
    public static final /* enum */ AFh1vSDK valueOf;
    public static final /* enum */ AFh1vSDK values;
    public static final /* enum */ AFh1vSDK w;
    final String AFAdRevenueData;

    static {
        AFh1vSDK aFh1vSDK;
        AFh1vSDK aFh1vSDK2;
        AFh1vSDK aFh1vSDK3;
        AFh1vSDK aFh1vSDK4;
        AFh1vSDK aFh1vSDK5;
        AFh1vSDK aFh1vSDK6;
        AFh1vSDK aFh1vSDK7;
        AFh1vSDK aFh1vSDK8;
        AFh1vSDK aFh1vSDK9;
        AFh1vSDK aFh1vSDK10;
        AFh1vSDK aFh1vSDK11;
        AFh1vSDK aFh1vSDK12;
        getCurrencyIso4217Code = aFh1vSDK12 = new AFh1vSDK("SDK_LIFECYCLE", 0, "SDK Lifecycle");
        getMediationNetwork = aFh1vSDK11 = new AFh1vSDK("PRIVACY_SANDBOX", 1, "Privacy Sandbox");
        getRevenue = aFh1vSDK10 = new AFh1vSDK("PLAY_INTEGRITY_API", 2, "Play Integrity Api");
        getMonetizationNetwork = aFh1vSDK9 = new AFh1vSDK("OTHER", 3, "Other");
        component2 = aFh1vSDK8 = new AFh1vSDK("HTTP_CLIENT", 4, "HTTP Client");
        component4 = aFh1vSDK7 = new AFh1vSDK("QUEUE", 5, "Queue");
        component3 = aFh1vSDK6 = new AFh1vSDK("CACHE", 6, "Cache");
        areAllFieldsValid = aFh1vSDK5 = new AFh1vSDK("PREFERENCES", 7, "Preferences");
        component1 = aFh1vSDK4 = new AFh1vSDK("REMOTE_CONTROL", 8, "CFG");
        Object object = "DDL";
        copy = aFh1vSDK3 = new AFh1vSDK(object, 9, object);
        object = new AFh1vSDK("REFERRER", 10, "Referrer");
        hashCode = object;
        toString = aFh1vSDK2 = new AFh1vSDK("META_REFERRER", 11, "Meta Referrer");
        AFh1vSDK[] aFh1vSDKArray = new AFh1vSDK("SAMSUNG_PRELOAD_REFERRER", 12, "Samsung Preload Referrer");
        copydefault = aFh1vSDKArray;
        AFh1vSDK[] aFh1vSDKArray2 = aFh1vSDKArray;
        equals = aFh1vSDK = new AFh1vSDK("ADVERTISING_ID", 13, "Advertising Id");
        AFh1vSDK aFh1vSDK13 = aFh1vSDK;
        aFh1vSDKArray = new AFh1vSDK("CROSS_PROMOTION", 14, "Cross Promotion");
        AFInAppEventParameterName = aFh1vSDKArray;
        AFh1vSDK[] aFh1vSDKArray3 = aFh1vSDKArray;
        values = aFh1vSDK = new AFh1vSDK("EXCEPTION_MANAGER", 15, "Exception Manager");
        AFh1vSDK aFh1vSDK14 = aFh1vSDK;
        aFh1vSDKArray = new AFh1vSDK("ATTRIBUTION", 16, "Attribution");
        AFKeystoreWrapper = aFh1vSDKArray;
        Object object2 = "RD";
        valueOf = aFh1vSDK = new AFh1vSDK(object2, 17, object2);
        AFh1vSDK aFh1vSDK15 = aFh1vSDK;
        AFh1vSDK[] aFh1vSDKArray4 = aFh1vSDKArray;
        object2 = new AFh1vSDK("ENGAGEMENT", 18, "Engagement");
        AFInAppEventType = object2;
        Object object3 = object2;
        afWarnLog = aFh1vSDK = new AFh1vSDK("ANTI_FRAUD", 19, "Anti Fraud");
        AFLogger = aFh1vSDK = new AFh1vSDK("PUBLIC_API", 20, "Public API");
        AFh1vSDK aFh1vSDK16 = aFh1vSDK;
        aFh1vSDKArray = new AFh1vSDK("AD_REVENUE", 21, "Ad Revenue");
        registerClient = aFh1vSDKArray;
        AFh1vSDK[] aFh1vSDKArray5 = aFh1vSDKArray;
        afErrorLog = aFh1vSDK = new AFh1vSDK("SDK_SETTERS", 22, "Setter");
        unregisterClient = aFh1vSDK = new AFh1vSDK("PREDICT", 23, "Predict");
        AFh1vSDK aFh1vSDK17 = aFh1vSDK;
        aFh1vSDKArray = new AFh1vSDK("DEVICE_DATA", 24, "Device Data");
        d = aFh1vSDKArray;
        AFh1vSDK[] aFh1vSDKArray6 = aFh1vSDKArray;
        afDebugLog = aFh1vSDK = new AFh1vSDK("SECURITY", 25, "Security");
        e = aFh1vSDK = new AFh1vSDK("GENERAL", 26, "General");
        AFh1vSDK aFh1vSDK18 = aFh1vSDK;
        aFh1vSDKArray = new AFh1vSDK("PREINSTALL", 27, "Preinstall");
        w = aFh1vSDKArray;
        AFh1vSDK[] aFh1vSDKArray7 = aFh1vSDKArray;
        i = aFh1vSDK = new AFh1vSDK("UNINSTALL", 28, "Uninstall");
        AFh1vSDK aFh1vSDK19 = aFh1vSDK;
        aFh1vSDKArray = new AFh1vSDK("PURCHASE_VALIDATION", 29, "Purchase Validation");
        v = aFh1vSDKArray;
        object2 = "DMA";
        force = aFh1vSDK = new AFh1vSDK(object2, 30, object2);
        String string2 = "PROXY";
        AFh1vSDK aFh1vSDK20 = aFh1vSDK;
        object2 = new AFh1vSDK(string2, 31, string2);
        afInfoLog = object2;
        AFh1vSDK[] aFh1vSDKArray8 = aFh1vSDKArray;
        afVerboseLog = aFh1vSDK = new AFh1vSDK("AF_EXECUTOR", 32, "AF Executor");
        aFh1vSDKArray = new AFh1vSDK[]{aFh1vSDK12, aFh1vSDK11, aFh1vSDK10, aFh1vSDK9, aFh1vSDK8, aFh1vSDK7, aFh1vSDK6, aFh1vSDK5, aFh1vSDK4, aFh1vSDK3, object, aFh1vSDK2, aFh1vSDKArray2, aFh1vSDK13, aFh1vSDKArray3, aFh1vSDK14, aFh1vSDKArray4, aFh1vSDK15, object3, aFh1vSDK12 = afWarnLog, aFh1vSDK16, aFh1vSDKArray5, aFh1vSDK12 = afErrorLog, aFh1vSDK17, aFh1vSDKArray6, aFh1vSDK12 = afDebugLog, aFh1vSDK18, aFh1vSDKArray7, aFh1vSDK19, aFh1vSDKArray8, aFh1vSDK20, object2, aFh1vSDK};
        afRDLog = aFh1vSDKArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFh1vSDK() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.AFAdRevenueData = var3_2;
    }

    public static AFh1vSDK valueOf(String string2) {
        return Enum.valueOf(AFh1vSDK.class, string2);
    }

    public static AFh1vSDK[] values() {
        return (AFh1vSDK[])afRDLog.clone();
    }
}

