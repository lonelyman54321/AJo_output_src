/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.InterruptibleTask$Blocker;
import com.google.common.util.concurrent.InterruptibleTask$DoNothingRunnable;
import com.google.common.util.concurrent.NullnessCasts;
import com.google.common.util.concurrent.Platform;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

abstract class InterruptibleTask
extends AtomicReference
implements Runnable {
    private static final Runnable DONE;
    private static final int MAX_BUSY_WAIT_SPINS = 1000;
    private static final Runnable PARKED;

    static {
        InterruptibleTask$DoNothingRunnable interruptibleTask$DoNothingRunnable = new InterruptibleTask$DoNothingRunnable(null);
        DONE = interruptibleTask$DoNothingRunnable;
        interruptibleTask$DoNothingRunnable = new InterruptibleTask$DoNothingRunnable(null);
        PARKED = interruptibleTask$DoNothingRunnable;
    }

    private void waitForInterrupt(Thread thread2) {
        Runnable runnable2 = (Runnable)this.get();
        Runnable runnable3 = null;
        boolean bl2 = false;
        int n3 = 0;
        while (true) {
            int n4;
            Runnable runnable4;
            int n7;
            if ((n7 = runnable2 instanceof InterruptibleTask$Blocker) == 0 && runnable2 != (runnable4 = PARKED)) {
                if (bl2) {
                    thread2.interrupt();
                }
                return;
            }
            if (n7 != 0) {
                runnable3 = runnable2;
                runnable3 = (InterruptibleTask$Blocker)runnable2;
            }
            if ((n3 += (n7 = 1)) > (n4 = 1000)) {
                boolean bl3;
                runnable4 = PARKED;
                if (runnable2 == runnable4 || (bl3 = this.compareAndSet(runnable2, runnable4))) {
                    bl3 = Thread.interrupted();
                    bl2 = bl3 || bl2;
                    LockSupport.park(runnable3);
                }
            } else {
                Thread.yield();
            }
            runnable2 = (Runnable)this.get();
        }
    }

    public abstract void afterRanInterruptiblyFailure(Throwable var1);

    public abstract void afterRanInterruptiblySuccess(Object var1);

    public final void interruptTask() {
        Runnable runnable2 = (Runnable)this.get();
        boolean bl2 = runnable2 instanceof Thread;
        if (bl2) {
            Runnable runnable3 = new InterruptibleTask$Blocker(this, null);
            Thread thread2 = Thread.currentThread();
            InterruptibleTask$Blocker.access$200((InterruptibleTask$Blocker)runnable3, thread2);
            bl2 = this.compareAndSet(runnable2, runnable3);
            if (bl2) {
                runnable3 = runnable2;
                try {
                    runnable3 = (Thread)runnable2;
                    ((Thread)runnable3).interrupt();
                }
                finally {
                    Runnable runnable5 = DONE;
                    runnable5 = this.getAndSet(runnable5);
                    Runnable runnable6 = PARKED;
                    if (runnable5 == runnable6) {
                        runnable2 = (Thread)runnable2;
                        LockSupport.unpark((Thread)runnable2);
                    }
                }
            }
        }
    }

    public abstract boolean isDone();

    public final void run() {
        block12: {
            Runnable runnable2;
            boolean bl2;
            Object object = Thread.currentThread();
            boolean bl3 = false;
            Object object2 = null;
            boolean bl4 = this.compareAndSet(null, object);
            if (!bl4) {
                return;
            }
            bl4 = this.isDone() ^ true;
            if (bl4) {
                try {
                    object2 = this.runInterruptibly();
                }
                catch (Throwable throwable) {
                    try {
                        Platform.restoreInterruptIfIsInterruptedException(throwable);
                        object2 = DONE;
                        bl3 = this.compareAndSet(object, object2);
                        if (!bl3) {
                            this.waitForInterrupt((Thread)object);
                        }
                        if (bl4) {
                            this.afterRanInterruptiblyFailure(throwable);
                        }
                        break block12;
                    }
                    catch (Throwable throwable2) {
                        Runnable runnable3 = DONE;
                        boolean bl5 = this.compareAndSet(object, runnable3);
                        if (!bl5) {
                            this.waitForInterrupt((Thread)object);
                        }
                        if (bl4) {
                            object = NullnessCasts.uncheckedCastNullableTToT(null);
                            this.afterRanInterruptiblySuccess(object);
                        }
                        throw throwable2;
                    }
                }
            }
            if (!(bl2 = this.compareAndSet(object, runnable2 = DONE))) {
                this.waitForInterrupt((Thread)object);
            }
            if (bl4) {
                object = NullnessCasts.uncheckedCastNullableTToT(object2);
                this.afterRanInterruptiblySuccess(object);
            }
        }
    }

    public abstract Object runInterruptibly();

    public abstract String toPendingString();

    public final String toString() {
        Object object;
        Object object2 = (Runnable)this.get();
        if (object2 == (object = DONE)) {
            object2 = "running=[DONE]";
        } else {
            boolean bl2 = object2 instanceof InterruptibleTask$Blocker;
            if (bl2) {
                object2 = "running=[INTERRUPTED]";
            } else {
                bl2 = object2 instanceof Thread;
                if (bl2) {
                    String string2 = "running=[RUNNING ON ";
                    object = new StringBuilder(string2);
                    object2 = ((Thread)object2).getName();
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append("]");
                    object2 = ((StringBuilder)object).toString();
                } else {
                    object2 = "running=[NOT STARTED YET]";
                }
            }
        }
        object2 = nn_2.a((String)object2, ", ");
        object = this.toPendingString();
        ((StringBuilder)object2).append((String)object);
        return ((StringBuilder)object2).toString();
    }
}

