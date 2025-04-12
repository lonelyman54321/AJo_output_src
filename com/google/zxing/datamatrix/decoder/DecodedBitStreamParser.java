/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1;
import com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

final class DecodedBitStreamParser {
    private static final char[] C40_BASIC_SET_CHARS;
    private static final char[] C40_SHIFT2_SET_CHARS;
    private static final char[] TEXT_BASIC_SET_CHARS;
    private static final char[] TEXT_SHIFT2_SET_CHARS;
    private static final char[] TEXT_SHIFT3_SET_CHARS;

    static {
        char[] cArray;
        char[] cArray2;
        char[] cArray3;
        int n3 = 40;
        char[] cArray4 = cArray3 = new char[n3];
        char[] cArray5 = cArray3;
        cArray4[0] = 42;
        cArray5[1] = 42;
        cArray4[2] = 42;
        cArray5[3] = 32;
        cArray4[4] = 48;
        cArray5[5] = 49;
        cArray4[6] = 50;
        cArray5[7] = 51;
        cArray4[8] = 52;
        cArray5[9] = 53;
        cArray4[10] = 54;
        cArray5[11] = 55;
        cArray4[12] = 56;
        cArray5[13] = 57;
        cArray4[14] = 65;
        cArray5[15] = 66;
        cArray4[16] = 67;
        cArray5[17] = 68;
        cArray4[18] = 69;
        cArray5[19] = 70;
        cArray4[20] = 71;
        cArray5[21] = 72;
        cArray4[22] = 73;
        cArray5[23] = 74;
        cArray4[24] = 75;
        cArray5[25] = 76;
        cArray4[26] = 77;
        cArray5[27] = 78;
        cArray4[28] = 79;
        cArray5[29] = 80;
        cArray4[30] = 81;
        cArray5[31] = 82;
        cArray4[32] = 83;
        cArray5[33] = 84;
        cArray4[34] = 85;
        cArray5[35] = 86;
        cArray4[36] = 87;
        cArray5[37] = 88;
        cArray4[38] = 89;
        cArray5[39] = 90;
        C40_BASIC_SET_CHARS = cArray3;
        char[] cArray6 = cArray3 = new char[27];
        char[] cArray7 = cArray3;
        cArray6[0] = 33;
        cArray7[1] = 34;
        cArray6[2] = 35;
        cArray7[3] = 36;
        cArray6[4] = 37;
        cArray7[5] = 38;
        cArray6[6] = 39;
        cArray7[7] = 40;
        cArray6[8] = 41;
        cArray7[9] = 42;
        cArray6[10] = 43;
        cArray7[11] = 44;
        cArray6[12] = 45;
        cArray7[13] = 46;
        cArray6[14] = 47;
        cArray7[15] = 58;
        cArray6[16] = 59;
        cArray7[17] = 60;
        cArray6[18] = 61;
        cArray7[19] = 62;
        cArray6[20] = 63;
        cArray7[21] = 64;
        cArray6[22] = 91;
        cArray7[23] = 92;
        cArray6[24] = 93;
        cArray7[25] = 94;
        cArray7[26] = 95;
        C40_SHIFT2_SET_CHARS = cArray3;
        char[] cArray8 = cArray2 = new char[n3];
        char[] cArray9 = cArray2;
        cArray8[0] = 42;
        cArray9[1] = 42;
        cArray8[2] = 42;
        cArray9[3] = 32;
        cArray8[4] = 48;
        cArray9[5] = 49;
        cArray8[6] = 50;
        cArray9[7] = 51;
        cArray8[8] = 52;
        cArray9[9] = 53;
        cArray8[10] = 54;
        cArray9[11] = 55;
        cArray8[12] = 56;
        cArray9[13] = 57;
        cArray8[14] = 97;
        cArray9[15] = 98;
        cArray8[16] = 99;
        cArray9[17] = 100;
        cArray8[18] = 101;
        cArray9[19] = 102;
        cArray8[20] = 103;
        cArray9[21] = 104;
        cArray8[22] = 105;
        cArray9[23] = 106;
        cArray8[24] = 107;
        cArray9[25] = 108;
        cArray8[26] = 109;
        cArray9[27] = 110;
        cArray8[28] = 111;
        cArray9[29] = 112;
        cArray8[30] = 113;
        cArray9[31] = 114;
        cArray8[32] = 115;
        cArray9[33] = 116;
        cArray8[34] = 117;
        cArray9[35] = 118;
        cArray8[36] = 119;
        cArray9[37] = 120;
        cArray8[38] = 121;
        cArray9[39] = 122;
        TEXT_BASIC_SET_CHARS = cArray2;
        TEXT_SHIFT2_SET_CHARS = cArray3;
        char[] cArray10 = cArray = new char[32];
        char[] cArray11 = cArray;
        cArray10[0] = 96;
        cArray11[1] = 65;
        cArray10[2] = 66;
        cArray11[3] = 67;
        cArray10[4] = 68;
        cArray11[5] = 69;
        cArray10[6] = 70;
        cArray11[7] = 71;
        cArray10[8] = 72;
        cArray11[9] = 73;
        cArray10[10] = 74;
        cArray11[11] = 75;
        cArray10[12] = 76;
        cArray11[13] = 77;
        cArray10[14] = 78;
        cArray11[15] = 79;
        cArray10[16] = 80;
        cArray11[17] = 81;
        cArray10[18] = 82;
        cArray11[19] = 83;
        cArray10[20] = 84;
        cArray11[21] = 85;
        cArray10[22] = 86;
        cArray11[23] = 87;
        cArray10[24] = 88;
        cArray11[25] = 89;
        cArray10[26] = 90;
        cArray11[27] = 123;
        cArray10[28] = 124;
        cArray11[29] = 125;
        cArray10[30] = 126;
        cArray11[31] = 127;
        TEXT_SHIFT3_SET_CHARS = cArray;
    }

    private DecodedBitStreamParser() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static DecoderResult decode(byte[] byArray) {
        int n3;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode;
        Object object = new BitSource(byArray);
        int n4 = 100;
        StringBuilder stringBuilder = new StringBuilder(n4);
        StringBuilder stringBuilder2 = new StringBuilder(0);
        int n7 = 1;
        ArrayList arrayList = new ArrayList(n7);
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode2 = DecodedBitStreamParser$Mode.ASCII_ENCODE;
        do {
            if (decodedBitStreamParser$Mode2 == (decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.ASCII_ENCODE)) {
                decodedBitStreamParser$Mode2 = DecodedBitStreamParser.decodeAsciiSegment((BitSource)object, stringBuilder, stringBuilder2);
                continue;
            }
            int[] nArray = DecodedBitStreamParser$1.$SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode;
            int n8 = decodedBitStreamParser$Mode2.ordinal();
            if ((n8 = nArray[n8]) != n7) {
                int n10 = 2;
                if (n8 != n10) {
                    n10 = 3;
                    if (n8 != n10) {
                        n10 = 4;
                        if (n8 != n10) {
                            n10 = 5;
                            if (n8 != n10) throw FormatException.getFormatInstance();
                            DecodedBitStreamParser.decodeBase256Segment((BitSource)object, stringBuilder, arrayList);
                        } else {
                            DecodedBitStreamParser.decodeEdifactSegment((BitSource)object, stringBuilder);
                        }
                    } else {
                        DecodedBitStreamParser.decodeAnsiX12Segment((BitSource)object, stringBuilder);
                    }
                } else {
                    DecodedBitStreamParser.decodeTextSegment((BitSource)object, stringBuilder);
                }
            } else {
                DecodedBitStreamParser.decodeC40Segment((BitSource)object, stringBuilder);
            }
            decodedBitStreamParser$Mode2 = decodedBitStreamParser$Mode;
        } while (decodedBitStreamParser$Mode2 != (decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.PAD_ENCODE) && (n3 = ((BitSource)object).available()) > 0);
        int n14 = stringBuilder2.length();
        if (n14 > 0) {
            stringBuilder.append((CharSequence)stringBuilder2);
        }
        String string2 = stringBuilder.toString();
        n4 = (int)(arrayList.isEmpty() ? 1 : 0);
        n7 = 0;
        if (n4 == 0) return new DecoderResult(byArray, string2, arrayList, null);
        arrayList = null;
        return new DecoderResult(byArray, string2, arrayList, null);
    }

    private static void decodeAnsiX12Segment(BitSource bitSource, StringBuilder stringBuilder) {
        int n3;
        int n4 = 3;
        int[] nArray = new int[n4];
        do {
            int n7;
            int n8;
            if ((n3 = bitSource.available()) == (n8 = 8)) {
                return;
            }
            n3 = bitSource.readBits(n8);
            if (n3 == (n7 = 254)) {
                return;
            }
            n8 = bitSource.readBits(n8);
            DecodedBitStreamParser.parseTwoBytes(n3, n8, nArray);
            for (n3 = 0; n3 < n4; ++n3) {
                n8 = nArray[n3];
                if (n8 != 0) {
                    n7 = 1;
                    if (n8 != n7) {
                        n7 = 2;
                        if (n8 != n7) {
                            if (n8 != n4) {
                                n7 = 14;
                                if (n8 < n7) {
                                    n8 = (char)(n8 + 44);
                                    stringBuilder.append((char)n8);
                                    continue;
                                }
                                n7 = 40;
                                if (n8 < n7) {
                                    n8 = (char)(n8 + 51);
                                    stringBuilder.append((char)n8);
                                    continue;
                                }
                                throw FormatException.getFormatInstance();
                            }
                            n8 = 32;
                            stringBuilder.append((char)n8);
                            continue;
                        }
                        n8 = 62;
                        stringBuilder.append((char)n8);
                        continue;
                    }
                    n8 = 42;
                    stringBuilder.append((char)n8);
                    continue;
                }
                n8 = 13;
                stringBuilder.append((char)n8);
            }
        } while ((n3 = bitSource.available()) > 0);
    }

    /*
     * Unable to fully structure code
     */
    private static DecodedBitStreamParser$Mode decodeAsciiSegment(BitSource var0, StringBuilder var1_1, StringBuilder var2_2) {
        var3_3 = false;
        block12: while ((var4_4 = var0.readBits(8)) != '\u0000') {
            block18: {
                var5_5 = '\u0001';
                var6_6 = '\u0080';
                if (var4_4 <= var6_6) {
                    if (var3_3) {
                        var4_4 += 128;
                    }
                    var7_9 = (char)(var4_4 - var5_5);
                    var1_1.append(var7_9);
                    return DecodedBitStreamParser$Mode.ASCII_ENCODE;
                }
                var6_6 = '\u0081';
                if (var4_4 == var6_6) {
                    return DecodedBitStreamParser$Mode.PAD_ENCODE;
                }
                var6_6 = '\u00e5';
                if (var4_4 > var6_6) break block18;
                var5_5 = '\n';
                if ((var4_4 += -130) < var5_5) {
                    var5_5 = '0';
                    var1_1.append(var5_5);
                }
                var1_1.append((int)var4_4);
                ** GOTO lbl-1000
            }
            var8_7 = "\u001e\u0004";
            switch (var4_4) {
                default: {
                    var5_5 = '\u00fe';
                    if (var4_4 != var5_5 || (var4_4 = var0.available()) != '\u0000') {
                        throw FormatException.getFormatInstance();
                    }
                    ** GOTO lbl60
                }
                case '\u00f0': {
                    return DecodedBitStreamParser$Mode.EDIFACT_ENCODE;
                }
                case '\u00ef': {
                    return DecodedBitStreamParser$Mode.TEXT_ENCODE;
                }
                case '\u00ee': {
                    return DecodedBitStreamParser$Mode.ANSIX12_ENCODE;
                }
                case '\u00ed': {
                    var9_8 = "[)>\u001e06\u001d";
                    var1_1.append(var9_8);
                    var2_2.insert(0, var8_7);
                    ** GOTO lbl60
                }
                case '\u00ec': {
                    var9_8 = "[)>\u001e05\u001d";
                    var1_1.append(var9_8);
                    var2_2.insert(0, var8_7);
                    ** GOTO lbl60
                }
                case '\u00eb': {
                    var3_3 = true;
                    ** GOTO lbl60
                }
                case '\u00e8': {
                    var4_4 = '\u001d';
                    var1_1.append(var4_4);
                }
lbl60:
                // 6 sources

                case '\u00e9': 
                case '\u00ea': 
                case '\u00f1': lbl-1000:
                // 2 sources

                {
                    if ((var4_4 = var0.available()) > '\u0000') continue block12;
                    return DecodedBitStreamParser$Mode.ASCII_ENCODE;
                }
                case '\u00e7': {
                    return DecodedBitStreamParser$Mode.BASE256_ENCODE;
                }
                case '\u00e6': 
            }
            return DecodedBitStreamParser$Mode.C40_ENCODE;
        }
        throw FormatException.getFormatInstance();
    }

    private static void decodeBase256Segment(BitSource object, StringBuilder serializable, Collection object2) {
        int n3 = ((BitSource)object).getByteOffset();
        int n4 = n3 + 1;
        int n7 = 8;
        int n8 = ((BitSource)object).readBits(n7);
        int n10 = n3 + 2;
        if ((n4 = DecodedBitStreamParser.unrandomize255State(n8, n4)) == 0) {
            n3 = ((BitSource)object).available();
            n4 = n3 / 8;
        } else {
            n8 = 250;
            if (n4 >= n8) {
                n4 = (n4 + -249) * 250;
                n8 = ((BitSource)object).readBits(n7);
                n8 = DecodedBitStreamParser.unrandomize255State(n8, n10);
                n4 += n8;
                n10 = n3 += 3;
            }
        }
        if (n4 >= 0) {
            byte[] byArray = new byte[n4];
            for (n8 = 0; n8 < n4; ++n8) {
                int n14 = ((BitSource)object).available();
                if (n14 >= n7) {
                    n14 = ((BitSource)object).readBits(n7);
                    int n15 = n10 + 1;
                    byArray[n8] = n10 = (int)((byte)DecodedBitStreamParser.unrandomize255State(n14, n10));
                    n10 = n15;
                    continue;
                }
                throw FormatException.getFormatInstance();
            }
            object2.add(byArray);
            object2 = "ISO8859_1";
            try {
                object = new String(byArray, (String)object2);
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                String string2 = String.valueOf(unsupportedEncodingException);
                string2 = "Platform does not support required encoding: ".concat(string2);
                serializable = new IllegalStateException(string2);
                throw serializable;
            }
            ((StringBuilder)serializable).append((String)object);
            return;
        }
        throw FormatException.getFormatInstance();
    }

    /*
     * Unable to fully structure code
     */
    private static void decodeC40Segment(BitSource var0, StringBuilder var1_1) {
        var2_2 = 3;
        var3_3 = new int[var2_2];
        var4_4 = '\u0000';
        var5_5 = 0;
        var6_6 = null;
        do {
            if ((var7_7 = var0.available()) == (var8_8 = 8)) {
                return;
            }
            var7_7 = var0.readBits(var8_8);
            if (var7_7 == (var9_9 = 254)) {
                return;
            }
            var8_8 = var0.readBits(var8_8);
            DecodedBitStreamParser.parseTwoBytes(var7_7, var8_8, var3_3);
            block1: for (var7_7 = 0; var7_7 < var2_2; ++var7_7) {
                block14: {
                    block15: {
                        block18: {
                            block19: {
                                block16: {
                                    block17: {
                                        var8_8 = var3_3[var7_7];
                                        if (var5_5 == 0) break block14;
                                        var9_9 = 1;
                                        if (var5_5 == var9_9) break block15;
                                        var10_10 = 2;
                                        if (var5_5 != var10_10) {
                                            if (var5_5 == var2_2) {
                                                if (var4_4 != '\u0000') {
                                                    var4_4 = (char)(var8_8 += 224);
                                                    var1_1.append(var4_4);
lbl26:
                                                    // 3 sources

                                                    while (true) {
                                                        var4_4 = '\u0000';
                                                        break;
                                                    }
                                                } else {
                                                    var5_5 = (char)(var8_8 += 96);
                                                    var1_1.append((char)var5_5);
                                                }
lbl32:
                                                // 6 sources

                                                while (true) {
                                                    var5_5 = 0;
                                                    var6_6 = null;
                                                    continue block1;
                                                    break;
                                                }
                                            }
                                            throw FormatException.getFormatInstance();
                                        }
                                        var6_6 = DecodedBitStreamParser.C40_SHIFT2_SET_CHARS;
                                        var10_10 = var6_6.length;
                                        if (var8_8 >= var10_10) break block16;
                                        var5_5 = var6_6[var8_8];
                                        if (var4_4 == '\u0000') break block17;
                                        var4_4 = (char)(var5_5 += 128);
                                        var1_1.append(var4_4);
                                        ** GOTO lbl26
                                    }
                                    var1_1.append((char)var5_5);
                                    ** GOTO lbl32
                                }
                                var5_5 = 27;
                                if (var8_8 == var5_5) break block18;
                                var4_4 = (char)30;
                                if (var8_8 != var4_4) break block19;
                                var4_4 = '\u0001';
                                ** GOTO lbl32
                            }
                            throw FormatException.getFormatInstance();
                        }
                        var5_5 = 29;
                        var1_1.append((char)var5_5);
                        ** GOTO lbl32
                    }
                    if (var4_4 != '\u0000') {
                        var4_4 = (char)(var8_8 += 128);
                        var1_1.append(var4_4);
                        ** continue;
                    }
                    var5_5 = (char)var8_8;
                    var1_1.append((char)var5_5);
                    ** continue;
                }
                if (var8_8 < var2_2) {
                    var5_5 = ++var8_8;
                    continue;
                }
                var11_11 = DecodedBitStreamParser.C40_BASIC_SET_CHARS;
                var10_10 = var11_11.length;
                if (var8_8 < var10_10) {
                    var8_8 = var11_11[var8_8];
                    if (var4_4 != '\u0000') {
                        var4_4 = (char)(var8_8 += 128);
                        var1_1.append(var4_4);
                        var4_4 = '\u0000';
                        continue;
                    }
                    var1_1.append((char)var8_8);
                    continue;
                }
                throw FormatException.getFormatInstance();
            }
        } while ((var7_7 = var0.available()) > 0);
    }

    private static void decodeEdifactSegment(BitSource bitSource, StringBuilder stringBuilder) {
        int n3;
        do {
            int n4;
            if ((n3 = bitSource.available()) <= (n4 = 16)) {
                return;
            }
            for (n3 = 0; n3 < (n4 = 4); ++n3) {
                int n7;
                n4 = bitSource.readBits(6);
                if (n4 == (n7 = 31)) {
                    int n8 = bitSource.getBitOffset();
                    n3 = 8;
                    if ((n8 = 8 - n8) != n3) {
                        bitSource.readBits(n8);
                    }
                    return;
                }
                n7 = n4 & 0x20;
                if (n7 == 0) {
                    n4 |= 0x40;
                }
                n4 = (char)n4;
                stringBuilder.append((char)n4);
            }
        } while ((n3 = bitSource.available()) > 0);
    }

    /*
     * Unable to fully structure code
     */
    private static void decodeTextSegment(BitSource var0, StringBuilder var1_1) {
        var2_2 = 3;
        var3_3 = new int[var2_2];
        var4_4 = '\u0000';
        var5_5 = 0;
        var6_6 = null;
        do {
            if ((var7_7 = var0.available()) == (var8_8 = 8)) {
                return;
            }
            var7_7 = var0.readBits(var8_8);
            if (var7_7 == (var9_9 = 254)) {
                return;
            }
            var8_8 = var0.readBits(var8_8);
            DecodedBitStreamParser.parseTwoBytes(var7_7, var8_8, var3_3);
            block1: for (var7_7 = 0; var7_7 < var2_2; ++var7_7) {
                block15: {
                    block16: {
                        block19: {
                            block20: {
                                block17: {
                                    block18: {
                                        var8_8 = var3_3[var7_7];
                                        if (var5_5 == 0) break block15;
                                        var9_9 = 1;
                                        if (var5_5 == var9_9) break block16;
                                        var10_10 = 2;
                                        if (var5_5 != var10_10) {
                                            if (var5_5 == var2_2) {
                                                var6_6 = DecodedBitStreamParser.TEXT_SHIFT3_SET_CHARS;
                                                var9_9 = var6_6.length;
                                                if (var8_8 < var9_9) {
                                                    var5_5 = var6_6[var8_8];
                                                    if (var4_4 != '\u0000') {
                                                        var4_4 = (char)(var5_5 += 128);
                                                        var1_1.append(var4_4);
lbl30:
                                                        // 3 sources

                                                        while (true) {
                                                            var4_4 = '\u0000';
                                                            break;
                                                        }
                                                    } else {
                                                        var1_1.append((char)var5_5);
                                                    }
lbl35:
                                                    // 6 sources

                                                    while (true) {
                                                        var5_5 = 0;
                                                        var6_6 = null;
                                                        continue block1;
                                                        break;
                                                    }
                                                }
                                                throw FormatException.getFormatInstance();
                                            }
                                            throw FormatException.getFormatInstance();
                                        }
                                        var6_6 = DecodedBitStreamParser.TEXT_SHIFT2_SET_CHARS;
                                        var10_10 = var6_6.length;
                                        if (var8_8 >= var10_10) break block17;
                                        var5_5 = var6_6[var8_8];
                                        if (var4_4 == '\u0000') break block18;
                                        var4_4 = (char)(var5_5 += 128);
                                        var1_1.append(var4_4);
                                        ** GOTO lbl30
                                    }
                                    var1_1.append((char)var5_5);
                                    ** GOTO lbl35
                                }
                                var5_5 = 27;
                                if (var8_8 == var5_5) break block19;
                                var4_4 = (char)30;
                                if (var8_8 != var4_4) break block20;
                                var4_4 = '\u0001';
                                ** GOTO lbl35
                            }
                            throw FormatException.getFormatInstance();
                        }
                        var5_5 = 29;
                        var1_1.append((char)var5_5);
                        ** GOTO lbl35
                    }
                    if (var4_4 != '\u0000') {
                        var4_4 = (char)(var8_8 += 128);
                        var1_1.append(var4_4);
                        ** continue;
                    }
                    var5_5 = (char)var8_8;
                    var1_1.append((char)var5_5);
                    ** continue;
                }
                if (var8_8 < var2_2) {
                    var5_5 = ++var8_8;
                    continue;
                }
                var11_11 = DecodedBitStreamParser.TEXT_BASIC_SET_CHARS;
                var10_10 = var11_11.length;
                if (var8_8 < var10_10) {
                    var8_8 = var11_11[var8_8];
                    if (var4_4 != '\u0000') {
                        var4_4 = (char)(var8_8 += 128);
                        var1_1.append(var4_4);
                        var4_4 = '\u0000';
                        continue;
                    }
                    var1_1.append((char)var8_8);
                    continue;
                }
                throw FormatException.getFormatInstance();
            }
        } while ((var7_7 = var0.available()) > 0);
    }

    private static void parseTwoBytes(int n3, int n4, int[] nArray) {
        int n7;
        n3 = (n3 << 8) + n4;
        n4 = 1;
        nArray[0] = n7 = (n3 -= n4) / 1600;
        nArray[n4] = n7 = (n3 -= (n7 *= 1600)) / 40;
        nArray[2] = n3 -= (n7 *= 40);
    }

    private static int unrandomize255State(int n3, int n4) {
        if ((n3 -= (n4 = n4 * 149 % 255 + 1)) >= 0) {
            return n3;
        }
        return n3 + 256;
    }
}

