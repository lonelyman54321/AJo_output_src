/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.analytics;

final class LoggerState
extends Enum {
    private static final /* synthetic */ LoggerState[] $VALUES;
    public static final /* enum */ LoggerState BUFFERING;
    public static final /* enum */ LoggerState IDLE;
    public static final /* enum */ LoggerState PUSHING;
    public static final /* enum */ LoggerState TERMINATED;

    private static /* synthetic */ LoggerState[] $values() {
        LoggerState loggerState = IDLE;
        loggerState = BUFFERING;
        loggerState = PUSHING;
        loggerState = TERMINATED;
        LoggerState[] loggerStateArray = new LoggerState[]{loggerState, loggerState, loggerState, loggerState};
        return loggerStateArray;
    }

    static {
        LoggerState loggerState;
        IDLE = loggerState = new LoggerState("IDLE", 0);
        BUFFERING = loggerState = new LoggerState("BUFFERING", 1);
        PUSHING = loggerState = new LoggerState("PUSHING", 2);
        TERMINATED = loggerState = new LoggerState("TERMINATED", 3);
        $VALUES = LoggerState.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LoggerState() {
        void var2_-1;
        void var1_-1;
    }

    public static LoggerState valueOf(String string2) {
        return Enum.valueOf(LoggerState.class, string2);
    }

    public static LoggerState[] values() {
        return (LoggerState[])$VALUES.clone();
    }
}

