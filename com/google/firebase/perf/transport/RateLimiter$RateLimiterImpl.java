/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.transport;

import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.PerfMetric;
import java.util.concurrent.TimeUnit;

class RateLimiter$RateLimiterImpl {
    private static final long MICROS_IN_A_SECOND;
    private static final AndroidLogger logger;
    private long backgroundCapacity;
    private Rate backgroundRate;
    private long capacity;
    private final Clock clock;
    private long foregroundCapacity;
    private Rate foregroundRate;
    private final boolean isLogcatEnabled;
    private Timer lastTimeTokenReplenished;
    private Rate rate;
    private double tokenCount;

    static {
        logger = AndroidLogger.getInstance();
        MICROS_IN_A_SECOND = TimeUnit.SECONDS.toMicros(1L);
    }

    public RateLimiter$RateLimiterImpl(Rate object, long l2, Clock clock, ConfigResolver configResolver, String string2, boolean bl2) {
        double d2;
        this.clock = clock;
        this.capacity = l2;
        this.rate = object;
        this.tokenCount = d2 = (double)l2;
        this.lastTimeTokenReplenished = object = clock.getTime();
        this.setRateByReadingRemoteConfigValues(configResolver, string2, bl2);
        this.isLogcatEnabled = bl2;
    }

    private static long getBlimitEvents(ConfigResolver configResolver, String string2) {
        String string3 = "Trace";
        if (string2 == string3) {
            return configResolver.getTraceEventCountBackground();
        }
        return configResolver.getNetworkEventCountBackground();
    }

    private static long getBlimitSec(ConfigResolver configResolver, String string2) {
        String string3 = "Trace";
        if (string2 == string3) {
            return configResolver.getRateLimitSec();
        }
        return configResolver.getRateLimitSec();
    }

    private static long getFlimitEvents(ConfigResolver configResolver, String string2) {
        String string3 = "Trace";
        if (string2 == string3) {
            return configResolver.getTraceEventCountForeground();
        }
        return configResolver.getNetworkEventCountForeground();
    }

    private static long getFlimitSec(ConfigResolver configResolver, String string2) {
        String string3 = "Trace";
        if (string2 == string3) {
            return configResolver.getRateLimitSec();
        }
        return configResolver.getRateLimitSec();
    }

    private void setRateByReadingRemoteConfigValues(ConfigResolver configResolver, String string2, boolean bl2) {
        Object[] objectArray;
        Rate rate;
        RateLimiter$RateLimiterImpl rateLimiter$RateLimiterImpl = this;
        int n3 = 2;
        int n4 = 1;
        int n7 = 3;
        long l2 = RateLimiter$RateLimiterImpl.getFlimitSec(configResolver, string2);
        long l3 = RateLimiter$RateLimiterImpl.getFlimitEvents(configResolver, string2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Object object = rate;
        this.foregroundRate = rate = new Rate(l3, l2, timeUnit);
        this.foregroundCapacity = l3;
        if (bl2) {
            object = logger;
            Object object2 = l3;
            objectArray = new Object[n7];
            objectArray[0] = string2;
            objectArray[n4] = rate;
            objectArray[n3] = object2;
            object2 = "Foreground %s logging rate:%f, burst capacity:%d";
            ((AndroidLogger)object).debug((String)object2, objectArray);
        }
        long l4 = RateLimiter$RateLimiterImpl.getBlimitSec(configResolver, string2);
        long l7 = RateLimiter$RateLimiterImpl.getBlimitEvents(configResolver, string2);
        rateLimiter$RateLimiterImpl.backgroundRate = objectArray = new Rate(l7, l4, timeUnit);
        rateLimiter$RateLimiterImpl.backgroundCapacity = l7;
        if (bl2) {
            AndroidLogger androidLogger = logger;
            object = l7;
            Object[] objectArray2 = new Object[n7];
            objectArray2[0] = string2;
            objectArray2[n4] = objectArray;
            objectArray2[n3] = object;
            String string3 = "Background %s logging rate:%f, capacity:%d";
            androidLogger.debug(string3, objectArray2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void changeRate(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Rate rate;
                block4: {
                    if (bl2) {
                        try {
                            rate = this.foregroundRate;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    rate = this.backgroundRate;
                }
                this.rate = rate;
                long l2 = bl2 ? this.foregroundCapacity : this.backgroundCapacity;
                this.capacity = l2;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean check(PerfMetric var1_1) {
        synchronized (this) {
            block8: {
                block7: {
                    try {
                        var1_1 = this.clock;
                        var1_1 = var1_1.getTime();
                        var2_3 = this.lastTimeTokenReplenished;
                        var3_4 = var2_3.getDurationMicros((Timer)var1_1);
                        var5_5 = var3_4;
                        var7_6 = this.rate;
                        var8_7 = var7_6.getTokensPerSeconds();
                        var5_5 *= var8_7;
                        var8_7 = RateLimiter$RateLimiterImpl.MICROS_IN_A_SECOND;
                        var5_5 /= var8_7;
                        var8_7 = 0.0;
                        var10_8 = var5_5 == var8_7 ? 0 : (var5_5 > var8_7 ? 1 : -1);
                        if (var10_8 <= 0) ** GOTO lbl23
                        var8_7 = this.tokenCount + var5_5;
                    }
                    catch (Throwable var1_2) {}
                    var3_4 = this.capacity;
                    var5_5 = var3_4;
                    this.tokenCount = var5_5 = Math.min(var8_7, var5_5);
                    this.lastTimeTokenReplenished = var1_1;
lbl23:
                    // 2 sources

                    if ((var11_9 = (cfr_temp_0 = (var5_5 = this.tokenCount) - (var8_7 = 1.0)) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1)) < 0) break block7;
                    var5_5 -= var8_7;
                    this.tokenCount = var5_5;
                    return true;
                    break block8;
                }
                var11_9 = (double)this.isLogcatEnabled;
                if (var11_9 != false) {
                    var1_1 = RateLimiter$RateLimiterImpl.logger;
                    var2_3 = "Exceeded log rate limit, dropping the log.";
                    var1_1.warn((String)var2_3);
                }
                return false;
            }
            throw var1_2;
        }
    }

    public long getBackgroundCapacity() {
        return this.backgroundCapacity;
    }

    public Rate getBackgroundRate() {
        return this.backgroundRate;
    }

    public long getForegroundCapacity() {
        return this.foregroundCapacity;
    }

    public Rate getForegroundRate() {
        return this.foregroundRate;
    }

    public Rate getRate() {
        return this.rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }
}

