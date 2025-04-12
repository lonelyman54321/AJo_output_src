/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

final class zzest {
    public final ListenableFuture zza;
    private final long zzb;
    private final Clock zzc;

    public zzest(ListenableFuture listenableFuture, long l2, Clock clock) {
        long l3;
        this.zza = listenableFuture;
        this.zzc = clock;
        this.zzb = l3 = clock.elapsedRealtime() + l2;
    }

    public final boolean zza() {
        long l2 = this.zzb;
        Clock clock = this.zzc;
        long l3 = clock.elapsedRealtime();
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object < 0;
    }
}

