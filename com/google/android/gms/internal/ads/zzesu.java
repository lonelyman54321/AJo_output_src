/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzest;
import com.google.android.gms.internal.ads.zzexw;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

public final class zzesu
implements zzexw {
    private final AtomicReference zza;
    private final Clock zzb;
    private final zzexw zzc;
    private final long zzd;

    public zzesu(zzexw zzexw2, long l2, Clock clock) {
        AtomicReference atomicReference;
        this.zza = atomicReference = new AtomicReference();
        this.zzb = clock;
        this.zzc = zzexw2;
        this.zzd = l2;
    }

    public final int zza() {
        return 16;
    }

    public final ListenableFuture zzb() {
        boolean bl2;
        Object object = (zzest)this.zza.get();
        if (object == null || (bl2 = ((zzest)object).zza())) {
            object = this.zzc;
            long l2 = this.zzd;
            Clock clock = this.zzb;
            object = object.zzb();
            zzest zzest2 = new zzest((ListenableFuture)object, l2, clock);
            this.zza.set(zzest2);
            object = zzest2;
        }
        return ((zzest)object).zza;
    }
}

