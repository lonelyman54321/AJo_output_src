/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class TypeAdapters$6
extends TypeAdapter {
    public Number read(JsonReader object) {
        int n3;
        Object object2;
        Object object3 = ((JsonReader)object).peek();
        if (object3 == (object2 = JsonToken.NULL)) {
            ((JsonReader)object).nextNull();
            return null;
        }
        try {
            n3 = ((JsonReader)object).nextInt();
        }
        catch (NumberFormatException numberFormatException) {
            object3 = new JsonSyntaxException(numberFormatException);
            throw object3;
        }
        int n4 = -1;
        if (n3 <= n4 && n3 >= (n4 = Short.MIN_VALUE)) {
            return (short)n3;
        }
        object3 = wk0_0.a(n3, "Lossy conversion from ", " to short; at path ");
        object = ((JsonReader)object).getPreviousPath();
        ((StringBuilder)object3).append((String)object);
        object = ((StringBuilder)object3).toString();
        object2 = new JsonSyntaxException((String)object);
        throw object2;
    }

    public void write(JsonWriter jsonWriter, Number number) {
        if (number == null) {
            jsonWriter.nullValue();
        } else {
            short s7 = number.shortValue();
            long l2 = s7;
            jsonWriter.value(l2);
        }
    }
}

