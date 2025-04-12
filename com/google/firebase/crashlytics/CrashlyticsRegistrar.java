/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class CrashlyticsRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-cls";
    private final Qualified backgroundExecutorService;
    private final Qualified blockingExecutorService;
    private final Qualified lightweightExecutorService;

    static {
        FirebaseSessionsDependencies.addDependency(SessionSubscriber$Name.CRASHLYTICS);
    }

    public CrashlyticsRegistrar() {
        Qualified qualified;
        Class<ExecutorService> clazz = ExecutorService.class;
        this.backgroundExecutorService = qualified = Qualified.qualified(Background.class, clazz);
        this.blockingExecutorService = qualified = Qualified.qualified(Blocking.class, clazz);
        this.lightweightExecutorService = qualified = Qualified.qualified(Lightweight.class, clazz);
    }

    public static /* synthetic */ FirebaseCrashlytics a(CrashlyticsRegistrar crashlyticsRegistrar, ComponentContainer componentContainer) {
        return crashlyticsRegistrar.buildCrashlytics(componentContainer);
    }

    private FirebaseCrashlytics buildCrashlytics(ComponentContainer object) {
        Object object2;
        Logger logger = null;
        CrashlyticsWorkers.setEnforcement(false);
        long l2 = System.currentTimeMillis();
        Object object3 = object2 = object.get(FirebaseApp.class);
        object3 = (FirebaseApp)object2;
        Object object4 = object2 = object.get(FirebaseInstallationsApi.class);
        object4 = (FirebaseInstallationsApi)object2;
        Deferred deferred = object.getDeferred(CrashlyticsNativeComponent.class);
        Deferred deferred2 = object.getDeferred(AnalyticsConnector.class);
        Deferred deferred3 = object.getDeferred(FirebaseRemoteConfigInterop.class);
        object2 = this.backgroundExecutorService;
        Object object5 = object2 = object.get((Qualified)object2);
        object5 = (ExecutorService)object2;
        object2 = this.blockingExecutorService;
        Object object6 = object2 = object.get((Qualified)object2);
        object6 = (ExecutorService)object2;
        object2 = this.lightweightExecutorService;
        Object object7 = object = object.get((Qualified)object2);
        object7 = (ExecutorService)object;
        object = FirebaseCrashlytics.init((FirebaseApp)object3, (FirebaseInstallationsApi)object4, deferred, deferred2, deferred3, (ExecutorService)object5, (ExecutorService)object6, (ExecutorService)object7);
        long l3 = System.currentTimeMillis() - l2;
        l2 = 16;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l4 > 0) {
            logger = Logger.getLogger();
            object4 = "Initializing Crashlytics blocked main for ";
            CharSequence charSequence = new StringBuilder((String)object4);
            charSequence.append(l3);
            object2 = " ms";
            charSequence.append((String)object2);
            charSequence = charSequence.toString();
            logger.d((String)charSequence);
        }
        return object;
    }

    public List getComponents() {
        Object object = Component.builder(FirebaseCrashlytics.class);
        Object object2 = LIBRARY_NAME;
        object = ((Component$Builder)object).name((String)object2);
        Component[] componentArray = Dependency.required(FirebaseApp.class);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = Dependency.required(FirebaseInstallationsApi.class);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = Dependency.required(this.backgroundExecutorService);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = Dependency.required(this.blockingExecutorService);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = Dependency.required(this.lightweightExecutorService);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = Dependency.deferred(CrashlyticsNativeComponent.class);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = Dependency.deferred(AnalyticsConnector.class);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = Dependency.deferred(FirebaseRemoteConfigInterop.class);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = new Fd0(this);
        object = ((Component$Builder)object).factory((ComponentFactory)componentArray).eagerInDefaultApp().build();
        object2 = LibraryVersionComponent.create((String)object2, "19.4.0");
        componentArray = new Component[]{object, object2};
        return Arrays.asList(componentArray);
    }
}

