/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$SdkDisabledVersions
extends ConfigurationFlag {
    private static ConfigurationConstants$SdkDisabledVersions instance;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$SdkDisabledVersions getInstance() {
        Class<ConfigurationConstants$SdkDisabledVersions> clazz = ConfigurationConstants$SdkDisabledVersions.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$SdkDisabledVersions configurationConstants$SdkDisabledVersions = instance;
                if (configurationConstants$SdkDisabledVersions != null) return instance;
                instance = configurationConstants$SdkDisabledVersions = new ConfigurationConstants$SdkDisabledVersions();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public String getDefault() {
        return "";
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    public String getRemoteConfigFlag() {
        return "fpr_disabled_android_versions";
    }
}

