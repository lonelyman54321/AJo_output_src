/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.Component;
import com.google.firebase.components.Component$1;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Preconditions;
import com.google.firebase.components.Qualified;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Component$Builder {
    private final Set dependencies;
    private ComponentFactory factory;
    private int instantiation;
    private String name = null;
    private final Set providedInterfaces;
    private final Set publishedEvents;
    private int type;

    private Component$Builder(Qualified qualified, Qualified ... qualifiedArray) {
        HashSet hashSet;
        Object object = new HashSet();
        this.providedInterfaces = object;
        this.dependencies = hashSet = new HashSet();
        hashSet = null;
        this.instantiation = 0;
        this.type = 0;
        Object object2 = new HashSet();
        this.publishedEvents = object2;
        object2 = "Null interface";
        Preconditions.checkNotNull(qualified, (String)object2);
        object.add(qualified);
        int n3 = qualifiedArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            object = qualifiedArray[i3];
            Preconditions.checkNotNull(object, (String)object2);
        }
        Collections.addAll(this.providedInterfaces, qualifiedArray);
    }

    public /* synthetic */ Component$Builder(Qualified qualified, Qualified[] qualifiedArray, Component$1 component$1) {
        this(qualified, qualifiedArray);
    }

    private Component$Builder(Class object, Class ... classArray) {
        HashSet hashSet;
        HashSet<Object> object22;
        this.providedInterfaces = object22 = new HashSet<Object>();
        this.dependencies = hashSet = new HashSet();
        hashSet = null;
        this.instantiation = 0;
        this.type = 0;
        Object object2 = new HashSet();
        this.publishedEvents = object2;
        object2 = "Null interface";
        Preconditions.checkNotNull(object, (String)object2);
        object = Qualified.unqualified((Class)object);
        object22.add(object);
        for (Class clazz : classArray) {
            Preconditions.checkNotNull(clazz, (String)object2);
            Set set = this.providedInterfaces;
            Qualified qualified = Qualified.unqualified(clazz);
            set.add(qualified);
        }
    }

    public /* synthetic */ Component$Builder(Class clazz, Class[] classArray, Component$1 component$1) {
        this(clazz, classArray);
    }

    public static /* synthetic */ Component$Builder access$200(Component$Builder component$Builder) {
        return component$Builder.intoSet();
    }

    private Component$Builder intoSet() {
        this.type = 1;
        return this;
    }

    private Component$Builder setInstantiation(int n3) {
        int n4 = this.instantiation;
        n4 = n4 == 0 ? 1 : 0;
        Preconditions.checkState(n4 != 0, "Instantiation type has already been set.");
        this.instantiation = n3;
        return this;
    }

    private void validateInterface(Qualified qualified) {
        Preconditions.checkArgument(this.providedInterfaces.contains(qualified) ^ true, "Components are not allowed to depend on interfaces they themselves provide.");
    }

    public Component$Builder add(Dependency dependency) {
        Preconditions.checkNotNull(dependency, "Null dependency");
        Qualified qualified = dependency.getInterface();
        this.validateInterface(qualified);
        this.dependencies.add(dependency);
        return this;
    }

    public Component$Builder alwaysEager() {
        return this.setInstantiation(1);
    }

    public Component build() {
        boolean bl2;
        Object object = this.factory;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkState(bl2, "Missing required property: factory.");
        String string2 = this.name;
        Set set = this.providedInterfaces;
        HashSet hashSet = new HashSet(set);
        set = this.dependencies;
        HashSet hashSet2 = new HashSet(set);
        int n3 = this.instantiation;
        int n4 = this.type;
        ComponentFactory componentFactory = this.factory;
        Set set2 = this.publishedEvents;
        object = new Component(string2, hashSet, hashSet2, n3, n4, componentFactory, set2, null);
        return object;
    }

    public Component$Builder eagerInDefaultApp() {
        return this.setInstantiation(2);
    }

    public Component$Builder factory(ComponentFactory componentFactory) {
        this.factory = componentFactory = (ComponentFactory)Preconditions.checkNotNull(componentFactory, "Null factory");
        return this;
    }

    public Component$Builder name(String string2) {
        this.name = string2;
        return this;
    }

    public Component$Builder publishes(Class clazz) {
        this.publishedEvents.add(clazz);
        return this;
    }
}

