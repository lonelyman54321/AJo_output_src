/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzgib;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgou;
import com.google.android.gms.internal.ads.zzgpm;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgwh;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzhac;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzgns
implements zzggy {
    private final zzggy zza;
    private final byte[] zzb;

    private zzgns(zzggy object, byte[] byArray) {
        int n3;
        this.zza = object;
        int n4 = byArray.length;
        if (n4 != 0 && n4 != (n3 = 5)) {
            object = new IllegalArgumentException("identifier has an invalid length");
            throw object;
        }
        this.zzb = byArray;
    }

    /*
     * Unable to fully structure code
     */
    public static zzggy zzb(zzgou var0) {
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
                var2_2 = (zzggy)zzgib.zzb((zzgwh)var2_2.zzbn(), zzggy.class);
                var1_1 = var1_1.zzc();
                var3_3 = zzgxn.zza;
                var4_4 = var1_1.ordinal();
                var5_5 = 1;
                if (var4_4 == var5_5) break block3;
                var5_5 = 2;
                if (var4_4 == var5_5) ** GOTO lbl31
                var5_5 = 3;
                if (var4_4 == var5_5) {
                    var0 = zzgpm.zza.zzc();
                } else {
                    var5_5 = 4;
                    if (var4_4 != var5_5) {
                        var1_1 = String.valueOf(var1_1);
                        var1_1 = "unknown output prefix type ".concat((String)var1_1);
                        var0 = new GeneralSecurityException((String)var1_1);
                        throw var0;
                    }
lbl31:
                    // 3 sources

                    var6_6 = var0.zzb();
                    var0 = zzgpm.zza(var6_6).zzc();
                }
                break block4;
            }
            var6_7 = var0.zzb();
            var0 = zzgpm.zzb(var6_7).zzc();
        }
        var1_1 = new zzgns((zzggy)var2_2, (byte[])var0);
        return var1_1;
    }

    public static zzggy zzc(zzggy zzggy2, zzgze object) {
        object = ((zzgze)object).zzc();
        zzgns zzgns2 = new zzgns(zzggy2, (byte[])object);
        return zzgns2;
    }

    public final byte[] zza(byte[] object, byte[] byArray) {
        Object object2 = this.zzb;
        int n3 = ((byte[])object2).length;
        if (n3 == 0) {
            return this.zza.zza((byte[])object, byArray);
        }
        boolean bl2 = zzgra.zzc(object2, object);
        if (bl2) {
            object2 = this.zza;
            n3 = ((byte[])object).length;
            object = Arrays.copyOfRange(object, 5, n3);
            return object2.zza((byte[])object, byArray);
        }
        object = new GeneralSecurityException;
        object("wrong prefix");
        throw object;
    }
}

