/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

abstract class TypeCapture {
    public final Type capture() {
        Type type2 = this.getClass().getGenericSuperclass();
        Preconditions.checkArgument(type2 instanceof ParameterizedType, "%s isn't parameterized", (Object)type2);
        return ((ParameterizedType)type2).getActualTypeArguments()[0];
    }
}

