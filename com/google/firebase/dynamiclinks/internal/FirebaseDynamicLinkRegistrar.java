/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.dynamiclinks.internal;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public final class FirebaseDynamicLinkRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    public static /* synthetic */ FirebaseDynamicLinks a(ComponentContainer componentContainer) {
        return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(componentContainer);
    }

    private static /* synthetic */ FirebaseDynamicLinks lambda$getComponents$0(ComponentContainer object) {
        FirebaseApp firebaseApp = (FirebaseApp)object.get(FirebaseApp.class);
        object = object.getProvider(AnalyticsConnector.class);
        FirebaseDynamicLinksImpl firebaseDynamicLinksImpl = new FirebaseDynamicLinksImpl(firebaseApp, (Provider)object);
        return firebaseDynamicLinksImpl;
    }

    public List getComponents() {
        Object object = Component.builder(FirebaseDynamicLinks.class);
        Object object2 = LIBRARY_NAME;
        object = ((Component$Builder)object).name((String)object2);
        Component[] componentArray = Dependency.required(FirebaseApp.class);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = Dependency.optionalProvider(AnalyticsConnector.class);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = new Object();
        object = ((Component$Builder)object).factory((ComponentFactory)componentArray).build();
        object2 = LibraryVersionComponent.create((String)object2, "22.0.0");
        componentArray = new Component[]{object, object2};
        return Arrays.asList(componentArray);
    }
}

