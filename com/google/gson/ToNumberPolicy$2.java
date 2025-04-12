/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;

final class ToNumberPolicy$2
extends ToNumberPolicy {
    public Number readNumber(JsonReader object) {
        object = ((JsonReader)object).nextString();
        LazilyParsedNumber lazilyParsedNumber = new LazilyParsedNumber((String)object);
        return lazilyParsedNumber;
    }
}

