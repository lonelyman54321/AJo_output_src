/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.reflect.TypeToken;

class ObjectTypeAdapter$1
implements TypeAdapterFactory {
    final /* synthetic */ ToNumberStrategy val$toNumberStrategy;

    public ObjectTypeAdapter$1(ToNumberStrategy toNumberStrategy) {
        this.val$toNumberStrategy = toNumberStrategy;
    }

    public TypeAdapter create(Gson gson, TypeToken object) {
        Object object2;
        if ((object = ((TypeToken)object).getRawType()) == (object2 = Object.class)) {
            object2 = this.val$toNumberStrategy;
            object = new ObjectTypeAdapter(gson, (ToNumberStrategy)object2, null);
            return object;
        }
        return null;
    }
}

