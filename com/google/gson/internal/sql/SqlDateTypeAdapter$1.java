/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.sql.Date;

class SqlDateTypeAdapter$1
implements TypeAdapterFactory {
    public TypeAdapter create(Gson object, TypeToken object2) {
        object = ((TypeToken)object2).getRawType();
        object2 = Date.class;
        Object object3 = null;
        if (object == object2) {
            object3 = object = new SqlDateTypeAdapter(null);
        }
        return object3;
    }
}

