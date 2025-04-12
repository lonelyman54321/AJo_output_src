/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.metrics;

public class FrameMetricsCalculator$PerfFrameMetrics {
    int frozenFrames;
    int slowFrames;
    int totalFrames;

    public FrameMetricsCalculator$PerfFrameMetrics(int n3, int n4, int n7) {
        this.totalFrames = n3;
        this.slowFrames = n4;
        this.frozenFrames = n7;
    }

    public FrameMetricsCalculator$PerfFrameMetrics deltaFrameMetricsFromSnapshot(FrameMetricsCalculator$PerfFrameMetrics frameMetricsCalculator$PerfFrameMetrics) {
        int n3 = this.totalFrames;
        int n4 = frameMetricsCalculator$PerfFrameMetrics.getTotalFrames();
        n3 -= n4;
        n4 = this.slowFrames;
        int n7 = frameMetricsCalculator$PerfFrameMetrics.getSlowFrames();
        n4 -= n7;
        n7 = this.frozenFrames;
        int n8 = frameMetricsCalculator$PerfFrameMetrics.getFrozenFrames();
        frameMetricsCalculator$PerfFrameMetrics = new FrameMetricsCalculator$PerfFrameMetrics(n3, n4, n7 -= n8);
        return frameMetricsCalculator$PerfFrameMetrics;
    }

    public int getFrozenFrames() {
        return this.frozenFrames;
    }

    public int getSlowFrames() {
        return this.slowFrames;
    }

    public int getTotalFrames() {
        return this.totalFrames;
    }
}

