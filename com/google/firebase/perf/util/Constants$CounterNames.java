/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.util;

public final class Constants$CounterNames
extends Enum {
    private static final /* synthetic */ Constants$CounterNames[] $VALUES;
    public static final /* enum */ Constants$CounterNames FRAMES_FROZEN;
    public static final /* enum */ Constants$CounterNames FRAMES_SLOW;
    public static final /* enum */ Constants$CounterNames FRAMES_TOTAL;
    public static final /* enum */ Constants$CounterNames NETWORK_TRACE_EVENT_RATE_LIMITED;
    public static final /* enum */ Constants$CounterNames TRACE_EVENT_RATE_LIMITED;
    public static final /* enum */ Constants$CounterNames TRACE_STARTED_NOT_STOPPED;
    private String mName;

    private static /* synthetic */ Constants$CounterNames[] $values() {
        Constants$CounterNames constants$CounterNames = TRACE_EVENT_RATE_LIMITED;
        constants$CounterNames = NETWORK_TRACE_EVENT_RATE_LIMITED;
        constants$CounterNames = TRACE_STARTED_NOT_STOPPED;
        constants$CounterNames = FRAMES_TOTAL;
        constants$CounterNames = FRAMES_SLOW;
        constants$CounterNames = FRAMES_FROZEN;
        Constants$CounterNames[] constants$CounterNamesArray = new Constants$CounterNames[]{constants$CounterNames, constants$CounterNames, constants$CounterNames, constants$CounterNames, constants$CounterNames, constants$CounterNames};
        return constants$CounterNamesArray;
    }

    static {
        Constants$CounterNames constants$CounterNames;
        TRACE_EVENT_RATE_LIMITED = constants$CounterNames = new Constants$CounterNames("TRACE_EVENT_RATE_LIMITED", 0, "_fstec");
        NETWORK_TRACE_EVENT_RATE_LIMITED = constants$CounterNames = new Constants$CounterNames("NETWORK_TRACE_EVENT_RATE_LIMITED", 1, "_fsntc");
        TRACE_STARTED_NOT_STOPPED = constants$CounterNames = new Constants$CounterNames("TRACE_STARTED_NOT_STOPPED", 2, "_tsns");
        FRAMES_TOTAL = constants$CounterNames = new Constants$CounterNames("FRAMES_TOTAL", 3, "_fr_tot");
        FRAMES_SLOW = constants$CounterNames = new Constants$CounterNames("FRAMES_SLOW", 4, "_fr_slo");
        FRAMES_FROZEN = constants$CounterNames = new Constants$CounterNames("FRAMES_FROZEN", 5, "_fr_fzn");
        $VALUES = Constants$CounterNames.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Constants$CounterNames() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.mName = var3_2;
    }

    public static Constants$CounterNames valueOf(String string2) {
        return Enum.valueOf(Constants$CounterNames.class, string2);
    }

    public static Constants$CounterNames[] values() {
        return (Constants$CounterNames[])$VALUES.clone();
    }

    public String toString() {
        return this.mName;
    }
}

