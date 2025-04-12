/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;

public final class TimeWindow$Builder {
    private long end_ms_;
    private long start_ms_;

    public TimeWindow$Builder() {
        long l2;
        this.start_ms_ = l2 = 0L;
        this.end_ms_ = l2;
    }

    public TimeWindow build() {
        long l2 = this.start_ms_;
        long l3 = this.end_ms_;
        TimeWindow timeWindow = new TimeWindow(l2, l3);
        return timeWindow;
    }

    public TimeWindow$Builder setEndMs(long l2) {
        this.end_ms_ = l2;
        return this;
    }

    public TimeWindow$Builder setStartMs(long l2) {
        this.start_ms_ = l2;
        return this;
    }
}

