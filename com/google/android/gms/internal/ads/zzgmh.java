/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzgmg;
import java.util.Objects;

public final class zzgmh
extends zzgii {
    private final zzgmg zza;

    private zzgmh(zzgmg zzgmg2) {
        this.zza = zzgmg2;
    }

    public static zzgmh zzc(zzgmg zzgmg2) {
        zzgmh zzgmh2 = new zzgmh(zzgmg2);
        return zzgmh2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzgmh;
        if (!bl2) {
            return false;
        }
        object = ((zzgmh)object).zza;
        zzgmg zzgmg2 = this.zza;
        return object == zzgmg2;
    }

    public final int hashCode() {
        zzgmg zzgmg2 = this.zza;
        Object[] objectArray = new Object[]{zzgmh.class, zzgmg2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        String string2 = this.zza.toString();
        return cP.a("XChaCha20Poly1305 Parameters (variant: ", string2, ")");
    }

    public final boolean zza() {
        zzgmg zzgmg2 = this.zza;
        zzgmg zzgmg3 = zzgmg.zzc;
        return zzgmg2 != zzgmg3;
    }

    public final zzgmg zzb() {
        return this.zza;
    }
}

