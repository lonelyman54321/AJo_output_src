/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.RateLimiter$SleepingStopwatch;
import com.google.common.util.concurrent.SmoothRateLimiter;
import java.util.concurrent.TimeUnit;

final class SmoothRateLimiter$SmoothWarmingUp
extends SmoothRateLimiter {
    private double coldFactor;
    private double slope;
    private double thresholdPermits;
    private final long warmupPeriodMicros;

    public SmoothRateLimiter$SmoothWarmingUp(RateLimiter$SleepingStopwatch rateLimiter$SleepingStopwatch, long l2, TimeUnit timeUnit, double d2) {
        super(rateLimiter$SleepingStopwatch, null);
        long l3;
        this.warmupPeriodMicros = l3 = timeUnit.toMicros(l2);
        this.coldFactor = d2;
    }

    private double permitsToTime(double d2) {
        double d5 = this.stableIntervalMicros;
        double d7 = this.slope;
        return d2 * d7 + d5;
    }

    public double coolDownIntervalMicros() {
        double d2 = this.warmupPeriodMicros;
        double d5 = this.maxPermits;
        return d2 / d5;
    }

    public void doSetRate(double d2, double d5) {
        double d7;
        d2 = this.maxPermits;
        double d9 = this.coldFactor * d5;
        long l2 = this.warmupPeriodMicros;
        this.thresholdPermits = d7 = (double)l2 * 0.5 / d5;
        double d12 = (double)l2 * 2.0;
        double d13 = d5 + d9;
        this.maxPermits = d12 = d12 / d13 + d7;
        d9 -= d5;
        d5 = d12 - d7;
        this.slope = d9 /= d5;
        d5 = 1.0 / 0.0;
        d9 = 0.0;
        Object object = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (object == false) {
            this.storedPermits = d9;
        } else {
            Object object2 = d2 == d9 ? 0 : (d2 > d9 ? 1 : -1);
            if (object2 != false) {
                d5 = this.storedPermits * d12;
                d12 = d5 / d2;
            }
            this.storedPermits = d12;
        }
    }

    public long storedPermitsToWaitTime(double d2, double d5) {
        long l2;
        double d7 = this.thresholdPermits;
        double d9 = (d2 -= d7) - (d7 = 0.0);
        Object object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object > 0) {
            d7 = Math.min(d2, d5);
            double d12 = this.permitsToTime(d2);
            d2 -= d7;
            d2 = this.permitsToTime(d2);
            d12 = (d12 + d2) * d7;
            d2 = 2.0;
            l2 = (long)(d12 /= d2);
            d5 -= d7;
        } else {
            l2 = 0L;
            d2 = 0.0;
        }
        long l3 = (long)(this.stableIntervalMicros * d5);
        return l2 + l3;
    }
}

