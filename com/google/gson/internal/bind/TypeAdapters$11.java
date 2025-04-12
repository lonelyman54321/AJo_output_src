/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class TypeAdapters$11
extends TypeAdapter {
    public Number read(JsonReader jsonReader) {
        long l2;
        JsonToken jsonToken;
        Object object = jsonReader.peek();
        if (object == (jsonToken = JsonToken.NULL)) {
            jsonReader.nextNull();
            return null;
        }
        try {
            l2 = jsonReader.nextLong();
        }
        catch (NumberFormatException numberFormatException) {
            object = new JsonSyntaxException(numberFormatException);
            throw object;
        }
        return l2;
    }

    public void write(JsonWriter jsonWriter, Number number) {
        if (number == null) {
            jsonWriter.nullValue();
        } else {
            long l2 = number.longValue();
            jsonWriter.value(l2);
        }
    }
}

