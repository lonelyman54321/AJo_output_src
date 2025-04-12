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
import com.google.android.gms.internal.gtm.zzqz;
import java.util.ArrayList;

public final class zzmk
extends zzjo {
    /*
     * Unable to fully structure code
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        var3_3 = 1;
        Preconditions.checkArgument((boolean)var3_3);
        var4_4 = ((zzqo[])var2_2).length;
        var5_5 = null;
        if (var4_4 == var3_3) ** GOTO lbl9
        var6_6 = 2;
        if (var4_4 == var6_6) {
            var4_4 = 2;
lbl9:
            // 2 sources

            var6_6 = 1;
        } else {
            var6_6 = 0;
            var7_7 = null;
        }
        Preconditions.checkArgument((boolean)var6_6);
        var6_6 = var2_2[0] instanceof zzqz;
        Preconditions.checkArgument((boolean)var6_6);
        var7_7 = new ArrayList<Object>();
        if (var4_4 == var3_3) {
            var1_1 = var2_2[0];
            var7_7.add(var1_1);
        } else {
            var8_8 = ((zzqz)var2_2[0]).zzk();
            var9_9 = (var2_2 = zzjn.zzd(var2_2[var3_3])).isEmpty();
            var10_10 = var3_3 != var9_9 ? -1 : 0;
            var2_2 = var8_8.split((String)var2_2, var10_10);
            if (var9_9 == 0 || (var4_4 = ((Object)var2_2).length) <= 0 || (var4_4 = (int)(var8_8 = var2_2[0]).isEmpty()) == 0) {
                var3_3 = 0;
                var1_1 = null;
            }
            while (var3_3 < (var4_4 = ((Object)var2_2).length)) {
                var5_5 = var2_2[var3_3];
                var8_8 = new zzqz((String)var5_5);
                var7_7.add(var8_8);
                ++var3_3;
            }
        }
        var1_1 = new zzqv(var7_7);
        return var1_1;
    }
}

