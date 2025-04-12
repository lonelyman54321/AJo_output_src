/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting;

public final class TrackerType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ TrackerType[] $VALUES;
    public static final /* enum */ TrackerType CLICK;
    public static final /* enum */ TrackerType IMPRESSION;
    public static final /* enum */ TrackerType VIEWABLE;

    private static final /* synthetic */ TrackerType[] $values() {
        TrackerType trackerType = CLICK;
        trackerType = IMPRESSION;
        trackerType = VIEWABLE;
        TrackerType[] trackerTypeArray = new TrackerType[]{trackerType, trackerType, trackerType};
        return trackerTypeArray;
    }

    static {
        Enum[] enumArray = new TrackerType("CLICK", 0);
        CLICK = enumArray;
        enumArray = new TrackerType("IMPRESSION", 1);
        IMPRESSION = enumArray;
        enumArray = new TrackerType("VIEWABLE", 2);
        VIEWABLE = enumArray;
        enumArray = TrackerType.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TrackerType() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static TrackerType valueOf(String string2) {
        return Enum.valueOf(TrackerType.class, string2);
    }

    public static TrackerType[] values() {
        return (TrackerType[])$VALUES.clone();
    }
}

