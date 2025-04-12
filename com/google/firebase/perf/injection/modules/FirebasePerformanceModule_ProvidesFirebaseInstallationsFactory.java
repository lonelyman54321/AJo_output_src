/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.injection.modules;

import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

public final class FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory
implements nb2_2 {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory firebasePerformanceModule_ProvidesFirebaseInstallationsFactory = new FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(firebasePerformanceModule);
        return firebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
    }

    public static FirebaseInstallationsApi providesFirebaseInstallations(FirebasePerformanceModule object) {
        object = ((FirebasePerformanceModule)object).providesFirebaseInstallations();
        nx2_2.a(object);
        return object;
    }

    public FirebaseInstallationsApi get() {
        return FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory.providesFirebaseInstallations(this.module);
    }
}

