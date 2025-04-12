/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$CollectionEnabled
extends ConfigurationFlag {
    private static ConfigurationConstants$CollectionEnabled instance;

    private ConfigurationConstants$CollectionEnabled() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$CollectionEnabled getInstance() {
        Class<ConfigurationConstants$CollectionEnabled> clazz = ConfigurationConstants$CollectionEnabled.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$CollectionEnabled configurationConstants$CollectionEnabled = instance;
                if (configurationConstants$CollectionEnabled != null) return instance;
                instance = configurationConstants$CollectionEnabled = new ConfigurationConstants$CollectionEnabled();
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
        return "isEnabled";
    }

    public String getMetadataFlag() {
        return "firebase_performance_collection_enabled";
    }
}

