/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzmf
extends zzjo {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        var3_3 = 1;
        Preconditions.checkArgument((boolean)var3_3);
        var4_4 = var2_2 /* !! */ .length;
        var5_5 = null;
        var6_6 = 3;
        var7_7 = 2;
        if (var4_4 == var7_7) ** GOTO lbl10
        if (var4_4 == var6_6) {
            var4_4 = 3;
lbl10:
            // 2 sources

            var8_8 = true;
        } else {
            var8_8 = false;
            var9_9 = null;
        }
        Preconditions.checkArgument(var8_8);
        var9_9 = var2_2 /* !! */ [0];
        var8_8 = var9_9 instanceof zzqz;
        Preconditions.checkArgument(var8_8);
        var5_5 = ((zzqz)var2_2 /* !! */ [0]).zzk();
        var1_1 = zzjn.zzd(var2_2 /* !! */ [var3_3]);
        var10_10 = 1.0 / 0.0;
        if (var4_4 == var6_6 && (var4_4 = (int)Double.isNaN(var13_12 = zzjn.zzb(var12_11 = var2_2 /* !! */ [var7_7]))) == 0) {
            var2_2 /* !! */  = var2_2 /* !! */ [var7_7];
            var10_10 = zzjn.zza((zzqo)var2_2 /* !! */ );
        }
        var15_13 = Math.max(var10_10, 0.0);
        var10_10 = var5_5.length();
        var17_14 = (int)Math.min(var15_13, var10_10);
        var1_1 = (double)var5_5.lastIndexOf((String)var1_1, var17_14);
        var12_11 = new zzqq((Double)var1_1);
        return var12_11;
    }
}

