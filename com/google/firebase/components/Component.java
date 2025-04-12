/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.Component$1;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public final class Component {
    private final Set dependencies;
    private final ComponentFactory factory;
    private final int instantiation;
    private final String name;
    private final Set providedInterfaces;
    private final Set publishedEvents;
    private final int type;

    private Component(String set, Set set2, Set set3, int n3, int n4, ComponentFactory componentFactory, Set set4) {
        this.name = set;
        set = Collections.unmodifiableSet(set2);
        this.providedInterfaces = set;
        this.dependencies = set = Collections.unmodifiableSet(set3);
        this.instantiation = n3;
        this.type = n4;
        this.factory = componentFactory;
        this.publishedEvents = set = Collections.unmodifiableSet(set4);
    }

    public /* synthetic */ Component(String string2, Set set, Set set2, int n3, int n4, ComponentFactory componentFactory, Set set3, Component$1 component$1) {
        this(string2, set, set2, n3, n4, componentFactory, set3);
    }

    public static /* synthetic */ Object a(Object object, ComponentContainer componentContainer) {
        return object;
    }

    public static /* synthetic */ Object b(Object object, ComponentContainer componentContainer) {
        return object;
    }

    public static Component$Builder builder(Qualified qualified) {
        Qualified[] qualifiedArray = new Qualified[]{};
        Component$Builder component$Builder = new Component$Builder(qualified, qualifiedArray, null);
        return component$Builder;
    }

    public static Component$Builder builder(Qualified qualified, Qualified ... qualifiedArray) {
        Component$Builder component$Builder = new Component$Builder(qualified, qualifiedArray, null);
        return component$Builder;
    }

    public static Component$Builder builder(Class clazz) {
        Class[] classArray = new Class[]{};
        Component$Builder component$Builder = new Component$Builder(clazz, classArray, null);
        return component$Builder;
    }

    public static Component$Builder builder(Class clazz, Class ... classArray) {
        Component$Builder component$Builder = new Component$Builder(clazz, classArray, null);
        return component$Builder;
    }

    public static /* synthetic */ Object c(Object object, ComponentContainer componentContainer) {
        return object;
    }

    public static /* synthetic */ Object d(Object object, ComponentContainer componentContainer) {
        return object;
    }

    public static /* synthetic */ Object e(Object object, ComponentContainer componentContainer) {
        return object;
    }

    public static Component intoSet(Object object, Qualified object2) {
        object2 = Component.intoSetBuilder((Qualified)object2);
        r00_0 r00_02 = new r00_0(object);
        return ((Component$Builder)object2).factory(r00_02).build();
    }

    public static Component intoSet(Object object, Class object2) {
        object2 = Component.intoSetBuilder((Class)object2);
        s00_0 s00_02 = new s00_0(object);
        return ((Component$Builder)object2).factory(s00_02).build();
    }

    public static Component$Builder intoSetBuilder(Qualified qualified) {
        return Component$Builder.access$200(Component.builder(qualified));
    }

    public static Component$Builder intoSetBuilder(Class clazz) {
        return Component$Builder.access$200(Component.builder(clazz));
    }

    public static Component of(Class object, Object object2) {
        object = Component.builder((Class)object);
        t00_0 t00_02 = new t00_0(object2);
        return ((Component$Builder)object).factory(t00_02).build();
    }

    public static Component of(Object object, Qualified object2, Qualified ... object3) {
        object2 = Component.builder((Qualified)object2, object3);
        object3 = new Q00(object);
        return ((Component$Builder)object2).factory((ComponentFactory)object3).build();
    }

    public static Component of(Object object, Class object2, Class ... object3) {
        object2 = Component.builder((Class)object2, object3);
        object3 = new U00(object);
        return ((Component$Builder)object2).factory((ComponentFactory)object3).build();
    }

    public Set getDependencies() {
        return this.dependencies;
    }

    public ComponentFactory getFactory() {
        return this.factory;
    }

    public String getName() {
        return this.name;
    }

    public Set getProvidedInterfaces() {
        return this.providedInterfaces;
    }

    public Set getPublishedEvents() {
        return this.publishedEvents;
    }

    public boolean isAlwaysEager() {
        int n3 = this.instantiation;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean isEagerInDefaultApp() {
        int n3 = this.instantiation;
        int n4 = 2;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isLazy() {
        int n3 = this.instantiation;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isValue() {
        int n3 = this.type;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Component<");
        String string2 = Arrays.toString(this.providedInterfaces.toArray());
        stringBuilder.append(string2);
        stringBuilder.append(">{");
        int n3 = this.instantiation;
        stringBuilder.append(n3);
        stringBuilder.append(", type=");
        n3 = this.type;
        stringBuilder.append(n3);
        stringBuilder.append(", deps=");
        string2 = Arrays.toString(this.dependencies.toArray());
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public Component withFactory(ComponentFactory componentFactory) {
        String string2 = this.name;
        Set set = this.providedInterfaces;
        Set set2 = this.dependencies;
        int n3 = this.instantiation;
        int n4 = this.type;
        Set set3 = this.publishedEvents;
        Component component = new Component(string2, set, set2, n3, n4, componentFactory, set3);
        return component;
    }
}

