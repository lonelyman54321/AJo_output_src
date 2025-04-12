/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzen;

public final class zzem {
    private double zza;
    private long zzb;
    private final Object zzc;
    private final String zzd;
    private final Clock zze;

    public zzem(int n3, long l2, String string2, Clock clock) {
        Object object;
        this.zzc = object = new Object();
        this.zza = 60.0;
        this.zzd = "tracking";
        this.zze = clock;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zza() {
        var1_1 = "Excessive ";
        var2_3 = this.zzc;
        synchronized (var2_3) {
            block8: {
                block7: {
                    try {
                        var3_4 = this.zze;
                        var4_5 = var3_4.currentTimeMillis();
                        var6_6 = this.zza;
                        var8_7 = 60.0;
                        var10_8 = var6_6 == var8_7 ? 0 : (var6_6 < var8_7 ? -1 : 1);
                        if (var10_8 >= 0) break block7;
                    }
                    catch (Throwable var1_2) {
                        break block8;
                    }
                    {
                        var11_9 = this.zzb;
                        var11_9 = var4_5 - var11_9;
                    }
                    var13_10 = (double)var11_9 / 2000.0;
                    var15_11 = 0.0;
                    var17_12 = var13_10 == var15_11 ? 0 : (var13_10 > var15_11 ? 1 : -1);
                    if (var17_12 > 0) {
                        var6_6 += var13_10;
                        this.zza = var6_6 = Math.min(var8_7, var6_6);
                    }
                }
                this.zzb = var4_5;
                var4_5 = 0x3FF0000000000000L;
                var18_13 = 1.0;
                cfr_temp_0 = var6_6 - var18_13;
                var20_14 /* !! */  = (double)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                if (var20_14 /* !! */  < 0) ** GOTO lbl33
                var4_5 = -4616189618054758400L;
                var18_13 = -1.0;
                {
                    this.zza = var6_6 += var18_13;
                    return true;
lbl33:
                    // 1 sources

                    var3_4 = this.zzd;
                    var21_15 = new StringBuilder(var1_1);
                    var21_15.append((String)var3_4);
                    var1_1 = " detected; call ignored.";
                    var21_15.append(var1_1);
                    var1_1 = var21_15.toString();
                    zzen.zze(var1_1);
                    return false;
                }
            }
            throw var1_2;
        }
    }
}

