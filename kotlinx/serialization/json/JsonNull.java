/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.json;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonPrimitive;

public final class JsonNull
extends JsonPrimitive {
    public static final JsonNull INSTANCE;
    public static final String a;

    static {
        JsonNull jsonNull;
        INSTANCE = jsonNull = new JsonNull();
        a = "null";
    }

    public final String a() {
        return a;
    }

    public final KSerializer serializer() {
        return zm1_2.a;
    }
}

