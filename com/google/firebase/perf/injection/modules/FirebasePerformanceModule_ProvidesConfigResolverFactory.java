/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

public final class FirebasePerformanceModule_ProvidesConfigResolverFactory
implements nb2_2 {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesConfigResolverFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesConfigResolverFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        FirebasePerformanceModule_ProvidesConfigResolverFactory firebasePerformanceModule_ProvidesConfigResolverFactory = new FirebasePerformanceModule_ProvidesConfigResolverFactory(firebasePerformanceModule);
        return firebasePerformanceModule_ProvidesConfigResolverFactory;
    }

    public static ConfigResolver providesConfigResolver(FirebasePerformanceModule object) {
        object = ((FirebasePerformanceModule)object).providesConfigResolver();
        nx2_2.a(object);
        return object;
    }

    public ConfigResolver get() {
        return FirebasePerformanceModule_ProvidesConfigResolverFactory.providesConfigResolver(this.module);
    }
}

