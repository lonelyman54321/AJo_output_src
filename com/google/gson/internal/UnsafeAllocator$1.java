/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.UnsafeAllocator;
import java.lang.reflect.Method;

class UnsafeAllocator$1
extends UnsafeAllocator {
    final /* synthetic */ Method val$allocateInstance;
    final /* synthetic */ Object val$unsafe;

    public UnsafeAllocator$1(Method method, Object object) {
        this.val$allocateInstance = method;
        this.val$unsafe = object;
    }

    public Object newInstance(Class clazz) {
        UnsafeAllocator.access$000(clazz);
        Method method = this.val$allocateInstance;
        Object object = this.val$unsafe;
        Object[] objectArray = new Object[]{clazz};
        return method.invoke(object, objectArray);
    }
}

