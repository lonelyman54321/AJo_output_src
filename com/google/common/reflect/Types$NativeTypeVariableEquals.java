/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.Types;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class Types$NativeTypeVariableEquals {
    static final boolean NATIVE_TYPE_VARIABLE_ONLY;

    static {
        Object object = Types$NativeTypeVariableEquals.class;
        TypeVariable typeVariable = ((Class)object).getTypeParameters()[0];
        Type[] typeArray = new Type[]{};
        object = Types.newArtificialTypeVariable(object, "X", typeArray);
        NATIVE_TYPE_VARIABLE_ONLY = typeVariable.equals(object) ^ true;
    }
}

