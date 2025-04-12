/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingObject;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class ForwardingExecutorService
extends ForwardingObject
implements ExecutorService {
    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.delegate().awaitTermination(l2, timeUnit);
    }

    public abstract ExecutorService delegate();

    public void execute(Runnable runnable2) {
        this.delegate().execute(runnable2);
    }

    public List invokeAll(Collection collection) {
        return this.delegate().invokeAll(collection);
    }

    public List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        return this.delegate().invokeAll(collection, l2, timeUnit);
    }

    public Object invokeAny(Collection collection) {
        return this.delegate().invokeAny(collection);
    }

    public Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        return this.delegate().invokeAny(collection, l2, timeUnit);
    }

    public boolean isShutdown() {
        return this.delegate().isShutdown();
    }

    public boolean isTerminated() {
        return this.delegate().isTerminated();
    }

    public void shutdown() {
        this.delegate().shutdown();
    }

    public List shutdownNow() {
        return this.delegate().shutdownNow();
    }

    public Future submit(Runnable runnable2) {
        return this.delegate().submit(runnable2);
    }

    public Future submit(Runnable runnable2, Object object) {
        return this.delegate().submit(runnable2, object);
    }

    public Future submit(Callable callable) {
        return this.delegate().submit(callable);
    }
}

