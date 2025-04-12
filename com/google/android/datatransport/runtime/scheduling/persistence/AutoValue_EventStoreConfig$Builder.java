/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder;

final class AutoValue_EventStoreConfig$Builder
extends EventStoreConfig$Builder {
    private Integer criticalSectionEnterTimeoutMs;
    private Long eventCleanUpAge;
    private Integer loadBatchSize;
    private Integer maxBlobByteSizePerRow;
    private Long maxStorageSizeInBytes;

    public EventStoreConfig build() {
        boolean bl2;
        Object object = this.maxStorageSizeInBytes;
        object = object == null ? " maxStorageSizeInBytes" : "";
        Object object2 = this.loadBatchSize;
        if (object2 == null) {
            object2 = " loadBatchSize";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = this.criticalSectionEnterTimeoutMs) == null) {
            object2 = " criticalSectionEnterTimeoutMs";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = this.eventCleanUpAge) == null) {
            object2 = " eventCleanUpAge";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = this.maxBlobByteSizePerRow) == null) {
            object2 = " maxBlobByteSizePerRow";
            object = Ft2.a((String)object, (String)object2);
        }
        if (bl2 = ((String)object).isEmpty()) {
            long l2 = this.maxStorageSizeInBytes;
            int n3 = this.loadBatchSize;
            int n4 = this.criticalSectionEnterTimeoutMs;
            long l3 = this.eventCleanUpAge;
            int n7 = this.maxBlobByteSizePerRow;
            object = new AutoValue_EventStoreConfig(l2, n3, n4, l3, n7, null);
            return object;
        }
        object = "Missing required properties:".concat((String)object);
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public EventStoreConfig$Builder setCriticalSectionEnterTimeoutMs(int n3) {
        Integer n4;
        this.criticalSectionEnterTimeoutMs = n4 = Integer.valueOf(n3);
        return this;
    }

    public EventStoreConfig$Builder setEventCleanUpAge(long l2) {
        Long l3;
        this.eventCleanUpAge = l3 = Long.valueOf(l2);
        return this;
    }

    public EventStoreConfig$Builder setLoadBatchSize(int n3) {
        Integer n4;
        this.loadBatchSize = n4 = Integer.valueOf(n3);
        return this;
    }

    public EventStoreConfig$Builder setMaxBlobByteSizePerRow(int n3) {
        Integer n4;
        this.maxBlobByteSizePerRow = n4 = Integer.valueOf(n3);
        return this;
    }

    public EventStoreConfig$Builder setMaxStorageSizeInBytes(long l2) {
        Long l3;
        this.maxStorageSizeInBytes = l3 = Long.valueOf(l2);
        return this;
    }
}

