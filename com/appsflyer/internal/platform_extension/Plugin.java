/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal.platform_extension;

public final class Plugin
extends Enum {
    public static final /* enum */ Plugin ADOBE_AIR;
    public static final /* enum */ Plugin ADOBE_MOBILE;
    private static final /* synthetic */ Plugin[] AFAdRevenueData;
    public static final /* enum */ Plugin CAPACITOR;
    public static final /* enum */ Plugin COCOS_2DX;
    public static final /* enum */ Plugin CORDOVA;
    public static final /* enum */ Plugin EXPO;
    public static final /* enum */ Plugin FLUTTER;
    public static final /* enum */ Plugin MPARTICLE;
    public static final /* enum */ Plugin NATIVE;
    public static final /* enum */ Plugin NATIVE_SCRIPT;
    public static final /* enum */ Plugin REACT_NATIVE;
    public static final /* enum */ Plugin SEGMENT;
    public static final /* enum */ Plugin UNITY;
    public static final /* enum */ Plugin UNREAL;
    public static final /* enum */ Plugin XAMARIN;
    private final String pluginName;

    static {
        Plugin plugin;
        Plugin plugin2;
        Plugin plugin3;
        Plugin plugin4;
        Plugin plugin5;
        Plugin plugin6;
        Plugin plugin7;
        Plugin plugin8;
        Plugin plugin9;
        Plugin plugin10;
        Plugin plugin11;
        Plugin plugin12;
        Plugin plugin13;
        NATIVE = plugin13 = new Plugin("NATIVE", 0, "android_native");
        UNITY = plugin12 = new Plugin("UNITY", 1, "android_unity");
        FLUTTER = plugin11 = new Plugin("FLUTTER", 2, "android_flutter");
        REACT_NATIVE = plugin10 = new Plugin("REACT_NATIVE", 3, "android_react_native");
        ADOBE_AIR = plugin9 = new Plugin("ADOBE_AIR", 4, "android_adobe_air");
        ADOBE_MOBILE = plugin8 = new Plugin("ADOBE_MOBILE", 5, "android_adobe_mobile");
        COCOS_2DX = plugin7 = new Plugin("COCOS_2DX", 6, "android_cocos2dx");
        CORDOVA = plugin6 = new Plugin("CORDOVA", 7, "android_cordova");
        MPARTICLE = plugin5 = new Plugin("MPARTICLE", 8, "android_mparticle");
        NATIVE_SCRIPT = plugin4 = new Plugin("NATIVE_SCRIPT", 9, "android_native_script");
        EXPO = plugin3 = new Plugin("EXPO", 10, "android_expo");
        UNREAL = plugin2 = new Plugin("UNREAL", 11, "android_unreal");
        XAMARIN = plugin = new Plugin("XAMARIN", 12, "android_xamarin");
        Plugin plugin14 = plugin;
        Plugin[] pluginArray = new Plugin("CAPACITOR", 13, "android_capacitor");
        CAPACITOR = pluginArray;
        int n3 = 14;
        Plugin[] pluginArray2 = pluginArray;
        SEGMENT = plugin = new Plugin("SEGMENT", n3, "android_segment");
        pluginArray = new Plugin[15];
        pluginArray[0] = plugin13;
        pluginArray[1] = plugin12;
        pluginArray[2] = plugin11;
        pluginArray[3] = plugin10;
        pluginArray[4] = plugin9;
        pluginArray[5] = plugin8;
        pluginArray[6] = plugin7;
        pluginArray[7] = plugin6;
        pluginArray[8] = plugin5;
        pluginArray[9] = plugin4;
        pluginArray[10] = plugin3;
        pluginArray[11] = plugin2;
        pluginArray[12] = plugin14;
        pluginArray[13] = pluginArray2;
        pluginArray[n3] = plugin;
        AFAdRevenueData = pluginArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Plugin() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.pluginName = var3_2;
    }

    public static Plugin valueOf(String string2) {
        return Enum.valueOf(Plugin.class, string2);
    }

    public static Plugin[] values() {
        return (Plugin[])AFAdRevenueData.clone();
    }

    public final String getPluginName() {
        return this.pluginName;
    }
}

