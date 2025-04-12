/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgjn;
import com.google.android.gms.internal.ads.zzgjq;
import com.google.android.gms.internal.ads.zzgjx;
import com.google.android.gms.internal.ads.zzgjz;
import com.google.android.gms.internal.ads.zzgpm;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;

public final class zzgjo {
    private zzgjz zza = null;
    private zzgzf zzb = null;
    private Integer zzc = null;

    private zzgjo() {
    }

    public /* synthetic */ zzgjo(zzgjn zzgjn2) {
    }

    public final zzgjo zza(Integer n3) {
        this.zzc = n3;
        return this;
    }

    public final zzgjo zzb(zzgzf zzgzf2) {
        this.zzb = zzgzf2;
        return this;
    }

    public final zzgjo zzc(zzgjz zzgjz2) {
        this.zza = zzgjz2;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzgjq zzd() {
        Object object;
        Object object2 = this.zza;
        if (object2 != null && (object = this.zzb) != null) {
            int n3;
            int n4 = ((zzgjz)object2).zzb();
            if (n4 != (n3 = ((zzgzf)object).zza())) {
                object2 = new GeneralSecurityException("Key size mismatch");
                throw object2;
            }
            int n7 = ((zzgjz)object2).zza();
            if (n7 != 0 && (object2 = this.zzc) == null) {
                object2 = new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                throw object2;
            }
            object2 = this.zza;
            n7 = ((zzgjz)object2).zza();
            if (n7 == 0 && (object2 = this.zzc) != null) {
                object2 = new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                throw object2;
            }
            object2 = this.zza.zzd();
            if (object2 == (object = zzgjx.zzc)) {
                object2 = zzgpm.zza;
            } else {
                object2 = this.zza.zzd();
                if (object2 == (object = zzgjx.zzb)) {
                    n7 = this.zzc;
                    object2 = zzgpm.zza(n7);
                } else {
                    object2 = this.zza.zzd();
                    if (object2 != (object = zzgjx.zza)) {
                        object = String.valueOf(this.zza.zzd());
                        object = "Unknown AesGcmParameters.Variant: ".concat((String)object);
                        object2 = new IllegalStateException((String)object);
                        throw object2;
                    }
                    n7 = this.zzc;
                    object2 = zzgpm.zzb(n7);
                }
            }
            Object object3 = object2;
            zzgjz zzgjz2 = this.zza;
            zzgzf zzgzf2 = this.zzb;
            Integer n8 = this.zzc;
            object = object2;
            return new zzgjq(zzgjz2, zzgzf2, (zzgze)object3, n8, null);
        }
        object2 = new GeneralSecurityException("Cannot build without parameters and/or key material");
        throw object2;
    }
}

