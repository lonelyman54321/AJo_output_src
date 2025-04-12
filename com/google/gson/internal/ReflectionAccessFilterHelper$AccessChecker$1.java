/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

class ReflectionAccessFilterHelper$AccessChecker$1
extends ReflectionAccessFilterHelper$AccessChecker {
    final /* synthetic */ Method val$canAccessMethod;

    public ReflectionAccessFilterHelper$AccessChecker$1(Method method) {
        this.val$canAccessMethod = method;
        super(null);
    }

    public boolean canAccess(AccessibleObject object, Object object2) {
        int n3;
        Method method;
        try {
            method = this.val$canAccessMethod;
            n3 = 1;
        }
        catch (Exception exception) {
            object2 = new RuntimeException("Failed invoking canAccess", exception);
            throw object2;
        }
        Object[] objectArray = new Object[n3];
        objectArray[0] = object2;
        object = method.invoke(object, objectArray);
        object = (Boolean)object;
        return (Boolean)object;
    }
}

