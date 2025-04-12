/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.tracing.FirebaseTrace;
import java.util.ArrayList;
import java.util.List;

public class ComponentMonitor
implements ComponentRegistrarProcessor {
    public static /* synthetic */ Object a(String string2, Component component, ComponentContainer componentContainer) {
        return ComponentMonitor.lambda$processRegistrar$0(string2, component, componentContainer);
    }

    private static /* synthetic */ Object lambda$processRegistrar$0(String object, Component component, ComponentContainer componentContainer) {
        try {
            FirebaseTrace.pushTrace((String)object);
            object = component.getFactory();
            object = object.create(componentContainer);
            return object;
        }
        finally {
            FirebaseTrace.popTrace();
        }
    }

    public List processRegistrar(ComponentRegistrar object) {
        boolean bl2;
        ArrayList<Component> arrayList = new ArrayList<Component>();
        object = object.getComponents().iterator();
        while (bl2 = object.hasNext()) {
            Component component = (Component)object.next();
            String string2 = component.getName();
            if (string2 != null) {
                l10 l102 = new l10(string2, component);
                component = component.withFactory(l102);
            }
            arrayList.add(component);
        }
        return arrayList;
    }
}

