/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews.widgets;

public final class ScrollState
extends Enum {
    private static final /* synthetic */ ScrollState[] $VALUES;
    public static final /* enum */ ScrollState DOWN;
    public static final /* enum */ ScrollState STOP;
    public static final /* enum */ ScrollState UP;

    private static /* synthetic */ ScrollState[] $values() {
        ScrollState scrollState = STOP;
        scrollState = UP;
        scrollState = DOWN;
        ScrollState[] scrollStateArray = new ScrollState[]{scrollState, scrollState, scrollState};
        return scrollStateArray;
    }

    static {
        ScrollState scrollState;
        STOP = scrollState = new ScrollState("STOP", 0);
        UP = scrollState = new ScrollState("UP", 1);
        DOWN = scrollState = new ScrollState("DOWN", 2);
        $VALUES = ScrollState.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ScrollState() {
        void var2_-1;
        void var1_-1;
    }

    public static ScrollState valueOf(String string2) {
        return Enum.valueOf(ScrollState.class, string2);
    }

    public static ScrollState[] values() {
        return (ScrollState[])$VALUES.clone();
    }
}

