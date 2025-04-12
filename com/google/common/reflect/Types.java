/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.reflect.Reflection;
import com.google.common.reflect.Types$1;
import com.google.common.reflect.Types$ClassOwnership;
import com.google.common.reflect.Types$JavaVersion;
import com.google.common.reflect.Types$ParameterizedTypeImpl;
import com.google.common.reflect.Types$TypeVariableImpl;
import com.google.common.reflect.Types$TypeVariableInvocationHandler;
import com.google.common.reflect.Types$WildcardTypeImpl;
import java.lang.reflect.Array;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

final class Types {
    private static final Joiner COMMA_JOINER = Joiner.on(", ").useForNull("null");

    private Types() {
    }

    public static /* synthetic */ Type access$100(Type[] typeArray) {
        return Types.subtypeOfComponentType(typeArray);
    }

    public static /* synthetic */ void access$200(Type[] typeArray, String string2) {
        Types.disallowPrimitiveType(typeArray, string2);
    }

    public static /* synthetic */ Type[] access$300(Collection collection) {
        return Types.toArray(collection);
    }

    public static /* synthetic */ Joiner access$400() {
        return COMMA_JOINER;
    }

    public static /* synthetic */ Iterable access$600(Iterable iterable) {
        return Types.filterUpperBounds(iterable);
    }

    private static void disallowPrimitiveType(Type[] typeArray, String string2) {
        for (Type type2 : typeArray) {
            boolean bl2 = type2 instanceof Class;
            if (!bl2) continue;
            type2 = (Class)type2;
            bl2 = ((Class)type2).isPrimitive() ^ true;
            String string3 = "Primitive type '%s' used as %s";
            Preconditions.checkArgument(bl2, string3, (Object)type2, (Object)string2);
        }
    }

    private static Iterable filterUpperBounds(Iterable iterable) {
        Predicate predicate = Predicates.not(Predicates.equalTo(Object.class));
        return Iterables.filter(iterable, predicate);
    }

    public static Class getArrayClass(Class clazz) {
        return Array.newInstance(clazz, 0).getClass();
    }

    public static Type getComponentType(Type type2) {
        Preconditions.checkNotNull(type2);
        AtomicReference atomicReference = new AtomicReference();
        Types$1 types$1 = new Types$1(atomicReference);
        Type[] typeArray = new Type[]{type2};
        types$1.visit(typeArray);
        return (Type)atomicReference.get();
    }

    public static Type newArrayType(Type typeArray) {
        int n3 = typeArray instanceof WildcardType;
        if (n3 != 0) {
            int n4;
            Type[] typeArray2 = (typeArray = (WildcardType)typeArray).getLowerBounds();
            int n7 = typeArray2.length;
            n7 = n7 <= (n4 = 1) ? 1 : 0;
            String string2 = "Wildcard cannot have more than one lower bounds.";
            Preconditions.checkArgument(n7 != 0, string2);
            n7 = typeArray2.length;
            if (n7 == n4) {
                return Types.supertypeOf(Types.newArrayType(typeArray2[0]));
            }
            n3 = (typeArray = typeArray.getUpperBounds()).length;
            if (n3 != n4) {
                n4 = 0;
            }
            Preconditions.checkArgument(n4 != 0, "Wildcard should have only one upper bound.");
            return Types.subtypeOf(Types.newArrayType(typeArray[0]));
        }
        return Types$JavaVersion.CURRENT.newArrayType((Type)typeArray);
    }

    public static TypeVariable newArtificialTypeVariable(GenericDeclaration genericDeclaration, String string2, Type ... typeArray) {
        int n3 = typeArray.length;
        if (n3 == 0) {
            int n4 = 1;
            typeArray = new Type[n4];
            n3 = 0;
            Class<Object> clazz = Object.class;
            typeArray[0] = clazz;
        }
        return Types.newTypeVariableImpl(genericDeclaration, string2, typeArray);
    }

    public static ParameterizedType newParameterizedType(Class clazz, Type ... typeArray) {
        Class clazz2 = Types$ClassOwnership.JVM_BEHAVIOR.getOwnerType(clazz);
        Types$ParameterizedTypeImpl types$ParameterizedTypeImpl = new Types$ParameterizedTypeImpl(clazz2, clazz, typeArray);
        return types$ParameterizedTypeImpl;
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type2, Class clazz, Type ... typeArray) {
        boolean bl2;
        if (type2 == null) {
            return Types.newParameterizedType(clazz, typeArray);
        }
        Preconditions.checkNotNull(typeArray);
        Type type3 = clazz.getEnclosingClass();
        if (type3 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            type3 = null;
        }
        Preconditions.checkArgument(bl2, "Owner type for unenclosed %s", (Object)clazz);
        type3 = new Type(type2, clazz, typeArray);
        return type3;
    }

    private static TypeVariable newTypeVariableImpl(GenericDeclaration object, String string2, Type[] typeArray) {
        Types$TypeVariableImpl types$TypeVariableImpl = new Types$TypeVariableImpl((GenericDeclaration)object, string2, typeArray);
        object = new Types$TypeVariableInvocationHandler(types$TypeVariableImpl);
        return (TypeVariable)Reflection.newProxy(TypeVariable.class, (InvocationHandler)object);
    }

    public static WildcardType subtypeOf(Type type2) {
        Type[] typeArray = new Type[]{};
        Type[] typeArray2 = new Type[]{type2};
        Types$WildcardTypeImpl types$WildcardTypeImpl = new Types$WildcardTypeImpl(typeArray, typeArray2);
        return types$WildcardTypeImpl;
    }

    private static Type subtypeOfComponentType(Type[] object) {
        int n3 = ((Type[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Type type2 = Types.getComponentType(object[i3]);
            if (type2 == null) continue;
            boolean bl2 = type2 instanceof Class;
            if (bl2) {
                object = type2;
                object = (Class)type2;
                n3 = (int)(((Class)object).isPrimitive() ? 1 : 0);
                if (n3 != 0) {
                    return object;
                }
            }
            return Types.subtypeOf(type2);
        }
        return null;
    }

    public static WildcardType supertypeOf(Type typeArray) {
        int n3 = 1;
        Type[] typeArray2 = new Type[n3];
        typeArray2[0] = typeArray;
        typeArray = new Type[n3];
        typeArray[0] = Object.class;
        Types$WildcardTypeImpl types$WildcardTypeImpl = new Types$WildcardTypeImpl(typeArray2, typeArray);
        return types$WildcardTypeImpl;
    }

    private static Type[] toArray(Collection collection) {
        Type[] typeArray = new Type[]{};
        return collection.toArray(typeArray);
    }

    public static String toString(Type object) {
        boolean bl2 = object instanceof Class;
        object = bl2 ? ((Class)object).getName() : object.toString();
        return object;
    }
}

