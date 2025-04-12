/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.datatransport.TransportBackend;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

public class FirebaseMessagingRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(Qualified qualified, ComponentContainer componentContainer) {
        return FirebaseMessagingRegistrar.lambda$getComponents$0(qualified, componentContainer);
    }

    private static /* synthetic */ FirebaseMessaging lambda$getComponents$0(Qualified object, ComponentContainer componentContainer) {
        FirebaseMessaging firebaseMessaging;
        Object object2;
        Object object3 = object2 = componentContainer.get(FirebaseApp.class);
        object3 = (FirebaseApp)object2;
        Object object4 = object2 = componentContainer.get(FirebaseInstanceIdInternal.class);
        object4 = (FirebaseInstanceIdInternal)object2;
        Provider provider = componentContainer.getProvider(UserAgentPublisher.class);
        Provider provider2 = componentContainer.getProvider(HeartBeatInfo.class);
        Object object5 = object2 = componentContainer.get(FirebaseInstallationsApi.class);
        object5 = (FirebaseInstallationsApi)object2;
        Provider provider3 = componentContainer.getProvider((Qualified)object);
        Object object6 = object = componentContainer.get(Subscriber.class);
        object6 = (Subscriber)object;
        object2 = firebaseMessaging;
        firebaseMessaging = new FirebaseMessaging((FirebaseApp)object3, (FirebaseInstanceIdInternal)object4, provider, provider2, (FirebaseInstallationsApi)object5, provider3, (Subscriber)object6);
        return firebaseMessaging;
    }

    public List getComponents() {
        Object object = Qualified.qualified(TransportBackend.class, TransportFactory.class);
        Object object2 = Component.builder(FirebaseMessaging.class);
        Component[] componentArray = "fire-fcm";
        object2 = ((Component$Builder)object2).name((String)componentArray);
        Object object3 = Dependency.required(FirebaseApp.class);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = Dependency.optional(FirebaseInstanceIdInternal.class);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = Dependency.optionalProvider(UserAgentPublisher.class);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = Dependency.optionalProvider(HeartBeatInfo.class);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = Dependency.required(FirebaseInstallationsApi.class);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = Dependency.optionalProvider((Qualified)object);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = Dependency.required(Subscriber.class);
        object2 = ((Component$Builder)object2).add((Dependency)object3);
        object3 = new qn0_1((Qualified)object);
        object = ((Component$Builder)object2).factory((ComponentFactory)object3).alwaysEager().build();
        object2 = LibraryVersionComponent.create((String)componentArray, "24.1.0");
        componentArray = new Component[]{object, object2};
        return Arrays.asList(componentArray);
    }
}

