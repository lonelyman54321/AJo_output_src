/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;

class SqlTimestampTypeAdapter$1
implements TypeAdapterFactory {
    public TypeAdapter create(Gson object, TypeToken object2) {
        Class<Timestamp> clazz;
        if ((object2 = ((TypeToken)object2).getRawType()) == (clazz = Timestamp.class)) {
            object = ((Gson)object).getAdapter(Date.class);
            object2 = new SqlTimestampTypeAdapter((TypeAdapter)object, null);
            return object2;
        }
        return null;
    }
}

