/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcn;
import java.io.Serializable;

final class zzgcw
extends zzgcn
implements Serializable {
    final zzgcn zza;

    public zzgcw(zzgcn zzgcn2) {
        this.zza = zzgcn2;
    }

    public final int compare(Object object, Object object2) {
        return this.zza.compare(object2, object);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof zzgcw;
        if (bl2) {
            object = (zzgcw)object;
            zzgcn zzgcn2 = this.zza;
            object = ((zzgcw)object).zza;
            return zzgcn2.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}

