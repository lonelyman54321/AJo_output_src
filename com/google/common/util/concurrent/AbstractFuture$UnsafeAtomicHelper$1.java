/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

class AbstractFuture$UnsafeAtomicHelper$1
implements PrivilegedExceptionAction {
    public Unsafe run() {
        Object object = Unsafe.class;
        for (Field field : ((Class)object).getDeclaredFields()) {
            ((AccessibleObject)field).setAccessible(true);
            Object object2 = field.get(null);
            boolean bl2 = ((Class)object).isInstance(object2);
            if (!bl2) continue;
            return (Unsafe)((Class)object).cast(object2);
        }
        object = new NoSuchFieldError("the Unsafe");
        throw object;
    }
}

