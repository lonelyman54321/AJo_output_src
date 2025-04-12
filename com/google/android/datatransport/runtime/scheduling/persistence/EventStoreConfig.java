/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig$Builder;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig$Builder;

abstract class EventStoreConfig {
    static final EventStoreConfig DEFAULT = EventStoreConfig.builder().setMaxStorageSizeInBytes(0xA00000L).setLoadBatchSize(200).setCriticalSectionEnterTimeoutMs(10000).setEventCleanUpAge(604800000L).setMaxBlobByteSizePerRow(81920).build();
    private static final long DURATION_ONE_WEEK_MS = 604800000L;
    private static final int LOAD_BATCH_SIZE = 200;
    private static final int LOCK_TIME_OUT_MS = 10000;
    private static final int MAX_BLOB_BYTE_SIZE_PER_ROW = 81920;
    private static final long MAX_DB_STORAGE_SIZE_IN_BYTES = 0xA00000L;

    public static EventStoreConfig$Builder builder() {
        AutoValue_EventStoreConfig$Builder autoValue_EventStoreConfig$Builder = new AutoValue_EventStoreConfig$Builder();
        return autoValue_EventStoreConfig$Builder;
    }

    public abstract int getCriticalSectionEnterTimeoutMs();

    public abstract long getEventCleanUpAge();

    public abstract int getLoadBatchSize();

    public abstract int getMaxBlobByteSizePerRow();

    public abstract long getMaxStorageSizeInBytes();

    public EventStoreConfig$Builder toBuilder() {
        EventStoreConfig$Builder eventStoreConfig$Builder = EventStoreConfig.builder();
        long l2 = this.getMaxStorageSizeInBytes();
        eventStoreConfig$Builder = eventStoreConfig$Builder.setMaxStorageSizeInBytes(l2);
        int n3 = this.getLoadBatchSize();
        eventStoreConfig$Builder = eventStoreConfig$Builder.setLoadBatchSize(n3);
        n3 = this.getCriticalSectionEnterTimeoutMs();
        eventStoreConfig$Builder = eventStoreConfig$Builder.setCriticalSectionEnterTimeoutMs(n3);
        l2 = this.getEventCleanUpAge();
        eventStoreConfig$Builder = eventStoreConfig$Builder.setEventCleanUpAge(l2);
        n3 = this.getMaxBlobByteSizePerRow();
        return eventStoreConfig$Builder.setMaxBlobByteSizePerRow(n3);
    }
}

