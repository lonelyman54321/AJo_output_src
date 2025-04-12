/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonParseException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;

final class ToNumberPolicy$3
extends ToNumberPolicy {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Number readNumber(JsonReader object) {
        CharSequence charSequence = "; at path ";
        String string2 = "JSON forbids NaN and infinities: ";
        String string3 = ((JsonReader)object).nextString();
        try {
            long l2 = Long.parseLong(string3);
            return l2;
        }
        catch (NumberFormatException numberFormatException) {
            NumberFormatException numberFormatException22;
            block6: {
                Double d2;
                block5: {
                    boolean bl2;
                    try {
                        d2 = Double.valueOf(string3);
                        bl2 = d2.isInfinite();
                        if (!bl2 && !(bl2 = d2.isNaN())) break block5;
                    }
                    catch (NumberFormatException numberFormatException22) {
                        break block6;
                    }
                    bl2 = ((JsonReader)object).isLenient();
                    if (!bl2) {
                        StringBuilder stringBuilder = new StringBuilder(string2);
                        stringBuilder.append(d2);
                        stringBuilder.append((String)charSequence);
                        string2 = ((JsonReader)object).getPreviousPath();
                        stringBuilder.append(string2);
                        string2 = stringBuilder.toString();
                        MalformedJsonException malformedJsonException = new MalformedJsonException(string2);
                        throw malformedJsonException;
                    }
                }
                return d2;
            }
            charSequence = Gn.a("Cannot parse ", string3, (String)charSequence);
            object = ((JsonReader)object).getPreviousPath();
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            JsonParseException jsonParseException = new JsonParseException((String)object, numberFormatException22);
            throw jsonParseException;
        }
    }
}

