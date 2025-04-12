/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics$Builder;
import java.util.List;

public final class LogSourceMetrics {
    private static final LogSourceMetrics DEFAULT_INSTANCE;
    private final List log_event_dropped_;
    private final String log_source_;

    static {
        LogSourceMetrics$Builder logSourceMetrics$Builder = new LogSourceMetrics$Builder();
        DEFAULT_INSTANCE = logSourceMetrics$Builder.build();
    }

    public LogSourceMetrics(String string2, List list) {
        this.log_source_ = string2;
        this.log_event_dropped_ = list;
    }

    public static LogSourceMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static LogSourceMetrics$Builder newBuilder() {
        LogSourceMetrics$Builder logSourceMetrics$Builder = new LogSourceMetrics$Builder();
        return logSourceMetrics$Builder;
    }

    public List getLogEventDroppedList() {
        return this.log_event_dropped_;
    }

    public String getLogSource() {
        return this.log_source_;
    }
}

