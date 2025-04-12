/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzerf;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzerg {
    private final AtomicBoolean zza;
    private zzerf zzb;

    public zzerg() {
        AtomicBoolean atomicBoolean;
        this.zza = atomicBoolean = new AtomicBoolean(false);
    }

    public final zzerf zza() {
        return this.zzb;
    }

    public final void zzb(zzerf zzerf2) {
        this.zzb = zzerf2;
    }

    public final void zzc(boolean bl2) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}

