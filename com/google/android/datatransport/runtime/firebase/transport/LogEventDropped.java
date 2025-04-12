/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Builder;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;

public final class LogEventDropped {
    private static final LogEventDropped DEFAULT_INSTANCE;
    private final long events_dropped_count_;
    private final LogEventDropped$Reason reason_;

    static {
        LogEventDropped$Builder logEventDropped$Builder = new LogEventDropped$Builder();
        DEFAULT_INSTANCE = logEventDropped$Builder.build();
    }

    public LogEventDropped(long l2, LogEventDropped$Reason logEventDropped$Reason) {
        this.events_dropped_count_ = l2;
        this.reason_ = logEventDropped$Reason;
    }

    public static LogEventDropped getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static LogEventDropped$Builder newBuilder() {
        LogEventDropped$Builder logEventDropped$Builder = new LogEventDropped$Builder();
        return logEventDropped$Builder;
    }

    public long getEventsDroppedCount() {
        return this.events_dropped_count_;
    }

    public LogEventDropped$Reason getReason() {
        return this.reason_;
    }
}

