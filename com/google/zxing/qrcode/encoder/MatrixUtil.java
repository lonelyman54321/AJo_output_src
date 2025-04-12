/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.MaskUtil;
import com.google.zxing.qrcode.encoder.QRCode;

final class MatrixUtil {
    private static final int[][] POSITION_ADJUSTMENT_PATTERN;
    private static final int[][] POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE;
    private static final int[][] POSITION_DETECTION_PATTERN;
    private static final int[][] TYPE_INFO_COORDINATES;
    private static final int TYPE_INFO_MASK_PATTERN = 21522;
    private static final int TYPE_INFO_POLY = 1335;
    private static final int VERSION_INFO_POLY = 7973;

    static {
        int[] nArray;
        Object object;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int[] nArray5;
        int[] nArray6;
        int[] nArray7;
        Object object2;
        int[] nArray8;
        int[] nArray9;
        int[] nArray10;
        int[] nArray11;
        int[] nArray12;
        int n3 = 1;
        int n4 = 7;
        int[] nArray13 = nArray12 = new int[n4];
        int[] nArray14 = nArray12;
        nArray13[0] = 1;
        nArray14[1] = 1;
        nArray13[2] = 1;
        nArray14[3] = 1;
        nArray13[4] = 1;
        nArray14[5] = 1;
        nArray14[6] = 1;
        int[] nArray15 = nArray11 = new int[n4];
        int[] nArray16 = nArray11;
        nArray15[0] = 1;
        nArray16[1] = 0;
        nArray15[2] = 0;
        nArray16[3] = 0;
        nArray15[4] = 0;
        nArray16[5] = 0;
        nArray16[6] = 1;
        int[] nArray17 = nArray10 = new int[n4];
        int[] nArray18 = nArray10;
        nArray17[0] = 1;
        nArray18[1] = 0;
        nArray17[2] = 1;
        nArray18[3] = 1;
        nArray17[4] = 1;
        nArray18[5] = 0;
        nArray18[6] = 1;
        int[] nArray19 = nArray9 = new int[n4];
        int[] nArray20 = nArray9;
        nArray19[0] = 1;
        nArray20[1] = 0;
        nArray19[2] = 1;
        nArray20[3] = 1;
        nArray19[4] = 1;
        nArray20[5] = 0;
        nArray20[6] = 1;
        int[] nArray21 = nArray8 = new int[n4];
        int[] nArray22 = nArray8;
        nArray21[0] = 1;
        nArray22[1] = 0;
        nArray21[2] = 1;
        nArray22[3] = 1;
        nArray21[4] = 1;
        nArray22[5] = 0;
        nArray22[6] = 1;
        int[] nArray23 = object2 = new int[n4];
        int[] nArray24 = object2;
        nArray23[0] = 1;
        nArray24[1] = 0;
        nArray23[2] = 0;
        nArray24[3] = 0;
        nArray23[4] = 0;
        nArray24[5] = 0;
        nArray24[6] = 1;
        int[] nArray25 = nArray7 = new int[n4];
        int[] nArray26 = nArray7;
        nArray25[0] = 1;
        nArray26[1] = 1;
        nArray25[2] = 1;
        nArray26[3] = 1;
        nArray25[4] = 1;
        nArray26[5] = 1;
        nArray26[6] = 1;
        Object object3 = new int[n4][];
        object3[0] = nArray12;
        object3[n3] = nArray11;
        int n7 = 2;
        object3[n7] = nArray10;
        int n8 = 3;
        object3[n8] = nArray9;
        int n10 = 4;
        object3[n10] = nArray8;
        int n14 = 5;
        object3[n14] = object2;
        object3[6] = nArray7;
        POSITION_DETECTION_PATTERN = object3;
        object2 = new int[n14][];
        nArray7 = new int[]{n3, n3, n3, n3, n3};
        object2[0] = (int)nArray7;
        nArray7 = new int[]{n3, 0, 0, 0, n3};
        object2[n3] = (int)nArray7;
        nArray7 = new int[]{n3, 0, n3, 0, n3};
        object2[n7] = (int)nArray7;
        nArray7 = new int[]{n3, 0, 0, 0, n3};
        object2[n8] = (int)nArray7;
        nArray7 = new int[]{n3, n3, n3, n3, n3};
        object2[n10] = (int)nArray7;
        POSITION_ADJUSTMENT_PATTERN = (int[][])object2;
        Object object4 = object2 = new int[n4];
        Object object5 = object2;
        object4[0] = -1;
        object5[1] = -1;
        object4[2] = -1;
        object5[3] = -1;
        object4[4] = -1;
        object5[5] = -1;
        object5[6] = -1;
        int[] nArray27 = nArray7 = new int[n4];
        int[] nArray28 = nArray7;
        nArray27[0] = 6;
        nArray28[1] = 18;
        nArray27[2] = -1;
        nArray28[3] = -1;
        nArray27[4] = -1;
        nArray28[5] = -1;
        nArray28[6] = -1;
        Object object6 = object3 = (Object)new int[n4];
        Object object7 = object3;
        object6[0] = (int[])6;
        object7[1] = (int[])22;
        object6[2] = (int[])-1;
        object7[3] = (int[])-1;
        object6[4] = (int[])-1;
        object7[5] = (int[])-1;
        object7[6] = (int[])-1;
        int[] nArray29 = nArray6 = new int[n4];
        int[] nArray30 = nArray6;
        nArray29[0] = 6;
        nArray30[1] = 26;
        nArray29[2] = -1;
        nArray30[3] = -1;
        nArray29[4] = -1;
        nArray30[5] = -1;
        nArray30[6] = -1;
        int[] nArray31 = nArray5 = new int[n4];
        int[] nArray32 = nArray5;
        nArray31[0] = 6;
        nArray32[1] = 30;
        nArray31[2] = -1;
        nArray32[3] = -1;
        nArray31[4] = -1;
        nArray32[5] = -1;
        nArray32[6] = -1;
        int[] nArray33 = nArray4 = new int[n4];
        int[] nArray34 = nArray4;
        nArray33[0] = 6;
        nArray34[1] = 34;
        nArray33[2] = -1;
        nArray34[3] = -1;
        nArray33[4] = -1;
        nArray34[5] = -1;
        nArray34[6] = -1;
        int[] nArray35 = nArray3 = new int[n4];
        int[] nArray36 = nArray3;
        nArray35[0] = 6;
        nArray36[1] = 22;
        nArray35[2] = 38;
        nArray36[3] = -1;
        nArray35[4] = -1;
        nArray36[5] = -1;
        nArray36[6] = -1;
        int[] nArray37 = nArray2 = new int[n4];
        int[] nArray38 = nArray2;
        nArray37[0] = 6;
        nArray38[1] = 24;
        nArray37[2] = 42;
        nArray38[3] = -1;
        nArray37[4] = -1;
        nArray38[5] = -1;
        nArray38[6] = -1;
        int[] nArray39 = nArray8 = new int[n4];
        int[] nArray40 = nArray8;
        nArray39[0] = 6;
        nArray40[1] = 26;
        nArray39[2] = 46;
        nArray40[3] = -1;
        nArray39[4] = -1;
        nArray40[5] = -1;
        nArray40[6] = -1;
        int[] nArray41 = nArray9 = new int[n4];
        int[] nArray42 = nArray9;
        nArray41[0] = 6;
        nArray42[1] = 28;
        nArray41[2] = 50;
        nArray42[3] = -1;
        nArray41[4] = -1;
        nArray42[5] = -1;
        nArray42[6] = -1;
        int[] nArray43 = nArray10 = new int[n4];
        int[] nArray44 = nArray10;
        nArray43[0] = 6;
        nArray44[1] = 30;
        nArray43[2] = 54;
        nArray44[3] = -1;
        nArray43[4] = -1;
        nArray44[5] = -1;
        nArray44[6] = -1;
        int[] nArray45 = nArray11 = new int[n4];
        int[] nArray46 = nArray11;
        nArray45[0] = 6;
        nArray46[1] = 32;
        nArray45[2] = 58;
        nArray46[3] = -1;
        nArray45[4] = -1;
        nArray46[5] = -1;
        nArray46[6] = -1;
        int[] nArray47 = nArray12 = new int[n4];
        int[] nArray48 = nArray12;
        nArray47[0] = 6;
        nArray48[1] = 34;
        nArray47[2] = 62;
        nArray48[3] = -1;
        nArray47[4] = -1;
        nArray48[5] = -1;
        nArray48[6] = -1;
        int[] nArray49 = object = new int[n4];
        int[] nArray50 = object;
        nArray49[0] = 6;
        nArray50[1] = 26;
        nArray49[2] = 46;
        nArray50[3] = 66;
        nArray49[4] = -1;
        nArray50[5] = -1;
        nArray50[6] = -1;
        int[] nArray51 = nArray = new int[n4];
        int[] nArray52 = nArray;
        nArray51[0] = 6;
        nArray52[1] = 26;
        nArray51[2] = 48;
        nArray52[3] = 70;
        nArray51[4] = -1;
        nArray52[5] = -1;
        nArray52[6] = -1;
        int[] nArray53 = nArray;
        int[] nArray54 = nArray = new int[n4];
        int[] nArray55 = nArray;
        nArray54[0] = 6;
        nArray55[1] = 26;
        nArray54[2] = 50;
        nArray55[3] = 74;
        nArray54[4] = -1;
        nArray55[5] = -1;
        nArray55[6] = -1;
        int[] nArray56 = nArray;
        int[] nArray57 = nArray = new int[n4];
        int[] nArray58 = nArray;
        nArray57[0] = 6;
        nArray58[1] = 30;
        nArray57[2] = 54;
        nArray58[3] = 78;
        nArray57[4] = -1;
        nArray58[5] = -1;
        nArray58[6] = -1;
        int[] nArray59 = nArray;
        int[] nArray60 = nArray = new int[n4];
        int[] nArray61 = nArray;
        nArray60[0] = 6;
        nArray61[1] = 30;
        nArray60[2] = 56;
        nArray61[3] = 82;
        nArray60[4] = -1;
        nArray61[5] = -1;
        nArray61[6] = -1;
        int[] nArray62 = nArray;
        int[] nArray63 = nArray = new int[n4];
        int[] nArray64 = nArray;
        nArray63[0] = 6;
        nArray64[1] = 30;
        nArray63[2] = 58;
        nArray64[3] = 86;
        nArray63[4] = -1;
        nArray64[5] = -1;
        nArray64[6] = -1;
        int[] nArray65 = nArray;
        int[] nArray66 = nArray = new int[n4];
        int[] nArray67 = nArray;
        nArray66[0] = 6;
        nArray67[1] = 34;
        nArray66[2] = 62;
        nArray67[3] = 90;
        nArray66[4] = -1;
        nArray67[5] = -1;
        nArray67[6] = -1;
        int[] nArray68 = nArray;
        int[] nArray69 = nArray = new int[n4];
        int[] nArray70 = nArray;
        nArray69[0] = 6;
        nArray70[1] = 28;
        nArray69[2] = 50;
        nArray70[3] = 72;
        nArray69[4] = 94;
        nArray70[5] = -1;
        nArray70[6] = -1;
        int[] nArray71 = nArray;
        int[] nArray72 = nArray = new int[n4];
        int[] nArray73 = nArray;
        nArray72[0] = 6;
        nArray73[1] = 26;
        nArray72[2] = 50;
        nArray73[3] = 74;
        nArray72[4] = 98;
        nArray73[5] = -1;
        nArray73[6] = -1;
        int[] nArray74 = nArray;
        int[] nArray75 = nArray = new int[n4];
        int[] nArray76 = nArray;
        nArray75[0] = 6;
        nArray76[1] = 30;
        nArray75[2] = 54;
        nArray76[3] = 78;
        nArray75[4] = 102;
        nArray76[5] = -1;
        nArray76[6] = -1;
        int[] nArray77 = nArray;
        int[] nArray78 = nArray = new int[n4];
        int[] nArray79 = nArray;
        nArray78[0] = 6;
        nArray79[1] = 28;
        nArray78[2] = 54;
        nArray79[3] = 80;
        nArray78[4] = 106;
        nArray79[5] = -1;
        nArray79[6] = -1;
        int[] nArray80 = nArray;
        int[] nArray81 = nArray = new int[n4];
        int[] nArray82 = nArray;
        nArray81[0] = 6;
        nArray82[1] = 32;
        nArray81[2] = 58;
        nArray82[3] = 84;
        nArray81[4] = 110;
        nArray82[5] = -1;
        nArray82[6] = -1;
        int[] nArray83 = nArray;
        int[] nArray84 = nArray = new int[n4];
        int[] nArray85 = nArray;
        nArray84[0] = 6;
        nArray85[1] = 30;
        nArray84[2] = 58;
        nArray85[3] = 86;
        nArray84[4] = 114;
        nArray85[5] = -1;
        nArray85[6] = -1;
        int[] nArray86 = nArray;
        int[] nArray87 = nArray = new int[n4];
        int[] nArray88 = nArray;
        nArray87[0] = 6;
        nArray88[1] = 34;
        nArray87[2] = 62;
        nArray88[3] = 90;
        nArray87[4] = 118;
        nArray88[5] = -1;
        nArray88[6] = -1;
        int[] nArray89 = nArray;
        int[] nArray90 = nArray = new int[n4];
        int[] nArray91 = nArray;
        nArray90[0] = 6;
        nArray91[1] = 26;
        nArray90[2] = 50;
        nArray91[3] = 74;
        nArray90[4] = 98;
        nArray91[5] = 122;
        nArray91[6] = -1;
        int[] nArray92 = nArray;
        int[] nArray93 = nArray = new int[n4];
        int[] nArray94 = nArray;
        nArray93[0] = 6;
        nArray94[1] = 30;
        nArray93[2] = 54;
        nArray94[3] = 78;
        nArray93[4] = 102;
        nArray94[5] = 126;
        nArray94[6] = -1;
        int[] nArray95 = nArray;
        int[] nArray96 = nArray = new int[n4];
        int[] nArray97 = nArray;
        nArray96[0] = 6;
        nArray97[1] = 26;
        nArray96[2] = 52;
        nArray97[3] = 78;
        nArray96[4] = 104;
        nArray97[5] = 130;
        nArray97[6] = -1;
        int[] nArray98 = nArray;
        int[] nArray99 = nArray = new int[n4];
        int[] nArray100 = nArray;
        nArray99[0] = 6;
        nArray100[1] = 30;
        nArray99[2] = 56;
        nArray100[3] = 82;
        nArray99[4] = 108;
        nArray100[5] = 134;
        nArray100[6] = -1;
        int[] nArray101 = nArray;
        int[] nArray102 = nArray = new int[n4];
        int[] nArray103 = nArray;
        nArray102[0] = 6;
        nArray103[1] = 34;
        nArray102[2] = 60;
        nArray103[3] = 86;
        nArray102[4] = 112;
        nArray103[5] = 138;
        nArray103[6] = -1;
        int[] nArray104 = nArray;
        int[] nArray105 = nArray = new int[n4];
        int[] nArray106 = nArray;
        nArray105[0] = 6;
        nArray106[1] = 30;
        nArray105[2] = 58;
        nArray106[3] = 86;
        nArray105[4] = 114;
        nArray106[5] = 142;
        nArray106[6] = -1;
        int[] nArray107 = nArray;
        int[] nArray108 = nArray = new int[n4];
        int[] nArray109 = nArray;
        nArray108[0] = 6;
        nArray109[1] = 34;
        nArray108[2] = 62;
        nArray109[3] = 90;
        nArray108[4] = 118;
        nArray109[5] = 146;
        nArray109[6] = -1;
        int[] nArray110 = nArray;
        int[] nArray111 = nArray = new int[n4];
        int[] nArray112 = nArray;
        nArray111[0] = 6;
        nArray112[1] = 30;
        nArray111[2] = 54;
        nArray112[3] = 78;
        nArray111[4] = 102;
        nArray112[5] = 126;
        nArray112[6] = 150;
        int[] nArray113 = nArray;
        int[] nArray114 = nArray = new int[n4];
        int[] nArray115 = nArray;
        nArray114[0] = 6;
        nArray115[1] = 24;
        nArray114[2] = 50;
        nArray115[3] = 76;
        nArray114[4] = 102;
        nArray115[5] = 128;
        nArray115[6] = 154;
        int[] nArray116 = nArray;
        int[] nArray117 = nArray = new int[n4];
        int[] nArray118 = nArray;
        nArray117[0] = 6;
        nArray118[1] = 28;
        nArray117[2] = 54;
        nArray118[3] = 80;
        nArray117[4] = 106;
        nArray118[5] = 132;
        nArray118[6] = 158;
        int[] nArray119 = nArray;
        int[] nArray120 = nArray = new int[n4];
        int[] nArray121 = nArray;
        nArray120[0] = 6;
        nArray121[1] = 32;
        nArray120[2] = 58;
        nArray121[3] = 84;
        nArray120[4] = 110;
        nArray121[5] = 136;
        nArray121[6] = 162;
        int[] nArray122 = nArray;
        int[] nArray123 = nArray = new int[n4];
        int[] nArray124 = nArray;
        nArray123[0] = 6;
        nArray124[1] = 26;
        nArray123[2] = 54;
        nArray124[3] = 82;
        nArray123[4] = 110;
        nArray124[5] = 138;
        nArray124[6] = 166;
        int[] nArray125 = nArray;
        int[] nArray126 = nArray = new int[n4];
        int[] nArray127 = nArray;
        nArray126[0] = 6;
        nArray127[1] = 30;
        nArray126[2] = 58;
        nArray127[3] = 86;
        nArray126[4] = 114;
        nArray127[5] = 142;
        nArray127[6] = 170;
        Object object8 = new int[40][];
        object8[0] = object2;
        object8[1] = nArray7;
        object8[2] = (int[])object3;
        object8[3] = nArray6;
        object8[4] = nArray5;
        object8[5] = nArray4;
        object8[6] = nArray3;
        object8[7] = nArray2;
        int n15 = 8;
        object8[n15] = nArray8;
        object8[9] = nArray9;
        object8[10] = nArray10;
        object8[11] = nArray11;
        object8[12] = nArray12;
        object8[13] = object;
        object8[14] = nArray53;
        object8[15] = nArray56;
        object8[16] = nArray59;
        object8[17] = nArray62;
        object8[18] = nArray65;
        object8[19] = nArray68;
        object8[20] = nArray71;
        object8[21] = nArray74;
        object8[22] = nArray77;
        object8[23] = nArray80;
        object8[24] = nArray83;
        object8[25] = nArray86;
        object8[26] = nArray89;
        object8[27] = nArray92;
        object8[28] = nArray95;
        object8[29] = nArray98;
        object8[30] = nArray101;
        object8[31] = nArray104;
        object8[32] = nArray107;
        object8[33] = nArray110;
        object8[34] = nArray113;
        object8[35] = nArray116;
        object8[36] = nArray119;
        object8[37] = nArray122;
        object8[38] = nArray125;
        object8[39] = nArray;
        POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE = object8;
        object = new int[15][];
        nArray12 = new int[]{n15, 0};
        object[0] = (int)nArray12;
        n4 = 1;
        nArray12 = new int[]{n15, n4};
        object[n4] = (int)nArray12;
        n4 = 2;
        nArray12 = new int[]{n15, n4};
        object[n4] = (int)nArray12;
        n4 = 3;
        nArray12 = new int[]{n15, n4};
        object[n4] = (int)nArray12;
        n4 = 4;
        nArray12 = new int[]{n15, n4};
        object[n4] = (int)nArray12;
        n4 = 5;
        nArray12 = new int[]{n15, n4};
        object[n4] = (int)nArray12;
        n7 = 7;
        nArray = new int[]{n15, n7};
        object[6] = (int)nArray;
        nArray = new int[]{n15, n15};
        object[n7] = (int)nArray;
        nArray12 = new int[]{n7, n15};
        object[n15] = (int)nArray12;
        object8 = new int[]{n4, n15};
        object[9] = (int)object8;
        object8 = new int[]{4, n15};
        object[10] = (int)object8;
        object8 = new int[]{3, n15};
        object[11] = (int)object8;
        object8 = new int[]{2, n15};
        object[12] = (int)object8;
        object8 = new int[]{1, n15};
        object[13] = (int)object8;
        object8 = new int[]{0, n15};
        object[14] = (int)object8;
        TYPE_INFO_COORDINATES = (int[][])object;
    }

    private MatrixUtil() {
    }

    public static void buildMatrix(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, int n3, ByteMatrix byteMatrix) {
        MatrixUtil.clearMatrix(byteMatrix);
        MatrixUtil.embedBasicPatterns(version, byteMatrix);
        MatrixUtil.embedTypeInfo(errorCorrectionLevel, n3, byteMatrix);
        MatrixUtil.maybeEmbedVersionInfo(version, byteMatrix);
        MatrixUtil.embedDataBits(bitArray, n3, byteMatrix);
    }

    public static int calculateBCHCode(int n3, int n4) {
        if (n4 != 0) {
            int n7 = MatrixUtil.findMSBSet(n4);
            int n8 = n7 + -1;
            n3 <<= n8;
            while ((n8 = MatrixUtil.findMSBSet(n3)) >= n7) {
                n8 = MatrixUtil.findMSBSet(n3) - n7;
                n8 = n4 << n8;
                n3 ^= n8;
            }
            return n3;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("0 polynomial");
        throw illegalArgumentException;
    }

    public static void clearMatrix(ByteMatrix byteMatrix) {
        byteMatrix.clear((byte)-1);
    }

    public static void embedBasicPatterns(Version version, ByteMatrix byteMatrix) {
        MatrixUtil.embedPositionDetectionPatternsAndSeparators(byteMatrix);
        MatrixUtil.embedDarkDotAtLeftBottomCorner(byteMatrix);
        MatrixUtil.maybeEmbedPositionAdjustmentPatterns(version, byteMatrix);
        MatrixUtil.embedTimingPatterns(byteMatrix);
    }

    private static void embedDarkDotAtLeftBottomCorner(ByteMatrix object) {
        int n3 = ((ByteMatrix)object).getHeight();
        int n4 = 8;
        n3 -= n4;
        if ((n3 = (int)((ByteMatrix)object).get(n4, n3)) != 0) {
            n3 = ((ByteMatrix)object).getHeight() - n4;
            ((ByteMatrix)object).set(n4, n3, 1);
            return;
        }
        object = new WriterException();
        throw object;
    }

    public static void embedDataBits(BitArray object, int n3, ByteMatrix object2) {
        int n4 = ((ByteMatrix)object2).getHeight() + -1;
        int n7 = -1;
        int n8 = 0;
        int n10 = -1;
        for (int i3 = ((ByteMatrix)object2).getWidth() + -1; i3 > 0; i3 += -2) {
            int n14 = 6;
            if (i3 == n14) {
                i3 += -1;
            }
            while (n4 >= 0 && n4 < (n14 = ((ByteMatrix)object2).getHeight())) {
                int n15;
                for (n14 = 0; n14 < (n15 = 2); ++n14) {
                    boolean bl2;
                    n15 = i3 - n14;
                    int n16 = MatrixUtil.isEmpty(((ByteMatrix)object2).get(n15, n4));
                    if (!n16) continue;
                    n16 = ((BitArray)object).getSize();
                    if (n8 < n16) {
                        n16 = (int)(((BitArray)object).get(n8) ? 1 : 0);
                        ++n8;
                    } else {
                        n16 = 0;
                    }
                    if (n3 != n7 && (bl2 = MaskUtil.getDataMaskBit(n3, n15, n4))) {
                        n16 ^= true;
                    }
                    ((ByteMatrix)object2).set(n15, n4, n16 != 0);
                }
                n4 += n10;
            }
            n10 = -n10;
            n4 += n10;
        }
        n3 = ((BitArray)object).getSize();
        if (n8 == n3) {
            return;
        }
        object2 = new StringBuilder("Not all bits consumed: ");
        ((StringBuilder)object2).append(n8);
        ((StringBuilder)object2).append('/');
        int n17 = ((BitArray)object).getSize();
        ((StringBuilder)object2).append(n17);
        object = ((StringBuilder)object2).toString();
        WriterException writerException = new WriterException((String)object);
        throw writerException;
    }

    private static void embedHorizontalSeparationPattern(int n3, int n4, ByteMatrix byteMatrix) {
        int n7;
        for (int i3 = 0; i3 < (n7 = 8); ++i3) {
            n7 = n3 + i3;
            boolean bl2 = MatrixUtil.isEmpty(byteMatrix.get(n7, n4));
            if (bl2) {
                byteMatrix.set(n7, n4, 0);
                continue;
            }
            WriterException writerException = new WriterException();
            throw writerException;
        }
    }

    private static void embedPositionAdjustmentPattern(int n3, int n4, ByteMatrix byteMatrix) {
        int n7;
        for (int i3 = 0; i3 < (n7 = 5); ++i3) {
            int[] nArray = POSITION_ADJUSTMENT_PATTERN[i3];
            for (int i8 = 0; i8 < n7; ++i8) {
                int n8 = n3 + i8;
                int n10 = n4 + i3;
                int n14 = nArray[i8];
                byteMatrix.set(n8, n10, n14);
            }
        }
    }

    private static void embedPositionDetectionPattern(int n3, int n4, ByteMatrix byteMatrix) {
        int n7;
        for (int i3 = 0; i3 < (n7 = 7); ++i3) {
            int[] nArray = POSITION_DETECTION_PATTERN[i3];
            for (int i8 = 0; i8 < n7; ++i8) {
                int n8 = n3 + i8;
                int n10 = n4 + i3;
                int n14 = nArray[i8];
                byteMatrix.set(n8, n10, n14);
            }
        }
    }

    private static void embedPositionDetectionPatternsAndSeparators(ByteMatrix byteMatrix) {
        int n3 = POSITION_DETECTION_PATTERN[0].length;
        MatrixUtil.embedPositionDetectionPattern(0, 0, byteMatrix);
        MatrixUtil.embedPositionDetectionPattern(byteMatrix.getWidth() - n3, 0, byteMatrix);
        int n4 = byteMatrix.getWidth() - n3;
        MatrixUtil.embedPositionDetectionPattern(0, n4, byteMatrix);
        n3 = 7;
        MatrixUtil.embedHorizontalSeparationPattern(0, n3, byteMatrix);
        MatrixUtil.embedHorizontalSeparationPattern(byteMatrix.getWidth() + -8, n3, byteMatrix);
        n4 = byteMatrix.getWidth() + -8;
        MatrixUtil.embedHorizontalSeparationPattern(0, n4, byteMatrix);
        MatrixUtil.embedVerticalSeparationPattern(n3, 0, byteMatrix);
        MatrixUtil.embedVerticalSeparationPattern(byteMatrix.getHeight() + -8, 0, byteMatrix);
        int n7 = byteMatrix.getHeight() - n3;
        MatrixUtil.embedVerticalSeparationPattern(n3, n7, byteMatrix);
    }

    private static void embedTimingPatterns(ByteMatrix byteMatrix) {
        int n3;
        int n4 = 8;
        int n7 = 8;
        while (n7 < (n3 = byteMatrix.getWidth() - n4)) {
            n3 = n7 + 1;
            int n8 = n3 % 2;
            int n10 = 6;
            boolean bl2 = MatrixUtil.isEmpty(byteMatrix.get(n7, n10));
            if (bl2) {
                byteMatrix.set(n7, n10, n8);
            }
            if (bl2 = MatrixUtil.isEmpty(byteMatrix.get(n10, n7))) {
                byteMatrix.set(n10, n7, n8);
            }
            n7 = n3;
        }
    }

    public static void embedTypeInfo(ErrorCorrectionLevel errorCorrectionLevel, int n3, ByteMatrix byteMatrix) {
        int n4;
        BitArray bitArray = new BitArray();
        MatrixUtil.makeTypeInfoBits(errorCorrectionLevel, n3, bitArray);
        errorCorrectionLevel = null;
        for (n3 = 0; n3 < (n4 = bitArray.getSize()); ++n3) {
            n4 = bitArray.getSize();
            int n7 = 1;
            n4 = n4 - n7 - n3;
            n4 = (int)(bitArray.get(n4) ? 1 : 0);
            int[] nArray = TYPE_INFO_COORDINATES[n3];
            int n8 = nArray[0];
            int n10 = nArray[n7];
            byteMatrix.set(n8, n10, n4 != 0);
            n10 = 8;
            if (n3 < n10) {
                n8 = byteMatrix.getWidth() - n3 - n7;
                byteMatrix.set(n8, n10, n4 != 0);
                continue;
            }
            n7 = byteMatrix.getHeight() + -7;
            n8 = n3 + -8 + n7;
            byteMatrix.set(n10, n8, n4 != 0);
        }
    }

    private static void embedVerticalSeparationPattern(int n3, int n4, ByteMatrix byteMatrix) {
        int n7;
        for (int i3 = 0; i3 < (n7 = 7); ++i3) {
            n7 = n4 + i3;
            boolean bl2 = MatrixUtil.isEmpty(byteMatrix.get(n3, n7));
            if (bl2) {
                byteMatrix.set(n3, n7, 0);
                continue;
            }
            WriterException writerException = new WriterException();
            throw writerException;
        }
    }

    public static int findMSBSet(int n3) {
        n3 = Integer.numberOfLeadingZeros(n3);
        return 32 - n3;
    }

    private static boolean isEmpty(int n3) {
        int n4 = -1;
        return n3 == n4;
    }

    public static void makeTypeInfoBits(ErrorCorrectionLevel object, int n3, BitArray bitArray) {
        int n4 = QRCode.isValidMaskPattern(n3);
        if (n4 != 0) {
            int n7 = ((ErrorCorrectionLevel)((Object)object)).getBits() << 3 | n3;
            bitArray.appendBits(n7, 5);
            n7 = MatrixUtil.calculateBCHCode(n7, 1335);
            bitArray.appendBits(n7, 10);
            object = new BitArray();
            n3 = 21522;
            n4 = 15;
            ((BitArray)object).appendBits(n3, n4);
            bitArray.xor((BitArray)object);
            n7 = bitArray.getSize();
            if (n7 == n4) {
                return;
            }
            CharSequence charSequence = new StringBuilder("should not happen but we got: ");
            int n8 = bitArray.getSize();
            charSequence.append(n8);
            charSequence = charSequence.toString();
            object = new WriterException((String)charSequence);
            throw object;
        }
        object = new WriterException("Invalid mask pattern");
        throw object;
    }

    public static void makeVersionInfoBits(Version object, BitArray object2) {
        int n3 = ((Version)object).getVersionNumber();
        int n4 = 6;
        ((BitArray)object2).appendBits(n3, n4);
        int n7 = MatrixUtil.calculateBCHCode(((Version)object).getVersionNumber(), 7973);
        ((BitArray)object2).appendBits(n7, 12);
        n7 = ((BitArray)object2).getSize();
        n3 = 18;
        if (n7 == n3) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("should not happen but we got: ");
        int n8 = ((BitArray)object2).getSize();
        stringBuilder.append(n8);
        object2 = stringBuilder.toString();
        object = new WriterException((String)object2);
        throw object;
    }

    private static void maybeEmbedPositionAdjustmentPatterns(Version object, ByteMatrix byteMatrix) {
        int n3;
        int n4 = ((Version)object).getVersionNumber();
        if (n4 < (n3 = 2)) {
            return;
        }
        int n7 = ((Version)object).getVersionNumber() + -1;
        int[][] nArray = POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE;
        object = nArray[n7];
        n4 = ((Object)object).length;
        n3 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object2 = object[i3];
            if (object2 < 0) continue;
            int n8 = ((Object)object).length;
            for (int i8 = 0; i8 < n8; ++i8) {
                int n10;
                reference var10_10 = object[i8];
                if (var10_10 < 0 || (n10 = MatrixUtil.isEmpty(byteMatrix.get((int)var10_10, (int)object2))) == false) continue;
                n10 = object2 + -2;
                MatrixUtil.embedPositionAdjustmentPattern((int)(var10_10 += -2), n10, byteMatrix);
            }
        }
    }

    public static void maybeEmbedVersionInfo(Version version, ByteMatrix byteMatrix) {
        int n3;
        int n4;
        int n7 = version.getVersionNumber();
        if (n7 < (n4 = 7)) {
            return;
        }
        BitArray bitArray = new BitArray();
        MatrixUtil.makeVersionInfoBits(version, bitArray);
        version = null;
        n4 = 17;
        for (int i3 = 0; i3 < (n3 = 6); ++i3) {
            int n8;
            for (n3 = 0; n3 < (n8 = 3); ++n3) {
                n8 = (int)(bitArray.get(n4) ? 1 : 0);
                n4 += -1;
                int n10 = byteMatrix.getHeight() + -11 + n3;
                byteMatrix.set(i3, n10, n8 != 0);
                n10 = byteMatrix.getHeight() + -11 + n3;
                byteMatrix.set(n10, i3, n8 != 0);
            }
        }
    }
}

