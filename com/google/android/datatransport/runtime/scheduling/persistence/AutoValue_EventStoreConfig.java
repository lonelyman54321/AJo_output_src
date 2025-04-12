/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig$1;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;

final class AutoValue_EventStoreConfig
extends EventStoreConfig {
    private final int criticalSectionEnterTimeoutMs;
    private final long eventCleanUpAge;
    private final int loadBatchSize;
    private final int maxBlobByteSizePerRow;
    private final long maxStorageSizeInBytes;

    private AutoValue_EventStoreConfig(long l2, int n3, int n4, long l3, int n7) {
        this.maxStorageSizeInBytes = l2;
        this.loadBatchSize = n3;
        this.criticalSectionEnterTimeoutMs = n4;
        this.eventCleanUpAge = l3;
        this.maxBlobByteSizePerRow = n7;
    }

    public /* synthetic */ AutoValue_EventStoreConfig(long l2, int n3, int n4, long l3, int n7, AutoValue_EventStoreConfig$1 autoValue_EventStoreConfig$1) {
        this(l2, n3, n4, l3, n7);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        Object object2 = object instanceof EventStoreConfig;
        if (object2 != 0) {
            int n3;
            long l2;
            int n4;
            long l3 = this.maxStorageSizeInBytes;
            long l4 = ((EventStoreConfig)(object = (EventStoreConfig)object)).getMaxStorageSizeInBytes();
            long l7 = l3 - l4;
            object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 != 0 || (object2 = this.loadBatchSize) != (n4 = ((EventStoreConfig)object).getLoadBatchSize()) || (object2 = this.criticalSectionEnterTimeoutMs) != (n4 = ((EventStoreConfig)object).getCriticalSectionEnterTimeoutMs()) || (object2 = (Object)((l2 = (l3 = this.eventCleanUpAge) - (l4 = ((EventStoreConfig)object).getEventCleanUpAge())) == 0L ? 0 : (l2 < 0L ? -1 : 1))) != 0 || (object2 = this.maxBlobByteSizePerRow) != (n3 = ((EventStoreConfig)object).getMaxBlobByteSizePerRow())) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int getCriticalSectionEnterTimeoutMs() {
        return this.criticalSectionEnterTimeoutMs;
    }

    public long getEventCleanUpAge() {
        return this.eventCleanUpAge;
    }

    public int getLoadBatchSize() {
        return this.loadBatchSize;
    }

    public int getMaxBlobByteSizePerRow() {
        return this.maxBlobByteSizePerRow;
    }

    public long getMaxStorageSizeInBytes() {
        return this.maxStorageSizeInBytes;
    }

    public int hashCode() {
        long l2 = this.maxStorageSizeInBytes;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3);
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        int n8 = this.loadBatchSize;
        n4 = (n4 ^ n8) * n7;
        n8 = this.criticalSectionEnterTimeoutMs;
        n4 = (n4 ^ n8) * n7;
        l3 = this.eventCleanUpAge;
        n8 = (int)(l3 >>> n3 ^ l3);
        n4 = (n4 ^ n8) * n7;
        return this.maxBlobByteSizePerRow ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        long l2 = this.maxStorageSizeInBytes;
        stringBuilder.append(l2);
        stringBuilder.append(", loadBatchSize=");
        int n3 = this.loadBatchSize;
        stringBuilder.append(n3);
        stringBuilder.append(", criticalSectionEnterTimeoutMs=");
        n3 = this.criticalSectionEnterTimeoutMs;
        stringBuilder.append(n3);
        stringBuilder.append(", eventCleanUpAge=");
        l2 = this.eventCleanUpAge;
        stringBuilder.append(l2);
        stringBuilder.append(", maxBlobByteSizePerRow=");
        return g30.a(this.maxBlobByteSizePerRow, "}", stringBuilder);
    }
}

