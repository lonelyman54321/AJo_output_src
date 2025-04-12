/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzkf;
import com.google.android.gms.internal.gtm.zzkg;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqr;
import com.google.android.gms.internal.gtm.zzqv;
import java.util.Collections;

public final class zzki
extends zzjo {
    /*
     * Unable to fully structure code
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        Preconditions.checkNotNull(var2_2);
        var3_3 = var2_2.length;
        var4_4 = 2;
        var5_5 = 1;
        if (var3_3 == var5_5) ** GOTO lbl9
        if (var3_3 == var4_4) {
            var3_3 = 2;
lbl9:
            // 2 sources

            var6_6 = true;
        } else {
            var6_6 = false;
            var7_7 = null;
        }
        Preconditions.checkArgument(var6_6);
        var6_6 = var2_2[0] instanceof zzqv;
        Preconditions.checkArgument(var6_6);
        var7_7 = (zzqv)var2_2[0];
        if (var3_3 == var4_4) {
            var3_3 = var2_2[var5_5] instanceof zzqr;
            Preconditions.checkArgument((boolean)var3_3);
            var8_8 = (zzqr)var2_2[var5_5];
        } else {
            var5_5 = 0;
            var10_10 = null;
            var9_9 = new zzkg(null);
            var8_8 = new zzqr((zzjm)var9_9);
        }
        var9_9 = var7_7.zzk();
        var10_10 = new zzkf(this, var8_8, var1_1);
        Collections.sort(var9_9, var10_10);
        return var2_2[0];
    }
}

