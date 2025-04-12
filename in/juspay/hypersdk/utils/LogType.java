/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.utils;

public final class LogType
extends Enum {
    private static final /* synthetic */ LogType[] $VALUES;
    public static final /* enum */ LogType INITIATE_RESULT;
    public static final /* enum */ LogType INITIATE_START;
    public static final /* enum */ LogType PROCESS_END;
    public static final /* enum */ LogType PROCESS_QUEUED;
    public static final /* enum */ LogType PROCESS_START;

    private static /* synthetic */ LogType[] $values() {
        LogType logType = PROCESS_START;
        logType = PROCESS_END;
        logType = PROCESS_QUEUED;
        logType = INITIATE_START;
        logType = INITIATE_RESULT;
        LogType[] logTypeArray = new LogType[]{logType, logType, logType, logType, logType};
        return logTypeArray;
    }

    static {
        LogType logType;
        PROCESS_START = logType = new LogType("PROCESS_START", 0);
        PROCESS_END = logType = new LogType("PROCESS_END", 1);
        PROCESS_QUEUED = logType = new LogType("PROCESS_QUEUED", 2);
        INITIATE_START = logType = new LogType("INITIATE_START", 3);
        INITIATE_RESULT = logType = new LogType("INITIATE_RESULT", 4);
        $VALUES = LogType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LogType() {
        void var2_-1;
        void var1_-1;
    }

    public static LogType valueOf(String string2) {
        return Enum.valueOf(LogType.class, string2);
    }

    public static LogType[] values() {
        return (LogType[])$VALUES.clone();
    }
}

