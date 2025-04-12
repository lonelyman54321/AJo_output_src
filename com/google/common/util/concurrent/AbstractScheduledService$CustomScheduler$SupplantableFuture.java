/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractScheduledService$Cancellable;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

final class AbstractScheduledService$CustomScheduler$SupplantableFuture
implements AbstractScheduledService$Cancellable {
    private Future currentFuture;
    private final ReentrantLock lock;

    public AbstractScheduledService$CustomScheduler$SupplantableFuture(ReentrantLock reentrantLock, Future future) {
        this.lock = reentrantLock;
        this.currentFuture = future;
    }

    public static /* synthetic */ Future access$600(AbstractScheduledService$CustomScheduler$SupplantableFuture abstractScheduledService$CustomScheduler$SupplantableFuture) {
        return abstractScheduledService$CustomScheduler$SupplantableFuture.currentFuture;
    }

    public static /* synthetic */ Future access$602(AbstractScheduledService$CustomScheduler$SupplantableFuture abstractScheduledService$CustomScheduler$SupplantableFuture, Future future) {
        abstractScheduledService$CustomScheduler$SupplantableFuture.currentFuture = future;
        return future;
    }

    public void cancel(boolean bl2) {
        Object object = this.lock;
        ((ReentrantLock)object).lock();
        try {
            object = this.currentFuture;
            object.cancel(bl2);
            return;
        }
        finally {
            this.lock.unlock();
        }
    }

    public boolean isCancelled() {
        Object object = this.lock;
        ((ReentrantLock)object).lock();
        try {
            object = this.currentFuture;
            boolean bl2 = object.isCancelled();
            return bl2;
        }
        finally {
            this.lock.unlock();
        }
    }
}

