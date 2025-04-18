/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.$Gson$Types;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

final class $Gson$Types$GenericArrayTypeImpl
implements GenericArrayType,
Serializable {
    private static final long serialVersionUID;
    private final Type componentType;

    public $Gson$Types$GenericArrayTypeImpl(Type type2) {
        Objects.requireNonNull(type2);
        this.componentType = type2 = $Gson$Types.canonicalize(type2);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof GenericArrayType;
        if (bl3 && (bl2 = $Gson$Types.equals(this, (Type)(object = (GenericArrayType)object)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Type getGenericComponentType() {
        return this.componentType;
    }

    public int hashCode() {
        return this.componentType.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = $Gson$Types.typeToString(this.componentType);
        stringBuilder.append(string2);
        stringBuilder.append("[]");
        return stringBuilder.toString();
    }
}

