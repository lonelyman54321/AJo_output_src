/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.Invokable;
import com.google.common.reflect.Types;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

class Invokable$ConstructorInvokable
extends Invokable {
    final Constructor constructor;

    public Invokable$ConstructorInvokable(Constructor constructor) {
        super(constructor);
        this.constructor = constructor;
    }

    private boolean mayNeedHiddenThis() {
        boolean bl2;
        Class clazz = this.constructor.getDeclaringClass();
        GenericDeclaration genericDeclaration = clazz.getEnclosingConstructor();
        boolean bl3 = true;
        if (genericDeclaration != null) {
            return bl3;
        }
        genericDeclaration = clazz.getEnclosingMethod();
        if (genericDeclaration != null) {
            return Modifier.isStatic(((Method)genericDeclaration).getModifiers()) ^ bl3;
        }
        genericDeclaration = clazz.getEnclosingClass();
        if (genericDeclaration == null || (bl2 = Modifier.isStatic(clazz.getModifiers()))) {
            bl3 = false;
        }
        return bl3;
    }

    public AnnotatedType[] getAnnotatedParameterTypes() {
        return this.constructor.getAnnotatedParameterTypes();
    }

    public AnnotatedType getAnnotatedReturnType() {
        return this.constructor.getAnnotatedReturnType();
    }

    public Type[] getGenericExceptionTypes() {
        return this.constructor.getGenericExceptionTypes();
    }

    public Type[] getGenericParameterTypes() {
        Object object;
        int n3;
        int n4;
        Type[] typeArray = this.constructor.getGenericParameterTypes();
        int n7 = typeArray.length;
        if (n7 > 0 && (n7 = (int)(this.mayNeedHiddenThis() ? 1 : 0)) != 0 && (n4 = typeArray.length) == (n3 = ((Class<?>[])(object = this.constructor.getParameterTypes())).length)) {
            n4 = 0;
            Class<?> clazz = this.getDeclaringClass().getEnclosingClass();
            if ((object = object[0]) == clazz) {
                n7 = 1;
                n4 = typeArray.length;
                typeArray = Arrays.copyOfRange(typeArray, n7, n4);
            }
        }
        return typeArray;
    }

    public Type getGenericReturnType() {
        Type type2 = this.getDeclaringClass();
        Type[] typeArray = type2.getTypeParameters();
        int n3 = typeArray.length;
        if (n3 > 0) {
            type2 = Types.newParameterizedType(type2, typeArray);
        }
        return type2;
    }

    public final Annotation[][] getParameterAnnotations() {
        return this.constructor.getParameterAnnotations();
    }

    public final TypeVariable[] getTypeParameters() {
        TypeVariable<Class<T>>[] typeVariableArray = this.getDeclaringClass().getTypeParameters();
        TypeVariable<Constructor<T>>[] typeVariableArray2 = this.constructor.getTypeParameters();
        int n3 = typeVariableArray.length;
        int n4 = typeVariableArray2.length;
        TypeVariable[] typeVariableArray3 = new TypeVariable[n3 + n4];
        n4 = typeVariableArray.length;
        System.arraycopy(typeVariableArray, 0, typeVariableArray3, 0, n4);
        int n7 = typeVariableArray.length;
        n4 = typeVariableArray2.length;
        System.arraycopy(typeVariableArray2, 0, typeVariableArray3, n7, n4);
        return typeVariableArray3;
    }

    public final Object invokeInternal(Object object, Object[] objectArray) {
        try {
            object = this.constructor;
        }
        catch (InstantiationException instantiationException) {
            CharSequence charSequence = new StringBuilder();
            Constructor constructor = this.constructor;
            charSequence.append(constructor);
            charSequence.append(" failed.");
            charSequence = charSequence.toString();
            objectArray = new RuntimeException((String)charSequence, instantiationException);
            throw objectArray;
        }
        return ((Constructor)object).newInstance(objectArray);
    }

    public final boolean isOverridable() {
        return false;
    }

    public final boolean isVarArgs() {
        return this.constructor.isVarArgs();
    }
}

