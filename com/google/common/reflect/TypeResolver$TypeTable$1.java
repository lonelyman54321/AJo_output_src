/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.TypeResolver$TypeTable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

class TypeResolver$TypeTable$1
extends TypeResolver$TypeTable {
    final /* synthetic */ TypeResolver$TypeTable val$unguarded;
    final /* synthetic */ TypeVariable val$var;

    public TypeResolver$TypeTable$1(TypeResolver$TypeTable typeResolver$TypeTable, TypeVariable typeVariable, TypeResolver$TypeTable typeResolver$TypeTable2) {
        this.val$var = typeVariable;
        this.val$unguarded = typeResolver$TypeTable2;
    }

    public Type resolveInternal(TypeVariable typeVariable, TypeResolver$TypeTable typeResolver$TypeTable) {
        Object d2;
        Object d5 = typeVariable.getGenericDeclaration();
        boolean bl2 = d5.equals(d2 = this.val$var.getGenericDeclaration());
        if (bl2) {
            return typeVariable;
        }
        return this.val$unguarded.resolveInternal(typeVariable, typeResolver$TypeTable);
    }
}

