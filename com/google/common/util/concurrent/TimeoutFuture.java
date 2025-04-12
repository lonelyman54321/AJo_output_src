/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture$TrustedFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.TimeoutFuture$Fire;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class TimeoutFuture
extends FluentFuture$TrustedFuture {
    private ListenableFuture delegateRef;
    private ScheduledFuture timer;

    private TimeoutFuture(ListenableFuture listenableFuture) {
        this.delegateRef = listenableFuture = (ListenableFuture)Preconditions.checkNotNull(listenableFuture);
    }

    public static /* synthetic */ ListenableFuture access$000(TimeoutFuture timeoutFuture) {
        return timeoutFuture.delegateRef;
    }

    public static /* synthetic */ ScheduledFuture access$100(TimeoutFuture timeoutFuture) {
        return timeoutFuture.timer;
    }

    public static /* synthetic */ ScheduledFuture access$102(TimeoutFuture timeoutFuture, ScheduledFuture scheduledFuture) {
        timeoutFuture.timer = scheduledFuture;
        return scheduledFuture;
    }

    public static ListenableFuture create(ListenableFuture listenableFuture, long l2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TimeoutFuture timeoutFuture = new TimeoutFuture(listenableFuture);
        TimeoutFuture$Fire timeoutFuture$Fire = new TimeoutFuture$Fire(timeoutFuture);
        Object object = scheduledExecutorService.schedule(timeoutFuture$Fire, l2, timeUnit);
        timeoutFuture.timer = object;
        object = MoreExecutors.directExecutor();
        listenableFuture.addListener(timeoutFuture$Fire, (Executor)object);
        return timeoutFuture;
    }

    public void afterDone() {
        Future future = this.delegateRef;
        this.maybePropagateCancellationTo(future);
        future = this.timer;
        if (future != null) {
            future.cancel(false);
        }
        this.delegateRef = null;
        this.timer = null;
    }

    public String pendingToString() {
        Object object = this.delegateRef;
        ScheduledFuture scheduledFuture = this.timer;
        if (object != null) {
            long l2;
            long l3;
            long l4;
            long l7;
            CharSequence charSequence = "inputFuture=[";
            Object object2 = new StringBuilder((String)charSequence);
            object2.append(object);
            object2.append("]");
            object = object2.toString();
            if (scheduledFuture != null && (l7 = (l4 = (l3 = scheduledFuture.getDelay((TimeUnit)((Object)(object2 = TimeUnit.MILLISECONDS)))) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append(", remaining delay=[");
                ((StringBuilder)charSequence).append(l3);
                ((StringBuilder)charSequence).append(" ms]");
                object = ((StringBuilder)charSequence).toString();
            }
            return object;
        }
        return null;
    }
}

