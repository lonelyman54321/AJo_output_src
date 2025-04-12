/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class Gson$1
extends TypeAdapter {
    final /* synthetic */ Gson this$0;

    public Gson$1(Gson gson) {
        this.this$0 = gson;
    }

    public Double read(JsonReader jsonReader) {
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
            return;
        }
        double d2 = number.doubleValue();
        Gson.checkValidFloatingPoint(d2);
        jsonWriter.value(d2);
    }
}

