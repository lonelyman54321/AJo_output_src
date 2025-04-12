/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgjv;
import com.google.android.gms.internal.ads.zzgjx;
import com.google.android.gms.internal.ads.zzgjz;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgjw {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgjx zzd;

    private zzgjw() {
        zzgjx zzgjx2;
        this.zzd = zzgjx2 = zzgjx.zzc;
    }

    public /* synthetic */ zzgjw(zzgjv object) {
        this.zzd = object = zzgjx.zzc;
    }

    public final zzgjw zza(int n3) {
        Integer n4;
        this.zzb = n4 = Integer.valueOf(12);
        return this;
    }

    public final zzgjw zzb(int n3) {
        Integer n4;
        int n7 = 16;
        if (n3 != n7 && n3 != (n7 = 24) && n3 != (n7 = 32)) {
            Object object = n3;
            Object[] objectArray = new Object[]{object};
            object = String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", objectArray);
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException((String)object);
            throw invalidAlgorithmParameterException;
        }
        this.zza = n4 = Integer.valueOf(n3);
        return this;
    }

    public final zzgjw zzc(int n3) {
        Integer n4;
        this.zzc = n4 = Integer.valueOf(16);
        return this;
    }

    public final zzgjw zzd(zzgjx zzgjx2) {
        this.zzd = zzgjx2;
        return this;
    }

    public final zzgjz zze() {
        Serializable serializable = this.zza;
        if (serializable != null) {
            Object object = this.zzd;
            if (object != null) {
                object = this.zzb;
                if (object != null) {
                    object = this.zzc;
                    if (object != null) {
                        int n3 = (Integer)serializable;
                        this.zzb.getClass();
                        this.zzc.getClass();
                        zzgjx zzgjx2 = this.zzd;
                        object = new zzgjz(n3, 12, 16, zzgjx2, null);
                        return object;
                    }
                    serializable = new GeneralSecurityException("Tag size is not set");
                    throw serializable;
                }
                serializable = new GeneralSecurityException("IV size is not set");
                throw serializable;
            }
            serializable = new GeneralSecurityException("Variant is not set");
            throw serializable;
        }
        serializable = new GeneralSecurityException("Key size is not set");
        throw serializable;
    }
}

