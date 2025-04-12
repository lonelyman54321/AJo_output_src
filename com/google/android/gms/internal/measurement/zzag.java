/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Iterator;
import java.util.List;

public final class zzag
implements zzaq {
    private final boolean zza;

    public zzag(Boolean bl2) {
        boolean bl3;
        if (bl2 == null) {
            this.zza = false;
            return;
        }
        this.zza = bl3 = bl2.booleanValue();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zzag;
        if (!bl3) {
            return false;
        }
        object = (zzag)object;
        bl3 = this.zza;
        boolean bl4 = ((zzag)object).zza;
        if (bl3 == bl4) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.zza).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.zza);
    }

    public final zzaq zza(String object, zzh object2, List list) {
        object2 = "toString";
        boolean bl2 = ((String)object2).equals(object);
        if (bl2) {
            object2 = Boolean.toString(this.zza);
            object = new zzas((String)object2);
            return object;
        }
        object = y02.a(Boolean.toString(this.zza), ".", (String)object, " is not a function.");
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final zzaq zzc() {
        Boolean bl2 = this.zza;
        zzag zzag2 = new zzag(bl2);
        return zzag2;
    }

    public final Boolean zzd() {
        return this.zza;
    }

    public final Double zze() {
        boolean bl2 = this.zza;
        double d2 = bl2 ? 1.0 : 0.0;
        return d2;
    }

    public final String zzf() {
        return Boolean.toString(this.zza);
    }

    public final Iterator zzh() {
        return null;
    }
}

