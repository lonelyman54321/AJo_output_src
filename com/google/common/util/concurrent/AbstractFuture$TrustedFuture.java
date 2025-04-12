/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractFuture$Trusted;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

abstract class AbstractFuture$TrustedFuture
extends AbstractFuture
implements AbstractFuture$Trusted {
    public final void addListener(Runnable runnable2, Executor executor) {
        super.addListener(runnable2, executor);
    }

    public final boolean cancel(boolean bl2) {
        return super.cancel(bl2);
    }

    public final Object get() {
        return super.get();
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        return super.get(l2, timeUnit);
    }

    public final boolean isCancelled() {
        return super.isCancelled();
    }

    public final boolean isDone() {
        return super.isDone();
    }
}

