/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.UnsafeAllocator;
import java.lang.reflect.Method;

class UnsafeAllocator$3
extends UnsafeAllocator {
    final /* synthetic */ Method val$newInstance;

    public UnsafeAllocator$3(Method method) {
        this.val$newInstance = method;
    }

    public Object newInstance(Class clazz) {
        UnsafeAllocator.access$000(clazz);
        Method method = this.val$newInstance;
        Object[] objectArray = new Object[]{clazz, Object.class};
        return method.invoke(null, objectArray);
    }
}

