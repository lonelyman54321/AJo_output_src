/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.TypeToken;
import com.google.common.reflect.TypeVisitor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

class TypeToken$3
extends TypeVisitor {
    final /* synthetic */ TypeToken this$0;

    public TypeToken$3(TypeToken typeToken) {
        this.this$0 = typeToken;
    }

    public void visitGenericArrayType(GenericArrayType type2) {
        type2 = type2.getGenericComponentType();
        Type[] typeArray = new Type[]{type2};
        this.visit(typeArray);
    }

    public void visitParameterizedType(ParameterizedType type2) {
        Type[] typeArray = type2.getActualTypeArguments();
        this.visit(typeArray);
        type2 = type2.getOwnerType();
        typeArray = new Type[]{type2};
        this.visit(typeArray);
    }

    public void visitTypeVariable(TypeVariable object) {
        CharSequence charSequence = new StringBuilder();
        Type type2 = TypeToken.access$500(this.this$0);
        charSequence.append(type2);
        charSequence.append("contains a type variable and is not safe for the operation");
        charSequence = charSequence.toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public void visitWildcardType(WildcardType typeArray) {
        Type[] typeArray2 = typeArray.getLowerBounds();
        this.visit(typeArray2);
        typeArray = typeArray.getUpperBounds();
        this.visit(typeArray);
    }
}

