/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.Binder
 *  android.os.Process
 */
package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;

public class PackageManagerWrapper {
    protected final Context zza;

    public PackageManagerWrapper(Context context) {
        this.zza = context;
    }

    public int checkCallingOrSelfPermission(String string2) {
        return this.zza.checkCallingOrSelfPermission(string2);
    }

    public int checkPermission(String string2, String string3) {
        return this.zza.getPackageManager().checkPermission(string2, string3);
    }

    public ApplicationInfo getApplicationInfo(String string2, int n3) {
        return this.zza.getPackageManager().getApplicationInfo(string2, n3);
    }

    public CharSequence getApplicationLabel(String string2) {
        Context context = this.zza;
        PackageManager packageManager = context.getPackageManager();
        string2 = context.getPackageManager().getApplicationInfo(string2, 0);
        return packageManager.getApplicationLabel((ApplicationInfo)string2);
    }

    public lm2 getApplicationLabelAndIcon(String string2) {
        string2 = this.zza.getPackageManager().getApplicationInfo(string2, 0);
        CharSequence charSequence = this.zza.getPackageManager().getApplicationLabel((ApplicationInfo)string2);
        string2 = this.zza.getPackageManager().getApplicationIcon((ApplicationInfo)string2);
        lm2 lm22 = new lm2(charSequence, string2);
        return lm22;
    }

    public PackageInfo getPackageInfo(String string2, int n3) {
        return this.zza.getPackageManager().getPackageInfo(string2, n3);
    }

    public String[] getPackagesForUid(int n3) {
        return this.zza.getPackageManager().getPackagesForUid(n3);
    }

    public boolean isCallerInstantApp() {
        int n3;
        int n4 = Binder.getCallingUid();
        if (n4 == (n3 = Process.myUid())) {
            return InstantApps.isInstantApp(this.zza);
        }
        n4 = (int)(PlatformVersion.isAtLeastO() ? 1 : 0);
        if (n4 != 0) {
            Object object = this.zza.getPackageManager();
            n3 = Binder.getCallingUid();
            if ((object = object.getNameForUid(n3)) != null) {
                return ek2_2.a(this.zza.getPackageManager(), (String)object);
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean zza(int n3, String string2) {
        block8: {
            String string3;
            Context context;
            try {
                context = this.zza;
                string3 = "appops";
            }
            catch (SecurityException securityException) {
                return false;
            }
            Object object = context.getSystemService(string3);
            AppOpsManager appOpsManager = (AppOpsManager)object;
            if (appOpsManager == null) break block8;
            appOpsManager.checkPackage(n3, string2);
            return true;
        }
        string2 = "context.getSystemService(Context.APP_OPS_SERVICE) is null";
        NullPointerException nullPointerException = new NullPointerException(string2);
        throw nullPointerException;
    }
}

