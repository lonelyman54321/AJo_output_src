/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.metrics;

import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.perf.v1.TraceMetric$Builder;
import java.util.Arrays;
import java.util.Map;

class TraceMetricBuilder {
    private final Trace trace;

    public TraceMetricBuilder(Trace trace) {
        this.trace = trace;
    }

    public TraceMetric build() {
        Object object;
        boolean bl2;
        TraceMetric$Builder traceMetric$Builder = TraceMetric.newBuilder();
        Object object2 = this.trace.getName();
        traceMetric$Builder = traceMetric$Builder.setName((String)object2);
        long l2 = this.trace.getStartTime().getMicros();
        traceMetric$Builder = traceMetric$Builder.setClientStartTimeUs(l2);
        object2 = this.trace.getStartTime();
        Object object3 = this.trace.getEndTime();
        l2 = object2.getDurationMicros((Timer)object3);
        traceMetric$Builder = traceMetric$Builder.setDurationUs(l2);
        object2 = this.trace.getCounters().values().iterator();
        while (bl2 = object2.hasNext()) {
            object3 = (Counter)object2.next();
            object = ((Counter)object3).getName();
            long l3 = ((Counter)object3).getCount();
            traceMetric$Builder.putCounters((String)object, l3);
        }
        object2 = this.trace.getSubtraces();
        bl2 = object2.isEmpty();
        if (!bl2) {
            object2 = object2.iterator();
            while (bl2 = object2.hasNext()) {
                object3 = (Trace)object2.next();
                object = new TraceMetricBuilder((Trace)object3);
                object3 = ((TraceMetricBuilder)object).build();
                traceMetric$Builder.addSubtraces((TraceMetric)object3);
            }
        }
        object2 = this.trace.getAttributes();
        traceMetric$Builder.putAllCustomAttributes((Map)object2);
        object2 = PerfSession.buildAndSort(this.trace.getSessions());
        if (object2 != null) {
            object2 = Arrays.asList(object2);
            traceMetric$Builder.addAllPerfSessions((Iterable)object2);
        }
        return (TraceMetric)traceMetric$Builder.build();
    }
}

