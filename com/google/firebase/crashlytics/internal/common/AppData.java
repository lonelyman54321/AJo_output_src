/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.os.Build$VERSION
 */
package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.List;

public class AppData {
    public final String buildId;
    public final List buildIdInfoList;
    public final DevelopmentPlatformProvider developmentPlatformProvider;
    public final String googleAppId;
    public final String installerPackageName;
    public final String packageName;
    public final String versionCode;
    public final String versionName;

    public AppData(String string2, String string3, List list, String string4, String string5, String string6, String string7, DevelopmentPlatformProvider developmentPlatformProvider) {
        this.googleAppId = string2;
        this.buildId = string3;
        this.buildIdInfoList = list;
        this.installerPackageName = string4;
        this.packageName = string5;
        this.versionCode = string6;
        this.versionName = string7;
        this.developmentPlatformProvider = developmentPlatformProvider;
    }

    public static AppData create(Context object, IdManager idManager, String string2, String string3, List list, DevelopmentPlatformProvider developmentPlatformProvider) {
        String string4 = object.getPackageName();
        String string5 = idManager.getInstallerPackageName();
        object = object.getPackageManager();
        idManager = null;
        object = object.getPackageInfo(string4, 0);
        String string6 = AppData.getAppBuildVersion((PackageInfo)object);
        object = object.versionName;
        if (object == null) {
            object = "0.0";
        }
        Object object2 = object;
        object = new AppData(string2, string3, list, string5, string4, string6, (String)object2, developmentPlatformProvider);
        return object;
    }

    private static String getAppBuildVersion(PackageInfo packageInfo) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            return Long.toString(ep.a(packageInfo));
        }
        return Integer.toString(packageInfo.versionCode);
    }
}

