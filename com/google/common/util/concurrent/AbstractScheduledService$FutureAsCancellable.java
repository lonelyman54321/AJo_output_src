/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractScheduledService$Cancellable;
import java.util.concurrent.Future;

final class AbstractScheduledService$FutureAsCancellable
implements AbstractScheduledService$Cancellable {
    private final Future delegate;

    public AbstractScheduledService$FutureAsCancellable(Future future) {
        this.delegate = future;
    }

    public void cancel(boolean bl2) {
        this.delegate.cancel(bl2);
    }

    public boolean isCancelled() {
        return this.delegate.isCancelled();
    }
}

