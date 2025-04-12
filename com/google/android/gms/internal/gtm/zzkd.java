/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqv;
import java.util.ArrayList;

public final class zzkd
extends zzjo {
    /*
     * Unable to fully structure code
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        Preconditions.checkNotNull(var2_2);
        var3_3 = ((zzqo[])var2_2).length;
        var4_4 = 1;
        var5_5 = 3;
        var6_6 = 2;
        if (var3_3 == var6_6) ** GOTO lbl10
        if (var3_3 == var5_5) {
            var3_3 = 3;
lbl10:
            // 2 sources

            var7_7 = true;
        } else {
            var7_7 = false;
            var8_8 = null;
        }
        Preconditions.checkArgument(var7_7);
        var7_7 = var2_2[0] instanceof zzqv;
        Preconditions.checkArgument(var7_7);
        var8_8 = (zzqv)var2_2[0];
        var9_9 = var2_2[var4_4];
        var10_10 = zzjn.zza(var9_9);
        var4_4 = (int)var10_10;
        if (var4_4 < 0) {
            var12_11 = var8_8.zzk();
            var13_12 = var12_11.size() + var4_4;
            var4_4 = Math.max(var13_12, 0);
        } else {
            var12_11 = var8_8.zzk();
            var13_12 = var12_11.size();
            var4_4 = Math.min(var4_4, var13_12);
        }
        var12_11 = var8_8.zzk();
        var13_12 = var12_11.size();
        if (var3_3 == var5_5) {
            var1_1 = var2_2[var6_6];
            var14_13 = zzjn.zza((zzqo)var1_1);
            var3_3 = (int)var14_13;
            if (var3_3 < 0) {
                var2_2 = var8_8.zzk();
                var16_14 = var2_2.size() + var3_3;
                var13_12 = Math.max(var16_14, 0);
            } else {
                var2_2 = var8_8.zzk();
                var16_15 = var2_2.size();
                var13_12 = Math.min(var3_3, var16_15);
            }
        }
        var3_3 = Math.max(var4_4, var13_12);
        var1_1 = var8_8.zzk().subList(var4_4, var3_3);
        var17_16 = new ArrayList<E>(var1_1);
        var2_2 = new zzqv(var17_16);
        return var2_2;
    }
}

