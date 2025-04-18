/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.reflect.Types;
import com.google.common.reflect.Types$JavaVersion;
import com.google.common.reflect.b;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Objects;

final class Types$ParameterizedTypeImpl
implements ParameterizedType,
Serializable {
    private static final long serialVersionUID;
    private final ImmutableList argumentsList;
    private final Type ownerType;
    private final Class rawType;

    public Types$ParameterizedTypeImpl(Type object, Class clazz, Type[] typeArray) {
        Preconditions.checkNotNull(clazz);
        int n3 = typeArray.length;
        TypeVariable<Class<T>>[] typeVariableArray = clazz.getTypeParameters();
        int n4 = typeVariableArray.length;
        n3 = n3 == n4 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        Types.access$200(typeArray, "type parameter");
        this.ownerType = object;
        this.rawType = clazz;
        this.argumentsList = object = Types$JavaVersion.CURRENT.usedInGenericType(typeArray);
    }

    public boolean equals(Object objectArray) {
        boolean bl2;
        Type type2;
        boolean bl3 = objectArray instanceof ParameterizedType;
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        objectArray = (ParameterizedType)objectArray;
        Object[] objectArray2 = this.getRawType();
        bl3 = objectArray2.equals(type2 = objectArray.getRawType());
        if (bl3 && (bl3 = com.google.common.base.Objects.equal(objectArray2 = this.getOwnerType(), type2 = objectArray.getOwnerType())) && (bl2 = Arrays.equals(objectArray2 = this.getActualTypeArguments(), objectArray = objectArray.getActualTypeArguments()))) {
            bl4 = true;
        }
        return bl4;
    }

    public Type[] getActualTypeArguments() {
        return Types.access$300(this.argumentsList);
    }

    public Type getOwnerType() {
        return this.ownerType;
    }

    public Type getRawType() {
        return this.rawType;
    }

    public int hashCode() {
        int n3;
        Type type2 = this.ownerType;
        if (type2 == null) {
            n3 = 0;
            type2 = null;
        } else {
            n3 = type2.hashCode();
        }
        int n4 = this.argumentsList.hashCode();
        n3 ^= n4;
        n4 = this.rawType.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        Object object;
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder();
        Object object2 = this.ownerType;
        if (object2 != null && (bl2 = ((Types$JavaVersion)((Object)(object2 = Types$JavaVersion.CURRENT))).jdkTypeDuplicatesOwnerName())) {
            object = this.ownerType;
            object2 = ((Types$JavaVersion)((Object)object2)).typeName((Type)object);
            stringBuilder.append((String)object2);
            char c2 = '.';
            stringBuilder.append(c2);
        }
        object2 = this.rawType.getName();
        stringBuilder.append((String)object2);
        stringBuilder.append('<');
        object2 = Types.access$400();
        object = this.argumentsList;
        Types$JavaVersion types$JavaVersion = Types$JavaVersion.CURRENT;
        Objects.requireNonNull(types$JavaVersion);
        b b2 = new b(types$JavaVersion);
        object = Iterables.transform((Iterable)object, b2);
        object2 = ((Joiner)object2).join((Iterable)object);
        stringBuilder.append((String)object2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

