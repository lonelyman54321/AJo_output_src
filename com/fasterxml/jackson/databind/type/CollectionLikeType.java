/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBase;

public class CollectionLikeType
extends TypeBase {
    private static final long serialVersionUID = 1L;

    public final StringBuilder b(StringBuilder stringBuilder) {
        TypeBase.c(this.a, stringBuilder, false);
        stringBuilder.append('<');
        throw null;
    }

    public final String d() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a.getName();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        Class clazz2 = object.getClass();
        if (clazz2 != (clazz = this.getClass())) {
            return false;
        }
        object = (CollectionLikeType)object;
        clazz2 = this.a;
        object = ((JavaType)object).a;
        if (clazz2 != object) {
            return false;
        }
        throw null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[collection-like type; class ");
        String string2 = this.a.getName();
        stringBuilder.append(string2);
        stringBuilder.append(", contains null]");
        return stringBuilder.toString();
    }
}

