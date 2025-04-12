/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.FirebasePerfEarly;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.injection.components.DaggerFirebasePerformanceComponent;
import com.google.firebase.perf.injection.components.DaggerFirebasePerformanceComponent$Builder;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public class FirebasePerfRegistrar
implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    public static /* synthetic */ FirebasePerformance a(ComponentContainer componentContainer) {
        return FirebasePerfRegistrar.providesFirebasePerformance(componentContainer);
    }

    public static /* synthetic */ FirebasePerfEarly b(Qualified qualified, ComponentContainer componentContainer) {
        return FirebasePerfRegistrar.lambda$getComponents$0(qualified, componentContainer);
    }

    private static /* synthetic */ FirebasePerfEarly lambda$getComponents$0(Qualified object, ComponentContainer componentContainer) {
        FirebaseApp firebaseApp = (FirebaseApp)componentContainer.get(FirebaseApp.class);
        StartupTime startupTime = (StartupTime)componentContainer.getProvider(StartupTime.class).get();
        object = (Executor)componentContainer.get((Qualified)object);
        FirebasePerfEarly firebasePerfEarly = new FirebasePerfEarly(firebaseApp, startupTime, (Executor)object);
        return firebasePerfEarly;
    }

    private static FirebasePerformance providesFirebasePerformance(ComponentContainer object) {
        object.get(FirebasePerfEarly.class);
        DaggerFirebasePerformanceComponent$Builder daggerFirebasePerformanceComponent$Builder = DaggerFirebasePerformanceComponent.builder();
        FirebaseApp firebaseApp = (FirebaseApp)object.get(FirebaseApp.class);
        FirebaseInstallationsApi firebaseInstallationsApi = (FirebaseInstallationsApi)object.get(FirebaseInstallationsApi.class);
        Provider provider = object.getProvider(RemoteConfigComponent.class);
        object = object.getProvider(TransportFactory.class);
        FirebasePerformanceModule firebasePerformanceModule = new FirebasePerformanceModule(firebaseApp, firebaseInstallationsApi, provider, (Provider)object);
        return daggerFirebasePerformanceComponent$Builder.firebasePerformanceModule(firebasePerformanceModule).build().getFirebasePerformance();
    }

    public List getComponents() {
        Object object = Qualified.qualified(UiThread.class, Executor.class);
        Object object2 = Component.builder(FirebasePerformance.class);
        Object object3 = LIBRARY_NAME;
        object2 = ((Component$Builder)object2).name((String)object3);
        Component[] componentArray = FirebaseApp.class;
        Object object4 = Dependency.required(componentArray);
        object2 = ((Component$Builder)object2).add((Dependency)object4);
        object4 = Dependency.requiredProvider(RemoteConfigComponent.class);
        object2 = ((Component$Builder)object2).add((Dependency)object4);
        object4 = Dependency.required(FirebaseInstallationsApi.class);
        object2 = ((Component$Builder)object2).add((Dependency)object4);
        object4 = Dependency.requiredProvider(TransportFactory.class);
        object2 = ((Component$Builder)object2).add((Dependency)object4);
        object4 = FirebasePerfEarly.class;
        Object object5 = Dependency.required((Class)object4);
        object2 = ((Component$Builder)object2).add((Dependency)object5);
        object5 = new Object();
        object2 = ((Component$Builder)object2).factory((ComponentFactory)object5).build();
        object4 = Component.builder((Class)object4).name(EARLY_LIBRARY_NAME);
        componentArray = Dependency.required(componentArray);
        componentArray = ((Component$Builder)object4).add((Dependency)componentArray);
        object4 = Dependency.optionalProvider(StartupTime.class);
        componentArray = componentArray.add((Dependency)object4);
        object4 = Dependency.required((Qualified)object);
        componentArray = componentArray.add((Dependency)object4).eagerInDefaultApp();
        object4 = new sn0_0((Qualified)object);
        object = componentArray.factory((ComponentFactory)object4).build();
        object3 = LibraryVersionComponent.create((String)object3, "21.0.4");
        componentArray = new Component[]{object2, object, object3};
        return Arrays.asList(componentArray);
    }
}

