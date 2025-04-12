/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

class TypeAdapters$32
implements TypeAdapterFactory {
    final /* synthetic */ Class val$boxed;
    final /* synthetic */ TypeAdapter val$typeAdapter;
    final /* synthetic */ Class val$unboxed;

    public TypeAdapters$32(Class clazz, Class clazz2, TypeAdapter typeAdapter) {
        this.val$unboxed = clazz;
        this.val$boxed = clazz2;
        this.val$typeAdapter = typeAdapter;
    }

    public TypeAdapter create(Gson object, TypeToken object2) {
        object = ((TypeToken)object2).getRawType();
        object = object != (object2 = this.val$unboxed) && object != (object2 = this.val$boxed) ? null : this.val$typeAdapter;
        return object;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Factory[type=");
        Object object = this.val$boxed.getName();
        stringBuilder.append((String)object);
        stringBuilder.append("+");
        object = this.val$unboxed.getName();
        stringBuilder.append((String)object);
        stringBuilder.append(",adapter=");
        object = this.val$typeAdapter;
        stringBuilder.append(object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

