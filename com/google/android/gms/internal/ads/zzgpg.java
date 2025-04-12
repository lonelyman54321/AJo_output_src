/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgpf;
import com.google.android.gms.internal.ads.zzgtm;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgpg {
    private static final zzgpg zza;
    private static final zzgpf zzb;
    private final AtomicReference zzc;

    static {
        Object object = new zzgpg();
        zza = object;
        zzb = object = new zzgpf(null);
    }

    public zzgpg() {
        AtomicReference atomicReference;
        this.zzc = atomicReference = new AtomicReference();
    }

    public static zzgpg zza() {
        return zza;
    }

    public final zzgtm zzb() {
        zzgtm zzgtm2 = (zzgtm)this.zzc.get();
        if (zzgtm2 == null) {
            zzgtm2 = zzb;
        }
        return zzgtm2;
    }
}

