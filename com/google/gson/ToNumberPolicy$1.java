/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonReader;

final class ToNumberPolicy$1
extends ToNumberPolicy {
    public Double readNumber(JsonReader jsonReader) {
        return jsonReader.nextDouble();
    }
}

