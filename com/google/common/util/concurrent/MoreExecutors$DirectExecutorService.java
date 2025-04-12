/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors$1;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

final class MoreExecutors$DirectExecutorService
extends AbstractListeningExecutorService {
    private final Object lock;
    private int runningTasks;
    private boolean shutdown;

    private MoreExecutors$DirectExecutorService() {
        Object object;
        this.lock = object = new Object();
        this.runningTasks = 0;
        this.shutdown = false;
    }

    public /* synthetic */ MoreExecutors$DirectExecutorService(MoreExecutors$1 moreExecutors$1) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void endTask() {
        Object object = this.lock;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        int n3;
                        this.runningTasks = n3 = this.runningTasks + -1;
                        if (n3 != 0) break block3;
                        Object object2 = this.lock;
                        object2.notifyAll();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void startTask() {
        Object object = this.lock;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    int n3 = this.shutdown;
                    if (n3 == 0) {
                        this.runningTasks = n3 = this.runningTasks + 1;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                String string2 = "Executor already shutdown";
                RejectedExecutionException rejectedExecutionException = new RejectedExecutionException(string2);
                throw rejectedExecutionException;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean awaitTermination(long l2, TimeUnit object) {
        l2 = object.toNanos(l2);
        object = this.lock;
        synchronized (object) {
            try {
                while (true) {
                    int n3;
                    if ((n3 = this.shutdown) != 0 && (n3 = this.runningTasks) == 0) {
                        return true;
                    }
                    long l3 = 0L;
                    long l4 = l2 - l3;
                    Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object2 <= 0) {
                        return false;
                    }
                    l3 = System.nanoTime();
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    Object object3 = this.lock;
                    timeUnit.timedWait(object3, l2);
                    long l7 = System.nanoTime() - l3;
                    l2 -= l7;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void execute(Runnable runnable2) {
        this.startTask();
        try {
            runnable2.run();
            return;
        }
        finally {
            this.endTask();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isShutdown() {
        Object object = this.lock;
        synchronized (object) {
            return this.shutdown;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isTerminated() {
        Object object = this.lock;
        synchronized (object) {
            try {
                int n3 = this.shutdown;
                if (n3 == 0) return 0 != 0;
                n3 = this.runningTasks;
                if (n3 != 0) return 0 != 0;
                return 1 != 0;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void shutdown() {
        Object object = this.lock;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    int n3 = 1;
                    try {
                        this.shutdown = n3;
                        n3 = this.runningTasks;
                        if (n3 != 0) break block3;
                        Object object2 = this.lock;
                        object2.notifyAll();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public List shutdownNow() {
        this.shutdown();
        return Collections.emptyList();
    }
}

