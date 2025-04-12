/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.UUID;

class TypeAdapters$24
extends TypeAdapter {
    public UUID read(JsonReader object) {
        JsonToken jsonToken;
        Object object2 = ((JsonReader)object).peek();
        if (object2 == (jsonToken = JsonToken.NULL)) {
            ((JsonReader)object).nextNull();
            return null;
        }
        object2 = ((JsonReader)object).nextString();
        try {
            return UUID.fromString((String)object2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object2 = Gn.a("Failed parsing '", (String)object2, "' as UUID; at path ");
            object = ((JsonReader)object).getPreviousPath();
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            JsonSyntaxException jsonSyntaxException = new JsonSyntaxException((String)object, illegalArgumentException);
            throw jsonSyntaxException;
        }
    }

    public void write(JsonWriter jsonWriter, UUID object) {
        object = object == null ? null : ((UUID)object).toString();
        jsonWriter.value((String)object);
    }
}

