/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.ArrayTypeAdapter$1;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class ArrayTypeAdapter
extends TypeAdapter {
    public static final TypeAdapterFactory FACTORY;
    private final Class componentType;
    private final TypeAdapter componentTypeAdapter;

    static {
        ArrayTypeAdapter$1 arrayTypeAdapter$1 = new ArrayTypeAdapter$1();
        FACTORY = arrayTypeAdapter$1;
    }

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class clazz) {
        TypeAdapterRuntimeTypeWrapper typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, clazz);
        this.componentTypeAdapter = typeAdapterRuntimeTypeWrapper;
        this.componentType = clazz;
    }

    public Object read(JsonReader objectArray) {
        boolean bl2;
        Object object;
        Object object2 = objectArray.peek();
        if (object2 == (object = JsonToken.NULL)) {
            objectArray.nextNull();
            return null;
        }
        object2 = new ArrayList();
        objectArray.beginArray();
        while (bl2 = objectArray.hasNext()) {
            object = this.componentTypeAdapter.read((JsonReader)objectArray);
            ((ArrayList)object2).add(object);
        }
        objectArray.endArray();
        int n3 = ((ArrayList)object2).size();
        object = this.componentType;
        bl2 = ((Class)object).isPrimitive();
        if (bl2) {
            object = Array.newInstance(this.componentType, n3);
            for (int i3 = 0; i3 < n3; ++i3) {
                Object e2 = ((ArrayList)object2).get(i3);
                Array.set(object, i3, e2);
            }
            return object;
        }
        objectArray = (Object[])Array.newInstance(this.componentType, n3);
        return ((ArrayList)object2).toArray(objectArray);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        if (object == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int n3 = Array.getLength(object);
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = Array.get(object, i3);
            TypeAdapter typeAdapter = this.componentTypeAdapter;
            typeAdapter.write(jsonWriter, object2);
        }
        jsonWriter.endArray();
    }
}

