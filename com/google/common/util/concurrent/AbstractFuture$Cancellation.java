/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;

final class AbstractFuture$Cancellation {
    static final AbstractFuture$Cancellation CAUSELESS_CANCELLED;
    static final AbstractFuture$Cancellation CAUSELESS_INTERRUPTED;
    final Throwable cause;
    final boolean wasInterrupted;

    static {
        boolean bl2 = AbstractFuture.GENERATE_CANCELLATION_CAUSES;
        if (bl2) {
            CAUSELESS_CANCELLED = null;
            CAUSELESS_INTERRUPTED = null;
        } else {
            AbstractFuture$Cancellation abstractFuture$Cancellation;
            CAUSELESS_CANCELLED = abstractFuture$Cancellation = new AbstractFuture$Cancellation(false, null);
            boolean bl3 = true;
            CAUSELESS_INTERRUPTED = abstractFuture$Cancellation = new AbstractFuture$Cancellation(bl3, null);
        }
    }

    public AbstractFuture$Cancellation(boolean bl2, Throwable throwable) {
        this.wasInterrupted = bl2;
        this.cause = throwable;
    }
}

