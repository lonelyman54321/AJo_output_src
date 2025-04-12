/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1;
import com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

final class DecodedBitStreamParser {
    private static final int AL = 28;
    private static final int AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final BigInteger[] EXP900;
    private static final int LL = 27;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final char[] MIXED_CHARS;
    private static final int ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;
    private static final int PL = 25;
    private static final int PS = 29;
    private static final char[] PUNCT_CHARS;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;

    static {
        int n3;
        PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
        MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
        BigInteger[] bigIntegerArray = new BigInteger[16];
        EXP900 = bigIntegerArray;
        BigInteger[] bigIntegerArray2 = BigInteger.ONE;
        bigIntegerArray[0] = bigIntegerArray2;
        long l2 = 900L;
        BigInteger bigInteger = BigInteger.valueOf(l2);
        int n4 = 1;
        bigIntegerArray[n4] = bigInteger;
        for (int i3 = 2; i3 < (n3 = (bigIntegerArray2 = EXP900).length); ++i3) {
            BigInteger bigInteger2;
            n3 = i3 + -1;
            bigIntegerArray2[i3] = bigInteger2 = bigIntegerArray2[n3].multiply(bigInteger);
        }
    }

    private DecodedBitStreamParser() {
    }

    /*
     * Unable to fully structure code
     */
    private static int byteCompaction(int var0, int[] var1_1, Charset var2_2, int var3_3, StringBuilder var4_4) {
        block28: {
            var5_5 = var0;
            var6_6 = new ByteArrayOutputStream();
            var7_7 = 901;
            var8_8 = 928;
            var9_9 = 900L;
            var11_10 = 900;
            var12_11 = 6;
            var13_12 = 0;
            if (var0 == var7_7) ** GOTO lbl53
            var7_7 = 924;
            if (var0 != var7_7) {
                var5_5 = var3_3;
            } else {
                var5_5 = var3_3;
                var7_7 = 0;
                var14_13 = null;
                block12: while (true) {
                    var15_14 = 0;
                    var16_15 = 0L;
                    while (var5_5 < (var18_16 = var1_1[0]) && var7_7 == 0) {
                        var18_16 = var5_5 + 1;
                        var19_17 = var1_1[var5_5];
                        if (var19_17 < var11_10) {
                            ++var15_14;
                            var16_15 *= var9_9;
                            var20_19 = var19_17;
                            var16_15 += var20_19;
lbl28:
                            // 2 sources

                            while (true) {
                                var5_5 = var18_16;
                                break;
                            }
                        } else {
                            if (var19_17 != var8_8) {
                                switch (var19_17) {
                                    default: {
                                        switch (var19_17) {
                                            default: {
                                                ** continue;
                                            }
                                            case 922: 
                                            case 923: 
                                            case 924: 
                                        }
                                    }
                                    case 900: 
                                    case 901: 
                                    case 902: 
                                }
                            }
                            var7_7 = 1;
                        }
                        if ((var19_17 = var15_14 % 5) != 0 || var15_14 <= 0) continue;
                        var19_17 = 0;
lbl42:
                        // 2 sources

                        while (true) {
                            if (var19_17 >= var12_11) continue block12;
                            break;
                        }
                    }
                    break block28;
                    break;
                }
                {
                    var22_20 = (5 - var19_17) * 8;
                    var20_19 = var16_15 >> var22_20;
                    var23_22 = (int)var20_19;
                    var22_20 = (byte)var23_22;
                    var6_6.write(var22_20);
                    ++var19_17;
                    ** continue;
                    break;
                }
lbl53:
                // 1 sources

                var24_24 = new int[var12_11];
                var7_7 = var3_3 + 1;
                var19_18 = var1_1[var3_3];
                var22_21 = false;
                block16: while (true) {
                    var23_23 = 0;
                    var25_25 = 0L;
                    block17: while (var7_7 < (var27_26 = var1_1[0]) && !var22_21) {
                        var27_26 = var23_23 + 1;
                        var24_24[var23_23] = var19_18;
                        var25_25 *= var9_9;
                        var9_9 = var19_18;
                        var25_25 += var9_9;
                        var28_27 = var7_7 + 1;
                        var19_18 = var1_1[var7_7];
                        if (var19_18 != var8_8) {
                            switch (var19_18) {
                                default: {
                                    switch (var19_18) {
                                        default: {
                                            var7_7 = var27_26 % 5;
                                            if (var7_7 == 0 && var27_26 > 0) {
                                                var14_13 = null;
                                                for (var7_7 = 0; var7_7 < var12_11; ++var7_7) {
                                                    var29_28 = (5 - var7_7) * 8;
                                                    var30_29 = var25_25 >> var29_28;
                                                    var29_28 = (byte)var30_29;
                                                    var6_6.write(var29_28);
                                                }
                                                var7_7 = var28_27;
                                                var9_9 = 900L;
                                                continue block16;
                                            }
                                            var7_7 = var28_27;
                                            var23_23 = var27_26;
                                            var9_9 = 900L;
                                            continue block17;
                                        }
                                        case 922: 
                                        case 923: 
                                        case 924: 
                                    }
                                }
                                case 900: 
                                case 901: 
                                case 902: 
                            }
                        }
                        var23_23 = var27_26;
                        var9_9 = 900L;
                        var22_21 = true;
                    }
                    break;
                }
                if (var7_7 == var27_26 && var19_18 < var11_10) {
                    var8_8 = var23_23 + 1;
                    var24_24[var23_23] = var19_18;
                    var23_23 = var8_8;
                }
                while (var13_12 < var23_23) {
                    var8_8 = (byte)var24_24[var13_12];
                    var6_6.write(var8_8);
                    ++var13_12;
                }
                var5_5 = var7_7;
            }
        }
        var6_6 = var6_6.toByteArray();
        var14_13 = new String((byte[])var6_6, var2_2);
        var6_6 = var4_4;
        var4_4.append(var14_13);
        return var5_5;
    }

    /*
     * Exception decompiling
     */
    public static DecoderResult decode(int[] var0, String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static String decodeBase900toBase10(int[] object, int n3) {
        int n4;
        int n7;
        BigInteger bigInteger = BigInteger.ZERO;
        int n8 = 0;
        while (true) {
            n7 = 1;
            if (n8 >= n3) break;
            Object object2 = EXP900;
            int n10 = n3 - n8 - n7;
            BigInteger bigInteger2 = object2[n10];
            Object object3 = object[n8];
            long l2 = (long)object3;
            object2 = BigInteger.valueOf(l2);
            bigInteger2 = bigInteger2.multiply((BigInteger)object2);
            bigInteger = bigInteger.add(bigInteger2);
            ++n8;
        }
        object = bigInteger.toString();
        n3 = ((String)object).charAt(0);
        if (n3 == (n4 = 49)) {
            return ((String)object).substring(n7);
        }
        throw FormatException.getFormatInstance();
    }

    public static int decodeMacroBlock(int[] nArray, int n3, PDF417ResultMetadata pDF417ResultMetadata) {
        int n4 = n3 + 2;
        int n7 = 0;
        int n8 = nArray[0];
        if (n4 <= n8) {
            int n10;
            n4 = 2;
            int[] nArray2 = new int[n4];
            int n14 = 0;
            while (n14 < n4) {
                nArray2[n14] = n10 = nArray[n3];
                ++n14;
                ++n3;
            }
            n4 = Integer.parseInt(DecodedBitStreamParser.decodeBase900toBase10(nArray2, n4));
            pDF417ResultMetadata.setSegmentIndex(n4);
            CharSequence charSequence = new StringBuilder();
            n3 = DecodedBitStreamParser.textCompaction(nArray, n3, charSequence);
            charSequence = charSequence.toString();
            pDF417ResultMetadata.setFileId((String)charSequence);
            n4 = nArray[n3];
            n8 = 923;
            n14 = -1;
            n4 = n4 == n8 ? n3 + 1 : -1;
            block10: while (n3 < (n10 = nArray[0])) {
                n10 = nArray[n3];
                int n15 = 922;
                if (n10 != n15) {
                    if (n10 == n8) {
                        CharSequence charSequence2;
                        n10 = n3 + 1;
                        n10 = nArray[n10];
                        switch (n10) {
                            default: {
                                throw FormatException.getFormatInstance();
                            }
                            case 6: {
                                charSequence2 = new StringBuilder();
                                n3 += 2;
                                n3 = DecodedBitStreamParser.numericCompaction(nArray, n3, charSequence2);
                                charSequence2 = charSequence2.toString();
                                n10 = Integer.parseInt((String)charSequence2);
                                pDF417ResultMetadata.setChecksum(n10);
                                continue block10;
                            }
                            case 5: {
                                charSequence2 = new StringBuilder();
                                n3 += 2;
                                n3 = DecodedBitStreamParser.numericCompaction(nArray, n3, charSequence2);
                                charSequence2 = charSequence2.toString();
                                long l2 = Long.parseLong((String)charSequence2);
                                pDF417ResultMetadata.setFileSize(l2);
                                continue block10;
                            }
                            case 4: {
                                charSequence2 = new StringBuilder();
                                n3 += 2;
                                n3 = DecodedBitStreamParser.textCompaction(nArray, n3, charSequence2);
                                charSequence2 = charSequence2.toString();
                                pDF417ResultMetadata.setAddressee((String)charSequence2);
                                continue block10;
                            }
                            case 3: {
                                charSequence2 = new StringBuilder();
                                n3 += 2;
                                n3 = DecodedBitStreamParser.textCompaction(nArray, n3, charSequence2);
                                charSequence2 = charSequence2.toString();
                                pDF417ResultMetadata.setSender((String)charSequence2);
                                continue block10;
                            }
                            case 2: {
                                charSequence2 = new StringBuilder();
                                n3 += 2;
                                n3 = DecodedBitStreamParser.numericCompaction(nArray, n3, charSequence2);
                                charSequence2 = charSequence2.toString();
                                long l2 = Long.parseLong((String)charSequence2);
                                pDF417ResultMetadata.setTimestamp(l2);
                                continue block10;
                            }
                            case 1: {
                                charSequence2 = new StringBuilder();
                                n3 += 2;
                                n3 = DecodedBitStreamParser.numericCompaction(nArray, n3, charSequence2);
                                charSequence2 = charSequence2.toString();
                                n10 = Integer.parseInt((String)charSequence2);
                                pDF417ResultMetadata.setSegmentCount(n10);
                                continue block10;
                            }
                            case 0: 
                        }
                        charSequence2 = new StringBuilder();
                        n3 += 2;
                        n3 = DecodedBitStreamParser.textCompaction(nArray, n3, charSequence2);
                        charSequence2 = charSequence2.toString();
                        pDF417ResultMetadata.setFileName((String)charSequence2);
                        continue;
                    }
                    throw FormatException.getFormatInstance();
                }
                ++n3;
                n10 = 1;
                pDF417ResultMetadata.setLastSegment(n10 != 0);
            }
            if (n4 != n14) {
                n7 = n3 - n4;
                n8 = (int)(pDF417ResultMetadata.isLastSegment() ? 1 : 0);
                if (n8 != 0) {
                    n7 += -1;
                }
                nArray = Arrays.copyOfRange(nArray, n4, n7 += n4);
                pDF417ResultMetadata.setOptionalData(nArray);
            }
            return n3;
        }
        throw FormatException.getFormatInstance();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void decodeTextCompaction(int[] var0, int[] var1_1, int var2_2, StringBuilder var3_3) {
        var5_5 = var4_4 /* !! */  = DecodedBitStreamParser$Mode.ALPHA;
        block27: for (var6_6 = 0; var6_6 < var2_2; ++var6_6) {
            block36: {
                block37: {
                    var7_7 = var0[var6_6];
                    var8_8 /* !! */  = DecodedBitStreamParser$1.$SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;
                    var9_9 = var4_4 /* !! */ .ordinal();
                    var10_10 = var8_8 /* !! */ [var9_9];
                    var9_9 = ' ';
                    var11_11 = '\u001a';
                    var12_12 = '\u001d';
                    var13_13 = '\u0391';
                    var14_14 = '\u0384';
                    switch (var10_10) {
                        default: {
                            ** GOTO lbl30
                        }
                        case 6: {
                            if (var7_7 >= var12_12) ** GOTO lbl22
                            var4_4 /* !! */  = (DecodedBitStreamParser$Mode)DecodedBitStreamParser.PUNCT_CHARS;
                            var9_9 = (int)var4_4 /* !! */ [var7_7];
lbl19:
                            // 3 sources

                            while (true) {
                                var4_4 /* !! */  = var5_5;
                                ** GOTO lbl154
                                break;
                            }
lbl22:
                            // 1 sources

                            if (var7_7 == var12_12) ** GOTO lbl35
                            if (var7_7 == var14_14) ** GOTO lbl33
                            if (var7_7 == var13_13) {
                                var15_15 = (char)var1_1[var6_6];
                                var3_3.append(var15_15);
                            }
                            while (true) {
                                var4_4 /* !! */  = var5_5;
lbl30:
                                // 23 sources

                                while (true) {
                                    var9_9 = '\u0000';
                                    ** GOTO lbl154
                                    break;
                                }
                                break;
                            }
lbl33:
                            // 1 sources

                            var4_4 /* !! */  = DecodedBitStreamParser$Mode.ALPHA;
                            ** GOTO lbl30
lbl35:
                            // 1 sources

                            var4_4 /* !! */  = DecodedBitStreamParser$Mode.ALPHA;
                            ** GOTO lbl30
                        }
                        case 5: {
                            if (var7_7 >= var11_11) ** GOTO lbl41
                            var9_9 = var7_7 += 65;
                            ** GOTO lbl19
lbl41:
                            // 1 sources

                            if (var7_7 != var11_11) ** break;
                            ** continue;
                            if (var7_7 != var14_14) ** continue;
                            var4_4 /* !! */  = DecodedBitStreamParser$Mode.ALPHA;
                            ** GOTO lbl30
                        }
                        case 4: {
                            if (var7_7 >= var12_12) ** GOTO lbl51
                            var8_8 /* !! */  = DecodedBitStreamParser.PUNCT_CHARS;
                            var9_9 = var8_8 /* !! */ [var7_7];
                            ** GOTO lbl154
lbl51:
                            // 1 sources

                            if (var7_7 == var12_12) ** GOTO lbl60
                            if (var7_7 == var14_14) ** GOTO lbl58
                            if (var7_7 == var13_13) {
                                var7_7 = (char)var1_1[var6_6];
                                var3_3.append(var7_7);
                            }
                            ** GOTO lbl30
lbl58:
                            // 1 sources

                            var4_4 /* !! */  = DecodedBitStreamParser$Mode.ALPHA;
                            ** GOTO lbl30
lbl60:
                            // 1 sources

                            var4_4 /* !! */  = DecodedBitStreamParser$Mode.ALPHA;
                            ** GOTO lbl30
                        }
                        case 3: {
                            var10_10 = 25;
                            if (var7_7 >= var10_10) ** GOTO lbl68
                            var8_8 /* !! */  = DecodedBitStreamParser.MIXED_CHARS;
                            var9_9 = var8_8 /* !! */ [var7_7];
                            ** GOTO lbl154
lbl68:
                            // 1 sources

                            if (var7_7 == var14_14) ** GOTO lbl96
                            if (var7_7 == var13_13) ** GOTO lbl92
                            switch (var7_7) {
                                default: {
                                    ** GOTO lbl30
                                }
                                case '\u001d': {
                                    var5_5 = DecodedBitStreamParser$Mode.PUNCT_SHIFT;
lbl75:
                                    // 4 sources

                                    while (true) {
                                        var9_9 = 0;
                                        var16_16 = var5_5;
                                        var5_5 = var4_4 /* !! */ ;
                                        var4_4 /* !! */  = var16_16;
                                        ** GOTO lbl154
                                        break;
                                    }
                                }
                                case '\u001c': {
                                    var4_4 /* !! */  = DecodedBitStreamParser$Mode.ALPHA;
                                    ** GOTO lbl30
                                }
                                case '\u001b': {
                                    var4_4 /* !! */  = DecodedBitStreamParser$Mode.LOWER;
                                    ** GOTO lbl30
                                }
                                case '\u0019': {
                                    var4_4 /* !! */  = DecodedBitStreamParser$Mode.PUNCT;
                                    ** GOTO lbl30
                                }
                                case '\u001a': {
                                    if (var9_9 == '\u0000') continue block27;
                                }
                            }
lbl92:
                            // 1 sources

                            var7_7 = (char)var1_1[var6_6];
                            var3_3.append(var7_7);
                            ** GOTO lbl30
lbl96:
                            // 1 sources

                            var4_4 /* !! */  = DecodedBitStreamParser$Mode.ALPHA;
                            ** GOTO lbl30
                        }
                        case 2: {
                            if (var7_7 >= var11_11) ** GOTO lbl104
                            var7_7 += 97;
lbl101:
                            // 2 sources

                            while (true) {
                                var9_9 = var7_7;
                                ** GOTO lbl154
                                break;
                            }
lbl104:
                            // 1 sources

                            if (var7_7 == var14_14) ** GOTO lbl124
                            if (var7_7 == var13_13) ** GOTO lbl120
                            switch (var7_7) {
                                default: {
                                    ** GOTO lbl30
                                }
                                case '\u001d': {
                                    var5_5 = DecodedBitStreamParser$Mode.PUNCT_SHIFT;
                                    ** GOTO lbl75
                                }
                                case '\u001c': {
                                    var4_4 /* !! */  = DecodedBitStreamParser$Mode.MIXED;
                                    ** GOTO lbl30
                                }
                                case '\u001b': {
                                    var5_5 = DecodedBitStreamParser$Mode.ALPHA_SHIFT;
                                    ** GOTO lbl75
                                }
                                case '\u001a': {
                                    if (var9_9 == '\u0000') continue block27;
                                }
                            }
lbl120:
                            // 1 sources

                            var7_7 = (char)var1_1[var6_6];
                            var3_3.append(var7_7);
                            ** GOTO lbl30
lbl124:
                            // 1 sources

                            var4_4 /* !! */  = DecodedBitStreamParser$Mode.ALPHA;
                            ** GOTO lbl30
                        }
                        case 1: 
                    }
                    if (var7_7 < var11_11) {
                        var7_7 += 65;
                        ** continue;
                    }
                    if (var7_7 == var14_14) break block36;
                    if (var7_7 == var13_13) break block37;
                    switch (var7_7) {
                        default: {
                            ** GOTO lbl30
                        }
                        case '\u001d': {
                            var5_5 = DecodedBitStreamParser$Mode.PUNCT_SHIFT;
                            ** continue;
                        }
                        case '\u001c': {
                            var4_4 /* !! */  = DecodedBitStreamParser$Mode.MIXED;
                            ** GOTO lbl30
                        }
                        case '\u001b': {
                            var4_4 /* !! */  = DecodedBitStreamParser$Mode.LOWER;
                            ** GOTO lbl30
                        }
                        case '\u001a': {
                            if (var9_9 == '\u0000') continue block27;
                        }
                    }
                }
                var7_7 = (char)var1_1[var6_6];
                var3_3.append(var7_7);
                ** GOTO lbl30
            }
            var4_4 /* !! */  = DecodedBitStreamParser$Mode.ALPHA;
            ** continue;
lbl154:
            // 6 sources

            if (var9_9 == '\u0000') continue;
            var3_3.append((char)var9_9);
        }
    }

    /*
     * Unable to fully structure code
     */
    private static int numericCompaction(int[] var0, int var1_1, StringBuilder var2_2) {
        var3_3 = 15;
        var4_4 = new int[var3_3];
        var5_5 = false;
        block3: while (true) {
            var6_6 = 0;
            var7_7 = null;
            while (var1_1 < (var8_8 = var0[0]) && !var5_5) {
                var9_9 = var1_1 + 1;
                var10_10 = var0[var1_1];
                if (var9_9 == var8_8) {
                    var5_5 = true;
                }
                if (var10_10 < (var8_8 = 900)) {
                    var4_4[var6_6] = var10_10;
                    ++var6_6;
lbl15:
                    // 2 sources

                    while (true) {
                        var1_1 = var9_9;
                        break;
                    }
                } else {
                    if (var10_10 != var8_8 && var10_10 != (var8_8 = 901) && var10_10 != (var8_8 = 928)) {
                        switch (var10_10) {
                            default: {
                                ** continue;
                            }
                            case 922: 
                            case 923: 
                            case 924: 
                        }
                    }
                    var5_5 = true;
                }
                if ((var8_8 = var6_6 % 15) != 0 && var10_10 != (var8_8 = 902) && !var5_5 || var6_6 <= 0) continue;
                var7_7 = DecodedBitStreamParser.decodeBase900toBase10(var4_4, var6_6);
                var2_2.append(var7_7);
                continue block3;
            }
            break;
        }
        return var1_1;
    }

    /*
     * Exception decompiling
     */
    private static int textCompaction(int[] var0, int var1_1, StringBuilder var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

