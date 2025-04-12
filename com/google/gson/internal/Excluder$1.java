/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

class Excluder$1
extends TypeAdapter {
    private TypeAdapter delegate;
    final /* synthetic */ Excluder this$0;
    final /* synthetic */ Gson val$gson;
    final /* synthetic */ boolean val$skipDeserialize;
    final /* synthetic */ boolean val$skipSerialize;
    final /* synthetic */ TypeToken val$type;

    public Excluder$1(Excluder excluder, boolean bl2, boolean bl3, Gson gson, TypeToken typeToken) {
        this.this$0 = excluder;
        this.val$skipDeserialize = bl2;
        this.val$skipSerialize = bl3;
        this.val$gson = gson;
        this.val$type = typeToken;
    }

    private TypeAdapter delegate() {
        Object object = this.delegate;
        if (object == null) {
            object = this.val$gson;
            Excluder excluder = this.this$0;
            TypeToken typeToken = this.val$type;
            this.delegate = object = ((Gson)object).getDelegateAdapter(excluder, typeToken);
        }
        return object;
    }

    public Object read(JsonReader jsonReader) {
        boolean bl2 = this.val$skipDeserialize;
        if (bl2) {
            jsonReader.skipValue();
            return null;
        }
        return this.delegate().read(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        boolean bl2 = this.val$skipSerialize;
        if (bl2) {
            jsonWriter.nullValue();
            return;
        }
        this.delegate().write(jsonWriter, object);
    }
}

