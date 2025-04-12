/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.TypeVisitor;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicReference;

class Types$1
extends TypeVisitor {
    final /* synthetic */ AtomicReference val$result;

    public Types$1(AtomicReference atomicReference) {
        this.val$result = atomicReference;
    }

    public void visitClass(Class clazz) {
        AtomicReference atomicReference = this.val$result;
        clazz = clazz.getComponentType();
        atomicReference.set(clazz);
    }

    public void visitGenericArrayType(GenericArrayType type2) {
        AtomicReference atomicReference = this.val$result;
        type2 = type2.getGenericComponentType();
        atomicReference.set(type2);
    }

    public void visitTypeVariable(TypeVariable type2) {
        AtomicReference atomicReference = this.val$result;
        type2 = Types.access$100(type2.getBounds());
        atomicReference.set(type2);
    }

    public void visitWildcardType(WildcardType type2) {
        AtomicReference atomicReference = this.val$result;
        type2 = Types.access$100(type2.getUpperBounds());
        atomicReference.set(type2);
    }
}

