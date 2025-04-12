/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.json;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive$Companion;

public abstract class JsonPrimitive
extends JsonElement {
    public static final JsonPrimitive$Companion Companion;

    static {
        JsonPrimitive$Companion jsonPrimitive$Companion;
        Companion = jsonPrimitive$Companion = new JsonPrimitive$Companion();
    }

    public abstract String a();

    public String toString() {
        return this.a();
    }
}

