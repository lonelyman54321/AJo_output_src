/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public abstract class EventStoreModule {
    public static String dbName() {
        return "com.google.android.datatransport.events";
    }

    public static String packageName(Context context) {
        return context.getPackageName();
    }

    public static int schemaVersion() {
        return SchemaManager.SCHEMA_VERSION;
    }

    public static EventStoreConfig storeConfig() {
        return EventStoreConfig.DEFAULT;
    }

    public abstract ClientHealthMetricsStore clientHealthMetricsStore(SQLiteEventStore var1);

    public abstract EventStore eventStore(SQLiteEventStore var1);

    public abstract SynchronizationGuard synchronizationGuard(SQLiteEventStore var1);
}

