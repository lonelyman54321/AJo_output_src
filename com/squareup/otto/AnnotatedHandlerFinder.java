/*
 * Decompiled with CFR 0.152.
 */
package com.squareup.otto;

import com.squareup.otto.EventHandler;
import com.squareup.otto.EventProducer;
import com.squareup.otto.Produce;
import com.squareup.otto.Subscribe;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class AnnotatedHandlerFinder {
    private static final ConcurrentMap PRODUCERS_CACHE;
    private static final ConcurrentMap SUBSCRIBERS_CACHE;

    static {
        ConcurrentHashMap concurrentHashMap;
        PRODUCERS_CACHE = concurrentHashMap = new ConcurrentHashMap();
        SUBSCRIBERS_CACHE = concurrentHashMap = new ConcurrentHashMap();
    }

    private AnnotatedHandlerFinder() {
    }

    public static Map findAllProducers(Object object) {
        boolean bl2;
        Object object2 = object.getClass();
        HashMap<Object, EventProducer> hashMap = new HashMap<Object, EventProducer>();
        HashMap hashMap2 = (HashMap)PRODUCERS_CACHE.get(object2);
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
            AnnotatedHandlerFinder.loadAnnotatedProducerMethods(object2, hashMap2);
        }
        if (!(bl2 = hashMap2.isEmpty())) {
            boolean bl3;
            object2 = hashMap2.entrySet().iterator();
            while (bl3 = object2.hasNext()) {
                hashMap2 = (Map.Entry)object2.next();
                Method method = (Method)hashMap2.getValue();
                EventProducer eventProducer = new EventProducer(object, method);
                hashMap2 = hashMap2.getKey();
                hashMap.put(hashMap2, eventProducer);
            }
        }
        return hashMap;
    }

    public static Map findAllSubscribers(Object object) {
        boolean bl2;
        Object object2 = object.getClass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = (HashMap)SUBSCRIBERS_CACHE.get(object2);
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
            AnnotatedHandlerFinder.loadAnnotatedSubscriberMethods(object2, hashMap2);
        }
        if (!(bl2 = hashMap2.isEmpty())) {
            boolean bl3;
            object2 = hashMap2.entrySet().iterator();
            while (bl3 = object2.hasNext()) {
                boolean bl4;
                hashMap2 = (Map.Entry)object2.next();
                HashSet<EventHandler> hashSet = new HashSet<EventHandler>();
                Iterator iterator = ((Set)hashMap2.getValue()).iterator();
                while (bl4 = iterator.hasNext()) {
                    Method method = (Method)iterator.next();
                    EventHandler eventHandler = new EventHandler(object, method);
                    hashSet.add(eventHandler);
                }
                hashMap2 = hashMap2.getKey();
                hashMap.put(hashMap2, hashSet);
            }
        }
        return hashMap;
    }

    private static void loadAnnotatedMethods(Class serializable, Map object, Map map2) {
        for (Method method : serializable.getDeclaredMethods()) {
            String string2;
            int n3;
            boolean bl2 = method.isBridge();
            if (bl2) continue;
            Object object2 = Subscribe.class;
            bl2 = method.isAnnotationPresent((Class<? extends Annotation>)object2);
            Set<Method> set = " but is not 'public'.";
            int n4 = 1;
            String string3 = "Method ";
            if (bl2) {
                object2 = method.getParameterTypes();
                n3 = ((Class<?>[])object2).length;
                if (n3 == n4) {
                    object2 = object2[0];
                    n3 = (int)(((Class)object2).isInterface() ? 1 : 0);
                    string2 = " has @Subscribe annotation on ";
                    if (n3 == 0) {
                        n3 = method.getModifiers();
                        if ((n4 &= n3) != 0) {
                            set = (Set)map2.get(object2);
                            if (set == null) {
                                set = new Set<Method>();
                                map2.put(object2, set);
                            }
                            set.add(method);
                            continue;
                        }
                        object = new StringBuilder(string3);
                        ((StringBuilder)object).append(method);
                        ((StringBuilder)object).append(string2);
                        ((StringBuilder)object).append(object2);
                        ((StringBuilder)object).append((String)((Object)set));
                        object = ((StringBuilder)object).toString();
                        serializable = new IllegalArgumentException((String)object);
                        throw serializable;
                    }
                    object = new StringBuilder(string3);
                    ((StringBuilder)object).append(method);
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(object2);
                    ((StringBuilder)object).append(" which is an interface.  Subscription must be on a concrete class type.");
                    object = ((StringBuilder)object).toString();
                    serializable = new IllegalArgumentException((String)object);
                    throw serializable;
                }
                object = new StringBuilder(string3);
                ((StringBuilder)object).append(method);
                ((StringBuilder)object).append(" has @Subscribe annotation but requires ");
                object = g30.a(((Object)object2).length, " arguments.  Methods must require a single argument.", (StringBuilder)object);
                serializable = new IllegalArgumentException((String)object);
                throw serializable;
            }
            object2 = Produce.class;
            bl2 = method.isAnnotationPresent((Class<? extends Annotation>)object2);
            if (!bl2) continue;
            object2 = method.getParameterTypes();
            n3 = ((Class<?>[])object2).length;
            if (n3 == 0) {
                Class<Void> clazz;
                object2 = method.getReturnType();
                if (object2 != (clazz = Void.class)) {
                    object2 = method.getReturnType();
                    n3 = (int)(((Class)object2).isInterface() ? 1 : 0);
                    string2 = " has @Produce annotation on ";
                    if (n3 == 0) {
                        clazz = Void.TYPE;
                        n3 = (int)(object2.equals(clazz) ? 1 : 0);
                        if (n3 == 0) {
                            n3 = method.getModifiers();
                            if ((n4 &= n3) != 0) {
                                boolean bl3 = object.containsKey(object2);
                                if (!bl3) {
                                    object.put(object2, method);
                                    continue;
                                }
                                object = new StringBuilder("Producer for type ");
                                ((StringBuilder)object).append(object2);
                                ((StringBuilder)object).append(" has already been registered.");
                                object = ((StringBuilder)object).toString();
                                serializable = new IllegalArgumentException((String)object);
                                throw serializable;
                            }
                            object = new StringBuilder(string3);
                            ((StringBuilder)object).append(method);
                            ((StringBuilder)object).append(string2);
                            ((StringBuilder)object).append(object2);
                            ((StringBuilder)object).append((String)((Object)set));
                            object = ((StringBuilder)object).toString();
                            serializable = new IllegalArgumentException((String)object);
                            throw serializable;
                        }
                        object = new StringBuilder(string3);
                        ((StringBuilder)object).append(method);
                        ((StringBuilder)object).append(" has @Produce annotation but has no return type.");
                        object = ((StringBuilder)object).toString();
                        serializable = new IllegalArgumentException((String)object);
                        throw serializable;
                    }
                    object = new StringBuilder(string3);
                    ((StringBuilder)object).append(method);
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(object2);
                    ((StringBuilder)object).append(" which is an interface.  Producers must return a concrete class type.");
                    object = ((StringBuilder)object).toString();
                    serializable = new IllegalArgumentException((String)object);
                    throw serializable;
                }
                object = new StringBuilder(string3);
                ((StringBuilder)object).append(method);
                ((StringBuilder)object).append(" has a return type of void.  Must declare a non-void type.");
                object = ((StringBuilder)object).toString();
                serializable = new IllegalArgumentException((String)object);
                throw serializable;
            }
            object = new StringBuilder(string3);
            ((StringBuilder)object).append(method);
            ((StringBuilder)object).append("has @Produce annotation but requires ");
            object = g30.a(((Object)object2).length, " arguments.  Methods must require zero arguments.", (StringBuilder)object);
            serializable = new IllegalArgumentException((String)object);
            throw serializable;
        }
        PRODUCERS_CACHE.put(serializable, object);
        SUBSCRIBERS_CACHE.put(serializable, map2);
    }

    private static void loadAnnotatedProducerMethods(Class clazz, Map map2) {
        HashMap hashMap = new HashMap();
        AnnotatedHandlerFinder.loadAnnotatedMethods(clazz, map2, hashMap);
    }

    private static void loadAnnotatedSubscriberMethods(Class clazz, Map map2) {
        HashMap hashMap = new HashMap();
        AnnotatedHandlerFinder.loadAnnotatedMethods(clazz, hashMap, map2);
    }
}

