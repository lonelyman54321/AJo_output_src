/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.reflect.TypeToken;

class NumberTypeAdapter$1
implements TypeAdapterFactory {
    final /* synthetic */ NumberTypeAdapter val$adapter;

    public NumberTypeAdapter$1(NumberTypeAdapter numberTypeAdapter) {
        this.val$adapter = numberTypeAdapter;
    }

    public TypeAdapter create(Gson object, TypeToken object2) {
        object = ((TypeToken)object2).getRawType();
        object = object == (object2 = Number.class) ? this.val$adapter : null;
        return object;
    }
}

