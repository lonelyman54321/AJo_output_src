/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgem;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class zzggg
extends zzgem {
    private final ExecutorService zza;

    public zzggg(ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
    }

    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.zza.awaitTermination(l2, timeUnit);
    }

    public final void execute(Runnable runnable2) {
        this.zza.execute(runnable2);
    }

    public final boolean isShutdown() {
        return this.zza.isShutdown();
    }

    public final boolean isTerminated() {
        return this.zza.isTerminated();
    }

    public final void shutdown() {
        this.zza.shutdown();
    }

    public final List shutdownNow() {
        return this.zza.shutdownNow();
    }

    public final String toString() {
        Object object = this.zza;
        String string2 = super.toString();
        object = String.valueOf(object);
        return y02.a(string2, "[", (String)object, "]");
    }
}

