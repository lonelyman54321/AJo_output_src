/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.firebase.transport.TimeWindow$Builder;

public final class TimeWindow {
    private static final TimeWindow DEFAULT_INSTANCE;
    private final long end_ms_;
    private final long start_ms_;

    static {
        TimeWindow$Builder timeWindow$Builder = new TimeWindow$Builder();
        DEFAULT_INSTANCE = timeWindow$Builder.build();
    }

    public TimeWindow(long l2, long l3) {
        this.start_ms_ = l2;
        this.end_ms_ = l3;
    }

    public static TimeWindow getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static TimeWindow$Builder newBuilder() {
        TimeWindow$Builder timeWindow$Builder = new TimeWindow$Builder();
        return timeWindow$Builder;
    }

    public long getEndMs() {
        return this.end_ms_;
    }

    public long getStartMs() {
        return this.start_ms_;
    }
}

