/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.math.LongMath;
import com.google.common.util.concurrent.RateLimiter;
import com.google.common.util.concurrent.RateLimiter$SleepingStopwatch;
import com.google.common.util.concurrent.SmoothRateLimiter$1;
import java.util.concurrent.TimeUnit;

abstract class SmoothRateLimiter
extends RateLimiter {
    double maxPermits;
    private long nextFreeTicketMicros = 0L;
    double stableIntervalMicros;
    double storedPermits;

    private SmoothRateLimiter(RateLimiter$SleepingStopwatch rateLimiter$SleepingStopwatch) {
        super(rateLimiter$SleepingStopwatch);
    }

    public /* synthetic */ SmoothRateLimiter(RateLimiter$SleepingStopwatch rateLimiter$SleepingStopwatch, SmoothRateLimiter$1 smoothRateLimiter$1) {
        this(rateLimiter$SleepingStopwatch);
    }

    public abstract double coolDownIntervalMicros();

    public final double doGetRate() {
        double d2 = TimeUnit.SECONDS.toMicros(1L);
        double d5 = this.stableIntervalMicros;
        return d2 / d5;
    }

    public abstract void doSetRate(double var1, double var3);

    public final void doSetRate(double d2, long l2) {
        double d5;
        this.resync(l2);
        this.stableIntervalMicros = d5 = (double)TimeUnit.SECONDS.toMicros(1L) / d2;
        this.doSetRate(d2, d5);
    }

    public final long queryEarliestAvailable(long l2) {
        return this.nextFreeTicketMicros;
    }

    public final long reserveEarliestAvailable(int n3, long l2) {
        this.resync(l2);
        l2 = this.nextFreeTicketMicros;
        double d2 = n3;
        double d5 = this.storedPermits;
        d5 = Math.min(d2, d5);
        double d7 = this.storedPermits;
        long l3 = this.storedPermitsToWaitTime(d7, d5);
        double d9 = this.stableIntervalMicros;
        long l4 = (long)((d2 -= d5) * d9);
        l3 += l4;
        this.nextFreeTicketMicros = l4 = LongMath.saturatedAdd(this.nextFreeTicketMicros, l3);
        this.storedPermits = d2 = this.storedPermits - d5;
        return l2;
    }

    public void resync(long l2) {
        long l3 = this.nextFreeTicketMicros;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            l3 = l2 - l3;
            double d2 = l3;
            double d5 = this.coolDownIntervalMicros();
            d2 /= d5;
            d5 = this.maxPermits;
            double d7 = this.storedPermits + d2;
            this.storedPermits = d2 = Math.min(d5, d7);
            this.nextFreeTicketMicros = l2;
        }
    }

    public abstract long storedPermitsToWaitTime(double var1, double var3);
}

