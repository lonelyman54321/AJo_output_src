/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscriber$1;
import com.google.common.eventbus.Subscriber$SynchronizedSubscriber;
import com.google.common.eventbus.SubscriberExceptionContext;
import com.google.common.eventbus.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

class Subscriber {
    private EventBus bus;
    private final Executor executor;
    private final Method method;
    final Object target;

    private Subscriber(EventBus object, Object object2, Method method) {
        this.bus = object;
        this.target = object2 = Preconditions.checkNotNull(object2);
        this.method = method;
        ((AccessibleObject)method).setAccessible(true);
        this.executor = object = ((EventBus)object).executor();
    }

    public /* synthetic */ Subscriber(EventBus eventBus, Object object, Method method, Subscriber$1 subscriber$1) {
        this(eventBus, object, method);
    }

    public static /* synthetic */ void a(Object object, Subscriber subscriber) {
        subscriber.lambda$dispatchEvent$0(object);
    }

    private SubscriberExceptionContext context(Object object) {
        EventBus eventBus = this.bus;
        Object object2 = this.target;
        Method method = this.method;
        SubscriberExceptionContext subscriberExceptionContext = new SubscriberExceptionContext(eventBus, object, object2, method);
        return subscriberExceptionContext;
    }

    public static Subscriber create(EventBus eventBus, Object object, Method method) {
        boolean bl2 = Subscriber.isDeclaredThreadSafe(method);
        Subscriber subscriber = bl2 ? new Subscriber(eventBus, object, method) : new Subscriber$SynchronizedSubscriber(eventBus, object, method, null);
        return subscriber;
    }

    private static boolean isDeclaredThreadSafe(Method object) {
        boolean bl2;
        Class<AllowConcurrentEvents> clazz = AllowConcurrentEvents.class;
        if ((object = ((Method)object).getAnnotation(clazz)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private /* synthetic */ void lambda$dispatchEvent$0(Object object) {
        try {
            this.invokeSubscriberMethod(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            EventBus eventBus = this.bus;
            Throwable throwable = invocationTargetException.getCause();
            object = this.context(object);
            eventBus.handleSubscriberException(throwable, (SubscriberExceptionContext)object);
        }
    }

    public final void dispatchEvent(Object object) {
        Executor executor = this.executor;
        a a2 = new a(object, this);
        executor.execute(a2);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Subscriber;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            object = (Subscriber)object;
            Object object2 = this.target;
            Object object3 = ((Subscriber)object).target;
            if (object2 == object3 && (bl4 = ((Method)(object2 = this.method)).equals(object = ((Subscriber)object).method))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = (this.method.hashCode() + 31) * 31;
        return System.identityHashCode(this.target) + n3;
    }

    public void invokeSubscriberMethod(Object object) {
        IllegalArgumentException illegalArgumentException2;
        Object object2;
        block12: {
            IllegalAccessException illegalAccessException2;
            block11: {
                Object object3 = this.method;
                object2 = this.target;
                Object object4 = Preconditions.checkNotNull(object);
                int n3 = 1;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object4;
                try {
                    ((Method)object3).invoke(object2, objectArray);
                    return;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block11;
                }
                catch (IllegalArgumentException illegalArgumentException2) {
                    break block12;
                }
                object3 = invocationTargetException.getCause();
                boolean bl2 = object3 instanceof Error;
                if (bl2) {
                    throw (Error)invocationTargetException.getCause();
                }
                throw invocationTargetException;
            }
            object = jk0_0.a(object, "Method became inaccessible: ");
            object2 = new Error((String)object, illegalAccessException2);
            throw object2;
        }
        object = jk0_0.a(object, "Method rejected target/argument: ");
        object2 = new Error((String)object, illegalArgumentException2);
        throw object2;
    }
}

