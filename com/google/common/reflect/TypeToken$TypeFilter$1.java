/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.TypeToken;
import com.google.common.reflect.TypeToken$TypeFilter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

final class TypeToken$TypeFilter$1
extends TypeToken$TypeFilter {
    public boolean apply(TypeToken object) {
        boolean bl2;
        Type type2 = TypeToken.access$500((TypeToken)object);
        boolean bl3 = type2 instanceof TypeVariable;
        if (!bl3 && !(bl2 = (object = TypeToken.access$500((TypeToken)object)) instanceof WildcardType)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

