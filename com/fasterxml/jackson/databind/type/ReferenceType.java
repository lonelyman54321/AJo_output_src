/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBase;

public class ReferenceType
extends SimpleType {
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
        object = ((ReferenceType)object).a;
        clazz2 = this.a;
        if (object != clazz2) {
            return false;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("[reference type, class ");
        String string2 = this.d();
        stringBuilder.append(string2);
        stringBuilder.append("<null>]");
        return stringBuilder.toString();
    }
}

