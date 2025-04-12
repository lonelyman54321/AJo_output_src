/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqp;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class zzor
extends zzjo {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        var3_3 = true;
        Preconditions.checkArgument(var3_3);
        var4_4 = var2_2 /* !! */ .length;
        var5_5 = null;
        var6_6 = 3;
        var7_7 = 2;
        if (var4_4 == var7_7) ** GOTO lbl10
        if (var4_4 == var6_6) {
            var4_4 = 3;
lbl10:
            // 2 sources

            var8_8 = 1;
        } else {
            var8_8 = 0;
        }
        Preconditions.checkArgument((boolean)var8_8);
        var5_5 = zzjn.zzd(var2_2 /* !! */ [0]);
        var1_1 = zzjn.zzd(var2_2 /* !! */ [var3_3]);
        var8_8 = 64;
        if (var4_4 >= var6_6 && (var10_10 = (var9_9 = "true").equalsIgnoreCase((String)(var2_2 /* !! */  = zzjn.zzd(var2_2 /* !! */ [var7_7]))))) {
            var8_8 = 66;
        }
        try {
            var1_1 = Pattern.compile((String)var1_1, var8_8);
        }
        catch (PatternSyntaxException v0) {
            var2_2 /* !! */  = Boolean.FALSE;
            var1_1 = new zzqp((Boolean)var2_2 /* !! */ );
            return var1_1;
        }
        var1_1 = var1_1.matcher(var5_5);
        var3_3 = var1_1.find();
        var1_1 = var3_3;
        var2_2 /* !! */  = new zzqp((Boolean)var1_1);
        return var2_2 /* !! */ ;
    }
}

