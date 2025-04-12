/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs
extends ConfigurationFlag {
    private static ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs instance;

    private ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs getInstance() {
        Class<ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs> clazz = ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs = instance;
                if (configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs != null) return instance;
                instance = configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs = new ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs();
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
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    public String getMetadataFlag() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    public String getRemoteConfigFlag() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }
}

