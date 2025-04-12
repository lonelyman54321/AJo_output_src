/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public class ClientLibraryUtils {
    private ClientLibraryUtils() {
    }

    public static int getClientVersion(Context context, String string2) {
        context = ClientLibraryUtils.getPackageInfo(context, string2);
        int n3 = -1;
        if (context != null && (context = context.applicationInfo) != null && (context = context.metaData) != null) {
            return context.getInt("com.google.android.gms.version", n3);
        }
        return n3;
    }

    public static PackageInfo getPackageInfo(Context object, String string2) {
        int n3;
        try {
            object = Wrappers.packageManager((Context)object);
            n3 = 128;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
        return ((PackageManagerWrapper)object).getPackageInfo(string2, n3);
    }

    public static boolean isPackageSide() {
        return false;
    }
}

