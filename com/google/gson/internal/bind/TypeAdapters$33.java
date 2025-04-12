/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

class TypeAdapters$33
implements TypeAdapterFactory {
    final /* synthetic */ Class val$base;
    final /* synthetic */ Class val$sub;
    final /* synthetic */ TypeAdapter val$typeAdapter;

    public TypeAdapters$33(Class clazz, Class clazz2, TypeAdapter typeAdapter) {
        this.val$base = clazz;
        this.val$sub = clazz2;
        this.val$typeAdapter = typeAdapter;
    }

    public TypeAdapter create(Gson object, TypeToken object2) {
        object = ((TypeToken)object2).getRawType();
        object = object != (object2 = this.val$base) && object != (object2 = this.val$sub) ? null : this.val$typeAdapter;
        return object;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Factory[type=");
        Object object = this.val$base.getName();
        stringBuilder.append((String)object);
        stringBuilder.append("+");
        object = this.val$sub.getName();
        stringBuilder.append((String)object);
        stringBuilder.append(",adapter=");
        object = this.val$typeAdapter;
        stringBuilder.append(object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

