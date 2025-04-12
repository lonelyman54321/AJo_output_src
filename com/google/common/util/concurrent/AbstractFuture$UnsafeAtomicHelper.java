/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractFuture$1;
import com.google.common.util.concurrent.AbstractFuture$AtomicHelper;
import com.google.common.util.concurrent.AbstractFuture$Listener;
import com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1;
import com.google.common.util.concurrent.AbstractFuture$Waiter;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

final class AbstractFuture$UnsafeAtomicHelper
extends AbstractFuture$AtomicHelper {
    static final long LISTENERS_OFFSET;
    static final Unsafe UNSAFE;
    static final long VALUE_OFFSET;
    static final long WAITERS_OFFSET;
    static final long WAITER_NEXT_OFFSET;
    static final long WAITER_THREAD_OFFSET;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        Object object2 = AbstractFuture$Waiter.class;
        try {
            object = Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            try {
                object = new AbstractFuture$UnsafeAtomicHelper$1();
                object = AccessController.doPrivileged(object);
                object = (Unsafe)object;
            }
            catch (PrivilegedActionException privilegedActionException) {
                Throwable throwable = privilegedActionException.getCause();
                RuntimeException runtimeException = new RuntimeException("Could not initialize intrinsics", throwable);
                throw runtimeException;
            }
        }
        Object object3 = AbstractFuture.class;
        Object object4 = "waiters";
        try {
            long l2;
            long l3;
            object4 = ((Class)object3).getDeclaredField((String)object4);
            WAITERS_OFFSET = l3 = ((Unsafe)object).objectFieldOffset((Field)object4);
            object4 = "listeners";
            object4 = ((Class)object3).getDeclaredField((String)object4);
            LISTENERS_OFFSET = l3 = ((Unsafe)object).objectFieldOffset((Field)object4);
            object4 = "value";
            object3 = ((Class)object3).getDeclaredField((String)object4);
            VALUE_OFFSET = l2 = ((Unsafe)object).objectFieldOffset((Field)object3);
            object3 = "thread";
            object3 = ((Class)object2).getDeclaredField((String)object3);
            WAITER_THREAD_OFFSET = l2 = ((Unsafe)object).objectFieldOffset((Field)object3);
            object3 = "next";
            object2 = ((Class)object2).getDeclaredField((String)object3);
            WAITER_NEXT_OFFSET = l2 = ((Unsafe)object).objectFieldOffset((Field)object2);
            UNSAFE = object;
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (NoSuchFieldException noSuchFieldException22) {}
        object = new RuntimeException(noSuchFieldException22);
        throw object;
    }

    private AbstractFuture$UnsafeAtomicHelper() {
        super(null);
    }

    public /* synthetic */ AbstractFuture$UnsafeAtomicHelper(AbstractFuture$1 abstractFuture$1) {
        this();
    }

    public boolean casListeners(AbstractFuture abstractFuture, AbstractFuture$Listener abstractFuture$Listener, AbstractFuture$Listener abstractFuture$Listener2) {
        Unsafe unsafe = UNSAFE;
        long l2 = LISTENERS_OFFSET;
        return ok3_1.a(unsafe, abstractFuture, l2, abstractFuture$Listener, abstractFuture$Listener2);
    }

    public boolean casValue(AbstractFuture abstractFuture, Object object, Object object2) {
        Unsafe unsafe = UNSAFE;
        long l2 = VALUE_OFFSET;
        return ok3_1.a(unsafe, abstractFuture, l2, object, object2);
    }

    public boolean casWaiters(AbstractFuture abstractFuture, AbstractFuture$Waiter abstractFuture$Waiter, AbstractFuture$Waiter abstractFuture$Waiter2) {
        Unsafe unsafe = UNSAFE;
        long l2 = WAITERS_OFFSET;
        return ok3_1.a(unsafe, abstractFuture, l2, abstractFuture$Waiter, abstractFuture$Waiter2);
    }

    public AbstractFuture$Listener gasListeners(AbstractFuture abstractFuture, AbstractFuture$Listener abstractFuture$Listener) {
        AbstractFuture$Listener abstractFuture$Listener2;
        boolean bl2;
        do {
            if (abstractFuture$Listener != (abstractFuture$Listener2 = AbstractFuture.access$700(abstractFuture))) continue;
            return abstractFuture$Listener2;
        } while (!(bl2 = this.casListeners(abstractFuture, abstractFuture$Listener2, abstractFuture$Listener)));
        return abstractFuture$Listener2;
    }

    public AbstractFuture$Waiter gasWaiters(AbstractFuture abstractFuture, AbstractFuture$Waiter abstractFuture$Waiter) {
        AbstractFuture$Waiter abstractFuture$Waiter2;
        boolean bl2;
        do {
            if (abstractFuture$Waiter != (abstractFuture$Waiter2 = AbstractFuture.access$800(abstractFuture))) continue;
            return abstractFuture$Waiter2;
        } while (!(bl2 = this.casWaiters(abstractFuture, abstractFuture$Waiter2, abstractFuture$Waiter)));
        return abstractFuture$Waiter2;
    }

    public void putNext(AbstractFuture$Waiter abstractFuture$Waiter, AbstractFuture$Waiter abstractFuture$Waiter2) {
        Unsafe unsafe = UNSAFE;
        long l2 = WAITER_NEXT_OFFSET;
        unsafe.putObject(abstractFuture$Waiter, l2, abstractFuture$Waiter2);
    }

    public void putThread(AbstractFuture$Waiter abstractFuture$Waiter, Thread thread2) {
        Unsafe unsafe = UNSAFE;
        long l2 = WAITER_THREAD_OFFSET;
        unsafe.putObject(abstractFuture$Waiter, l2, thread2);
    }
}

