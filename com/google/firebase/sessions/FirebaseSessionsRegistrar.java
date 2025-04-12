/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.sessions;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
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
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.FirebaseSessionsRegistrar$Companion;
import com.google.firebase.sessions.SessionDatastore;
import com.google.firebase.sessions.SessionDatastoreImpl;
import com.google.firebase.sessions.SessionFirelogPublisher;
import com.google.firebase.sessions.SessionFirelogPublisherImpl;
import com.google.firebase.sessions.SessionGenerator;
import com.google.firebase.sessions.SessionLifecycleServiceBinder;
import com.google.firebase.sessions.SessionLifecycleServiceBinderImpl;
import com.google.firebase.sessions.WallClock;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class FirebaseSessionsRegistrar
implements ComponentRegistrar {
    private static final FirebaseSessionsRegistrar$Companion Companion;
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final Qualified backgroundDispatcher;
    private static final Qualified blockingDispatcher;
    private static final Qualified firebaseApp;
    private static final Qualified firebaseInstallationsApi;
    private static final Qualified sessionLifecycleServiceBinder;
    private static final Qualified sessionsSettings;
    private static final Qualified transportFactory;

    static {
        Object object = new FirebaseSessionsRegistrar$Companion(null);
        Companion = object;
        object = Qualified.unqualified(FirebaseApp.class);
        Intrinsics.checkNotNullExpressionValue(object, "unqualified(FirebaseApp::class.java)");
        firebaseApp = object;
        object = Qualified.unqualified(FirebaseInstallationsApi.class);
        Intrinsics.checkNotNullExpressionValue(object, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = object;
        Class<c> clazz = c.class;
        object = Qualified.qualified(Background.class, clazz);
        Intrinsics.checkNotNullExpressionValue(object, "qualified(Background::cl\u2026neDispatcher::class.java)");
        backgroundDispatcher = object;
        object = Qualified.qualified(Blocking.class, clazz);
        Intrinsics.checkNotNullExpressionValue(object, "qualified(Blocking::clas\u2026neDispatcher::class.java)");
        blockingDispatcher = object;
        object = Qualified.unqualified(TransportFactory.class);
        Intrinsics.checkNotNullExpressionValue(object, "unqualified(TransportFactory::class.java)");
        transportFactory = object;
        object = Qualified.unqualified(SessionsSettings.class);
        Intrinsics.checkNotNullExpressionValue(object, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = object;
        object = Qualified.unqualified(SessionLifecycleServiceBinder.class);
        Intrinsics.checkNotNullExpressionValue(object, "unqualified(SessionLifec\u2026erviceBinder::class.java)");
        sessionLifecycleServiceBinder = object;
    }

    public static /* synthetic */ SessionDatastore a(ComponentContainer componentContainer) {
        return FirebaseSessionsRegistrar.getComponents$lambda$4(componentContainer);
    }

    public static /* synthetic */ SessionLifecycleServiceBinder b(ComponentContainer componentContainer) {
        return FirebaseSessionsRegistrar.getComponents$lambda$5(componentContainer);
    }

    public static /* synthetic */ SessionsSettings c(ComponentContainer componentContainer) {
        return FirebaseSessionsRegistrar.getComponents$lambda$3(componentContainer);
    }

    public static /* synthetic */ SessionFirelogPublisher d(ComponentContainer componentContainer) {
        return FirebaseSessionsRegistrar.getComponents$lambda$2(componentContainer);
    }

    public static /* synthetic */ SessionGenerator e(ComponentContainer componentContainer) {
        return FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
    }

    public static /* synthetic */ FirebaseSessions f(ComponentContainer componentContainer) {
        return FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
    }

    private static final FirebaseSessions getComponents$lambda$0(ComponentContainer object) {
        Object object2 = firebaseApp;
        object2 = object.get((Qualified)object2);
        Intrinsics.checkNotNullExpressionValue(object2, "container[firebaseApp]");
        object2 = (FirebaseApp)object2;
        Object object3 = sessionsSettings;
        object3 = object.get((Qualified)object3);
        Intrinsics.checkNotNullExpressionValue(object3, "container[sessionsSettings]");
        object3 = (SessionsSettings)object3;
        Object object4 = backgroundDispatcher;
        object4 = object.get((Qualified)object4);
        Intrinsics.checkNotNullExpressionValue(object4, "container[backgroundDispatcher]");
        object4 = (CoroutineContext)object4;
        Qualified qualified = sessionLifecycleServiceBinder;
        object = object.get(qualified);
        Intrinsics.checkNotNullExpressionValue(object, "container[sessionLifecycleServiceBinder]");
        object = (SessionLifecycleServiceBinder)object;
        FirebaseSessions firebaseSessions = new FirebaseSessions((FirebaseApp)object2, (SessionsSettings)object3, (CoroutineContext)object4, (SessionLifecycleServiceBinder)object);
        return firebaseSessions;
    }

    private static final SessionGenerator getComponents$lambda$1(ComponentContainer object) {
        WallClock wallClock = WallClock.INSTANCE;
        object = new SessionGenerator(wallClock, null, 2, null);
        return object;
    }

    private static final SessionFirelogPublisher getComponents$lambda$2(ComponentContainer object) {
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        Object object2 = firebaseApp;
        object2 = object.get((Qualified)object2);
        Intrinsics.checkNotNullExpressionValue(object2, "container[firebaseApp]");
        Object object3 = object2;
        object3 = (FirebaseApp)object2;
        object2 = firebaseInstallationsApi;
        object2 = object.get((Qualified)object2);
        Intrinsics.checkNotNullExpressionValue(object2, "container[firebaseInstallationsApi]");
        Object object4 = object2;
        object4 = (FirebaseInstallationsApi)object2;
        object2 = sessionsSettings;
        object2 = object.get((Qualified)object2);
        Intrinsics.checkNotNullExpressionValue(object2, "container[sessionsSettings]");
        Object object5 = object2;
        object5 = (SessionsSettings)object2;
        object2 = transportFactory;
        object2 = object.getProvider((Qualified)object2);
        Intrinsics.checkNotNullExpressionValue(object2, "container.getProvider(transportFactory)");
        EventGDTLogger eventGDTLogger = new EventGDTLogger((Provider)object2);
        object2 = backgroundDispatcher;
        object = object.get((Qualified)object2);
        Intrinsics.checkNotNullExpressionValue(object, "container[backgroundDispatcher]");
        Object object6 = object;
        object6 = (CoroutineContext)object;
        object2 = sessionFirelogPublisherImpl;
        sessionFirelogPublisherImpl = new SessionFirelogPublisherImpl((FirebaseApp)object3, (FirebaseInstallationsApi)object4, (SessionsSettings)object5, eventGDTLogger, (CoroutineContext)object6);
        return sessionFirelogPublisherImpl;
    }

    private static final SessionsSettings getComponents$lambda$3(ComponentContainer object) {
        Object object2 = firebaseApp;
        object2 = object.get((Qualified)object2);
        Intrinsics.checkNotNullExpressionValue(object2, "container[firebaseApp]");
        object2 = (FirebaseApp)object2;
        Object object3 = blockingDispatcher;
        object3 = object.get((Qualified)object3);
        Intrinsics.checkNotNullExpressionValue(object3, "container[blockingDispatcher]");
        object3 = (CoroutineContext)object3;
        Object object4 = backgroundDispatcher;
        object4 = object.get((Qualified)object4);
        Intrinsics.checkNotNullExpressionValue(object4, "container[backgroundDispatcher]");
        object4 = (CoroutineContext)object4;
        Qualified qualified = firebaseInstallationsApi;
        object = object.get(qualified);
        Intrinsics.checkNotNullExpressionValue(object, "container[firebaseInstallationsApi]");
        object = (FirebaseInstallationsApi)object;
        SessionsSettings sessionsSettings = new SessionsSettings((FirebaseApp)object2, (CoroutineContext)object3, (CoroutineContext)object4, (FirebaseInstallationsApi)object);
        return sessionsSettings;
    }

    private static final SessionDatastore getComponents$lambda$4(ComponentContainer object) {
        Qualified qualified = firebaseApp;
        qualified = ((FirebaseApp)object.get(qualified)).getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(qualified, "container[firebaseApp].applicationContext");
        Qualified qualified2 = backgroundDispatcher;
        object = object.get(qualified2);
        Intrinsics.checkNotNullExpressionValue(object, "container[backgroundDispatcher]");
        object = (CoroutineContext)object;
        SessionDatastoreImpl sessionDatastoreImpl = new SessionDatastoreImpl((Context)qualified, (CoroutineContext)object);
        return sessionDatastoreImpl;
    }

    private static final SessionLifecycleServiceBinder getComponents$lambda$5(ComponentContainer object) {
        Qualified qualified = firebaseApp;
        object = object.get(qualified);
        Intrinsics.checkNotNullExpressionValue(object, "container[firebaseApp]");
        object = (FirebaseApp)object;
        SessionLifecycleServiceBinderImpl sessionLifecycleServiceBinderImpl = new SessionLifecycleServiceBinderImpl((FirebaseApp)object);
        return sessionLifecycleServiceBinderImpl;
    }

    public List getComponents() {
        Object object = Component.builder(FirebaseSessions.class);
        Object object2 = LIBRARY_NAME;
        object = ((Component$Builder)object).name((String)object2);
        Object object3 = firebaseApp;
        Object object4 = Dependency.required((Qualified)object3);
        object = ((Component$Builder)object).add((Dependency)object4);
        object4 = sessionsSettings;
        Object object5 = Dependency.required((Qualified)object4);
        object = ((Component$Builder)object).add((Dependency)object5);
        object5 = backgroundDispatcher;
        Object object6 = Dependency.required((Qualified)object5);
        object = ((Component$Builder)object).add((Dependency)object6);
        object6 = Dependency.required(sessionLifecycleServiceBinder);
        object = ((Component$Builder)object).add((Dependency)object6);
        object6 = new Object();
        object = ((Component$Builder)object).factory((ComponentFactory)object6).eagerInDefaultApp().build();
        object6 = Component.builder(SessionGenerator.class).name("session-generator");
        Object object7 = new Object();
        object6 = ((Component$Builder)object6).factory((ComponentFactory)object7).build();
        object7 = Component.builder(SessionFirelogPublisher.class).name("session-publisher");
        Object[] objectArray = Dependency.required((Qualified)object3);
        object7 = ((Component$Builder)object7).add((Dependency)objectArray);
        objectArray = firebaseInstallationsApi;
        Dependency dependency = Dependency.required((Qualified)objectArray);
        object7 = ((Component$Builder)object7).add(dependency);
        object4 = Dependency.required((Qualified)object4);
        object4 = ((Component$Builder)object7).add((Dependency)object4);
        object7 = Dependency.requiredProvider(transportFactory);
        object4 = ((Component$Builder)object4).add((Dependency)object7);
        object7 = Dependency.required((Qualified)object5);
        object4 = ((Component$Builder)object4).add((Dependency)object7);
        object7 = new Object();
        object4 = ((Component$Builder)object4).factory((ComponentFactory)object7).build();
        object7 = Component.builder(SessionsSettings.class).name("sessions-settings");
        dependency = Dependency.required((Qualified)object3);
        object7 = ((Component$Builder)object7).add(dependency);
        dependency = Dependency.required(blockingDispatcher);
        object7 = ((Component$Builder)object7).add(dependency);
        dependency = Dependency.required((Qualified)object5);
        object7 = ((Component$Builder)object7).add(dependency);
        objectArray = Dependency.required((Qualified)objectArray);
        object7 = ((Component$Builder)object7).add((Dependency)objectArray);
        objectArray = new Object();
        object7 = ((Component$Builder)object7).factory((ComponentFactory)objectArray).build();
        objectArray = Component.builder(SessionDatastore.class).name("sessions-datastore");
        dependency = Dependency.required((Qualified)object3);
        objectArray = objectArray.add(dependency);
        object5 = Dependency.required((Qualified)object5);
        object5 = objectArray.add((Dependency)object5);
        objectArray = new Object();
        object5 = ((Component$Builder)object5).factory((ComponentFactory)objectArray).build();
        objectArray = Component.builder(SessionLifecycleServiceBinder.class).name("sessions-service-binder");
        object3 = Dependency.required((Qualified)object3);
        object3 = objectArray.add((Dependency)object3);
        objectArray = new Object();
        object3 = ((Component$Builder)object3).factory((ComponentFactory)objectArray).build();
        object2 = LibraryVersionComponent.create((String)object2, "2.0.8");
        objectArray = new Component[]{object, object6, object4, object7, object5, object3, object2};
        return xx_2.i(objectArray);
    }
}

