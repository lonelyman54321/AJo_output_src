/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class zzgfl
extends zzgfk {
    private final ListenableFuture zza;

    public zzgfl(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }

    public final void addListener(Runnable runnable2, Executor executor) {
        this.zza.addListener(runnable2, executor);
    }

    public final boolean cancel(boolean bl2) {
        return this.zza.cancel(bl2);
    }

    public final Object get() {
        return this.zza.get();
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        return this.zza.get(l2, timeUnit);
    }

    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isDone() {
        return this.zza.isDone();
    }

    public final String toString() {
        return this.zza.toString();
    }
}

