/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter$1;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

class SqlTimestampTypeAdapter
extends TypeAdapter {
    static final TypeAdapterFactory FACTORY;
    private final TypeAdapter dateTypeAdapter;

    static {
        SqlTimestampTypeAdapter$1 sqlTimestampTypeAdapter$1 = new SqlTimestampTypeAdapter$1();
        FACTORY = sqlTimestampTypeAdapter$1;
    }

    private SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.dateTypeAdapter = typeAdapter;
    }

    public /* synthetic */ SqlTimestampTypeAdapter(TypeAdapter typeAdapter, SqlTimestampTypeAdapter$1 sqlTimestampTypeAdapter$1) {
        this(typeAdapter);
    }

    public Timestamp read(JsonReader object) {
        Object object2 = this.dateTypeAdapter;
        if ((object = (Date)((TypeAdapter)object2).read((JsonReader)object)) != null) {
            long l2 = ((Date)object).getTime();
            object2 = new Timestamp(l2);
        } else {
            object2 = null;
        }
        return object2;
    }

    public void write(JsonWriter jsonWriter, Timestamp timestamp) {
        this.dateTypeAdapter.write(jsonWriter, timestamp);
    }
}

