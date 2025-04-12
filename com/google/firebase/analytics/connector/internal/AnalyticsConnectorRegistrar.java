/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.analytics.connector.internal.zzb;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public class AnalyticsConnectorRegistrar
implements ComponentRegistrar {
    public static /* synthetic */ AnalyticsConnector lambda$getComponents$0(ComponentContainer object) {
        FirebaseApp firebaseApp = (FirebaseApp)object.get(FirebaseApp.class);
        Context context = (Context)object.get(Context.class);
        object = (Subscriber)object.get(Subscriber.class);
        return AnalyticsConnectorImpl.getInstance(firebaseApp, context, (Subscriber)object);
    }

    public List getComponents() {
        Object object = Component.builder(AnalyticsConnector.class);
        Object object2 = Dependency.required(FirebaseApp.class);
        object = ((Component$Builder)object).add((Dependency)object2);
        object2 = Dependency.required(Context.class);
        object = ((Component$Builder)object).add((Dependency)object2);
        object2 = Dependency.required(Subscriber.class);
        object = ((Component$Builder)object).add((Dependency)object2);
        object2 = new zzb();
        object = ((Component$Builder)object).factory((ComponentFactory)object2).eagerInDefaultApp().build();
        object2 = LibraryVersionComponent.create("fire-analytics", "22.2.0");
        Component[] componentArray = new Component[]{object, object2};
        return Arrays.asList(componentArray);
    }
}

