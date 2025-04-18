/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ForwardingExecutorService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import java.util.concurrent.Callable;

public abstract class ForwardingListeningExecutorService
extends ForwardingExecutorService
implements ListeningExecutorService {
    public abstract ListeningExecutorService delegate();

    public ListenableFuture submit(Runnable runnable2) {
        return this.delegate().submit(runnable2);
    }

    public ListenableFuture submit(Runnable runnable2, Object object) {
        return this.delegate().submit(runnable2, object);
    }

    public ListenableFuture submit(Callable callable) {
        return this.delegate().submit(callable);
    }
}

