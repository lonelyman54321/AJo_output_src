/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.escape;

import com.google.common.base.Preconditions;
import com.google.common.escape.Escaper;
import com.google.common.escape.Platform;

public abstract class UnicodeEscaper
extends Escaper {
    private static final int DEST_PAD = 32;

    public static int codePointAt(CharSequence object, int n3, int n4) {
        Preconditions.checkNotNull(object);
        if (n3 < n4) {
            char c2;
            int n7 = n3 + 1;
            char c3 = object.charAt(n3);
            if (c3 >= (c2 = '\ud800') && c3 <= (c2 = '\udfff')) {
                c2 = '\udbff';
                String string2 = "'";
                String string3 = " in '";
                String string4 = " at index ";
                String string5 = "' with value ";
                if (c3 <= c2) {
                    if (n7 == n4) {
                        return -c3;
                    }
                    n3 = object.charAt(n7);
                    n4 = (int)(Character.isLowSurrogate((char)n3) ? 1 : 0);
                    if (n4 != 0) {
                        return Character.toCodePoint(c3, (char)n3);
                    }
                    StringBuilder stringBuilder = new StringBuilder("Expected low surrogate but got char '");
                    stringBuilder.append((char)n3);
                    stringBuilder.append(string5);
                    stringBuilder.append(n3);
                    stringBuilder.append(string4);
                    stringBuilder.append(n7);
                    stringBuilder.append(string3);
                    stringBuilder.append(object);
                    stringBuilder.append(string2);
                    object = stringBuilder.toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                    throw illegalArgumentException;
                }
                StringBuilder stringBuilder = new StringBuilder("Unexpected low surrogate character '");
                stringBuilder.append(c3);
                stringBuilder.append(string5);
                stringBuilder.append((int)c3);
                stringBuilder.append(string4);
                stringBuilder.append(n3);
                stringBuilder.append(string3);
                stringBuilder.append(object);
                stringBuilder.append(string2);
                object = stringBuilder.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            return c3;
        }
        object = new IndexOutOfBoundsException("Index exceeds specified range");
        throw object;
    }

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
        int n4 = this.nextEscapeIndex(string2, 0, n3);
        if (n4 != n3) {
            string2 = this.escapeSlow(string2, n4);
        }
        return string2;
    }

    public abstract char[] escape(int var1);

    public final String escapeSlow(String object, int n3) {
        int n4;
        int n7 = ((String)object).length();
        char[] cArray = Platform.charBufferFromThreadLocal();
        int n8 = 0;
        int n10 = 0;
        while (n3 < n7) {
            n4 = UnicodeEscaper.codePointAt((CharSequence)object, n3, n7);
            if (n4 >= 0) {
                char[] cArray2 = this.escape(n4);
                n4 = (n4 = (int)(Character.isSupplementaryCodePoint(n4) ? 1 : 0)) != 0 ? 2 : 1;
                n4 += n3;
                if (cArray2 != null) {
                    int n14 = cArray.length;
                    int n15 = n3 - n8;
                    int n16 = n10 + n15;
                    int n17 = cArray2.length + n16;
                    if (n14 < n17) {
                        n14 = n7 - n3 + n17 + 32;
                        cArray = UnicodeEscaper.growBuffer(cArray, n10, n14);
                    }
                    if (n15 > 0) {
                        ((String)object).getChars(n8, n3, cArray, n10);
                        n10 = n16;
                    }
                    if ((n3 = cArray2.length) > 0) {
                        n3 = cArray2.length;
                        System.arraycopy(cArray2, 0, cArray, n10, n3);
                        n3 = cArray2.length;
                        n10 += n3;
                    }
                    n8 = n4;
                }
                n3 = this.nextEscapeIndex((CharSequence)object, n4, n7);
                continue;
            }
            object = new IllegalArgumentException("Trailing high surrogate at end of input");
            throw object;
        }
        n3 = n7 - n8;
        if (n3 > 0) {
            n4 = cArray.length;
            if (n4 < (n3 += n10)) {
                cArray = UnicodeEscaper.growBuffer(cArray, n10, n3);
            }
            ((String)object).getChars(n8, n7, cArray, n10);
            n10 = n3;
        }
        object = new String(cArray, 0, n10);
        return object;
    }

    public int nextEscapeIndex(CharSequence charSequence, int n3, int n4) {
        char[] cArray;
        int n7;
        while (n3 < n4 && (n7 = UnicodeEscaper.codePointAt(charSequence, n3, n4)) >= 0 && (cArray = this.escape(n7)) == null) {
            n7 = (n7 = (int)(Character.isSupplementaryCodePoint(n7) ? 1 : 0)) != 0 ? 2 : 1;
            n3 += n7;
        }
        return n3;
    }
}

