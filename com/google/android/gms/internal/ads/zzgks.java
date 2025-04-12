/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzgkr;
import java.util.Objects;

public final class zzgks
extends zzgii {
    private final zzgkr zza;

    private zzgks(zzgkr zzgkr2) {
        this.zza = zzgkr2;
    }

    public static zzgks zzc(zzgkr zzgkr2) {
        zzgks zzgks2 = new zzgks(zzgkr2);
        return zzgks2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzgks;
        if (!bl2) {
            return false;
        }
        object = ((zzgks)object).zza;
        zzgkr zzgkr2 = this.zza;
        return object == zzgkr2;
    }

    public final int hashCode() {
        zzgkr zzgkr2 = this.zza;
        Object[] objectArray = new Object[]{zzgks.class, zzgkr2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        String string2 = this.zza.toString();
        return cP.a("ChaCha20Poly1305 Parameters (variant: ", string2, ")");
    }

    public final boolean zza() {
        zzgkr zzgkr2 = this.zza;
        zzgkr zzgkr3 = zzgkr.zzc;
        return zzgkr2 != zzgkr3;
    }

    public final zzgkr zzb() {
        return this.zza;
    }
}

