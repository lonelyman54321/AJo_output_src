/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.u;

public final class AFh1zSDK {
    public static boolean getRevenue(Context object) {
        String string2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            return u.a(object.getPackageManager());
        }
        n3 = 1;
        try {
            object = object.getClassLoader();
            string2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime";
        }
        catch (ClassNotFoundException classNotFoundException) {
            AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", classNotFoundException, n3 != 0);
            return false;
        }
        ((ClassLoader)object).loadClass(string2);
        return n3 != 0;
    }
}

