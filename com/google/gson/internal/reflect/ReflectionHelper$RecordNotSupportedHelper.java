/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.reflect;

import com.google.gson.internal.reflect.ReflectionHelper$1;
import com.google.gson.internal.reflect.ReflectionHelper$RecordHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ReflectionHelper$RecordNotSupportedHelper
extends ReflectionHelper$RecordHelper {
    private ReflectionHelper$RecordNotSupportedHelper() {
        super(null);
    }

    public /* synthetic */ ReflectionHelper$RecordNotSupportedHelper(ReflectionHelper$1 reflectionHelper$1) {
        this();
    }

    public Method getAccessor(Class serializable, Field field) {
        serializable = new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        throw serializable;
    }

    public Constructor getCanonicalRecordConstructor(Class serializable) {
        serializable = new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        throw serializable;
    }

    public String[] getRecordComponentNames(Class serializable) {
        serializable = new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        throw serializable;
    }

    public boolean isRecord(Class clazz) {
        return false;
    }
}

