/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.reflect.TypeResolver$1;
import com.google.common.reflect.TypeResolver$WildcardCapturer$1;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicInteger;

class TypeResolver$WildcardCapturer {
    static final TypeResolver$WildcardCapturer INSTANCE;
    private final AtomicInteger id;

    static {
        TypeResolver$WildcardCapturer typeResolver$WildcardCapturer;
        INSTANCE = typeResolver$WildcardCapturer = new TypeResolver$WildcardCapturer();
    }

    private TypeResolver$WildcardCapturer() {
        AtomicInteger atomicInteger = new AtomicInteger();
        this(atomicInteger);
    }

    private TypeResolver$WildcardCapturer(AtomicInteger atomicInteger) {
        this.id = atomicInteger;
    }

    public /* synthetic */ TypeResolver$WildcardCapturer(AtomicInteger atomicInteger, TypeResolver.1 var2_2) {
        this(atomicInteger);
    }

    private Type captureNullable(Type type2) {
        if (type2 == null) {
            return null;
        }
        return this.capture(type2);
    }

    private TypeResolver$WildcardCapturer forTypeVariable(TypeVariable typeVariable) {
        AtomicInteger atomicInteger = this.id;
        TypeResolver$WildcardCapturer$1 typeResolver$WildcardCapturer$1 = new TypeResolver$WildcardCapturer$1(this, atomicInteger, typeVariable);
        return typeResolver$WildcardCapturer$1;
    }

    private TypeResolver$WildcardCapturer notForTypeVariable() {
        AtomicInteger atomicInteger = this.id;
        TypeResolver$WildcardCapturer typeResolver$WildcardCapturer = new TypeResolver$WildcardCapturer(atomicInteger);
        return typeResolver$WildcardCapturer;
    }

    public final Type capture(Type object) {
        Preconditions.checkNotNull(object);
        boolean bl2 = object instanceof Class;
        if (bl2) {
            return object;
        }
        bl2 = object instanceof TypeVariable;
        if (bl2) {
            return object;
        }
        bl2 = object instanceof GenericArrayType;
        if (bl2) {
            object = (GenericArrayType)object;
            TypeResolver$WildcardCapturer typeResolver$WildcardCapturer = this.notForTypeVariable();
            object = object.getGenericComponentType();
            return Types.newArrayType(typeResolver$WildcardCapturer.capture((Type)object));
        }
        bl2 = object instanceof ParameterizedType;
        if (bl2) {
            int n3;
            object = (ParameterizedType)object;
            Class clazz = (Class)object.getRawType();
            Object object2 = clazz.getTypeParameters();
            Type[] typeArray = object.getActualTypeArguments();
            for (int i3 = 0; i3 < (n3 = typeArray.length); ++i3) {
                Object object3 = object2[i3];
                object3 = this.forTypeVariable((TypeVariable)object3);
                Type type2 = typeArray[i3];
                typeArray[i3] = object3 = ((TypeResolver$WildcardCapturer)object3).capture(type2);
            }
            object2 = this.notForTypeVariable();
            object = object.getOwnerType();
            return Types.newParameterizedTypeWithOwner(super.captureNullable((Type)object), clazz, typeArray);
        }
        bl2 = object instanceof WildcardType;
        if (bl2) {
            Type type3 = object;
            type3 = (WildcardType)object;
            Type[] typeArray = type3.getLowerBounds();
            int n4 = typeArray.length;
            if (n4 == 0) {
                object = type3.getUpperBounds();
                object = this.captureAsTypeVariable((Type[])object);
            }
            return (Type)object;
        }
        object = new AssertionError((Object)"must have been one of the known types");
        throw object;
    }

    public TypeVariable captureAsTypeVariable(Type[] typeArray) {
        CharSequence charSequence = new StringBuilder("capture#");
        int n3 = this.id.incrementAndGet();
        charSequence.append(n3);
        charSequence.append("-of ? extends ");
        String string2 = Joiner.on('&').join(typeArray);
        charSequence.append(string2);
        charSequence = charSequence.toString();
        return Types.newArtificialTypeVariable(TypeResolver$WildcardCapturer.class, (String)charSequence, typeArray);
    }
}

