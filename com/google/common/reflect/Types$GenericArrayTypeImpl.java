/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Objects;
import com.google.common.reflect.Types;
import com.google.common.reflect.Types$JavaVersion;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class Types$GenericArrayTypeImpl
implements GenericArrayType,
Serializable {
    private static final long serialVersionUID;
    private final Type componentType;

    public Types$GenericArrayTypeImpl(Type type2) {
        this.componentType = type2 = Types$JavaVersion.CURRENT.usedInGenericType(type2);
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof GenericArrayType;
        if (bl2) {
            object = (GenericArrayType)object;
            Type type2 = this.getGenericComponentType();
            object = object.getGenericComponentType();
            return Objects.equal(type2, object);
        }
        return false;
    }

    public Type getGenericComponentType() {
        return this.componentType;
    }

    public int hashCode() {
        return this.componentType.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = Types.toString(this.componentType);
        return h30_0.a(stringBuilder, string2, "[]");
    }
}

