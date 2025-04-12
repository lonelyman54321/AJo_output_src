/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$CollectionDeactivated
extends ConfigurationFlag {
    private static ConfigurationConstants$CollectionDeactivated instance;

    private ConfigurationConstants$CollectionDeactivated() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$CollectionDeactivated getInstance() {
        Class<ConfigurationConstants$CollectionDeactivated> clazz = ConfigurationConstants$CollectionDeactivated.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$CollectionDeactivated configurationConstants$CollectionDeactivated = instance;
                if (configurationConstants$CollectionDeactivated != null) return instance;
                instance = configurationConstants$CollectionDeactivated = new ConfigurationConstants$CollectionDeactivated();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Boolean getDefault() {
        return Boolean.FALSE;
    }

    public String getMetadataFlag() {
        return "firebase_performance_collection_deactivated";
    }
}

