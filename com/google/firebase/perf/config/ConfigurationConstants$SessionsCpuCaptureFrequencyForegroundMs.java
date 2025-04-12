/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs
extends ConfigurationFlag {
    private static ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs instance;

    private ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs getInstance() {
        Class<ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs> clazz = ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs configurationConstants$SessionsCpuCaptureFrequencyForegroundMs = instance;
                if (configurationConstants$SessionsCpuCaptureFrequencyForegroundMs != null) return instance;
                instance = configurationConstants$SessionsCpuCaptureFrequencyForegroundMs = new ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs();
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
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    public String getMetadataFlag() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    public String getRemoteConfigFlag() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }
}

