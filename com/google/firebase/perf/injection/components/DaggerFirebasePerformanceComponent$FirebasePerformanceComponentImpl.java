/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.injection.components;

import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.FirebasePerformance_Factory;
import com.google.firebase.perf.injection.components.DaggerFirebasePerformanceComponent$1;
import com.google.firebase.perf.injection.components.FirebasePerformanceComponent;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesConfigResolverFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseAppFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesSessionManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory;
import javax.inject.Provider;

final class DaggerFirebasePerformanceComponent$FirebasePerformanceComponentImpl
implements FirebasePerformanceComponent {
    private final DaggerFirebasePerformanceComponent$FirebasePerformanceComponentImpl firebasePerformanceComponentImpl = this;
    private Provider firebasePerformanceProvider;
    private Provider providesConfigResolverProvider;
    private Provider providesFirebaseAppProvider;
    private Provider providesFirebaseInstallationsProvider;
    private Provider providesRemoteConfigComponentProvider;
    private Provider providesRemoteConfigManagerProvider;
    private Provider providesSessionManagerProvider;
    private Provider providesTransportFactoryProvider;

    private DaggerFirebasePerformanceComponent$FirebasePerformanceComponentImpl(FirebasePerformanceModule firebasePerformanceModule) {
        this.initialize(firebasePerformanceModule);
    }

    public /* synthetic */ DaggerFirebasePerformanceComponent$FirebasePerformanceComponentImpl(FirebasePerformanceModule firebasePerformanceModule, DaggerFirebasePerformanceComponent$1 daggerFirebasePerformanceComponent$1) {
        this(firebasePerformanceModule);
    }

    private void initialize(FirebasePerformanceModule object) {
        nb2_2 nb2_22 = FirebasePerformanceModule_ProvidesFirebaseAppFactory.create((FirebasePerformanceModule)object);
        this.providesFirebaseAppProvider = nb2_22;
        nb2_22 = FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory.create((FirebasePerformanceModule)object);
        this.providesRemoteConfigComponentProvider = nb2_22;
        nb2_22 = FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory.create((FirebasePerformanceModule)object);
        this.providesFirebaseInstallationsProvider = nb2_22;
        nb2_22 = FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory.create((FirebasePerformanceModule)object);
        this.providesTransportFactoryProvider = nb2_22;
        nb2_22 = FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.create((FirebasePerformanceModule)object);
        this.providesRemoteConfigManagerProvider = nb2_22;
        nb2_22 = FirebasePerformanceModule_ProvidesConfigResolverFactory.create((FirebasePerformanceModule)object);
        this.providesConfigResolverProvider = nb2_22;
        FirebasePerformanceModule_ProvidesSessionManagerFactory firebasePerformanceModule_ProvidesSessionManagerFactory = FirebasePerformanceModule_ProvidesSessionManagerFactory.create((FirebasePerformanceModule)object);
        this.providesSessionManagerProvider = firebasePerformanceModule_ProvidesSessionManagerFactory;
        Provider provider = this.providesFirebaseAppProvider;
        Provider provider2 = this.providesRemoteConfigComponentProvider;
        Provider provider3 = this.providesFirebaseInstallationsProvider;
        Provider provider4 = this.providesTransportFactoryProvider;
        Provider provider5 = this.providesRemoteConfigManagerProvider;
        Provider provider6 = this.providesConfigResolverProvider;
        this.firebasePerformanceProvider = object = is0_1.a(ob2_2.a(FirebasePerformance_Factory.create(provider, provider2, provider3, provider4, provider5, provider6, firebasePerformanceModule_ProvidesSessionManagerFactory)));
    }

    public FirebasePerformance getFirebasePerformance() {
        return (FirebasePerformance)this.firebasePerformanceProvider.get();
    }
}

