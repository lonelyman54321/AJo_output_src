/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgiv;
import com.google.android.gms.internal.ads.zzgix;
import com.google.android.gms.internal.ads.zzgiy;
import com.google.android.gms.internal.ads.zzgja;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgiw {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private Integer zzd = null;
    private zzgix zze = null;
    private zzgiy zzf;

    private zzgiw() {
        zzgiy zzgiy2;
        this.zzf = zzgiy2 = zzgiy.zzc;
    }

    public /* synthetic */ zzgiw(zzgiv object) {
        this.zzf = object = zzgiy.zzc;
    }

    public final zzgiw zza(int n3) {
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

    public final zzgiw zzb(zzgix zzgix2) {
        this.zze = zzgix2;
        return this;
    }

    public final zzgiw zzc(int n3) {
        int n4 = 16;
        if (n3 >= n4) {
            Integer n7;
            this.zzb = n7 = Integer.valueOf(n3);
            return this;
        }
        Object object = n3;
        Object[] objectArray = new Object[]{object};
        object = String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", objectArray);
        InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException((String)object);
        throw invalidAlgorithmParameterException;
    }

    public final zzgiw zzd(int n3) {
        int n4 = 12;
        if (n3 >= n4 && n3 <= (n4 = 16)) {
            Integer n7;
            this.zzc = n7 = Integer.valueOf(n3);
            return this;
        }
        Object object = n3;
        Object[] objectArray = new Object[]{object};
        object = String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", objectArray);
        GeneralSecurityException generalSecurityException = new GeneralSecurityException((String)object);
        throw generalSecurityException;
    }

    public final zzgiw zze(int n3) {
        int n4 = 10;
        if (n3 >= n4) {
            Integer n7;
            this.zzd = n7 = Integer.valueOf(n3);
            return this;
        }
        Object object = n3;
        Object[] objectArray = new Object[]{object};
        object = String.format("Invalid tag size in bytes %d; must be at least 10 bytes", objectArray);
        GeneralSecurityException generalSecurityException = new GeneralSecurityException((String)object);
        throw generalSecurityException;
    }

    public final zzgiw zzf(zzgiy zzgiy2) {
        this.zzf = zzgiy2;
        return this;
    }

    public final zzgja zzg() {
        Object object;
        block8: {
            block9: {
                block10: {
                    block11: {
                        block12: {
                            block13: {
                                block19: {
                                    Object object2;
                                    Integer n3;
                                    int n4;
                                    block20: {
                                        Object object3;
                                        block15: {
                                            zzgix zzgix2;
                                            int n7;
                                            block18: {
                                                block17: {
                                                    block16: {
                                                        block14: {
                                                            object = null;
                                                            n4 = 1;
                                                            n3 = this.zza;
                                                            if (n3 == null) break block8;
                                                            n3 = this.zzb;
                                                            if (n3 == null) break block9;
                                                            n3 = this.zzc;
                                                            if (n3 == null) break block10;
                                                            n3 = this.zzd;
                                                            if (n3 == null) break block11;
                                                            object2 = this.zze;
                                                            if (object2 == null) break block12;
                                                            object2 = this.zzf;
                                                            if (object2 == null) break block13;
                                                            n7 = n3;
                                                            zzgix2 = this.zze;
                                                            object3 = zzgix.zza;
                                                            if (zzgix2 != object3) break block14;
                                                            int n8 = 20;
                                                            if (n7 > n8) {
                                                                Object[] objectArray = new Object[n4];
                                                                objectArray[0] = n3;
                                                                object = String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", objectArray);
                                                                object2 = new GeneralSecurityException((String)object);
                                                                throw object2;
                                                            }
                                                            break block15;
                                                        }
                                                        object3 = zzgix.zzb;
                                                        if (zzgix2 != object3) break block16;
                                                        int n10 = 28;
                                                        if (n7 > n10) {
                                                            Object[] objectArray = new Object[n4];
                                                            objectArray[0] = n3;
                                                            object = String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", objectArray);
                                                            object2 = new GeneralSecurityException((String)object);
                                                            throw object2;
                                                        }
                                                        break block15;
                                                    }
                                                    object3 = zzgix.zzc;
                                                    if (zzgix2 != object3) break block17;
                                                    int n14 = 32;
                                                    if (n7 > n14) {
                                                        Object[] objectArray = new Object[n4];
                                                        objectArray[0] = n3;
                                                        object = String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", objectArray);
                                                        object2 = new GeneralSecurityException((String)object);
                                                        throw object2;
                                                    }
                                                    break block15;
                                                }
                                                object3 = zzgix.zzd;
                                                if (zzgix2 != object3) break block18;
                                                int n15 = 48;
                                                if (n7 > n15) {
                                                    Object[] objectArray = new Object[n4];
                                                    objectArray[0] = n3;
                                                    object = String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", objectArray);
                                                    object2 = new GeneralSecurityException((String)object);
                                                    throw object2;
                                                }
                                                break block15;
                                            }
                                            object3 = zzgix.zze;
                                            if (zzgix2 != object3) break block19;
                                            int n16 = 64;
                                            if (n7 > n16) break block20;
                                        }
                                        int n17 = this.zza;
                                        int n18 = this.zzb;
                                        int n19 = this.zzc;
                                        int n20 = this.zzd;
                                        zzgiy zzgiy2 = this.zzf;
                                        zzgix zzgix3 = this.zze;
                                        object3 = object;
                                        object = new zzgja(n17, n18, n19, n20, zzgiy2, zzgix3, null);
                                        return object;
                                    }
                                    Object[] objectArray = new Object[n4];
                                    objectArray[0] = n3;
                                    object = String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", objectArray);
                                    object2 = new GeneralSecurityException((String)object);
                                    throw object2;
                                }
                                object = new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                throw object;
                            }
                            object = new GeneralSecurityException("variant is not set");
                            throw object;
                        }
                        object = new GeneralSecurityException("hash type is not set");
                        throw object;
                    }
                    object = new GeneralSecurityException("tag size is not set");
                    throw object;
                }
                object = new GeneralSecurityException("iv size is not set");
                throw object;
            }
            object = new GeneralSecurityException("HMAC key size is not set");
            throw object;
        }
        object = new GeneralSecurityException("AES key size is not set");
        throw object;
    }
}

