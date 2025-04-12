/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class zzfky
implements ListenableFuture {
    private final Object zza;
    private final String zzb;
    private final ListenableFuture zzc;

    public zzfky(Object object, String string2, ListenableFuture listenableFuture) {
        this.zza = object;
        this.zzb = string2;
        this.zzc = listenableFuture;
    }

    public final void addListener(Runnable runnable2, Executor executor) {
        this.zzc.addListener(runnable2, executor);
    }

    public final boolean cancel(boolean bl2) {
        return this.zzc.cancel(bl2);
    }

    public final Object get() {
        return this.zzc.get();
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        return this.zzc.get(l2, timeUnit);
    }

    public final boolean isCancelled() {
        return this.zzc.isCancelled();
    }

    public final boolean isDone() {
        return this.zzc.isDone();
    }

    public final String toString() {
        int n3 = System.identityHashCode(this);
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.zzb;
        stringBuilder.append(string2);
        stringBuilder.append("@");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final Object zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}

