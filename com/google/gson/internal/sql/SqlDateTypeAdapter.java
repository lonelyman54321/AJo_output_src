/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.sql.SqlDateTypeAdapter$1;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

final class SqlDateTypeAdapter
extends TypeAdapter {
    static final TypeAdapterFactory FACTORY;
    private final DateFormat format;

    static {
        SqlDateTypeAdapter$1 sqlDateTypeAdapter$1 = new SqlDateTypeAdapter$1();
        FACTORY = sqlDateTypeAdapter$1;
    }

    private SqlDateTypeAdapter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, yyyy");
        this.format = simpleDateFormat;
    }

    public /* synthetic */ SqlDateTypeAdapter(SqlDateTypeAdapter$1 sqlDateTypeAdapter$1) {
        this();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public java.sql.Date read(JsonReader object) {
        Object object2;
        Object object3 = ((JsonReader)object).peek();
        if (object3 == (object2 = JsonToken.NULL)) {
            ((JsonReader)object).nextNull();
            return null;
        }
        object3 = ((JsonReader)object).nextString();
        try {
            synchronized (this) {
                object2 = this.format;
            }
        }
        catch (ParseException parseException) {
            object3 = Gn.a("Failed parsing '", (String)object3, "' as SQL Date; at path ");
            object = ((JsonReader)object).getPreviousPath();
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            JsonSyntaxException jsonSyntaxException = new JsonSyntaxException((String)object, parseException);
            throw jsonSyntaxException;
        }
        {
            object2 = ((DateFormat)object2).parse((String)object3);
        }
        {
            long l2 = ((Date)object2).getTime();
            return new java.sql.Date(l2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void write(JsonWriter jsonWriter, java.sql.Date object) {
        if (object == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            DateFormat dateFormat = this.format;
            object = dateFormat.format((Date)object);
        }
        jsonWriter.value((String)object);
    }
}

