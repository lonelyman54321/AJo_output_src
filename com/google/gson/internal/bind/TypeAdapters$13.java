/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class TypeAdapters$13
extends TypeAdapter {
    public Number read(JsonReader jsonReader) {
        JsonToken jsonToken;
        JsonToken jsonToken2 = jsonReader.peek();
        if (jsonToken2 == (jsonToken = JsonToken.NULL)) {
            jsonReader.nextNull();
            return null;
        }
        return jsonReader.nextDouble();
    }

    public void write(JsonWriter jsonWriter, Number number) {
        if (number == null) {
            jsonWriter.nullValue();
        } else {
            double d2 = number.doubleValue();
            jsonWriter.value(d2);
        }
    }
}

