/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs
extends ConfigurationFlag {
    private static ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs instance;

    private ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs getInstance() {
        Class<ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs> clazz = ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs configurationConstants$SessionsMemoryCaptureFrequencyForegroundMs = instance;
                if (configurationConstants$SessionsMemoryCaptureFrequencyForegroundMs != null) return instance;
                instance = configurationConstants$SessionsMemoryCaptureFrequencyForegroundMs = new ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Long getDefault() {
        return 100;
    }

    public Long getDefaultOnRcFetchFail() {
        return this.getDefault() * (long)3;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    public String getMetadataFlag() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    public String getRemoteConfigFlag() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }
}

