/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs
extends ConfigurationFlag {
    private static ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs instance;

    private ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs getInstance() {
        Class<ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs> clazz = ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs configurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs = instance;
                if (configurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs != null) return instance;
                instance = configurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs = new ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Long getDefault() {
        return 0L;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    public String getMetadataFlag() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    public String getRemoteConfigFlag() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }
}

