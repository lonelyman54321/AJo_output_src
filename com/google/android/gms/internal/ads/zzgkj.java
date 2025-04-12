/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgki;
import com.google.android.gms.internal.ads.zzgkk;
import com.google.android.gms.internal.ads.zzgkm;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgkj {
    private Integer zza = null;
    private zzgkk zzb;

    private zzgkj() {
        zzgkk zzgkk2;
        this.zzb = zzgkk2 = zzgkk.zzc;
    }

    public /* synthetic */ zzgkj(zzgki object) {
        this.zzb = object = zzgkk.zzc;
    }

    public final zzgkj zza(int n3) {
        Integer n4;
        int n7 = 16;
        if (n3 != n7 && n3 != (n7 = 32)) {
            Object object = n3;
            Object[] objectArray = new Object[]{object};
            object = String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", objectArray);
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException((String)object);
            throw invalidAlgorithmParameterException;
        }
        this.zza = n4 = Integer.valueOf(n3);
        return this;
    }

    public final zzgkj zzb(zzgkk zzgkk2) {
        this.zzb = zzgkk2;
        return this;
    }

    public final zzgkm zzc() {
        Serializable serializable = this.zza;
        if (serializable != null) {
            Object object = this.zzb;
            if (object != null) {
                int n3 = (Integer)serializable;
                zzgkk zzgkk2 = this.zzb;
                object = new zzgkm(n3, zzgkk2, null);
                return object;
            }
            serializable = new GeneralSecurityException("Variant is not set");
            throw serializable;
        }
        serializable = new GeneralSecurityException("Key size is not set");
        throw serializable;
    }
}

