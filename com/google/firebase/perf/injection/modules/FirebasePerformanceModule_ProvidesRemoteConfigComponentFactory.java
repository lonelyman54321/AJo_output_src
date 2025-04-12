/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.injection.modules;

import com.google.firebase.inject.Provider;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

public final class FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory
implements nb2_2 {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory firebasePerformanceModule_ProvidesRemoteConfigComponentFactory = new FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(firebasePerformanceModule);
        return firebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
    }

    public static Provider providesRemoteConfigComponent(FirebasePerformanceModule object) {
        object = ((FirebasePerformanceModule)object).providesRemoteConfigComponent();
        nx2_2.a(object);
        return object;
    }

    public Provider get() {
        return FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory.providesRemoteConfigComponent(this.module);
    }
}

