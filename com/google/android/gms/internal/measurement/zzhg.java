/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.os.UserHandle
 *  android.os.UserManager
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;

public class zzhg {
    private static UserManager zza;
    private static volatile boolean zzb;

    static {
        zzb = zzhg.zza() ^ true;
    }

    private zzhg() {
    }

    public static boolean zza() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        return n3 >= n4;
    }

    public static boolean zza(Context context) {
        boolean bl2;
        boolean bl3 = zzhg.zza();
        return bl3 && !(bl2 = zzhg.zzc(context));
    }

    public static boolean zzb(Context context) {
        boolean bl2;
        boolean bl3 = zzhg.zza();
        return !bl3 || (bl2 = zzhg.zzc(context));
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean zzc(Context context) {
        boolean bl2 = zzb;
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        Class<zzhg> clazz = zzhg.class;
        synchronized (clazz) {
            Throwable throwable2;
            block6: {
                try {
                    boolean bl4 = zzb;
                    if (bl4) {
                        return bl3;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                boolean bl5 = zzhg.zzd(context);
                if (bl5) {
                    zzb = bl5;
                }
                return bl5;
            }
            throw throwable2;
        }
    }

    private static boolean zzd(Context context) {
        boolean bl2;
        boolean bl3 = true;
        int n3 = 1;
        while (true) {
            block8: {
                int n4 = 2;
                bl2 = false;
                if (n3 > n4) break;
                UserManager userManager = zza;
                if (userManager == null) {
                    zza = userManager = (UserManager)ck3_1.a(context);
                }
                if ((userManager = zza) == null) {
                    return bl3;
                }
                try {
                    boolean bl4 = dk3_1.a(userManager);
                    if (bl4) break block8;
                }
                catch (NullPointerException nullPointerException) {
                    zza = null;
                    ++n3;
                    continue;
                }
                UserHandle userHandle = Process.myUserHandle();
                boolean bl5 = userManager.isUserRunning(userHandle);
                if (!bl5) break block8;
                bl3 = false;
            }
            bl2 = bl3;
            break;
        }
        if (bl2) {
            zza = null;
        }
        return bl2;
    }
}

