/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.ssai;

public final class TrackerType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ TrackerType[] $VALUES;
    public static final /* enum */ TrackerType COMPLETE;
    public static final /* enum */ TrackerType IMPRESSION;

    static {
        TrackerType trackerType;
        TrackerType trackerType2;
        IMPRESSION = trackerType2 = new TrackerType("IMPRESSION", 0);
        int n3 = 1;
        COMPLETE = trackerType = new TrackerType("COMPLETE", n3);
        Enum[] enumArray = new TrackerType[2];
        enumArray[0] = trackerType2;
        enumArray[n3] = trackerType;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public TrackerType() {
        void var2_-1;
        void var1_-1;
    }

    public static TrackerType valueOf(String string2) {
        return Enum.valueOf(TrackerType.class, string2);
    }

    public static TrackerType[] values() {
        return (TrackerType[])$VALUES.clone();
    }
}

