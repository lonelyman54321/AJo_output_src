/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.reflect.TypeToken;

public final class JsonAdapterAnnotationTypeAdapterFactory
implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        Object object = typeToken.getRawType();
        Class<JsonAdapter> clazz = JsonAdapter.class;
        if ((object = ((Class)object).getAnnotation(clazz)) == null) {
            return null;
        }
        clazz = this.constructorConstructor;
        return this.getTypeAdapter((ConstructorConstructor)((Object)clazz), gson, typeToken, (JsonAdapter)object);
    }

    public TypeAdapter getTypeAdapter(ConstructorConstructor object, Gson object2, TypeToken typeToken, JsonAdapter object3) {
        Object object4 = TypeToken.get(object3.value());
        object = ((ConstructorConstructor)object).get((TypeToken)object4).construct();
        boolean bl2 = object3.nullSafe();
        boolean bl3 = object instanceof TypeAdapter;
        if (bl3) {
            object = (TypeAdapter)object;
        } else {
            bl3 = object instanceof TypeAdapterFactory;
            if (bl3) {
                object = ((TypeAdapterFactory)object).create((Gson)object2, typeToken);
            } else {
                Object object5;
                boolean bl4;
                bl3 = object instanceof JsonSerializer;
                if (!bl3 && !(bl4 = object instanceof JsonDeserializer)) {
                    object3 = new StringBuilder("Invalid attempt to bind an instance of ");
                    object = object.getClass().getName();
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append(" as a @JsonAdapter for ");
                    object = typeToken.toString();
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                    object = ((StringBuilder)object3).toString();
                    object2 = new IllegalArgumentException((String)object);
                    throw object2;
                }
                bl4 = false;
                object4 = null;
                if (bl3) {
                    object3 = object;
                    object5 = object3 = (JsonSerializer)object;
                } else {
                    object5 = null;
                }
                bl3 = object instanceof JsonDeserializer;
                Object object6 = bl3 ? (object = (JsonDeserializer)object) : null;
                object4 = object;
                object = new TreeTypeAdapter((JsonSerializer)object5, (JsonDeserializer)object6, (Gson)object2, typeToken, null, bl2);
                bl2 = false;
            }
        }
        if (object != null && bl2) {
            object = ((TypeAdapter)object).nullSafe();
        }
        return object;
    }
}

