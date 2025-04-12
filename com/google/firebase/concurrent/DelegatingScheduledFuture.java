/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractResolvableFuture;
import com.google.firebase.concurrent.DelegatingScheduledFuture$1;
import com.google.firebase.concurrent.DelegatingScheduledFuture$Resolver;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class DelegatingScheduledFuture
extends AbstractResolvableFuture
implements ScheduledFuture {
    private final ScheduledFuture upstreamFuture;

    public DelegatingScheduledFuture(DelegatingScheduledFuture$Resolver object) {
        DelegatingScheduledFuture$1 delegatingScheduledFuture$1 = new DelegatingScheduledFuture$1(this);
        this.upstreamFuture = object = object.addCompleter(delegatingScheduledFuture$1);
    }

    public static /* synthetic */ boolean access$000(DelegatingScheduledFuture delegatingScheduledFuture, Object object) {
        return delegatingScheduledFuture.set(object);
    }

    public static /* synthetic */ boolean access$100(DelegatingScheduledFuture delegatingScheduledFuture, Throwable throwable) {
        return delegatingScheduledFuture.setException(throwable);
    }

    public void afterDone() {
        ScheduledFuture scheduledFuture = this.upstreamFuture;
        boolean bl2 = this.wasInterrupted();
        scheduledFuture.cancel(bl2);
    }

    public int compareTo(Delayed delayed) {
        return this.upstreamFuture.compareTo(delayed);
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.upstreamFuture.getDelay(timeUnit);
    }
}

