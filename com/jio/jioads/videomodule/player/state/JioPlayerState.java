/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule.player.state;

public final class JioPlayerState
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioPlayerState[] $VALUES;
    public static final /* enum */ JioPlayerState COMPLETED;
    public static final /* enum */ JioPlayerState ERROR;
    public static final /* enum */ JioPlayerState IDEAL;
    public static final /* enum */ JioPlayerState PAUSED;
    public static final /* enum */ JioPlayerState PLAYING;
    public static final /* enum */ JioPlayerState PREPARED;
    public static final /* enum */ JioPlayerState PREPARING;
    public static final /* enum */ JioPlayerState RELEASED;

    static {
        JioPlayerState jioPlayerState;
        JioPlayerState jioPlayerState2;
        JioPlayerState jioPlayerState3;
        JioPlayerState jioPlayerState4;
        JioPlayerState jioPlayerState5;
        JioPlayerState jioPlayerState6;
        JioPlayerState jioPlayerState7;
        JioPlayerState jioPlayerState8;
        IDEAL = jioPlayerState8 = new JioPlayerState("IDEAL", 0);
        int n3 = 1;
        PREPARING = jioPlayerState7 = new JioPlayerState("PREPARING", n3);
        int n4 = 2;
        PREPARED = jioPlayerState6 = new JioPlayerState("PREPARED", n4);
        int n7 = 3;
        PLAYING = jioPlayerState5 = new JioPlayerState("PLAYING", n7);
        int n8 = 4;
        PAUSED = jioPlayerState4 = new JioPlayerState("PAUSED", n8);
        int n10 = 5;
        RELEASED = jioPlayerState3 = new JioPlayerState("RELEASED", n10);
        ERROR = jioPlayerState2 = new JioPlayerState("ERROR", 6);
        int n14 = 7;
        COMPLETED = jioPlayerState = new JioPlayerState("COMPLETED", n14);
        Enum[] enumArray = new JioPlayerState[8];
        enumArray[0] = jioPlayerState8;
        enumArray[n3] = jioPlayerState7;
        enumArray[n4] = jioPlayerState6;
        enumArray[n7] = jioPlayerState5;
        enumArray[n8] = jioPlayerState4;
        enumArray[n10] = jioPlayerState3;
        enumArray[6] = jioPlayerState2;
        enumArray[n14] = jioPlayerState;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioPlayerState() {
        void var2_-1;
        void var1_-1;
    }

    public static JioPlayerState valueOf(String string2) {
        return Enum.valueOf(JioPlayerState.class, string2);
    }

    public static JioPlayerState[] values() {
        return (JioPlayerState[])$VALUES.clone();
    }
}

