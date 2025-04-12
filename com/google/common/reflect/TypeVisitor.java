/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Set;

abstract class TypeVisitor {
    private final Set visited;

    public TypeVisitor() {
        HashSet hashSet = Sets.newHashSet();
        this.visited = hashSet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void visit(Type ... object) {
        int n3 = ((Type[])object).length;
        int n4 = 0;
        String string2 = null;
        while (true) {
            block12: {
                Throwable throwable2;
                Type type2;
                block13: {
                    block14: {
                        Object object2;
                        boolean bl2;
                        if (n4 >= n3) {
                            return;
                        }
                        type2 = object[n4];
                        if (type2 == null || !(bl2 = (object2 = this.visited).add(type2))) break block12;
                        bl2 = type2 instanceof TypeVariable;
                        if (bl2) {
                            object2 = type2;
                            object2 = (TypeVariable)type2;
                            this.visitTypeVariable((TypeVariable)object2);
                            break block12;
                        }
                        bl2 = type2 instanceof WildcardType;
                        if (bl2) {
                            object2 = type2;
                            object2 = (WildcardType)type2;
                            this.visitWildcardType((WildcardType)object2);
                            break block12;
                        }
                        bl2 = type2 instanceof ParameterizedType;
                        if (bl2) {
                            object2 = type2;
                            object2 = (ParameterizedType)type2;
                            this.visitParameterizedType((ParameterizedType)object2);
                            break block12;
                        }
                        bl2 = type2 instanceof Class;
                        if (bl2) {
                            object2 = type2;
                            object2 = (Class)type2;
                            this.visitClass((Class)object2);
                            break block12;
                        }
                        bl2 = type2 instanceof GenericArrayType;
                        if (!bl2) break block14;
                        object2 = type2;
                        try {
                            object2 = (GenericArrayType)type2;
                            this.visitGenericArrayType((GenericArrayType)object2);
                            break block12;
                        }
                        catch (Throwable throwable2) {
                            break block13;
                        }
                    }
                    CharSequence charSequence = new StringBuilder();
                    string2 = "Unknown type: ";
                    charSequence.append(string2);
                    charSequence.append(type2);
                    charSequence = charSequence.toString();
                    object = new AssertionError(charSequence);
                    throw object;
                }
                this.visited.remove(type2);
                throw throwable2;
            }
            ++n4;
        }
    }

    public void visitClass(Class clazz) {
    }

    public void visitGenericArrayType(GenericArrayType genericArrayType) {
    }

    public void visitParameterizedType(ParameterizedType parameterizedType) {
    }

    public void visitTypeVariable(TypeVariable typeVariable) {
    }

    public void visitWildcardType(WildcardType wildcardType) {
    }
}

