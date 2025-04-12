/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter$1;
import com.google.gson.internal.bind.NumberTypeAdapter$2;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public final class NumberTypeAdapter
extends TypeAdapter {
    private static final TypeAdapterFactory LAZILY_PARSED_NUMBER_FACTORY = NumberTypeAdapter.newFactory(ToNumberPolicy.LAZILY_PARSED_NUMBER);
    private final ToNumberStrategy toNumberStrategy;

    private NumberTypeAdapter(ToNumberStrategy toNumberStrategy) {
        this.toNumberStrategy = toNumberStrategy;
    }

    public static TypeAdapterFactory getFactory(ToNumberStrategy toNumberStrategy) {
        ToNumberPolicy toNumberPolicy = ToNumberPolicy.LAZILY_PARSED_NUMBER;
        if (toNumberStrategy == toNumberPolicy) {
            return LAZILY_PARSED_NUMBER_FACTORY;
        }
        return NumberTypeAdapter.newFactory(toNumberStrategy);
    }

    private static TypeAdapterFactory newFactory(ToNumberStrategy object) {
        NumberTypeAdapter numberTypeAdapter = new NumberTypeAdapter((ToNumberStrategy)object);
        object = new NumberTypeAdapter$1(numberTypeAdapter);
        return object;
    }

    public Number read(JsonReader object) {
        JsonToken jsonToken = ((JsonReader)object).peek();
        Object object2 = NumberTypeAdapter$2.$SwitchMap$com$google$gson$stream$JsonToken;
        int n3 = jsonToken.ordinal();
        int n4 = object2[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3 && n4 != (n3 = 3)) {
                object2 = new JsonSyntaxException;
                StringBuilder stringBuilder = new StringBuilder("Expecting number, got: ");
                stringBuilder.append((Object)jsonToken);
                stringBuilder.append("; at path ");
                object = ((JsonReader)object).getPath();
                stringBuilder.append((String)object);
                object = stringBuilder.toString();
                object2((String)object);
                throw object2;
            }
            return this.toNumberStrategy.readNumber((JsonReader)object);
        }
        ((JsonReader)object).nextNull();
        return null;
    }

    public void write(JsonWriter jsonWriter, Number number) {
        jsonWriter.value(number);
    }
}

