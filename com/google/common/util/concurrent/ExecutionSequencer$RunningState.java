/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

final class ExecutionSequencer$RunningState
extends Enum {
    private static final /* synthetic */ ExecutionSequencer$RunningState[] $VALUES;
    public static final /* enum */ ExecutionSequencer$RunningState CANCELLED;
    public static final /* enum */ ExecutionSequencer$RunningState NOT_RUN;
    public static final /* enum */ ExecutionSequencer$RunningState STARTED;

    private static /* synthetic */ ExecutionSequencer$RunningState[] $values() {
        ExecutionSequencer$RunningState executionSequencer$RunningState = NOT_RUN;
        executionSequencer$RunningState = CANCELLED;
        executionSequencer$RunningState = STARTED;
        ExecutionSequencer$RunningState[] executionSequencer$RunningStateArray = new ExecutionSequencer$RunningState[]{executionSequencer$RunningState, executionSequencer$RunningState, executionSequencer$RunningState};
        return executionSequencer$RunningStateArray;
    }

    static {
        ExecutionSequencer$RunningState executionSequencer$RunningState;
        NOT_RUN = executionSequencer$RunningState = new ExecutionSequencer$RunningState("NOT_RUN", 0);
        CANCELLED = executionSequencer$RunningState = new ExecutionSequencer$RunningState("CANCELLED", 1);
        STARTED = executionSequencer$RunningState = new ExecutionSequencer$RunningState("STARTED", 2);
        $VALUES = ExecutionSequencer$RunningState.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ExecutionSequencer$RunningState() {
        void var2_-1;
        void var1_-1;
    }

    public static ExecutionSequencer$RunningState valueOf(String string2) {
        return Enum.valueOf(ExecutionSequencer$RunningState.class, string2);
    }

    public static ExecutionSequencer$RunningState[] values() {
        return (ExecutionSequencer$RunningState[])$VALUES.clone();
    }
}

