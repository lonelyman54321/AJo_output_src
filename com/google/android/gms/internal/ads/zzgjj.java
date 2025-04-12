/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgji;
import com.google.android.gms.internal.ads.zzgjk;
import com.google.android.gms.internal.ads.zzgjm;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgjj {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgjk zzd;

    private zzgjj() {
        zzgjk zzgjk2;
        this.zzd = zzgjk2 = zzgjk.zzc;
    }

    public /* synthetic */ zzgjj(zzgji object) {
        this.zzd = object = zzgjk.zzc;
    }

    public final zzgjj zza(int n3) {
        Integer n4;
        int n7 = 12;
        if (n3 != n7 && n3 != (n7 = 16)) {
            Object object = n3;
            Object[] objectArray = new Object[]{object};
            object = String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", objectArray);
            GeneralSecurityException generalSecurityException = new GeneralSecurityException((String)object);
            throw generalSecurityException;
        }
        this.zzb = n4 = Integer.valueOf(n3);
        return this;
    }

    public final zzgjj zzb(int n3) {
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

    public final zzgjj zzc(int n3) {
        Integer n4;
        this.zzc = n4 = Integer.valueOf(16);
        return this;
    }

    public final zzgjj zzd(zzgjk zzgjk2) {
        this.zzd = zzgjk2;
        return this;
    }

    public final zzgjm zze() {
        Serializable serializable = this.zza;
        if (serializable != null) {
            Object object = this.zzb;
            if (object != null) {
                object = this.zzd;
                if (object != null) {
                    object = this.zzc;
                    if (object != null) {
                        int n3 = (Integer)serializable;
                        int n4 = this.zzb;
                        this.zzc.getClass();
                        zzgjk zzgjk2 = this.zzd;
                        object = new zzgjm(n3, n4, 16, zzgjk2, null);
                        return object;
                    }
                    serializable = new GeneralSecurityException("Tag size is not set");
                    throw serializable;
                }
                serializable = new GeneralSecurityException("Variant is not set");
                throw serializable;
            }
            serializable = new GeneralSecurityException("IV size is not set");
            throw serializable;
        }
        serializable = new GeneralSecurityException("Key size is not set");
        throw serializable;
    }
}

