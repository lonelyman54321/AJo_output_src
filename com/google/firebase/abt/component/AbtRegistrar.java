/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.component.AbtComponent;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public class AbtRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ AbtComponent a(ComponentContainer componentContainer) {
        return AbtRegistrar.lambda$getComponents$0(componentContainer);
    }

    private static /* synthetic */ AbtComponent lambda$getComponents$0(ComponentContainer object) {
        Context context = (Context)object.get(Context.class);
        object = object.getProvider(AnalyticsConnector.class);
        AbtComponent abtComponent = new AbtComponent(context, (Provider)object);
        return abtComponent;
    }

    public List getComponents() {
        Object object = Component.builder(AbtComponent.class);
        Object object2 = LIBRARY_NAME;
        object = ((Component$Builder)object).name((String)object2);
        Component[] componentArray = Dependency.required(Context.class);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = Dependency.optionalProvider(AnalyticsConnector.class);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = new Object();
        object = ((Component$Builder)object).factory((ComponentFactory)componentArray).build();
        object2 = LibraryVersionComponent.create((String)object2, "21.1.1");
        componentArray = new Component[]{object, object2};
        return Arrays.asList(componentArray);
    }
}

