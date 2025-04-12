/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.sql.SqlTimeTypeAdapter$1;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

final class SqlTimeTypeAdapter
extends TypeAdapter {
    static final TypeAdapterFactory FACTORY;
    private final DateFormat format;

    static {
        SqlTimeTypeAdapter$1 sqlTimeTypeAdapter$1 = new SqlTimeTypeAdapter$1();
        FACTORY = sqlTimeTypeAdapter$1;
    }

    private SqlTimeTypeAdapter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss a");
        this.format = simpleDateFormat;
    }

    public /* synthetic */ SqlTimeTypeAdapter(SqlTimeTypeAdapter$1 sqlTimeTypeAdapter$1) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Time read(JsonReader object) {
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
            object3 = Gn.a("Failed parsing '", (String)object3, "' as SQL Time; at path ");
            object = ((JsonReader)object).getPreviousPath();
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            JsonSyntaxException jsonSyntaxException = new JsonSyntaxException((String)object, parseException);
            throw jsonSyntaxException;
        }
        {
            object2 = ((DateFormat)object2).parse((String)object3);
            long l2 = ((Date)object2).getTime();
            return new Time(l2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void write(JsonWriter jsonWriter, Time object) {
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

