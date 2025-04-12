/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingQueue;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public abstract class ForwardingBlockingQueue
extends ForwardingQueue
implements BlockingQueue {
    public abstract BlockingQueue delegate();

    public int drainTo(Collection collection) {
        return this.delegate().drainTo(collection);
    }

    public int drainTo(Collection collection, int n3) {
        return this.delegate().drainTo(collection, n3);
    }

    public boolean offer(Object object, long l2, TimeUnit timeUnit) {
        return this.delegate().offer(object, l2, timeUnit);
    }

    public Object poll(long l2, TimeUnit timeUnit) {
        return this.delegate().poll(l2, timeUnit);
    }

    public void put(Object object) {
        this.delegate().put(object);
    }

    public int remainingCapacity() {
        return this.delegate().remainingCapacity();
    }

    public Object take() {
        return this.delegate().take();
    }
}

