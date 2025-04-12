/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.stats;

import com.google.android.gms.internal.stats.zzc;
import com.google.android.gms.internal.stats.zzd;
import java.io.Closeable;

public final class zzb
implements Closeable {
    private static final zzb zza;

    static {
        zzb zzb2;
        zza = zzb2 = new zzb(false, null);
    }

    private zzb(boolean bl2, zzd zzd2) {
    }

    public static zzb zza(boolean bl2, zzc zzc2) {
        return zza;
    }

    public final void close() {
    }
}

