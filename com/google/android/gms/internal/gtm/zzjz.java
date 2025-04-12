/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqr;
import com.google.android.gms.internal.gtm.zzqv;

public final class zzjz
extends zzjo {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        var3_3 /* !! */  = var2_2;
        Preconditions.checkNotNull(var2_2);
        var4_4 = var2_2.length;
        var5_5 = 3;
        var6_6 = 1;
        var7_7 = 2;
        if (var4_4 == var7_7) ** GOTO lbl11
        if (var4_4 == var5_5) {
            var4_4 = 3;
lbl11:
            // 2 sources

            var8_8 = true;
        } else {
            var8_8 = false;
            var9_9 = null;
        }
        Preconditions.checkArgument(var8_8);
        Preconditions.checkArgument(var3_3 /* !! */ [0] instanceof zzqv);
        var8_8 = var3_3 /* !! */ [var6_6] instanceof zzqr;
        Preconditions.checkArgument(var8_8);
        var9_9 = (zzqv)var3_3 /* !! */ [0];
        var10_10 = (zzqr)var3_3 /* !! */ [var6_6];
        var11_11 = var9_9.zzk();
        var12_12 = var11_11.size();
        if (var4_4 == var5_5) {
            var3_3 /* !! */  = var3_3 /* !! */ [var7_7];
            var13_13 = 0;
        } else {
            block13: {
                if (var12_12 > 0) {
                    var14_14 = true;
                } else {
                    var14_14 = false;
                    var3_3 /* !! */  = null;
                }
                Preconditions.checkState(var14_14);
                var3_3 /* !! */  = var9_9.zzi(0);
                var4_4 = 0;
                var15_15 = null;
                while (var4_4 < var12_12) {
                    var13_13 = var4_4 + 1;
                    var16_16 = var9_9.zzn(var4_4);
                    if (var16_16) {
                        var3_3 /* !! */  = var9_9.zzi(var4_4);
                        break block13;
                    }
                    var4_4 = var13_13;
                }
                var13_13 = 1;
            }
            if (var4_4 < var12_12) {
                var4_4 = 1;
            } else {
                var4_4 = 0;
                var15_15 = null;
            }
            Preconditions.checkState((boolean)var4_4);
        }
        while (var13_13 < var12_12 && var13_13 < (var4_4 = (var15_15 = var9_9.zzk()).size())) {
            var4_4 = (int)var9_9.zzn(var13_13);
            if (var4_4 != 0) {
                var15_15 = var10_10.zzi();
                var17_17 = (zzqo)var11_11.get(var13_13);
                var18_18 = var13_13;
                var21_20 = Double.valueOf(var18_18);
                var20_19 = new zzqq((Double)var21_20);
                var22_21 = 4;
                var21_20 = new zzqo[var22_21];
                var21_20[0] = var3_3 /* !! */ ;
                var21_20[var6_6] = var17_17;
                var21_20[var7_7] = var20_19;
                var21_20[var5_5] = var9_9;
                var17_17 = var1_1;
                var3_3 /* !! */  = var15_15.zzd(var1_1, var21_20);
            } else {
                var17_17 = var1_1;
            }
            var13_13 += var6_6;
        }
        return var3_3 /* !! */ ;
    }
}

