/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.Types$JavaVersion;
import java.lang.reflect.Type;

final class Types$JavaVersion$4
extends Types$JavaVersion {
    public boolean jdkTypeDuplicatesOwnerName() {
        return false;
    }

    public Type newArrayType(Type type2) {
        return Types$JavaVersion.JAVA8.newArrayType(type2);
    }

    public String typeName(Type type2) {
        return Types$JavaVersion.JAVA8.typeName(type2);
    }

    public Type usedInGenericType(Type type2) {
        return Types$JavaVersion.JAVA8.usedInGenericType(type2);
    }
}

