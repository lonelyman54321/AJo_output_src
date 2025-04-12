/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.Preconditions;
import com.google.firebase.components.c;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class EventBus
implements Subscriber,
Publisher {
    private final Executor defaultExecutor;
    private final Map handlerMap;
    private Queue pendingEvents;

    public EventBus(Executor executor) {
        Cloneable cloneable;
        this.handlerMap = cloneable = new Cloneable();
        this.pendingEvents = cloneable;
        this.defaultExecutor = executor;
    }

    public static /* synthetic */ void a(Map.Entry entry, Event event) {
        EventBus.lambda$publish$0(entry, event);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Set getHandlers(Event set) {
        synchronized (this) {
            try {
                Map map2 = this.handlerMap;
                set = ((Event)((Object)set)).getType();
                set = map2.get(set);
                set = (Map)((Object)set);
                if (set != null) return set.entrySet();
                return Collections.emptySet();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static /* synthetic */ void lambda$publish$0(Map.Entry entry, Event event) {
        ((EventHandler)entry.getKey()).handle(event);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void enablePublishingAndFlushPending() {
        Event event;
        boolean bl2;
        Object object;
        block6: {
            block5: {
                // MONITORENTER : this
                object = this.pendingEvents;
                bl2 = false;
                event = null;
                if (object == null) break block5;
                this.pendingEvents = null;
                break block6;
            }
            object = null;
        }
        // MONITOREXIT : this
        if (object == null) return;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            event = (Event)object.next();
            this.publish(event);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void publish(Event event) {
        boolean bl2;
        Preconditions.checkNotNull(event);
        // MONITORENTER : this
        Object object = this.pendingEvents;
        if (object != null) {
            object.add(event);
            // MONITOREXIT : this
            return;
        }
        object = this.getHandlers(event).iterator();
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            Executor executor = (Executor)entry.getValue();
            c c2 = new c(entry, event);
            executor.execute(c2);
        }
    }

    public void subscribe(Class clazz, EventHandler eventHandler) {
        Executor executor = this.defaultExecutor;
        this.subscribe(clazz, executor, eventHandler);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void subscribe(Class serializable, Executor executor, EventHandler eventHandler) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Map map2;
                block3: {
                    try {
                        Preconditions.checkNotNull(serializable);
                        Preconditions.checkNotNull(eventHandler);
                        Preconditions.checkNotNull(executor);
                        map2 = this.handlerMap;
                        boolean bl2 = map2.containsKey(serializable);
                        if (bl2) break block3;
                        map2 = this.handlerMap;
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        map2.put(serializable, concurrentHashMap);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                map2 = this.handlerMap;
                serializable = map2.get(serializable);
                serializable = (ConcurrentHashMap)serializable;
                ((ConcurrentHashMap)serializable).put(eventHandler, executor);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unsubscribe(Class clazz, EventHandler object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Map map2;
                block5: {
                    try {
                        Preconditions.checkNotNull(clazz);
                        Preconditions.checkNotNull(object);
                        map2 = this.handlerMap;
                        boolean bl2 = map2.containsKey(clazz);
                        if (bl2) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return;
                }
                map2 = this.handlerMap;
                map2 = map2.get(clazz);
                map2 = (ConcurrentHashMap)map2;
                ((ConcurrentHashMap)map2).remove(object);
                boolean bl3 = ((ConcurrentHashMap)map2).isEmpty();
                if (!bl3) break block6;
                object = this.handlerMap;
                object.remove(clazz);
            }
            return;
            throw throwable2;
        }
    }
}

