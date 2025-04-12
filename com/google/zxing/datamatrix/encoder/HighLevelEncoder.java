/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import com.google.zxing.datamatrix.encoder.ASCIIEncoder;
import com.google.zxing.datamatrix.encoder.Base256Encoder;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.google.zxing.datamatrix.encoder.EdifactEncoder;
import com.google.zxing.datamatrix.encoder.Encoder;
import com.google.zxing.datamatrix.encoder.EncoderContext;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.datamatrix.encoder.TextEncoder;
import com.google.zxing.datamatrix.encoder.X12Encoder;
import java.io.Serializable;
import java.util.Arrays;

public final class HighLevelEncoder {
    static final int ASCII_ENCODATION = 0;
    static final int BASE256_ENCODATION = 5;
    static final int C40_ENCODATION = 1;
    static final char C40_UNLATCH = '\u00fe';
    static final int EDIFACT_ENCODATION = 4;
    static final char LATCH_TO_ANSIX12 = '\u00ee';
    static final char LATCH_TO_BASE256 = '\u00e7';
    static final char LATCH_TO_C40 = '\u00e6';
    static final char LATCH_TO_EDIFACT = '\u00f0';
    static final char LATCH_TO_TEXT = '\u00ef';
    private static final char MACRO_05 = '\u00ec';
    private static final String MACRO_05_HEADER = "[)>\u001e05\u001d";
    private static final char MACRO_06 = '\u00ed';
    private static final String MACRO_06_HEADER = "[)>\u001e06\u001d";
    private static final String MACRO_TRAILER = "\u001e\u0004";
    private static final char PAD = '\u0081';
    static final int TEXT_ENCODATION = 2;
    static final char UPPER_SHIFT = '\u00eb';
    static final int X12_ENCODATION = 3;
    static final char X12_UNLATCH = '\u00fe';

    private HighLevelEncoder() {
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int n3) {
        int n4 = charSequence.length();
        int n7 = 0;
        if (n3 < n4) {
            boolean bl2;
            char c2 = charSequence.charAt(n3);
            while ((bl2 = HighLevelEncoder.isDigit(c2)) && n3 < n4) {
                ++n7;
                if (++n3 >= n4) continue;
                c2 = charSequence.charAt(n3);
            }
        }
        return n7;
    }

    public static String encodeHighLevel(String string2) {
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        return HighLevelEncoder.encodeHighLevel(string2, symbolShapeHint, null, null);
    }

    public static String encodeHighLevel(String object, SymbolShapeHint object2, Dimension object3, Dimension dimension) {
        char c2;
        int n3;
        boolean bl2;
        ASCIIEncoder aSCIIEncoder = new ASCIIEncoder();
        C40Encoder c40Encoder = new C40Encoder();
        TextEncoder textEncoder = new TextEncoder();
        X12Encoder x12Encoder = new X12Encoder();
        Object object4 = new EdifactEncoder();
        Base256Encoder base256Encoder = new Base256Encoder();
        int n32 = 6;
        Encoder[] encoderArray = new Encoder[n32];
        int n4 = 0;
        encoderArray[0] = aSCIIEncoder;
        int n7 = 1;
        encoderArray[n7] = c40Encoder;
        int n8 = 2;
        encoderArray[n8] = textEncoder;
        encoderArray[3] = x12Encoder;
        int n10 = 4;
        encoderArray[n10] = object4;
        int n14 = 5;
        encoderArray[n14] = base256Encoder;
        object4 = new EncoderContext((String)object);
        ((EncoderContext)object4).setSymbolShape((SymbolShapeHint)((Object)object2));
        ((EncoderContext)object4).setSizeConstraints((Dimension)object3, dimension);
        object2 = MACRO_05_HEADER;
        boolean n15 = ((String)object).startsWith((String)object2);
        object3 = MACRO_TRAILER;
        if (n15 && (bl2 = ((String)object).endsWith((String)object3))) {
            int n16;
            ((EncoderContext)object4).writeCodeword('\u00ec');
            ((EncoderContext)object4).setSkipAtEnd(n8);
            ((EncoderContext)object4).pos = n16 = ((EncoderContext)object4).pos + 7;
        } else {
            boolean bl3;
            object2 = MACRO_06_HEADER;
            boolean bl4 = ((String)object).startsWith((String)object2);
            if (bl4 && (bl3 = ((String)object).endsWith((String)object3))) {
                int n17;
                ((EncoderContext)object4).writeCodeword('\u00ed');
                ((EncoderContext)object4).setSkipAtEnd(n8);
                ((EncoderContext)object4).pos = n17 = ((EncoderContext)object4).pos + 7;
            }
        }
        while ((n3 = ((EncoderContext)object4).hasMoreCharacters()) != 0) {
            object = encoderArray[n4];
            object.encode((EncoderContext)object4);
            n3 = ((EncoderContext)object4).getNewEncoding();
            if (n3 < 0) continue;
            n4 = ((EncoderContext)object4).getNewEncoding();
            ((EncoderContext)object4).resetEncoderSignal();
        }
        int n18 = ((EncoderContext)object4).getCodewordCount();
        ((EncoderContext)object4).updateSymbolInfo();
        object2 = ((EncoderContext)object4).getSymbolInfo();
        int n19 = ((SymbolInfo)object2).getDataCapacity();
        if (n18 < n19 && n4 != 0 && n4 != n14 && n4 != n10) {
            char c3 = '\u00fe';
            ((EncoderContext)object4).writeCodeword(c3);
        }
        object = ((EncoderContext)object4).getCodewords();
        int n20 = ((StringBuilder)object).length();
        char c5 = '\u0081';
        if (n20 < n19) {
            ((StringBuilder)object).append(c5);
        }
        while ((c2 = ((StringBuilder)object).length()) < n19) {
            char c2 = ((StringBuilder)object).length() + n7;
            c2 = HighLevelEncoder.randomize253State(c5, c2);
            ((StringBuilder)object).append(c2);
        }
        return ((EncoderContext)object4).getCodewords().toString();
    }

    private static int findMinimums(float[] fArray, int[] nArray, int n3, byte[] byArray) {
        Arrays.fill(byArray, (byte)0);
        int n4 = 0;
        while (true) {
            int n7 = 6;
            float f5 = 8.4E-45f;
            if (n4 >= n7) break;
            f5 = fArray[n4];
            double d2 = Math.ceil(f5);
            nArray[n4] = n7 = (int)d2;
            if (n3 > n7) {
                Arrays.fill(byArray, (byte)0);
                n3 = n7;
            }
            if (n3 == n7) {
                byArray[n4] = n7 = (int)((byte)(byArray[n4] + 1));
            }
            ++n4;
        }
        return n3;
    }

    private static int getMinimumCount(byte[] byArray) {
        int n3;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = 6); ++i3) {
            n3 = byArray[i3];
            n4 += n3;
        }
        return n4;
    }

    public static void illegalCharacter(char c2) {
        String string2 = Integer.toHexString(c2);
        Serializable serializable = new StringBuilder();
        int n3 = string2.length();
        n3 = 4 - n3;
        CharSequence charSequence = "0000".substring(0, n3);
        serializable.append((String)charSequence);
        serializable.append(string2);
        string2 = serializable.toString();
        charSequence = new StringBuilder("Illegal character: ");
        ((StringBuilder)charSequence).append(c2);
        ((StringBuilder)charSequence).append(" (0x");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(')');
        String string3 = ((StringBuilder)charSequence).toString();
        serializable = new IllegalArgumentException(string3);
        throw serializable;
    }

    public static boolean isDigit(char n3) {
        int n4 = 48;
        return n3 >= n4 && n3 <= (n4 = 57);
    }

    public static boolean isExtendedASCII(char n3) {
        int n4 = 128;
        return n3 >= n4 && n3 <= (n4 = 255);
    }

    private static boolean isNativeC40(char n3) {
        int n4 = 32;
        return n3 == n4 || n3 >= (n4 = 48) && n3 <= (n4 = 57) || n3 >= (n4 = 65) && n3 <= (n4 = 90);
        {
        }
    }

    private static boolean isNativeEDIFACT(char n3) {
        int n4 = 32;
        return n3 >= n4 && n3 <= (n4 = 94);
    }

    private static boolean isNativeText(char n3) {
        int n4 = 32;
        return n3 == n4 || n3 >= (n4 = 48) && n3 <= (n4 = 57) || n3 >= (n4 = 97) && n3 <= (n4 = 122);
        {
        }
    }

    private static boolean isNativeX12(char n3) {
        int n4 = HighLevelEncoder.isX12TermSep((char)n3);
        return n4 != 0 || n3 == (n4 = 32) || n3 >= (n4 = 48) && n3 <= (n4 = 57) || n3 >= (n4 = 65) && n3 <= (n4 = 90);
        {
        }
    }

    private static boolean isSpecialB256(char c2) {
        return false;
    }

    private static boolean isX12TermSep(char n3) {
        int n4 = 13;
        return n3 == n4 || n3 == (n4 = 42) || n3 == (n4 = 62);
        {
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int lookAheadTest(CharSequence var0, int var1_1, int var2_2) {
        var3_3 = var0;
        var4_4 /* !! */  = var1_1;
        var5_5 = var0.length();
        if (var1_1 >= var5_5) {
            return var2_2;
        }
        var5_5 = 0;
        var6_6 = 0.0f;
        var7_7 = 0x40000000;
        var8_8 = 2.0f;
        var9_9 = 6;
        var10_10 = 1.0f;
        var11_11 = 5;
        var12_12 = 2;
        var13_13 = 4;
        var14_14 = 5.6E-45f;
        var15_15 = 3;
        var16_16 = 4.2E-45f;
        var17_17 = 1;
        if (var2_2 == 0) {
            var18_18 = new float[var9_9];
            var18_18[0] = 0.0f;
            var18_18[var17_17] = var10_10;
            var18_18[var12_12] = var10_10;
            var18_18[var15_15] = var10_10;
            var18_18[var13_13] = var10_10;
            var5_5 = 1067450368;
            var18_18[var11_11] = var6_6 = 1.25f;
        } else {
            var18_18 = new float[var9_9];
            var18_18[0] = var10_10;
            var18_18[var17_17] = var8_8;
            var18_18[var12_12] = var8_8;
            var18_18[var15_15] = var8_8;
            var18_18[var13_13] = var8_8;
            var19_19 = 0x40100000;
            var18_18[var11_11] = var20_20 = 2.25f;
            var18_18[var2_2] = 0.0f;
        }
        var5_5 = 0;
        var6_6 = 0.0f;
        while (true) {
            block40: {
                block39: {
                    var19_19 = var4_4 /* !! */  + var5_5;
                    var21_21 = var0.length();
                    var22_22 = -1 >>> 1;
                    if (var19_19 == var21_21) {
                        var3_3 = new byte[var9_9];
                        var23_32 = new int[var9_9];
                        var5_5 = HighLevelEncoder.findMinimums(var18_18, var23_32, var22_22, (byte[])var3_3);
                        var7_7 = HighLevelEncoder.getMinimumCount((byte[])var3_3);
                        var4_4 /* !! */  = var23_32[0];
                        if (var4_4 /* !! */  == var5_5) {
                            return 0;
                        }
                        if (var7_7 == var17_17 && (var4_4 /* !! */  = (int)var3_3[var11_11]) > 0) {
                            return var11_11;
                        }
                        if (var7_7 == var17_17 && (var4_4 /* !! */  = (int)var3_3[var13_13]) > 0) {
                            return var13_13;
                        }
                        if (var7_7 == var17_17 && (var4_4 /* !! */  = (int)var3_3[var12_12]) > 0) {
                            return var12_12;
                        }
                        if (var7_7 == var17_17 && (var24_33 = var3_3[var15_15]) > 0) {
                            return var15_15;
                        }
                        return var17_17;
                    }
                    var19_19 = var3_3.charAt(var19_19);
                    ++var5_5;
                    var21_21 = (int)HighLevelEncoder.isDigit((char)var19_19);
                    if (var21_21 != 0) {
                        var25_23 = var18_18[0];
                        var26_24 = 0x3F000000;
                        var27_25 = 0.5f;
                        var18_18[0] = var25_23 += var27_25;
                    } else {
                        var21_21 = (int)HighLevelEncoder.isExtendedASCII((char)var19_19);
                        if (var21_21 != 0) {
                            var25_23 = var18_18[0];
                            var28_26 = Math.ceil(var25_23);
                            var18_18[0] = var14_14 = (float)var28_26;
                            var18_18[0] = var14_14 += var8_8;
                        } else {
                            var28_26 = Math.ceil(var18_18[0]);
                            var18_18[0] = var14_14 = (float)var28_26;
                            var18_18[0] = var14_14 += var10_10;
                        }
                    }
                    var13_13 = (int)HighLevelEncoder.isNativeC40((char)var19_19);
                    var15_15 = 1068149419;
                    var16_16 = 1.3333334f;
                    var21_21 = 1076538027;
                    var25_23 = 2.6666667f;
                    var30_27 = 0.6666667f;
                    var18_18[var17_17] = var13_13 != 0 ? (var14_14 = var18_18[var17_17] + var30_27) : ((var13_13 = (int)HighLevelEncoder.isExtendedASCII((char)var19_19)) != 0 ? (var14_14 = var18_18[var17_17] + var25_23) : (var14_14 = var18_18[var17_17] + var16_16));
                    var13_13 = (int)HighLevelEncoder.isNativeText((char)var19_19);
                    var18_18[var12_12] = var13_13 != 0 ? (var14_14 = var18_18[var12_12] + var30_27) : ((var13_13 = (int)HighLevelEncoder.isExtendedASCII((char)var19_19)) != 0 ? (var14_14 = var18_18[var12_12] + var25_23) : (var14_14 = var18_18[var12_12] + var16_16));
                    var13_13 = (int)HighLevelEncoder.isNativeX12((char)var19_19);
                    if (var13_13 != 0) {
                        var13_13 = 3;
                        var14_14 = 4.2E-45f;
                        var18_18[var13_13] = var16_16 = var18_18[var13_13] + var30_27;
                    } else {
                        var13_13 = 3;
                        var14_14 = 4.2E-45f;
                        var15_15 = (int)HighLevelEncoder.isExtendedASCII((char)var19_19);
                        if (var15_15 != 0) {
                            var16_16 = var18_18[var13_13];
                            var21_21 = 1082829483;
                            var25_23 = 4.3333335f;
                            var18_18[var13_13] = var16_16 += var25_23;
                        } else {
                            var16_16 = var18_18[var13_13];
                            var21_21 = 0x40555555;
                            var25_23 = 3.3333333f;
                            var18_18[var13_13] = var16_16 += var25_23;
                        }
                    }
                    var13_13 = (int)HighLevelEncoder.isNativeEDIFACT((char)var19_19);
                    if (var13_13 != 0) {
                        var13_13 = 4;
                        var14_14 = 5.6E-45f;
                        var16_16 = var18_18[var13_13];
                        var21_21 = 1061158912;
                        var25_23 = 0.75f;
                        var18_18[var13_13] = var16_16 += var25_23;
                    } else {
                        var13_13 = 4;
                        var14_14 = 5.6E-45f;
                        var15_15 = (int)HighLevelEncoder.isExtendedASCII((char)var19_19);
                        if (var15_15 != 0) {
                            var16_16 = var18_18[var13_13];
                            var21_21 = 0x40880000;
                            var25_23 = 4.25f;
                            var18_18[var13_13] = var16_16 += var25_23;
                        } else {
                            var16_16 = var18_18[var13_13];
                            var21_21 = 0x40500000;
                            var25_23 = 3.25f;
                            var18_18[var13_13] = var16_16 += var25_23;
                        }
                    }
                    var13_13 = (int)HighLevelEncoder.isSpecialB256((char)var19_19);
                    if (var13_13 != 0) {
                        var14_14 = var18_18[var11_11];
                        var15_15 = 0x40800000;
                        var16_16 = 4.0f;
                        var18_18[var11_11] = var14_14 += var16_16;
lbl136:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var18_18[var11_11] = var14_14 = var18_18[var11_11] + var10_10;
                    ** continue;
                    var13_13 = 4;
                    var14_14 = 5.6E-45f;
                    if (var5_5 < var13_13) ** GOTO lbl-1000
                    var31_28 = new int[var9_9];
                    var32_29 = new byte[var9_9];
                    HighLevelEncoder.findMinimums(var18_18, var31_28, var22_22, var32_29);
                    var19_19 = HighLevelEncoder.getMinimumCount(var32_29);
                    var21_21 = var31_28[0];
                    var22_22 = var31_28[var11_11];
                    if (var21_21 < var22_22 && var21_21 < (var7_7 = var31_28[var17_17]) && var21_21 < (var7_7 = var31_28[var12_12])) {
                        var7_7 = 3;
                        var8_8 = 4.2E-45f;
                        var9_9 = var31_28[var7_7];
                        if (var21_21 < var9_9) {
                            var7_7 = 4;
                            var8_8 = 5.6E-45f;
                            var9_9 = var31_28[var7_7];
                            if (var21_21 < var9_9) {
                                return 0;
                            }
                        }
                    }
                    if (var22_22 >= var21_21) {
                        var7_7 = var32_29[var17_17];
                        var9_9 = var32_29[var12_12];
                        var7_7 += var9_9;
                        var26_24 = 3;
                        var27_25 = 4.2E-45f;
                        var33_30 = var32_29[var26_24];
                        var7_7 += var33_30;
                        var34_31 = 4;
                        var15_15 = var32_29[var34_31];
                        if ((var7_7 += var15_15) != 0) {
                            if (var19_19 == var17_17 && var15_15 > 0) {
                                return var34_31;
                            }
                            if (var19_19 == var17_17 && var9_9 > 0) {
                                return var12_12;
                            }
                            if (var19_19 == var17_17 && var33_30 > 0) {
                                return 3;
                            }
                            var7_7 = var31_28[var17_17];
                            var9_9 = var7_7 + 1;
                            ** if (var9_9 >= var21_21 || (var9_9 = var7_7 + 1) >= var22_22) goto lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                var9_9 = var7_7 + 1;
                                var15_15 = 4;
                                var16_16 = 5.6E-45f;
                                var19_19 = var31_28[var15_15];
                                if (var9_9 < var19_19 && (var9_9 = var7_7 + 1) < (var19_19 = var31_28[var12_12])) {
                                    var9_9 = 3;
                                    var13_13 = var31_28[var9_9];
                                    if (var7_7 < var13_13) {
                                        return var17_17;
                                    } else {
                                        ** GOTO lbl189
                                    }
lbl189:
                                    // 2 sources

                                    if (var7_7 == var13_13) {
                                        for (var4_4 /* !! */  = var4_4 /* !! */  + var5_5 + var17_17; var4_4 /* !! */  < (var5_5 = var0.length()); ++var4_4 /* !! */ ) {
                                            var5_5 = (int)var3_3.charAt((int)var4_4 /* !! */ );
                                            var7_7 = (int)HighLevelEncoder.isX12TermSep((char)var5_5);
                                            if (var7_7 != 0) {
                                                return 3;
                                            } else {
                                                ** GOTO lbl195
                                            }
lbl195:
                                            // 2 sources

                                            var7_7 = 3;
                                            var8_8 = 4.2E-45f;
                                            if ((var5_5 = (int)HighLevelEncoder.isNativeX12((char)var5_5)) == 0) break;
                                        }
                                        return var17_17;
                                    } else {
                                        ** GOTO lbl200
                                    }
                                } else {
                                    ** GOTO lbl200
                                }
lbl200:
                                // 4 sources

                                var7_7 = 3;
                                var8_8 = 4.2E-45f;
                                ** GOTO lbl211
                            }
                        }
                    }
                    break block39;
lbl-1000:
                    // 2 sources

                    {
                        var7_7 = 3;
                        var8_8 = 4.2E-45f;
                        var15_15 = 4;
                        var16_16 = 5.6E-45f;
                    }
                    break block40;
                }
                return var11_11;
            }
            var7_7 = 0x40000000;
            var8_8 = 2.0f;
            var9_9 = 6;
            var13_13 = 4;
            var14_14 = 5.6E-45f;
            var15_15 = 3;
            var16_16 = 4.2E-45f;
        }
    }

    private static char randomize253State(char c2, int n3) {
        if ((n3 = n3 * 149 % 253 + 1 + c2) > (c2 = (char)254)) {
            n3 += -254;
        }
        return (char)n3;
    }
}

