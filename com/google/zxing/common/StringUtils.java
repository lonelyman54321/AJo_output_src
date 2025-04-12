/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.util.Map;

public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS = false;
    private static final String EUC_JP = "EUC_JP";
    public static final String GB2312 = "GB2312";
    private static final String ISO88591 = "ISO8859_1";
    private static final String PLATFORM_DEFAULT_ENCODING;
    public static final String SHIFT_JIS = "SJIS";
    private static final String UTF8 = "UTF8";

    static {
        boolean bl2;
        String string2;
        PLATFORM_DEFAULT_ENCODING = string2 = Charset.defaultCharset().name();
        String string3 = SHIFT_JIS;
        boolean bl3 = string3.equalsIgnoreCase(string2);
        if (!bl3 && !(bl2 = (string3 = EUC_JP).equalsIgnoreCase(string2))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        ASSUME_SHIFT_JIS = bl2;
    }

    private StringUtils() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String guessEncoding(byte[] var0, Map var1_1) {
        block39: {
            block41: {
                block40: {
                    var2_2 /* !! */  = var0;
                    var3_3 = var1_1;
                    if (var1_1 != null && (var5_5 = var1_1.containsKey((Object)(var4_4 /* !! */  = DecodeHintType.CHARACTER_SET))) != 0) {
                        return var1_1.get((Object)var4_4 /* !! */ ).toString();
                    }
                    var6_6 = var2_2 /* !! */ .length;
                    var7_7 = var2_2 /* !! */ .length;
                    var5_5 = 2;
                    var8_8 = 3;
                    var9_9 = 1;
                    var10_10 = 0;
                    if (var7_7 > var8_8 && (var7_7 = var2_2 /* !! */ [0]) == (var11_11 = -17) && (var7_7 = var2_2 /* !! */ [var9_9]) == (var11_11 = -69) && (var7_7 = var2_2 /* !! */ [var5_5]) == (var11_11 = -65)) {
                        var7_7 = 1;
                    } else {
                        var7_7 = 0;
                        var4_4 /* !! */  = null;
                    }
                    var5_5 = 0;
                    var11_11 = 1;
                    var12_12 = true;
                    var13_13 = 0;
                    var14_14 = 0;
                    var15_15 = 0;
                    var16_16 = 0;
                    var17_17 = 0;
                    var18_18 = 0;
                    var19_19 = 0;
                    var20_20 = 0;
                    var21_21 = 0;
                    var22_22 = 0;
                    while (true) {
                        block31: {
                            block38: {
                                block36: {
                                    block37: {
                                        block35: {
                                            block33: {
                                                block34: {
                                                    block32: {
                                                        if (var13_13 >= var6_6 || var9_9 == 0 && var11_11 == 0 && !var12_12) break;
                                                        var8_8 = var2_2 /* !! */ [var13_13];
                                                        var24_24 = var8_8 & 255;
                                                        if (!var12_12) break block32;
                                                        if (var14_14 <= 0) break block33;
                                                        if ((var8_8 &= 128) == 0) break block34;
                                                        var14_14 += -1;
                                                    }
                                                    var23_23 = var6_6;
                                                    break block35;
                                                }
                                                var23_23 = var6_6;
                                                ** GOTO lbl-1000
                                            }
                                            var23_23 = var6_6;
                                            var6_6 = var8_8 & 128;
                                            if (var6_6 == 0) break block35;
                                            var6_6 = var8_8 & 64;
                                            if (var6_6 == 0) ** GOTO lbl-1000
                                            var6_6 = var14_14 + 1;
                                            var25_25 = var8_8 & 32;
                                            if (var25_25 == 0) {
                                                ++var16_16;
lbl53:
                                                // 2 sources

                                                while (true) {
                                                    var14_14 = var6_6;
                                                    break;
                                                }
                                            } else {
                                                var6_6 = var14_14 + 2;
                                                var25_25 = var8_8 & 16;
                                                if (var25_25 == 0) {
                                                    ++var17_17;
                                                    ** continue;
                                                }
                                                var14_14 += 3;
                                                var6_6 = var8_8 & 8;
                                                if (var6_6 == 0) {
                                                    ++var18_18;
                                                } else lbl-1000:
                                                // 3 sources

                                                {
                                                    var12_12 = false;
                                                }
                                            }
                                        }
                                        var6_6 = 160;
                                        var8_8 = 127;
                                        if (var9_9 != 0) {
                                            if (var24_24 > var8_8 && var24_24 < var6_6) {
                                                var9_9 = 0;
                                            } else {
                                                var6_6 = 159;
                                                if (var24_24 > var6_6 && (var24_24 < (var6_6 = 192) || var24_24 == (var6_6 = 215) || var24_24 == (var6_6 = 247))) {
                                                    ++var20_20;
                                                }
                                            }
                                        }
                                        if (var11_11 == 0) break block31;
                                        if (var15_15 <= 0) break block36;
                                        var6_6 = 64;
                                        if (var24_24 < var6_6 || var24_24 == var8_8 || var24_24 > (var6_6 = 252)) break block37;
                                        var15_15 += -1;
                                        break block31;
                                    }
                                    while (true) {
                                        var11_11 = 0;
                                        break block31;
                                        break;
                                    }
                                }
                                if (var24_24 == (var6_6 = 128) || var24_24 == (var6_6 = 160) || var24_24 > (var8_8 = 239)) ** continue;
                                if (var24_24 > var6_6 && var24_24 < (var6_6 = 224)) {
                                    ++var5_5;
                                    var24_24 = var22_22 + 1;
                                    if (var24_24 > var19_19) {
                                        var19_19 = var24_24;
                                        var22_22 = var24_24;
lbl95:
                                        // 2 sources

                                        while (true) {
                                            var21_21 = 0;
                                            break block31;
                                            break;
                                        }
                                    }
                                    var22_22 = var24_24;
                                    ** continue;
                                }
                                var6_6 = 127;
                                if (var24_24 <= var6_6) break block38;
                                ++var15_15;
                                var24_24 = var21_21 + 1;
                                if (var24_24 > var10_10) {
                                    var10_10 = var24_24;
                                    var21_21 = var24_24;
lbl107:
                                    // 3 sources

                                    while (true) {
                                        var22_22 = 0;
                                        break block31;
                                        break;
                                    }
                                }
                                var21_21 = var24_24;
                                ** GOTO lbl107
                            }
                            var21_21 = 0;
                            ** continue;
                        }
                        ++var13_13;
                        var2_2 /* !! */  = var0;
                        var6_6 = var23_23;
                        var8_8 = 3;
                    }
                    var23_23 = var6_6;
                    if (var12_12 && var14_14 > 0) {
                        var12_12 = false;
                    }
                    if (var11_11 != 0 && var15_15 > 0) {
                        var11_11 = 0;
                    }
                    var2_2 /* !! */  = (byte[])"UTF8";
                    if (var12_12 && (var7_7 != 0 || (var16_16 = var16_16 + var17_17 + var18_18) > 0)) {
                        return var2_2 /* !! */ ;
                    }
                    var3_3 = "SJIS";
                    if (var11_11 != 0 && ((var7_7 = (int)StringUtils.ASSUME_SHIFT_JIS) != 0 || var19_19 >= (var7_7 = 3) || var10_10 >= var7_7)) {
                        return var3_3;
                    }
                    var4_4 /* !! */  = "ISO8859_1";
                    if (var9_9 == 0 || var11_11 == 0) break block39;
                    var8_8 = 2;
                    if (var19_19 == var8_8 && var5_5 == var8_8) break block40;
                    var24_24 = var20_20 * 10;
                    var5_5 = var23_23;
                    if (var24_24 < var23_23) break block41;
                }
                return var3_3;
            }
            return var4_4 /* !! */ ;
        }
        if (var9_9 != 0) {
            return var4_4 /* !! */ ;
        }
        if (var11_11 != 0) {
            return var3_3;
        }
        if (var12_12) {
            return var2_2 /* !! */ ;
        }
        return StringUtils.PLATFORM_DEFAULT_ENCODING;
    }
}

