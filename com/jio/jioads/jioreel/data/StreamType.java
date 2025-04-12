/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.data;

public final class StreamType
extends Enum {
    public static final /* enum */ StreamType LIVE;
    public static final /* enum */ StreamType VOD;
    public static final /* synthetic */ StreamType[] a;
    public static final /* synthetic */ ga0_2 b;

    static {
        StreamType streamType;
        StreamType streamType2;
        VOD = streamType2 = new StreamType("VOD", 0);
        int n3 = 1;
        LIVE = streamType = new StreamType("LIVE", n3);
        Enum[] enumArray = new StreamType[2];
        enumArray[0] = streamType2;
        enumArray[n3] = streamType;
        a = enumArray;
        b = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public StreamType() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return b;
    }

    public static StreamType valueOf(String string2) {
        return Enum.valueOf(StreamType.class, string2);
    }

    public static StreamType[] values() {
        return (StreamType[])a.clone();
    }
}

