/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$PackageInfoFlags
 */
package com.appsflyer.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public final class q {
    public static /* bridge */ /* synthetic */ PackageInfo a(PackageManager packageManager, String string2, PackageManager.PackageInfoFlags packageInfoFlags) {
        return packageManager.getPackageInfo(string2, packageInfoFlags);
    }
}

