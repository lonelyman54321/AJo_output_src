/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.collect.ImmutableSet$Builder;
import com.google.common.reflect.TypeToken;
import com.google.common.reflect.TypeVisitor;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

class TypeToken$4
extends TypeVisitor {
    final /* synthetic */ ImmutableSet$Builder val$builder;

    public TypeToken$4(TypeToken typeToken, ImmutableSet$Builder immutableSet$Builder) {
        this.val$builder = immutableSet$Builder;
    }

    public void visitClass(Class clazz) {
        this.val$builder.add(clazz);
    }

    public void visitGenericArrayType(GenericArrayType type2) {
        ImmutableSet$Builder immutableSet$Builder = this.val$builder;
        type2 = Types.getArrayClass(TypeToken.of(type2.getGenericComponentType()).getRawType());
        immutableSet$Builder.add(type2);
    }

    public void visitParameterizedType(ParameterizedType type2) {
        ImmutableSet$Builder immutableSet$Builder = this.val$builder;
        type2 = (Class)type2.getRawType();
        immutableSet$Builder.add(type2);
    }

    public void visitTypeVariable(TypeVariable typeArray) {
        typeArray = typeArray.getBounds();
        this.visit(typeArray);
    }

    public void visitWildcardType(WildcardType typeArray) {
        typeArray = typeArray.getUpperBounds();
        this.visit(typeArray);
    }
}

