/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.RateLimiter$SleepingStopwatch;
import com.google.common.util.concurrent.SmoothRateLimiter$SmoothBursty;
import com.google.common.util.concurrent.SmoothRateLimiter$SmoothWarmingUp;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public abstract class RateLimiter {
    private volatile Object mutexDoNotUseDirectly;
    private final RateLimiter$SleepingStopwatch stopwatch;

    public RateLimiter(RateLimiter$SleepingStopwatch rateLimiter$SleepingStopwatch) {
        this.stopwatch = rateLimiter$SleepingStopwatch = (RateLimiter$SleepingStopwatch)Preconditions.checkNotNull(rateLimiter$SleepingStopwatch);
    }

    private boolean canAcquire(long l2, long l3) {
        long l4 = this.queryEarliestAvailable(l2) - l3;
        long l7 = l4 - l2;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        boolean bl2 = object <= 0;
        return bl2;
    }

    private static void checkPermits(int n3) {
        boolean bl2 = n3 > 0;
        Preconditions.checkArgument(bl2, "Requested permits (%s) must be positive", n3);
    }

    public static RateLimiter create(double d2) {
        RateLimiter$SleepingStopwatch rateLimiter$SleepingStopwatch = RateLimiter$SleepingStopwatch.createFromSystemTimer();
        return RateLimiter.create(d2, rateLimiter$SleepingStopwatch);
    }

    public static RateLimiter create(double d2, long l2, TimeUnit timeUnit) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        Preconditions.checkArgument(bl2, "warmupPeriod must not be negative: %s", l2);
        RateLimiter$SleepingStopwatch rateLimiter$SleepingStopwatch = RateLimiter$SleepingStopwatch.createFromSystemTimer();
        return RateLimiter.create(d2, l2, timeUnit, 3.0, rateLimiter$SleepingStopwatch);
    }

    public static RateLimiter create(double d2, long l2, TimeUnit timeUnit, double d5, RateLimiter$SleepingStopwatch rateLimiter$SleepingStopwatch) {
        SmoothRateLimiter$SmoothWarmingUp smoothRateLimiter$SmoothWarmingUp = new SmoothRateLimiter$SmoothWarmingUp(rateLimiter$SleepingStopwatch, l2, timeUnit, d5);
        smoothRateLimiter$SmoothWarmingUp.setRate(d2);
        return smoothRateLimiter$SmoothWarmingUp;
    }

    public static RateLimiter create(double d2, RateLimiter$SleepingStopwatch rateLimiter$SleepingStopwatch) {
        SmoothRateLimiter$SmoothBursty smoothRateLimiter$SmoothBursty = new SmoothRateLimiter$SmoothBursty(rateLimiter$SleepingStopwatch, 1.0);
        smoothRateLimiter$SmoothBursty.setRate(d2);
        return smoothRateLimiter$SmoothBursty;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Object mutex() {
        Object object = this.mutexDoNotUseDirectly;
        if (object != null) return object;
        synchronized (this) {
            try {
                object = this.mutexDoNotUseDirectly;
                if (object != null) return object;
                this.mutexDoNotUseDirectly = object = new Object();
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public double acquire() {
        return this.acquire(1);
    }

    public double acquire(int n3) {
        long l2 = this.reserve(n3);
        this.stopwatch.sleepMicrosUninterruptibly(l2);
        double d2 = (double)l2 * 1.0;
        double d5 = TimeUnit.SECONDS.toMicros(1L);
        return d2 / d5;
    }

    public abstract double doGetRate();

    public abstract void doSetRate(double var1, long var3);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final double getRate() {
        Object object = this.mutex();
        synchronized (object) {
            return this.doGetRate();
        }
    }

    public abstract long queryEarliestAvailable(long var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long reserve(int n3) {
        RateLimiter.checkPermits(n3);
        Object object = this.mutex();
        synchronized (object) {
            RateLimiter$SleepingStopwatch rateLimiter$SleepingStopwatch = this.stopwatch;
            long l2 = rateLimiter$SleepingStopwatch.readMicros();
            return this.reserveAndGetWaitLength(n3, l2);
        }
    }

    public final long reserveAndGetWaitLength(int n3, long l2) {
        return Math.max(this.reserveEarliestAvailable(n3, l2) - l2, 0L);
    }

    public abstract long reserveEarliestAvailable(int var1, long var2);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setRate(double d2) {
        Object object;
        boolean bl2;
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object2 > 0 && !(bl2 = Double.isNaN(d2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Object object3 = "rate must be positive";
        Preconditions.checkArgument(bl2, object3);
        object = this.mutex();
        synchronized (object) {
            object3 = this.stopwatch;
            long l2 = ((RateLimiter$SleepingStopwatch)object3).readMicros();
            this.doSetRate(d2, l2);
            return;
        }
    }

    public String toString() {
        Locale locale = Locale.ROOT;
        Double d2 = this.getRate();
        Object[] objectArray = new Object[]{d2};
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", objectArray);
    }

    public boolean tryAcquire() {
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        return this.tryAcquire(1, 0L, timeUnit);
    }

    public boolean tryAcquire(int n3) {
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        return this.tryAcquire(n3, 0L, timeUnit);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean tryAcquire(int n3, long l2, TimeUnit object) {
        l2 = object.toMicros(l2);
        long l3 = 0L;
        l2 = Math.max(l2, l3);
        RateLimiter.checkPermits(n3);
        object = this.mutex();
        synchronized (object) {
            try {
                RateLimiter$SleepingStopwatch rateLimiter$SleepingStopwatch = this.stopwatch;
                l3 = rateLimiter$SleepingStopwatch.readMicros();
                boolean bl2 = this.canAcquire(l3, l2);
                if (!bl2) {
                    return false;
                }
                long l4 = this.reserveAndGetWaitLength(n3, l3);
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl15 : MonitorExitStatement: MONITOREXIT : var4_3 /* !! */ 
                this.stopwatch.sleepMicrosUninterruptibly(l4);
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public boolean tryAcquire(long l2, TimeUnit timeUnit) {
        return this.tryAcquire(1, l2, timeUnit);
    }
}

