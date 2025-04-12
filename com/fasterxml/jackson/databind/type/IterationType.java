/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBase;

public class IterationType
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
}

