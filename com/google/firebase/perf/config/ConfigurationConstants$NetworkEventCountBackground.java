/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$NetworkEventCountBackground
extends ConfigurationFlag {
    private static ConfigurationConstants$NetworkEventCountBackground instance;

    private ConfigurationConstants$NetworkEventCountBackground() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$NetworkEventCountBackground getInstance() {
        Class<ConfigurationConstants$NetworkEventCountBackground> clazz = ConfigurationConstants$NetworkEventCountBackground.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$NetworkEventCountBackground configurationConstants$NetworkEventCountBackground = instance;
                if (configurationConstants$NetworkEventCountBackground != null) return instance;
                instance = configurationConstants$NetworkEventCountBackground = new ConfigurationConstants$NetworkEventCountBackground();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Long getDefault() {
        return 70;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    public String getRemoteConfigFlag() {
        return "fpr_rl_network_event_count_bg";
    }
}

