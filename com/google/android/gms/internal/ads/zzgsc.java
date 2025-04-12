/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgsb;
import com.google.android.gms.internal.ads.zzgsd;
import com.google.android.gms.internal.ads.zzgse;
import com.google.android.gms.internal.ads.zzgsg;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgsc {
    private Integer zza = null;
    private Integer zzb = null;
    private zzgsd zzc = null;
    private zzgse zzd;

    private zzgsc() {
        zzgse zzgse2;
        this.zzd = zzgse2 = zzgse.zzd;
    }

    public /* synthetic */ zzgsc(zzgsb object) {
        this.zzd = object = zzgse.zzd;
    }

    public final zzgsc zza(zzgsd zzgsd2) {
        this.zzc = zzgsd2;
        return this;
    }

    public final zzgsc zzb(int n3) {
        Integer n4;
        this.zza = n4 = Integer.valueOf(n3);
        return this;
    }

    public final zzgsc zzc(int n3) {
        Integer n4;
        this.zzb = n4 = Integer.valueOf(n3);
        return this;
    }

    public final zzgsc zzd(zzgse zzgse2) {
        this.zzd = zzgse2;
        return this;
    }

    public final zzgsg zze() {
        Object object;
        block8: {
            block9: {
                block10: {
                    block11: {
                        Object object2;
                        Serializable serializable;
                        int n3;
                        block12: {
                            block13: {
                                block19: {
                                    block20: {
                                        Object object3;
                                        block15: {
                                            zzgsd zzgsd2;
                                            int n4;
                                            block18: {
                                                block17: {
                                                    block16: {
                                                        block14: {
                                                            object = null;
                                                            n3 = 1;
                                                            serializable = this.zza;
                                                            if (serializable == null) break block8;
                                                            object2 = this.zzb;
                                                            if (object2 == null) break block9;
                                                            object2 = this.zzc;
                                                            if (object2 == null) break block10;
                                                            object2 = this.zzd;
                                                            if (object2 == null) break block11;
                                                            int n7 = (Integer)serializable;
                                                            if (n7 < (n4 = 16)) break block12;
                                                            serializable = this.zzb;
                                                            n4 = (Integer)serializable;
                                                            zzgsd2 = this.zzc;
                                                            int n8 = 10;
                                                            if (n4 < n8) break block13;
                                                            object3 = zzgsd.zza;
                                                            if (zzgsd2 != object3) break block14;
                                                            int n10 = 20;
                                                            if (n4 > n10) {
                                                                Object[] objectArray = new Object[n3];
                                                                objectArray[0] = serializable;
                                                                object = String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", objectArray);
                                                                object2 = new GeneralSecurityException((String)object);
                                                                throw object2;
                                                            }
                                                            break block15;
                                                        }
                                                        object3 = zzgsd.zzb;
                                                        if (zzgsd2 != object3) break block16;
                                                        int n14 = 28;
                                                        if (n4 > n14) {
                                                            Object[] objectArray = new Object[n3];
                                                            objectArray[0] = serializable;
                                                            object = String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", objectArray);
                                                            object2 = new GeneralSecurityException((String)object);
                                                            throw object2;
                                                        }
                                                        break block15;
                                                    }
                                                    object3 = zzgsd.zzc;
                                                    if (zzgsd2 != object3) break block17;
                                                    int n15 = 32;
                                                    if (n4 > n15) {
                                                        Object[] objectArray = new Object[n3];
                                                        objectArray[0] = serializable;
                                                        object = String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", objectArray);
                                                        object2 = new GeneralSecurityException((String)object);
                                                        throw object2;
                                                    }
                                                    break block15;
                                                }
                                                object3 = zzgsd.zzd;
                                                if (zzgsd2 != object3) break block18;
                                                int n16 = 48;
                                                if (n4 > n16) {
                                                    Object[] objectArray = new Object[n3];
                                                    objectArray[0] = serializable;
                                                    object = String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", objectArray);
                                                    object2 = new GeneralSecurityException((String)object);
                                                    throw object2;
                                                }
                                                break block15;
                                            }
                                            object3 = zzgsd.zze;
                                            if (zzgsd2 != object3) break block19;
                                            int n17 = 64;
                                            if (n4 > n17) break block20;
                                        }
                                        int n18 = this.zza;
                                        int n19 = this.zzb;
                                        zzgse zzgse2 = this.zzd;
                                        zzgsd zzgsd3 = this.zzc;
                                        object3 = object;
                                        object = new zzgsg(n18, n19, zzgse2, zzgsd3, null);
                                        return object;
                                    }
                                    Object[] objectArray = new Object[n3];
                                    objectArray[0] = serializable;
                                    object = String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", objectArray);
                                    object2 = new GeneralSecurityException((String)object);
                                    throw object2;
                                }
                                object = new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                throw object;
                            }
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = serializable;
                            object = String.format("Invalid tag size in bytes %d; must be at least 10 bytes", objectArray);
                            object2 = new GeneralSecurityException((String)object);
                            throw object2;
                        }
                        object2 = this.zza;
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = object2;
                        object = String.format("Invalid key size in bytes %d; must be at least 16 bytes", objectArray);
                        serializable = new InvalidAlgorithmParameterException((String)object);
                        throw serializable;
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
        object = new GeneralSecurityException("key size is not set");
        throw object;
    }
}

