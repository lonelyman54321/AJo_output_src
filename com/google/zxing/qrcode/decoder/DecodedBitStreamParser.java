/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.StringUtils;
import com.google.zxing.qrcode.decoder.DecodedBitStreamParser$1;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    private static final int GB2312_SUBSET = 1;

    private DecodedBitStreamParser() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static DecoderResult decode(byte[] var0, Version var1_1, ErrorCorrectionLevel var2_2, Map var3_3) {
        var4_4 = var1_1;
        var5_5 = new BitSource(var0);
        var6_6 = new StringBuilder(50);
        var8_8 = 1;
        var7_7 = new ArrayList<E>(var8_8);
        var9_9 /* !! */  = -1;
        var10_10 = 0;
        var11_11 /* !! */  = null;
        var12_12 = -1;
        var13_13 = -1;
        var14_14 = false;
        var15_15 = null;
        while (true) {
            block49: {
                block46: {
                    block47: {
                        block48: {
                            block45: {
                                var9_9 /* !! */  = var5_5.available();
                                var10_10 = 4;
                                if (var9_9 /* !! */  >= var10_10) break block45;
                                var16_16 /* !! */  = Mode.TERMINATOR;
lbl20:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var9_9 /* !! */  = var5_5.readBits(var10_10);
                            var16_16 /* !! */  = Mode.forBits(var9_9 /* !! */ );
                            ** continue;
                            var17_17 /* !! */  = var16_16 /* !! */ ;
                            var16_16 /* !! */  = (Mode)DecodedBitStreamParser$1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode;
                            var18_18 /* !! */  = var17_17 /* !! */ .ordinal();
                            var18_18 /* !! */  = (int)var16_16 /* !! */ [var18_18 /* !! */ ];
                            switch (var18_18 /* !! */ ) {
                                default: {
                                    var18_18 /* !! */  = var17_17 /* !! */ .getCharacterCountBits((Version)var4_4);
                                    var18_18 /* !! */  = var5_5.readBits(var18_18 /* !! */ );
                                    var19_19 = var17_17 /* !! */ .ordinal();
                                    var9_9 /* !! */  = (int)var16_16 /* !! */ [var19_19];
                                    if (var9_9 /* !! */  == var8_8) break block46;
                                    var19_19 = 2;
                                    if (var9_9 /* !! */  == var19_19) break block47;
                                    var19_19 = 3;
                                    if (var9_9 /* !! */  == var19_19) break block48;
                                    if (var9_9 /* !! */  != var10_10) break;
                                    DecodedBitStreamParser.decodeKanjiSegment((BitSource)var5_5, var6_6, var18_18 /* !! */ );
                                }
                                case 5: {
                                    var20_20 = var17_17 /* !! */ ;
                                    break block49;
                                }
                            }
                            var4_4 = FormatException.getFormatInstance();
                            throw var4_4;
                        }
                        var16_16 /* !! */  = var5_5;
                        var11_11 /* !! */  = var6_6;
                        var21_21 /* !! */  = var15_15;
                        var20_20 = var17_17 /* !! */ ;
                        var17_17 /* !! */  = var3_3;
                        DecodedBitStreamParser.decodeByteSegment((BitSource)var5_5, var6_6, var18_18 /* !! */ , var15_15, var7_7, var3_3);
                        break block49;
                    }
                    var20_20 = var17_17 /* !! */ ;
                    DecodedBitStreamParser.decodeAlphanumericSegment((BitSource)var5_5, var6_6, var18_18 /* !! */ , var14_14);
                    break block49;
                }
                var20_20 = var17_17 /* !! */ ;
                DecodedBitStreamParser.decodeNumericSegment((BitSource)var5_5, var6_6, var18_18 /* !! */ );
                break block49;
                {
                    case 10: {
                        var20_20 = var17_17 /* !! */ ;
                        var9_9 /* !! */  = var5_5.readBits(var10_10);
                        var10_10 = var17_17 /* !! */ .getCharacterCountBits((Version)var4_4);
                        var10_10 = var5_5.readBits(var10_10);
                        if (var9_9 /* !! */  != var8_8) break block49;
                        DecodedBitStreamParser.decodeHanziSegment((BitSource)var5_5, var6_6, var10_10);
                        break block49;
                    }
                    case 9: {
                        var20_20 = var17_17 /* !! */ ;
                        var9_9 /* !! */  = DecodedBitStreamParser.parseECIValue((BitSource)var5_5);
                        var15_15 = CharacterSetECI.getCharacterSetECIByValue(var9_9 /* !! */ );
                        if (var15_15 != null) break block49;
                        var4_4 = FormatException.getFormatInstance();
                        throw var4_4;
                    }
                    case 8: {
                        var20_20 = var17_17 /* !! */ ;
                        var9_9 /* !! */  = var5_5.available();
                        var10_10 = 16;
                        if (var9_9 /* !! */  < var10_10) ** GOTO lbl116
                        var9_9 /* !! */  = 8;
                        var10_10 = var5_5.readBits(var9_9 /* !! */ );
                        var13_13 = var9_9 /* !! */  = var5_5.readBits(var9_9 /* !! */ );
                        var12_12 = var10_10;
                        break block49;
lbl116:
                        // 2 sources

                        var4_4 = FormatException.getFormatInstance();
                        throw var4_4;
                    }
                    ** case 6:
                    ** case 7:
                }
lbl120:
                // 1 sources

                var20_20 = var17_17 /* !! */ ;
                var14_14 = true;
            }
            if (var20_20 != (var16_16 /* !! */  = Mode.TERMINATOR)) continue;
            break;
        }
        var11_11 /* !! */  = var6_6.toString();
        var22_22 = var7_7.isEmpty();
        if (var22_22) {
            var18_18 /* !! */  = 0;
            var23_23 = null;
        } else {
            var23_23 = var7_7;
        }
        if (var2_2 == null) {
            var19_19 = 0;
            var21_21 /* !! */  = null;
        } else {
            var21_21 /* !! */  = var4_4 = var2_2.toString();
        }
        var4_4 = var5_5;
        var16_16 /* !! */  = (Mode)var0;
        var5_5 = new DecoderResult(var0, var11_11 /* !! */ , var23_23, (String)var21_21 /* !! */ , var12_12, var13_13);
        return var5_5;
        catch (IllegalArgumentException v0) {
            throw FormatException.getFormatInstance();
        }
    }

    private static void decodeAlphanumericSegment(BitSource bitSource, StringBuilder stringBuilder, int n3, boolean n4) {
        char c2;
        char c3;
        char c5;
        int n7 = stringBuilder.length();
        while (n3 > (c5 = '\u0001')) {
            c5 = bitSource.available();
            if (c5 >= (c3 = '\u000b')) {
                c5 = bitSource.readBits(c3);
                c3 = DecodedBitStreamParser.toAlphaNumericChar(c5 / 45);
                stringBuilder.append(c3);
                c5 = DecodedBitStreamParser.toAlphaNumericChar(c5 % 45);
                stringBuilder.append(c5);
                n3 += -2;
                continue;
            }
            throw FormatException.getFormatInstance();
        }
        if (n3 == c5) {
            n3 = bitSource.available();
            if (n3 >= (c3 = '\u0006')) {
                c2 = DecodedBitStreamParser.toAlphaNumericChar(bitSource.readBits(c3));
                stringBuilder.append(c2);
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (n4 != 0) {
            while (n7 < (c2 = stringBuilder.length())) {
                c2 = stringBuilder.charAt(n7);
                if (c2 == (n3 = 37)) {
                    c2 = stringBuilder.length() - c5;
                    if (n7 < c2 && (n4 = stringBuilder.charAt(c2 = n7 + 1)) == n3) {
                        stringBuilder.deleteCharAt(c2);
                    } else {
                        c2 = '\u001d';
                        stringBuilder.setCharAt(n7, c2);
                    }
                }
                ++n7;
            }
        }
    }

    private static void decodeByteSegment(BitSource object, StringBuilder stringBuilder, int n3, CharacterSetECI characterSetECI, Collection collection, Map map2) {
        int n4 = n3 << 3;
        int n7 = ((BitSource)object).available();
        if (n4 <= n7) {
            String string2;
            byte[] byArray = new byte[n3];
            for (n7 = 0; n7 < n3; ++n7) {
                byte by2;
                byArray[n7] = by2 = (byte)((BitSource)object).readBits(8);
            }
            object = characterSetECI == null ? StringUtils.guessEncoding(byArray, map2) : characterSetECI.name();
            try {
                string2 = new String(byArray, (String)object);
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                throw FormatException.getFormatInstance();
            }
            stringBuilder.append(string2);
            collection.add(byArray);
            return;
        }
        throw FormatException.getFormatInstance();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void decodeHanziSegment(BitSource object, StringBuilder stringBuilder, int n3) {
        int n4 = n3 * 13;
        int n7 = ((BitSource)object).available();
        if (n4 > n7) {
            throw FormatException.getFormatInstance();
        }
        n4 = n3 * 2;
        byte[] byArray = new byte[n4];
        n7 = 0;
        while (n3 > 0) {
            int n8 = ((BitSource)object).readBits(13);
            int n10 = n8 / 96 << 8;
            n10 = (n8 = n8 % 96 | n10) < (n10 = 959) ? 41377 : 42657;
            n8 += n10;
            byArray[n7] = n10 = (int)((byte)(n8 >> 8));
            n10 = n7 + 1;
            byArray[n10] = n8 = (int)((byte)n8);
            n7 += 2;
            n3 += -1;
        }
        try {
            String string2 = "GB2312";
            object = new String(byArray, string2);
            stringBuilder.append((String)object);
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw FormatException.getFormatInstance();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void decodeKanjiSegment(BitSource object, StringBuilder stringBuilder, int n3) {
        int n4 = n3 * 13;
        int n7 = ((BitSource)object).available();
        if (n4 > n7) {
            throw FormatException.getFormatInstance();
        }
        n4 = n3 * 2;
        byte[] byArray = new byte[n4];
        n7 = 0;
        while (n3 > 0) {
            int n8 = ((BitSource)object).readBits(13);
            int n10 = n8 / 192 << 8;
            n10 = (n8 = n8 % 192 | n10) < (n10 = 7936) ? 33088 : 49472;
            n8 += n10;
            byArray[n7] = n10 = (int)((byte)(n8 >> 8));
            n10 = n7 + 1;
            byArray[n10] = n8 = (int)((byte)n8);
            n7 += 2;
            n3 += -1;
        }
        try {
            String string2 = "SJIS";
            object = new String(byArray, string2);
            stringBuilder.append((String)object);
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw FormatException.getFormatInstance();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void decodeNumericSegment(BitSource bitSource, StringBuilder stringBuilder, int n3) {
        char c2;
        char c3;
        while (true) {
            char c5;
            c3 = '\u0003';
            c2 = '\n';
            if (n3 < c3) break;
            c3 = bitSource.available();
            if (c3 < c2) throw FormatException.getFormatInstance();
            c3 = bitSource.readBits(c2);
            if (c3 >= (c5 = '\u03e8')) throw FormatException.getFormatInstance();
            c5 = DecodedBitStreamParser.toAlphaNumericChar(c3 / 100);
            stringBuilder.append(c5);
            c5 = c3 / 10 % c2;
            c2 = DecodedBitStreamParser.toAlphaNumericChar(c5);
            stringBuilder.append(c2);
            c3 = DecodedBitStreamParser.toAlphaNumericChar(c3 % 10);
            stringBuilder.append(c3);
            n3 += -3;
        }
        c3 = '\u0002';
        if (n3 == c3) {
            n3 = bitSource.available();
            if (n3 < (c3 = '\u0007')) throw FormatException.getFormatInstance();
            int n4 = bitSource.readBits(c3);
            if (n4 >= (n3 = 100)) throw FormatException.getFormatInstance();
            n3 = DecodedBitStreamParser.toAlphaNumericChar(n4 / 10);
            stringBuilder.append((char)n3);
            n4 = DecodedBitStreamParser.toAlphaNumericChar(n4 % c2);
            stringBuilder.append((char)n4);
            return;
        }
        c3 = '\u0001';
        if (n3 != c3) return;
        n3 = bitSource.available();
        if (n3 < (c3 = '\u0004')) throw FormatException.getFormatInstance();
        int n7 = bitSource.readBits(c3);
        if (n7 >= c2) throw FormatException.getFormatInstance();
        n7 = DecodedBitStreamParser.toAlphaNumericChar(n7);
        stringBuilder.append((char)n7);
    }

    private static int parseECIValue(BitSource bitSource) {
        int n3 = 8;
        int n4 = bitSource.readBits(n3);
        int n7 = n4 & 0x80;
        if (n7 == 0) {
            return n4 & 0x7F;
        }
        n7 = n4 & 0xC0;
        int n8 = 128;
        if (n7 == n8) {
            int n10 = bitSource.readBits(n3);
            n3 = (n4 & 0x3F) << 8;
            return n10 | n3;
        }
        n3 = n4 & 0xE0;
        n7 = 192;
        if (n3 == n7) {
            int n14 = bitSource.readBits(16);
            n3 = (n4 & 0x1F) << 16;
            return n14 | n3;
        }
        throw FormatException.getFormatInstance();
    }

    private static char toAlphaNumericChar(int n3) {
        char[] cArray = ALPHANUMERIC_CHARS;
        int n4 = cArray.length;
        if (n3 < n4) {
            return cArray[n3];
        }
        throw FormatException.getFormatInstance();
    }
}

