/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.util;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator$PerfFrameMetrics;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.Constants$CounterNames;

public class ScreenTraceUtil {
    private static final AndroidLogger logger = AndroidLogger.getInstance();

    public static Trace addFrameCounters(Trace trace, FrameMetricsCalculator$PerfFrameMetrics object) {
        long l2;
        int n3;
        Object object2;
        int n4 = ((FrameMetricsCalculator$PerfFrameMetrics)object).getTotalFrames();
        if (n4 > 0) {
            object2 = Constants$CounterNames.FRAMES_TOTAL.toString();
            n3 = ((FrameMetricsCalculator$PerfFrameMetrics)object).getTotalFrames();
            l2 = n3;
            trace.putMetric((String)object2, l2);
        }
        if ((n4 = ((FrameMetricsCalculator$PerfFrameMetrics)object).getSlowFrames()) > 0) {
            object2 = Constants$CounterNames.FRAMES_SLOW.toString();
            n3 = ((FrameMetricsCalculator$PerfFrameMetrics)object).getSlowFrames();
            l2 = n3;
            trace.putMetric((String)object2, l2);
        }
        if ((n4 = ((FrameMetricsCalculator$PerfFrameMetrics)object).getFrozenFrames()) > 0) {
            object2 = Constants$CounterNames.FRAMES_FROZEN.toString();
            n3 = ((FrameMetricsCalculator$PerfFrameMetrics)object).getFrozenFrames();
            l2 = n3;
            trace.putMetric((String)object2, l2);
        }
        object2 = logger;
        StringBuilder stringBuilder = new StringBuilder("Screen trace: ");
        String string2 = trace.getName();
        stringBuilder.append(string2);
        stringBuilder.append(" _fr_tot:");
        int n7 = ((FrameMetricsCalculator$PerfFrameMetrics)object).getTotalFrames();
        stringBuilder.append(n7);
        stringBuilder.append(" _fr_slo:");
        n7 = ((FrameMetricsCalculator$PerfFrameMetrics)object).getSlowFrames();
        stringBuilder.append(n7);
        stringBuilder.append(" _fr_fzn:");
        int n8 = ((FrameMetricsCalculator$PerfFrameMetrics)object).getFrozenFrames();
        stringBuilder.append(n8);
        object = stringBuilder.toString();
        ((AndroidLogger)object2).debug((String)object);
        return trace;
    }
}

