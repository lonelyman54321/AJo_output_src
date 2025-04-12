/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgka;
import com.google.android.gms.internal.ads.zzgkd;
import com.google.android.gms.internal.ads.zzgkk;
import com.google.android.gms.internal.ads.zzgkm;
import com.google.android.gms.internal.ads.zzgpm;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;

public final class zzgkb {
    private zzgkm zza = null;
    private zzgzf zzb = null;
    private Integer zzc = null;

    private zzgkb() {
    }

    public /* synthetic */ zzgkb(zzgka zzgka2) {
    }

    public final zzgkb zza(Integer n3) {
        this.zzc = n3;
        return this;
    }

    public final zzgkb zzb(zzgzf zzgzf2) {
        this.zzb = zzgzf2;
        return this;
    }

    public final zzgkb zzc(zzgkm zzgkm2) {
        this.zza = zzgkm2;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzgkd zzd() {
        Object object;
        Object object2 = this.zza;
        if (object2 != null && (object = this.zzb) != null) {
            int n3;
            int n4 = ((zzgkm)object2).zzb();
            if (n4 != (n3 = ((zzgzf)object).zza())) {
                object2 = new GeneralSecurityException("Key size mismatch");
                throw object2;
            }
            int n7 = ((zzgkm)object2).zza();
            if (n7 != 0 && (object2 = this.zzc) == null) {
                object2 = new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                throw object2;
            }
            object2 = this.zza;
            n7 = ((zzgkm)object2).zza();
            if (n7 == 0 && (object2 = this.zzc) != null) {
                object2 = new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                throw object2;
            }
            object2 = this.zza.zzd();
            if (object2 == (object = zzgkk.zzc)) {
                object2 = zzgpm.zza;
            } else {
                object2 = this.zza.zzd();
                if (object2 == (object = zzgkk.zzb)) {
                    n7 = this.zzc;
                    object2 = zzgpm.zza(n7);
                } else {
                    object2 = this.zza.zzd();
                    if (object2 != (object = zzgkk.zza)) {
                        object = String.valueOf(this.zza.zzd());
                        object = "Unknown AesGcmSivParameters.Variant: ".concat((String)object);
                        object2 = new IllegalStateException((String)object);
                        throw object2;
                    }
                    n7 = this.zzc;
                    object2 = zzgpm.zzb(n7);
                }
            }
            Object object3 = object2;
            zzgkm zzgkm2 = this.zza;
            zzgzf zzgzf2 = this.zzb;
            Integer n8 = this.zzc;
            object = object2;
            return new zzgkd(zzgkm2, zzgzf2, (zzgze)object3, n8, null);
        }
        object2 = new GeneralSecurityException("Cannot build without parameters and/or key material");
        throw object2;
    }
}

