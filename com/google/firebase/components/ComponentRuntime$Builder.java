/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.components.ComponentRuntime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

public final class ComponentRuntime$Builder {
    private final List additionalComponents;
    private ComponentRegistrarProcessor componentRegistrarProcessor;
    private final Executor defaultExecutor;
    private final List lazyRegistrars;

    public ComponentRuntime$Builder(Executor executor) {
        Object object = new ArrayList();
        this.lazyRegistrars = object;
        object = new ArrayList();
        this.additionalComponents = object;
        this.componentRegistrarProcessor = object = ComponentRegistrarProcessor.NOOP;
        this.defaultExecutor = executor;
    }

    public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    public ComponentRuntime$Builder addComponent(Component component) {
        this.additionalComponents.add(component);
        return this;
    }

    public ComponentRuntime$Builder addComponentRegistrar(ComponentRegistrar componentRegistrar) {
        List list = this.lazyRegistrars;
        r10 r102 = new r10(componentRegistrar);
        list.add(r102);
        return this;
    }

    public ComponentRuntime$Builder addLazyComponentRegistrars(Collection collection) {
        this.lazyRegistrars.addAll(collection);
        return this;
    }

    public ComponentRuntime build() {
        Executor executor = this.defaultExecutor;
        List list = this.lazyRegistrars;
        List list2 = this.additionalComponents;
        ComponentRegistrarProcessor componentRegistrarProcessor = this.componentRegistrarProcessor;
        ComponentRuntime componentRuntime = new ComponentRuntime(executor, (Iterable)list, list2, componentRegistrarProcessor, null);
        return componentRuntime;
    }

    public ComponentRuntime$Builder setProcessor(ComponentRegistrarProcessor componentRegistrarProcessor) {
        this.componentRegistrarProcessor = componentRegistrarProcessor;
        return this;
    }
}

