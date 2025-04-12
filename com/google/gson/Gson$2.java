/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class Gson$2
extends TypeAdapter {
    final /* synthetic */ Gson this$0;

    public Gson$2(Gson gson) {
        this.this$0 = gson;
    }

    public Float read(JsonReader jsonReader) {
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
            return;
        }
        float f5 = number.floatValue();
        double d2 = f5;
        Gson.checkValidFloatingPoint(d2);
        boolean bl2 = number instanceof Float;
        if (!bl2) {
            number = Float.valueOf(f5);
        }
        jsonWriter.value(number);
    }
}

