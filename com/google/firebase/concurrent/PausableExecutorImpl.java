/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.PausableExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

final class PausableExecutorImpl
implements PausableExecutor {
    private final Executor delegate;
    private volatile boolean paused;
    final LinkedBlockingQueue queue;

    public PausableExecutorImpl(boolean bl2, Executor executor) {
        LinkedBlockingQueue linkedBlockingQueue;
        this.queue = linkedBlockingQueue = new LinkedBlockingQueue();
        this.paused = bl2;
        this.delegate = executor;
    }

    private void maybeEnqueueNext() {
        boolean bl2 = this.paused;
        if (bl2) {
            return;
        }
        Runnable runnable2 = (Runnable)this.queue.poll();
        while (runnable2 != null) {
            Executor executor = this.delegate;
            executor.execute(runnable2);
            bl2 = this.paused;
            if (!bl2) {
                runnable2 = (Runnable)this.queue.poll();
                continue;
            }
            bl2 = false;
            runnable2 = null;
        }
    }

    public void execute(Runnable runnable2) {
        this.queue.offer(runnable2);
        this.maybeEnqueueNext();
    }

    public boolean isPaused() {
        return this.paused;
    }

    public void pause() {
        this.paused = true;
    }

    public void resume() {
        this.paused = false;
        this.maybeEnqueueNext();
    }
}

