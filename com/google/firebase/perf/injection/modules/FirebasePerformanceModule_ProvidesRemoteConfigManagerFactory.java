/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

public final class FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory
implements nb2_2 {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory firebasePerformanceModule_ProvidesRemoteConfigManagerFactory = new FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(firebasePerformanceModule);
        return firebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
    }

    public static RemoteConfigManager providesRemoteConfigManager(FirebasePerformanceModule object) {
        object = ((FirebasePerformanceModule)object).providesRemoteConfigManager();
        nx2_2.a(object);
        return object;
    }

    public RemoteConfigManager get() {
        return FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.providesRemoteConfigManager(this.module);
    }
}

