/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonParseException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;

final class ToNumberPolicy$4
extends ToNumberPolicy {
    public BigDecimal readNumber(JsonReader object) {
        CharSequence charSequence = ((JsonReader)object).nextString();
        try {
            BigDecimal bigDecimal = new BigDecimal((String)charSequence);
            return bigDecimal;
        }
        catch (NumberFormatException numberFormatException) {
            charSequence = Gn.a("Cannot parse ", (String)charSequence, "; at path ");
            object = ((JsonReader)object).getPreviousPath();
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            JsonParseException jsonParseException = new JsonParseException((String)object, numberFormatException);
            throw jsonParseException;
        }
    }
}

