/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.escape;

import com.google.common.base.Preconditions;
import com.google.common.escape.Escaper;
import com.google.common.escape.Platform;

public abstract class CharEscaper
extends Escaper {
    private static final int DEST_PAD_MULTIPLIER = 2;

    private static char[] growBuffer(char[] object, int n3, int n4) {
        if (n4 >= 0) {
            char[] cArray = new char[n4];
            if (n3 > 0) {
                System.arraycopy(object, 0, cArray, 0, n3);
            }
            return cArray;
        }
        object = new AssertionError;
        object((Object)"Cannot increase internal buffer any further");
        throw object;
    }

    public String escape(String string2) {
        Preconditions.checkNotNull(string2);
        int n3 = string2.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2 = string2.charAt(i3);
            char[] cArray = this.escape(c2);
            if (cArray == null) continue;
            return this.escapeSlow(string2, i3);
        }
        return string2;
    }

    public abstract char[] escape(char var1);

    public final String escapeSlow(String string2, int n3) {
        int n4 = string2.length();
        char[] cArray = Platform.charBufferFromThreadLocal();
        int n7 = cArray.length;
        int n8 = 0;
        int n10 = 0;
        while (n3 < n4) {
            char c2 = string2.charAt(n3);
            char[] cArray2 = this.escape(c2);
            if (cArray2 != null) {
                int n14 = n3 - n8;
                int n15 = n10 + n14;
                int n16 = cArray2.length;
                int n17 = n15 + n16;
                if (n7 < n17) {
                    n7 = (n4 - n3) * 2 + n17;
                    cArray = CharEscaper.growBuffer(cArray, n10, n7);
                }
                if (n14 > 0) {
                    string2.getChars(n8, n3, cArray, n10);
                    n10 = n15;
                }
                if (n16 > 0) {
                    System.arraycopy(cArray2, 0, cArray, n10, n16);
                    n10 += n16;
                }
                n8 = n3 + 1;
            }
            ++n3;
        }
        n3 = n4 - n8;
        if (n3 > 0) {
            if (n7 < (n3 += n10)) {
                cArray = CharEscaper.growBuffer(cArray, n10, n3);
            }
            string2.getChars(n8, n4, cArray, n10);
            n10 = n3;
        }
        string2 = new String(cArray, 0, n10);
        return string2;
    }
}

