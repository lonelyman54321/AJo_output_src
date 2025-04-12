/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.escape;

import com.google.common.escape.CharEscaper;

class CharEscaperBuilder$CharArrayDecorator
extends CharEscaper {
    private final int replaceLength;
    private final char[][] replacements;

    public CharEscaperBuilder$CharArrayDecorator(char[][] cArray) {
        int n3;
        this.replacements = cArray;
        this.replaceLength = n3 = cArray.length;
    }

    public String escape(String string2) {
        int n3 = string2.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            char[] cArray;
            char[][] cArray2;
            int n4;
            char c2 = string2.charAt(i3);
            if (c2 >= (n4 = (cArray2 = this.replacements).length) || (cArray = cArray2[c2]) == null) continue;
            return this.escapeSlow(string2, i3);
        }
        return string2;
    }

    public char[] escape(char c2) {
        char[] cArray;
        int n3 = this.replaceLength;
        if (c2 < n3) {
            char[][] cArray2 = this.replacements;
            cArray = cArray2[c2];
        } else {
            c2 = '\u0000';
            cArray = null;
        }
        return cArray;
    }
}

