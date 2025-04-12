/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent$1;
import com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.TransportRuntimeComponent;
import com.google.android.datatransport.runtime.TransportRuntime_Factory;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import javax.inject.Provider;

final class DaggerTransportRuntimeComponent$TransportRuntimeComponentImpl
extends TransportRuntimeComponent {
    private Provider configProvider;
    private Provider creationContextFactoryProvider;
    private Provider defaultSchedulerProvider;
    private Provider executorProvider;
    private Provider metadataBackendRegistryProvider;
    private Provider packageNameProvider;
    private Provider sQLiteEventStoreProvider;
    private Provider schemaManagerProvider;
    private Provider setApplicationContextProvider;
    private final DaggerTransportRuntimeComponent$TransportRuntimeComponentImpl transportRuntimeComponentImpl = this;
    private Provider transportRuntimeProvider;
    private Provider uploaderProvider;
    private Provider workInitializerProvider;
    private Provider workSchedulerProvider;

    private DaggerTransportRuntimeComponent$TransportRuntimeComponentImpl(Context context) {
        this.initialize(context);
    }

    public /* synthetic */ DaggerTransportRuntimeComponent$TransportRuntimeComponentImpl(Context context, DaggerTransportRuntimeComponent$1 daggerTransportRuntimeComponent$1) {
        this(context);
    }

    private void initialize(Context object) {
        Provider provider;
        this.executorProvider = provider = DoubleCheck.provider(ExecutionModule_ExecutorFactory.create());
        object = InstanceFactory.create(object);
        this.setApplicationContextProvider = object;
        provider = TimeModule_EventClockFactory.create();
        Provider provider2 = TimeModule_UptimeClockFactory.create();
        object = CreationContextFactory_Factory.create((Provider)object, provider, provider2);
        this.creationContextFactoryProvider = object;
        object = DoubleCheck.provider(MetadataBackendRegistry_Factory.create(this.setApplicationContextProvider, (Provider)object));
        this.metadataBackendRegistryProvider = object;
        object = this.setApplicationContextProvider;
        provider = EventStoreModule_DbNameFactory.create();
        provider2 = EventStoreModule_SchemaVersionFactory.create();
        object = SchemaManager_Factory.create((Provider)object, provider, provider2);
        this.schemaManagerProvider = object;
        object = DoubleCheck.provider(EventStoreModule_PackageNameFactory.create(this.setApplicationContextProvider));
        this.packageNameProvider = object;
        object = TimeModule_EventClockFactory.create();
        provider = TimeModule_UptimeClockFactory.create();
        provider2 = EventStoreModule_StoreConfigFactory.create();
        Provider provider3 = this.schemaManagerProvider;
        Provider provider4 = this.packageNameProvider;
        object = DoubleCheck.provider(SQLiteEventStore_Factory.create((Provider)object, provider, provider2, provider3, provider4));
        this.sQLiteEventStoreProvider = object;
        object = SchedulingConfigModule_ConfigFactory.create(TimeModule_EventClockFactory.create());
        this.configProvider = object;
        provider = this.setApplicationContextProvider;
        provider2 = this.sQLiteEventStoreProvider;
        provider3 = TimeModule_UptimeClockFactory.create();
        object = SchedulingModule_WorkSchedulerFactory.create(provider, provider2, (Provider)object, provider3);
        this.workSchedulerProvider = object;
        provider = this.executorProvider;
        provider2 = this.metadataBackendRegistryProvider;
        provider3 = this.sQLiteEventStoreProvider;
        object = DefaultScheduler_Factory.create(provider, provider2, (Provider)object, provider3, provider3);
        this.defaultSchedulerProvider = object;
        provider = this.setApplicationContextProvider;
        provider2 = this.metadataBackendRegistryProvider;
        Provider provider5 = this.sQLiteEventStoreProvider;
        provider4 = this.workSchedulerProvider;
        Provider provider6 = this.executorProvider;
        TimeModule_EventClockFactory timeModule_EventClockFactory = TimeModule_EventClockFactory.create();
        TimeModule_UptimeClockFactory timeModule_UptimeClockFactory = TimeModule_UptimeClockFactory.create();
        Provider provider7 = this.sQLiteEventStoreProvider;
        provider3 = provider5;
        object = Uploader_Factory.create(provider, provider2, provider5, provider4, provider6, provider5, timeModule_EventClockFactory, timeModule_UptimeClockFactory, provider7);
        this.uploaderProvider = object;
        object = this.executorProvider;
        provider = this.sQLiteEventStoreProvider;
        provider2 = this.workSchedulerProvider;
        object = WorkInitializer_Factory.create((Provider)object, provider, provider2, provider);
        this.workInitializerProvider = object;
        object = TimeModule_EventClockFactory.create();
        provider = TimeModule_UptimeClockFactory.create();
        provider2 = this.defaultSchedulerProvider;
        provider3 = this.uploaderProvider;
        provider4 = this.workInitializerProvider;
        object = DoubleCheck.provider(TransportRuntime_Factory.create((Provider)object, provider, provider2, provider3, provider4));
        this.transportRuntimeProvider = object;
    }

    public EventStore getEventStore() {
        return (EventStore)this.sQLiteEventStoreProvider.get();
    }

    public TransportRuntime getTransportRuntime() {
        return (TransportRuntime)this.transportRuntimeProvider.get();
    }
}

