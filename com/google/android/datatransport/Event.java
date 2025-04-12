/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport;

import com.google.android.datatransport.AutoValue_Event;
import com.google.android.datatransport.EventContext;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.ProductData;

public abstract class Event {
    public static Event ofData(int n3, Object object) {
        Integer n4 = n3;
        Priority priority = Priority.DEFAULT;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, null, null);
        return autoValue_Event;
    }

    public static Event ofData(int n3, Object object, EventContext eventContext) {
        Integer n4 = n3;
        Priority priority = Priority.DEFAULT;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, null, eventContext);
        return autoValue_Event;
    }

    public static Event ofData(int n3, Object object, ProductData productData) {
        Integer n4 = n3;
        Priority priority = Priority.DEFAULT;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, productData, null);
        return autoValue_Event;
    }

    public static Event ofData(int n3, Object object, ProductData productData, EventContext eventContext) {
        Integer n4 = n3;
        Priority priority = Priority.DEFAULT;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, productData, eventContext);
        return autoValue_Event;
    }

    public static Event ofData(Object object) {
        Priority priority = Priority.DEFAULT;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, null, null);
        return autoValue_Event;
    }

    public static Event ofData(Object object, EventContext eventContext) {
        Priority priority = Priority.DEFAULT;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, null, eventContext);
        return autoValue_Event;
    }

    public static Event ofData(Object object, ProductData productData) {
        Priority priority = Priority.DEFAULT;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, productData, null);
        return autoValue_Event;
    }

    public static Event ofData(Object object, ProductData productData, EventContext eventContext) {
        Priority priority = Priority.DEFAULT;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, productData, eventContext);
        return autoValue_Event;
    }

    public static Event ofTelemetry(int n3, Object object) {
        Integer n4 = n3;
        Priority priority = Priority.VERY_LOW;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, null, null);
        return autoValue_Event;
    }

    public static Event ofTelemetry(int n3, Object object, EventContext eventContext) {
        Integer n4 = n3;
        Priority priority = Priority.VERY_LOW;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, null, eventContext);
        return autoValue_Event;
    }

    public static Event ofTelemetry(int n3, Object object, ProductData productData) {
        Integer n4 = n3;
        Priority priority = Priority.VERY_LOW;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, productData, null);
        return autoValue_Event;
    }

    public static Event ofTelemetry(int n3, Object object, ProductData productData, EventContext eventContext) {
        Integer n4 = n3;
        Priority priority = Priority.VERY_LOW;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, productData, eventContext);
        return autoValue_Event;
    }

    public static Event ofTelemetry(Object object) {
        Priority priority = Priority.VERY_LOW;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, null, null);
        return autoValue_Event;
    }

    public static Event ofTelemetry(Object object, EventContext eventContext) {
        Priority priority = Priority.VERY_LOW;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, null, eventContext);
        return autoValue_Event;
    }

    public static Event ofTelemetry(Object object, ProductData productData) {
        Priority priority = Priority.VERY_LOW;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, productData, null);
        return autoValue_Event;
    }

    public static Event ofTelemetry(Object object, ProductData productData, EventContext eventContext) {
        Priority priority = Priority.VERY_LOW;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, productData, eventContext);
        return autoValue_Event;
    }

    public static Event ofUrgent(int n3, Object object) {
        Integer n4 = n3;
        Priority priority = Priority.HIGHEST;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, null, null);
        return autoValue_Event;
    }

    public static Event ofUrgent(int n3, Object object, EventContext eventContext) {
        Integer n4 = n3;
        Priority priority = Priority.HIGHEST;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, null, eventContext);
        return autoValue_Event;
    }

    public static Event ofUrgent(int n3, Object object, ProductData productData) {
        Integer n4 = n3;
        Priority priority = Priority.HIGHEST;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, productData, null);
        return autoValue_Event;
    }

    public static Event ofUrgent(int n3, Object object, ProductData productData, EventContext eventContext) {
        Integer n4 = n3;
        Priority priority = Priority.HIGHEST;
        AutoValue_Event autoValue_Event = new AutoValue_Event(n4, object, priority, productData, eventContext);
        return autoValue_Event;
    }

    public static Event ofUrgent(Object object) {
        Priority priority = Priority.HIGHEST;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, null, null);
        return autoValue_Event;
    }

    public static Event ofUrgent(Object object, EventContext eventContext) {
        Priority priority = Priority.HIGHEST;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, null, eventContext);
        return autoValue_Event;
    }

    public static Event ofUrgent(Object object, ProductData productData) {
        Priority priority = Priority.HIGHEST;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, productData, null);
        return autoValue_Event;
    }

    public static Event ofUrgent(Object object, ProductData productData, EventContext eventContext) {
        Priority priority = Priority.HIGHEST;
        AutoValue_Event autoValue_Event = new AutoValue_Event(null, object, priority, productData, eventContext);
        return autoValue_Event;
    }

    public abstract Integer getCode();

    public abstract EventContext getEventContext();

    public abstract Object getPayload();

    public abstract Priority getPriority();

    public abstract ProductData getProductData();
}

