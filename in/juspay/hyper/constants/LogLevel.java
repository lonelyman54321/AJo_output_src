/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hyper.constants;

public final class LogLevel {
    public static final String CRITICAL = "critical";
    public static final String DEBUG = "debug";
    public static final String ERROR = "error";
    public static final String INFO = "info";
    public static final LogLevel INSTANCE;
    public static final String WARNING = "warning";

    static {
        LogLevel logLevel;
        INSTANCE = logLevel = new LogLevel();
    }

    private LogLevel() {
    }
}

