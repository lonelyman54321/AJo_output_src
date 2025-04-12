/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$ComponentInfoFlags
 *  android.content.pm.ProviderInfo
 */
package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;

public final class G {
    public static /* bridge */ /* synthetic */ ProviderInfo a(PackageManager packageManager, PackageManager.ComponentInfoFlags componentInfoFlags) {
        return packageManager.resolveContentProvider("com.huawei.appmarket.commondata", componentInfoFlags);
    }
}

