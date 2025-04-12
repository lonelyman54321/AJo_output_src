/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;

public final class GlobalMetrics$Builder {
    private StorageMetrics storage_metrics_ = null;

    public GlobalMetrics build() {
        StorageMetrics storageMetrics = this.storage_metrics_;
        GlobalMetrics globalMetrics = new GlobalMetrics(storageMetrics);
        return globalMetrics;
    }

    public GlobalMetrics$Builder setStorageMetrics(StorageMetrics storageMetrics) {
        this.storage_metrics_ = storageMetrics;
        return this;
    }
}

