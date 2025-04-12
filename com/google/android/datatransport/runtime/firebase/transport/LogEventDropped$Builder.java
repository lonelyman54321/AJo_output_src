/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;

public final class LogEventDropped$Builder {
    private long events_dropped_count_ = 0L;
    private LogEventDropped$Reason reason_;

    public LogEventDropped$Builder() {
        LogEventDropped$Reason logEventDropped$Reason;
        this.reason_ = logEventDropped$Reason = LogEventDropped$Reason.REASON_UNKNOWN;
    }

    public LogEventDropped build() {
        long l2 = this.events_dropped_count_;
        LogEventDropped$Reason logEventDropped$Reason = this.reason_;
        LogEventDropped logEventDropped = new LogEventDropped(l2, logEventDropped$Reason);
        return logEventDropped;
    }

    public LogEventDropped$Builder setEventsDroppedCount(long l2) {
        this.events_dropped_count_ = l2;
        return this;
    }

    public LogEventDropped$Builder setReason(LogEventDropped$Reason logEventDropped$Reason) {
        this.reason_ = logEventDropped$Reason;
        return this;
    }
}

