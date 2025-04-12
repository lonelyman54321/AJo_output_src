/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$FragmentSamplingRate
extends ConfigurationFlag {
    private static ConfigurationConstants$FragmentSamplingRate instance;

    private ConfigurationConstants$FragmentSamplingRate() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$FragmentSamplingRate getInstance() {
        Class<ConfigurationConstants$FragmentSamplingRate> clazz = ConfigurationConstants$FragmentSamplingRate.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$FragmentSamplingRate configurationConstants$FragmentSamplingRate = instance;
                if (configurationConstants$FragmentSamplingRate != null) return instance;
                instance = configurationConstants$FragmentSamplingRate = new ConfigurationConstants$FragmentSamplingRate();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Double getDefault() {
        return 0.0;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    public String getMetadataFlag() {
        return "fragment_sampling_percentage";
    }

    public String getRemoteConfigFlag() {
        return "fpr_vc_fragment_sampling_rate";
    }
}

