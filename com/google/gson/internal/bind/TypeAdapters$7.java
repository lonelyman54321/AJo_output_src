/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class TypeAdapters$7
extends TypeAdapter {
    public Number read(JsonReader jsonReader) {
        int n3;
        JsonToken jsonToken;
        Object object = jsonReader.peek();
        if (object == (jsonToken = JsonToken.NULL)) {
            jsonReader.nextNull();
            return null;
        }
        try {
            n3 = jsonReader.nextInt();
        }
        catch (NumberFormatException numberFormatException) {
            object = new JsonSyntaxException(numberFormatException);
            throw object;
        }
        return n3;
    }

    public void write(JsonWriter jsonWriter, Number number) {
        if (number == null) {
            jsonWriter.nullValue();
        } else {
            int n3 = number.intValue();
            long l2 = n3;
            jsonWriter.value(l2);
        }
    }
}

