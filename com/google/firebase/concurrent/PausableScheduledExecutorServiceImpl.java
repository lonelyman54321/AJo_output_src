/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.PausableExecutorService;
import com.google.firebase.concurrent.PausableScheduledExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class PausableScheduledExecutorServiceImpl
extends DelegatingScheduledExecutorService
implements PausableScheduledExecutorService {
    private final PausableExecutorService delegate;

    public PausableScheduledExecutorServiceImpl(PausableExecutorService pausableExecutorService, ScheduledExecutorService scheduledExecutorService) {
        super(pausableExecutorService, scheduledExecutorService);
        this.delegate = pausableExecutorService;
    }

    public boolean isPaused() {
        return this.delegate.isPaused();
    }

    public void pause() {
        this.delegate.pause();
    }

    public void resume() {
        this.delegate.resume();
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable object, long l2, long l3, TimeUnit timeUnit) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable object, long l2, long l3, TimeUnit timeUnit) {
        object = new UnsupportedOperationException();
        throw object;
    }
}

