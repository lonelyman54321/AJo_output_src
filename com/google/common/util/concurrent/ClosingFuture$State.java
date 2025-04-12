/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

final class ClosingFuture$State
extends Enum {
    private static final /* synthetic */ ClosingFuture$State[] $VALUES;
    public static final /* enum */ ClosingFuture$State CLOSED;
    public static final /* enum */ ClosingFuture$State CLOSING;
    public static final /* enum */ ClosingFuture$State OPEN;
    public static final /* enum */ ClosingFuture$State SUBSUMED;
    public static final /* enum */ ClosingFuture$State WILL_CLOSE;
    public static final /* enum */ ClosingFuture$State WILL_CREATE_VALUE_AND_CLOSER;

    private static /* synthetic */ ClosingFuture$State[] $values() {
        ClosingFuture$State closingFuture$State = OPEN;
        closingFuture$State = SUBSUMED;
        closingFuture$State = WILL_CLOSE;
        closingFuture$State = CLOSING;
        closingFuture$State = CLOSED;
        closingFuture$State = WILL_CREATE_VALUE_AND_CLOSER;
        ClosingFuture$State[] closingFuture$StateArray = new ClosingFuture$State[]{closingFuture$State, closingFuture$State, closingFuture$State, closingFuture$State, closingFuture$State, closingFuture$State};
        return closingFuture$StateArray;
    }

    static {
        ClosingFuture$State closingFuture$State;
        OPEN = closingFuture$State = new ClosingFuture$State("OPEN", 0);
        SUBSUMED = closingFuture$State = new ClosingFuture$State("SUBSUMED", 1);
        WILL_CLOSE = closingFuture$State = new ClosingFuture$State("WILL_CLOSE", 2);
        CLOSING = closingFuture$State = new ClosingFuture$State("CLOSING", 3);
        CLOSED = closingFuture$State = new ClosingFuture$State("CLOSED", 4);
        WILL_CREATE_VALUE_AND_CLOSER = closingFuture$State = new ClosingFuture$State("WILL_CREATE_VALUE_AND_CLOSER", 5);
        $VALUES = ClosingFuture$State.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ClosingFuture$State() {
        void var2_-1;
        void var1_-1;
    }

    public static ClosingFuture$State valueOf(String string2) {
        return Enum.valueOf(ClosingFuture$State.class, string2);
    }

    public static ClosingFuture$State[] values() {
        return (ClosingFuture$State[])$VALUES.clone();
    }
}

