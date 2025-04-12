/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.UnsafeAllocator;
import java.lang.reflect.Method;

class UnsafeAllocator$2
extends UnsafeAllocator {
    final /* synthetic */ int val$constructorId;
    final /* synthetic */ Method val$newInstance;

    public UnsafeAllocator$2(Method method, int n3) {
        this.val$newInstance = method;
        this.val$constructorId = n3;
    }

    public Object newInstance(Class clazz) {
        UnsafeAllocator.access$000(clazz);
        Method method = this.val$newInstance;
        Integer n3 = this.val$constructorId;
        Object[] objectArray = new Object[]{clazz, n3};
        return method.invoke(null, objectArray);
    }
}

