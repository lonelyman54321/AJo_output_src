/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Array;

final class PDF417CodewordDecoder {
    private static final float[][] RATIOS_TABLE;

    static {
        int n3;
        int n4;
        int n7 = PDF417Common.SYMBOL_TABLE.length;
        int n8 = 2;
        int[] nArray = new int[n8];
        nArray[1] = n4 = 8;
        nArray[0] = n7;
        RATIOS_TABLE = (float[][])Array.newInstance(Float.TYPE, nArray);
        for (n7 = 0; n7 < (n3 = (nArray = PDF417Common.SYMBOL_TABLE).length); ++n7) {
            n8 = nArray[n7];
            n3 = n8 & 1;
            for (int i3 = 0; i3 < n4; ++i3) {
                int n10;
                float f5 = 0.0f;
                while ((n10 = n8 & 1) == n3) {
                    n10 = 1065353216;
                    float f6 = 1.0f;
                    f5 += f6;
                    n8 >>= 1;
                }
                float[] fArray = RATIOS_TABLE[n7];
                int n14 = 7 - i3;
                float f7 = 17.0f;
                fArray[n14] = f5 /= f7;
                n3 = n10;
            }
        }
    }

    private PDF417CodewordDecoder() {
    }

    private static int getBitValue(int[] nArray) {
        int n3;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n3 = nArray.length); ++i3) {
            int n4;
            for (n3 = 0; n3 < (n4 = nArray[i3]); ++n3) {
                n4 = 1;
                l2 <<= n4;
                int n7 = i3 % 2;
                if (n7 != 0) {
                    n4 = 0;
                }
                long l3 = n4;
                l2 |= l3;
            }
        }
        return (int)l2;
    }

    private static int getClosestDecodedValue(int[] nArray) {
        Object object;
        int n3;
        float f5;
        int n4;
        int n7 = MathUtils.sum(nArray);
        int n8 = 8;
        float[] fArray = new float[n8];
        int n10 = 1;
        if (n7 > n10) {
            for (n10 = 0; n10 < n8; ++n10) {
                n4 = nArray[n10];
                float f6 = n4;
                f5 = n7;
                fArray[n10] = f6 /= f5;
            }
        }
        int n14 = 0x7F7FFFFF;
        float f7 = Float.MAX_VALUE;
        n7 = -1;
        for (n10 = 0; n10 < (n3 = ((float[][])(object = RATIOS_TABLE)).length); ++n10) {
            object = object[n10];
            n3 = 0;
            f5 = 0.0f;
            for (int i3 = 0; i3 < n8; ++i3) {
                Object object2 = object[i3];
                float f8 = fArray[i3];
                object2 = object2 - f8;
                float f11 = (f5 += (object2 = (Object)(object2 * object2))) - f7;
                Object object3 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                if (object3 >= 0) break;
            }
            if ((n4 = (int)(f5 == f7 ? 0 : (f5 < f7 ? -1 : 1))) >= 0) continue;
            nArray = PDF417Common.SYMBOL_TABLE;
            n7 = n14 = nArray[n10];
            f7 = f5;
        }
        return n7;
    }

    private static int getDecodedCodewordValue(int[] nArray) {
        int n3;
        int n4 = PDF417CodewordDecoder.getBitValue(nArray);
        int n7 = PDF417Common.getCodeword(n4);
        if (n7 == (n3 = -1)) {
            return n3;
        }
        return n4;
    }

    public static int getDecodedValue(int[] nArray) {
        int n3;
        int[] nArray2 = PDF417CodewordDecoder.sampleBitCounts(nArray);
        int n4 = PDF417CodewordDecoder.getDecodedCodewordValue(nArray2);
        if (n4 != (n3 = -1)) {
            return n4;
        }
        return PDF417CodewordDecoder.getClosestDecodedValue(nArray);
    }

    private static int[] sampleBitCounts(int[] nArray) {
        int n3 = MathUtils.sum(nArray);
        float f5 = n3;
        int n4 = 8;
        int[] nArray2 = new int[n4];
        int n7 = 0;
        int n8 = 0;
        int n10 = 0;
        while (true) {
            int n14 = 17;
            float f6 = 2.4E-44f;
            if (n7 >= n14) break;
            n14 = nArray[n10];
            int n15 = n8 + n14;
            float f7 = n15;
            f6 = f5 / 34.0f;
            float f8 = (float)n7 * f5 / 17.0f + f6;
            float f11 = f7 - f8;
            Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
            if (object <= 0) {
                n8 += n14;
                ++n10;
            }
            nArray2[n10] = n14 = nArray2[n10] + 1;
            ++n7;
        }
        return nArray2;
    }
}

