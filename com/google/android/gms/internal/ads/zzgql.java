/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzhac;
import java.security.GeneralSecurityException;

public final class zzgql
implements zzgqq {
    private final String zza;
    private final zzgze zzb;
    private final zzhac zzc;
    private final zzgwg zzd;
    private final zzgxn zze;
    private final Integer zzf;

    private zzgql(String string2, zzgze zzgze2, zzhac zzhac2, zzgwg zzgwg2, zzgxn zzgxn2, Integer n3) {
        this.zza = string2;
        this.zzb = zzgze2;
        this.zzc = zzhac2;
        this.zzd = zzgwg2;
        this.zze = zzgxn2;
        this.zzf = n3;
    }

    public static zzgql zza(String object, zzhac zzhac2, zzgwg zzgwg2, zzgxn zzgxn2, Integer n3) {
        block7: {
            zzgql zzgql2;
            Object object2;
            block6: {
                block5: {
                    object2 = zzgxn.zzd;
                    if (zzgxn2 != object2) break block5;
                    if (n3 != null) {
                        object = new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
                        throw object;
                    }
                    break block6;
                }
                if (n3 == null) break block7;
            }
            zzgze zzgze2 = zzgra.zza((String)object);
            object2 = zzgql2;
            zzgql2 = new zzgql((String)object, zzgze2, zzhac2, zzgwg2, zzgxn2, n3);
            return zzgql2;
        }
        object = new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        throw object;
    }

    public final zzgwg zzb() {
        return this.zzd;
    }

    public final zzgxn zzc() {
        return this.zze;
    }

    public final zzgze zzd() {
        return this.zzb;
    }

    public final zzhac zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}

