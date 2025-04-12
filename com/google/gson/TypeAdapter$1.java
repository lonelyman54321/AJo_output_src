/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class TypeAdapter$1
extends TypeAdapter {
    final /* synthetic */ TypeAdapter this$0;

    public TypeAdapter$1(TypeAdapter typeAdapter) {
        this.this$0 = typeAdapter;
    }

    public Object read(JsonReader jsonReader) {
        JsonToken jsonToken;
        JsonToken jsonToken2 = jsonReader.peek();
        if (jsonToken2 == (jsonToken = JsonToken.NULL)) {
            jsonReader.nextNull();
            return null;
        }
        return this.this$0.read(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        if (object == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter = this.this$0;
            typeAdapter.write(jsonWriter, object);
        }
    }
}

