/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$SdkEnabled
extends ConfigurationFlag {
    private static ConfigurationConstants$SdkEnabled instance;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$SdkEnabled getInstance() {
        Class<ConfigurationConstants$SdkEnabled> clazz = ConfigurationConstants$SdkEnabled.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$SdkEnabled configurationConstants$SdkEnabled = instance;
                if (configurationConstants$SdkEnabled != null) return instance;
                instance = configurationConstants$SdkEnabled = new ConfigurationConstants$SdkEnabled();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Boolean getDefault() {
        return Boolean.TRUE;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    public String getRemoteConfigFlag() {
        return "fpr_enabled";
    }
}

