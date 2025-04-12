/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$TraceEventCountForeground
extends ConfigurationFlag {
    private static ConfigurationConstants$TraceEventCountForeground instance;

    private ConfigurationConstants$TraceEventCountForeground() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$TraceEventCountForeground getInstance() {
        Class<ConfigurationConstants$TraceEventCountForeground> clazz = ConfigurationConstants$TraceEventCountForeground.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$TraceEventCountForeground configurationConstants$TraceEventCountForeground = instance;
                if (configurationConstants$TraceEventCountForeground != null) return instance;
                instance = configurationConstants$TraceEventCountForeground = new ConfigurationConstants$TraceEventCountForeground();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Long getDefault() {
        return 300L;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    public String getRemoteConfigFlag() {
        return "fpr_rl_trace_event_count_fg";
    }
}

