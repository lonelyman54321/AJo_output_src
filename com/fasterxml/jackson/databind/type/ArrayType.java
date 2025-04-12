/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.type.TypeBase;

public final class ArrayType
extends TypeBase {
    private static final long serialVersionUID = 1L;

    public final StringBuilder b(StringBuilder stringBuilder) {
        stringBuilder.append('[');
        throw null;
    }

    public final boolean equals(Object object) {
        Class<ArrayType> clazz;
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        Class<?> clazz2 = object.getClass();
        if (clazz2 != (clazz = ArrayType.class)) {
            return false;
        }
        object = (ArrayType)object;
        throw null;
    }

    public final String toString() {
        return "[array type, component type: null]";
    }
}

