/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tagmanager.zzdx;

final class zzes
implements zzdx {
    private double zza;
    private long zzb;
    private final Object zzc;
    private final Clock zzd;

    public zzes() {
        Object object;
        this.zzc = object = new Object();
        this.zza = 60.0;
        this.zzd = object = DefaultClock.getInstance();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean zza() {
        block6: {
            var1_1 = this.zzc;
            // MONITORENTER : var1_1
            var2_2 = this.zzd;
            var3_4 = var2_2.currentTimeMillis();
            var5_5 = this.zza;
            var7_6 = 60.0;
            var9_7 = var5_5 == var7_6 ? 0 : (var5_5 < var7_6 ? -1 : 1);
            if (var9_7 >= 0) ** GOTO lbl21
            var10_8 = this.zzb;
            var12_9 = (double)(var10_8 = var3_4 - var10_8) / 2000.0;
            var14_10 = 0.0;
            cfr_temp_0 = var12_9 - var14_10;
            var16_11 /* !! */  = (double)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
            if (var16_11 /* !! */  <= 0) ** GOTO lbl21
            var5_5 += var12_9;
            this.zza = var5_5 = Math.min(var7_6, var5_5);
lbl21:
            // 3 sources

            this.zzb = var3_4;
            var3_4 = 0x3FF0000000000000L;
            var17_12 = 1.0;
            cfr_temp_1 = var5_5 - var17_12;
            var19_13 /* !! */  = (double)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1));
            if (var19_13 /* !! */  < 0) break block6;
            var3_4 = -4616189618054758400L;
            var17_12 = -1.0;
            var5_5 += var17_12;
            this.zza = var5_5;
            // MONITOREXIT : var1_1
            return true;
        }
        // MONITOREXIT : var1_1
        return false;
    }
}

