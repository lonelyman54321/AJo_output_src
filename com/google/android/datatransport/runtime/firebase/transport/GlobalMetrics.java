/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics$Builder;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;

public final class GlobalMetrics {
    private static final GlobalMetrics DEFAULT_INSTANCE;
    private final StorageMetrics storage_metrics_;

    static {
        GlobalMetrics$Builder globalMetrics$Builder = new GlobalMetrics$Builder();
        DEFAULT_INSTANCE = globalMetrics$Builder.build();
    }

    public GlobalMetrics(StorageMetrics storageMetrics) {
        this.storage_metrics_ = storageMetrics;
    }

    public static GlobalMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static GlobalMetrics$Builder newBuilder() {
        GlobalMetrics$Builder globalMetrics$Builder = new GlobalMetrics$Builder();
        return globalMetrics$Builder;
    }

    public StorageMetrics getStorageMetrics() {
        StorageMetrics storageMetrics = this.storage_metrics_;
        if (storageMetrics == null) {
            storageMetrics = StorageMetrics.getDefaultInstance();
        }
        return storageMetrics;
    }

    public StorageMetrics getStorageMetricsInternal() {
        return this.storage_metrics_;
    }
}

