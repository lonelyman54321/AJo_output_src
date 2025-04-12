/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.Currency;

class TypeAdapters$25
extends TypeAdapter {
    public Currency read(JsonReader object) {
        CharSequence charSequence = ((JsonReader)object).nextString();
        try {
            return Currency.getInstance((String)charSequence);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            charSequence = Gn.a("Failed parsing '", (String)charSequence, "' as Currency; at path ");
            object = ((JsonReader)object).getPreviousPath();
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            JsonSyntaxException jsonSyntaxException = new JsonSyntaxException((String)object, illegalArgumentException);
            throw jsonSyntaxException;
        }
    }

    public void write(JsonWriter jsonWriter, Currency object) {
        object = ((Currency)object).getCurrencyCode();
        jsonWriter.value((String)object);
    }
}

