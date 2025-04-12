/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfm;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public abstract class zzgfo
extends zzgfm
implements ListenableFuture {
    public final void addListener(Runnable runnable2, Executor executor) {
        this.zzc().addListener(runnable2, executor);
    }

    public abstract ListenableFuture zzc();
}

