/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

public class FirebasePerformanceModule {
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Provider remoteConfigComponentProvider;
    private final Provider transportFactoryProvider;

    public FirebasePerformanceModule(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider, Provider provider2) {
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.remoteConfigComponentProvider = provider;
        this.transportFactoryProvider = provider2;
    }

    public ConfigResolver providesConfigResolver() {
        return ConfigResolver.getInstance();
    }

    public FirebaseApp providesFirebaseApp() {
        return this.firebaseApp;
    }

    public FirebaseInstallationsApi providesFirebaseInstallations() {
        return this.firebaseInstallations;
    }

    public Provider providesRemoteConfigComponent() {
        return this.remoteConfigComponentProvider;
    }

    public RemoteConfigManager providesRemoteConfigManager() {
        return RemoteConfigManager.getInstance();
    }

    public SessionManager providesSessionManager() {
        return SessionManager.getInstance();
    }

    public Provider providesTransportFactoryProvider() {
        return this.transportFactoryProvider;
    }
}

