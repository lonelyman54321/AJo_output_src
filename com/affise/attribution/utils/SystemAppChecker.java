/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.affise.attribution.utils;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class SystemAppChecker {
    private final Application app;

    public SystemAppChecker(Application application) {
        Intrinsics.checkNotNullParameter(application, "app");
        this.app = application;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isSystemAppByFLAG() {
        Application application;
        boolean bl2 = false;
        try {
            application = this.app;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return bl2;
        }
        application = application.getPackageManager();
        Application application2 = this.app;
        String string2 = application2.getPackageName();
        application = application.getApplicationInfo(string2, 0);
        int n3 = application.flags & 0x81;
        if (n3 == 0) return bl2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isSystemPreloaded() {
        Application application;
        String string2 = "it.sourceDir";
        boolean bl2 = false;
        try {
            application = this.app;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return bl2;
        }
        PackageManager packageManager = application.getPackageManager();
        Application application2 = this.app;
        String string3 = application2.getPackageName();
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(string3, 0);
        String string4 = applicationInfo.sourceDir;
        Intrinsics.checkNotNullExpressionValue(string4, string2);
        String string5 = "/system/app/";
        boolean bl3 = b.s(string4, string5, false);
        if (bl3) return true;
        String string6 = applicationInfo.sourceDir;
        Intrinsics.checkNotNullExpressionValue(string6, string2);
        string2 = "/system/priv-app/";
        boolean bl4 = b.s(string6, string2, false);
        if (!bl4) return bl2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String getSystemProperty(String object) {
        String string2;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "key");
        String string3 = null;
        Object object2 = "android.os.SystemProperties";
        try {
            object2 = Class.forName((String)object2);
            string2 = "get";
        }
        catch (Throwable throwable) {
            return string3;
        }
        Class[] classArray = new Class[n3];
        Class<String> clazz = String.class;
        classArray[0] = clazz;
        object2 = ((Class)object2).getDeclaredMethod(string2, classArray);
        if (object2 == null) return string3;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        object = ((Method)object2).invoke(null, objectArray);
        if (object == null) return string3;
        return object.toString();
    }

    public final boolean isPreinstallApp() {
        boolean bl2 = this.isSystemAppByFLAG();
        bl2 = bl2 || (bl2 = this.isSystemPreloaded());
        return bl2;
    }
}

