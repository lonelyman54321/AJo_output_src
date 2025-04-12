/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzghw;
import com.google.android.gms.internal.ads.zzgib;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgou;
import com.google.android.gms.internal.ads.zzgpm;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgwh;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzhac;
import java.security.GeneralSecurityException;

public final class zzgth
implements zzghw {
    private final zzghw zza;
    private final zzgxn zzb;
    private final byte[] zzc;

    private zzgth(zzghw zzghw2, zzgxn zzgxn2, byte[] byArray) {
        this.zza = zzghw2;
        this.zzb = zzgxn2;
        this.zzc = byArray;
    }

    /*
     * Unable to fully structure code
     */
    public static zzghw zza(zzgou var0) {
        block4: {
            block3: {
                var1_1 = zzghh.zza();
                var1_1 = var0.zza((zzgic)var1_1);
                var2_2 = zzgwh.zza();
                var3_3 = var1_1.zzg();
                var2_2.zzb((String)var3_3);
                var3_3 = var1_1.zze();
                var2_2.zzc((zzhac)var3_3);
                var3_3 = var1_1.zzb();
                var2_2.zza((zzgwg)var3_3);
                var2_2 = (zzghw)zzgib.zzb((zzgwh)var2_2.zzbn(), zzghw.class);
                var1_1 = var1_1.zzc();
                var3_3 = zzgxn.zza;
                var4_4 = var1_1.ordinal();
                var5_5 = 1;
                if (var4_4 == var5_5) break block3;
                var5_5 = 2;
                if (var4_4 == var5_5) ** GOTO lbl29
                var5_5 = 3;
                if (var4_4 == var5_5) {
                    var0 = zzgpm.zza.zzc();
                } else {
                    var5_5 = 4;
                    if (var4_4 != var5_5) {
                        var0 = new GeneralSecurityException("unknown output prefix type");
                        throw var0;
                    }
lbl29:
                    // 3 sources

                    var6_6 = var0.zzb();
                    var0 = zzgpm.zza(var6_6).zzc();
                }
                break block4;
            }
            var6_7 = var0.zzb();
            var0 = zzgpm.zzb(var6_7).zzc();
        }
        var3_3 = new zzgth((zzghw)var2_2, (zzgxn)var1_1, (byte[])var0);
        return var3_3;
    }
}

