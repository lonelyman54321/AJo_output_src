/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

final class Graphs$NodeVisitState
extends Enum {
    private static final /* synthetic */ Graphs$NodeVisitState[] $VALUES;
    public static final /* enum */ Graphs$NodeVisitState COMPLETE;
    public static final /* enum */ Graphs$NodeVisitState PENDING;

    private static /* synthetic */ Graphs$NodeVisitState[] $values() {
        Graphs$NodeVisitState graphs$NodeVisitState = PENDING;
        graphs$NodeVisitState = COMPLETE;
        Graphs$NodeVisitState[] graphs$NodeVisitStateArray = new Graphs$NodeVisitState[]{graphs$NodeVisitState, graphs$NodeVisitState};
        return graphs$NodeVisitStateArray;
    }

    static {
        Graphs$NodeVisitState graphs$NodeVisitState;
        PENDING = graphs$NodeVisitState = new Graphs$NodeVisitState("PENDING", 0);
        COMPLETE = graphs$NodeVisitState = new Graphs$NodeVisitState("COMPLETE", 1);
        $VALUES = Graphs$NodeVisitState.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Graphs$NodeVisitState() {
        void var2_-1;
        void var1_-1;
    }

    public static Graphs$NodeVisitState valueOf(String string2) {
        return Enum.valueOf(Graphs$NodeVisitState.class, string2);
    }

    public static Graphs$NodeVisitState[] values() {
        return (Graphs$NodeVisitState[])$VALUES.clone();
    }
}

