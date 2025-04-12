/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ExecutionList {
    private static final Logger log = Logger.getLogger(ExecutionList.class.getName());
    private boolean executed;
    private ExecutionList$RunnableExecutorPair runnables;

    private static void executeListener(Runnable object, Executor executor) {
        try {
            executor.execute((Runnable)object);
        }
        catch (RuntimeException runtimeException) {
            Logger logger = log;
            Level level = Level.SEVERE;
            String string2 = "RuntimeException while executing runnable ";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            stringBuilder.append(" with executor ");
            stringBuilder.append(executor);
            object = stringBuilder.toString();
            logger.log(level, (String)object, runtimeException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void add(Runnable runnable2, Executor executor) {
        Preconditions.checkNotNull(runnable2, "Runnable was null.");
        Object object = "Executor was null.";
        Preconditions.checkNotNull(executor, object);
        // MONITORENTER : this
        boolean bl2 = this.executed;
        if (!bl2) {
            ExecutionList$RunnableExecutorPair executionList$RunnableExecutorPair = this.runnables;
            this.runnables = object = new ExecutionList$RunnableExecutorPair(runnable2, executor, executionList$RunnableExecutorPair);
            // MONITOREXIT : this
            return;
        }
        ExecutionList.executeListener(runnable2, executor);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void execute() {
        // MONITORENTER : this
        boolean bl2 = this.executed;
        if (bl2) {
            // MONITOREXIT : this
            return;
        }
        this.executed = bl2 = true;
        Object object3 = this.runnables;
        Object object2 = null;
        this.runnables = null;
        // MONITOREXIT : this
        while (true) {
            Object object;
            if (object3 == null) {
                while (object2 != null) {
                    object3 = ((ExecutionList$RunnableExecutorPair)object2).runnable;
                    object = ((ExecutionList$RunnableExecutorPair)object2).executor;
                    ExecutionList.executeListener((Runnable)object3, (Executor)object);
                    object2 = ((ExecutionList$RunnableExecutorPair)object2).next;
                }
                return;
            }
            object = ((ExecutionList$RunnableExecutorPair)object3).next;
            ((ExecutionList$RunnableExecutorPair)object3).next = object2;
            object2 = object3;
            object3 = object;
        }
    }
}

