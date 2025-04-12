/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.type;

public class PlaceholderForType
extends bd1_0 {
    private static final long serialVersionUID = 1L;

    public final StringBuilder b(StringBuilder stringBuilder) {
        stringBuilder.append('$');
        stringBuilder.append(1);
        return stringBuilder;
    }

    public final String d() {
        return "$1";
    }

    public final String toString() {
        return "$1";
    }
}

