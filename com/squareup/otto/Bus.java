/*
 * Decompiled with CFR 0.152.
 */
package com.squareup.otto;

import com.squareup.otto.Bus$EventWithHandler;
import com.squareup.otto.DeadEvent;
import com.squareup.otto.EventHandler;
import com.squareup.otto.EventProducer;
import com.squareup.otto.HandlerFinder;
import com.squareup.otto.ThreadEnforcer;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class Bus {
    public static final String DEFAULT_IDENTIFIER = "default";
    private final ThreadEnforcer enforcer;
    private final ThreadLocal eventsToDispatch;
    private final ConcurrentMap flattenHierarchyCache;
    private final HandlerFinder handlerFinder;
    private final ConcurrentMap handlersByType;
    private final String identifier;
    private final ThreadLocal isDispatching;
    private final ConcurrentMap producersByType;

    public Bus() {
        this(DEFAULT_IDENTIFIER);
    }

    public Bus(ThreadEnforcer threadEnforcer) {
        this(threadEnforcer, DEFAULT_IDENTIFIER);
    }

    public Bus(ThreadEnforcer threadEnforcer, String string2) {
        HandlerFinder handlerFinder = HandlerFinder.ANNOTATED;
        this(threadEnforcer, string2, handlerFinder);
    }

    public Bus(ThreadEnforcer threadEnforcer, String string2, HandlerFinder handlerFinder) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.handlersByType = concurrentHashMap;
        concurrentHashMap = new ConcurrentHashMap();
        this.producersByType = concurrentHashMap;
        concurrentHashMap = new ConcurrentHashMap(this);
        this.eventsToDispatch = concurrentHashMap;
        concurrentHashMap = new ConcurrentHashMap(this);
        this.isDispatching = concurrentHashMap;
        this.flattenHierarchyCache = concurrentHashMap = new ConcurrentHashMap();
        this.enforcer = threadEnforcer;
        this.identifier = string2;
        this.handlerFinder = handlerFinder;
    }

    public Bus(String string2) {
        ThreadEnforcer threadEnforcer = ThreadEnforcer.MAIN;
        this(threadEnforcer, string2);
    }

    private void dispatchProducerResultToHandler(EventHandler eventHandler, EventProducer object) {
        try {
            object = ((EventProducer)object).produceEvent();
        }
        catch (InvocationTargetException invocationTargetException) {
            String string2 = "Producer ";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            stringBuilder.append(" threw an exception.");
            Bus.throwRuntimeException(stringBuilder.toString(), invocationTargetException);
            object = null;
        }
        if (object == null) {
            return;
        }
        this.dispatch(object, eventHandler);
    }

    private Set getClassesFor(Class clazz) {
        boolean bl2;
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        linkedList.add(clazz);
        while (!(bl2 = linkedList.isEmpty())) {
            bl2 = false;
            clazz = (Class)linkedList.remove(0);
            hashSet.add(clazz);
            if ((clazz = clazz.getSuperclass()) == null) continue;
            linkedList.add(clazz);
        }
        return hashSet;
    }

    private static void throwRuntimeException(String charSequence, InvocationTargetException exception) {
        Throwable throwable = ((InvocationTargetException)exception).getCause();
        String string2 = ": ";
        if (throwable != null) {
            charSequence = nn_2.a((String)charSequence, string2);
            string2 = throwable.getMessage();
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            exception = new RuntimeException((String)charSequence, throwable);
            throw exception;
        }
        charSequence = nn_2.a((String)charSequence, string2);
        string2 = exception.getMessage();
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        throwable = new RuntimeException((String)charSequence, exception);
        throw throwable;
    }

    public void dispatch(Object object, EventHandler eventHandler) {
        try {
            eventHandler.handleEvent(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            String string2 = "Could not dispatch event: ";
            StringBuilder stringBuilder = new StringBuilder(string2);
            object = object.getClass();
            stringBuilder.append(object);
            stringBuilder.append(" to handler ");
            stringBuilder.append(eventHandler);
            object = stringBuilder.toString();
            Bus.throwRuntimeException((String)object, invocationTargetException);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void dispatchQueuedEvents() {
        Object object = (Boolean)this.isDispatching.get();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            return;
        }
        object = this.isDispatching;
        Object object2 = Boolean.TRUE;
        ((ThreadLocal)object).set(object2);
        while (true) {
            try {
                object = this.eventsToDispatch;
                object = ((ThreadLocal)object).get();
                object = (ConcurrentLinkedQueue)object;
                object = ((ConcurrentLinkedQueue)object).poll();
                object = (Bus$EventWithHandler)object;
                if (object == null) {
                    object = this.isDispatching;
                    object2 = Boolean.FALSE;
                    ((ThreadLocal)object).set(object2);
                    return;
                }
            }
            catch (Throwable throwable) {
                object2 = this.isDispatching;
                Boolean bl3 = Boolean.FALSE;
                ((ThreadLocal)object2).set(bl3);
                throw throwable;
            }
            {
                object2 = ((Bus$EventWithHandler)object).handler;
                boolean bl4 = ((EventHandler)object2).isValid();
                if (!bl4) continue;
                object2 = ((Bus$EventWithHandler)object).event;
                object = ((Bus$EventWithHandler)object).handler;
                this.dispatch(object2, (EventHandler)object);
                continue;
            }
            break;
        }
    }

    public void enqueueEvent(Object object, EventHandler eventHandler) {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue)this.eventsToDispatch.get();
        Bus$EventWithHandler bus$EventWithHandler = new Bus$EventWithHandler(object, eventHandler);
        concurrentLinkedQueue.offer(bus$EventWithHandler);
    }

    public Set flattenHierarchy(Class object) {
        ConcurrentMap concurrentMap;
        Object object2 = (Set)this.flattenHierarchyCache.get(object);
        if (object2 == null && (object = (concurrentMap = this.flattenHierarchyCache).putIfAbsent(object, object2 = this.getClassesFor((Class)object))) != null) {
            object2 = object;
        }
        return object2;
    }

    public Set getHandlersForEventType(Class clazz) {
        return (Set)this.handlersByType.get(clazz);
    }

    public EventProducer getProducerForEventType(Class clazz) {
        return (EventProducer)this.producersByType.get(clazz);
    }

    public void post(Object object) {
        if (object != null) {
            boolean bl2;
            boolean bl3;
            this.enforcer.enforce(this);
            Object object2 = object.getClass();
            object2 = this.flattenHierarchy((Class)object2).iterator();
            boolean bl4 = false;
            Iterator iterator = null;
            while (bl3 = object2.hasNext()) {
                boolean bl5;
                Object object3 = (Class)object2.next();
                if ((object3 = this.getHandlersForEventType((Class)object3)) == null || (bl5 = object3.isEmpty())) continue;
                iterator = object3.iterator();
                while (bl3 = iterator.hasNext()) {
                    object3 = (EventHandler)iterator.next();
                    this.enqueueEvent(object, (EventHandler)object3);
                }
                bl4 = true;
            }
            if (!bl4 && !(bl2 = object instanceof DeadEvent)) {
                object2 = new DeadEvent(this, object);
                this.post(object2);
            }
            this.dispatchQueuedEvents();
            return;
        }
        object = new NullPointerException("Event to post must not be null.");
        throw object;
    }

    public void register(Object object) {
        if (object != null) {
            boolean bl2;
            boolean bl3;
            Object object2;
            Object object3;
            boolean bl4;
            this.enforcer.enforce(this);
            Object object4 = this.handlerFinder.findAllProducers(object);
            Class clazz = object4.keySet().iterator();
            while (bl4 = clazz.hasNext()) {
                object3 = (Class)clazz.next();
                Object object5 = this.producersByType.putIfAbsent(object3, object2 = (EventProducer)object4.get(object3));
                if (object5 == null) {
                    boolean bl5;
                    object5 = this.handlersByType;
                    if ((object3 = (Set)object5.get(object3)) == null || (bl5 = object3.isEmpty())) continue;
                    object3 = object3.iterator();
                    while (bl5 = object3.hasNext()) {
                        object5 = (EventHandler)object3.next();
                        this.dispatchProducerResultToHandler((EventHandler)object5, (EventProducer)object2);
                    }
                    continue;
                }
                object4 = new StringBuilder("Producer method for type ");
                ((StringBuilder)object4).append(object3);
                ((StringBuilder)object4).append(" found on type ");
                clazz = ((EventProducer)object2).target.getClass();
                ((StringBuilder)object4).append(clazz);
                ((StringBuilder)object4).append(", but already registered by type ");
                clazz = ((EventProducer)object5).target.getClass();
                ((StringBuilder)object4).append(clazz);
                ((StringBuilder)object4).append(".");
                object4 = ((StringBuilder)object4).toString();
                object = new IllegalArgumentException((String)object4);
                throw object;
            }
            object = this.handlerFinder.findAllSubscribers(object);
            object4 = object.keySet().iterator();
            while (bl3 = object4.hasNext()) {
                clazz = (Class)object4.next();
                object3 = (Set)this.handlersByType.get(clazz);
                if (object3 == null && (object2 = (Set)this.handlersByType.putIfAbsent(clazz, object3 = new CopyOnWriteArraySet())) != null) {
                    object3 = object2;
                }
                if (bl3 = object3.addAll(clazz = (Set)object.get(clazz))) continue;
                object = new IllegalArgumentException("Object already registered.");
                throw object;
            }
            object = object.entrySet().iterator();
            block3: while (bl2 = object.hasNext()) {
                object4 = (Map.Entry)object.next();
                clazz = (Class)object4.getKey();
                object3 = this.producersByType;
                if ((clazz = (EventProducer)object3.get(clazz)) == null || !(bl4 = ((EventProducer)((Object)clazz)).isValid())) continue;
                object4 = ((Set)object4.getValue()).iterator();
                while (bl4 = object4.hasNext()) {
                    object3 = (EventHandler)object4.next();
                    boolean bl6 = ((EventProducer)((Object)clazz)).isValid();
                    if (!bl6) continue block3;
                    bl6 = ((EventHandler)object3).isValid();
                    if (!bl6) continue;
                    this.dispatchProducerResultToHandler((EventHandler)object3, (EventProducer)((Object)clazz));
                }
            }
            return;
        }
        object = new NullPointerException("Object to register must not be null.");
        throw object;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[Bus \"");
        String string2 = this.identifier;
        return h30_0.a(stringBuilder, string2, "\"]");
    }

    public void unregister(Object object) {
        if (object != null) {
            Object object2;
            Object object3;
            Object object4;
            String string2;
            boolean bl2;
            Object object5;
            block5: {
                this.enforcer.enforce(this);
                object5 = this.handlerFinder.findAllProducers(object).entrySet().iterator();
                while (true) {
                    bl2 = object5.hasNext();
                    string2 = " registered?";
                    if (!bl2) break block5;
                    object4 = object5.next();
                    object3 = (Class)object4.getKey();
                    object2 = this.getProducerForEventType((Class)object3);
                    if ((object4 = (EventProducer)object4.getValue()) == null || !(bl2 = ((EventProducer)object4).equals(object2))) break;
                    object4 = (EventProducer)this.producersByType.remove(object3);
                    ((EventProducer)object4).invalidate();
                }
                object4 = new StringBuilder("Missing event producer for an annotated method. Is ");
                object = object.getClass();
                ((StringBuilder)object4).append(object);
                ((StringBuilder)object4).append(string2);
                object = ((StringBuilder)object4).toString();
                object5 = new IllegalArgumentException((String)object);
                throw object5;
            }
            object5 = this.handlerFinder.findAllSubscribers(object).entrySet().iterator();
            while (bl2 = object5.hasNext()) {
                boolean bl3;
                object4 = object5.next();
                object3 = (Class)object4.getKey();
                object3 = this.getHandlersForEventType((Class)object3);
                object4 = (Collection)object4.getValue();
                if (object3 != null && (bl3 = object3.containsAll((Collection<?>)object4))) {
                    boolean bl4;
                    object2 = object3.iterator();
                    while (bl4 = object2.hasNext()) {
                        EventHandler eventHandler = (EventHandler)object2.next();
                        boolean bl5 = object4.contains(eventHandler);
                        if (!bl5) continue;
                        eventHandler.invalidate();
                    }
                    object3.removeAll((Collection<?>)object4);
                    continue;
                }
                object4 = new StringBuilder("Missing event handler for an annotated method. Is ");
                object = object.getClass();
                ((StringBuilder)object4).append(object);
                ((StringBuilder)object4).append(string2);
                object = ((StringBuilder)object4).toString();
                object5 = new IllegalArgumentException((String)object);
                throw object5;
            }
            return;
        }
        object = new NullPointerException("Object to unregister must not be null.");
        throw object;
    }
}

