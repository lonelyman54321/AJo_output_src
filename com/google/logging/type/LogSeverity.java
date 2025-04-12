/*
 * Decompiled with CFR 0.152.
 */
package com.google.logging.type;

import com.google.logging.type.LogSeverity$1;
import com.google.logging.type.LogSeverity$LogSeverityVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class LogSeverity
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ LogSeverity[] $VALUES;
    public static final /* enum */ LogSeverity ALERT;
    public static final int ALERT_VALUE = 700;
    public static final /* enum */ LogSeverity CRITICAL;
    public static final int CRITICAL_VALUE = 600;
    public static final /* enum */ LogSeverity DEBUG;
    public static final int DEBUG_VALUE = 100;
    public static final /* enum */ LogSeverity DEFAULT;
    public static final int DEFAULT_VALUE = 0;
    public static final /* enum */ LogSeverity EMERGENCY;
    public static final int EMERGENCY_VALUE = 800;
    public static final /* enum */ LogSeverity ERROR;
    public static final int ERROR_VALUE = 500;
    public static final /* enum */ LogSeverity INFO;
    public static final int INFO_VALUE = 200;
    public static final /* enum */ LogSeverity NOTICE;
    public static final int NOTICE_VALUE = 300;
    public static final /* enum */ LogSeverity UNRECOGNIZED;
    public static final /* enum */ LogSeverity WARNING;
    public static final int WARNING_VALUE = 400;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        LogSeverity logSeverity;
        LogSeverity logSeverity2;
        LogSeverity logSeverity3;
        LogSeverity logSeverity4;
        LogSeverity logSeverity5;
        LogSeverity logSeverity6;
        LogSeverity logSeverity7;
        LogSeverity logSeverity8;
        LogSeverity logSeverity9;
        Object object = new LogSeverity("DEFAULT", 0, 0);
        DEFAULT = object;
        int n3 = 1;
        DEBUG = logSeverity9 = new LogSeverity("DEBUG", n3, 100);
        int n4 = 2;
        INFO = logSeverity8 = new LogSeverity("INFO", n4, 200);
        NOTICE = logSeverity7 = new LogSeverity("NOTICE", 3, 300);
        WARNING = logSeverity6 = new LogSeverity("WARNING", 4, 400);
        ERROR = logSeverity5 = new LogSeverity("ERROR", 5, 500);
        CRITICAL = logSeverity4 = new LogSeverity("CRITICAL", 6, 600);
        ALERT = logSeverity3 = new LogSeverity("ALERT", 7, 700);
        EMERGENCY = logSeverity2 = new LogSeverity("EMERGENCY", 8, 800);
        int n7 = 9;
        UNRECOGNIZED = logSeverity = new LogSeverity("UNRECOGNIZED", n7, -1);
        LogSeverity[] logSeverityArray = new LogSeverity[10];
        logSeverityArray[0] = object;
        logSeverityArray[n3] = logSeverity9;
        logSeverityArray[n4] = logSeverity8;
        logSeverityArray[3] = logSeverity7;
        logSeverityArray[4] = logSeverity6;
        logSeverityArray[5] = logSeverity5;
        logSeverityArray[6] = logSeverity4;
        logSeverityArray[7] = logSeverity3;
        logSeverityArray[8] = logSeverity2;
        logSeverityArray[n7] = logSeverity;
        $VALUES = logSeverityArray;
        internalValueMap = object = new LogSeverity$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LogSeverity() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static LogSeverity forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 100;
            if (n3 != n4) {
                n4 = 200;
                if (n3 != n4) {
                    n4 = 300;
                    if (n3 != n4) {
                        n4 = 400;
                        if (n3 != n4) {
                            n4 = 500;
                            if (n3 != n4) {
                                n4 = 600;
                                if (n3 != n4) {
                                    n4 = 700;
                                    if (n3 != n4) {
                                        n4 = 800;
                                        if (n3 != n4) {
                                            return null;
                                        }
                                        return EMERGENCY;
                                    }
                                    return ALERT;
                                }
                                return CRITICAL;
                            }
                            return ERROR;
                        }
                        return WARNING;
                    }
                    return NOTICE;
                }
                return INFO;
            }
            return DEBUG;
        }
        return DEFAULT;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return LogSeverity$LogSeverityVerifier.INSTANCE;
    }

    public static LogSeverity valueOf(int n3) {
        return LogSeverity.forNumber(n3);
    }

    public static LogSeverity valueOf(String string2) {
        return Enum.valueOf(LogSeverity.class, string2);
    }

    public static LogSeverity[] values() {
        return (LogSeverity[])$VALUES.clone();
    }

    public final int getNumber() {
        Object object = UNRECOGNIZED;
        if (this != object) {
            return this.value;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

