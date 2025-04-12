/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tagmanager.zzdx;

final class zzda
implements zzdx {
    private double zza;
    private long zzb;
    private final Object zzc;
    private final String zzd;
    private final Clock zze;

    public zzda(int n3, int n4, long l2, long l3, String string2, Clock clock) {
        double d2;
        Object object;
        this.zzc = object = new Object();
        this.zza = d2 = (double)Math.min(1, 5);
        this.zzd = "refreshing";
        this.zze = clock;
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
        block7: {
            block6: {
                var1_1 = this.zzc;
                // MONITORENTER : var1_1
                var2_2 = this.zze;
                var3_4 = var2_2.currentTimeMillis();
                var5_5 = this.zzb;
                var5_5 = var3_4 - var5_5;
                var7_6 = 5000L;
                var9_7 = 2.4703E-320;
                var11_8 = var5_5 == var7_6 ? 0 : (var5_5 < var7_6 ? -1 : 1);
                if (var11_8 >= 0) break block6;
                // MONITOREXIT : var1_1
                return false;
            }
            var9_7 = this.zza;
            var12_9 = 5.0;
            cfr_temp_0 = var9_7 - var12_9;
            var14_10 /* !! */  = (double)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
            if (var14_10 /* !! */  >= 0 || (var19_13 = (cfr_temp_1 = (var15_11 = (double)var5_5 / 900000.0) - (var17_12 = 0.0)) == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1)) <= 0) ** GOTO lbl25
            var9_7 += var15_11;
            this.zza = var9_7 = Math.min(var12_9, var9_7);
lbl25:
            // 2 sources

            this.zzb = var3_4;
            var3_4 = 0x3FF0000000000000L;
            var20_14 = 1.0;
            cfr_temp_2 = var9_7 - var20_14;
            var22_15 /* !! */  = (double)(cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
            if (var22_15 /* !! */  < 0) break block7;
            var3_4 = -4616189618054758400L;
            var20_14 = -1.0;
            var9_7 += var20_14;
            this.zza = var9_7;
            // MONITOREXIT : var1_1
            return true;
        }
        // MONITOREXIT : var1_1
        return false;
    }
}

