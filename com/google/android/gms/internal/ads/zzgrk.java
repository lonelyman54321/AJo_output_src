/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgrj;
import com.google.android.gms.internal.ads.zzgrl;
import com.google.android.gms.internal.ads.zzgrn;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgrk {
    private Integer zza = null;
    private Integer zzb = null;
    private zzgrl zzc;

    private zzgrk() {
        zzgrl zzgrl2;
        this.zzc = zzgrl2 = zzgrl.zzd;
    }

    public /* synthetic */ zzgrk(zzgrj object) {
        this.zzc = object = zzgrl.zzd;
    }

    public final zzgrk zza(int n3) {
        Integer n4;
        int n7 = 16;
        if (n3 != n7 && n3 != (n7 = 32)) {
            Object object = n3 *= 8;
            Object[] objectArray = new Object[]{object};
            object = String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", objectArray);
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException((String)object);
            throw invalidAlgorithmParameterException;
        }
        this.zza = n4 = Integer.valueOf(n3);
        return this;
    }

    public final zzgrk zzb(int n3) {
        int n4 = 10;
        if (n3 >= n4 && n3 <= (n4 = 16)) {
            Integer n7;
            this.zzb = n7 = Integer.valueOf(n3);
            return this;
        }
        String string2 = hj0_0.a(n3, "Invalid tag size for AesCmacParameters: ");
        GeneralSecurityException generalSecurityException = new GeneralSecurityException(string2);
        throw generalSecurityException;
    }

    public final zzgrk zzc(zzgrl zzgrl2) {
        this.zzc = zzgrl2;
        return this;
    }

    public final zzgrn zzd() {
        Serializable serializable = this.zza;
        if (serializable != null) {
            Object object = this.zzb;
            if (object != null) {
                object = this.zzc;
                if (object != null) {
                    int n3 = (Integer)serializable;
                    int n4 = this.zzb;
                    zzgrl zzgrl2 = this.zzc;
                    object = new zzgrn(n3, n4, zzgrl2, null);
                    return object;
                }
                serializable = new GeneralSecurityException("variant not set");
                throw serializable;
            }
            serializable = new GeneralSecurityException("tag size not set");
            throw serializable;
        }
        serializable = new GeneralSecurityException("key size not set");
        throw serializable;
    }
}

