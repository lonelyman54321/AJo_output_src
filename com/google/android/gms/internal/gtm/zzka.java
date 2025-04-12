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

public final class zzka
extends zzjo {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        Preconditions.checkNotNull(var2_2 /* !! */ );
        var3_3 = var2_2 /* !! */ .length;
        var4_4 = 3;
        var5_5 = 1;
        var6_6 = 2;
        if (var3_3 == var6_6) ** GOTO lbl10
        if (var3_3 == var4_4) {
            var3_3 = 3;
lbl10:
            // 2 sources

            var7_7 = true;
        } else {
            var7_7 = false;
            var8_8 = null;
        }
        Preconditions.checkArgument(var7_7);
        Preconditions.checkArgument(var2_2 /* !! */ [0] instanceof zzqv);
        var7_7 = var2_2 /* !! */ [var5_5] instanceof zzqr;
        Preconditions.checkArgument(var7_7);
        var8_8 = (zzqv)var2_2 /* !! */ [0];
        var9_9 = (zzqr)var2_2 /* !! */ [var5_5];
        var10_10 = var8_8.zzk();
        var11_11 = var10_10.size();
        var12_12 = var11_11 + -1;
        if (var3_3 == var4_4) {
            var2_2 /* !! */  = var2_2 /* !! */ [var6_6];
        } else {
            block12: {
                if (var11_11 > 0) {
                    var13_13 = true;
                } else {
                    var13_13 = false;
                    var2_2 /* !! */  = null;
                }
                Preconditions.checkState(var13_13);
                var2_2 /* !! */  = var8_8.zzi(var12_12);
                var11_11 += -2;
                while (var12_12 >= 0) {
                    var3_3 = var12_12 + -1;
                    var14_14 = var8_8.zzn(var12_12);
                    if (var14_14 != 0) {
                        var2_2 /* !! */  = var8_8.zzi(var12_12);
                        break block12;
                    }
                    var12_12 = var3_3;
                }
                var3_3 = var11_11;
            }
            if (var12_12 >= 0) {
                var11_11 = 1;
            } else {
                var11_11 = 0;
                var15_15 = null;
            }
            Preconditions.checkState((boolean)var11_11);
            var12_12 = var3_3;
        }
        while (var12_12 >= 0) {
            var3_3 = (int)var8_8.zzn(var12_12);
            if (var3_3 != 0) {
                var16_16 = var9_9.zzi();
                var15_15 = (zzqo)var10_10.get(var12_12);
                var17_17 = var12_12;
                var20_19 = Double.valueOf(var17_17);
                var19_18 = new zzqq((Double)var20_19);
                var14_14 = 4;
                var20_19 = new zzqo[var14_14];
                var20_19[0] = var2_2 /* !! */ ;
                var20_19[var5_5] = var15_15;
                var20_19[var6_6] = var19_18;
                var20_19[var4_4] = var8_8;
                var2_2 /* !! */  = var16_16.zzd(var1_1, var20_19);
            }
            var12_12 += -1;
        }
        return var2_2 /* !! */ ;
    }
}

