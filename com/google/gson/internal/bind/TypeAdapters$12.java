/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class TypeAdapters$12
extends TypeAdapter {
    public Number read(JsonReader jsonReader) {
        JsonToken jsonToken;
        JsonToken jsonToken2 = jsonReader.peek();
        if (jsonToken2 == (jsonToken = JsonToken.NULL)) {
            jsonReader.nextNull();
            return null;
        }
        return Float.valueOf((float)jsonReader.nextDouble());
    }

    public void write(JsonWriter jsonWriter, Number number) {
        if (number == null) {
            jsonWriter.nullValue();
        } else {
            boolean bl2 = number instanceof Float;
            if (!bl2) {
                float f5 = number.floatValue();
                number = Float.valueOf(f5);
            }
            jsonWriter.value(number);
        }
    }
}

