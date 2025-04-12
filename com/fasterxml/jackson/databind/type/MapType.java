/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.type.MapLikeType;

public final class MapType
extends MapLikeType {
    private static final long serialVersionUID = 1L;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[map type; class ");
        String string2 = this.a.getName();
        stringBuilder.append(string2);
        stringBuilder.append(", null -> null]");
        return stringBuilder.toString();
    }
}

