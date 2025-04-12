/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$SessionsMaxDurationMinutes
extends ConfigurationFlag {
    private static ConfigurationConstants$SessionsMaxDurationMinutes instance;

    private ConfigurationConstants$SessionsMaxDurationMinutes() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$SessionsMaxDurationMinutes getInstance() {
        Class<ConfigurationConstants$SessionsMaxDurationMinutes> clazz = ConfigurationConstants$SessionsMaxDurationMinutes.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$SessionsMaxDurationMinutes configurationConstants$SessionsMaxDurationMinutes = instance;
                if (configurationConstants$SessionsMaxDurationMinutes != null) return instance;
                instance = configurationConstants$SessionsMaxDurationMinutes = new ConfigurationConstants$SessionsMaxDurationMinutes();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Long getDefault() {
        return 240L;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    public String getMetadataFlag() {
        return "sessions_max_length_minutes";
    }

    public String getRemoteConfigFlag() {
        return "fpr_session_max_duration_min";
    }
}

