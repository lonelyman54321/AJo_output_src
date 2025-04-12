/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;

public final class StorageMetrics$Builder {
    private long current_cache_size_bytes_;
    private long max_cache_size_bytes_;

    public StorageMetrics$Builder() {
        long l2;
        this.current_cache_size_bytes_ = l2 = 0L;
        this.max_cache_size_bytes_ = l2;
    }

    public StorageMetrics build() {
        long l2 = this.current_cache_size_bytes_;
        long l3 = this.max_cache_size_bytes_;
        StorageMetrics storageMetrics = new StorageMetrics(l2, l3);
        return storageMetrics;
    }

    public StorageMetrics$Builder setCurrentCacheSizeBytes(long l2) {
        this.current_cache_size_bytes_ = l2;
        return this;
    }

    public StorageMetrics$Builder setMaxCacheSizeBytes(long l2) {
        this.max_cache_size_bytes_ = l2;
        return this;
    }
}

