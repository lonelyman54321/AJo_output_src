/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule;
import javax.inject.Provider;

public final class EventStoreModule_PackageNameFactory
implements Factory {
    private final Provider contextProvider;

    public EventStoreModule_PackageNameFactory(Provider provider) {
        this.contextProvider = provider;
    }

    public static EventStoreModule_PackageNameFactory create(Provider provider) {
        EventStoreModule_PackageNameFactory eventStoreModule_PackageNameFactory = new EventStoreModule_PackageNameFactory(provider);
        return eventStoreModule_PackageNameFactory;
    }

    public static String packageName(Context context) {
        return (String)Preconditions.checkNotNullFromProvides(EventStoreModule.packageName(context));
    }

    public String get() {
        return EventStoreModule_PackageNameFactory.packageName((Context)this.contextProvider.get());
    }
}

