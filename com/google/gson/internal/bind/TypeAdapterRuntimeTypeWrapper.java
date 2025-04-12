/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper
extends TypeAdapter {
    private final Gson context;
    private final TypeAdapter delegate;
    private final Type type;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type2) {
        this.context = gson;
        this.delegate = typeAdapter;
        this.type = type2;
    }

    private static Type getRuntimeTypeIfMoreSpecific(Type clazz, Object object) {
        boolean bl2;
        if (object != null && ((bl2 = clazz instanceof Class) || (bl2 = clazz instanceof TypeVariable))) {
            clazz = object.getClass();
        }
        return clazz;
    }

    private static boolean isReflective(TypeAdapter typeAdapter) {
        boolean bl2;
        while (bl2 = typeAdapter instanceof SerializationDelegatingTypeAdapter) {
            TypeAdapter typeAdapter2 = typeAdapter;
            typeAdapter2 = ((SerializationDelegatingTypeAdapter)typeAdapter).getSerializationDelegate();
            if (typeAdapter2 == typeAdapter) break;
            typeAdapter = typeAdapter2;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory$Adapter;
    }

    public Object read(JsonReader jsonReader) {
        return this.delegate.read(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        Type type2;
        Object object2 = this.delegate;
        Object object3 = TypeAdapterRuntimeTypeWrapper.getRuntimeTypeIfMoreSpecific(this.type, object);
        if (object3 != (type2 = this.type)) {
            object2 = this.context;
            boolean bl2 = (object2 = ((Gson)object2).getAdapter((TypeToken)(object3 = TypeToken.get((Type)object3)))) instanceof ReflectiveTypeAdapterFactory$Adapter;
            if (bl2 && !(bl2 = TypeAdapterRuntimeTypeWrapper.isReflective((TypeAdapter)(object3 = this.delegate)))) {
                object2 = this.delegate;
            }
        }
        ((TypeAdapter)object2).write(jsonWriter, object);
    }
}

