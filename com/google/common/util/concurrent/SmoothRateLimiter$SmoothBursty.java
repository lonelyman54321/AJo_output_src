/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.RateLimiter$SleepingStopwatch;
import com.google.common.util.concurrent.SmoothRateLimiter;

final class SmoothRateLimiter$SmoothBursty
extends SmoothRateLimiter {
    final double maxBurstSeconds;

    public SmoothRateLimiter$SmoothBursty(RateLimiter$SleepingStopwatch rateLimiter$SleepingStopwatch, double d2) {
        super(rateLimiter$SleepingStopwatch, null);
        this.maxBurstSeconds = d2;
    }

    public double coolDownIntervalMicros() {
        return this.stableIntervalMicros;
    }

    public void doSetRate(double d2, double d5) {
        double d7;
        d5 = this.maxPermits;
        this.maxPermits = d7 = this.maxBurstSeconds * d2;
        d2 = 1.0 / 0.0;
        double d9 = d5 - d2;
        Object object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object == false) {
            this.storedPermits = d7;
        } else {
            d2 = 0.0;
            double d12 = d5 - d2;
            object = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
            if (object != false) {
                d2 = this.storedPermits * d7 / d5;
            }
            this.storedPermits = d2;
        }
    }

    public long storedPermitsToWaitTime(double d2, double d5) {
        return 0L;
    }
}

