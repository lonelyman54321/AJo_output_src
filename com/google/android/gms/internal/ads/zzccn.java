/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzggm;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class zzccn
implements ListenableFuture {
    private final zzggm zza;

    public zzccn() {
        zzggm zzggm2;
        this.zza = zzggm2 = zzggm.zze();
    }

    private static final boolean zza(boolean bl2) {
        if (!bl2) {
            zzcby zzcby2 = zzu.zzo();
            IllegalStateException illegalStateException = new IllegalStateException("Provided SettableFuture with multiple values.");
            String string2 = "SettableFuture";
            zzcby2.zzv(illegalStateException, string2);
        }
        return bl2;
    }

    public final void addListener(Runnable runnable2, Executor executor) {
        this.zza.addListener(runnable2, executor);
    }

    public boolean cancel(boolean bl2) {
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

    public final boolean zzc(Object object) {
        boolean bl2 = this.zza.zzc(object);
        zzccn.zza(bl2);
        return bl2;
    }

    public final boolean zzd(Throwable throwable) {
        boolean bl2 = this.zza.zzd(throwable);
        zzccn.zza(bl2);
        return bl2;
    }
}

