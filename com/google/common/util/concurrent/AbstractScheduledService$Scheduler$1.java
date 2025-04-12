/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractScheduledService$Cancellable;
import com.google.common.util.concurrent.AbstractScheduledService$FutureAsCancellable;
import com.google.common.util.concurrent.AbstractScheduledService$Scheduler;
import com.google.common.util.concurrent.AbstractService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class AbstractScheduledService$Scheduler$1
extends AbstractScheduledService$Scheduler {
    final /* synthetic */ long val$delay;
    final /* synthetic */ long val$initialDelay;
    final /* synthetic */ TimeUnit val$unit;

    public AbstractScheduledService$Scheduler$1(long l2, long l3, TimeUnit timeUnit) {
        this.val$initialDelay = l2;
        this.val$delay = l3;
        this.val$unit = timeUnit;
        super(null);
    }

    public AbstractScheduledService$Cancellable schedule(AbstractService object, ScheduledExecutorService object2, Runnable runnable2) {
        long l2 = this.val$initialDelay;
        long l3 = this.val$delay;
        TimeUnit timeUnit = this.val$unit;
        object2 = object2.scheduleWithFixedDelay(runnable2, l2, l3, timeUnit);
        object = new AbstractScheduledService$FutureAsCancellable((Future)object2);
        return object;
    }
}

