/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.WrappingExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

abstract class WrappingScheduledExecutorService
extends WrappingExecutorService
implements ScheduledExecutorService {
    final ScheduledExecutorService delegate;

    public WrappingScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.delegate = scheduledExecutorService;
    }

    public final ScheduledFuture schedule(Runnable runnable2, long l2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.delegate;
        runnable2 = this.wrapTask(runnable2);
        return scheduledExecutorService.schedule(runnable2, l2, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long l2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.delegate;
        callable = this.wrapTask(callable);
        return scheduledExecutorService.schedule(callable, l2, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable2, long l2, long l3, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.delegate;
        Runnable runnable3 = this.wrapTask(runnable2);
        return scheduledExecutorService.scheduleAtFixedRate(runnable3, l2, l3, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable2, long l2, long l3, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.delegate;
        Runnable runnable3 = this.wrapTask(runnable2);
        return scheduledExecutorService.scheduleWithFixedDelay(runnable3, l2, l3, timeUnit);
    }
}

