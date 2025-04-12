/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.task;

import com.clevertap.android.sdk.task.PostAsyncSafelyExecutor$1;
import com.clevertap.android.sdk.task.PostAsyncSafelyExecutor$a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public final class PostAsyncSafelyExecutor
implements ExecutorService {
    public long a = 0L;
    public final ExecutorService b;

    public PostAsyncSafelyExecutor() {
        ExecutorService executorService;
        this.b = executorService = Executors.newSingleThreadExecutor();
    }

    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.b.awaitTermination(l2, timeUnit);
    }

    public final void execute(Runnable object) {
        if (object != null) {
            long l2;
            Runnable runnable2 = Thread.currentThread();
            long l3 = runnable2.getId();
            long l4 = l3 - (l2 = this.a);
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                object.run();
            } else {
                runnable2 = new PostAsyncSafelyExecutor$1(this, (Runnable)object);
                object = this.b;
                object.execute(runnable2);
            }
            return;
        }
        object = new NullPointerException("PostAsyncSafelyExecutor#execute: task can't ne null");
        throw object;
    }

    public final List invokeAll(Collection object) {
        object = new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAll: This method is not supported");
        throw object;
    }

    public final List invokeAll(Collection object, long l2, TimeUnit timeUnit) {
        object = new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAll: This method is not supported");
        throw object;
    }

    public final Object invokeAny(Collection object) {
        object = new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAny: This method is not supported");
        throw object;
    }

    public final Object invokeAny(Collection object, long l2, TimeUnit timeUnit) {
        object = new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAny: This method is not supported");
        throw object;
    }

    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    public final void shutdown() {
        this.b.shutdown();
    }

    public final List shutdownNow() {
        return this.b.shutdownNow();
    }

    public final Future submit(Runnable object) {
        if (object != null) {
            FutureTask<Object> futureTask = new FutureTask<Object>((Runnable)object, null);
            this.execute(futureTask);
            return futureTask;
        }
        object = new NullPointerException("PostAsyncSafelyExecutor#submit: task can't ne null");
        throw object;
    }

    public final Future submit(Runnable object, Object object2) {
        if (object != null) {
            FutureTask<Object> futureTask = new FutureTask<Object>((Runnable)object, object2);
            this.execute(futureTask);
            return futureTask;
        }
        object = new NullPointerException("PostAsyncSafelyExecutor#submit: task can't ne null");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Future submit(Callable future) {
        long l2;
        if (future == null) {
            future = new Future("PostAsyncSafelyExecutor#submit: task can't ne null");
            throw future;
        }
        Object object = Thread.currentThread();
        long l3 = ((Thread)object).getId();
        long l4 = l3 - (l2 = this.a);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            object = new PostAsyncSafelyExecutor$a(this, (Callable)((Object)future));
            return this.b.submit(object);
        }
        try {
            future.call();
            return null;
        }
        catch (Exception exception) {}
        return null;
    }
}

