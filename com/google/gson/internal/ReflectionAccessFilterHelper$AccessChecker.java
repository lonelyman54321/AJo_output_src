/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.ReflectionAccessFilterHelper$1;
import com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$1;
import com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$2;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

abstract class ReflectionAccessFilterHelper$AccessChecker {
    public static final ReflectionAccessFilterHelper$AccessChecker INSTANCE;

    static {
        Object object;
        boolean bl2 = JavaVersion.isJava9OrLater();
        if (bl2) {
            Class<Object> clazz;
            Class[] classArray;
            Object object2 = AccessibleObject.class;
            object = "canAccess";
            int n3 = 1;
            try {
                classArray = new Class[n3];
                clazz = Object.class;
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            classArray[0] = clazz;
            object2 = ((Class)object2).getDeclaredMethod((String)object, classArray);
            object = new ReflectionAccessFilterHelper$AccessChecker$1((Method)object2);
        }
        object = null;
        if (object == null) {
            object = new ReflectionAccessFilterHelper$AccessChecker$2();
        }
        INSTANCE = object;
    }

    private ReflectionAccessFilterHelper$AccessChecker() {
    }

    public /* synthetic */ ReflectionAccessFilterHelper$AccessChecker(ReflectionAccessFilterHelper$1 reflectionAccessFilterHelper$1) {
        this();
    }

    public abstract boolean canAccess(AccessibleObject var1, Object var2);
}

