/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

class TypeAdapters$10
extends TypeAdapter {
    public AtomicIntegerArray read(JsonReader jsonReader) {
        Serializable serializable;
        int n3;
        Serializable serializable2 = new ArrayList();
        jsonReader.beginArray();
        while ((n3 = jsonReader.hasNext()) != 0) {
            try {
                n3 = jsonReader.nextInt();
            }
            catch (NumberFormatException numberFormatException) {
                serializable2 = new JsonSyntaxException(numberFormatException);
                throw serializable2;
            }
            serializable = Integer.valueOf(n3);
            ((ArrayList)serializable2).add(serializable);
        }
        jsonReader.endArray();
        int n4 = ((ArrayList)serializable2).size();
        serializable = new AtomicIntegerArray(n4);
        for (int i3 = 0; i3 < n4; ++i3) {
            Integer n7 = (Integer)((ArrayList)serializable2).get(i3);
            int n8 = n7;
            ((AtomicIntegerArray)serializable).set(i3, n8);
        }
        return serializable;
    }

    public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) {
        jsonWriter.beginArray();
        int n3 = atomicIntegerArray.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = atomicIntegerArray.get(i3);
            long l2 = n4;
            jsonWriter.value(l2);
        }
        jsonWriter.endArray();
    }
}

