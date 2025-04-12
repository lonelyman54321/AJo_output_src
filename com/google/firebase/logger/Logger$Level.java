/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.logger;

public final class Logger$Level
extends Enum {
    private static final /* synthetic */ Logger$Level[] $VALUES;
    public static final /* enum */ Logger$Level DEBUG;
    public static final /* enum */ Logger$Level ERROR;
    public static final /* enum */ Logger$Level INFO;
    public static final /* enum */ Logger$Level VERBOSE;
    public static final /* enum */ Logger$Level WARN;
    private final int priority;

    private static final /* synthetic */ Logger$Level[] $values() {
        Logger$Level logger$Level = VERBOSE;
        logger$Level = DEBUG;
        logger$Level = INFO;
        logger$Level = WARN;
        logger$Level = ERROR;
        Logger$Level[] logger$LevelArray = new Logger$Level[]{logger$Level, logger$Level, logger$Level, logger$Level, logger$Level};
        return logger$LevelArray;
    }

    static {
        Logger$Level logger$Level;
        int n3 = 2;
        VERBOSE = logger$Level = new Logger$Level("VERBOSE", 0, n3);
        int n4 = 3;
        DEBUG = logger$Level = new Logger$Level("DEBUG", 1, n4);
        int n7 = 4;
        INFO = logger$Level = new Logger$Level("INFO", n3, n7);
        WARN = logger$Level = new Logger$Level("WARN", n4, 5);
        ERROR = logger$Level = new Logger$Level("ERROR", n7, 6);
        $VALUES = Logger$Level.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Logger$Level() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.priority = var3_2;
    }

    public static Logger$Level valueOf(String string2) {
        return Enum.valueOf(Logger$Level.class, string2);
    }

    public static Logger$Level[] values() {
        return (Logger$Level[])$VALUES.clone();
    }

    public final int getPriority$com_google_firebase_firebase_common() {
        return this.priority;
    }
}

