/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgin;
import com.google.android.gms.internal.ads.zzgiq;
import com.google.android.gms.internal.ads.zzgiy;
import com.google.android.gms.internal.ads.zzgja;
import com.google.android.gms.internal.ads.zzgpm;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;

public final class zzgio {
    private zzgja zza = null;
    private zzgzf zzb = null;
    private zzgzf zzc = null;
    private Integer zzd = null;

    private zzgio() {
    }

    public /* synthetic */ zzgio(zzgin zzgin2) {
    }

    public final zzgio zza(zzgzf zzgzf2) {
        this.zzb = zzgzf2;
        return this;
    }

    public final zzgio zzb(zzgzf zzgzf2) {
        this.zzc = zzgzf2;
        return this;
    }

    public final zzgio zzc(Integer n3) {
        this.zzd = n3;
        return this;
    }

    public final zzgio zzd(zzgja zzgja2) {
        this.zza = zzgja2;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzgiq zze() {
        Object object;
        Object object2 = this.zza;
        if (object2 == null) {
            object2 = new GeneralSecurityException("Cannot build without parameters");
            throw object2;
        }
        Object object3 = this.zzb;
        if (object3 != null && (object = this.zzc) != null) {
            int n3;
            int n4 = ((zzgja)object2).zzb();
            if (n4 != (n3 = ((zzgzf)object3).zza())) {
                object2 = new GeneralSecurityException("AES key size mismatch");
                throw object2;
            }
            int n7 = ((zzgja)object2).zzc();
            if (n7 != (n3 = ((zzgzf)(object3 = this.zzc)).zza())) {
                object2 = new GeneralSecurityException("HMAC key size mismatch");
                throw object2;
            }
            object2 = this.zza;
            n7 = (int)(((zzgja)object2).zza() ? 1 : 0);
            if (n7 != 0 && (object2 = this.zzd) == null) {
                object2 = new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                throw object2;
            }
            object2 = this.zza;
            n7 = (int)(((zzgja)object2).zza() ? 1 : 0);
            if (n7 == 0 && (object2 = this.zzd) != null) {
                object2 = new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                throw object2;
            }
            object2 = this.zza.zzh();
            if (object2 == (object3 = zzgiy.zzc)) {
                object2 = zzgpm.zza;
            } else {
                object2 = this.zza.zzh();
                if (object2 == (object3 = zzgiy.zzb)) {
                    n7 = this.zzd;
                    object2 = zzgpm.zza(n7);
                } else {
                    object2 = this.zza.zzh();
                    if (object2 != (object3 = zzgiy.zza)) {
                        object3 = String.valueOf(this.zza.zzh());
                        object3 = "Unknown AesCtrHmacAeadParameters.Variant: ".concat((String)object3);
                        object2 = new IllegalStateException((String)object3);
                        throw object2;
                    }
                    n7 = this.zzd;
                    object2 = zzgpm.zzb(n7);
                }
            }
            Object object4 = object2;
            object = this.zza;
            zzgzf zzgzf2 = this.zzb;
            zzgzf zzgzf3 = this.zzc;
            Integer n8 = this.zzd;
            object3 = object2;
            return new zzgiq((zzgja)object, zzgzf2, zzgzf3, (zzgze)object4, n8, null);
        }
        object2 = new GeneralSecurityException("Cannot build without key material");
        throw object2;
    }
}

