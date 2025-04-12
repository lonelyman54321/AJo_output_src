/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgih;
import com.google.android.gms.internal.ads.zzglm;
import com.google.android.gms.internal.ads.zzglo;
import com.google.android.gms.internal.ads.zzgpm;
import com.google.android.gms.internal.ads.zzgze;
import java.security.GeneralSecurityException;

public final class zzgli
extends zzgih {
    private final zzglo zza;
    private final zzgze zzb;
    private final Integer zzc;

    private zzgli(zzglo zzglo2, zzgze zzgze2, Integer n3) {
        this.zza = zzglo2;
        this.zzb = zzgze2;
        this.zzc = n3;
    }

    public static zzgli zza(zzglo object, Integer serializable) {
        block5: {
            block6: {
                Object object2;
                Object object3;
                block4: {
                    block2: {
                        block3: {
                            object3 = ((zzglo)object).zzc();
                            if (object3 != (object2 = zzglm.zzb)) break block2;
                            if (serializable != null) break block3;
                            object3 = zzgpm.zza;
                            break block4;
                        }
                        object = new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
                        throw object;
                    }
                    object3 = ((zzglo)object).zzc();
                    if (object3 != (object2 = zzglm.zza)) break block5;
                    if (serializable == null) break block6;
                    int n3 = (Integer)serializable;
                    object3 = zzgpm.zzb(n3);
                }
                object2 = new zzgli((zzglo)object, (zzgze)object3, (Integer)serializable);
                return object2;
            }
            object = new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            throw object;
        }
        object = String.valueOf(((zzglo)object).zzc());
        object = "Unknown Variant: ".concat((String)object);
        serializable = new GeneralSecurityException((String)object);
        throw serializable;
    }

    public final zzglo zzb() {
        return this.zza;
    }

    public final zzgze zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}

