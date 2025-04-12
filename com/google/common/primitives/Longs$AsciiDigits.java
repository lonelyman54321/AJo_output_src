/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import java.util.Arrays;

final class Longs$AsciiDigits {
    private static final byte[] asciiDigits;

    static {
        int n3;
        int n4;
        int n7 = 128;
        byte[] byArray = new byte[n7];
        Arrays.fill(byArray, (byte)-1);
        int n8 = 0;
        for (n4 = 0; n4 < (n3 = 10); ++n4) {
            byte by2;
            n3 = n4 + 48;
            byArray[n3] = by2 = (byte)n4;
        }
        while (n8 < (n4 = 26)) {
            n4 = n8 + 65;
            byArray[n4] = n3 = (int)((byte)(n8 + 10));
            n4 = n8 + 97;
            byArray[n4] = n3;
            ++n8;
        }
        asciiDigits = byArray;
    }

    private Longs$AsciiDigits() {
    }

    public static int digit(char c2) {
        char c3 = '\u0080';
        if (c2 < c3) {
            byte[] byArray = asciiDigits;
            c2 = byArray[c2];
        } else {
            c2 = (char)-1;
        }
        return c2;
    }
}

