/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;

public final class JsonNull
extends JsonElement {
    public static final JsonNull INSTANCE;

    static {
        JsonNull jsonNull;
        INSTANCE = jsonNull = new JsonNull();
    }

    public JsonNull deepCopy() {
        return INSTANCE;
    }

    public boolean equals(Object object) {
        return object instanceof JsonNull;
    }

    public int hashCode() {
        return JsonNull.class.hashCode();
    }
}

