/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter$GsonContextImpl;
import com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;

public final class TreeTypeAdapter
extends SerializationDelegatingTypeAdapter {
    private final TreeTypeAdapter$GsonContextImpl context;
    private volatile TypeAdapter delegate;
    private final JsonDeserializer deserializer;
    final Gson gson;
    private final boolean nullSafe;
    private final JsonSerializer serializer;
    private final TypeAdapterFactory skipPast;
    private final TypeToken typeToken;

    public TreeTypeAdapter(JsonSerializer jsonSerializer, JsonDeserializer jsonDeserializer, Gson gson, TypeToken typeToken, TypeAdapterFactory typeAdapterFactory) {
        this(jsonSerializer, jsonDeserializer, gson, typeToken, typeAdapterFactory, true);
    }

    public TreeTypeAdapter(JsonSerializer jsonSerializer, JsonDeserializer jsonDeserializer, Gson gson, TypeToken typeToken, TypeAdapterFactory typeAdapterFactory, boolean bl2) {
        TreeTypeAdapter$GsonContextImpl treeTypeAdapter$GsonContextImpl;
        this.context = treeTypeAdapter$GsonContextImpl = new TreeTypeAdapter$GsonContextImpl(this, null);
        this.serializer = jsonSerializer;
        this.deserializer = jsonDeserializer;
        this.gson = gson;
        this.typeToken = typeToken;
        this.skipPast = typeAdapterFactory;
        this.nullSafe = bl2;
    }

    private TypeAdapter delegate() {
        Object object = this.delegate;
        if (object == null) {
            object = this.gson;
            TypeAdapterFactory typeAdapterFactory = this.skipPast;
            TypeToken typeToken = this.typeToken;
            this.delegate = object = ((Gson)object).getDelegateAdapter(typeAdapterFactory, typeToken);
        }
        return object;
    }

    public static TypeAdapterFactory newFactory(TypeToken typeToken, Object object) {
        TreeTypeAdapter$SingleTypeFactory treeTypeAdapter$SingleTypeFactory = new TreeTypeAdapter$SingleTypeFactory(object, typeToken, false, null);
        return treeTypeAdapter$SingleTypeFactory;
    }

    public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken typeToken, Object object) {
        boolean bl2;
        Object object2;
        Type type2 = typeToken.getType();
        if (type2 == (object2 = typeToken.getRawType())) {
            bl2 = true;
        } else {
            bl2 = false;
            type2 = null;
        }
        object2 = new TreeTypeAdapter$SingleTypeFactory(object, typeToken, bl2, null);
        return object2;
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class clazz, Object object) {
        TreeTypeAdapter$SingleTypeFactory treeTypeAdapter$SingleTypeFactory = new TreeTypeAdapter$SingleTypeFactory(object, null, false, clazz);
        return treeTypeAdapter$SingleTypeFactory;
    }

    public TypeAdapter getSerializationDelegate() {
        Object object = this.serializer;
        object = object != null ? this : this.delegate();
        return object;
    }

    public Object read(JsonReader object) {
        JsonDeserializer jsonDeserializer = this.deserializer;
        if (jsonDeserializer == null) {
            return this.delegate().read((JsonReader)object);
        }
        object = Streams.parse((JsonReader)object);
        boolean bl2 = this.nullSafe;
        if (bl2 && (bl2 = ((JsonElement)object).isJsonNull())) {
            return null;
        }
        jsonDeserializer = this.deserializer;
        Type type2 = this.typeToken.getType();
        TreeTypeAdapter$GsonContextImpl treeTypeAdapter$GsonContextImpl = this.context;
        return jsonDeserializer.deserialize((JsonElement)object, type2, treeTypeAdapter$GsonContextImpl);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        JsonSerializer jsonSerializer = this.serializer;
        if (jsonSerializer == null) {
            this.delegate().write(jsonWriter, object);
            return;
        }
        boolean bl2 = this.nullSafe;
        if (bl2 && object == null) {
            jsonWriter.nullValue();
            return;
        }
        Type type2 = this.typeToken.getType();
        TreeTypeAdapter$GsonContextImpl treeTypeAdapter$GsonContextImpl = this.context;
        Streams.write(jsonSerializer.serialize(object, type2, treeTypeAdapter$GsonContextImpl), jsonWriter);
    }
}

