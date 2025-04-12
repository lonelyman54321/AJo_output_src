/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingDeque;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public abstract class ForwardingBlockingDeque
extends ForwardingDeque
implements BlockingDeque {
    public abstract BlockingDeque delegate();

    public int drainTo(Collection collection) {
        return this.delegate().drainTo(collection);
    }

    public int drainTo(Collection collection, int n3) {
        return this.delegate().drainTo(collection, n3);
    }

    public boolean offer(Object object, long l2, TimeUnit timeUnit) {
        return this.delegate().offer(object, l2, timeUnit);
    }

    public boolean offerFirst(Object object, long l2, TimeUnit timeUnit) {
        return this.delegate().offerFirst(object, l2, timeUnit);
    }

    public boolean offerLast(Object object, long l2, TimeUnit timeUnit) {
        return this.delegate().offerLast(object, l2, timeUnit);
    }

    public Object poll(long l2, TimeUnit timeUnit) {
        return this.delegate().poll(l2, timeUnit);
    }

    public Object pollFirst(long l2, TimeUnit timeUnit) {
        return this.delegate().pollFirst(l2, timeUnit);
    }

    public Object pollLast(long l2, TimeUnit timeUnit) {
        return this.delegate().pollLast(l2, timeUnit);
    }

    public void put(Object object) {
        this.delegate().put(object);
    }

    public void putFirst(Object object) {
        this.delegate().putFirst(object);
    }

    public void putLast(Object object) {
        this.delegate().putLast(object);
    }

    public int remainingCapacity() {
        return this.delegate().remainingCapacity();
    }

    public Object take() {
        return this.delegate().take();
    }

    public Object takeFirst() {
        return this.delegate().takeFirst();
    }

    public Object takeLast() {
        return this.delegate().takeLast();
    }
}

