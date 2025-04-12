/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

final class AbstractIterator$State
extends Enum {
    private static final /* synthetic */ AbstractIterator$State[] $VALUES;
    public static final /* enum */ AbstractIterator$State DONE;
    public static final /* enum */ AbstractIterator$State FAILED;
    public static final /* enum */ AbstractIterator$State NOT_READY;
    public static final /* enum */ AbstractIterator$State READY;

    private static /* synthetic */ AbstractIterator$State[] $values() {
        AbstractIterator$State abstractIterator$State = READY;
        abstractIterator$State = NOT_READY;
        abstractIterator$State = DONE;
        abstractIterator$State = FAILED;
        AbstractIterator$State[] abstractIterator$StateArray = new AbstractIterator$State[]{abstractIterator$State, abstractIterator$State, abstractIterator$State, abstractIterator$State};
        return abstractIterator$StateArray;
    }

    static {
        AbstractIterator$State abstractIterator$State;
        READY = abstractIterator$State = new AbstractIterator$State("READY", 0);
        NOT_READY = abstractIterator$State = new AbstractIterator$State("NOT_READY", 1);
        DONE = abstractIterator$State = new AbstractIterator$State("DONE", 2);
        FAILED = abstractIterator$State = new AbstractIterator$State("FAILED", 3);
        $VALUES = AbstractIterator$State.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AbstractIterator$State() {
        void var2_-1;
        void var1_-1;
    }

    public static AbstractIterator$State valueOf(String string2) {
        return Enum.valueOf(AbstractIterator$State.class, string2);
    }

    public static AbstractIterator$State[] values() {
        return (AbstractIterator$State[])$VALUES.clone();
    }
}

