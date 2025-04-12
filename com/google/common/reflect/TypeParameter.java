/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.reflect.TypeCapture;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public abstract class TypeParameter
extends TypeCapture {
    final TypeVariable typeVariable;

    public TypeParameter() {
        Type type2 = this.capture();
        Preconditions.checkArgument(type2 instanceof TypeVariable, "%s should be a type variable.", (Object)type2);
        type2 = (TypeVariable)type2;
        this.typeVariable = type2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof TypeParameter;
        if (bl2) {
            object = (TypeParameter)object;
            TypeVariable typeVariable = this.typeVariable;
            object = ((TypeParameter)object).typeVariable;
            return typeVariable.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.typeVariable.hashCode();
    }

    public String toString() {
        return this.typeVariable.toString();
    }
}

