/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.sql.Time;

class SqlTimeTypeAdapter$1
implements TypeAdapterFactory {
    public TypeAdapter create(Gson object, TypeToken object2) {
        object = ((TypeToken)object2).getRawType();
        object2 = Time.class;
        Object object3 = null;
        if (object == object2) {
            object3 = object = new SqlTimeTypeAdapter(null);
        }
        return object3;
    }
}

