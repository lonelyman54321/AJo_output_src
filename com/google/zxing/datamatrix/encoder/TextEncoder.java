/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

import com.google.zxing.datamatrix.encoder.C40Encoder;

final class TextEncoder
extends C40Encoder {
    public int encodeChar(char c2, StringBuilder stringBuilder) {
        int n3;
        char c3 = '\u0001';
        char c5 = ' ';
        if (c2 == c5) {
            stringBuilder.append('\u0003');
            return c3;
        }
        char c6 = '0';
        if (c2 >= c6 && c2 <= (c6 = '9')) {
            c2 = (char)(c2 + -44);
            stringBuilder.append(c2);
            return c3;
        }
        c6 = 'a';
        if (c2 >= c6 && c2 <= (c6 = 'z')) {
            c2 = (char)(c2 + -83);
            stringBuilder.append(c2);
            return c3;
        }
        c6 = '\u0002';
        if (c2 < c5) {
            stringBuilder.append('\u0000');
            stringBuilder.append(c2);
            return c6;
        }
        c5 = '!';
        if (c2 >= c5 && c2 <= (n3 = 47)) {
            stringBuilder.append(c3);
            c2 = (char)(c2 - c5);
            stringBuilder.append(c2);
            return c6;
        }
        c5 = ':';
        n3 = 64;
        if (c2 >= c5 && c2 <= n3) {
            stringBuilder.append(c3);
            c2 = (char)(c2 + -43);
            stringBuilder.append(c2);
            return c6;
        }
        c5 = '[';
        if (c2 >= c5 && c2 <= (c5 = '_')) {
            stringBuilder.append(c3);
            c2 = (char)(c2 + -69);
            stringBuilder.append(c2);
            return c6;
        }
        c3 = '`';
        if (c2 == c3) {
            stringBuilder.append(c6);
            c2 = (char)(c2 - c3);
            stringBuilder.append(c2);
            return c6;
        }
        c5 = 'A';
        if (c2 >= c5 && c2 <= (c5 = 'Z')) {
            stringBuilder.append(c6);
            c2 = (char)(c2 - n3);
            stringBuilder.append(c2);
            return c6;
        }
        c5 = '{';
        if (c2 >= c5 && c2 <= (c5 = '\u007f')) {
            stringBuilder.append(c6);
            c2 = (char)(c2 - c3);
            stringBuilder.append(c2);
            return c6;
        }
        stringBuilder.append("\u0001\u001e");
        c2 = (char)(c2 + -128);
        return this.encodeChar(c2, stringBuilder) + c6;
    }

    public int getEncodingMode() {
        return 2;
    }
}

