/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class TypeAdapters$18
extends TypeAdapter {
    public LazilyParsedNumber read(JsonReader object) {
        JsonToken jsonToken;
        Object object2 = ((JsonReader)object).peek();
        if (object2 == (jsonToken = JsonToken.NULL)) {
            ((JsonReader)object).nextNull();
            return null;
        }
        object = ((JsonReader)object).nextString();
        object2 = new LazilyParsedNumber((String)object);
        return object2;
    }

    public void write(JsonWriter jsonWriter, LazilyParsedNumber lazilyParsedNumber) {
        jsonWriter.value(lazilyParsedNumber);
    }
}

