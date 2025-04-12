/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.config.ConfigurationConstants$LogSourceName$1;
import com.google.firebase.perf.config.ConfigurationFlag;
import java.util.Collections;
import java.util.Map;

public final class ConfigurationConstants$LogSourceName
extends ConfigurationFlag {
    private static final Map LOG_SOURCE_MAP;
    private static ConfigurationConstants$LogSourceName instance;

    static {
        ConfigurationConstants$LogSourceName$1 configurationConstants$LogSourceName$1 = new ConfigurationConstants$LogSourceName$1();
        LOG_SOURCE_MAP = Collections.unmodifiableMap(configurationConstants$LogSourceName$1);
    }

    private ConfigurationConstants$LogSourceName() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$LogSourceName getInstance() {
        Class<ConfigurationConstants$LogSourceName> clazz = ConfigurationConstants$LogSourceName.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$LogSourceName configurationConstants$LogSourceName = instance;
                if (configurationConstants$LogSourceName != null) return instance;
                instance = configurationConstants$LogSourceName = new ConfigurationConstants$LogSourceName();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static String getLogSourceName(long l2) {
        Map map2 = LOG_SOURCE_MAP;
        Long l3 = l2;
        return (String)map2.get(l3);
    }

    public static boolean isLogSourceKnown(long l2) {
        Map map2 = LOG_SOURCE_MAP;
        Long l3 = l2;
        return map2.containsKey(l3);
    }

    public String getDefault() {
        return BuildConfig.TRANSPORT_LOG_SRC;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.LogSourceName";
    }

    public String getRemoteConfigFlag() {
        return "fpr_log_source";
    }
}

