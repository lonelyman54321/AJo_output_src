/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.tracker;

public final class JioEventTracker$TrackingEvents
extends Enum {
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_CLICK;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_CLOSE;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_COMPLETE;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_CREATIVE;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_EXIT_FULLSCREEN;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_FIRST_QUARTILE;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_FULLSCREEN;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_IMPRESSION;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_MID_QUARTILE;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_MUTE;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_PAUSE;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_RESUME;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_SKIP;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_START;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_THIRD_QUARTILE;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_UNMUTE;
    public static final /* enum */ JioEventTracker$TrackingEvents EVENT_VIEWABLE_IMPRESSION;
    public static final /* synthetic */ JioEventTracker$TrackingEvents[] b;
    public static final /* synthetic */ ga0_2 c;
    public final String a;

    static {
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents2;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents3;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents4;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents5;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents6;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents7;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents8;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents9;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents10;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents11;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents12;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents13;
        EVENT_CLICK = jioEventTracker$TrackingEvents13 = new JioEventTracker$TrackingEvents(0, "EVENT_CLICK", "click");
        EVENT_EXIT_FULLSCREEN = jioEventTracker$TrackingEvents12 = new JioEventTracker$TrackingEvents(1, "EVENT_EXIT_FULLSCREEN", "exitFullscreen");
        EVENT_IMPRESSION = jioEventTracker$TrackingEvents11 = new JioEventTracker$TrackingEvents(2, "EVENT_IMPRESSION", "impression");
        EVENT_VIEWABLE_IMPRESSION = jioEventTracker$TrackingEvents10 = new JioEventTracker$TrackingEvents(3, "EVENT_VIEWABLE_IMPRESSION", "viewableImpression");
        EVENT_START = jioEventTracker$TrackingEvents9 = new JioEventTracker$TrackingEvents(4, "EVENT_START", "start");
        EVENT_FIRST_QUARTILE = jioEventTracker$TrackingEvents8 = new JioEventTracker$TrackingEvents(5, "EVENT_FIRST_QUARTILE", "firstQuartile");
        EVENT_MID_QUARTILE = jioEventTracker$TrackingEvents7 = new JioEventTracker$TrackingEvents(6, "EVENT_MID_QUARTILE", "midpoint");
        EVENT_THIRD_QUARTILE = jioEventTracker$TrackingEvents6 = new JioEventTracker$TrackingEvents(7, "EVENT_THIRD_QUARTILE", "thirdQuartile");
        EVENT_COMPLETE = jioEventTracker$TrackingEvents5 = new JioEventTracker$TrackingEvents(8, "EVENT_COMPLETE", "complete");
        EVENT_MUTE = jioEventTracker$TrackingEvents4 = new JioEventTracker$TrackingEvents(9, "EVENT_MUTE", "mute");
        EVENT_UNMUTE = jioEventTracker$TrackingEvents3 = new JioEventTracker$TrackingEvents(10, "EVENT_UNMUTE", "unmute");
        EVENT_PAUSE = jioEventTracker$TrackingEvents2 = new JioEventTracker$TrackingEvents(11, "EVENT_PAUSE", "pause");
        EVENT_RESUME = jioEventTracker$TrackingEvents = new JioEventTracker$TrackingEvents(12, "EVENT_RESUME", "resume");
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents14 = jioEventTracker$TrackingEvents;
        Enum[] enumArray = new JioEventTracker$TrackingEvents(13, "EVENT_FULLSCREEN", "fullscreen");
        EVENT_FULLSCREEN = enumArray;
        Enum[] enumArray2 = enumArray;
        EVENT_CLOSE = jioEventTracker$TrackingEvents = new JioEventTracker$TrackingEvents(14, "EVENT_CLOSE", "close");
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents15 = jioEventTracker$TrackingEvents;
        enumArray = new JioEventTracker$TrackingEvents(15, "EVENT_SKIP", "skip");
        EVENT_SKIP = enumArray;
        int n3 = 16;
        Enum[] enumArray3 = enumArray;
        EVENT_CREATIVE = jioEventTracker$TrackingEvents = new JioEventTracker$TrackingEvents(n3, "EVENT_CREATIVE", "creativeView");
        enumArray = new JioEventTracker$TrackingEvents[17];
        enumArray[0] = jioEventTracker$TrackingEvents13;
        enumArray[1] = jioEventTracker$TrackingEvents12;
        enumArray[2] = jioEventTracker$TrackingEvents11;
        enumArray[3] = jioEventTracker$TrackingEvents10;
        enumArray[4] = jioEventTracker$TrackingEvents9;
        enumArray[5] = jioEventTracker$TrackingEvents8;
        enumArray[6] = jioEventTracker$TrackingEvents7;
        enumArray[7] = jioEventTracker$TrackingEvents6;
        enumArray[8] = jioEventTracker$TrackingEvents5;
        enumArray[9] = jioEventTracker$TrackingEvents4;
        enumArray[10] = jioEventTracker$TrackingEvents3;
        enumArray[11] = jioEventTracker$TrackingEvents2;
        enumArray[12] = jioEventTracker$TrackingEvents14;
        enumArray[13] = enumArray2;
        enumArray[14] = jioEventTracker$TrackingEvents15;
        enumArray[15] = enumArray3;
        enumArray[n3] = jioEventTracker$TrackingEvents;
        b = enumArray;
        c = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioEventTracker$TrackingEvents() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static ga0_2 getEntries() {
        return c;
    }

    public static JioEventTracker$TrackingEvents valueOf(String string2) {
        return Enum.valueOf(JioEventTracker$TrackingEvents.class, string2);
    }

    public static JioEventTracker$TrackingEvents[] values() {
        return (JioEventTracker$TrackingEvents[])b.clone();
    }

    public final String getType() {
        return this.a;
    }
}

