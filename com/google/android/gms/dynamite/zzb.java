/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.dynamite;

import android.os.Looper;
import com.google.android.gms.dynamite.zza;

public final class zzb {
    private static ClassLoader zza;
    private static Thread zzb;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ClassLoader zza() {
        var0 = zzb.class;
        synchronized (var0) {
            block33: {
                block34: {
                    var1_1 = com.google.android.gms.dynamite.zzb.zza;
                    if (var1_1 != null) return com.google.android.gms.dynamite.zzb.zza;
                    var1_1 = com.google.android.gms.dynamite.zzb.zzb;
                    var2_6 = null;
                    if (var1_1 != null) ** GOTO lbl87
                    var1_1 = Looper.getMainLooper();
                    var1_1 = var1_1.getThread();
                    if ((var1_1 = var1_1.getThreadGroup()) != null) break block34;
                    var3_8 = 0;
                    var1_1 = null;
                    ** GOTO lbl85
                }
                var4_9 = Void.class;
                ** synchronized (var4_9)
lbl-1000:
                // 1 sources

                {
                    try {
                        block29: {
                            block28: {
                                try {
                                    var5_11 = var1_1.activeGroupCount();
                                    var6_12 = new ThreadGroup[var5_11];
                                    var1_1.enumerate((ThreadGroup[])var6_12);
                                    var7_13 = 0;
                                    var9_15 = null;
                                    break block28;
                                }
                                catch (SecurityException var1_3) {}
                                var14_20 /* !! */  = var1_3;
                                var6_12 = null;
                                ** GOTO lbl78
                            }
                            for (var8_14 = 0; var8_14 < var5_11; ++var8_14) {
                                var11_17 = "dynamiteLoader";
                                var10_16 = var6_12[var8_14];
                                var12_18 = var10_16.getName();
                                var13_19 = var11_17.equals(var12_18);
                                if (!var13_19) {
                                    continue;
                                }
                                break block29;
                            }
                            var10_16 = null;
                        }
                        if (var10_16 == null) {
                            var14_20 /* !! */  = "dynamiteLoader";
                            var10_16 = new ThreadGroup((ThreadGroup)var1_1, (String)var14_20 /* !! */ );
                        }
                        var3_8 = var10_16.activeCount();
                        var14_20 /* !! */  = new Thread[var3_8];
                        var10_16.enumerate(var14_20 /* !! */ );
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var1_2) {}
                }
                throw var1_2;
lbl-1000:
                // 2 sources

                {
                    block31: {
                        block32: {
                            block30: {
                                while (var7_13 < var3_8) {
                                    var9_15 = "GmsDynamite";
                                    var6_12 = var14_20 /* !! */ [var7_13];
                                    var11_17 = var6_12.getName();
                                    var8_14 = (int)var9_15.equals(var11_17);
                                    if (var8_14 == 0) {
                                        ++var7_13;
                                        continue;
                                    }
                                    break block30;
                                }
                                var6_12 = null;
                            }
                            if (var6_12 != null) break block31;
                            var14_20 /* !! */  = "GmsDynamite";
                            var1_1 = new zza(var10_16, (String)var14_20 /* !! */ );
                            try {
                                var1_1.setContextClassLoader(null);
                                var1_1.start();
                                var6_12 = var1_1;
                                break block31;
                            }
                            catch (SecurityException var14_21) {
                                var6_12 = var1_1;
                                break block32;
                            }
                            catch (SecurityException var1_4) {
                                var14_20 /* !! */  = var1_4;
                            }
                        }
                        var14_20 /* !! */ .getMessage();
                    }
                    // MONITOREXIT @DISABLED, blocks:[7, 12, 14] lbl77 : MonitorExitStatement: MONITOREXIT : var4_9
                    var1_1 = var6_12;
lbl85:
                    // 3 sources

                    com.google.android.gms.dynamite.zzb.zzb = var1_1;
                    if (var1_1 == null) break block33;
lbl87:
                    // 2 sources

                    ** synchronized (var1_1)
                }
lbl-1000:
                // 1 sources

                {
                    try {
                        var4_9 = com.google.android.gms.dynamite.zzb.zzb;
                        var2_6 = var4_9.getContextClassLoader();
                        break block33;
                    }
                    catch (Throwable var2_7) {
                        ** GOTO lbl-1000
                    }
                    catch (SecurityException var4_10) {
                        var4_10.getMessage();
                    }
                }
            }
            try {
                block35: {
                    break block35;
lbl-1000:
                    // 1 sources

                    {
                        throw var2_7;
                    }
                }
                com.google.android.gms.dynamite.zzb.zza = var2_6;
                return com.google.android.gms.dynamite.zzb.zza;
            }
            catch (Throwable var1_5) {}
            throw var1_5;
        }
    }
}

