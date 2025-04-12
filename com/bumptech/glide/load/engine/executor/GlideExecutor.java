/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine.executor;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class GlideExecutor
implements ExecutorService {
    public static final long b = TimeUnit.SECONDS.toMillis(10);
    public static volatile int c;
    public final ExecutorService a;

    public GlideExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.a = threadPoolExecutor;
    }

    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.a.awaitTermination(l2, timeUnit);
    }

    public final void execute(Runnable runnable2) {
        this.a.execute(runnable2);
    }

    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    public final List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, l2, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, l2, timeUnit);
    }

    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final void shutdown() {
        this.a.shutdown();
    }

    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    public final Future submit(Runnable runnable2) {
        return this.a.submit(runnable2);
    }

    public final Future submit(Runnable runnable2, Object object) {
        return this.a.submit(runnable2, object);
    }

    public final Future submit(Callable callable) {
        return this.a.submit(callable);
    }

    public final String toString() {
        return this.a.toString();
    }
}

