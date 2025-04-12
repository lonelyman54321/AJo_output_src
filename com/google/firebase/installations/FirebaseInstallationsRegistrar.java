/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class FirebaseInstallationsRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ FirebaseInstallationsApi a(ComponentContainer componentContainer) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
    }

    private static /* synthetic */ FirebaseInstallationsApi lambda$getComponents$0(ComponentContainer object) {
        FirebaseApp firebaseApp = (FirebaseApp)object.get(FirebaseApp.class);
        Provider provider = object.getProvider(HeartBeatController.class);
        Object object2 = Qualified.qualified(Background.class, ExecutorService.class);
        object2 = (ExecutorService)object.get((Qualified)object2);
        Qualified qualified = Qualified.qualified(Blocking.class, Executor.class);
        object = FirebaseExecutors.newSequentialExecutor((Executor)object.get(qualified));
        FirebaseInstallations firebaseInstallations = new FirebaseInstallations(firebaseApp, provider, (ExecutorService)object2, (Executor)object);
        return firebaseInstallations;
    }

    public List getComponents() {
        Object object = Component.builder(FirebaseInstallationsApi.class);
        Object object2 = LIBRARY_NAME;
        object = ((Component$Builder)object).name((String)object2);
        Object object3 = Dependency.required(FirebaseApp.class);
        object = ((Component$Builder)object).add((Dependency)object3);
        object3 = Dependency.optionalProvider(HeartBeatController.class);
        object = ((Component$Builder)object).add((Dependency)object3);
        object3 = Dependency.required(Qualified.qualified(Background.class, ExecutorService.class));
        object = ((Component$Builder)object).add((Dependency)object3);
        object3 = Dependency.required(Qualified.qualified(Blocking.class, Executor.class));
        object = ((Component$Builder)object).add((Dependency)object3);
        object3 = new Object();
        object = ((Component$Builder)object).factory((ComponentFactory)object3).build();
        object3 = HeartBeatConsumerComponent.create();
        object2 = LibraryVersionComponent.create((String)object2, "18.0.0");
        Component[] componentArray = new Component[]{object, object3, object2};
        return Arrays.asList(componentArray);
    }
}

