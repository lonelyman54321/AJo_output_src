/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$NetworkRequestSamplingRate
extends ConfigurationFlag {
    private static ConfigurationConstants$NetworkRequestSamplingRate instance;

    private ConfigurationConstants$NetworkRequestSamplingRate() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$NetworkRequestSamplingRate getInstance() {
        Class<ConfigurationConstants$NetworkRequestSamplingRate> clazz = ConfigurationConstants$NetworkRequestSamplingRate.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$NetworkRequestSamplingRate configurationConstants$NetworkRequestSamplingRate = instance;
                if (configurationConstants$NetworkRequestSamplingRate != null) return instance;
                instance = configurationConstants$NetworkRequestSamplingRate = new ConfigurationConstants$NetworkRequestSamplingRate();
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
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    public String getRemoteConfigFlag() {
        return "fpr_vc_network_request_sampling_rate";
    }
}

