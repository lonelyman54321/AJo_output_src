/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;

public final class LogEventDropped$Reason
extends Enum
implements ProtoEnum {
    private static final /* synthetic */ LogEventDropped$Reason[] $VALUES;
    public static final /* enum */ LogEventDropped$Reason CACHE_FULL;
    public static final /* enum */ LogEventDropped$Reason INVALID_PAYLOD;
    public static final /* enum */ LogEventDropped$Reason MAX_RETRIES_REACHED;
    public static final /* enum */ LogEventDropped$Reason MESSAGE_TOO_OLD;
    public static final /* enum */ LogEventDropped$Reason PAYLOAD_TOO_BIG;
    public static final /* enum */ LogEventDropped$Reason REASON_UNKNOWN;
    public static final /* enum */ LogEventDropped$Reason SERVER_ERROR;
    private final int number_;

    static {
        LogEventDropped$Reason logEventDropped$Reason;
        LogEventDropped$Reason logEventDropped$Reason2;
        LogEventDropped$Reason logEventDropped$Reason3;
        LogEventDropped$Reason logEventDropped$Reason4;
        LogEventDropped$Reason logEventDropped$Reason5;
        LogEventDropped$Reason logEventDropped$Reason6;
        LogEventDropped$Reason logEventDropped$Reason7;
        REASON_UNKNOWN = logEventDropped$Reason7 = new LogEventDropped$Reason("REASON_UNKNOWN", 0, 0);
        int n3 = 1;
        MESSAGE_TOO_OLD = logEventDropped$Reason6 = new LogEventDropped$Reason("MESSAGE_TOO_OLD", n3, n3);
        int n4 = 2;
        CACHE_FULL = logEventDropped$Reason5 = new LogEventDropped$Reason("CACHE_FULL", n4, n4);
        int n7 = 3;
        PAYLOAD_TOO_BIG = logEventDropped$Reason4 = new LogEventDropped$Reason("PAYLOAD_TOO_BIG", n7, n7);
        int n8 = 4;
        MAX_RETRIES_REACHED = logEventDropped$Reason3 = new LogEventDropped$Reason("MAX_RETRIES_REACHED", n8, n8);
        int n10 = 5;
        INVALID_PAYLOD = logEventDropped$Reason2 = new LogEventDropped$Reason("INVALID_PAYLOD", n10, n10);
        int n14 = 6;
        SERVER_ERROR = logEventDropped$Reason = new LogEventDropped$Reason("SERVER_ERROR", n14, n14);
        LogEventDropped$Reason[] logEventDropped$ReasonArray = new LogEventDropped$Reason[7];
        logEventDropped$ReasonArray[0] = logEventDropped$Reason7;
        logEventDropped$ReasonArray[n3] = logEventDropped$Reason6;
        logEventDropped$ReasonArray[n4] = logEventDropped$Reason5;
        logEventDropped$ReasonArray[n7] = logEventDropped$Reason4;
        logEventDropped$ReasonArray[n8] = logEventDropped$Reason3;
        logEventDropped$ReasonArray[n10] = logEventDropped$Reason2;
        logEventDropped$ReasonArray[n14] = logEventDropped$Reason;
        $VALUES = logEventDropped$ReasonArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LogEventDropped$Reason() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.number_ = var3_2;
    }

    public static LogEventDropped$Reason valueOf(String string2) {
        return Enum.valueOf(LogEventDropped$Reason.class, string2);
    }

    public static LogEventDropped$Reason[] values() {
        return (LogEventDropped$Reason[])$VALUES.clone();
    }

    public int getNumber() {
        return this.number_;
    }
}

