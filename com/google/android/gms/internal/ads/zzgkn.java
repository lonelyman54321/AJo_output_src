/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgih;
import com.google.android.gms.internal.ads.zzgkr;
import com.google.android.gms.internal.ads.zzgks;
import com.google.android.gms.internal.ads.zzgpm;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;

public final class zzgkn
extends zzgih {
    private final zzgks zza;
    private final zzgzf zzb;
    private final zzgze zzc;
    private final Integer zzd;

    private zzgkn(zzgks zzgks2, zzgzf zzgzf2, zzgze zzgze2, Integer n3) {
        this.zza = zzgks2;
        this.zzb = zzgzf2;
        this.zzc = zzgze2;
        this.zzd = n3;
    }

    public static zzgkn zza(zzgkr object, zzgzf object2, Integer n3) {
        block5: {
            block9: {
                Object object3;
                block7: {
                    zzgkr zzgkr2;
                    block8: {
                        block6: {
                            int n4;
                            object3 = zzgkr.zzc;
                            if (object != object3 && n3 == null) {
                                object = ((zzgkr)object).toString();
                                object = cP.a("For given Variant ", (String)object, " the value of idRequirement must be non-null");
                                object2 = new GeneralSecurityException((String)object);
                                throw object2;
                            }
                            if (object == object3 && n3 != null) {
                                object = new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
                                throw object;
                            }
                            int n7 = ((zzgzf)object2).zza();
                            if (n7 != (n4 = 32)) break block5;
                            zzgkr2 = ((zzgks)(object = zzgks.zzc((zzgkr)object))).zzb();
                            if (zzgkr2 != object3) break block6;
                            object3 = zzgpm.zza;
                            break block7;
                        }
                        object3 = ((zzgks)object).zzb();
                        if (object3 != (zzgkr2 = zzgkr.zzb)) break block8;
                        int n8 = n3;
                        object3 = zzgpm.zza(n8);
                        break block7;
                    }
                    object3 = ((zzgks)object).zzb();
                    if (object3 != (zzgkr2 = zzgkr.zza)) break block9;
                    int n10 = n3;
                    object3 = zzgpm.zzb(n10);
                }
                zzgkn zzgkn2 = new zzgkn((zzgks)object, (zzgzf)object2, (zzgze)object3, n3);
                return zzgkn2;
            }
            object = ((zzgks)object).zzb().toString();
            object = "Unknown Variant: ".concat((String)object);
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        object2 = hj0_0.a(((zzgzf)object2).zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
        object = new GeneralSecurityException((String)object2);
        throw object;
    }

    public final zzgks zzb() {
        return this.zza;
    }

    public final zzgze zzc() {
        return this.zzc;
    }

    public final zzgzf zzd() {
        return this.zzb;
    }

    public final Integer zze() {
        return this.zzd;
    }
}

