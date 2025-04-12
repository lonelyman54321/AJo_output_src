/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfme;
import com.google.android.gms.internal.ads.zzfmm;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfmw;
import com.google.android.gms.internal.ads.zzfnc;
import com.google.android.gms.internal.ads.zzfnr;

public final class zzfmb {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static zzfmc zza(Context var0, zzfmu var1_1) {
        block5: {
            var2_2 = zzfmq.zza();
            if (var2_2 == 0) break block5;
            var3_3 = zzfmu.zza;
            var2_2 = var1_1.ordinal();
            if (var2_2 == (var4_4 = 4) || var2_2 == (var4_4 = 5)) ** GOTO lbl-1000
            var4_4 = 6;
            if (var2_2 == var4_4 || var2_2 == (var4_4 = 18) || var2_2 == (var4_4 = 20) || var2_2 == (var4_4 = 23) || var2_2 == (var4_4 = 31) || var2_2 == (var4_4 = 32)) ** GOTO lbl20
            var4_4 = 39;
            if (var2_2 == var4_4 || var2_2 == (var4_4 = 40)) ** GOTO lbl17
            switch (var2_2) {
                default: {
                    break block5;
                }
                case 13: {
                    var3_3 = (Boolean)zzbgd.zzb.zze();
                    var2_2 = (int)var3_3.booleanValue();
                    break;
                }
lbl17:
                // 1 sources

                var3_3 = (Boolean)zzbgd.zze.zze();
                var2_2 = (int)var3_3.booleanValue();
                break;
lbl20:
                // 1 sources

                var3_3 = (Boolean)zzbgd.zzd.zze();
                var2_2 = (int)var3_3.booleanValue();
                break;
                case 14: 
                case 15: 
                case 16: lbl-1000:
                // 2 sources

                {
                    var3_3 = (Boolean)zzbgd.zzc.zze();
                    var2_2 = (int)var3_3.booleanValue();
                }
            }
            if (var2_2 != 0) {
                var3_3 = new zzfme(var0 /* !! */ , var1_1);
                return var3_3;
            }
        }
        var0 /* !! */  = new zzfnr();
        return var0 /* !! */ ;
    }

    public static zzfmc zzb(Context object, zzfmu object2, zzfmw zzfmw2, zzl zzl2) {
        boolean bl2 = (object = zzfmb.zza(object, (zzfmu)object2)) instanceof zzfme;
        if (bl2) {
            ((zzfmc)object).zzj();
            ((zzfmc)object).zzd(zzfmw2);
            object2 = zzp.zza(zzl2.zzm);
            ((zzfmc)object).zzg((zzfnc)object2);
            object2 = zzl2.zzp;
            bl2 = zzfmm.zzf((String)object2);
            if (bl2) {
                object2 = zzl2.zzp;
                ((zzfmc)object).zzf((String)object2);
            }
        }
        return (zzfmc)object;
    }
}

