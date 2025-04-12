/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class TypeAdapters$14
extends TypeAdapter {
    public Character read(JsonReader object) {
        int n3;
        Object object2;
        Object object3 = ((JsonReader)object).peek();
        if (object3 == (object2 = JsonToken.NULL)) {
            ((JsonReader)object).nextNull();
            return null;
        }
        object3 = ((JsonReader)object).nextString();
        int n4 = ((String)object3).length();
        if (n4 == (n3 = 1)) {
            return Character.valueOf(((String)object3).charAt(0));
        }
        object3 = Gn.a("Expecting character, got: ", (String)object3, "; at ");
        object = ((JsonReader)object).getPreviousPath();
        ((StringBuilder)object3).append((String)object);
        object = ((StringBuilder)object3).toString();
        object2 = new JsonSyntaxException((String)object);
        throw object2;
    }

    public void write(JsonWriter jsonWriter, Character object) {
        object = object == null ? null : String.valueOf(object);
        jsonWriter.value((String)object);
    }
}

