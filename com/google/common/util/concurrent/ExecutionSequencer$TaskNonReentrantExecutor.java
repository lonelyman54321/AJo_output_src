/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ExecutionSequencer;
import com.google.common.util.concurrent.ExecutionSequencer$1;
import com.google.common.util.concurrent.ExecutionSequencer$RunningState;
import com.google.common.util.concurrent.ExecutionSequencer$ThreadConfinedTaskQueue;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

final class ExecutionSequencer$TaskNonReentrantExecutor
extends AtomicReference
implements Executor,
Runnable {
    Executor delegate;
    ExecutionSequencer sequencer;
    Thread submitting;
    Runnable task;

    private ExecutionSequencer$TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer) {
        ExecutionSequencer$RunningState executionSequencer$RunningState = ExecutionSequencer$RunningState.NOT_RUN;
        super(executionSequencer$RunningState);
        this.delegate = executor;
        this.sequencer = executionSequencer;
    }

    public /* synthetic */ ExecutionSequencer$TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer, ExecutionSequencer.1 var3_3) {
        this(executor, executionSequencer);
    }

    public static /* synthetic */ boolean access$200(ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor) {
        return executionSequencer$TaskNonReentrantExecutor.trySetStarted();
    }

    public static /* synthetic */ boolean access$400(ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor) {
        return executionSequencer$TaskNonReentrantExecutor.trySetCancelled();
    }

    private boolean trySetCancelled() {
        ExecutionSequencer$RunningState executionSequencer$RunningState = ExecutionSequencer$RunningState.NOT_RUN;
        ExecutionSequencer$RunningState executionSequencer$RunningState2 = ExecutionSequencer$RunningState.CANCELLED;
        return this.compareAndSet(executionSequencer$RunningState, executionSequencer$RunningState2);
    }

    private boolean trySetStarted() {
        ExecutionSequencer$RunningState executionSequencer$RunningState = ExecutionSequencer$RunningState.NOT_RUN;
        ExecutionSequencer$RunningState executionSequencer$RunningState2 = ExecutionSequencer$RunningState.STARTED;
        return this.compareAndSet(executionSequencer$RunningState, executionSequencer$RunningState2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void execute(Runnable object) {
        Throwable throwable2;
        block7: {
            block8: {
                Object object2;
                block6: {
                    boolean bl2;
                    Object object3;
                    object2 = this.get();
                    if (object2 == (object3 = ExecutionSequencer$RunningState.CANCELLED)) {
                        this.delegate = null;
                        this.sequencer = null;
                        return;
                    }
                    object2 = Thread.currentThread();
                    this.submitting = object2;
                    try {
                        object2 = this.sequencer;
                        Objects.requireNonNull(object2);
                        object2 = ExecutionSequencer.access$300(object2);
                        object3 = ((ExecutionSequencer$ThreadConfinedTaskQueue)object2).thread;
                        Thread thread2 = this.submitting;
                        if (object3 != thread2) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    this.sequencer = null;
                    object3 = ((ExecutionSequencer$ThreadConfinedTaskQueue)object2).nextTask;
                    if (object3 == null) {
                        bl2 = true;
                    } else {
                        bl2 = false;
                        object3 = null;
                    }
                    Preconditions.checkState(bl2);
                    ((ExecutionSequencer$ThreadConfinedTaskQueue)object2).nextTask = object;
                    object = this.delegate;
                    Objects.requireNonNull(object);
                    ((ExecutionSequencer$ThreadConfinedTaskQueue)object2).nextExecutor = object = (Executor)object;
                    this.delegate = null;
                    break block8;
                }
                object2 = this.delegate;
                Objects.requireNonNull(object2);
                object2 = (Executor)object2;
                this.delegate = null;
                this.task = object;
                object2.execute(this);
            }
            this.submitting = null;
            return;
        }
        this.submitting = null;
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        Throwable throwable2;
        block4: {
            Object object;
            Object object2 = Thread.currentThread();
            if (object2 != (object = this.submitting)) {
                object2 = this.task;
                Objects.requireNonNull(object2);
                object2 = (Runnable)object2;
                this.task = null;
                object2.run();
                return;
            }
            object = new ExecutionSequencer$ThreadConfinedTaskQueue(null);
            ((ExecutionSequencer$ThreadConfinedTaskQueue)object).thread = object2;
            object2 = this.sequencer;
            Objects.requireNonNull(object2);
            ExecutionSequencer.access$302((ExecutionSequencer)object2, (ExecutionSequencer$ThreadConfinedTaskQueue)object);
            this.sequencer = null;
            try {
                Executor executor;
                object2 = this.task;
                Objects.requireNonNull(object2);
                object2 = (Runnable)object2;
                this.task = null;
                object2.run();
                while ((object2 = ((ExecutionSequencer$ThreadConfinedTaskQueue)object).nextTask) != null && (executor = ((ExecutionSequencer$ThreadConfinedTaskQueue)object).nextExecutor) != null) {
                    ((ExecutionSequencer$ThreadConfinedTaskQueue)object).nextTask = null;
                    ((ExecutionSequencer$ThreadConfinedTaskQueue)object).nextExecutor = null;
                    executor.execute((Runnable)object2);
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            ((ExecutionSequencer$ThreadConfinedTaskQueue)object).thread = null;
            return;
        }
        ((ExecutionSequencer$ThreadConfinedTaskQueue)object).thread = null;
        throw throwable2;
    }
}

