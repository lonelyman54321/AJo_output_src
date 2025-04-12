/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

final class SequentialExecutor$WorkerRunningState
extends Enum {
    private static final /* synthetic */ SequentialExecutor$WorkerRunningState[] $VALUES;
    public static final /* enum */ SequentialExecutor$WorkerRunningState IDLE;
    public static final /* enum */ SequentialExecutor$WorkerRunningState QUEUED;
    public static final /* enum */ SequentialExecutor$WorkerRunningState QUEUING;
    public static final /* enum */ SequentialExecutor$WorkerRunningState RUNNING;

    private static /* synthetic */ SequentialExecutor$WorkerRunningState[] $values() {
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState = IDLE;
        sequentialExecutor$WorkerRunningState = QUEUING;
        sequentialExecutor$WorkerRunningState = QUEUED;
        sequentialExecutor$WorkerRunningState = RUNNING;
        SequentialExecutor$WorkerRunningState[] sequentialExecutor$WorkerRunningStateArray = new SequentialExecutor$WorkerRunningState[]{sequentialExecutor$WorkerRunningState, sequentialExecutor$WorkerRunningState, sequentialExecutor$WorkerRunningState, sequentialExecutor$WorkerRunningState};
        return sequentialExecutor$WorkerRunningStateArray;
    }

    static {
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState;
        IDLE = sequentialExecutor$WorkerRunningState = new SequentialExecutor$WorkerRunningState("IDLE", 0);
        QUEUING = sequentialExecutor$WorkerRunningState = new SequentialExecutor$WorkerRunningState("QUEUING", 1);
        QUEUED = sequentialExecutor$WorkerRunningState = new SequentialExecutor$WorkerRunningState("QUEUED", 2);
        RUNNING = sequentialExecutor$WorkerRunningState = new SequentialExecutor$WorkerRunningState("RUNNING", 3);
        $VALUES = SequentialExecutor$WorkerRunningState.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SequentialExecutor$WorkerRunningState() {
        void var2_-1;
        void var1_-1;
    }

    public static SequentialExecutor$WorkerRunningState valueOf(String string2) {
        return Enum.valueOf(SequentialExecutor$WorkerRunningState.class, string2);
    }

    public static SequentialExecutor$WorkerRunningState[] values() {
        return (SequentialExecutor$WorkerRunningState[])$VALUES.clone();
    }
}

