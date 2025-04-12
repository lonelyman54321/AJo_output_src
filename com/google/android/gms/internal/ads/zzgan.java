/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcn;
import java.io.Serializable;
import java.util.Comparator;

final class zzgan
extends zzgcn
implements Serializable {
    final Comparator zza;

    public zzgan(Comparator comparator) {
        this.zza = comparator;
    }

    public final int compare(Object object, Object object2) {
        return this.zza.compare(object, object2);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof zzgan;
        if (bl2) {
            object = (zzgan)object;
            Comparator comparator = this.zza;
            object = ((zzgan)object).zza;
            return ((Object)comparator).equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}

