/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.pdf417.encoder.Compaction;
import com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

final class PDF417HighLevelEncoder {
    private static final int BYTE_COMPACTION = 1;
    private static final Charset DEFAULT_ENCODING;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final int LATCH_TO_BYTE = 924;
    private static final int LATCH_TO_BYTE_PADDED = 901;
    private static final int LATCH_TO_NUMERIC = 902;
    private static final int LATCH_TO_TEXT = 900;
    private static final byte[] MIXED;
    private static final int NUMERIC_COMPACTION = 2;
    private static final byte[] PUNCTUATION;
    private static final int SHIFT_TO_BYTE = 913;
    private static final int SUBMODE_ALPHA = 0;
    private static final int SUBMODE_LOWER = 1;
    private static final int SUBMODE_MIXED = 2;
    private static final int SUBMODE_PUNCTUATION = 3;
    private static final int TEXT_COMPACTION;
    private static final byte[] TEXT_MIXED_RAW;
    private static final byte[] TEXT_PUNCTUATION_RAW;

    static {
        byte by2;
        byte[] byArray;
        int n3;
        int n4;
        Object object;
        byte[] byArray2;
        int n7 = 0;
        int by4 = 30;
        byte[] byArray3 = byArray2 = new byte[by4];
        byte[] byArray4 = byArray2;
        byArray3[0] = 48;
        byArray4[1] = 49;
        byArray3[2] = 50;
        byArray4[3] = 51;
        byArray3[4] = 52;
        byArray4[5] = 53;
        byArray3[6] = 54;
        byArray4[7] = 55;
        byArray3[8] = 56;
        byArray4[9] = 57;
        byArray3[10] = 38;
        byArray4[11] = 13;
        byArray3[12] = 9;
        byArray4[13] = 44;
        byArray3[14] = 58;
        byArray4[15] = 35;
        byArray3[16] = 45;
        byArray4[17] = 46;
        byArray3[18] = 36;
        byArray4[19] = 47;
        byArray3[20] = 43;
        byArray4[21] = 37;
        byArray3[22] = 42;
        byArray4[23] = 61;
        byArray3[24] = 94;
        byArray4[25] = 0;
        byArray3[26] = 32;
        byArray4[27] = 0;
        byArray3[28] = 0;
        byArray4[29] = 0;
        TEXT_MIXED_RAW = byArray2;
        byte[] byArray5 = object = new byte[by4];
        byte[] byArray6 = object;
        byArray5[0] = 59;
        byArray6[1] = 60;
        byArray5[2] = 62;
        byArray6[3] = 64;
        byArray5[4] = 91;
        byArray6[5] = 92;
        byArray5[6] = 93;
        byArray6[7] = 95;
        byArray5[8] = 96;
        byArray6[9] = 126;
        byArray5[10] = 33;
        byArray6[11] = 13;
        byArray5[12] = 9;
        byArray6[13] = 44;
        byArray5[14] = 58;
        byArray6[15] = 10;
        byArray5[16] = 45;
        byArray6[17] = 46;
        byArray5[18] = 36;
        byArray6[19] = 47;
        byArray5[20] = 34;
        byArray6[21] = 124;
        byArray5[22] = 42;
        byArray6[23] = 40;
        byArray5[24] = 41;
        byArray6[25] = 63;
        byArray5[26] = 123;
        byArray6[27] = 125;
        byArray5[28] = 39;
        byArray6[29] = 0;
        TEXT_PUNCTUATION_RAW = object;
        int n8 = 128;
        byArray2 = new byte[n8];
        MIXED = byArray2;
        PUNCTUATION = new byte[n8];
        object = StandardCharsets.ISO_8859_1;
        DEFAULT_ENCODING = object;
        byte by5 = -1;
        Arrays.fill(byArray2, by5);
        byArray2 = null;
        for (n4 = 0; n4 < (n3 = (byArray = TEXT_MIXED_RAW).length); ++n4) {
            byte by6;
            by2 = byArray[n4];
            if (by2 <= 0) continue;
            byte[] byArray7 = MIXED;
            byArray7[by2] = by6 = (byte)n4;
        }
        byArray2 = PUNCTUATION;
        Arrays.fill(byArray2, by5);
        while (n7 < (n4 = ((byte[])(object = TEXT_PUNCTUATION_RAW)).length)) {
            byte by7 = object[n7];
            if (by7 > 0) {
                byArray2 = PUNCTUATION;
                byArray2[by7] = by2 = (byte)n7;
            }
            ++n7;
        }
    }

    private PDF417HighLevelEncoder() {
    }

    private static int determineConsecutiveBinaryCount(String object, int n3, Charset object2) {
        int n4;
        object2 = ((Charset)object2).newEncoder();
        int n7 = ((String)object).length();
        for (n4 = n3; n4 < n7; ++n4) {
            int n8;
            char c2 = ((String)object).charAt(n4);
            int n10 = 0;
            while (n10 < (n8 = 13) && (c2 = (char)(PDF417HighLevelEncoder.isDigit(c2) ? 1 : 0)) != '\u0000' && (c2 = n4 + ++n10) < n7) {
                c2 = ((String)object).charAt(c2);
            }
            if (n10 >= n8) {
                return n4 - n3;
            }
            c2 = ((String)object).charAt(n4);
            n10 = (int)(((CharsetEncoder)object2).canEncode(c2) ? 1 : 0);
            if (n10 != 0) {
                continue;
            }
            CharSequence charSequence = new StringBuilder("Non-encodable character detected: ");
            charSequence.append(c2);
            charSequence.append(" (Unicode: ");
            charSequence.append(c2);
            charSequence.append(')');
            charSequence = charSequence.toString();
            object = new WriterException((String)charSequence);
            throw object;
        }
        return n4 - n3;
    }

    private static int determineConsecutiveDigitCount(CharSequence charSequence, int n3) {
        int n4 = charSequence.length();
        int n7 = 0;
        if (n3 < n4) {
            boolean bl2;
            char c2 = charSequence.charAt(n3);
            while ((bl2 = PDF417HighLevelEncoder.isDigit(c2)) && n3 < n4) {
                ++n7;
                if (++n3 >= n4) continue;
                c2 = charSequence.charAt(n3);
            }
        }
        return n7;
    }

    private static int determineConsecutiveTextCount(CharSequence charSequence, int n3) {
        int n4 = charSequence.length();
        int n7 = n3;
        while (n7 < n4) {
            boolean bl2;
            int n8;
            int n10;
            char c2 = charSequence.charAt(n7);
            for (n10 = 0; n10 < (n8 = 13) && (bl2 = PDF417HighLevelEncoder.isDigit(c2)) && n7 < n4; ++n10) {
                if (++n7 >= n4) continue;
                c2 = charSequence.charAt(n7);
            }
            if (n10 >= n8) {
                return n7 - n3 - n10;
            }
            if (n10 > 0) continue;
            c2 = (char)(PDF417HighLevelEncoder.isText(charSequence.charAt(n7)) ? 1 : 0);
            if (c2 == '\u0000') break;
            ++n7;
        }
        return n7 - n3;
    }

    private static void encodeBinary(byte[] byArray, int n3, int n4, int n7, StringBuilder stringBuilder) {
        int n8;
        int n10 = 1;
        if (n4 == n10 && n7 == 0) {
            n7 = 913;
            stringBuilder.append((char)n7);
        } else {
            n7 = n4 % 6;
            if (n7 == 0) {
                n7 = 924;
                stringBuilder.append((char)n7);
            } else {
                n7 = 901;
                stringBuilder.append((char)n7);
            }
        }
        n7 = 6;
        if (n4 >= n7) {
            int n14;
            n10 = 5;
            char[] cArray = new char[n10];
            n8 = n3;
            while ((n14 = n3 + n4 - n8) >= n7) {
                n14 = 0;
                long l2 = 0L;
                for (int i3 = 0; i3 < n7; ++i3) {
                    l2 <<= 8;
                    int n15 = n8 + i3;
                    n15 = byArray[n15] & 0xFF;
                    long l3 = n15;
                    l2 += l3;
                }
                while (n14 < n10) {
                    char c2;
                    long l4 = 900L;
                    long l7 = l2 % l4;
                    int n16 = (int)l7;
                    cArray[n14] = c2 = (char)n16;
                    l2 /= l4;
                    ++n14;
                }
                for (n14 = 4; n14 >= 0; n14 += -1) {
                    char c3 = cArray[n14];
                    stringBuilder.append(c3);
                }
                n8 += 6;
            }
        } else {
            n8 = n3;
        }
        while (n8 < (n7 = n3 + n4)) {
            n7 = (char)(byArray[n8] & 0xFF);
            stringBuilder.append((char)n7);
            ++n8;
        }
    }

    public static String encodeHighLevel(String object, Compaction object2, Charset charset) {
        int n3 = ((String)object).length();
        StringBuilder stringBuilder = new StringBuilder(n3);
        if (charset == null) {
            charset = DEFAULT_ENCODING;
        } else {
            Object object3 = DEFAULT_ENCODING;
            n3 = (int)(((Charset)object3).equals(charset) ? 1 : 0);
            if (n3 == 0 && (object3 = CharacterSetECI.getCharacterSetECIByName(charset.name())) != null) {
                n3 = ((CharacterSetECI)((Object)object3)).getValue();
                PDF417HighLevelEncoder.encodingECI(n3, stringBuilder);
            }
        }
        n3 = ((String)object).length();
        int[] nArray = PDF417HighLevelEncoder$1.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction;
        int n4 = object2.ordinal();
        n4 = nArray[n4];
        int n7 = 1;
        if (n4 != n7) {
            int n8 = 2;
            if (n4 != n8) {
                int n10 = 3;
                char c2 = '\u0386';
                if (n4 != n10) {
                    n4 = 0;
                    object2 = null;
                    n10 = 0;
                    int n14 = 0;
                    while (n4 < n3) {
                        int n15;
                        int n16;
                        int n17 = PDF417HighLevelEncoder.determineConsecutiveDigitCount((CharSequence)object, n4);
                        if (n17 >= (n16 = 13)) {
                            stringBuilder.append(c2);
                            PDF417HighLevelEncoder.encodeNumeric((String)object, n4, n17, stringBuilder);
                            n4 += n17;
                            n10 = 0;
                            n14 = 2;
                            continue;
                        }
                        n16 = PDF417HighLevelEncoder.determineConsecutiveTextCount((CharSequence)object, n4);
                        if (n16 < (n15 = 5) && n17 != n3) {
                            n17 = PDF417HighLevelEncoder.determineConsecutiveBinaryCount((String)object, n4, charset);
                            if (n17 == 0) {
                                n17 = 1;
                            }
                            if ((n16 = ((Compaction)(object2 = (Object)((String)object).substring(n4, n17 += n4).getBytes(charset))).length) == n7 && n14 == 0) {
                                PDF417HighLevelEncoder.encodeBinary((byte[])object2, 0, n7, 0, stringBuilder);
                            } else {
                                n10 = ((Compaction)object2).length;
                                PDF417HighLevelEncoder.encodeBinary((byte[])object2, 0, n10, n14, stringBuilder);
                                n10 = 0;
                                n14 = 1;
                            }
                            n4 = n17;
                            continue;
                        }
                        if (n14 != 0) {
                            stringBuilder.append('\u0384');
                            n10 = 0;
                            n14 = 0;
                        }
                        n10 = PDF417HighLevelEncoder.encodeText((CharSequence)object, n4, n16, stringBuilder, n10);
                        n4 += n16;
                    }
                } else {
                    stringBuilder.append(c2);
                    PDF417HighLevelEncoder.encodeNumeric((String)object, 0, n3, stringBuilder);
                }
            } else {
                object = ((String)object).getBytes(charset);
                n4 = ((Object)object).length;
                PDF417HighLevelEncoder.encodeBinary((byte[])object, 0, n4, n7, stringBuilder);
            }
        } else {
            PDF417HighLevelEncoder.encodeText((CharSequence)object, 0, n3, stringBuilder, 0);
        }
        return stringBuilder.toString();
    }

    private static void encodeNumeric(String string2, int n3, int n4, StringBuilder stringBuilder) {
        int n7;
        int n8 = n4 / 3 + 1;
        StringBuilder stringBuilder2 = new StringBuilder(n8);
        long l2 = 900L;
        BigInteger bigInteger = BigInteger.valueOf(l2);
        long l3 = 0L;
        BigInteger bigInteger2 = BigInteger.valueOf(l3);
        for (int i3 = 0; i3 < n4; i3 += n7) {
            stringBuilder2.setLength(0);
            int n10 = n4 - i3;
            n7 = Math.min(44, n10);
            Object object = new StringBuilder("1");
            char c2 = n3 + i3;
            int n14 = c2 + n7;
            Object object2 = string2.substring(c2, n14);
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            object2 = new BigInteger((String)object);
            do {
                object = ((BigInteger)object2).mod(bigInteger);
                n10 = (char)((BigInteger)object).intValue();
                stringBuilder2.append((char)n10);
            } while ((n10 = (int)(((BigInteger)(object2 = ((BigInteger)object2).divide(bigInteger))).equals(bigInteger2) ? 1 : 0)) == 0);
            for (n10 = stringBuilder2.length() + -1; n10 >= 0; n10 += -1) {
                c2 = stringBuilder2.charAt(n10);
                stringBuilder.append(c2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int encodeText(CharSequence charSequence, int n3, int n4, StringBuilder stringBuilder, int n7) {
        char c2;
        int n8;
        char c3;
        CharSequence charSequence2 = charSequence;
        int n10 = n4;
        StringBuilder stringBuilder2 = stringBuilder;
        StringBuilder stringBuilder3 = new StringBuilder(n4);
        int n14 = 0;
        int n15 = n7;
        int n16 = 0;
        while (true) {
            block19: {
                byte[] byArray;
                int n17;
                char c5;
                block35: {
                    block32: {
                        char c6;
                        block34: {
                            block28: {
                                char c7;
                                block33: {
                                    char c8;
                                    char c10;
                                    block20: {
                                        block31: {
                                            block30: {
                                                block29: {
                                                    block21: {
                                                        block27: {
                                                            block26: {
                                                                block24: {
                                                                    block25: {
                                                                        block22: {
                                                                            block23: {
                                                                                c5 = n3 + n16;
                                                                                n17 = charSequence2.charAt(c5);
                                                                                c10 = '\u001a';
                                                                                c8 = ' ';
                                                                                c7 = '\u001b';
                                                                                c6 = '\u001c';
                                                                                c3 = '\u001d';
                                                                                n8 = 2;
                                                                                int n18 = 1;
                                                                                if (n15 == 0) break block20;
                                                                                if (n15 == n18) break block21;
                                                                                if (n15 == n8) break block22;
                                                                                c5 = (char)(PDF417HighLevelEncoder.isPunctuation((char)n17) ? 1 : 0);
                                                                                if (c5 == '\u0000') break block23;
                                                                                byArray = PUNCTUATION;
                                                                                c5 = (char)byArray[n17];
                                                                                stringBuilder3.append(c5);
                                                                                break block19;
                                                                            }
                                                                            stringBuilder3.append(c3);
                                                                            break block24;
                                                                        }
                                                                        c10 = (char)(PDF417HighLevelEncoder.isMixed((char)n17) ? 1 : 0);
                                                                        if (c10 == '\u0000') break block25;
                                                                        byArray = MIXED;
                                                                        c5 = (char)byArray[n17];
                                                                        stringBuilder3.append(c5);
                                                                        break block19;
                                                                    }
                                                                    c10 = (char)(PDF417HighLevelEncoder.isAlphaUpper((char)n17) ? 1 : 0);
                                                                    if (c10 == '\u0000') break block26;
                                                                    stringBuilder3.append(c6);
                                                                }
                                                                n15 = 0;
                                                                continue;
                                                            }
                                                            c10 = (char)(PDF417HighLevelEncoder.isAlphaLower((char)n17) ? 1 : 0);
                                                            if (c10 == '\u0000') break block27;
                                                            stringBuilder3.append(c7);
                                                            break block28;
                                                        }
                                                        if (++c5 < n10 && (c5 = (char)(PDF417HighLevelEncoder.isPunctuation(charSequence2.charAt(c5)) ? 1 : 0)) != '\u0000') {
                                                            stringBuilder3.append('\u0019');
                                                            n15 = 3;
                                                            continue;
                                                        }
                                                        stringBuilder3.append(c3);
                                                        byArray = PUNCTUATION;
                                                        c5 = (char)byArray[n17];
                                                        stringBuilder3.append(c5);
                                                        break block19;
                                                    }
                                                    c5 = (char)(PDF417HighLevelEncoder.isAlphaLower((char)n17) ? 1 : 0);
                                                    if (c5 == '\u0000') break block29;
                                                    if (n17 == c8) {
                                                        stringBuilder3.append(c10);
                                                        break block19;
                                                    } else {
                                                        c5 = (char)(n17 += -97);
                                                        stringBuilder3.append(c5);
                                                    }
                                                    break block19;
                                                }
                                                c5 = (char)(PDF417HighLevelEncoder.isAlphaUpper((char)n17) ? 1 : 0);
                                                if (c5 == '\u0000') break block30;
                                                stringBuilder3.append(c7);
                                                c5 = (char)(n17 += -65);
                                                stringBuilder3.append(c5);
                                                break block19;
                                            }
                                            c5 = (char)(PDF417HighLevelEncoder.isMixed((char)n17) ? 1 : 0);
                                            if (c5 == '\u0000') break block31;
                                            stringBuilder3.append(c6);
                                            break block32;
                                        }
                                        stringBuilder3.append(c3);
                                        byArray = PUNCTUATION;
                                        c5 = (char)byArray[n17];
                                        stringBuilder3.append(c5);
                                        break block19;
                                    }
                                    c5 = (char)(PDF417HighLevelEncoder.isAlphaUpper((char)n17) ? 1 : 0);
                                    if (c5 == '\u0000') break block33;
                                    if (n17 == c8) {
                                        stringBuilder3.append(c10);
                                        break block19;
                                    } else {
                                        c5 = (char)(n17 += -65);
                                        stringBuilder3.append(c5);
                                    }
                                    break block19;
                                }
                                c5 = (char)(PDF417HighLevelEncoder.isAlphaLower((char)n17) ? 1 : 0);
                                if (c5 == '\u0000') break block34;
                                stringBuilder3.append(c7);
                            }
                            n15 = 1;
                            continue;
                        }
                        c5 = (char)(PDF417HighLevelEncoder.isMixed((char)n17) ? 1 : 0);
                        if (c5 == '\u0000') break block35;
                        stringBuilder3.append(c6);
                    }
                    n15 = 2;
                    continue;
                }
                stringBuilder3.append(c3);
                byArray = PUNCTUATION;
                c5 = (char)byArray[n17];
                stringBuilder3.append(c5);
            }
            if (++n16 >= n10) break;
        }
        int n19 = stringBuilder3.length();
        boolean bl2 = false;
        while (n14 < n19) {
            n16 = n14 % 2;
            if (n16 != 0) {
                n16 = stringBuilder3.charAt(n14) + (c2 *= 30);
                c2 = (char)n16;
                stringBuilder2.append(c2);
            } else {
                c2 = stringBuilder3.charAt(n14);
            }
            ++n14;
        }
        int n20 = n19 % n8;
        if (n20 != 0) {
            void var6_9 = c2 * 30 + c3;
            char c11 = (char)var6_9;
            stringBuilder2.append(c11);
        }
        return n15;
    }

    private static void encodingECI(int n3, StringBuilder serializable) {
        int n4 = 900;
        if (n3 >= 0 && n3 < n4) {
            ((StringBuilder)serializable).append('\u039f');
            n3 = (char)n3;
            ((StringBuilder)serializable).append((char)n3);
            return;
        }
        int c2 = 810900;
        if (n3 < c2) {
            ((StringBuilder)serializable).append('\u039e');
            char c3 = (char)(n3 / 900 + -1);
            ((StringBuilder)serializable).append(c3);
            n3 = (char)(n3 % n4);
            ((StringBuilder)serializable).append((char)n3);
            return;
        }
        n4 = 811800;
        if (n3 < n4) {
            ((StringBuilder)serializable).append('\u039d');
            n3 = (char)(c2 - n3);
            ((StringBuilder)serializable).append((char)n3);
            return;
        }
        String string2 = String.valueOf(n3);
        string2 = "ECI number not in valid range from 0..811799, but was ".concat(string2);
        serializable = new WriterException(string2);
        throw serializable;
    }

    private static boolean isAlphaLower(char n3) {
        int n4 = 32;
        return n3 == n4 || n3 >= (n4 = 97) && n3 <= (n4 = 122);
        {
        }
    }

    private static boolean isAlphaUpper(char n3) {
        int n4 = 32;
        return n3 == n4 || n3 >= (n4 = 65) && n3 <= (n4 = 90);
        {
        }
    }

    private static boolean isDigit(char n3) {
        int n4 = 48;
        return n3 >= n4 && n3 <= (n4 = 57);
    }

    private static boolean isMixed(char c2) {
        byte[] byArray = MIXED;
        char c3 = '\uffffffff';
        return (c2 = byArray[c2]) != c3;
    }

    private static boolean isPunctuation(char c2) {
        byte[] byArray = PUNCTUATION;
        char c3 = '\uffffffff';
        return (c2 = byArray[c2]) != c3;
    }

    private static boolean isText(char n3) {
        int n4 = 9;
        return n3 == n4 || n3 == (n4 = 10) || n3 == (n4 = 13) || n3 >= (n4 = 32) && n3 <= (n4 = 126);
        {
        }
    }
}

