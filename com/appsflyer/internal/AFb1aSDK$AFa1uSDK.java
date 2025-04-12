/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

final class AFb1aSDK$AFa1uSDK
extends Enum {
    private static final /* synthetic */ AFb1aSDK$AFa1uSDK[] AFKeystoreWrapper;
    private static /* enum */ AFb1aSDK$AFa1uSDK areAllFieldsValid;
    private static /* enum */ AFb1aSDK$AFa1uSDK component1;
    private static /* enum */ AFb1aSDK$AFa1uSDK component2;
    private static /* enum */ AFb1aSDK$AFa1uSDK component3;
    private static /* enum */ AFb1aSDK$AFa1uSDK component4;
    private static /* enum */ AFb1aSDK$AFa1uSDK copy;
    private static /* enum */ AFb1aSDK$AFa1uSDK copydefault;
    private static /* enum */ AFb1aSDK$AFa1uSDK equals;
    private static /* enum */ AFb1aSDK$AFa1uSDK getCurrencyIso4217Code;
    public static final /* enum */ AFb1aSDK$AFa1uSDK getMediationNetwork;
    private static /* enum */ AFb1aSDK$AFa1uSDK getMonetizationNetwork;
    private static /* enum */ AFb1aSDK$AFa1uSDK hashCode;
    private static /* enum */ AFb1aSDK$AFa1uSDK toString;
    private static /* enum */ AFb1aSDK$AFa1uSDK values;
    final String AFAdRevenueData;
    final String getRevenue;

    static {
        AFb1aSDK$AFa1uSDK aFb1aSDK$AFa1uSDK;
        AFb1aSDK$AFa1uSDK aFb1aSDK$AFa1uSDK2;
        AFb1aSDK$AFa1uSDK aFb1aSDK$AFa1uSDK3;
        getMonetizationNetwork = aFb1aSDK$AFa1uSDK3 = new AFb1aSDK$AFa1uSDK("ADOBE_AIR", 0, "android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension");
        int n3 = 1;
        getCurrencyIso4217Code = aFb1aSDK$AFa1uSDK3 = new AFb1aSDK$AFa1uSDK("ADOBE_MOBILE_SDK", n3, "android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension");
        int n4 = 2;
        component4 = aFb1aSDK$AFa1uSDK3 = new AFb1aSDK$AFa1uSDK("COCOS2DX", n4, "android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity");
        int n7 = 3;
        component2 = aFb1aSDK$AFa1uSDK3 = new AFb1aSDK$AFa1uSDK("CORDOVA", n7, "android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin");
        int n8 = 4;
        Object object = "android_native";
        getMediationNetwork = aFb1aSDK$AFa1uSDK3 = new AFb1aSDK$AFa1uSDK("DEFAULT", n8, object, object);
        int n10 = 5;
        object = new AFb1aSDK$AFa1uSDK("FLUTTER", n10, "android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin");
        component3 = object;
        int n14 = 6;
        object = new AFb1aSDK$AFa1uSDK("M_PARTICLE", n14, "android_mparticle", "com.mparticle.kits.AppsFlyerKit");
        component1 = object;
        int n15 = 7;
        object = new AFb1aSDK$AFa1uSDK("NATIVE_SCRIPT", n15, "android_native_script", "com.tns.NativeScriptActivity");
        areAllFieldsValid = object;
        int n16 = 8;
        object = new AFb1aSDK$AFa1uSDK("EXPO", n16, "android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity");
        copy = object;
        int n17 = 9;
        object = new AFb1aSDK$AFa1uSDK("REACT_NATIVE", n17, "android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule");
        equals = object;
        object = new AFb1aSDK$AFa1uSDK("UNITY", 10, "android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper");
        toString = object;
        object = new AFb1aSDK$AFa1uSDK("UNREAL_ENGINE", 11, "android_unreal", "com.epicgames.ue4.GameActivity");
        copydefault = object;
        object = new AFb1aSDK$AFa1uSDK("XAMARIN", 12, "android_xamarin", "mono.android.Runtime");
        hashCode = object;
        int n18 = 13;
        object = new AFb1aSDK$AFa1uSDK("CAPACITOR", n18, "android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");
        values = object;
        AFb1aSDK$AFa1uSDK[] aFb1aSDK$AFa1uSDKArray = new AFb1aSDK$AFa1uSDK[14];
        aFb1aSDK$AFa1uSDKArray[0] = aFb1aSDK$AFa1uSDK2 = getMonetizationNetwork;
        aFb1aSDK$AFa1uSDKArray[n3] = aFb1aSDK$AFa1uSDK = getCurrencyIso4217Code;
        aFb1aSDK$AFa1uSDKArray[n4] = aFb1aSDK$AFa1uSDK = component4;
        aFb1aSDK$AFa1uSDKArray[n7] = aFb1aSDK$AFa1uSDK = component2;
        aFb1aSDK$AFa1uSDKArray[n8] = aFb1aSDK$AFa1uSDK3;
        aFb1aSDK$AFa1uSDKArray[n10] = aFb1aSDK$AFa1uSDK3 = component3;
        aFb1aSDK$AFa1uSDKArray[n14] = aFb1aSDK$AFa1uSDK3 = component1;
        aFb1aSDK$AFa1uSDKArray[n15] = aFb1aSDK$AFa1uSDK3 = areAllFieldsValid;
        aFb1aSDK$AFa1uSDKArray[n16] = aFb1aSDK$AFa1uSDK3 = copy;
        aFb1aSDK$AFa1uSDKArray[n17] = aFb1aSDK$AFa1uSDK3 = equals;
        aFb1aSDK$AFa1uSDKArray[10] = aFb1aSDK$AFa1uSDK3 = toString;
        aFb1aSDK$AFa1uSDKArray[11] = aFb1aSDK$AFa1uSDK3 = copydefault;
        aFb1aSDK$AFa1uSDKArray[12] = aFb1aSDK$AFa1uSDK3 = hashCode;
        aFb1aSDK$AFa1uSDKArray[n18] = object;
        AFKeystoreWrapper = aFb1aSDK$AFa1uSDKArray;
    }

    /*
     * WARNING - void declaration
     */
    private AFb1aSDK$AFa1uSDK() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.getRevenue = var3_2;
        this.AFAdRevenueData = var4_1;
    }

    public static AFb1aSDK$AFa1uSDK valueOf(String string2) {
        return Enum.valueOf(AFb1aSDK$AFa1uSDK.class, string2);
    }

    public static AFb1aSDK$AFa1uSDK[] values() {
        return (AFb1aSDK$AFa1uSDK[])AFKeystoreWrapper.clone();
    }
}

