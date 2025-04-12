/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

final class AbstractFuture$Listener {
    static final AbstractFuture$Listener TOMBSTONE;
    final Executor executor;
    AbstractFuture$Listener next;
    final Runnable task;

    static {
        AbstractFuture$Listener abstractFuture$Listener;
        TOMBSTONE = abstractFuture$Listener = new AbstractFuture$Listener();
    }

    public AbstractFuture$Listener() {
        this.task = null;
        this.executor = null;
    }

    public AbstractFuture$Listener(Runnable runnable2, Executor executor) {
        this.task = runnable2;
        this.executor = executor;
    }
}

