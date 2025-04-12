/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 */
package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.wrappers.Wrappers;

public final class UidVerifier {
    private UidVerifier() {
    }

    public static boolean isGooglePlayServicesUid(Context object, int n3) {
        String string2 = "com.google.android.gms";
        if ((n3 = (int)(UidVerifier.uidHasPackageName(object, n3, string2) ? 1 : 0)) != 0) {
            PackageManager packageManager = object.getPackageManager();
            int n4 = 64;
            try {
                packageManager = packageManager.getPackageInfo(string2, n4);
                return GoogleSignatureVerifier.getInstance(object).isGooglePublicSignedPackage((PackageInfo)packageManager);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                object = "UidVerifier";
                n3 = 3;
                Log.isLoggable((String)object, (int)n3);
            }
        }
        return false;
    }

    public static boolean uidHasPackageName(Context context, int n3, String string2) {
        return Wrappers.packageManager(context).zza(n3, string2);
    }
}

