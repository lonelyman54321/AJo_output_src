/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcy;

final class zzcv
extends zzcy {
    static final zzcv zza;

    static {
        zzcv zzcv2;
        zza = zzcv2 = new zzcv();
    }

    private zzcv() {
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

    public final boolean zza() {
        return false;
    }

    public final Object zzb() {
        IllegalStateException illegalStateException = new IllegalStateException("Optional.get() cannot be called on an absent value");
        throw illegalStateException;
    }
}

