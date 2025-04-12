/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

class Gson$5
extends TypeAdapter {
    final /* synthetic */ TypeAdapter val$longAdapter;

    public Gson$5(TypeAdapter typeAdapter) {
        this.val$longAdapter = typeAdapter;
    }

    public AtomicLongArray read(JsonReader jsonReader) {
        Serializable serializable;
        boolean bl2;
        ArrayList<Serializable> arrayList = new ArrayList<Serializable>();
        jsonReader.beginArray();
        while (bl2 = jsonReader.hasNext()) {
            long l2 = ((Number)this.val$longAdapter.read(jsonReader)).longValue();
            serializable = Long.valueOf(l2);
            arrayList.add(serializable);
        }
        jsonReader.endArray();
        int n3 = arrayList.size();
        serializable = new AtomicLongArray(n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            Long l3 = (Long)arrayList.get(i3);
            long l4 = l3;
            ((AtomicLongArray)serializable).set(i3, l4);
        }
        return serializable;
    }

    public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) {
        jsonWriter.beginArray();
        int n3 = atomicLongArray.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            TypeAdapter typeAdapter = this.val$longAdapter;
            long l2 = atomicLongArray.get(i3);
            Long l3 = l2;
            typeAdapter.write(jsonWriter, l3);
        }
        jsonWriter.endArray();
    }
}

