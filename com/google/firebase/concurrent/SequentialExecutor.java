/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.concurrent.SequentialExecutor$1;
import com.google.firebase.concurrent.SequentialExecutor$QueueWorker;
import com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

final class SequentialExecutor
implements Executor {
    private static final Logger log = Logger.getLogger(SequentialExecutor.class.getName());
    private final Executor executor;
    private final Deque queue;
    private final SequentialExecutor$QueueWorker worker;
    private long workerRunCount;
    private SequentialExecutor$WorkerRunningState workerRunningState;

    public SequentialExecutor(Executor executor) {
        Object object;
        this.queue = object = new Object();
        object = SequentialExecutor$WorkerRunningState.IDLE;
        this.workerRunningState = object;
        this.workerRunCount = 0L;
        super(this, null);
        this.worker = object;
        this.executor = executor = (Executor)Preconditions.checkNotNull(executor);
    }

    public static /* synthetic */ Deque access$100(SequentialExecutor sequentialExecutor) {
        return sequentialExecutor.queue;
    }

    public static /* synthetic */ SequentialExecutor$WorkerRunningState access$200(SequentialExecutor sequentialExecutor) {
        return sequentialExecutor.workerRunningState;
    }

    public static /* synthetic */ SequentialExecutor$WorkerRunningState access$202(SequentialExecutor sequentialExecutor, SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState) {
        sequentialExecutor.workerRunningState = sequentialExecutor$WorkerRunningState;
        return sequentialExecutor$WorkerRunningState;
    }

    public static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long l2;
        long l3 = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = l2 = 1L + l3;
        return l3;
    }

    public static /* synthetic */ Logger access$400() {
        return log;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void execute(Runnable object) {
        Object object2;
        block21: {
            void var1_5;
            boolean bl2;
            Object object3;
            block22: {
                Preconditions.checkNotNull(object /* !! */ );
                object3 = this.queue;
                // MONITORENTER : object3
                object2 = this.workerRunningState;
                Object object4 = SequentialExecutor$WorkerRunningState.RUNNING;
                if (object2 == object4 || object2 == (object4 = SequentialExecutor$WorkerRunningState.QUEUED)) break block21;
                long l2 = this.workerRunCount;
                object2 = new SequentialExecutor$1(this, (Runnable)object /* !! */ );
                object /* !! */  = this.queue;
                object /* !! */ .add(object2);
                object /* !! */  = SequentialExecutor$WorkerRunningState.QUEUING;
                this.workerRunningState = object /* !! */ ;
                // MONITOREXIT : object3
                object3 = this.executor;
                SequentialExecutor$QueueWorker sequentialExecutor$QueueWorker = this.worker;
                object3.execute(sequentialExecutor$QueueWorker);
                object3 = this.workerRunningState;
                if (object3 != object /* !! */ ) {
                    return;
                }
                object3 = this.queue;
                // MONITORENTER : object3
                long l3 = this.workerRunCount;
                long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                if (l4 != false || (object2 = this.workerRunningState) != object /* !! */ ) return;
                this.workerRunningState = object4;
                return;
                catch (Error error) {
                }
                catch (RuntimeException runtimeException) {
                    // empty catch block
                }
                object4 = this.queue;
                // MONITORENTER : object4
                object3 = this.workerRunningState;
                SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState = SequentialExecutor$WorkerRunningState.IDLE;
                if (object3 != sequentialExecutor$WorkerRunningState && object3 != (sequentialExecutor$WorkerRunningState = SequentialExecutor$WorkerRunningState.QUEUING) || !(bl2 = (object3 = this.queue).removeLastOccurrence(object2))) break block22;
                bl2 = true;
            }
            bl2 = false;
            object3 = null;
            boolean bl3 = var1_5 instanceof RejectedExecutionException;
            if (!bl3) throw (Throwable)var1_5;
            if (bl2) throw (Throwable)var1_5;
            // MONITOREXIT : object4
            return;
        }
        object2 = this.queue;
        object2.add(object /* !! */ );
        // MONITOREXIT : object3
        return;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SequentialExecutor@");
        int n3 = System.identityHashCode(this);
        stringBuilder.append(n3);
        stringBuilder.append("{");
        Executor executor = this.executor;
        stringBuilder.append(executor);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

