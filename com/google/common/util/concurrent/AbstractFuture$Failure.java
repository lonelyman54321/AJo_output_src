/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture$Failure$1;

final class AbstractFuture$Failure {
    static final AbstractFuture$Failure FALLBACK_INSTANCE;
    final Throwable exception;

    static {
        AbstractFuture$Failure abstractFuture$Failure;
        AbstractFuture$Failure$1 abstractFuture$Failure$1 = new AbstractFuture$Failure$1("Failure occurred while trying to finish a future.");
        FALLBACK_INSTANCE = abstractFuture$Failure = new AbstractFuture$Failure(abstractFuture$Failure$1);
    }

    public AbstractFuture$Failure(Throwable throwable) {
        this.exception = throwable = (Throwable)Preconditions.checkNotNull(throwable);
    }
}

