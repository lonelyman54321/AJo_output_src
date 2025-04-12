/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.reflect;

import com.google.gson.internal.reflect.ReflectionHelper$1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

abstract class ReflectionHelper$RecordHelper {
    private ReflectionHelper$RecordHelper() {
    }

    public /* synthetic */ ReflectionHelper$RecordHelper(ReflectionHelper$1 reflectionHelper$1) {
        this();
    }

    public abstract Method getAccessor(Class var1, Field var2);

    public abstract Constructor getCanonicalRecordConstructor(Class var1);

    public abstract String[] getRecordComponentNames(Class var1);

    public abstract boolean isRecord(Class var1);
}

