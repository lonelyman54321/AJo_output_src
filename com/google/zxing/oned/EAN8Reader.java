/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.UPCEANReader;

public final class EAN8Reader
extends UPCEANReader {
    private final int[] decodeMiddleCounters;

    public EAN8Reader() {
        int[] nArray = new int[4];
        this.decodeMiddleCounters = nArray;
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
        for (n4 = 0; n4 < (n3 = 4) && n10 < n8; ++n4) {
            int[][] nArray3 = UPCEANReader.L_PATTERNS;
            n3 = (char)(UPCEANReader.decodeDigit(bitArray, nArray2, n10, nArray3) + 48);
            stringBuilder.append((char)n3);
            n3 = nArray2.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                int n14 = nArray2[i3];
                n10 += n14;
            }
        }
        object = UPCEANReader.MIDDLE_PATTERN;
        nArray = UPCEANReader.findGuardPattern(bitArray, n10, n7 != 0, object);
        n10 = nArray[n7];
        for (n7 = 0; n7 < n3 && n10 < n8; ++n7) {
            object = UPCEANReader.L_PATTERNS;
            n4 = (char)(UPCEANReader.decodeDigit(bitArray, nArray2, n10, (int[][])object) + 48);
            stringBuilder.append((char)n4);
            for (int n14 : nArray2) {
                n10 += n14;
            }
        }
        return n10;
    }

    public BarcodeFormat getBarcodeFormat() {
        return BarcodeFormat.EAN_8;
    }
}

