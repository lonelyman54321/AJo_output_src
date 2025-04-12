/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.heartbeatinfo;

public final class HeartBeatInfo$HeartBeat
extends Enum {
    private static final /* synthetic */ HeartBeatInfo$HeartBeat[] $VALUES;
    public static final /* enum */ HeartBeatInfo$HeartBeat COMBINED;
    public static final /* enum */ HeartBeatInfo$HeartBeat GLOBAL;
    public static final /* enum */ HeartBeatInfo$HeartBeat NONE;
    public static final /* enum */ HeartBeatInfo$HeartBeat SDK;
    private final int code;

    private static /* synthetic */ HeartBeatInfo$HeartBeat[] $values() {
        HeartBeatInfo$HeartBeat heartBeatInfo$HeartBeat = NONE;
        heartBeatInfo$HeartBeat = SDK;
        heartBeatInfo$HeartBeat = GLOBAL;
        heartBeatInfo$HeartBeat = COMBINED;
        HeartBeatInfo$HeartBeat[] heartBeatInfo$HeartBeatArray = new HeartBeatInfo$HeartBeat[]{heartBeatInfo$HeartBeat, heartBeatInfo$HeartBeat, heartBeatInfo$HeartBeat, heartBeatInfo$HeartBeat};
        return heartBeatInfo$HeartBeatArray;
    }

    static {
        HeartBeatInfo$HeartBeat heartBeatInfo$HeartBeat;
        NONE = heartBeatInfo$HeartBeat = new HeartBeatInfo$HeartBeat("NONE", 0, 0);
        int n3 = 1;
        SDK = heartBeatInfo$HeartBeat = new HeartBeatInfo$HeartBeat("SDK", n3, n3);
        n3 = 2;
        GLOBAL = heartBeatInfo$HeartBeat = new HeartBeatInfo$HeartBeat("GLOBAL", n3, n3);
        n3 = 3;
        COMBINED = heartBeatInfo$HeartBeat = new HeartBeatInfo$HeartBeat("COMBINED", n3, n3);
        $VALUES = HeartBeatInfo$HeartBeat.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HeartBeatInfo$HeartBeat() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.code = var3_2;
    }

    public static HeartBeatInfo$HeartBeat valueOf(String string2) {
        return Enum.valueOf(HeartBeatInfo$HeartBeat.class, string2);
    }

    public static HeartBeatInfo$HeartBeat[] values() {
        return (HeartBeatInfo$HeartBeat[])$VALUES.clone();
    }

    public int getCode() {
        return this.code;
    }
}

