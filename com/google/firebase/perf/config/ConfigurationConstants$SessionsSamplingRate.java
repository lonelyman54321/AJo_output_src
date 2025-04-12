/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$SessionsSamplingRate
extends ConfigurationFlag {
    private static ConfigurationConstants$SessionsSamplingRate instance;

    private ConfigurationConstants$SessionsSamplingRate() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$SessionsSamplingRate getInstance() {
        Class<ConfigurationConstants$SessionsSamplingRate> clazz = ConfigurationConstants$SessionsSamplingRate.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$SessionsSamplingRate configurationConstants$SessionsSamplingRate = instance;
                if (configurationConstants$SessionsSamplingRate != null) return instance;
                instance = configurationConstants$SessionsSamplingRate = new ConfigurationConstants$SessionsSamplingRate();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Double getDefault() {
        return 0.01;
    }

    public Double getDefaultOnRcFetchFail() {
        return this.getDefault() / 1000.0;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    public String getMetadataFlag() {
        return "sessions_sampling_percentage";
    }

    public String getRemoteConfigFlag() {
        return "fpr_vc_session_sampling_rate";
    }
}

