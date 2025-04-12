/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

class TypeAdapters$31
implements TypeAdapterFactory {
    final /* synthetic */ Class val$type;
    final /* synthetic */ TypeAdapter val$typeAdapter;

    public TypeAdapters$31(Class clazz, TypeAdapter typeAdapter) {
        this.val$type = clazz;
        this.val$typeAdapter = typeAdapter;
    }

    public TypeAdapter create(Gson object, TypeToken object2) {
        object = ((TypeToken)object2).getRawType();
        object = object == (object2 = this.val$type) ? this.val$typeAdapter : null;
        return object;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Factory[type=");
        Object object = this.val$type.getName();
        stringBuilder.append((String)object);
        stringBuilder.append(",adapter=");
        object = this.val$typeAdapter;
        stringBuilder.append(object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

