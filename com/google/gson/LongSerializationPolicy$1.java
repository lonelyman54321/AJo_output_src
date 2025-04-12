/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.LongSerializationPolicy;

final class LongSerializationPolicy$1
extends LongSerializationPolicy {
    public JsonElement serialize(Long l2) {
        if (l2 == null) {
            return JsonNull.INSTANCE;
        }
        JsonPrimitive jsonPrimitive = new JsonPrimitive(l2);
        return jsonPrimitive;
    }
}

