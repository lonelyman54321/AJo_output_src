/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;
import java.lang.reflect.Type;

public interface JsonDeserializationContext {
    public Object deserialize(JsonElement var1, Type var2);
}

