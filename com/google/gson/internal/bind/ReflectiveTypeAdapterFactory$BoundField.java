/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;

abstract class ReflectiveTypeAdapterFactory$BoundField {
    final boolean deserialized;
    final Field field;
    final String fieldName;
    final String name;
    final boolean serialized;

    public ReflectiveTypeAdapterFactory$BoundField(String string2, Field field, boolean bl2, boolean bl3) {
        this.name = string2;
        this.field = field;
        this.fieldName = string2 = field.getName();
        this.serialized = bl2;
        this.deserialized = bl3;
    }

    public abstract void readIntoArray(JsonReader var1, int var2, Object[] var3);

    public abstract void readIntoField(JsonReader var1, Object var2);

    public abstract void write(JsonWriter var1, Object var2);
}

