/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.transport;

import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.PerfMetric$Builder;

final class PendingPerfEvent {
    protected final ApplicationProcessState appState;
    protected final PerfMetric.Builder perfMetricBuilder;

    public PendingPerfEvent(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        this.perfMetricBuilder = builder;
        this.appState = applicationProcessState;
    }
}

