/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfn;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzggh
extends zzgfn
implements ScheduledFuture,
ListenableFuture {
    private final ScheduledFuture zza;

    public zzggh(ListenableFuture listenableFuture, ScheduledFuture scheduledFuture) {
        super(listenableFuture);
        this.zza = scheduledFuture;
    }

    public final boolean cancel(boolean bl2) {
        Future future = this.zzb();
        boolean bl3 = future.cancel(bl2);
        if (bl3) {
            ScheduledFuture scheduledFuture = this.zza;
            scheduledFuture.cancel(bl2);
        }
        return bl3;
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}

