/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory$InstanceHolder;

public final class EventStoreModule_DbNameFactory
implements Factory {
    public static EventStoreModule_DbNameFactory create() {
        return EventStoreModule_DbNameFactory$InstanceHolder.access$000();
    }

    public static String dbName() {
        return (String)Preconditions.checkNotNullFromProvides(EventStoreModule.dbName());
    }

    public String get() {
        return EventStoreModule_DbNameFactory.dbName();
    }
}

