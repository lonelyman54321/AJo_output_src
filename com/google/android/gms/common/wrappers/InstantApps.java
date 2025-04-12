/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 */
package com.google.android.gms.common.wrappers;

import android.content.Context;
import android.content.pm.PackageManager;
import com.appsflyer.internal.u;
import com.google.android.gms.common.util.PlatformVersion;

public class InstantApps {
    private static Context zza;
    private static Boolean zzb;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean isInstantApp(Context var0) {
        var1_2 = InstantApps.class;
        synchronized (var1_2) {
            block10: {
                var2_3 = var0.getApplicationContext();
                var3_4 /* !! */  = InstantApps.zza;
                if (var3_4 /* !! */  != null && (var4_5 = InstantApps.zzb) != null) {
                    if (var3_4 /* !! */  == var2_3) return var4_5;
                }
                ** GOTO lbl12
                {
                    block11: {
                        catch (Throwable var0_1) {
                            break block10;
                        }
lbl12:
                        // 2 sources

                        var6_8 = false;
                        var3_4 /* !! */  = null;
                        InstantApps.zzb = null;
                        var6_8 = PlatformVersion.isAtLeastO();
                        if (!var6_8) break block11;
                        var0 = var2_3.getPackageManager();
                        var5_7 = u.a((PackageManager)var0);
                        var0 = var5_7;
                        InstantApps.zzb = var0;
                        ** GOTO lbl34
                    }
                    try {
                        var0 = var0.getClassLoader();
                        var3_4 /* !! */  = "com.google.android.instantapps.supervisor.InstantAppsRuntime";
                        var0.loadClass((String)var3_4 /* !! */ );
                        var0 = Boolean.TRUE;
                        InstantApps.zzb = var0;
                        ** GOTO lbl34
                    }
                    catch (ClassNotFoundException v0) {}
                    {
                        var0 = Boolean.FALSE;
                        InstantApps.zzb = var0;
lbl34:
                        // 3 sources

                        InstantApps.zza = var2_3;
                        var0 = InstantApps.zzb;
                        return var0.booleanValue();
                    }
                }
            }
            throw var0_1;
        }
    }
}

