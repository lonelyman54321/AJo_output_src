/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Reader;
import com.google.zxing.oned.Code128Writer$CType;
import com.google.zxing.oned.OneDimensionalCodeWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class Code128Writer
extends OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = '\u00f1';
    private static final char ESCAPE_FNC_2 = '\u00f2';
    private static final char ESCAPE_FNC_3 = '\u00f3';
    private static final char ESCAPE_FNC_4 = '\u00f4';

    private static int chooseCode(CharSequence object, int n3, int n4) {
        Code128Writer$CType code128Writer$CType = Code128Writer.findCType(object, n3);
        Code128Writer$CType code128Writer$CType2 = Code128Writer$CType.ONE_DIGIT;
        int n7 = 100;
        if (code128Writer$CType == code128Writer$CType2) {
            return n7;
        }
        Code128Writer$CType code128Writer$CType3 = Code128Writer$CType.UNCODABLE;
        if (code128Writer$CType == code128Writer$CType3) {
            int n8 = object.length();
            if (n3 < n8) {
                char c2 = object.charAt(n3);
                n3 = 32;
                n8 = 101;
                if (c2 < n3 || n4 == n8 && c2 < (n3 = 96)) {
                    return n8;
                }
            }
            return n7;
        }
        int n10 = 99;
        if (n4 == n10) {
            return n10;
        }
        if (n4 == n7) {
            Code128Writer$CType code128Writer$CType4 = Code128Writer$CType.FNC_1;
            if (code128Writer$CType == code128Writer$CType4) {
                return n7;
            }
            int n14 = n3 + 2;
            code128Writer$CType = Code128Writer.findCType(object, n14);
            if (code128Writer$CType != code128Writer$CType3 && code128Writer$CType != code128Writer$CType2) {
                if (code128Writer$CType == code128Writer$CType4) {
                    Code128Writer$CType code128Writer$CType5;
                    if ((object = Code128Writer.findCType(object, n3 += 3)) == (code128Writer$CType5 = Code128Writer$CType.TWO_DIGITS)) {
                        return n10;
                    }
                    return n7;
                }
                n3 += 4;
                while ((code128Writer$CType4 = Code128Writer.findCType(object, n3)) == (code128Writer$CType = Code128Writer$CType.TWO_DIGITS)) {
                    n3 += 2;
                }
                object = Code128Writer$CType.ONE_DIGIT;
                if (code128Writer$CType4 == object) {
                    return n7;
                }
                return n10;
            }
            return n7;
        }
        Code128Writer$CType code128Writer$CType6 = Code128Writer$CType.FNC_1;
        if (code128Writer$CType == code128Writer$CType6) {
            code128Writer$CType = Code128Writer.findCType(object, ++n3);
        }
        if (code128Writer$CType == (object = Code128Writer$CType.TWO_DIGITS)) {
            return n10;
        }
        return n7;
    }

    private static Code128Writer$CType findCType(CharSequence charSequence, int n3) {
        char c2;
        char c3;
        int n4 = charSequence.length();
        if (n3 >= n4) {
            return Code128Writer$CType.UNCODABLE;
        }
        char c5 = charSequence.charAt(n3);
        if (c5 == (c3 = '\u00f1')) {
            return Code128Writer$CType.FNC_1;
        }
        c3 = '0';
        if (c5 >= c3 && c5 <= (c2 = '9')) {
            if (++n3 >= n4) {
                return Code128Writer$CType.ONE_DIGIT;
            }
            char c6 = charSequence.charAt(n3);
            if (c6 >= c3 && c6 <= c2) {
                return Code128Writer$CType.TWO_DIGITS;
            }
            return Code128Writer$CType.ONE_DIGIT;
        }
        return Code128Writer$CType.UNCODABLE;
    }

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map map2) {
        BarcodeFormat barcodeFormat = BarcodeFormat.CODE_128;
        if (object2 == barcodeFormat) {
            return super.encode((String)object, (BarcodeFormat)((Object)object2), n3, n4, map2);
        }
        object2 = String.valueOf(object2);
        object2 = "Can only encode CODE_128, but got ".concat((String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public boolean[] encode(String object) {
        int n3;
        int n4 = ((String)object).length();
        if (n4 > 0 && n4 <= (n3 = 80)) {
            int n7;
            int n8;
            int n10;
            int n14;
            n3 = 0;
            String string2 = null;
            Object object2 = null;
            block9: for (n14 = 0; n14 < n4; ++n14) {
                n10 = ((String)object).charAt(n14);
                switch (n10) {
                    default: {
                        n8 = 127;
                        if (n10 <= n8) continue block9;
                        string2 = String.valueOf((char)n10);
                        String string3 = "Bad character in input: ".concat(string2);
                        object = new IllegalArgumentException(string3);
                        throw object;
                    }
                    case 241: 
                    case 242: 
                    case 243: 
                    case 244: 
                }
            }
            object2 = new ArrayList();
            n10 = 1;
            n8 = 0;
            int[] nArray = null;
            int n15 = 0;
            int n16 = 0;
            int n172 = 1;
            while (true) {
                Object object3;
                n7 = 103;
                if (n8 >= n4) break;
                int n18 = Code128Writer.chooseCode((CharSequence)object, n8, n16);
                int n19 = 100;
                int n20 = 101;
                if (n18 == n16) {
                    n7 = ((String)object).charAt(n8);
                    switch (n7) {
                        default: {
                            if (n16 != n19) {
                                if (n16 != n20) {
                                    n7 = n8 + 2;
                                    object3 = ((String)object).substring(n8, n7);
                                    n19 = Integer.parseInt((String)object3);
                                    ++n8;
                                    break;
                                }
                                n7 = ((String)object).charAt(n8);
                                n19 = n7 + -32;
                                if (n19 >= 0) break;
                                n19 = n7 + 64;
                                break;
                            }
                            n7 = ((String)object).charAt(n8);
                            n19 = n7 + -32;
                            break;
                        }
                        case 244: {
                            if (n16 != n20) break;
                            n19 = 101;
                            break;
                        }
                        case 243: {
                            n19 = 96;
                            break;
                        }
                        case 242: {
                            n19 = 97;
                            break;
                        }
                        case 241: {
                            n19 = 102;
                        }
                    }
                    n8 += n10;
                } else {
                    if (n16 == 0) {
                        if (n18 != n19) {
                            if (n18 != n20) {
                                n7 = 105;
                            }
                        } else {
                            n7 = 104;
                        }
                    } else {
                        n7 = n18;
                    }
                    n19 = n7;
                    n16 = n18;
                }
                object3 = Code128Reader.CODE_PATTERNS[n19];
                ((ArrayList)object2).add(object3);
                n15 += (n19 *= n172);
                if (n8 == 0) continue;
                ++n172;
            }
            object = Code128Reader.CODE_PATTERNS;
            Iterator iterator = object[n15 %= n7];
            ((ArrayList)object2).add(iterator);
            object = object[106];
            ((ArrayList)object2).add(object);
            object = ((ArrayList)object2).iterator();
            n4 = 0;
            iterator = null;
            while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                for (int n172 : (int[])object.next()) {
                    n4 += n172;
                }
            }
            object = new boolean[n4];
            iterator = ((ArrayList)object2).iterator();
            while ((n14 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object2 = (int[])iterator.next();
                n14 = OneDimensionalCodeWriter.appendPattern((boolean[])object, n3, (int[])object2, n10 != 0);
                n3 += n14;
            }
            return object;
        }
        String string4 = String.valueOf(n4);
        string4 = "Contents length should be between 1 and 80 characters, but got ".concat(string4);
        object = new IllegalArgumentException(string4);
        throw object;
    }
}

