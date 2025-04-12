/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$NetworkEventCountForeground
extends ConfigurationFlag {
    private static ConfigurationConstants$NetworkEventCountForeground instance;

    private ConfigurationConstants$NetworkEventCountForeground() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$NetworkEventCountForeground getInstance() {
        Class<ConfigurationConstants$NetworkEventCountForeground> clazz = ConfigurationConstants$NetworkEventCountForeground.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$NetworkEventCountForeground configurationConstants$NetworkEventCountForeground = instance;
                if (configurationConstants$NetworkEventCountForeground != null) return instance;
                instance = configurationConstants$NetworkEventCountForeground = new ConfigurationConstants$NetworkEventCountForeground();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Long getDefault() {
        return 700L;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    public String getRemoteConfigFlag() {
        return "fpr_rl_network_event_count_fg";
    }
}

