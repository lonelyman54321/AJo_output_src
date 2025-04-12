/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter;
import com.google.gson.reflect.TypeToken;

class TypeAdapters$29
implements TypeAdapterFactory {
    public TypeAdapter create(Gson clazz, TypeToken clazz2) {
        clazz2 = Enum.class;
        clazz = ((TypeToken)((Object)clazz2)).getRawType();
        boolean bl2 = clazz2.isAssignableFrom(clazz);
        if (bl2 && clazz != clazz2) {
            boolean bl3 = clazz.isEnum();
            if (!bl3) {
                clazz = clazz.getSuperclass();
            }
            clazz2 = new TypeAdapters$EnumTypeAdapter(clazz);
            return clazz2;
        }
        return null;
    }
}

