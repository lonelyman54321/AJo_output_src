/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.analytics;

public final class LogManager$LogMode
extends Enum {
    private static final /* synthetic */ LogManager$LogMode[] $VALUES;
    public static final /* enum */ LogManager$LogMode BOTH;
    public static final /* enum */ LogManager$LogMode BYTE_D_JSON;
    public static final /* enum */ LogManager$LogMode JSON_ARRAY;

    private static final /* synthetic */ LogManager$LogMode[] $values() {
        LogManager$LogMode logManager$LogMode = JSON_ARRAY;
        logManager$LogMode = BYTE_D_JSON;
        logManager$LogMode = BOTH;
        LogManager$LogMode[] logManager$LogModeArray = new LogManager$LogMode[]{logManager$LogMode, logManager$LogMode, logManager$LogMode};
        return logManager$LogModeArray;
    }

    static {
        LogManager$LogMode logManager$LogMode;
        JSON_ARRAY = logManager$LogMode = new LogManager$LogMode("JSON_ARRAY", 0);
        BYTE_D_JSON = logManager$LogMode = new LogManager$LogMode("BYTE_D_JSON", 1);
        BOTH = logManager$LogMode = new LogManager$LogMode("BOTH", 2);
        $VALUES = LogManager$LogMode.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LogManager$LogMode() {
        void var2_-1;
        void var1_-1;
    }

    public static LogManager$LogMode valueOf(String string2) {
        return Enum.valueOf(LogManager$LogMode.class, string2);
    }

    public static LogManager$LogMode[] values() {
        return (LogManager$LogMode[])$VALUES.clone();
    }
}

