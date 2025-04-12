/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcot;
import com.google.android.gms.internal.ads.zzdxw;
import com.google.android.gms.internal.ads.zzdya;
import java.util.Map;

public final class zzcoz
implements zzcot {
    private final zzdya zza;

    public zzcoz(zzdya zzdya2) {
        this.zza = zzdya2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza(Map var1_1) {
        block6: {
            block5: {
                var2_2 /* !! */  = "gesture";
                var3_3 = TextUtils.isEmpty((CharSequence)(var1_1 = (String)var1_1.get(var2_2 /* !! */ )));
                if (var3_3 != 0) {
                    return;
                }
                var3_3 = var1_1.hashCode();
                var4_4 = 97520651;
                var5_5 = 1;
                if (var3_3 == var4_4) break block5;
                var4_4 = 109399814;
                if (var3_3 != var4_4 || (var6_6 = (int)var1_1.equals(var2_2 /* !! */  = "shake")) == 0) ** GOTO lbl-1000
                var6_6 = 0;
                var1_1 = null;
                break block6;
            }
            var2_2 /* !! */  = "flick";
            var6_6 = var1_1.equals(var2_2 /* !! */ );
            if (var6_6 != 0) {
                var6_6 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var6_6 = -1;
            }
        }
        if (var6_6 != 0) {
            if (var6_6 != var5_5) {
                var1_1 = this.zza;
                var2_2 /* !! */  = zzdxw.zza;
                var1_1.zzm((zzdxw)var2_2 /* !! */ );
                return;
            }
            var1_1 = this.zza;
            var2_2 /* !! */  = zzdxw.zzc;
            var1_1.zzm((zzdxw)var2_2 /* !! */ );
            return;
        }
        var1_1 = this.zza;
        var2_2 /* !! */  = zzdxw.zzb;
        var1_1.zzm((zzdxw)var2_2 /* !! */ );
    }
}

