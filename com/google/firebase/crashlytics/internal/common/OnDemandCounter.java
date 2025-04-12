/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

public final class OnDemandCounter {
    private final AtomicInteger droppedOnDemandExceptions;
    private final AtomicInteger recordedOnDemandExceptions;

    public OnDemandCounter() {
        AtomicInteger atomicInteger;
        this.recordedOnDemandExceptions = atomicInteger = new AtomicInteger();
        this.droppedOnDemandExceptions = atomicInteger = new AtomicInteger();
    }

    public int getDroppedOnDemandExceptions() {
        return this.droppedOnDemandExceptions.get();
    }

    public int getRecordedOnDemandExceptions() {
        return this.recordedOnDemandExceptions.get();
    }

    public void incrementDroppedOnDemandExceptions() {
        this.droppedOnDemandExceptions.getAndIncrement();
    }

    public void incrementRecordedOnDemandExceptions() {
        this.recordedOnDemandExceptions.getAndIncrement();
    }

    public void resetDroppedOnDemandExceptions() {
        this.droppedOnDemandExceptions.set(0);
    }
}

