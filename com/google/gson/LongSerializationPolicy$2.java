/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.LongSerializationPolicy;

final class LongSerializationPolicy$2
extends LongSerializationPolicy {
    public JsonElement serialize(Long object) {
        if (object == null) {
            return JsonNull.INSTANCE;
        }
        object = ((Long)object).toString();
        JsonPrimitive jsonPrimitive = new JsonPrimitive((String)object);
        return jsonPrimitive;
    }
}

