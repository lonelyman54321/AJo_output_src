/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.eventbus;

import com.google.common.eventbus.Dispatcher$1;
import java.util.Iterator;

final class Dispatcher$PerThreadQueuedDispatcher$Event {
    private final Object event;
    private final Iterator subscribers;

    private Dispatcher$PerThreadQueuedDispatcher$Event(Object object, Iterator iterator) {
        this.event = object;
        this.subscribers = iterator;
    }

    public /* synthetic */ Dispatcher$PerThreadQueuedDispatcher$Event(Object object, Iterator iterator, Dispatcher$1 dispatcher$1) {
        this(object, iterator);
    }

    public static /* synthetic */ Iterator access$400(Dispatcher$PerThreadQueuedDispatcher$Event dispatcher$PerThreadQueuedDispatcher$Event) {
        return dispatcher$PerThreadQueuedDispatcher$Event.subscribers;
    }

    public static /* synthetic */ Object access$500(Dispatcher$PerThreadQueuedDispatcher$Event dispatcher$PerThreadQueuedDispatcher$Event) {
        return dispatcher$PerThreadQueuedDispatcher$Event.event;
    }
}

