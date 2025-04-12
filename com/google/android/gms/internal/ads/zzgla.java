/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgih;
import com.google.android.gms.internal.ads.zzglb;
import com.google.android.gms.internal.ads.zzglc;
import com.google.android.gms.internal.ads.zzgze;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzgla
extends zzgih {
    private final zzglc zza;
    private final zzgze zzb;
    private final Integer zzc;

    private zzgla(zzglc zzglc2, zzgze zzgze2, Integer n3) {
        this.zza = zzglc2;
        this.zzb = zzgze2;
        this.zzc = n3;
    }

    public static zzgla zza(zzglc object, Integer serializable) {
        block5: {
            block6: {
                Object object2;
                Object object3;
                block4: {
                    block2: {
                        block3: {
                            object3 = ((zzglc)object).zzb();
                            if (object3 != (object2 = zzglb.zza)) break block2;
                            if (serializable == null) break block3;
                            int n3 = 5;
                            object3 = ByteBuffer.allocate(n3).put((byte)1);
                            int n4 = serializable;
                            object3 = zzgze.zzb(((ByteBuffer)object3).putInt(n4).array());
                            break block4;
                        }
                        object = new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
                        throw object;
                    }
                    object3 = ((zzglc)object).zzb();
                    if (object3 != (object2 = zzglb.zzb)) break block5;
                    if (serializable != null) break block6;
                    boolean bl2 = false;
                    object3 = zzgze.zzb(new byte[0]);
                }
                object2 = new zzgla((zzglc)object, (zzgze)object3, (Integer)serializable);
                return object2;
            }
            object = new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            throw object;
        }
        object = ((zzglc)object).zzb().toString();
        object = "Unknown Variant: ".concat((String)object);
        serializable = new GeneralSecurityException((String)object);
        throw serializable;
    }

    public final zzglc zzb() {
        return this.zza;
    }

    public final zzgze zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}

