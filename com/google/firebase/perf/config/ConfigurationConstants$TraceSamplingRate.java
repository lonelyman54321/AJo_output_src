/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$TraceSamplingRate
extends ConfigurationFlag {
    private static ConfigurationConstants$TraceSamplingRate instance;

    private ConfigurationConstants$TraceSamplingRate() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$TraceSamplingRate getInstance() {
        Class<ConfigurationConstants$TraceSamplingRate> clazz = ConfigurationConstants$TraceSamplingRate.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$TraceSamplingRate configurationConstants$TraceSamplingRate = instance;
                if (configurationConstants$TraceSamplingRate != null) return instance;
                instance = configurationConstants$TraceSamplingRate = new ConfigurationConstants$TraceSamplingRate();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Double getDefault() {
        return 1.0;
    }

    public Double getDefaultOnRcFetchFail() {
        return this.getDefault() / 1000.0;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    public String getRemoteConfigFlag() {
        return "fpr_vc_trace_sampling_rate";
    }
}

