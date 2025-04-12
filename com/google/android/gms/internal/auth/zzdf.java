/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdh;

final class zzdf
extends zzdh {
    static final zzdf zza;

    static {
        zzdf zzdf2;
        zza = zzdf2 = new zzdf();
    }

    private zzdf() {
    }

    public final boolean equals(Object object) {
        return object == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final Object zza() {
        IllegalStateException illegalStateException = new IllegalStateException("Optional.get() cannot be called on an absent value");
        throw illegalStateException;
    }

    public final boolean zzb() {
        return false;
    }
}

