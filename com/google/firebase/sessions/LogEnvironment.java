/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;

public final class LogEnvironment
extends Enum
implements NumberedEnum {
    private static final /* synthetic */ LogEnvironment[] $VALUES;
    public static final /* enum */ LogEnvironment LOG_ENVIRONMENT_AUTOPUSH;
    public static final /* enum */ LogEnvironment LOG_ENVIRONMENT_PROD;
    public static final /* enum */ LogEnvironment LOG_ENVIRONMENT_STAGING;
    public static final /* enum */ LogEnvironment LOG_ENVIRONMENT_UNKNOWN;
    private final int number;

    private static final /* synthetic */ LogEnvironment[] $values() {
        LogEnvironment logEnvironment = LOG_ENVIRONMENT_UNKNOWN;
        logEnvironment = LOG_ENVIRONMENT_AUTOPUSH;
        logEnvironment = LOG_ENVIRONMENT_STAGING;
        logEnvironment = LOG_ENVIRONMENT_PROD;
        LogEnvironment[] logEnvironmentArray = new LogEnvironment[]{logEnvironment, logEnvironment, logEnvironment, logEnvironment};
        return logEnvironmentArray;
    }

    static {
        LogEnvironment logEnvironment;
        LOG_ENVIRONMENT_UNKNOWN = logEnvironment = new LogEnvironment("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        int n3 = 1;
        LOG_ENVIRONMENT_AUTOPUSH = logEnvironment = new LogEnvironment("LOG_ENVIRONMENT_AUTOPUSH", n3, n3);
        n3 = 2;
        LOG_ENVIRONMENT_STAGING = logEnvironment = new LogEnvironment("LOG_ENVIRONMENT_STAGING", n3, n3);
        n3 = 3;
        LOG_ENVIRONMENT_PROD = logEnvironment = new LogEnvironment("LOG_ENVIRONMENT_PROD", n3, n3);
        $VALUES = LogEnvironment.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LogEnvironment() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.number = var3_2;
    }

    public static LogEnvironment valueOf(String string2) {
        return Enum.valueOf(LogEnvironment.class, string2);
    }

    public static LogEnvironment[] values() {
        return (LogEnvironment[])$VALUES.clone();
    }

    public int getNumber() {
        return this.number;
    }
}

