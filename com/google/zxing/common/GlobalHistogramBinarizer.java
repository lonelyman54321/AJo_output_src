/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

public class GlobalHistogramBinarizer
extends Binarizer {
    private static final byte[] EMPTY = new byte[0];
    private static final int LUMINANCE_BITS = 5;
    private static final int LUMINANCE_BUCKETS = 32;
    private static final int LUMINANCE_SHIFT = 3;
    private final int[] buckets;
    private byte[] luminances;

    public GlobalHistogramBinarizer(LuminanceSource object) {
        super((LuminanceSource)object);
        object = EMPTY;
        this.luminances = (byte[])object;
        object = new int[32];
        this.buckets = (int[])object;
    }

    private static int estimateBlackPoint(int[] nArray) {
        int n3;
        int n4;
        int n7;
        int n8 = nArray.length;
        int n10 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        for (n7 = 0; n7 < n8; ++n7) {
            n4 = nArray[n7];
            if (n4 > n14) {
                n16 = n7;
                n14 = n4;
            }
            if (n4 <= n15) continue;
            n15 = n4;
        }
        n7 = 0;
        n14 = 0;
        while (n10 < n8) {
            n4 = n10 - n16;
            n3 = nArray[n10] * n4 * n4;
            if (n3 > n14) {
                n7 = n10;
                n14 = n3;
            }
            ++n10;
        }
        if (n16 <= n7) {
            int n17 = n16;
            n16 = n7;
            n7 = n17;
        }
        n10 = n16 - n7;
        if (n10 > (n8 /= 16)) {
            n10 = n8 = n16 + -1;
            n14 = -1;
            while (n8 > n7) {
                n4 = n8 - n7;
                n4 *= n4;
                n3 = (n16 - n8) * n4;
                n4 = nArray[n8];
                if ((n4 = (n15 - n4) * n3) > n14) {
                    n10 = n8;
                    n14 = n4;
                }
                n8 += -1;
            }
            return n10 << 3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void initArrays(int n3) {
        int n4;
        byte[] byArray;
        byte[] byArray2 = this.luminances;
        int n7 = byArray2.length;
        if (n7 < n3) {
            byArray = new byte[n3];
            this.luminances = byArray;
        }
        n3 = 0;
        byArray = null;
        byArray2 = null;
        for (n7 = 0; n7 < (n4 = 32); ++n7) {
            int[] nArray = this.buckets;
            nArray[n7] = 0;
        }
    }

    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        GlobalHistogramBinarizer globalHistogramBinarizer = new GlobalHistogramBinarizer(luminanceSource);
        return globalHistogramBinarizer;
    }

    public BitMatrix getBlackMatrix() {
        int n3;
        byte[] byArray;
        int n4;
        int n7;
        int n8;
        Object object = this.getLuminanceSource();
        int n10 = ((LuminanceSource)object).getWidth();
        int n14 = ((LuminanceSource)object).getHeight();
        BitMatrix bitMatrix = new BitMatrix(n10, n14);
        this.initArrays(n10);
        int[] nArray = this.buckets;
        int n15 = 1;
        for (n8 = 1; n8 < (n7 = 5); ++n8) {
            n4 = n14 * n8 / n7;
            byte[] byArray2 = this.luminances;
            byArray = ((LuminanceSource)object).getRow(n4, byArray2);
            n3 = (n10 << 2) / n7;
            for (n7 = n10 / 5; n7 < n3; ++n7) {
                int n16;
                int n17 = (byArray[n7] & 0xFF) >> 3;
                nArray[n17] = n16 = nArray[n17] + n15;
            }
        }
        int n18 = GlobalHistogramBinarizer.estimateBlackPoint(nArray);
        object = ((LuminanceSource)object).getMatrix();
        n15 = 0;
        for (n8 = 0; n8 < n14; ++n8) {
            n7 = n8 * n10;
            byArray = null;
            for (n4 = 0; n4 < n10; ++n4) {
                n3 = n7 + n4;
                if ((n3 = object[n3] & 0xFF) >= n18) continue;
                bitMatrix.set(n4, n8);
            }
        }
        return bitMatrix;
    }

    public BitArray getBlackRow(int n3, BitArray bitArray) {
        Object object;
        int n4;
        Object object2;
        int n7;
        Object object3 = this.getLuminanceSource();
        int n8 = ((LuminanceSource)object3).getWidth();
        if (bitArray != null && (n7 = bitArray.getSize()) >= n8) {
            bitArray.clear();
        } else {
            bitArray = new BitArray(n8);
        }
        this.initArrays(n8);
        byte[] byArray = this.luminances;
        byte[] byArray2 = ((LuminanceSource)object3).getRow(n3, byArray);
        object3 = this.buckets;
        n7 = 0;
        byArray = null;
        int n10 = 0;
        while (true) {
            object2 = 3;
            n4 = 1;
            if (n10 >= n8) break;
            object2 = (byArray2[n10] & 0xFF) >> 3;
            object3[object2] = object = object3[object2] + n4;
            ++n10;
        }
        int n14 = GlobalHistogramBinarizer.estimateBlackPoint((int[])object3);
        if (n8 < object2) {
            while (n7 < n8) {
                n10 = byArray2[n7] & 0xFF;
                if (n10 < n14) {
                    bitArray.set(n7);
                }
                ++n7;
            }
        } else {
            n7 = byArray2[0] & 0xFF;
            n10 = byArray2[n4] & 0xFF;
            object2 = 1;
            int n15 = n10;
            n10 = n7;
            n7 = n15;
            while (object2 < (object = (Object)(n8 + -1))) {
                object = object2 + 1;
                int n16 = byArray2[object] & 0xFF;
                int n17 = ((n7 << 2) - n10 - n16) / 2;
                if (n17 < n14) {
                    bitArray.set((int)object2);
                }
                n10 = n7;
                object2 = object;
                n7 = n16;
            }
        }
        return bitArray;
    }
}

