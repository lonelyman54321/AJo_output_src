/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

final class FormatInformation {
    private static final int[][] FORMAT_INFO_DECODE_LOOKUP;
    private static final int FORMAT_INFO_MASK_QR = 21522;
    private final byte dataMask;
    private final ErrorCorrectionLevel errorCorrectionLevel;

    static {
        int[][] nArrayArray = new int[32][];
        int[] nArray = new int[]{21522, 0};
        nArrayArray[0] = nArray;
        int n3 = 1;
        nArray = new int[]{20773, n3};
        nArrayArray[n3] = nArray;
        n3 = 2;
        nArray = new int[]{24188, n3};
        nArrayArray[n3] = nArray;
        n3 = 3;
        nArray = new int[]{23371, n3};
        nArrayArray[n3] = nArray;
        n3 = 4;
        nArray = new int[]{17913, n3};
        nArrayArray[n3] = nArray;
        n3 = 5;
        nArray = new int[]{16590, n3};
        nArrayArray[n3] = nArray;
        n3 = 6;
        nArray = new int[]{20375, n3};
        nArrayArray[n3] = nArray;
        n3 = 7;
        nArray = new int[]{19104, n3};
        nArrayArray[n3] = nArray;
        n3 = 8;
        nArray = new int[]{30660, n3};
        nArrayArray[n3] = nArray;
        n3 = 9;
        nArray = new int[]{29427, n3};
        nArrayArray[n3] = nArray;
        n3 = 10;
        nArray = new int[]{32170, n3};
        nArrayArray[n3] = nArray;
        n3 = 11;
        nArray = new int[]{30877, n3};
        nArrayArray[n3] = nArray;
        n3 = 12;
        nArray = new int[]{26159, n3};
        nArrayArray[n3] = nArray;
        n3 = 13;
        nArray = new int[]{25368, n3};
        nArrayArray[n3] = nArray;
        n3 = 14;
        nArray = new int[]{27713, n3};
        nArrayArray[n3] = nArray;
        n3 = 15;
        nArray = new int[]{26998, n3};
        nArrayArray[n3] = nArray;
        n3 = 16;
        nArray = new int[]{5769, n3};
        nArrayArray[n3] = nArray;
        n3 = 17;
        nArray = new int[]{5054, n3};
        nArrayArray[n3] = nArray;
        n3 = 18;
        nArray = new int[]{7399, n3};
        nArrayArray[n3] = nArray;
        n3 = 19;
        nArray = new int[]{6608, n3};
        nArrayArray[n3] = nArray;
        n3 = 20;
        nArray = new int[]{1890, n3};
        nArrayArray[n3] = nArray;
        n3 = 21;
        nArray = new int[]{597, n3};
        nArrayArray[n3] = nArray;
        n3 = 22;
        nArray = new int[]{3340, n3};
        nArrayArray[n3] = nArray;
        n3 = 23;
        nArray = new int[]{2107, n3};
        nArrayArray[n3] = nArray;
        n3 = 24;
        nArray = new int[]{13663, n3};
        nArrayArray[n3] = nArray;
        n3 = 25;
        nArray = new int[]{12392, n3};
        nArrayArray[n3] = nArray;
        n3 = 26;
        nArray = new int[]{16177, n3};
        nArrayArray[n3] = nArray;
        n3 = 27;
        nArray = new int[]{14854, n3};
        nArrayArray[n3] = nArray;
        n3 = 28;
        nArray = new int[]{9396, n3};
        nArrayArray[n3] = nArray;
        n3 = 29;
        nArray = new int[]{8579, n3};
        nArrayArray[n3] = nArray;
        n3 = 30;
        nArray = new int[]{11994, n3};
        nArrayArray[n3] = nArray;
        n3 = 31;
        nArray = new int[]{11245, n3};
        nArrayArray[n3] = nArray;
        FORMAT_INFO_DECODE_LOOKUP = nArrayArray;
    }

    private FormatInformation(int n3) {
        ErrorCorrectionLevel errorCorrectionLevel;
        this.errorCorrectionLevel = errorCorrectionLevel = ErrorCorrectionLevel.forBits(n3 >> 3 & 3);
        n3 = (byte)(n3 & 7);
        this.dataMask = (byte)n3;
    }

    public static FormatInformation decodeFormatInformation(int n3, int n4) {
        FormatInformation formatInformation = FormatInformation.doDecodeFormatInformation(n3, n4);
        if (formatInformation != null) {
            return formatInformation;
        }
        return FormatInformation.doDecodeFormatInformation(n3 ^= 0x5412, n4 ^= 0x5412);
    }

    private static FormatInformation doDecodeFormatInformation(int n3, int n4) {
        int[][] nArray = FORMAT_INFO_DECODE_LOOKUP;
        int n7 = nArray.length;
        int n8 = -1 >>> 1;
        int n10 = 0;
        for (int i3 = 0; i3 < n7; ++i3) {
            int[] nArray2 = nArray[i3];
            int n14 = nArray2[0];
            int n15 = 1;
            if (n14 != n3 && n14 != n4) {
                int n16 = FormatInformation.numBitsDiffering(n3, n14);
                if (n16 < n8) {
                    n10 = nArray2[n15];
                    n8 = n16;
                }
                if (n3 == n4 || (n14 = FormatInformation.numBitsDiffering(n4, n14)) >= n8) continue;
                n10 = nArray2[n15];
                n8 = n14;
                continue;
            }
            n4 = nArray2[n15];
            FormatInformation formatInformation = new FormatInformation(n4);
            return formatInformation;
        }
        n3 = 3;
        if (n8 <= n3) {
            FormatInformation formatInformation = new FormatInformation(n10);
            return formatInformation;
        }
        return null;
    }

    public static int numBitsDiffering(int n3, int n4) {
        return Integer.bitCount(n3 ^ n4);
    }

    public boolean equals(Object object) {
        byte by2;
        byte by4 = object instanceof FormatInformation;
        if (by4 == 0) {
            return false;
        }
        object = (FormatInformation)object;
        ErrorCorrectionLevel errorCorrectionLevel = this.errorCorrectionLevel;
        ErrorCorrectionLevel errorCorrectionLevel2 = ((FormatInformation)object).errorCorrectionLevel;
        return errorCorrectionLevel == errorCorrectionLevel2 && (by4 = this.dataMask) == (by2 = ((FormatInformation)object).dataMask);
    }

    public byte getDataMask() {
        return this.dataMask;
    }

    public ErrorCorrectionLevel getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    public int hashCode() {
        int n3 = this.errorCorrectionLevel.ordinal() << 3;
        byte by2 = this.dataMask;
        return n3 | by2;
    }
}

