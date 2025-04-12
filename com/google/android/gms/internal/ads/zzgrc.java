/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgpm;
import com.google.android.gms.internal.ads.zzgrb;
import com.google.android.gms.internal.ads.zzgre;
import com.google.android.gms.internal.ads.zzgrl;
import com.google.android.gms.internal.ads.zzgrn;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;

public final class zzgrc {
    private zzgrn zza = null;
    private zzgzf zzb = null;
    private Integer zzc = null;

    private zzgrc() {
    }

    public /* synthetic */ zzgrc(zzgrb zzgrb2) {
    }

    public final zzgrc zza(zzgzf zzgzf2) {
        this.zzb = zzgzf2;
        return this;
    }

    public final zzgrc zzb(Integer n3) {
        this.zzc = n3;
        return this;
    }

    public final zzgrc zzc(zzgrn zzgrn2) {
        this.zza = zzgrn2;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzgre zzd() {
        Object object;
        Object object2 = this.zza;
        if (object2 != null && (object = this.zzb) != null) {
            int n3;
            int n4 = ((zzgrn)object2).zzc();
            if (n4 != (n3 = ((zzgzf)object).zza())) {
                object2 = new GeneralSecurityException("Key size mismatch");
                throw object2;
            }
            int n7 = ((zzgrn)object2).zza();
            if (n7 != 0 && (object2 = this.zzc) == null) {
                object2 = new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                throw object2;
            }
            object2 = this.zza;
            n7 = ((zzgrn)object2).zza();
            if (n7 == 0 && (object2 = this.zzc) != null) {
                object2 = new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                throw object2;
            }
            object2 = this.zza.zzf();
            if (object2 == (object = zzgrl.zzd)) {
                object2 = zzgpm.zza;
            } else {
                object2 = this.zza.zzf();
                if (object2 != (object = zzgrl.zzc) && (object2 = this.zza.zzf()) != (object = zzgrl.zzb)) {
                    object2 = this.zza.zzf();
                    if (object2 != (object = zzgrl.zza)) {
                        object = String.valueOf(this.zza.zzf());
                        object = "Unknown AesCmacParametersParameters.Variant: ".concat((String)object);
                        object2 = new IllegalStateException((String)object);
                        throw object2;
                    }
                    n7 = this.zzc;
                    object2 = zzgpm.zzb(n7);
                } else {
                    n7 = this.zzc;
                    object2 = zzgpm.zza(n7);
                }
            }
            Object object3 = object2;
            zzgrn zzgrn2 = this.zza;
            zzgzf zzgzf2 = this.zzb;
            Integer n8 = this.zzc;
            object = object2;
            return new zzgre(zzgrn2, zzgzf2, (zzgze)object3, n8, null);
        }
        object2 = new GeneralSecurityException("Cannot build without parameters and/or key material");
        throw object2;
    }
}

