/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$PackageInfoFlags
 */
package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public final class d$a {
    public static PackageInfo a(PackageManager packageManager, Context object) {
        object = object.getPackageName();
        PackageManager.PackageInfoFlags packageInfoFlags = PackageManager.PackageInfoFlags.of((long)0L);
        return packageManager.getPackageInfo((String)object, packageInfoFlags);
    }
}

