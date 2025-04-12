/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.DependencyException;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import java.util.Set;

class RestrictedComponentContainer$RestrictedPublisher
implements Publisher {
    private final Set allowedPublishedEvents;
    private final Publisher delegate;

    public RestrictedComponentContainer$RestrictedPublisher(Set set, Publisher publisher) {
        this.allowedPublishedEvents = set;
        this.delegate = publisher;
    }

    public void publish(Event object) {
        Object object2 = this.allowedPublishedEvents;
        Class clazz = ((Event)object).getType();
        boolean bl2 = object2.contains(clazz);
        if (bl2) {
            this.delegate.publish((Event)object);
            return;
        }
        Object[] objectArray = new Object[]{object};
        object = String.format("Attempting to publish an undeclared event %s.", objectArray);
        object2 = new DependencyException((String)object);
        throw object2;
    }
}

