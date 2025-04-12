/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.util;

public final class Constants$TraceNames
extends Enum {
    private static final /* synthetic */ Constants$TraceNames[] $VALUES;
    public static final /* enum */ Constants$TraceNames APP_START_TRACE_NAME;
    public static final /* enum */ Constants$TraceNames BACKGROUND_TRACE_NAME;
    public static final /* enum */ Constants$TraceNames FOREGROUND_TRACE_NAME;
    public static final /* enum */ Constants$TraceNames ON_CREATE_TRACE_NAME;
    public static final /* enum */ Constants$TraceNames ON_RESUME_TRACE_NAME;
    public static final /* enum */ Constants$TraceNames ON_START_TRACE_NAME;
    private String mName;

    private static /* synthetic */ Constants$TraceNames[] $values() {
        Constants$TraceNames constants$TraceNames = APP_START_TRACE_NAME;
        constants$TraceNames = ON_CREATE_TRACE_NAME;
        constants$TraceNames = ON_START_TRACE_NAME;
        constants$TraceNames = ON_RESUME_TRACE_NAME;
        constants$TraceNames = FOREGROUND_TRACE_NAME;
        constants$TraceNames = BACKGROUND_TRACE_NAME;
        Constants$TraceNames[] constants$TraceNamesArray = new Constants$TraceNames[]{constants$TraceNames, constants$TraceNames, constants$TraceNames, constants$TraceNames, constants$TraceNames, constants$TraceNames};
        return constants$TraceNamesArray;
    }

    static {
        Constants$TraceNames constants$TraceNames;
        APP_START_TRACE_NAME = constants$TraceNames = new Constants$TraceNames("APP_START_TRACE_NAME", 0, "_as");
        ON_CREATE_TRACE_NAME = constants$TraceNames = new Constants$TraceNames("ON_CREATE_TRACE_NAME", 1, "_astui");
        ON_START_TRACE_NAME = constants$TraceNames = new Constants$TraceNames("ON_START_TRACE_NAME", 2, "_astfd");
        ON_RESUME_TRACE_NAME = constants$TraceNames = new Constants$TraceNames("ON_RESUME_TRACE_NAME", 3, "_asti");
        FOREGROUND_TRACE_NAME = constants$TraceNames = new Constants$TraceNames("FOREGROUND_TRACE_NAME", 4, "_fs");
        BACKGROUND_TRACE_NAME = constants$TraceNames = new Constants$TraceNames("BACKGROUND_TRACE_NAME", 5, "_bs");
        $VALUES = Constants$TraceNames.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Constants$TraceNames() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.mName = var3_2;
    }

    public static Constants$TraceNames valueOf(String string2) {
        return Enum.valueOf(Constants$TraceNames.class, string2);
    }

    public static Constants$TraceNames[] values() {
        return (Constants$TraceNames[])$VALUES.clone();
    }

    public String toString() {
        return this.mName;
    }
}

