/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

public abstract class AbstractListeningExecutorService
extends AbstractExecutorService
implements ListeningExecutorService {
    public final RunnableFuture newTaskFor(Runnable runnable2, Object object) {
        return TrustedListenableFutureTask.create(runnable2, object);
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return TrustedListenableFutureTask.create(callable);
    }

    public ListenableFuture submit(Runnable runnable2) {
        return (ListenableFuture)super.submit(runnable2);
    }

    public ListenableFuture submit(Runnable runnable2, Object object) {
        return (ListenableFuture)super.submit(runnable2, object);
    }

    public ListenableFuture submit(Callable callable) {
        return (ListenableFuture)super.submit(callable);
    }
}

