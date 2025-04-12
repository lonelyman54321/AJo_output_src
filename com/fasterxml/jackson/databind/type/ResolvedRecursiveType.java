/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.type;

public class ResolvedRecursiveType
extends bd1_0 {
    private static final long serialVersionUID = 1L;

    public final StringBuilder b(StringBuilder stringBuilder) {
        stringBuilder.append("?");
        return stringBuilder;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("[recursive type; ");
        stringBuilder.append("UNRESOLVED");
        return stringBuilder.toString();
    }
}

