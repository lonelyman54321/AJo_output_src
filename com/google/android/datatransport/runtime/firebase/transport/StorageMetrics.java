/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics$Builder;

public final class StorageMetrics {
    private static final StorageMetrics DEFAULT_INSTANCE;
    private final long current_cache_size_bytes_;
    private final long max_cache_size_bytes_;

    static {
        StorageMetrics$Builder storageMetrics$Builder = new StorageMetrics$Builder();
        DEFAULT_INSTANCE = storageMetrics$Builder.build();
    }

    public StorageMetrics(long l2, long l3) {
        this.current_cache_size_bytes_ = l2;
        this.max_cache_size_bytes_ = l3;
    }

    public static StorageMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static StorageMetrics$Builder newBuilder() {
        StorageMetrics$Builder storageMetrics$Builder = new StorageMetrics$Builder();
        return storageMetrics$Builder;
    }

    public long getCurrentCacheSizeBytes() {
        return this.current_cache_size_bytes_;
    }

    public long getMaxCacheSizeBytes() {
        return this.max_cache_size_bytes_;
    }
}

