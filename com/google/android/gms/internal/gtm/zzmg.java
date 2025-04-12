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
import com.google.android.gms.internal.gtm.zzqz;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class zzmg
extends zzjo {
    /*
     * Unable to fully structure code
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        var3_3 = 1;
        Preconditions.checkArgument((boolean)var3_3);
        var4_4 = ((zzqo[])var2_2).length;
        var5_5 = null;
        var6_6 = 2;
        if (var4_4 == var3_3) ** GOTO lbl9
        if (var4_4 == var6_6) {
            var4_4 = 2;
lbl9:
            // 2 sources

            var7_7 = true;
        } else {
            var7_7 = false;
            var8_8 = null;
        }
        Preconditions.checkArgument(var7_7);
        var8_8 = var2_2[0];
        var7_7 = var8_8 instanceof zzqz;
        Preconditions.checkArgument(var7_7);
        var5_5 = ((zzqz)var2_2[0]).zzk();
        var1_1 = var4_4 < var6_6 ? "" : zzjn.zzd(var2_2[var3_3]);
        var1_1 = Pattern.compile((String)var1_1).matcher(var5_5);
        var9_9 = var1_1.find();
        if (var9_9) {
            var2_2 = new ArrayList();
            var1_1 = var1_1.group();
            var10_10 = new zzqz((String)var1_1);
            var2_2.add(var10_10);
            var1_1 = new zzqv((List)var2_2);
            return var1_1;
        }
        return zzqs.zzd;
    }
}

