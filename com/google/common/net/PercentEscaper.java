/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.net;

import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;

public final class PercentEscaper
extends UnicodeEscaper {
    private static final char[] PLUS_SIGN;
    private static final char[] UPPER_HEX_DIGITS;
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    static {
        char[] cArray = new char[]{'+'};
        PLUS_SIGN = cArray;
        UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();
    }

    public PercentEscaper(String object, boolean bl2) {
        Preconditions.checkNotNull(object);
        String string2 = ".*[0-9A-Za-z].*";
        boolean bl3 = ((String)object).matches(string2);
        if (!bl3) {
            string2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            object = ((String)object).concat(string2);
            if (bl2 && (bl3 = ((String)object).contains(string2 = " "))) {
                object = new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
                throw object;
            }
            this.plusForSpace = bl2;
            object = PercentEscaper.createSafeOctets((String)object);
            this.safeOctets = (boolean[])object;
            return;
        }
        object = new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        throw object;
    }

    private static boolean[] createSafeOctets(String object) {
        Object object2;
        int n3;
        object = ((String)object).toCharArray();
        int n4 = ((Object)object).length;
        int n7 = -1;
        int n8 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            object2 = object[n3];
            n7 = Math.max((int)object2, n7);
        }
        n4 = 1;
        boolean[] blArray = new boolean[n7 += n4];
        n3 = ((Object)object).length;
        while (n8 < n3) {
            object2 = object[n8];
            blArray[object2] = n4;
            ++n8;
        }
        return blArray;
    }

    public String escape(String string2) {
        Preconditions.checkNotNull(string2);
        int n3 = string2.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean[] blArray;
            int n4;
            char c2 = string2.charAt(i3);
            if (c2 < (n4 = (blArray = this.safeOctets).length) && (c2 = blArray[c2]) != '\u0000') {
                continue;
            }
            string2 = this.escapeSlow(string2, i3);
            break;
        }
        return string2;
    }

    public char[] escape(int n3) {
        int n4;
        Object object = this.safeOctets;
        int n7 = ((boolean[])object).length;
        if (n3 < n7 && (n4 = object[n3]) != 0) {
            return null;
        }
        n4 = 32;
        if (n3 == n4 && (n4 = (int)(this.plusForSpace ? 1 : 0)) != 0) {
            return PLUS_SIGN;
        }
        n4 = 127;
        n7 = 1;
        int n8 = 2;
        int n10 = 0;
        char[] cArray = null;
        int n14 = 4;
        int n15 = 37;
        int n16 = 3;
        if (n3 <= n4) {
            object = new char[n16];
            object[0] = n15;
            cArray = UPPER_HEX_DIGITS;
            n15 = n3 & 0xF;
            object[n8] = n15 = cArray[n15];
            n3 >>>= n14;
            object[n7] = n3 = cArray[n3];
            return object;
        }
        n4 = 2047;
        int n17 = 5;
        int n18 = 12;
        int n19 = 10;
        int n20 = 6;
        int n21 = 8;
        if (n3 <= n4) {
            object = new char[n20];
            object[0] = n15;
            object[n16] = n15;
            cArray = UPPER_HEX_DIGITS;
            n15 = n3 & 0xF;
            object[n17] = n15 = cArray[n15];
            n15 = n3 >>> 4 & n16 | n21;
            object[n14] = n15 = cArray[n15];
            n14 = n3 >>> 6 & 0xF;
            object[n8] = n14 = cArray[n14];
            n3 = n3 >>> n19 | n18;
            object[n7] = n3 = cArray[n3];
            return object;
        }
        n4 = (char)-1;
        int n22 = 9;
        int n24 = 7;
        if (n3 <= n4) {
            object = new char[n22];
            object[0] = n15;
            object[n7] = 69;
            object[n16] = n15;
            object[n20] = n15;
            char[] cArray2 = UPPER_HEX_DIGITS;
            n10 = n3 & 0xF;
            object[n21] = n10 = cArray2[n10];
            n10 = n3 >>> 4 & n16 | n21;
            object[n24] = n10 = cArray2[n10];
            n10 = n3 >>> 6 & 0xF;
            object[n17] = n10 = cArray2[n10];
            n10 = n3 >>> 10 & n16 | n21;
            object[n14] = n10 = cArray2[n10];
            n3 >>>= n18;
            object[n8] = n3 = cArray2[n3];
            return object;
        }
        n4 = 0x10FFFF;
        if (n3 <= n4) {
            object = new char[n18];
            object[0] = n15;
            object[n7] = 70;
            object[n16] = n15;
            object[n20] = n15;
            object[n22] = n15;
            char[] cArray3 = UPPER_HEX_DIGITS;
            n10 = n3 & 0xF;
            object[11] = n10 = cArray3[n10];
            n10 = n3 >>> 4 & n16 | n21;
            object[n19] = n10 = cArray3[n10];
            n10 = n3 >>> 6 & 0xF;
            object[n21] = n10 = cArray3[n10];
            n10 = n3 >>> 10 & n16 | n21;
            object[n24] = n10 = cArray3[n10];
            n10 = n3 >>> 12 & 0xF;
            object[n17] = n10 = cArray3[n10];
            n10 = n3 >>> 16 & n16 | n21;
            object[n14] = n10 = cArray3[n10];
            n3 = n3 >>> 18 & n24;
            object[n8] = n3 = cArray3[n3];
            return object;
        }
        object = new IllegalArgumentException;
        String string2 = hj0_0.a(n3, "Invalid unicode character value ");
        object(string2);
        throw object;
    }

    public int nextEscapeIndex(CharSequence charSequence, int n3, int n4) {
        boolean[] blArray;
        int n7;
        char c2;
        Preconditions.checkNotNull(charSequence);
        while (n3 < n4 && (c2 = charSequence.charAt(n3)) < (n7 = (blArray = this.safeOctets).length) && (c2 = blArray[c2]) != '\u0000') {
            ++n3;
        }
        return n3;
    }
}

