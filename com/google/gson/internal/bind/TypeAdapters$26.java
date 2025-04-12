/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

class TypeAdapters$26
extends TypeAdapter {
    private static final String DAY_OF_MONTH = "dayOfMonth";
    private static final String HOUR_OF_DAY = "hourOfDay";
    private static final String MINUTE = "minute";
    private static final String MONTH = "month";
    private static final String SECOND = "second";
    private static final String YEAR = "year";

    public Calendar read(JsonReader object) {
        Object object2;
        Object object3 = ((JsonReader)object).peek();
        if (object3 == (object2 = JsonToken.NULL)) {
            ((JsonReader)object).nextNull();
            return null;
        }
        ((JsonReader)object).beginObject();
        boolean bl2 = false;
        object3 = null;
        int n3 = 0;
        int n4 = 0;
        int n7 = 0;
        int n8 = 0;
        int n10 = 0;
        int n14 = 0;
        while ((object3 = ((JsonReader)object).peek()) != (object2 = JsonToken.END_OBJECT)) {
            object3 = ((JsonReader)object).nextName();
            int n15 = ((JsonReader)object).nextInt();
            String string2 = YEAR;
            boolean bl3 = string2.equals(object3);
            if (bl3) {
                n3 = n15;
                continue;
            }
            string2 = MONTH;
            bl3 = string2.equals(object3);
            if (bl3) {
                n4 = n15;
                continue;
            }
            string2 = DAY_OF_MONTH;
            bl3 = string2.equals(object3);
            if (bl3) {
                n7 = n15;
                continue;
            }
            string2 = HOUR_OF_DAY;
            bl3 = string2.equals(object3);
            if (bl3) {
                n8 = n15;
                continue;
            }
            string2 = MINUTE;
            bl3 = string2.equals(object3);
            if (bl3) {
                n10 = n15;
                continue;
            }
            string2 = SECOND;
            bl2 = string2.equals(object3);
            if (!bl2) continue;
            n14 = n15;
        }
        ((JsonReader)object).endObject();
        object2 = object;
        object = new GregorianCalendar(n3, n4, n7, n8, n10, n14);
        return object;
    }

    public void write(JsonWriter jsonWriter, Calendar calendar) {
        if (calendar == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(YEAR);
        long l2 = calendar.get(1);
        jsonWriter.value(l2);
        jsonWriter.name(MONTH);
        l2 = calendar.get(2);
        jsonWriter.value(l2);
        jsonWriter.name(DAY_OF_MONTH);
        l2 = calendar.get(5);
        jsonWriter.value(l2);
        jsonWriter.name(HOUR_OF_DAY);
        l2 = calendar.get(11);
        jsonWriter.value(l2);
        jsonWriter.name(MINUTE);
        l2 = calendar.get(12);
        jsonWriter.value(l2);
        jsonWriter.name(SECOND);
        l2 = calendar.get(13);
        jsonWriter.value(l2);
        jsonWriter.endObject();
    }
}

