/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.DefaultDateTypeAdapter$1;
import com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class DefaultDateTypeAdapter
extends TypeAdapter {
    private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final List dateFormats;
    private final DefaultDateTypeAdapter$DateType dateType;

    private DefaultDateTypeAdapter(DefaultDateTypeAdapter$DateType object, int n3) {
        ArrayList<Object> arrayList;
        this.dateFormats = arrayList = new ArrayList<Object>();
        Objects.requireNonNull(object);
        this.dateType = object;
        object = Locale.US;
        Cloneable cloneable = DateFormat.getDateInstance(n3, (Locale)object);
        arrayList.add(cloneable);
        cloneable = Locale.getDefault();
        boolean bl2 = ((Locale)cloneable).equals(object);
        if (!bl2) {
            object = DateFormat.getDateInstance(n3);
            arrayList.add(object);
        }
        if (bl2 = JavaVersion.isJava9OrLater()) {
            object = PreJava9DateFormatProvider.getUSDateFormat(n3);
            arrayList.add(object);
        }
    }

    private DefaultDateTypeAdapter(DefaultDateTypeAdapter$DateType object, int n3, int n4) {
        ArrayList<Object> arrayList;
        this.dateFormats = arrayList = new ArrayList<Object>();
        Objects.requireNonNull(object);
        this.dateType = object;
        object = Locale.US;
        Cloneable cloneable = DateFormat.getDateTimeInstance(n3, n4, (Locale)object);
        arrayList.add(cloneable);
        cloneable = Locale.getDefault();
        boolean bl2 = ((Locale)cloneable).equals(object);
        if (!bl2) {
            object = DateFormat.getDateTimeInstance(n3, n4);
            arrayList.add(object);
        }
        if (bl2 = JavaVersion.isJava9OrLater()) {
            object = PreJava9DateFormatProvider.getUSDateTimeFormat(n3, n4);
            arrayList.add(object);
        }
    }

    public /* synthetic */ DefaultDateTypeAdapter(DefaultDateTypeAdapter$DateType defaultDateTypeAdapter$DateType, int n3, int n4, DefaultDateTypeAdapter$1 defaultDateTypeAdapter$1) {
        this(defaultDateTypeAdapter$DateType, n3, n4);
    }

    public /* synthetic */ DefaultDateTypeAdapter(DefaultDateTypeAdapter$DateType defaultDateTypeAdapter$DateType, int n3, DefaultDateTypeAdapter$1 defaultDateTypeAdapter$1) {
        this(defaultDateTypeAdapter$DateType, n3);
    }

    private DefaultDateTypeAdapter(DefaultDateTypeAdapter$DateType object, String string2) {
        ArrayList<Object> arrayList;
        this.dateFormats = arrayList = new ArrayList<Object>();
        Objects.requireNonNull(object);
        this.dateType = object;
        Locale locale = Locale.US;
        object = new SimpleDateFormat(string2, locale);
        arrayList.add(object);
        object = Locale.getDefault();
        boolean bl2 = ((Locale)object).equals(locale);
        if (!bl2) {
            object = new SimpleDateFormat(string2);
            arrayList.add(object);
        }
    }

    public /* synthetic */ DefaultDateTypeAdapter(DefaultDateTypeAdapter$DateType defaultDateTypeAdapter$DateType, String string2, DefaultDateTypeAdapter$1 defaultDateTypeAdapter$1) {
        this(defaultDateTypeAdapter$DateType, string2);
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

    public Date read(JsonReader object) {
        JsonToken jsonToken;
        JsonToken jsonToken2 = ((JsonReader)object).peek();
        if (jsonToken2 == (jsonToken = JsonToken.NULL)) {
            ((JsonReader)object).nextNull();
            return null;
        }
        object = this.deserializeToDate((JsonReader)object);
        return this.dateType.deserialize((Date)object);
    }

    public String toString() {
        Object object = this.dateFormats;
        StringBuilder stringBuilder = null;
        object = (DateFormat)object.get(0);
        boolean bl2 = object instanceof SimpleDateFormat;
        char c2 = ')';
        String string2 = "DefaultDateTypeAdapter(";
        if (bl2) {
            stringBuilder = new StringBuilder(string2);
            object = ((SimpleDateFormat)object).toPattern();
            stringBuilder.append((String)object);
            stringBuilder.append(c2);
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder(string2);
        object = object.getClass().getSimpleName();
        stringBuilder.append((String)object);
        stringBuilder.append(c2);
        return stringBuilder.toString();
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

