/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField;
import com.google.gson.stream.JsonReader;
import java.util.Map;

final class ReflectiveTypeAdapterFactory$FieldReflectionAdapter
extends ReflectiveTypeAdapterFactory$Adapter {
    private final ObjectConstructor constructor;

    public ReflectiveTypeAdapterFactory$FieldReflectionAdapter(ObjectConstructor objectConstructor, Map map2) {
        super(map2);
        this.constructor = objectConstructor;
    }

    public Object createAccumulator() {
        return this.constructor.construct();
    }

    public Object finalize(Object object) {
        return object;
    }

    public void readField(Object object, JsonReader jsonReader, ReflectiveTypeAdapterFactory$BoundField reflectiveTypeAdapterFactory$BoundField) {
        reflectiveTypeAdapterFactory$BoundField.readIntoField(jsonReader, object);
    }
}

