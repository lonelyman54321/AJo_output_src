/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ExecutionList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class ListenableFutureTask
extends FutureTask
implements ListenableFuture {
    private final ExecutionList executionList;

    public ListenableFutureTask(Runnable object, Object object2) {
        super((Runnable)object, object2);
        this.executionList = object = new ExecutionList();
    }

    public ListenableFutureTask(Callable object) {
        super(object);
        this.executionList = object = new ExecutionList();
    }

    public static ListenableFutureTask create(Runnable runnable2, Object object) {
        ListenableFutureTask listenableFutureTask = new ListenableFutureTask(runnable2, object);
        return listenableFutureTask;
    }

    public static ListenableFutureTask create(Callable callable) {
        ListenableFutureTask listenableFutureTask = new ListenableFutureTask(callable);
        return listenableFutureTask;
    }

    public void addListener(Runnable runnable2, Executor executor) {
        this.executionList.add(runnable2, executor);
    }

    public void done() {
        this.executionList.execute();
    }

    public Object get(long l2, TimeUnit timeUnit) {
        long l3;
        long l4 = timeUnit.toNanos(l2);
        long l7 = l4 - (l3 = 2147483647999999999L);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object <= 0) {
            return super.get(l2, timeUnit);
        }
        l2 = Math.min(l4, l3);
        timeUnit = TimeUnit.NANOSECONDS;
        return super.get(l2, timeUnit);
    }
}

