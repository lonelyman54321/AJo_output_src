/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

final class ParseRequest {
    final int radix;
    final String rawValue;

    private ParseRequest(String string2, int n3) {
        this.rawValue = string2;
        this.radix = n3;
    }

    public static ParseRequest fromString(String object) {
        int n3 = ((String)object).length();
        if (n3 != 0) {
            boolean bl2;
            ParseRequest parseRequest = null;
            n3 = ((String)object).charAt(0);
            String string2 = "0x";
            boolean n4 = ((String)object).startsWith(string2);
            int n7 = 16;
            if (!n4 && !(bl2 = ((String)object).startsWith(string2 = "0X"))) {
                int n8 = 35;
                int n10 = 1;
                if (n3 == n8) {
                    object = ((String)object).substring(n10);
                } else {
                    int n14 = 48;
                    if (n3 == n14 && (n3 = ((String)object).length()) > n10) {
                        object = ((String)object).substring(n10);
                        n7 = 8;
                    } else {
                        n7 = 10;
                    }
                }
            } else {
                n3 = 2;
                object = ((String)object).substring(n3);
            }
            parseRequest = new ParseRequest((String)object, n7);
            return parseRequest;
        }
        object = new NumberFormatException("empty string");
        throw object;
    }
}

