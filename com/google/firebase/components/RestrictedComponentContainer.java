/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.DependencyException;
import com.google.firebase.components.Qualified;
import com.google.firebase.components.RestrictedComponentContainer$RestrictedPublisher;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class RestrictedComponentContainer
implements ComponentContainer {
    private final Set allowedDeferredInterfaces;
    private final Set allowedDirectInterfaces;
    private final Set allowedProviderInterfaces;
    private final Set allowedPublishedEvents;
    private final Set allowedSetDirectInterfaces;
    private final Set allowedSetProviderInterfaces;
    private final ComponentContainer delegateContainer;

    public RestrictedComponentContainer(Component object, ComponentContainer componentContainer) {
        boolean bl2;
        Set<Object> set = new Set<Object>();
        HashSet<Object> hashSet = new HashSet<Object>();
        HashSet<Object> hashSet2 = new HashSet<Object>();
        HashSet<Object> hashSet3 = new HashSet<Object>();
        HashSet<Object> hashSet4 = new HashSet<Object>();
        Object object2 = ((Component)object).getDependencies().iterator();
        while (bl2 = object2.hasNext()) {
            Object object3 = (Dependency)object2.next();
            boolean bl3 = ((Dependency)object3).isDirectInjection();
            if (bl3) {
                bl3 = ((Dependency)object3).isSet();
                if (bl3) {
                    object3 = ((Dependency)object3).getInterface();
                    hashSet3.add(object3);
                    continue;
                }
                object3 = ((Dependency)object3).getInterface();
                ((HashSet)set).add(object3);
                continue;
            }
            bl3 = ((Dependency)object3).isDeferred();
            if (bl3) {
                object3 = ((Dependency)object3).getInterface();
                hashSet2.add(object3);
                continue;
            }
            bl3 = ((Dependency)object3).isSet();
            if (bl3) {
                object3 = ((Dependency)object3).getInterface();
                hashSet4.add(object3);
                continue;
            }
            object3 = ((Dependency)object3).getInterface();
            hashSet.add(object3);
        }
        object2 = ((Component)object).getPublishedEvents();
        boolean bl4 = object2.isEmpty();
        if (!bl4) {
            object2 = Qualified.unqualified(Publisher.class);
            ((HashSet)set).add(object2);
        }
        this.allowedDirectInterfaces = set = Collections.unmodifiableSet(set);
        this.allowedProviderInterfaces = set = Collections.unmodifiableSet(hashSet);
        this.allowedDeferredInterfaces = set = Collections.unmodifiableSet(hashSet2);
        this.allowedSetDirectInterfaces = set = Collections.unmodifiableSet(hashSet3);
        this.allowedSetProviderInterfaces = set = Collections.unmodifiableSet(hashSet4);
        this.allowedPublishedEvents = object = ((Component)object).getPublishedEvents();
        this.delegateContainer = componentContainer;
    }

    public Object get(Qualified object) {
        Object object2 = this.allowedDirectInterfaces;
        boolean bl2 = object2.contains(object);
        if (bl2) {
            return this.delegateContainer.get((Qualified)object);
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to request an undeclared dependency ");
        stringBuilder.append(object);
        stringBuilder.append(".");
        object = stringBuilder.toString();
        object2 = new DependencyException((String)object);
        throw object2;
    }

    public Object get(Class object) {
        Object object2 = this.allowedDirectInterfaces;
        Class<Publisher> clazz = Qualified.unqualified((Class)object);
        boolean bl2 = object2.contains(clazz);
        if (bl2) {
            object2 = this.delegateContainer.get((Class)object);
            clazz = Publisher.class;
            boolean bl3 = object.equals(clazz);
            if (!bl3) {
                return object2;
            }
            clazz = this.allowedPublishedEvents;
            object2 = (Publisher)object2;
            object = new RestrictedComponentContainer$RestrictedPublisher((Set)((Object)clazz), (Publisher)object2);
            return object;
        }
        clazz = new StringBuilder("Attempting to request an undeclared dependency ");
        ((StringBuilder)((Object)clazz)).append(object);
        ((StringBuilder)((Object)clazz)).append(".");
        object = ((StringBuilder)((Object)clazz)).toString();
        object2 = new DependencyException((String)object);
        throw object2;
    }

    public Deferred getDeferred(Qualified object) {
        Object object2 = this.allowedDeferredInterfaces;
        boolean bl2 = object2.contains(object);
        if (bl2) {
            return this.delegateContainer.getDeferred((Qualified)object);
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to request an undeclared dependency Deferred<");
        stringBuilder.append(object);
        stringBuilder.append(">.");
        object = stringBuilder.toString();
        object2 = new DependencyException((String)object);
        throw object2;
    }

    public Deferred getDeferred(Class object) {
        object = Qualified.unqualified((Class)object);
        return this.getDeferred((Qualified)object);
    }

    public Provider getProvider(Qualified object) {
        Object object2 = this.allowedProviderInterfaces;
        boolean bl2 = object2.contains(object);
        if (bl2) {
            return this.delegateContainer.getProvider((Qualified)object);
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to request an undeclared dependency Provider<");
        stringBuilder.append(object);
        stringBuilder.append(">.");
        object = stringBuilder.toString();
        object2 = new DependencyException((String)object);
        throw object2;
    }

    public Provider getProvider(Class object) {
        object = Qualified.unqualified((Class)object);
        return this.getProvider((Qualified)object);
    }

    public Set setOf(Qualified object) {
        Object object2 = this.allowedSetDirectInterfaces;
        boolean bl2 = object2.contains(object);
        if (bl2) {
            return this.delegateContainer.setOf((Qualified)object);
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to request an undeclared dependency Set<");
        stringBuilder.append(object);
        stringBuilder.append(">.");
        object = stringBuilder.toString();
        object2 = new DependencyException((String)object);
        throw object2;
    }

    public final /* synthetic */ Set setOf(Class clazz) {
        return g10.f(this, clazz);
    }

    public Provider setOfProvider(Qualified object) {
        Object object2 = this.allowedSetProviderInterfaces;
        boolean bl2 = object2.contains(object);
        if (bl2) {
            return this.delegateContainer.setOfProvider((Qualified)object);
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to request an undeclared dependency Provider<Set<");
        stringBuilder.append(object);
        stringBuilder.append(">>.");
        object = stringBuilder.toString();
        object2 = new DependencyException((String)object);
        throw object2;
    }

    public Provider setOfProvider(Class object) {
        object = Qualified.unqualified((Class)object);
        return this.setOfProvider((Qualified)object);
    }
}

