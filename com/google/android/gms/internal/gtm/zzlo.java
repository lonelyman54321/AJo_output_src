/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzra;
import java.util.ArrayList;
import java.util.List;

public final class zzlo
extends zzjo {
    /*
     * Unable to fully structure code
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        var3_3 = 1;
        Preconditions.checkArgument((boolean)var3_3);
        var4_4 = ((zzqo[])var2_2).length;
        var5_5 = false;
        var6_6 = null;
        var7_7 = 3;
        var8_8 = 2;
        if (var4_4 == var8_8) ** GOTO lbl11
        if (var4_4 == var7_7) {
            var4_4 = 3;
lbl11:
            // 2 sources

            var9_9 = true;
        } else {
            var9_9 = false;
            var10_10 = null;
        }
        Preconditions.checkArgument(var9_9);
        var10_10 = var2_2[var3_3];
        var9_9 = var10_10 instanceof zzqv;
        Preconditions.checkArgument(var9_9);
        if (var4_4 == var7_7) {
            var11_11 = var2_2[var8_8];
            var7_7 = var11_11 instanceof zzqv;
            Preconditions.checkArgument((boolean)var7_7);
        }
        var11_11 = new ArrayList();
        var6_6 = var2_2[0];
        var5_5 = zzjn.zzg(var6_6);
        if (var5_5) {
            var2_2 = (zzqv)var2_2[var3_3];
            var11_11 = var2_2.zzk();
        } else if (var4_4 > var8_8) {
            var2_2 = (zzqv)var2_2[var8_8];
            var11_11 = var2_2.zzk();
        }
        var1_1 = zzra.zzf((zzhx)var1_1, (List)var11_11);
        var12_12 = zzra.zzi((zzqo)var1_1);
        if (var12_12) {
            return var1_1;
        }
        return zzqs.zze;
    }
}

