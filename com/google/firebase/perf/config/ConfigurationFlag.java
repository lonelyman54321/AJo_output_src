/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.config;

abstract class ConfigurationFlag {
    public abstract Object getDefault();

    public Object getDefaultOnRcFetchFail() {
        return this.getDefault();
    }

    public String getDeviceCacheFlag() {
        return null;
    }

    public String getMetadataFlag() {
        return null;
    }

    public String getRemoteConfigFlag() {
        return null;
    }
}

