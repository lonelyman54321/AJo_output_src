/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Iterator;
import java.util.List;

public final class zzao
implements zzaq {
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof zzao;
    }

    public final int hashCode() {
        return 1;
    }

    public final zzaq zza(String string2, zzh object, List list) {
        string2 = kp1_0.c("null has no function ", string2);
        object = new IllegalStateException(string2);
        throw object;
    }

    public final zzaq zzc() {
        return zzaq.zzd;
    }

    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    public final Double zze() {
        return 0.0;
    }

    public final String zzf() {
        return "null";
    }

    public final Iterator zzh() {
        return null;
    }
}

