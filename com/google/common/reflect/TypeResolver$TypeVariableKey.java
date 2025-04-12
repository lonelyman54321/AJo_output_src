/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeResolver$TypeVariableKey {
    private final TypeVariable var;

    public TypeResolver$TypeVariableKey(TypeVariable typeVariable) {
        this.var = typeVariable = (TypeVariable)Preconditions.checkNotNull(typeVariable);
    }

    private boolean equalsTypeVariable(TypeVariable object) {
        boolean bl2;
        Object d2;
        Object object2 = this.var.getGenericDeclaration();
        boolean bl3 = object2.equals(d2 = object.getGenericDeclaration());
        if (bl3 && (bl2 = ((String)(object2 = this.var.getName())).equals(object = object.getName()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static TypeResolver$TypeVariableKey forLookup(Type type2) {
        boolean bl2 = type2 instanceof TypeVariable;
        if (bl2) {
            type2 = (TypeVariable)type2;
            TypeResolver$TypeVariableKey typeResolver$TypeVariableKey = new TypeResolver$TypeVariableKey((TypeVariable)type2);
            return typeResolver$TypeVariableKey;
        }
        return null;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof TypeResolver$TypeVariableKey;
        if (bl2) {
            object = ((TypeResolver$TypeVariableKey)object).var;
            return this.equalsTypeVariable((TypeVariable)object);
        }
        return false;
    }

    public boolean equalsType(Type type2) {
        boolean bl2 = type2 instanceof TypeVariable;
        if (bl2) {
            type2 = (TypeVariable)type2;
            return this.equalsTypeVariable((TypeVariable)type2);
        }
        return false;
    }

    public int hashCode() {
        Object d2 = this.var.getGenericDeclaration();
        String string2 = this.var.getName();
        Object[] objectArray = new Object[]{d2, string2};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        return this.var.toString();
    }
}

