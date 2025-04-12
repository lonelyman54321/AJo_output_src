/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.reflect.TypeResolver$TypeVariableKey;
import com.google.common.reflect.TypeVisitor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;

final class TypeResolver$TypeMappingIntrospector
extends TypeVisitor {
    private final Map mappings;

    private TypeResolver$TypeMappingIntrospector() {
        HashMap hashMap = Maps.newHashMap();
        this.mappings = hashMap;
    }

    public static ImmutableMap getTypeMappings(Type type2) {
        Preconditions.checkNotNull(type2);
        TypeResolver$TypeMappingIntrospector typeResolver$TypeMappingIntrospector = new TypeResolver$TypeMappingIntrospector();
        Type[] typeArray = new Type[]{type2};
        typeResolver$TypeMappingIntrospector.visit(typeArray);
        return ImmutableMap.copyOf(typeResolver$TypeMappingIntrospector.mappings);
    }

    private void map(TypeResolver$TypeVariableKey object, Type object2) {
        Object object3 = this.mappings;
        boolean bl2 = object3.containsKey(object);
        if (bl2) {
            return;
        }
        object3 = object2;
        while (object3 != null) {
            boolean bl3 = ((TypeResolver$TypeVariableKey)object).equalsType((Type)object3);
            if (bl3) {
                while (object2 != null) {
                    object = this.mappings;
                    object2 = TypeResolver$TypeVariableKey.forLookup((Type)object2);
                    object2 = object = object.remove(object2);
                    object2 = (Type)object;
                }
                return;
            }
            Map map2 = this.mappings;
            object3 = TypeResolver$TypeVariableKey.forLookup((Type)object3);
            object3 = (Type)map2.get(object3);
        }
        this.mappings.put(object, object2);
    }

    public void visitClass(Class typeArray) {
        Type type2 = typeArray.getGenericSuperclass();
        Type[] typeArray2 = new Type[]{type2};
        this.visit(typeArray2);
        typeArray = typeArray.getGenericInterfaces();
        this.visit(typeArray);
    }

    public void visitParameterizedType(ParameterizedType type2) {
        Type[] typeArray;
        int n3;
        int n4 = 1;
        Class clazz = (Class)type2.getRawType();
        Type[] typeArray2 = clazz.getTypeParameters();
        int n7 = typeArray2.length;
        n7 = n7 == (n3 = (typeArray = type2.getActualTypeArguments()).length) ? 1 : 0;
        Preconditions.checkState(n7 != 0);
        for (n7 = 0; n7 < (n3 = typeArray2.length); n7 += n4) {
            Type type3 = typeArray2[n7];
            TypeResolver$TypeVariableKey typeResolver$TypeVariableKey = new TypeResolver$TypeVariableKey((TypeVariable)type3);
            type3 = typeArray[n7];
            this.map(typeResolver$TypeVariableKey, type3);
        }
        typeArray2 = new Type[n4];
        typeArray2[0] = clazz;
        this.visit(typeArray2);
        type2 = type2.getOwnerType();
        Type[] typeArray3 = new Type[n4];
        typeArray3[0] = type2;
        this.visit(typeArray3);
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

