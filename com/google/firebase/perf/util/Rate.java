/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.util;

import com.google.firebase.perf.util.Rate$1;
import java.util.concurrent.TimeUnit;

public class Rate {
    static final /* synthetic */ boolean $assertionsDisabled;
    private long numTimeUnits;
    private long numTokensPerTotalTimeUnit;
    private TimeUnit timeUnit;

    public Rate(long l2, long l3, TimeUnit timeUnit) {
        this.numTokensPerTotalTimeUnit = l2;
        this.numTimeUnits = l3;
        this.timeUnit = timeUnit;
    }

    public double getTokensPerSeconds() {
        int[] nArray = Rate$1.$SwitchMap$java$util$concurrent$TimeUnit;
        TimeUnit timeUnit = this.timeUnit;
        int n3 = timeUnit.ordinal();
        int n4 = nArray[n3];
        n3 = 1;
        long l2 = 1L;
        double d2 = Double.MIN_VALUE;
        if (n4 != n3) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    double d5 = this.numTokensPerTotalTimeUnit;
                    TimeUnit timeUnit2 = this.timeUnit;
                    long l3 = this.numTimeUnits;
                    d2 = timeUnit2.toSeconds(l3);
                    return d5 / d2;
                }
                double d7 = this.numTokensPerTotalTimeUnit;
                double d9 = this.numTimeUnits;
                d2 = TimeUnit.SECONDS.toMillis(l2);
                return (d7 /= d9) * d2;
            }
            double d12 = this.numTokensPerTotalTimeUnit;
            double d13 = this.numTimeUnits;
            d2 = TimeUnit.SECONDS.toMicros(l2);
            return (d12 /= d13) * d2;
        }
        double d14 = this.numTokensPerTotalTimeUnit;
        double d15 = this.numTimeUnits;
        d2 = TimeUnit.SECONDS.toNanos(l2);
        return (d14 /= d15) * d2;
    }
}

