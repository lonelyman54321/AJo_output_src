/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.datatransport;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.datatransport.LegacyTransportBackend;
import com.google.firebase.datatransport.TransportBackend;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public class TransportRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ TransportFactory a(ComponentContainer componentContainer) {
        return TransportRegistrar.lambda$getComponents$2(componentContainer);
    }

    public static /* synthetic */ TransportFactory b(ComponentContainer componentContainer) {
        return TransportRegistrar.lambda$getComponents$1(componentContainer);
    }

    public static /* synthetic */ TransportFactory c(ComponentContainer componentContainer) {
        return TransportRegistrar.lambda$getComponents$0(componentContainer);
    }

    private static /* synthetic */ TransportFactory lambda$getComponents$0(ComponentContainer object) {
        TransportRuntime.initialize((Context)object.get(Context.class));
        object = TransportRuntime.getInstance();
        CCTDestination cCTDestination = CCTDestination.LEGACY_INSTANCE;
        return ((TransportRuntime)object).newFactory(cCTDestination);
    }

    private static /* synthetic */ TransportFactory lambda$getComponents$1(ComponentContainer object) {
        TransportRuntime.initialize((Context)object.get(Context.class));
        object = TransportRuntime.getInstance();
        CCTDestination cCTDestination = CCTDestination.LEGACY_INSTANCE;
        return ((TransportRuntime)object).newFactory(cCTDestination);
    }

    private static /* synthetic */ TransportFactory lambda$getComponents$2(ComponentContainer object) {
        TransportRuntime.initialize((Context)object.get(Context.class));
        object = TransportRuntime.getInstance();
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        return ((TransportRuntime)object).newFactory(cCTDestination);
    }

    public List getComponents() {
        Object object = TransportFactory.class;
        Object object2 = Component.builder(object);
        Object object3 = LIBRARY_NAME;
        object2 = ((Component$Builder)object2).name((String)object3);
        Component[] componentArray = Context.class;
        Object object4 = Dependency.required(componentArray);
        object2 = ((Component$Builder)object2).add((Dependency)object4);
        object4 = new Object();
        object2 = ((Component$Builder)object2).factory((ComponentFactory)object4).build();
        object4 = Component.builder(Qualified.qualified(LegacyTransportBackend.class, object));
        Object object5 = Dependency.required(componentArray);
        object4 = ((Component$Builder)object4).add((Dependency)object5);
        object5 = new Object();
        object4 = ((Component$Builder)object4).factory((ComponentFactory)object5).build();
        object = Component.builder(Qualified.qualified(TransportBackend.class, object));
        componentArray = Dependency.required(componentArray);
        object = ((Component$Builder)object).add((Dependency)componentArray);
        componentArray = new Object();
        object = ((Component$Builder)object).factory((ComponentFactory)componentArray).build();
        object3 = LibraryVersionComponent.create((String)object3, "19.0.0");
        componentArray = new Component[]{object2, object4, object, object3};
        return Arrays.asList(componentArray);
    }
}

