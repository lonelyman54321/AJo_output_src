/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzhi;

final class zzhy {
    private double zza;
    private long zzb;
    private final Object zzc;
    private final Clock zzd;

    public zzhy() {
        Object object;
        this.zzc = object = new Object();
        this.zza = 60.0;
        this.zzd = object = DefaultClock.getInstance();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zza() {
        var1_1 = this.zzc;
        synchronized (var1_1) {
            block8: {
                block7: {
                    try {
                        var2_2 = this.zzd;
                        var3_4 = var2_2.currentTimeMillis();
                        var5_5 = this.zza;
                        var7_6 = 60.0;
                        var9_7 = var5_5 == var7_6 ? 0 : (var5_5 < var7_6 ? -1 : 1);
                        if (var9_7 >= 0) break block7;
                    }
                    catch (Throwable var2_3) {
                        break block8;
                    }
                    {
                        var10_8 = this.zzb;
                        var10_8 = var3_4 - var10_8;
                    }
                    var12_9 = (double)var10_8 / 2000.0;
                    var14_10 = 0.0;
                    var16_11 = var12_9 == var14_10 ? 0 : (var12_9 > var14_10 ? 1 : -1);
                    if (var16_11 > 0) {
                        var5_5 += var12_9;
                        this.zza = var5_5 = Math.min(var7_6, var5_5);
                    }
                }
                this.zzb = var3_4;
                var3_4 = 0x3FF0000000000000L;
                var17_12 = 1.0;
                cfr_temp_0 = var5_5 - var17_12;
                var19_13 /* !! */  = (double)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                if (var19_13 /* !! */  < 0) ** GOTO lbl32
                var3_4 = -4616189618054758400L;
                var17_12 = -1.0;
                {
                    this.zza = var5_5 += var17_12;
                    return true;
lbl32:
                    // 1 sources

                    var2_2 = "No more tokens available.";
                    zzhi.zze((String)var2_2);
                    return false;
                }
            }
            throw var2_3;
        }
    }
}

