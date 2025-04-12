/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.oned.CodaBarReader;
import com.google.zxing.oned.OneDimensionalCodeWriter;

public final class CodaBarWriter
extends OneDimensionalCodeWriter {
    private static final char[] ALT_START_END_CHARS;
    private static final char[] CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED;
    private static final char DEFAULT_GUARD;
    private static final char[] START_END_CHARS;

    static {
        char[] cArray;
        char[] cArray2;
        char[] cArray3;
        int n3 = 4;
        char[] cArray4 = cArray3 = new char[n3];
        char[] cArray5 = cArray3;
        cArray4[0] = 65;
        cArray5[1] = 66;
        cArray4[2] = 67;
        cArray5[3] = 68;
        START_END_CHARS = cArray3;
        char[] cArray6 = cArray2 = new char[n3];
        char[] cArray7 = cArray2;
        cArray6[0] = 84;
        cArray7[1] = 78;
        cArray6[2] = 42;
        cArray7[3] = 69;
        ALT_START_END_CHARS = cArray2;
        char[] cArray8 = cArray = new char[n3];
        char[] cArray9 = cArray;
        cArray8[0] = 47;
        cArray9[1] = 58;
        cArray8[2] = 43;
        cArray9[3] = 46;
        CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED = cArray;
        DEFAULT_GUARD = cArray3[0];
    }

    public boolean[] encode(String string2) {
        Object object;
        block24: {
            int n3;
            int n4;
            char[] cArray;
            Object object2;
            int n7;
            StringBuilder stringBuilder;
            int n8;
            int n10;
            block21: {
                block23: {
                    block22: {
                        block20: {
                            n10 = string2.length();
                            n8 = 2;
                            stringBuilder = null;
                            n7 = 1;
                            if (n10 >= n8) break block20;
                            object2 = new StringBuilder();
                            n8 = DEFAULT_GUARD;
                            ((StringBuilder)object2).append((char)n8);
                            ((StringBuilder)object2).append(string2);
                            ((StringBuilder)object2).append((char)n8);
                            string2 = ((StringBuilder)object2).toString();
                            break block21;
                        }
                        n10 = Character.toUpperCase(string2.charAt(0));
                        n8 = string2.length() - n7;
                        n8 = Character.toUpperCase(string2.charAt(n8));
                        cArray = START_END_CHARS;
                        n4 = CodaBarReader.arrayContains(cArray, (char)n10);
                        n3 = CodaBarReader.arrayContains(cArray, (char)n8);
                        object = ALT_START_END_CHARS;
                        n10 = (int)(CodaBarReader.arrayContains((char[])object, (char)n10) ? 1 : 0);
                        n8 = (int)(CodaBarReader.arrayContains((char[])object, (char)n8) ? 1 : 0);
                        object = "Invalid start/end guards: ";
                        if (n4 == 0) break block22;
                        if (n3 == 0) {
                            string2 = ((String)object).concat(string2);
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                            throw illegalArgumentException;
                        }
                        break block21;
                    }
                    if (n10 == 0) break block23;
                    if (n8 == 0) {
                        string2 = ((String)object).concat(string2);
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                        throw illegalArgumentException;
                    }
                    break block21;
                }
                if (n3 != 0 || n8 != 0) break block24;
                object2 = new StringBuilder();
                n8 = DEFAULT_GUARD;
                ((StringBuilder)object2).append((char)n8);
                ((StringBuilder)object2).append(string2);
                ((StringBuilder)object2).append((char)n8);
                string2 = ((StringBuilder)object2).toString();
            }
            n10 = 20;
            for (n8 = 1; n8 < (n3 = string2.length() - n7); ++n8) {
                n3 = (int)(Character.isDigit(string2.charAt(n8)) ? 1 : 0);
                if (n3 == 0 && (n3 = string2.charAt(n8)) != (n4 = 45) && (n3 = (int)string2.charAt(n8)) != (n4 = 36)) {
                    cArray = CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED;
                    n4 = string2.charAt(n8);
                    n3 = (int)(CodaBarReader.arrayContains(cArray, (char)n4) ? 1 : 0);
                    if (n3 != 0) {
                        n10 += 10;
                        continue;
                    }
                    stringBuilder = new StringBuilder("Cannot encode : '");
                    char c2 = string2.charAt(n8);
                    stringBuilder.append(c2);
                    stringBuilder.append('\'');
                    string2 = stringBuilder.toString();
                    object2 = new IllegalArgumentException(string2);
                    throw object2;
                }
                n10 += 9;
            }
            object2 = new boolean[string2.length() - n7 + n10];
            n3 = 0;
            cArray = null;
            for (n8 = 0; n8 < (n4 = string2.length()); ++n8) {
                int n14;
                int n15;
                int n16;
                block19: {
                    int[] nArray;
                    char[] cArray2;
                    n4 = Character.toUpperCase(string2.charAt(n8));
                    if (n8 == 0 || n8 == (n16 = string2.length() - n7)) {
                        n16 = 42;
                        if (n4 != n16) {
                            n16 = 69;
                            if (n4 != n16) {
                                n16 = 78;
                                if (n4 != n16) {
                                    n16 = 84;
                                    if (n4 == n16) {
                                        n4 = 65;
                                    }
                                } else {
                                    n4 = 66;
                                }
                            } else {
                                n4 = 68;
                            }
                        } else {
                            n4 = 67;
                        }
                    }
                    object = null;
                    for (n16 = 0; n16 < (n15 = (cArray2 = CodaBarReader.ALPHABET).length); ++n16) {
                        n14 = cArray2[n16];
                        if (n4 != n14) continue;
                        nArray = CodaBarReader.CHARACTER_ENCODINGS;
                        n4 = nArray[n16];
                        break block19;
                    }
                    n4 = 0;
                    nArray = null;
                }
                n16 = 0;
                object = null;
                n14 = 1;
                block3: while (true) {
                    int n17;
                    n15 = 0;
                    while (n16 < (n17 = 7)) {
                        object2[n3] = n14;
                        ++n3;
                        n17 = 6 - n16;
                        if ((n17 = n4 >> n17 & n7) != 0 && n15 != n7) {
                            ++n15;
                            continue;
                        }
                        n14 ^= '\u0001';
                        ++n16;
                        continue block3;
                    }
                    break;
                }
                n4 = string2.length() - n7;
                if (n8 >= n4) continue;
                object2[n3] = false;
                ++n3;
            }
            return object2;
        }
        string2 = ((String)object).concat(string2);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

