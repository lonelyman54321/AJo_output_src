/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.type.CollectionLikeType;

public final class CollectionType
extends CollectionLikeType {
    private static final long serialVersionUID = 1L;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[collection type; class ");
        String string2 = this.a.getName();
        stringBuilder.append(string2);
        stringBuilder.append(", contains null]");
        return stringBuilder.toString();
    }
}

