/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.UPCEANReader;

public final class UPCEReader
extends UPCEANReader {
    private static final int[] MIDDLE_END_PATTERN;
    static final int[][] NUMSYS_AND_CHECK_DIGIT_PATTERNS;
    private final int[] decodeMiddleCounters;

    static {
        int[] nArray;
        int[] nArray2;
        int[] nArray3 = nArray2 = new int[6];
        int[] nArray4 = nArray2;
        nArray3[0] = 1;
        nArray4[1] = 1;
        nArray3[2] = 1;
        nArray4[3] = 1;
        nArray3[4] = 1;
        nArray4[5] = 1;
        MIDDLE_END_PATTERN = nArray2;
        int n3 = 10;
        int[] nArray5 = nArray = new int[n3];
        int[] nArray6 = nArray;
        nArray5[0] = 56;
        nArray6[1] = 52;
        nArray5[2] = 50;
        nArray6[3] = 49;
        nArray5[4] = 44;
        nArray6[5] = 38;
        nArray5[6] = 35;
        nArray6[7] = 42;
        nArray5[8] = 41;
        nArray6[9] = 37;
        int[] nArray7 = nArray2 = new int[n3];
        int[] nArray8 = nArray2;
        nArray7[0] = 7;
        nArray8[1] = 11;
        nArray7[2] = 13;
        nArray8[3] = 14;
        nArray7[4] = 19;
        nArray8[5] = 25;
        nArray7[6] = 28;
        nArray8[7] = 21;
        nArray7[8] = 22;
        nArray8[9] = 26;
        int[][] nArrayArray = new int[][]{nArray, nArray2};
        NUMSYS_AND_CHECK_DIGIT_PATTERNS = nArrayArray;
    }

    public UPCEReader() {
        int[] nArray = new int[4];
        this.decodeMiddleCounters = nArray;
    }

    public static String convertUPCEtoUPCA(String string2) {
        char c2 = '\u0006';
        char[] cArray = new char[c2];
        int n3 = 1;
        int n4 = 7;
        int n7 = 0;
        string2.getChars(n3, n4, cArray, 0);
        StringBuilder stringBuilder = new StringBuilder(12);
        int n8 = string2.charAt(0);
        stringBuilder.append((char)n8);
        n8 = 5;
        char c3 = cArray[n8];
        String string3 = "00000";
        String string4 = "0000";
        int n10 = 2;
        int n14 = 3;
        switch (c3) {
            default: {
                stringBuilder.append(cArray, 0, n8);
                stringBuilder.append(string4);
                stringBuilder.append(c3);
                break;
            }
            case '4': {
                n8 = 4;
                stringBuilder.append(cArray, 0, n8);
                stringBuilder.append(string3);
                c2 = cArray[n8];
                stringBuilder.append(c2);
                break;
            }
            case '3': {
                stringBuilder.append(cArray, 0, n14);
                stringBuilder.append(string3);
                stringBuilder.append(cArray, n14, n10);
                break;
            }
            case '0': 
            case '1': 
            case '2': {
                stringBuilder.append(cArray, 0, n10);
                stringBuilder.append(c3);
                stringBuilder.append(string4);
                stringBuilder.append(cArray, n10, n14);
            }
        }
        c2 = string2.length();
        n7 = 8;
        if (c2 >= n7) {
            char c5 = string2.charAt(n4);
            stringBuilder.append(c5);
        }
        return stringBuilder.toString();
    }

    private static void determineNumSysAndCheckDigit(StringBuilder stringBuilder, int n3) {
        int n4;
        for (int i3 = 0; i3 <= (n4 = 1); ++i3) {
            int n7;
            for (n4 = 0; n4 < (n7 = 10); ++n4) {
                int[] nArray = NUMSYS_AND_CHECK_DIGIT_PATTERNS[i3];
                n7 = nArray[n4];
                if (n3 != n7) continue;
                n3 = (char)(i3 + 48);
                stringBuilder.insert(0, (char)n3);
                n3 = (char)(n4 + 48);
                stringBuilder.append((char)n3);
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public boolean checkChecksum(String string2) {
        string2 = UPCEReader.convertUPCEtoUPCA(string2);
        return super.checkChecksum(string2);
    }

    public int[] decodeEnd(BitArray bitArray, int n3) {
        int[] nArray = MIDDLE_END_PATTERN;
        return UPCEANReader.findGuardPattern(bitArray, n3, true, nArray);
    }

    public int decodeMiddle(BitArray bitArray, int[] nArray, StringBuilder stringBuilder) {
        int n3;
        int[] nArray2 = this.decodeMiddleCounters;
        nArray2[0] = 0;
        int n4 = 1;
        nArray2[n4] = 0;
        nArray2[2] = 0;
        nArray2[3] = 0;
        int n7 = bitArray.getSize();
        int n8 = nArray[n4];
        int n10 = 0;
        for (int i3 = 0; i3 < (n3 = 6) && n8 < n7; ++i3) {
            int[][] nArray3 = UPCEANReader.L_AND_G_PATTERNS;
            n3 = UPCEANReader.decodeDigit(bitArray, nArray2, n8, nArray3);
            int n14 = n3 % 10 + 48;
            stringBuilder.append((char)n14);
            for (int n15 : nArray2) {
                n8 += n15;
            }
            n14 = 10;
            if (n3 < n14) continue;
            n3 = 5 - i3;
            n3 = n4 << n3;
            n10 |= n3;
        }
        UPCEReader.determineNumSysAndCheckDigit(stringBuilder, n10);
        return n8;
    }

    public BarcodeFormat getBarcodeFormat() {
        return BarcodeFormat.UPC_E;
    }
}

