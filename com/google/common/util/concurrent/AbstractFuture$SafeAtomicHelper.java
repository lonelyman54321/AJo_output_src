/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractFuture$AtomicHelper;
import com.google.common.util.concurrent.AbstractFuture$Listener;
import com.google.common.util.concurrent.AbstractFuture$Waiter;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class AbstractFuture$SafeAtomicHelper
extends AbstractFuture$AtomicHelper {
    final AtomicReferenceFieldUpdater listenersUpdater;
    final AtomicReferenceFieldUpdater valueUpdater;
    final AtomicReferenceFieldUpdater waiterNextUpdater;
    final AtomicReferenceFieldUpdater waiterThreadUpdater;
    final AtomicReferenceFieldUpdater waitersUpdater;

    public AbstractFuture$SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.waiterThreadUpdater = atomicReferenceFieldUpdater;
        this.waiterNextUpdater = atomicReferenceFieldUpdater2;
        this.waitersUpdater = atomicReferenceFieldUpdater3;
        this.listenersUpdater = atomicReferenceFieldUpdater4;
        this.valueUpdater = atomicReferenceFieldUpdater5;
    }

    public boolean casListeners(AbstractFuture abstractFuture, AbstractFuture$Listener abstractFuture$Listener, AbstractFuture$Listener abstractFuture$Listener2) {
        boolean bl2;
        block1: {
            Object v4;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.listenersUpdater;
            do {
                boolean bl3;
                if (!(bl3 = atomicReferenceFieldUpdater.compareAndSet(abstractFuture, abstractFuture$Listener, abstractFuture$Listener2))) continue;
                bl2 = true;
                break block1;
            } while ((v4 = atomicReferenceFieldUpdater.get(abstractFuture)) == abstractFuture$Listener);
            bl2 = false;
            abstractFuture = null;
        }
        return bl2;
    }

    public boolean casValue(AbstractFuture abstractFuture, Object object, Object object2) {
        boolean bl2;
        block1: {
            Object v4;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.valueUpdater;
            do {
                boolean bl3;
                if (!(bl3 = atomicReferenceFieldUpdater.compareAndSet(abstractFuture, object, object2))) continue;
                bl2 = true;
                break block1;
            } while ((v4 = atomicReferenceFieldUpdater.get(abstractFuture)) == object);
            bl2 = false;
            abstractFuture = null;
        }
        return bl2;
    }

    public boolean casWaiters(AbstractFuture abstractFuture, AbstractFuture$Waiter abstractFuture$Waiter, AbstractFuture$Waiter abstractFuture$Waiter2) {
        boolean bl2;
        block1: {
            Object v4;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.waitersUpdater;
            do {
                boolean bl3;
                if (!(bl3 = atomicReferenceFieldUpdater.compareAndSet(abstractFuture, abstractFuture$Waiter, abstractFuture$Waiter2))) continue;
                bl2 = true;
                break block1;
            } while ((v4 = atomicReferenceFieldUpdater.get(abstractFuture)) == abstractFuture$Waiter);
            bl2 = false;
            abstractFuture = null;
        }
        return bl2;
    }

    public AbstractFuture$Listener gasListeners(AbstractFuture abstractFuture, AbstractFuture$Listener abstractFuture$Listener) {
        return this.listenersUpdater.getAndSet(abstractFuture, abstractFuture$Listener);
    }

    public AbstractFuture$Waiter gasWaiters(AbstractFuture abstractFuture, AbstractFuture$Waiter abstractFuture$Waiter) {
        return this.waitersUpdater.getAndSet(abstractFuture, abstractFuture$Waiter);
    }

    public void putNext(AbstractFuture$Waiter abstractFuture$Waiter, AbstractFuture$Waiter abstractFuture$Waiter2) {
        this.waiterNextUpdater.lazySet(abstractFuture$Waiter, abstractFuture$Waiter2);
    }

    public void putThread(AbstractFuture$Waiter abstractFuture$Waiter, Thread thread2) {
        this.waiterThreadUpdater.lazySet(abstractFuture$Waiter, thread2);
    }
}

