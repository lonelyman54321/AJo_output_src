/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

public final class FirebasePerformanceModule_ProvidesFirebaseAppFactory
implements nb2_2 {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesFirebaseAppFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesFirebaseAppFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        FirebasePerformanceModule_ProvidesFirebaseAppFactory firebasePerformanceModule_ProvidesFirebaseAppFactory = new FirebasePerformanceModule_ProvidesFirebaseAppFactory(firebasePerformanceModule);
        return firebasePerformanceModule_ProvidesFirebaseAppFactory;
    }

    public static FirebaseApp providesFirebaseApp(FirebasePerformanceModule object) {
        object = ((FirebasePerformanceModule)object).providesFirebaseApp();
        nx2_2.a(object);
        return object;
    }

    public FirebaseApp get() {
        return FirebasePerformanceModule_ProvidesFirebaseAppFactory.providesFirebaseApp(this.module);
    }
}

