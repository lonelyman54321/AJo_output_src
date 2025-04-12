/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.components.Preconditions;
import com.google.firebase.concurrent.n;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

class LimitedConcurrencyExecutor
implements Executor {
    private final Executor delegate;
    private final LinkedBlockingQueue queue;
    private final Semaphore semaphore;

    public LimitedConcurrencyExecutor(Executor object, int n3) {
        LinkedBlockingQueue linkedBlockingQueue;
        this.queue = linkedBlockingQueue = new LinkedBlockingQueue();
        boolean bl2 = true;
        boolean bl3 = n3 > 0;
        Preconditions.checkArgument(bl3, "concurrency must be positive.");
        this.delegate = object;
        this.semaphore = object = new Semaphore(n3, bl2);
    }

    public static /* synthetic */ void a(LimitedConcurrencyExecutor limitedConcurrencyExecutor, Runnable runnable2) {
        limitedConcurrencyExecutor.lambda$decorate$0(runnable2);
    }

    private Runnable decorate(Runnable runnable2) {
        n n3 = new n(this, runnable2);
        return n3;
    }

    private /* synthetic */ void lambda$decorate$0(Runnable runnable2) {
        try {
            runnable2.run();
            return;
        }
        finally {
            this.semaphore.release();
            this.maybeEnqueueNext();
        }
    }

    private void maybeEnqueueNext() {
        Object object;
        boolean bl2;
        while (bl2 = ((Semaphore)(object = this.semaphore)).tryAcquire()) {
            object = (Runnable)this.queue.poll();
            if (object != null) {
                Executor executor = this.delegate;
                object = this.decorate((Runnable)object);
                executor.execute((Runnable)object);
                continue;
            }
            object = this.semaphore;
            ((Semaphore)object).release();
            break;
        }
    }

    public void execute(Runnable runnable2) {
        this.queue.offer(runnable2);
        this.maybeEnqueueNext();
    }
}

