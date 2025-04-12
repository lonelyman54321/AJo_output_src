/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzggt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class zzgem
extends AbstractExecutorService
implements zzgge {
    public final RunnableFuture newTaskFor(Runnable runnable2, Object object) {
        return zzggt.zze(runnable2, object);
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        zzggt zzggt2 = new zzggt(callable);
        return zzggt2;
    }

    public final /* synthetic */ Future submit(Runnable runnable2) {
        return (ListenableFuture)super.submit(runnable2);
    }

    public final /* synthetic */ Future submit(Runnable runnable2, Object object) {
        return (ListenableFuture)super.submit(runnable2, object);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (ListenableFuture)super.submit(callable);
    }

    public final ListenableFuture zza(Runnable runnable2) {
        return (ListenableFuture)super.submit(runnable2);
    }

    public final ListenableFuture zzb(Callable callable) {
        return (ListenableFuture)super.submit(callable);
    }
}

