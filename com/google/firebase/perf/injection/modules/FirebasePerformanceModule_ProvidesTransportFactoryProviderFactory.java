/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.injection.modules;

import com.google.firebase.inject.Provider;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

public final class FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory
implements nb2_2 {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory firebasePerformanceModule_ProvidesTransportFactoryProviderFactory = new FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(firebasePerformanceModule);
        return firebasePerformanceModule_ProvidesTransportFactoryProviderFactory;
    }

    public static Provider providesTransportFactoryProvider(FirebasePerformanceModule object) {
        object = ((FirebasePerformanceModule)object).providesTransportFactoryProvider();
        nx2_2.a(object);
        return object;
    }

    public Provider get() {
        return FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory.providesTransportFactoryProvider(this.module);
    }
}

