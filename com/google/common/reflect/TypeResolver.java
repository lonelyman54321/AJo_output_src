/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.reflect.TypeResolver$1;
import com.google.common.reflect.TypeResolver$TypeMappingIntrospector;
import com.google.common.reflect.TypeResolver$TypeTable;
import com.google.common.reflect.TypeResolver$WildcardCapturer;
import com.google.common.reflect.Types;
import com.google.common.reflect.Types$WildcardTypeImpl;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;

public final class TypeResolver {
    private final TypeResolver$TypeTable typeTable;

    public TypeResolver() {
        TypeResolver$TypeTable typeResolver$TypeTable;
        this.typeTable = typeResolver$TypeTable = new TypeResolver$TypeTable();
    }

    private TypeResolver(TypeResolver$TypeTable typeResolver$TypeTable) {
        this.typeTable = typeResolver$TypeTable;
    }

    public /* synthetic */ TypeResolver(TypeResolver$TypeTable typeResolver$TypeTable, TypeResolver$1 typeResolver$1) {
        this(typeResolver$TypeTable);
    }

    public static /* synthetic */ void access$000(Map map2, Type type2, Type type3) {
        TypeResolver.populateTypeMappings(map2, type2, type3);
    }

    public static /* synthetic */ Object access$100(Class clazz, Object object) {
        return TypeResolver.expectArgument(clazz, object);
    }

    public static /* synthetic */ Type[] access$300(TypeResolver typeResolver, Type[] typeArray) {
        return typeResolver.resolveTypes(typeArray);
    }

    public static TypeResolver covariantly(Type object) {
        TypeResolver typeResolver = new TypeResolver();
        object = TypeResolver$TypeMappingIntrospector.getTypeMappings((Type)object);
        return typeResolver.where((Map)object);
    }

    private static Object expectArgument(Class object, Object object2) {
        try {
            return ((Class)object).cast(object2);
        }
        catch (ClassCastException classCastException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object2);
            stringBuilder.append(" is not a ");
            object = ((Class)object).getSimpleName();
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
    }

    public static TypeResolver invariantly(Type object) {
        object = TypeResolver$WildcardCapturer.INSTANCE.capture((Type)object);
        TypeResolver typeResolver = new TypeResolver();
        object = TypeResolver$TypeMappingIntrospector.getTypeMappings((Type)object);
        return typeResolver.where((Map)object);
    }

    private static void populateTypeMappings(Map typeArray, Type type2, Type type3) {
        boolean bl2 = type2.equals(type3);
        if (bl2) {
            return;
        }
        TypeResolver$1 typeResolver$1 = new TypeResolver$1((Map)typeArray, type3);
        typeArray = new Type[]{type2};
        typeResolver$1.visit(typeArray);
    }

    private Type resolveGenericArrayType(GenericArrayType type2) {
        type2 = type2.getGenericComponentType();
        return Types.newArrayType(this.resolveType(type2));
    }

    private ParameterizedType resolveParameterizedType(ParameterizedType typeArray) {
        Type type2 = typeArray.getOwnerType();
        type2 = type2 == null ? null : this.resolveType(type2);
        Type type3 = typeArray.getRawType();
        type3 = this.resolveType(type3);
        typeArray = typeArray.getActualTypeArguments();
        typeArray = this.resolveTypes(typeArray);
        type3 = (Class)type3;
        return Types.newParameterizedTypeWithOwner(type2, (Class)type3, typeArray);
    }

    private Type[] resolveTypes(Type[] typeArray) {
        int n3;
        int n4 = typeArray.length;
        Type[] typeArray2 = new Type[n4];
        for (int i3 = 0; i3 < (n3 = typeArray.length); ++i3) {
            Type type2 = typeArray[i3];
            typeArray2[i3] = type2 = this.resolveType(type2);
        }
        return typeArray2;
    }

    private WildcardType resolveWildcardType(WildcardType typeArray) {
        Type[] typeArray2 = typeArray.getLowerBounds();
        typeArray = typeArray.getUpperBounds();
        typeArray2 = this.resolveTypes(typeArray2);
        typeArray = this.resolveTypes(typeArray);
        Types$WildcardTypeImpl types$WildcardTypeImpl = new Types$WildcardTypeImpl(typeArray2, typeArray);
        return types$WildcardTypeImpl;
    }

    public Type resolveType(Type type2) {
        Preconditions.checkNotNull(type2);
        boolean bl2 = type2 instanceof TypeVariable;
        if (bl2) {
            TypeResolver$TypeTable typeResolver$TypeTable = this.typeTable;
            type2 = (TypeVariable)type2;
            return typeResolver$TypeTable.resolve((TypeVariable)type2);
        }
        bl2 = type2 instanceof ParameterizedType;
        if (bl2) {
            type2 = (ParameterizedType)type2;
            return this.resolveParameterizedType((ParameterizedType)type2);
        }
        bl2 = type2 instanceof GenericArrayType;
        if (bl2) {
            type2 = (GenericArrayType)type2;
            return this.resolveGenericArrayType((GenericArrayType)type2);
        }
        bl2 = type2 instanceof WildcardType;
        if (bl2) {
            type2 = (WildcardType)type2;
            type2 = this.resolveWildcardType((WildcardType)type2);
        }
        return type2;
    }

    public Type[] resolveTypesInPlace(Type[] typeArray) {
        int n3;
        for (int i3 = 0; i3 < (n3 = typeArray.length); ++i3) {
            Type type2 = typeArray[i3];
            typeArray[i3] = type2 = this.resolveType(type2);
        }
        return typeArray;
    }

    public TypeResolver where(Type type2, Type type3) {
        HashMap hashMap = Maps.newHashMap();
        type2 = (Type)Preconditions.checkNotNull(type2);
        type3 = (Type)Preconditions.checkNotNull(type3);
        TypeResolver.populateTypeMappings(hashMap, type2, type3);
        return this.where(hashMap);
    }

    public TypeResolver where(Map object) {
        object = this.typeTable.where((Map)object);
        TypeResolver typeResolver = new TypeResolver((TypeResolver$TypeTable)object);
        return typeResolver;
    }
}

