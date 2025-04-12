/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GlobalHistogramBinarizer;
import java.lang.reflect.Array;

public final class HybridBinarizer
extends GlobalHistogramBinarizer {
    private static final int BLOCK_SIZE = 8;
    private static final int BLOCK_SIZE_MASK = 7;
    private static final int BLOCK_SIZE_POWER = 3;
    private static final int MINIMUM_DIMENSION = 40;
    private static final int MIN_DYNAMIC_RANGE = 24;
    private BitMatrix matrix;

    public HybridBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int[][] calculateBlackPoints(byte[] var0, int var1_1, int var2_2, int var3_3, int var4_4) {
        var5_5 = var1_1;
        var6_6 = var2_2;
        var7_7 = 8;
        var8_8 = var4_4 + -8;
        var9_9 = var3_3 + -8;
        var10_10 = 2;
        var11_11 /* !! */  = new int[var10_10];
        var12_12 = 1;
        var11_11 /* !! */ [var12_12] = var1_1;
        var13_13 = 0;
        var11_11 /* !! */ [0] = var2_2;
        var11_11 /* !! */  = (int[])((int[][])Array.newInstance(Integer.TYPE, var11_11 /* !! */ ));
        for (var14_14 = 0; var14_14 < var6_6; ++var14_14) {
            var15_15 = var14_14 << 3;
            if (var15_15 > var8_8) {
                var15_15 = var8_8;
            }
            for (var16_16 = 0; var16_16 < var5_5; ++var16_16) {
                var17_17 = var16_16 << 3;
                if (var17_17 > var9_9) {
                    var17_17 = var9_9;
                }
                var18_18 = var15_15 * var3_3 + var17_17;
                var17_17 = 255;
                var13_13 = 255;
                var19_19 = 0;
                var20_20 = 0;
                var21_21 = 0;
                while (var19_19 < var7_7) {
                    var12_12 = var21_21;
                    for (var10_10 = 0; var10_10 < var7_7; ++var10_10) {
                        var21_21 = var18_18 + var10_10;
                        var7_7 = var0[var21_21] & var17_17;
                        var20_20 += var7_7;
                        if (var7_7 < var13_13) {
                            var13_13 = var7_7;
                        }
                        if (var7_7 > var12_12) {
                            var12_12 = var7_7;
                        }
                        var7_7 = 8;
                    }
                    var7_7 = var12_12 - var13_13;
                    var10_10 = 24;
                    if (var7_7 > var10_10) {
                        block4: while (true) {
                            var18_18 += var3_3;
                            var7_7 = 8;
                            if (++var19_19 >= var7_7) break;
                            var10_10 = 0;
                            while (true) {
                                if (var10_10 >= var7_7) continue block4;
                                var21_21 = var18_18 + var10_10;
                                var7_7 = var0[var21_21] & var17_17;
                                var20_20 += var7_7;
                                ++var10_10;
                                var7_7 = 8;
                            }
                            break;
                        }
                    }
                    ++var19_19;
                    var18_18 += var3_3;
                    var21_21 = var12_12;
                    var7_7 = 8;
                    var12_12 = 1;
                }
                var7_7 = 1;
                var10_10 = var20_20 >> 6;
                var12_12 = var21_21 - var13_13;
                var17_17 = 24;
                if (var12_12 > var17_17) ** GOTO lbl-1000
                var10_10 = var13_13 / 2;
                if (var14_14 > 0 && var16_16 > 0) {
                    var12_12 = var14_14 + -1;
                    var22_22 = var11_11 /* !! */ [var12_12];
                    var17_17 = var22_22[var16_16];
                    var23_23 = var11_11 /* !! */ [var14_14];
                    var19_19 = var16_16 + -1;
                    var18_18 = var23_23[var19_19];
                    var20_20 = 2;
                    var18_18 = var18_18 * 2 + var17_17;
                    var12_12 = var22_22[var19_19];
                    if (var13_13 < (var12_12 = (var18_18 += var12_12) / 4)) {
                        var10_10 = var12_12;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var20_20 = 2;
                }
                var22_22 = var11_11 /* !! */ [var14_14];
                var22_22[var16_16] = var10_10;
                var7_7 = 8;
                var10_10 = 2;
                var12_12 = 1;
                var13_13 = 0;
            }
            var20_20 = 2;
            var7_7 = 8;
            var10_10 = 2;
            var12_12 = 1;
            var13_13 = 0;
        }
        return var11_11 /* !! */ ;
    }

    private static void calculateThresholdForBlock(byte[] byArray, int n3, int n4, int n7, int n8, int[][] nArray, BitMatrix bitMatrix) {
        int n10 = n3;
        int n14 = n4;
        int n15 = n8 + -8;
        int n16 = n7 + -8;
        for (int i3 = 0; i3 < n14; ++i3) {
            int n17 = i3 << 3;
            int n18 = n17 > n15 ? n15 : n17;
            n17 = n14 + -3;
            int n19 = 2;
            int n20 = HybridBinarizer.cap(i3, n19, n17);
            for (int i8 = 0; i8 < n10; ++i8) {
                int n21;
                int n22;
                n17 = i8 << 3;
                int n24 = n17 > n16 ? n16 : n17;
                n17 = n10 + -3;
                n17 = HybridBinarizer.cap(i8, n19, n17);
                int n25 = 0;
                for (n22 = -2; n22 <= n19; ++n22) {
                    n21 = n20 + n22;
                    int[] nArray2 = nArray[n21];
                    int n26 = n17 + -2;
                    n26 = nArray2[n26];
                    int n27 = n17 + -1;
                    n27 = nArray2[n27];
                    n26 += n27;
                    n27 = nArray2[n17];
                    n26 += n27;
                    n27 = n17 + 1;
                    n27 = nArray2[n27];
                    n26 += n27;
                    n27 = n17 + 2;
                    n21 = nArray2[n27];
                    n25 += (n26 += n21);
                }
                n22 = n18;
                n21 = n7;
                HybridBinarizer.thresholdBlock(byArray, n24, n18, n25 /= 25, n7, bitMatrix);
            }
        }
    }

    private static int cap(int n3, int n4, int n7) {
        if (n3 < n4) {
            return n4;
        }
        if (n3 > n7) {
            return n7;
        }
        return n3;
    }

    private static void thresholdBlock(byte[] byArray, int n3, int n4, int n7, int n8, BitMatrix bitMatrix) {
        int n10;
        int n14 = n4 * n8 + n3;
        int n15 = 0;
        while (n15 < (n10 = 8)) {
            for (int i3 = 0; i3 < n10; ++i3) {
                int n16 = n14 + i3;
                if ((n16 = byArray[n16] & 0xFF) > n7) continue;
                n16 = n3 + i3;
                int n17 = n4 + n15;
                bitMatrix.set(n16, n17);
            }
            ++n15;
            n14 += n8;
        }
    }

    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        HybridBinarizer hybridBinarizer = new HybridBinarizer(luminanceSource);
        return hybridBinarizer;
    }

    public BitMatrix getBlackMatrix() {
        Object object = this.matrix;
        if (object != null) {
            return object;
        }
        object = this.getLuminanceSource();
        int n3 = ((LuminanceSource)object).getWidth();
        int n4 = ((LuminanceSource)object).getHeight();
        int n7 = 40;
        if (n3 >= n7 && n4 >= n7) {
            byte[] byArray = ((LuminanceSource)object).getMatrix();
            int n8 = n3 >> 3;
            int n10 = n3 & 7;
            if (n10 != 0) {
                ++n8;
            }
            n10 = n8;
            n8 = n4 >> 3;
            int n14 = n4 & 7;
            if (n14 != 0) {
                ++n8;
            }
            n14 = n8;
            int[][] nArray = HybridBinarizer.calculateBlackPoints(byArray, n10, n8, n3, n4);
            object = new BitMatrix(n3, n4);
            HybridBinarizer.calculateThresholdForBlock(byArray, n10, n8, n3, n4, nArray, (BitMatrix)object);
            this.matrix = object;
        } else {
            this.matrix = object = super.getBlackMatrix();
        }
        return this.matrix;
    }
}

