/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

public final class FirebasePerformance_Factory
implements nb2_2 {
    private final javax.inject.Provider configResolverProvider;
    private final javax.inject.Provider firebaseAppProvider;
    private final javax.inject.Provider firebaseInstallationsApiProvider;
    private final javax.inject.Provider firebaseRemoteConfigProvider;
    private final javax.inject.Provider remoteConfigManagerProvider;
    private final javax.inject.Provider sessionManagerProvider;
    private final javax.inject.Provider transportFactoryProvider;

    public FirebasePerformance_Factory(javax.inject.Provider provider, javax.inject.Provider provider2, javax.inject.Provider provider3, javax.inject.Provider provider4, javax.inject.Provider provider5, javax.inject.Provider provider6, javax.inject.Provider provider7) {
        this.firebaseAppProvider = provider;
        this.firebaseRemoteConfigProvider = provider2;
        this.firebaseInstallationsApiProvider = provider3;
        this.transportFactoryProvider = provider4;
        this.remoteConfigManagerProvider = provider5;
        this.configResolverProvider = provider6;
        this.sessionManagerProvider = provider7;
    }

    public static FirebasePerformance_Factory create(javax.inject.Provider provider, javax.inject.Provider provider2, javax.inject.Provider provider3, javax.inject.Provider provider4, javax.inject.Provider provider5, javax.inject.Provider provider6, javax.inject.Provider provider7) {
        FirebasePerformance_Factory firebasePerformance_Factory = new FirebasePerformance_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return firebasePerformance_Factory;
    }

    public static FirebasePerformance newInstance(FirebaseApp firebaseApp, Provider provider, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider2, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver, SessionManager sessionManager2) {
        FirebasePerformance firebasePerformance = new FirebasePerformance(firebaseApp, provider, firebaseInstallationsApi, provider2, remoteConfigManager, configResolver, sessionManager2);
        return firebasePerformance;
    }

    public FirebasePerformance get() {
        Object object;
        Object object2 = object = this.firebaseAppProvider.get();
        object2 = (FirebaseApp)object;
        Object object3 = object = this.firebaseRemoteConfigProvider.get();
        object3 = (Provider)object;
        Object object4 = object = this.firebaseInstallationsApiProvider.get();
        object4 = (FirebaseInstallationsApi)object;
        Object object5 = object = this.transportFactoryProvider.get();
        object5 = (Provider)object;
        Object object6 = object = this.remoteConfigManagerProvider.get();
        object6 = (RemoteConfigManager)object;
        Object object7 = object = this.configResolverProvider.get();
        object7 = (ConfigResolver)object;
        Object object8 = object = this.sessionManagerProvider.get();
        object8 = (SessionManager)object;
        return FirebasePerformance_Factory.newInstance((FirebaseApp)object2, (Provider)object3, (FirebaseInstallationsApi)object4, (Provider)object5, (RemoteConfigManager)object6, (ConfigResolver)object7, (SessionManager)object8);
    }
}

