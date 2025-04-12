/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractFuture$TrustedFuture;

final class ImmediateFuture$ImmediateCancelledFuture
extends AbstractFuture$TrustedFuture {
    static final ImmediateFuture$ImmediateCancelledFuture INSTANCE;

    static {
        ImmediateFuture$ImmediateCancelledFuture immediateFuture$ImmediateCancelledFuture;
        boolean bl2 = AbstractFuture.GENERATE_CANCELLATION_CAUSES;
        if (bl2) {
            bl2 = false;
            immediateFuture$ImmediateCancelledFuture = null;
        } else {
            immediateFuture$ImmediateCancelledFuture = new ImmediateFuture$ImmediateCancelledFuture();
        }
        INSTANCE = immediateFuture$ImmediateCancelledFuture;
    }

    public ImmediateFuture$ImmediateCancelledFuture() {
        this.cancel(false);
    }
}

