/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.perf.session.SessionManager;

public final class FirebasePerformanceModule_ProvidesSessionManagerFactory
implements nb2_2 {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesSessionManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesSessionManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        FirebasePerformanceModule_ProvidesSessionManagerFactory firebasePerformanceModule_ProvidesSessionManagerFactory = new FirebasePerformanceModule_ProvidesSessionManagerFactory(firebasePerformanceModule);
        return firebasePerformanceModule_ProvidesSessionManagerFactory;
    }

    public static SessionManager providesSessionManager(FirebasePerformanceModule object) {
        object = ((FirebasePerformanceModule)object).providesSessionManager();
        nx2_2.a(object);
        return object;
    }

    public SessionManager get() {
        return FirebasePerformanceModule_ProvidesSessionManagerFactory.providesSessionManager(this.module);
    }
}

