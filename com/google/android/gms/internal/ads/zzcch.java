/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzccg;
import com.google.android.gms.internal.ads.zzgem;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class zzcch
extends zzgem {
    private final Executor zza;

    public /* synthetic */ zzcch(Executor executor, zzccg zzccg2) {
        this.zza = executor;
    }

    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void execute(Runnable runnable2) {
        this.zza.execute(runnable2);
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final List shutdownNow() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

