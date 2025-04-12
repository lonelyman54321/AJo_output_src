/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$TraceEventCountBackground
extends ConfigurationFlag {
    private static ConfigurationConstants$TraceEventCountBackground instance;

    private ConfigurationConstants$TraceEventCountBackground() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$TraceEventCountBackground getInstance() {
        Class<ConfigurationConstants$TraceEventCountBackground> clazz = ConfigurationConstants$TraceEventCountBackground.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$TraceEventCountBackground configurationConstants$TraceEventCountBackground = instance;
                if (configurationConstants$TraceEventCountBackground != null) return instance;
                instance = configurationConstants$TraceEventCountBackground = new ConfigurationConstants$TraceEventCountBackground();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Long getDefault() {
        return 30;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    public String getRemoteConfigFlag() {
        return "fpr_rl_trace_event_count_bg";
    }
}

