/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResultType;

public abstract class ParsedResult {
    private final ParsedResultType type;

    public ParsedResult(ParsedResultType parsedResultType) {
        this.type = parsedResultType;
    }

    public static void maybeAppend(String string2, StringBuilder stringBuilder) {
        int n3;
        if (string2 != null && (n3 = string2.isEmpty()) == 0) {
            n3 = stringBuilder.length();
            if (n3 > 0) {
                n3 = 10;
                stringBuilder.append((char)n3);
            }
            stringBuilder.append(string2);
        }
    }

    public static void maybeAppend(String[] stringArray, StringBuilder stringBuilder) {
        if (stringArray != null) {
            for (String string2 : stringArray) {
                ParsedResult.maybeAppend(string2, stringBuilder);
            }
        }
    }

    public abstract String getDisplayResult();

    public final ParsedResultType getType() {
        return this.type;
    }

    public final String toString() {
        return this.getDisplayResult();
    }
}

