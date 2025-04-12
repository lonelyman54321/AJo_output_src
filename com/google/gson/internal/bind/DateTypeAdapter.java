/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.DateTypeAdapter$1;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter
extends TypeAdapter {
    public static final TypeAdapterFactory FACTORY;
    private final List dateFormats;

    static {
        DateTypeAdapter$1 dateTypeAdapter$1 = new DateTypeAdapter$1();
        FACTORY = dateTypeAdapter$1;
    }

    public DateTypeAdapter() {
        ArrayList<Cloneable> arrayList;
        this.dateFormats = arrayList = new ArrayList<Cloneable>();
        Cloneable cloneable = Locale.US;
        int n3 = 2;
        Cloneable cloneable2 = DateFormat.getDateTimeInstance(n3, n3, cloneable);
        arrayList.add(cloneable2);
        cloneable2 = Locale.getDefault();
        boolean bl2 = ((Locale)cloneable2).equals(cloneable);
        if (!bl2) {
            cloneable = DateFormat.getDateTimeInstance(n3, n3);
            arrayList.add(cloneable);
        }
        if (bl2 = JavaVersion.isJava9OrLater()) {
            cloneable = PreJava9DateFormatProvider.getUSDateTimeFormat(n3, n3);
            arrayList.add(cloneable);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Date deserializeToDate(JsonReader object) {
        CharSequence charSequence = ((JsonReader)object).nextString();
        Object object2 = this.dateFormats;
        synchronized (object2) {
            try {
                Object object3 = this.dateFormats;
                object3 = object3.iterator();
                while (true) {
                    boolean bl2;
                    if (bl2 = object3.hasNext()) {
                        Object object4 = object3.next();
                        object4 = (DateFormat)object4;
                        return ((DateFormat)object4).parse((String)charSequence);
                    }
                    // MONITOREXIT @DISABLED, blocks:[0, 4, 8] lbl13 : MonitorExitStatement: MONITOREXIT : var3_4
                    try {
                        object3 = null;
                        object2 = new ParsePosition(0);
                        return ISO8601Utils.parse((String)charSequence, (ParsePosition)object2);
                    }
                    catch (ParseException parseException) {
                        charSequence = Gn.a("Failed parsing '", (String)charSequence, "' as Date; at path ");
                        object = ((JsonReader)object).getPreviousPath();
                        ((StringBuilder)charSequence).append((String)object);
                        object = ((StringBuilder)charSequence).toString();
                        object3 = new JsonSyntaxException((String)object, parseException);
                        throw object3;
                    }
                    catch (ParseException parseException) {
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Date read(JsonReader jsonReader) {
        JsonToken jsonToken;
        JsonToken jsonToken2 = jsonReader.peek();
        if (jsonToken2 == (jsonToken = JsonToken.NULL)) {
            jsonReader.nextNull();
            return null;
        }
        return this.deserializeToDate(jsonReader);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void write(JsonWriter jsonWriter, Date object) {
        if (object == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = (DateFormat)this.dateFormats.get(0);
        List list = this.dateFormats;
        synchronized (list) {
            object = dateFormat.format((Date)object);
        }
        jsonWriter.value((String)object);
    }
}

