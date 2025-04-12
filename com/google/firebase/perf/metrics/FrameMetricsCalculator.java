/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 */
package com.google.firebase.perf.metrics;

import android.util.SparseIntArray;
import com.google.firebase.perf.metrics.FrameMetricsCalculator$PerfFrameMetrics;

public class FrameMetricsCalculator {
    public static FrameMetricsCalculator$PerfFrameMetrics calculateFrameMetrics(SparseIntArray[] object) {
        int n3;
        int n4;
        int n7;
        if (object != null && (object = object[0]) != null) {
            int n8;
            int n10 = 0;
            n7 = 0;
            n4 = 0;
            for (n3 = 0; n3 < (n8 = object.size()); ++n3) {
                n8 = object.keyAt(n3);
                int n14 = object.valueAt(n3);
                n10 += n14;
                int n15 = 700;
                if (n8 > n15) {
                    n4 += n14;
                }
                if (n8 <= (n15 = 16)) continue;
                n7 += n14;
            }
            n3 = n10;
        } else {
            n7 = 0;
            n4 = 0;
        }
        object = new FrameMetricsCalculator$PerfFrameMetrics(n3, n7, n4);
        return object;
    }
}

