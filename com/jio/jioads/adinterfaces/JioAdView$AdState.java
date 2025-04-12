/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAdView$AdState
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioAdView$AdState[] $VALUES;
    public static final /* enum */ JioAdView$AdState CLOSED;
    public static final /* enum */ JioAdView$AdState COLLAPSED;
    public static final /* enum */ JioAdView$AdState DESTROYED;
    public static final /* enum */ JioAdView$AdState ENDED;
    public static final /* enum */ JioAdView$AdState EXPANDED;
    public static final /* enum */ JioAdView$AdState FAILED;
    public static final /* enum */ JioAdView$AdState INTERACTED;
    public static final /* enum */ JioAdView$AdState NOT_REQUESTED;
    public static final /* enum */ JioAdView$AdState PREPARED;
    public static final /* enum */ JioAdView$AdState RECEIVED;
    public static final /* enum */ JioAdView$AdState REQUESTED;
    public static final /* enum */ JioAdView$AdState STARTED;
    public static final /* enum */ JioAdView$AdState STARTING;

    static {
        JioAdView$AdState jioAdView$AdState;
        JioAdView$AdState jioAdView$AdState2;
        JioAdView$AdState jioAdView$AdState3;
        JioAdView$AdState jioAdView$AdState4;
        JioAdView$AdState jioAdView$AdState5;
        JioAdView$AdState jioAdView$AdState6;
        JioAdView$AdState jioAdView$AdState7;
        JioAdView$AdState jioAdView$AdState8;
        JioAdView$AdState jioAdView$AdState9;
        JioAdView$AdState jioAdView$AdState10;
        JioAdView$AdState jioAdView$AdState11;
        JioAdView$AdState jioAdView$AdState12;
        JioAdView$AdState jioAdView$AdState13;
        NOT_REQUESTED = jioAdView$AdState13 = new JioAdView$AdState("NOT_REQUESTED", 0);
        REQUESTED = jioAdView$AdState12 = new JioAdView$AdState("REQUESTED", 1);
        RECEIVED = jioAdView$AdState11 = new JioAdView$AdState("RECEIVED", 2);
        PREPARED = jioAdView$AdState10 = new JioAdView$AdState("PREPARED", 3);
        STARTING = jioAdView$AdState9 = new JioAdView$AdState("STARTING", 4);
        FAILED = jioAdView$AdState8 = new JioAdView$AdState("FAILED", 5);
        STARTED = jioAdView$AdState7 = new JioAdView$AdState("STARTED", 6);
        ENDED = jioAdView$AdState6 = new JioAdView$AdState("ENDED", 7);
        CLOSED = jioAdView$AdState5 = new JioAdView$AdState("CLOSED", 8);
        EXPANDED = jioAdView$AdState4 = new JioAdView$AdState("EXPANDED", 9);
        COLLAPSED = jioAdView$AdState3 = new JioAdView$AdState("COLLAPSED", 10);
        INTERACTED = jioAdView$AdState2 = new JioAdView$AdState("INTERACTED", 11);
        int n3 = 12;
        DESTROYED = jioAdView$AdState = new JioAdView$AdState("DESTROYED", n3);
        Enum[] enumArray = new JioAdView$AdState[13];
        enumArray[0] = jioAdView$AdState13;
        enumArray[1] = jioAdView$AdState12;
        enumArray[2] = jioAdView$AdState11;
        enumArray[3] = jioAdView$AdState10;
        enumArray[4] = jioAdView$AdState9;
        enumArray[5] = jioAdView$AdState8;
        enumArray[6] = jioAdView$AdState7;
        enumArray[7] = jioAdView$AdState6;
        enumArray[8] = jioAdView$AdState5;
        enumArray[9] = jioAdView$AdState4;
        enumArray[10] = jioAdView$AdState3;
        enumArray[11] = jioAdView$AdState2;
        enumArray[n3] = jioAdView$AdState;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAdView$AdState() {
        void var2_-1;
        void var1_-1;
    }

    public static JioAdView$AdState valueOf(String string2) {
        return Enum.valueOf(JioAdView$AdState.class, string2);
    }

    public static JioAdView$AdState[] values() {
        return (JioAdView$AdState[])$VALUES.clone();
    }
}

