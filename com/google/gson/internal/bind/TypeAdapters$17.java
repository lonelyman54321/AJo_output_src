/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.math.BigInteger;

class TypeAdapters$17
extends TypeAdapter {
    public BigInteger read(JsonReader object) {
        Object object2;
        Object object3 = ((JsonReader)object).peek();
        if (object3 == (object2 = JsonToken.NULL)) {
            ((JsonReader)object).nextNull();
            return null;
        }
        object3 = ((JsonReader)object).nextString();
        try {
            object2 = new BigInteger((String)object3);
            return object2;
        }
        catch (NumberFormatException numberFormatException) {
            object3 = Gn.a("Failed parsing '", (String)object3, "' as BigInteger; at path ");
            object = ((JsonReader)object).getPreviousPath();
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            JsonSyntaxException jsonSyntaxException = new JsonSyntaxException((String)object, numberFormatException);
            throw jsonSyntaxException;
        }
    }

    public void write(JsonWriter jsonWriter, BigInteger bigInteger) {
        jsonWriter.value(bigInteger);
    }
}

