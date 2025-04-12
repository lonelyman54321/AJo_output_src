/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.RateLimiter$SleepingStopwatch;
import com.google.common.util.concurrent.Uninterruptibles;
import java.util.concurrent.TimeUnit;

class RateLimiter$SleepingStopwatch$1
extends RateLimiter$SleepingStopwatch {
    final Stopwatch stopwatch;

    public RateLimiter$SleepingStopwatch$1() {
        Stopwatch stopwatch;
        this.stopwatch = stopwatch = Stopwatch.createStarted();
    }

    public long readMicros() {
        Stopwatch stopwatch = this.stopwatch;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        return stopwatch.elapsed(timeUnit);
    }

    public void sleepMicrosUninterruptibly(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            Uninterruptibles.sleepUninterruptibly(l2, timeUnit);
        }
    }
}

