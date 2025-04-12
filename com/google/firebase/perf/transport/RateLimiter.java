/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.perf.transport;

import android.content.Context;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.transport.RateLimiter$RateLimiterImpl;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.List;
import java.util.Random;

final class RateLimiter {
    private final ConfigResolver configResolver;
    private final double fragmentBucketId;
    private boolean isLogcatEnabled;
    private RateLimiter$RateLimiterImpl networkLimiter;
    private final double samplingBucketId;
    private RateLimiter$RateLimiterImpl traceLimiter;

    public RateLimiter(Context context, Rate rate, long l2) {
        boolean bl2;
        Clock clock = new Clock();
        double d2 = RateLimiter.getSamplingBucketId();
        double d5 = RateLimiter.getSamplingBucketId();
        ConfigResolver configResolver = ConfigResolver.getInstance();
        this(rate, l2, clock, d2, d5, configResolver);
        this.isLogcatEnabled = bl2 = Utils.isDebugLoggingEnabled(context);
    }

    public RateLimiter(Rate rate, long l2, Clock clock, double d2, double d5, ConfigResolver configResolver) {
        RateLimiter$RateLimiterImpl rateLimiter$RateLimiterImpl;
        double d7;
        RateLimiter rateLimiter = this;
        double d9 = d2;
        double d12 = d5;
        this.traceLimiter = null;
        this.networkLimiter = null;
        boolean bl2 = false;
        this.isLogcatEnabled = false;
        double d13 = 1.0;
        double d14 = 0.0;
        double d15 = d14 == d2 ? 0 : (d14 < d2 ? -1 : 1);
        d15 = d15 <= 0 && (d15 = d2 == d13 ? 0 : (d2 < d13 ? -1 : 1)) < 0 ? 1.0 : 0.0;
        Object object = "Sampling bucket ID should be in range [0.0, 1.0).";
        Utils.checkArgument((boolean)d15, (String)object);
        d15 = d14 == d12 ? 0 : (d14 < d12 ? -1 : 1);
        if (d15 <= 0 && (d7 = d12 == d13 ? 0 : (d12 < d13 ? -1 : 1)) < 0) {
            bl2 = true;
        }
        Utils.checkArgument(bl2, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        rateLimiter.samplingBucketId = d9;
        rateLimiter.fragmentBucketId = d12;
        rateLimiter.configResolver = configResolver;
        boolean bl3 = rateLimiter.isLogcatEnabled;
        object = configResolver;
        rateLimiter.traceLimiter = rateLimiter$RateLimiterImpl = new RateLimiter$RateLimiterImpl(rate, l2, clock, configResolver, "Trace", bl3);
        bl3 = rateLimiter.isLogcatEnabled;
        rateLimiter.networkLimiter = rateLimiter$RateLimiterImpl = new RateLimiter$RateLimiterImpl(rate, l2, clock, configResolver, "Network", bl3);
    }

    public static double getSamplingBucketId() {
        Random random = new Random();
        return random.nextDouble();
    }

    private boolean hasVerboseSessions(List object) {
        Object object2;
        int n3 = object.size();
        boolean bl2 = false;
        if (n3 > 0 && (n3 = ((PerfSession)(object2 = (PerfSession)object.get(0))).getSessionVerbosityCount()) > 0 && (object = ((PerfSession)object.get(0)).getSessionVerbosity(0)) == (object2 = SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS)) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean isDeviceAllowedToSendFragmentScreenTraces() {
        boolean bl2;
        double d2 = this.fragmentBucketId;
        ConfigResolver configResolver = this.configResolver;
        double d5 = configResolver.getFragmentSamplingRate();
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object < 0) {
            bl2 = true;
        } else {
            bl2 = false;
            configResolver = null;
        }
        return bl2;
    }

    private boolean isDeviceAllowedToSendNetworkEvents() {
        boolean bl2;
        double d2 = this.samplingBucketId;
        ConfigResolver configResolver = this.configResolver;
        double d5 = configResolver.getNetworkRequestSamplingRate();
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object < 0) {
            bl2 = true;
        } else {
            bl2 = false;
            configResolver = null;
        }
        return bl2;
    }

    private boolean isDeviceAllowedToSendTraces() {
        boolean bl2;
        double d2 = this.samplingBucketId;
        ConfigResolver configResolver = this.configResolver;
        double d5 = configResolver.getTraceSamplingRate();
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object < 0) {
            bl2 = true;
        } else {
            bl2 = false;
            configResolver = null;
        }
        return bl2;
    }

    public void changeRate(boolean bl2) {
        this.traceLimiter.changeRate(bl2);
        this.networkLimiter.changeRate(bl2);
    }

    public boolean getIsDeviceAllowedToSendFragmentScreenTraces() {
        return this.isDeviceAllowedToSendFragmentScreenTraces();
    }

    public boolean getIsDeviceAllowedToSendNetworkEvents() {
        return this.isDeviceAllowedToSendNetworkEvents();
    }

    public boolean getIsDeviceAllowedToSendTraces() {
        return this.isDeviceAllowedToSendTraces();
    }

    public boolean isEventRateLimited(PerfMetric perfMetric) {
        boolean bl2 = this.isRateLimitApplicable(perfMetric);
        if (!bl2) {
            return false;
        }
        bl2 = perfMetric.hasNetworkRequestMetric();
        boolean bl3 = true;
        if (bl2) {
            return this.networkLimiter.check(perfMetric) ^ bl3;
        }
        bl2 = perfMetric.hasTraceMetric();
        if (bl2) {
            return this.traceLimiter.check(perfMetric) ^ bl3;
        }
        return bl3;
    }

    public boolean isEventSampled(PerfMetric object) {
        boolean bl2;
        List list;
        boolean bl3 = ((PerfMetric)object).hasTraceMetric();
        if (bl3 && !(bl3 = this.isDeviceAllowedToSendTraces()) && !(bl3 = this.hasVerboseSessions(list = ((PerfMetric)object).getTraceMetric().getPerfSessionsList()))) {
            return false;
        }
        bl3 = this.isFragmentScreenTrace((PerfMetric)object);
        if (bl3 && !(bl3 = this.isDeviceAllowedToSendFragmentScreenTraces()) && !(bl3 = this.hasVerboseSessions(list = ((PerfMetric)object).getTraceMetric().getPerfSessionsList()))) {
            return false;
        }
        bl3 = ((PerfMetric)object).hasNetworkRequestMetric();
        return !bl3 || (bl3 = this.isDeviceAllowedToSendNetworkEvents()) || (bl2 = this.hasVerboseSessions((List)(object = ((PerfMetric)object).getNetworkRequestMetric().getPerfSessionsList())));
    }

    public boolean isFragmentScreenTrace(PerfMetric generatedMessageLite) {
        boolean bl2;
        String string2;
        String string3;
        boolean bl3 = ((PerfMetric)generatedMessageLite).hasTraceMetric();
        if (bl3 && (bl3 = (string3 = ((PerfMetric)generatedMessageLite).getTraceMetric().getName()).startsWith(string2 = "_st_")) && (bl2 = ((TraceMetric)(generatedMessageLite = ((PerfMetric)generatedMessageLite).getTraceMetric())).containsCustomAttributes(string3 = "Hosting_activity"))) {
            bl2 = true;
        } else {
            bl2 = false;
            generatedMessageLite = null;
        }
        return bl2;
    }

    public boolean isRateLimitApplicable(PerfMetric perfMetric) {
        String string2;
        Object object;
        int n3 = perfMetric.hasTraceMetric();
        if (n3 != 0 && ((n3 = ((String)(object = perfMetric.getTraceMetric().getName())).equals(string2 = Constants$TraceNames.FOREGROUND_TRACE_NAME.toString())) != 0 || (n3 = (int)(((String)(object = perfMetric.getTraceMetric().getName())).equals(string2 = Constants$TraceNames.BACKGROUND_TRACE_NAME.toString()) ? 1 : 0)) != 0) && (n3 = ((TraceMetric)(object = perfMetric.getTraceMetric())).getCountersCount()) > 0) {
            return false;
        }
        boolean bl2 = perfMetric.hasGaugeMetric();
        return !bl2;
    }
}

