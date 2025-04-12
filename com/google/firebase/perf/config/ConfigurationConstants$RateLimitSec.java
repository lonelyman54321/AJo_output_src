/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

import com.google.firebase.perf.config.ConfigurationFlag;

public final class ConfigurationConstants$RateLimitSec
extends ConfigurationFlag {
    private static ConfigurationConstants$RateLimitSec instance;

    private ConfigurationConstants$RateLimitSec() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigurationConstants$RateLimitSec getInstance() {
        Class<ConfigurationConstants$RateLimitSec> clazz = ConfigurationConstants$RateLimitSec.class;
        synchronized (clazz) {
            try {
                ConfigurationConstants$RateLimitSec configurationConstants$RateLimitSec = instance;
                if (configurationConstants$RateLimitSec != null) return instance;
                instance = configurationConstants$RateLimitSec = new ConfigurationConstants$RateLimitSec();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Long getDefault() {
        return 600L;
    }

    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    public String getRemoteConfigFlag() {
        return "fpr_rl_time_limit_sec";
    }
}

