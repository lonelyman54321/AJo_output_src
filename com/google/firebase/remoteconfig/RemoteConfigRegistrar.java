/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.abt.component.AbtComponent;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public class RemoteConfigRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ RemoteConfigComponent a(Qualified qualified, ComponentContainer componentContainer) {
        return RemoteConfigRegistrar.lambda$getComponents$0(qualified, componentContainer);
    }

    private static /* synthetic */ RemoteConfigComponent lambda$getComponents$0(Qualified object, ComponentContainer componentContainer) {
        RemoteConfigComponent remoteConfigComponent;
        Object object2;
        Object object3 = object2 = componentContainer.get(Context.class);
        object3 = (Context)object2;
        Object object4 = object = componentContainer.get((Qualified)object);
        object4 = (ScheduledExecutorService)object;
        Object object5 = object = componentContainer.get(FirebaseApp.class);
        object5 = (FirebaseApp)object;
        Object object6 = object = componentContainer.get(FirebaseInstallationsApi.class);
        object6 = (FirebaseInstallationsApi)object;
        FirebaseABTesting firebaseABTesting = ((AbtComponent)componentContainer.get(AbtComponent.class)).get("frc");
        Provider provider = componentContainer.getProvider(AnalyticsConnector.class);
        object2 = remoteConfigComponent;
        remoteConfigComponent = new RemoteConfigComponent((Context)object3, (ScheduledExecutorService)object4, (FirebaseApp)object5, (FirebaseInstallationsApi)object6, firebaseABTesting, provider);
        return remoteConfigComponent;
    }

    public List getComponents() {
        Object object = Qualified.qualified(Blocking.class, ScheduledExecutorService.class);
        int n3 = 1;
        Object object2 = new Class[n3];
        object2[0] = FirebaseRemoteConfigInterop.class;
        object2 = Component.builder(RemoteConfigComponent.class, (Class[])object2);
        Component[] componentArray = "fire-rc";
        object2 = ((Component$Builder)object2).name((String)componentArray);
        Object object3 = Dependency.required(Context.class);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = Dependency.required((Qualified)object);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = Dependency.required(FirebaseApp.class);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = Dependency.required(FirebaseInstallationsApi.class);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = Dependency.required(AbtComponent.class);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = Dependency.optionalProvider(AnalyticsConnector.class);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = new fi2_0((Qualified)object);
        object = ((Component$Builder)object2).factory((ComponentFactory)object3).eagerInDefaultApp().build();
        object2 = LibraryVersionComponent.create((String)componentArray, "22.1.0");
        componentArray = new Component[2];
        componentArray[0] = object;
        componentArray[n3] = object2;
        return Arrays.asList(componentArray);
    }
}

