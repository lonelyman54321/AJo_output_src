/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractFuture$AtomicHelper;
import java.util.concurrent.locks.LockSupport;

final class AbstractFuture$Waiter {
    static final AbstractFuture$Waiter TOMBSTONE;
    volatile AbstractFuture$Waiter next;
    volatile Thread thread;

    static {
        AbstractFuture$Waiter abstractFuture$Waiter;
        TOMBSTONE = abstractFuture$Waiter = new AbstractFuture$Waiter(false);
    }

    public AbstractFuture$Waiter() {
        AbstractFuture$AtomicHelper abstractFuture$AtomicHelper = AbstractFuture.access$200();
        Thread thread2 = Thread.currentThread();
        abstractFuture$AtomicHelper.putThread(this, thread2);
    }

    public AbstractFuture$Waiter(boolean bl2) {
    }

    public void setNext(AbstractFuture$Waiter abstractFuture$Waiter) {
        AbstractFuture.access$200().putNext(this, abstractFuture$Waiter);
    }

    public void unpark() {
        Thread thread2 = this.thread;
        if (thread2 != null) {
            this.thread = null;
            LockSupport.unpark(thread2);
        }
    }
}

