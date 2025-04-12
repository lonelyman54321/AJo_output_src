/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqz;
import java.util.ArrayList;

public final class zzju
extends zzjo {
    /*
     * Unable to fully structure code
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        Preconditions.checkNotNull(var2_2);
        var3_3 = ((zzqo[])var2_2).length;
        var4_4 = null;
        var5_5 = 2;
        var6_6 = 1;
        if (var3_3 == var6_6) ** GOTO lbl10
        if (var3_3 == var5_5) {
            var3_3 = 2;
lbl10:
            // 2 sources

            var7_7 = true;
        } else {
            var7_7 = false;
            var8_8 = null;
        }
        Preconditions.checkArgument(var7_7);
        var8_8 = var2_2[0];
        var7_7 = var8_8 instanceof zzqv;
        Preconditions.checkArgument(var7_7);
        var4_4 = ((zzqv)var2_2[0]).zzk();
        var1_1 = var3_3 < var5_5 ? zzqs.zze : var2_2[var6_6];
        var2_2 = zzqs.zze;
        var1_1 = var1_1 == var2_2 ? "," : zzjn.zzd((zzqo)var1_1);
        var2_2 = new ArrayList();
        var4_4 = var4_4.iterator();
        while ((var5_5 = (int)var4_4.hasNext()) != 0) {
            var9_9 = (zzqo)var4_4.next();
            if (var9_9 != (var10_10 = zzqs.zzd) && var9_9 != (var10_10 = zzqs.zze)) {
                var9_9 = zzjn.zzd((zzqo)var9_9);
                var2_2.add(var9_9);
                continue;
            }
            var9_9 = "";
            var2_2.add(var9_9);
        }
        var1_1 = TextUtils.join((CharSequence)var1_1, (Iterable)var2_2);
        var4_4 = new zzqz((String)var1_1);
        return var4_4;
    }
}

