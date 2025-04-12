/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 */
package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageManager;

class InstallerPackageNameProvider {
    private static final String NO_INSTALLER_PACKAGE_NAME = "";
    private String installerPackageName;

    private static String loadInstallerPackageName(Context object) {
        PackageManager packageManager = object.getPackageManager();
        object = object.getPackageName();
        if ((object = packageManager.getInstallerPackageName((String)object)) == null) {
            object = NO_INSTALLER_PACKAGE_NAME;
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getInstallerPackageName(Context object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                String string2;
                block4: {
                    try {
                        string2 = this.installerPackageName;
                        if (string2 != null) break block4;
                        object = InstallerPackageNameProvider.loadInstallerPackageName((Context)object);
                        this.installerPackageName = object;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if (!(bl2 = ((String)(object = NO_INSTALLER_PACKAGE_NAME)).equals(string2 = this.installerPackageName))) return this.installerPackageName;
                return null;
            }
            throw throwable2;
        }
    }
}

