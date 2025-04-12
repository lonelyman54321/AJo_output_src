/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$ExperimentTTID
extends ConfigurationFlag {
    private static ConfigurationConstants$ExperimentTTID instance;

    private ConfigurationConstants$ExperimentTTID() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$ExperimentTTID getInstance() {
        Class<ConfigurationConstants$ExperimentTTID> clazz = ConfigurationConstants$ExperimentTTID.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$ExperimentTTID configurationConstants$ExperimentTTID = instance;
                if (configurationConstants$ExperimentTTID != null) return instance;
                instance = configurationConstants$ExperimentTTID = new ConfigurationConstants$ExperimentTTID();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Boolean getDefault() {
        return Boolean.FALSE;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    public String getMetadataFlag() {
        return "experiment_app_start_ttid";
    }

    public String getRemoteConfigFlag() {
        return "fpr_experiment_app_start_ttid";
    }
}

