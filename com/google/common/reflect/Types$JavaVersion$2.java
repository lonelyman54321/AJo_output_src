/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.reflect.Types;
import com.google.common.reflect.Types$GenericArrayTypeImpl;
import com.google.common.reflect.Types$JavaVersion;
import java.lang.reflect.Type;

final class Types$JavaVersion$2
extends Types$JavaVersion {
    public Type newArrayType(Type type2) {
        boolean bl2 = type2 instanceof Class;
        if (bl2) {
            return Types.getArrayClass((Class)type2);
        }
        Types$GenericArrayTypeImpl types$GenericArrayTypeImpl = new Types$GenericArrayTypeImpl(type2);
        return types$GenericArrayTypeImpl;
    }

    public Type usedInGenericType(Type type2) {
        return (Type)Preconditions.checkNotNull(type2);
    }
}

