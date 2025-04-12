/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

class Gson$FutureTypeAdapter
extends SerializationDelegatingTypeAdapter {
    private TypeAdapter delegate = null;

    private TypeAdapter delegate() {
        Object object = this.delegate;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        throw object;
    }

    public TypeAdapter getSerializationDelegate() {
        return this.delegate();
    }

    public Object read(JsonReader jsonReader) {
        return this.delegate().read(jsonReader);
    }

    public void setDelegate(TypeAdapter object) {
        TypeAdapter typeAdapter = this.delegate;
        if (typeAdapter == null) {
            this.delegate = object;
            return;
        }
        object = new AssertionError((Object)"Delegate is already set");
        throw object;
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.delegate().write(jsonWriter, object);
    }
}

