/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;

public class StopwatchLapBuilder
extends IndexableBuilder {
    public StopwatchLapBuilder() {
        super("StopwatchLap");
    }

    public StopwatchLapBuilder setAccumulatedTime(long l2) {
        long[] lArray = new long[]{l2};
        return (StopwatchLapBuilder)this.put("accumulatedTime", lArray);
    }

    public StopwatchLapBuilder setElapsedTime(long l2) {
        long[] lArray = new long[]{l2};
        return (StopwatchLapBuilder)this.put("elapsedTime", lArray);
    }
}

