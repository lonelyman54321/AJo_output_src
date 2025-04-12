/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 */
package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.play.core.appupdate.internal.zzaa;
import com.google.android.play.core.appupdate.internal.zzm;

public final class zzab {
    private static final zzm zza;

    static {
        zzm zzm2;
        zza = zzm2 = new zzm("PhoneskyVerificationUtils");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean zza(Context object) {
        block11: {
            int n3;
            Object[] objectArray = "com.android.vending";
            PackageManager packageManager = object.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo((String)objectArray, 0);
            int n4 = applicationInfo.enabled;
            if (n4 == 0) break block11;
            object = object.getPackageManager();
            n4 = 64;
            object = object.getPackageInfo((String)objectArray, n4);
            try {
                object = ((PackageInfo)object).signatures;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return false;
            }
            if (object != null && (n3 = ((Object)object).length) != 0) {
                Object var2_4 = null;
                for (n4 = 0; n4 < n3; ++n4) {
                    boolean bl2;
                    String string2;
                    boolean bl3;
                    String string3 = "8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M";
                    String string4 = zzaa.zza(object[n4].toByteArray());
                    boolean bl4 = string3.equals(string4);
                    if (bl4 || ((bl3 = (string3 = Build.TAGS).contains(string2 = "dev-keys")) || (bl4 = string3.contains(string2 = "test-keys"))) && (bl2 = (string3 = "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA").equals(string4))) return true;
                }
                return false;
            } else {
                object = zza;
                objectArray = new Object[]{};
                String string5 = "Phonesky package is not signed -- possibly self-built package. Could not verify.";
                ((zzm)object).zze(string5, objectArray);
            }
        }
        return false;
    }
}

