/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.UPCEANReader;

public final class EAN13Reader
extends UPCEANReader {
    static final int[] FIRST_DIGIT_ENCODINGS;
    private final int[] decodeMiddleCounters;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[10];
        int[] nArray3 = nArray;
        nArray2[0] = 0;
        nArray3[1] = 11;
        nArray2[2] = 13;
        nArray3[3] = 14;
        nArray2[4] = 19;
        nArray3[5] = 25;
        nArray2[6] = 28;
        nArray3[7] = 21;
        nArray2[8] = 22;
        nArray3[9] = 26;
        FIRST_DIGIT_ENCODINGS = nArray;
    }

    public EAN13Reader() {
        int[] nArray = new int[4];
        this.decodeMiddleCounters = nArray;
    }

    private static void determineFirstDigit(StringBuilder stringBuilder, int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = 10); ++i3) {
            int[] nArray = FIRST_DIGIT_ENCODINGS;
            n4 = nArray[i3];
            if (n3 != n4) continue;
            n3 = (char)(i3 + 48);
            stringBuilder.insert(0, (char)n3);
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public int decodeMiddle(BitArray bitArray, int[] nArray, StringBuilder stringBuilder) {
        int n3;
        int n4;
        int[] nArray2 = this.decodeMiddleCounters;
        nArray2[0] = 0;
        int n7 = 1;
        nArray2[n7] = 0;
        nArray2[2] = 0;
        nArray2[3] = 0;
        int n8 = bitArray.getSize();
        int n10 = nArray[n7];
        Object object = null;
        int n14 = 0;
        for (n4 = 0; n4 < (n3 = 6) && n10 < n8; ++n4) {
            int[][] nArray3 = UPCEANReader.L_AND_G_PATTERNS;
            n3 = UPCEANReader.decodeDigit(bitArray, nArray2, n10, nArray3);
            int n15 = n3 % 10 + 48;
            stringBuilder.append((char)n15);
            for (int n16 : nArray2) {
                n10 += n16;
            }
            n15 = 10;
            if (n3 < n15) continue;
            n3 = 5 - n4;
            n3 = n7 << n3;
            n14 |= n3;
        }
        EAN13Reader.determineFirstDigit(stringBuilder, n14);
        object = UPCEANReader.MIDDLE_PATTERN;
        nArray = UPCEANReader.findGuardPattern(bitArray, n10, n7 != 0, object);
        n10 = nArray[n7];
        for (n7 = 0; n7 < n3 && n10 < n8; ++n7) {
            object = UPCEANReader.L_PATTERNS;
            n4 = (char)(UPCEANReader.decodeDigit(bitArray, nArray2, n10, (int[][])object) + 48);
            stringBuilder.append((char)n4);
            for (int n15 : nArray2) {
                n10 += n15;
            }
        }
        return n10;
    }

    public BarcodeFormat getBarcodeFormat() {
        return BarcodeFormat.EAN_13;
    }
}

