/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.$Gson$Preconditions;
import com.google.gson.internal.$Gson$Types;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

final class $Gson$Types$ParameterizedTypeImpl
implements ParameterizedType,
Serializable {
    private static final long serialVersionUID;
    private final Type ownerType;
    private final Type rawType;
    private final Type[] typeArguments;

    public $Gson$Types$ParameterizedTypeImpl(Type typeArray, Type typeArray2, Type ... object) {
        int n3;
        Objects.requireNonNull(typeArray2);
        boolean bl2 = typeArray2 instanceof Class;
        int n4 = 0;
        if (bl2) {
            Type[] typeArray3 = typeArray2;
            typeArray3 = (Class)typeArray2;
            boolean bl3 = Modifier.isStatic(typeArray3.getModifiers());
            boolean bl4 = true;
            if (!bl3 && (typeArray3 = typeArray3.getEnclosingClass()) != null) {
                bl2 = false;
                typeArray3 = null;
            } else {
                bl2 = true;
            }
            if (typeArray == null && !bl2) {
                bl4 = false;
            }
            $Gson$Preconditions.checkArgument(bl4);
        }
        if (typeArray == null) {
            n3 = 0;
            typeArray = null;
        } else {
            typeArray = $Gson$Types.canonicalize((Type)typeArray);
        }
        this.ownerType = typeArray;
        typeArray = $Gson$Types.canonicalize((Type)typeArray2);
        this.rawType = typeArray;
        typeArray = (Type[])object.clone();
        this.typeArguments = typeArray;
        n3 = typeArray.length;
        while (n4 < n3) {
            Objects.requireNonNull(this.typeArguments[n4]);
            $Gson$Types.checkNotPrimitive(this.typeArguments[n4]);
            typeArray2 = this.typeArguments;
            typeArray2[n4] = object = $Gson$Types.canonicalize(typeArray2[n4]);
            ++n4;
        }
    }

    private static int hashCodeOrZero(Object object) {
        int n3;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof ParameterizedType;
        if (bl3 && (bl2 = $Gson$Types.equals(this, (Type)(object = (ParameterizedType)object)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Type[] getActualTypeArguments() {
        return (Type[])this.typeArguments.clone();
    }

    public Type getOwnerType() {
        return this.ownerType;
    }

    public Type getRawType() {
        return this.rawType;
    }

    public int hashCode() {
        int n3 = Arrays.hashCode(this.typeArguments);
        int n4 = this.rawType.hashCode();
        n3 ^= n4;
        n4 = $Gson$Types$ParameterizedTypeImpl.hashCodeOrZero(this.ownerType);
        return n3 ^ n4;
    }

    public String toString() {
        Type[] typeArray = this.typeArguments;
        int n3 = typeArray.length;
        if (n3 == 0) {
            return $Gson$Types.typeToString(this.rawType);
        }
        int n4 = (n3 + 1) * 30;
        StringBuilder stringBuilder = new StringBuilder(n4);
        Object object = $Gson$Types.typeToString(this.rawType);
        stringBuilder.append((String)object);
        stringBuilder.append("<");
        object = this.typeArguments;
        String string2 = null;
        object = $Gson$Types.typeToString(object[0]);
        stringBuilder.append((String)object);
        for (n4 = 1; n4 < n3; ++n4) {
            stringBuilder.append(", ");
            string2 = $Gson$Types.typeToString(this.typeArguments[n4]);
            stringBuilder.append(string2);
        }
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}

