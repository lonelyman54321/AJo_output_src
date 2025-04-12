/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code39Reader;
import com.google.zxing.oned.OneDimensionalCodeWriter;
import java.util.Map;

public final class Code39Writer
extends OneDimensionalCodeWriter {
    private static void toIntArray(int n3, int[] nArray) {
        int n4;
        for (int i3 = 0; i3 < (n4 = 9); ++i3) {
            n4 = 8 - i3;
            int n7 = 1;
            if ((n4 = n7 << n4 & n3) != 0) {
                n7 = 2;
            }
            nArray[i3] = n7;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String tryToConvertToExtendedMode(String string2) {
        int n3 = string2.length();
        StringBuilder stringBuilder = new StringBuilder();
        int n4 = 0;
        while (true) {
            block7: {
                String string3;
                block8: {
                    char c2;
                    block9: {
                        block10: {
                            block11: {
                                char c3;
                                block14: {
                                    char c5;
                                    char c6;
                                    block17: {
                                        block16: {
                                            block15: {
                                                block13: {
                                                    block12: {
                                                        if (n4 >= n3) {
                                                            return stringBuilder.toString();
                                                        }
                                                        c2 = string2.charAt(n4);
                                                        if (c2 == '\u0000') break block8;
                                                        c6 = ' ';
                                                        if (c2 == c6) break block9;
                                                        c5 = '@';
                                                        if (c2 == c5) break block10;
                                                        c5 = '`';
                                                        if (c2 == c5) break block11;
                                                        c5 = '-';
                                                        if (c2 == c5 || c2 == (c5 = '.')) break block9;
                                                        c5 = '\u001a';
                                                        if (c2 > c5) break block12;
                                                        c6 = '$';
                                                        stringBuilder.append(c6);
                                                        c2 = (char)(c2 + 64);
                                                        stringBuilder.append(c2);
                                                        break block7;
                                                    }
                                                    c5 = '%';
                                                    if (c2 >= c6) break block13;
                                                    stringBuilder.append(c5);
                                                    c2 = (char)(c2 + 38);
                                                    stringBuilder.append(c2);
                                                    break block7;
                                                }
                                                c6 = ',';
                                                c3 = '/';
                                                if (c2 <= c6 || c2 == c3 || c2 == (c6 = ':')) break block14;
                                                c6 = '9';
                                                if (c2 > c6) break block15;
                                                c2 = c2;
                                                stringBuilder.append(c2);
                                                break block7;
                                            }
                                            c6 = '?';
                                            if (c2 > c6) break block16;
                                            stringBuilder.append(c5);
                                            c2 = (char)(c2 + 11);
                                            stringBuilder.append(c2);
                                            break block7;
                                        }
                                        c6 = 'Z';
                                        if (c2 > c6) break block17;
                                        c2 = c2;
                                        stringBuilder.append(c2);
                                        break block7;
                                    }
                                    c6 = '_';
                                    if (c2 <= c6) {
                                        stringBuilder.append(c5);
                                        c2 = (char)(c2 + -16);
                                        stringBuilder.append(c2);
                                        break block7;
                                    } else {
                                        c6 = 'z';
                                        if (c2 <= c6) {
                                            c6 = '+';
                                            stringBuilder.append(c6);
                                            c2 = (char)(c2 + -32);
                                            stringBuilder.append(c2);
                                            break block7;
                                        } else {
                                            c6 = '\u007f';
                                            if (c2 > c6) {
                                                stringBuilder = new StringBuilder("Requested content contains a non-encodable character: '");
                                                char c7 = string2.charAt(n4);
                                                stringBuilder.append(c7);
                                                stringBuilder.append("'");
                                                string2 = stringBuilder.toString();
                                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                                                throw illegalArgumentException;
                                            }
                                            stringBuilder.append(c5);
                                            c2 = (char)(c2 + -43);
                                            stringBuilder.append(c2);
                                        }
                                    }
                                    break block7;
                                }
                                stringBuilder.append(c3);
                                c2 = (char)(c2 + 32);
                                stringBuilder.append(c2);
                                break block7;
                            }
                            string3 = "%W";
                            stringBuilder.append(string3);
                            break block7;
                        }
                        string3 = "%V";
                        stringBuilder.append(string3);
                        break block7;
                    }
                    stringBuilder.append(c2);
                    break block7;
                }
                string3 = "%U";
                stringBuilder.append(string3);
            }
            ++n4;
        }
    }

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map map2) {
        BarcodeFormat barcodeFormat = BarcodeFormat.CODE_39;
        if (object2 == barcodeFormat) {
            return super.encode((String)object, (BarcodeFormat)((Object)object2), n3, n4, map2);
        }
        object2 = String.valueOf(object2);
        object2 = "Can only encode CODE_39, but got ".concat((String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public boolean[] encode(String object) {
        int n3 = ((String)object).length();
        Object object2 = "Requested contents should be less than 80 digits long, but got ";
        int n4 = 80;
        if (n3 <= n4) {
            int[] nArray;
            int n7;
            int n8;
            String string2;
            int n10 = 0;
            while (true) {
                string2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
                if (n10 >= n3) break;
                n8 = ((String)object).charAt(n10);
                if ((n8 = string2.indexOf(n8)) < 0) {
                    n3 = ((String)(object = Code39Writer.tryToConvertToExtendedMode((String)object))).length();
                    if (n3 <= n4) break;
                    String string3 = Gj0.b(n3, (String)object2, " (extended full ASCII mode)");
                    object = new IllegalArgumentException(string3);
                    throw object;
                }
                ++n10;
            }
            int n14 = 9;
            int[] nArray2 = new int[n14];
            n10 = n3 + 25;
            for (n8 = 0; n8 < n3; n8 += 1) {
                n7 = ((String)object).charAt(n8);
                n7 = string2.indexOf(n7);
                nArray = Code39Reader.CHARACTER_ENCODINGS;
                Code39Writer.toIntArray(nArray[n7], nArray2);
                for (n7 = 0; n7 < n14; ++n7) {
                    int n15 = nArray2[n7];
                    n10 += n15;
                }
            }
            object2 = new boolean[n10];
            n10 = 148;
            Code39Writer.toIntArray(n10, nArray2);
            n8 = 1;
            n7 = OneDimensionalCodeWriter.appendPattern((boolean[])object2, 0, nArray2, n8 != 0);
            nArray = new int[]{n8};
            int n16 = OneDimensionalCodeWriter.appendPattern((boolean[])object2, n7, nArray, false) + n7;
            for (n7 = 0; n7 < n3; ++n7) {
                int n17 = ((String)object).charAt(n7);
                n17 = string2.indexOf(n17);
                int[] nArray3 = Code39Reader.CHARACTER_ENCODINGS;
                Code39Writer.toIntArray(nArray3[n17], nArray2);
                n17 = OneDimensionalCodeWriter.appendPattern((boolean[])object2, n16, nArray2, n8 != 0) + n16;
                n16 = OneDimensionalCodeWriter.appendPattern((boolean[])object2, n17, nArray, false) + n17;
            }
            Code39Writer.toIntArray(n10, nArray2);
            OneDimensionalCodeWriter.appendPattern((boolean[])object2, n16, nArray2, n8 != 0);
            return object2;
        }
        String string4 = String.valueOf(n3);
        string4 = ((String)object2).concat(string4);
        object = new IllegalArgumentException(string4);
        throw object;
    }
}

