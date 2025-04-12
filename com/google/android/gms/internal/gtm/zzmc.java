/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzmc
extends zzjo {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        var3_3 = 1;
        Preconditions.checkArgument((boolean)var3_3);
        var4_4 = var2_2 /* !! */ .length;
        var5_5 = 2;
        var6_6 = 0;
        if (var4_4 == var3_3) ** GOTO lbl9
        if (var4_4 == var5_5) {
            var4_4 = 2;
lbl9:
            // 2 sources

            var7_7 = true;
        } else {
            var7_7 = false;
            var8_8 = null;
        }
        Preconditions.checkArgument(var7_7);
        var7_7 = var2_2 /* !! */ [0] instanceof zzqz;
        Preconditions.checkArgument(var7_7);
        var8_8 = ((zzqz)var2_2 /* !! */ [0]).zzk();
        if (var4_4 == var5_5) {
            var1_1 = var2_2 /* !! */ [var3_3];
            var9_9 = zzjn.zza((zzqo)var1_1);
            var6_6 = (int)var9_9;
        }
        if (var6_6 >= 0 && var6_6 < (var3_3 = var8_8.length())) {
            var2_2 /* !! */  = String.valueOf(var8_8.charAt(var6_6));
            var1_1 = new zzqz((String)var2_2 /* !! */ );
            return var1_1;
        }
        var1_1 = new zzqz("");
        return var1_1;
    }
}

