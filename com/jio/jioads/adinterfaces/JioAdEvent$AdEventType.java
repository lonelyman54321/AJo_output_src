/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAdEvent$AdEventType
extends Enum {
    public static final /* enum */ JioAdEvent$AdEventType AD_BREAK_ENDED;
    public static final /* enum */ JioAdEvent$AdEventType AD_BREAK_ERROR;
    public static final /* enum */ JioAdEvent$AdEventType AD_BREAK_READY;
    public static final /* enum */ JioAdEvent$AdEventType AD_BREAK_STARTED;
    public static final /* enum */ JioAdEvent$AdEventType AD_PROGRESS;
    public static final /* enum */ JioAdEvent$AdEventType ALL_ADS_COMPLETED;
    public static final /* enum */ JioAdEvent$AdEventType CLICKED;
    public static final /* enum */ JioAdEvent$AdEventType COMPLETED;
    public static final /* enum */ JioAdEvent$AdEventType CONTENT_PAUSE_REQUESTED;
    public static final /* enum */ JioAdEvent$AdEventType CONTENT_RESUME_REQUESTED;
    public static final /* enum */ JioAdEvent$AdEventType FIRST_QUARTILE;
    public static final /* enum */ JioAdEvent$AdEventType MIDPOINT;
    public static final /* enum */ JioAdEvent$AdEventType PAUSED;
    public static final /* enum */ JioAdEvent$AdEventType RESUMED;
    public static final /* enum */ JioAdEvent$AdEventType SKIPPED;
    public static final /* enum */ JioAdEvent$AdEventType STARTED;
    public static final /* enum */ JioAdEvent$AdEventType THIRD_QUARTILE;
    public static final /* synthetic */ JioAdEvent$AdEventType[] a;
    public static final /* synthetic */ ga0_2 b;

    static {
        JioAdEvent$AdEventType jioAdEvent$AdEventType;
        JioAdEvent$AdEventType jioAdEvent$AdEventType2;
        JioAdEvent$AdEventType jioAdEvent$AdEventType3;
        JioAdEvent$AdEventType jioAdEvent$AdEventType4;
        JioAdEvent$AdEventType jioAdEvent$AdEventType5;
        JioAdEvent$AdEventType jioAdEvent$AdEventType6;
        JioAdEvent$AdEventType jioAdEvent$AdEventType7;
        JioAdEvent$AdEventType jioAdEvent$AdEventType8;
        JioAdEvent$AdEventType jioAdEvent$AdEventType9;
        JioAdEvent$AdEventType jioAdEvent$AdEventType10;
        JioAdEvent$AdEventType jioAdEvent$AdEventType11;
        JioAdEvent$AdEventType jioAdEvent$AdEventType12;
        JioAdEvent$AdEventType jioAdEvent$AdEventType13;
        JioAdEvent$AdEventType jioAdEvent$AdEventType14;
        JioAdEvent$AdEventType jioAdEvent$AdEventType15;
        AD_BREAK_READY = jioAdEvent$AdEventType15 = new JioAdEvent$AdEventType("AD_BREAK_READY", 0);
        CONTENT_PAUSE_REQUESTED = jioAdEvent$AdEventType14 = new JioAdEvent$AdEventType("CONTENT_PAUSE_REQUESTED", 1);
        AD_BREAK_STARTED = jioAdEvent$AdEventType13 = new JioAdEvent$AdEventType("AD_BREAK_STARTED", 2);
        AD_BREAK_ERROR = jioAdEvent$AdEventType12 = new JioAdEvent$AdEventType("AD_BREAK_ERROR", 3);
        STARTED = jioAdEvent$AdEventType11 = new JioAdEvent$AdEventType("STARTED", 4);
        FIRST_QUARTILE = jioAdEvent$AdEventType10 = new JioAdEvent$AdEventType("FIRST_QUARTILE", 5);
        MIDPOINT = jioAdEvent$AdEventType9 = new JioAdEvent$AdEventType("MIDPOINT", 6);
        THIRD_QUARTILE = jioAdEvent$AdEventType8 = new JioAdEvent$AdEventType("THIRD_QUARTILE", 7);
        AD_PROGRESS = jioAdEvent$AdEventType7 = new JioAdEvent$AdEventType("AD_PROGRESS", 8);
        PAUSED = jioAdEvent$AdEventType6 = new JioAdEvent$AdEventType("PAUSED", 9);
        RESUMED = jioAdEvent$AdEventType5 = new JioAdEvent$AdEventType("RESUMED", 10);
        SKIPPED = jioAdEvent$AdEventType4 = new JioAdEvent$AdEventType("SKIPPED", 11);
        CLICKED = jioAdEvent$AdEventType3 = new JioAdEvent$AdEventType("CLICKED", 12);
        COMPLETED = jioAdEvent$AdEventType2 = new JioAdEvent$AdEventType("COMPLETED", 13);
        JioAdEvent$AdEventType jioAdEvent$AdEventType16 = jioAdEvent$AdEventType2;
        Enum[] enumArray = new JioAdEvent$AdEventType("AD_BREAK_ENDED", 14);
        AD_BREAK_ENDED = enumArray;
        Enum[] enumArray2 = enumArray;
        CONTENT_RESUME_REQUESTED = jioAdEvent$AdEventType = new JioAdEvent$AdEventType("CONTENT_RESUME_REQUESTED", 15);
        int n3 = 16;
        ALL_ADS_COMPLETED = jioAdEvent$AdEventType2 = new JioAdEvent$AdEventType("ALL_ADS_COMPLETED", n3);
        enumArray = new JioAdEvent$AdEventType[17];
        enumArray[0] = jioAdEvent$AdEventType15;
        enumArray[1] = jioAdEvent$AdEventType14;
        enumArray[2] = jioAdEvent$AdEventType13;
        enumArray[3] = jioAdEvent$AdEventType12;
        enumArray[4] = jioAdEvent$AdEventType11;
        enumArray[5] = jioAdEvent$AdEventType10;
        enumArray[6] = jioAdEvent$AdEventType9;
        enumArray[7] = jioAdEvent$AdEventType8;
        enumArray[8] = jioAdEvent$AdEventType7;
        enumArray[9] = jioAdEvent$AdEventType6;
        enumArray[10] = jioAdEvent$AdEventType5;
        enumArray[11] = jioAdEvent$AdEventType4;
        enumArray[12] = jioAdEvent$AdEventType3;
        enumArray[13] = jioAdEvent$AdEventType16;
        enumArray[14] = enumArray2;
        enumArray[15] = jioAdEvent$AdEventType;
        enumArray[n3] = jioAdEvent$AdEventType2;
        a = enumArray;
        b = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAdEvent$AdEventType() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return b;
    }

    public static JioAdEvent$AdEventType valueOf(String string2) {
        return Enum.valueOf(JioAdEvent$AdEventType.class, string2);
    }

    public static JioAdEvent$AdEventType[] values() {
        return (JioAdEvent$AdEventType[])a.clone();
    }
}

