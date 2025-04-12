/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Type;

class TypeToken$Bounds {
    private final Type[] bounds;
    private final boolean target;

    public TypeToken$Bounds(Type[] typeArray, boolean bl2) {
        this.bounds = typeArray;
        this.target = bl2;
    }

    public boolean isSubtypeOf(Type type2) {
        Type[] typeArray = this.bounds;
        int n3 = typeArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            TypeToken typeToken = TypeToken.of(typeArray[i3]);
            boolean bl3 = typeToken.isSubtypeOf(type2);
            if (bl3 != (bl2 = this.target)) continue;
            return bl2;
        }
        return this.target ^ true;
    }

    public boolean isSupertypeOf(Type object) {
        object = TypeToken.of((Type)object);
        for (Type type2 : this.bounds) {
            boolean bl2;
            boolean bl3 = ((TypeToken)object).isSubtypeOf(type2);
            if (bl3 != (bl2 = this.target)) continue;
            return bl2;
        }
        return this.target ^ true;
    }
}

