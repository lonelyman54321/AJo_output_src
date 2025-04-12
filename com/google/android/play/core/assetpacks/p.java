/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

final class p {
    private final Context a;

    public p(Context context) {
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String b(Context object) {
        try {
            PackageManager packageManager = object.getPackageManager();
            String string2 = object.getPackageName();
            int n3 = 128;
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(string2, n3);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) return bundle.getString("local_testing_dir");
            return null;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        return null;
    }

    public final Context a() {
        return this.a;
    }
}

