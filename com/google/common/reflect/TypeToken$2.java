/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.reflect.Invokable$ConstructorInvokable;
import com.google.common.reflect.TypeResolver;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

class TypeToken$2
extends Invokable$ConstructorInvokable {
    final /* synthetic */ TypeToken this$0;

    public TypeToken$2(TypeToken typeToken, Constructor constructor) {
        this.this$0 = typeToken;
        super(constructor);
    }

    public Type[] getGenericExceptionTypes() {
        TypeResolver typeResolver = TypeToken.access$000(this.this$0);
        Type[] typeArray = super.getGenericExceptionTypes();
        return typeResolver.resolveTypesInPlace(typeArray);
    }

    public Type[] getGenericParameterTypes() {
        TypeResolver typeResolver = TypeToken.access$100(this.this$0);
        Type[] typeArray = super.getGenericParameterTypes();
        return typeResolver.resolveTypesInPlace(typeArray);
    }

    public Type getGenericReturnType() {
        TypeResolver typeResolver = TypeToken.access$000(this.this$0);
        Type type2 = super.getGenericReturnType();
        return typeResolver.resolveType(type2);
    }

    public TypeToken getOwnerType() {
        return this.this$0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.getOwnerType();
        stringBuilder.append(object);
        stringBuilder.append("(");
        object = Joiner.on(", ");
        Object[] objectArray = this.getGenericParameterTypes();
        object = ((Joiner)object).join(objectArray);
        return h30_0.a(stringBuilder, (String)object, ")");
    }
}

