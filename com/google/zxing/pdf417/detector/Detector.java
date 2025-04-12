/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.detector;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.detector.PDF417DetectorResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class Detector {
    private static final int BARCODE_MIN_HEIGHT = 10;
    private static final int[] INDEXES_START_PATTERN;
    private static final int[] INDEXES_STOP_PATTERN;
    private static final float MAX_AVG_VARIANCE = 0.42f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.8f;
    private static final int MAX_PATTERN_DRIFT = 5;
    private static final int MAX_PIXEL_DRIFT = 3;
    private static final int ROW_STEP = 5;
    private static final int SKIPPED_ROW_COUNT_MAX = 25;
    private static final int[] START_PATTERN;
    private static final int[] STOP_PATTERN;

    static {
        int[] nArray;
        INDEXES_START_PATTERN = new int[]{0, 4, 1, 5};
        INDEXES_STOP_PATTERN = new int[]{6, 2, 7, 3};
        int[] nArray2 = nArray = new int[8];
        int[] nArray3 = nArray;
        nArray2[0] = 8;
        nArray3[1] = 1;
        nArray2[2] = 1;
        nArray3[3] = 1;
        nArray2[4] = 1;
        nArray3[5] = 1;
        nArray2[6] = 1;
        nArray3[7] = 3;
        START_PATTERN = nArray;
        int[] nArray4 = nArray = new int[9];
        int[] nArray5 = nArray;
        nArray4[0] = 7;
        nArray5[1] = 1;
        nArray4[2] = 1;
        nArray5[3] = 3;
        nArray4[4] = 1;
        nArray5[5] = 1;
        nArray4[6] = 1;
        nArray5[7] = 2;
        nArray5[8] = 1;
        STOP_PATTERN = nArray;
    }

    private Detector() {
    }

    private static void copyToResult(ResultPoint[] resultPointArray, ResultPoint[] resultPointArray2, int[] nArray) {
        int n3;
        for (int i3 = 0; i3 < (n3 = nArray.length); ++i3) {
            ResultPoint resultPoint;
            n3 = nArray[i3];
            resultPointArray[n3] = resultPoint = resultPointArray2[i3];
        }
    }

    public static PDF417DetectorResult detect(BinaryBitmap object, Map object2, boolean bl2) {
        object2 = Detector.detect(bl2, (BitMatrix)(object = ((BinaryBitmap)object).getBlackMatrix()));
        boolean bl3 = object2.isEmpty();
        if (bl3) {
            object = ((BitMatrix)object).clone();
            ((BitMatrix)object).rotate180();
            object2 = Detector.detect(bl2, (BitMatrix)object);
        }
        PDF417DetectorResult pDF417DetectorResult = new PDF417DetectorResult((BitMatrix)object, (List)object2);
        return pDF417DetectorResult;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static List detect(boolean bl2, BitMatrix bitMatrix) {
        ArrayList<ResultPoint[]> arrayList = new ArrayList<ResultPoint[]>();
        int n3 = 0;
        float f5 = 0.0f;
        Object object = null;
        block0: while (true) {
            int n4;
            int n7 = 0;
            Object object2 = null;
            int n8 = 0;
            float f6 = 0.0f;
            Object object3 = null;
            while (n3 < (n4 = bitMatrix.getHeight())) {
                Object object4;
                object2 = Detector.findVertices(bitMatrix, n3, n7);
                ResultPoint resultPoint = object2[0];
                int n10 = 1;
                if (resultPoint == null && (object4 = object2[n4 = 3]) == null) {
                    if (n8 == 0) break block0;
                    object2 = arrayList.iterator();
                    while ((n8 = object2.hasNext()) != 0) {
                        object3 = (ResultPoint[])object2.next();
                        object4 = object3[n10];
                        if (object4 != null) {
                            f5 = n3;
                            float f7 = ((ResultPoint)object4).getY();
                            f5 = Math.max(f5, f7);
                            n3 = (int)f5;
                        }
                        if ((object3 = object3[n4]) == null) continue;
                        f6 = ((ResultPoint)object3).getY();
                        n8 = (int)f6;
                        n3 = Math.max(n3, n8);
                    }
                    n3 += 5;
                    continue block0;
                }
                arrayList.add((ResultPoint[])object2);
                if (!bl2) break block0;
                n3 = 2;
                f5 = 2.8E-45f;
                object3 = object2[n3];
                if (object3 != null) {
                    f6 = ((ResultPoint)object3).getX();
                    n8 = (int)f6;
                    object = object2[n3];
                    f5 = ((ResultPoint)object).getY();
                } else {
                    n3 = 4;
                    object3 = object2[n3];
                    f6 = ((ResultPoint)object3).getX();
                    n8 = (int)f6;
                    object = object2[n3];
                    f5 = ((ResultPoint)object).getY();
                }
                n3 = (int)f5;
                n7 = n8;
                n8 = 1;
                f6 = Float.MIN_VALUE;
            }
            break;
        }
        return arrayList;
    }

    private static int[] findGuardPattern(BitMatrix bitMatrix, int n3, int n4, int n7, boolean n8, int[] nArray, int[] nArray2) {
        float f5;
        float f6;
        float f7;
        int n10;
        float f8;
        float f11;
        int n14;
        int n15;
        int n16 = nArray2.length;
        Arrays.fill(nArray2, 0, n16, 0);
        n16 = 0;
        while ((n15 = bitMatrix.get(n3, n4)) != 0 && n3 > 0) {
            n15 = n16 + 1;
            n14 = 3;
            if (n16 >= n14) break;
            n3 += -1;
            n16 = n15;
        }
        n16 = nArray.length;
        n15 = n8;
        n14 = 0;
        n8 = n3;
        while (true) {
            int n17 = 1054280253;
            f11 = 0.42f;
            int n18 = 1061997773;
            f8 = 0.8f;
            n10 = 1;
            if (n3 >= n7) break;
            int n19 = bitMatrix.get(n3, n4);
            if (n19 != n15) {
                nArray2[n14] = n17 = nArray2[n14] + n10;
            } else {
                n19 = n16 + -1;
                if (n14 == n19) {
                    float f12 = (f8 = Detector.patternMatchVariance(nArray2, nArray, f8)) - f11;
                    n17 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
                    if (n17 < 0) {
                        return new int[]{n8, n3};
                    }
                    n17 = nArray2[0];
                    n18 = nArray2[n10];
                    n8 += (n17 += n18);
                    n17 = n14 + -1;
                    n18 = 2;
                    f8 = 2.8E-45f;
                    System.arraycopy(nArray2, n18, nArray2, 0, n17);
                    nArray2[n17] = 0;
                    nArray2[n14] = 0;
                    n14 += -1;
                } else {
                    ++n14;
                }
                nArray2[n14] = n10;
                n15 ^= 1;
            }
            ++n3;
        }
        if (n14 == (n16 -= n10) && (f7 = (f6 = (f5 = Detector.patternMatchVariance(nArray2, nArray, f8)) - f11) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) < 0) {
            return new int[]{n8, n3 -= n10};
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static ResultPoint[] findRowsWithPattern(BitMatrix var0, int var1_1, int var2_2, int var3_3, int var4_4, int[] var5_5) {
        block10: {
            block9: {
                block8: {
                    var6_6 = var1_1;
                    var7_7 = 4;
                    var8_8 = new ResultPoint[var7_7];
                    var9_9 = var5_5.length;
                    var10_10 = new int[var9_9];
                    var11_11 = var3_3;
                    while (true) {
                        var12_12 = 1;
                        if (var11_11 >= var6_6) break;
                        var13_13 = var0;
                        var14_14 /* !! */  = var4_4;
                        var15_15 /* !! */  = var11_11;
                        var16_16 /* !! */  = var2_2;
                        var13_13 = Detector.findGuardPattern(var0, var4_4, var11_11, var2_2, false, var5_5, var10_10);
                        if (var13_13 != null) {
                            var17_17 = var11_11;
                            var18_18 = var13_13;
                            while (var17_17 > 0) {
                                var19_19 = var17_17 + -1;
                                var13_13 = var0;
                                var14_14 /* !! */  = var4_4;
                                var15_15 /* !! */  = var19_19;
                                var16_16 /* !! */  = var2_2;
                                var13_13 = Detector.findGuardPattern(var0, var4_4, var19_19, var2_2, false, var5_5, var10_10);
                                if (var13_13 == null) break;
                                var18_18 = var13_13;
                                var17_17 = var19_19;
                            }
                            var20_20 = (float)var18_18[0];
                            var21_21 = var17_17;
                            var8_8[0] = var13_13 = new ResultPoint(var20_20, var21_21);
                            var14_14 /* !! */  = (int)var18_18[var12_12];
                            var20_20 = var14_14 /* !! */ ;
                            var8_8[var12_12] = var13_13 = new ResultPoint(var20_20, var21_21);
                            var11_11 = var17_17;
                            var9_9 = 1;
                            var22_22 = 1.4E-45f;
                            break block8;
                        }
                        var11_11 += 5;
                    }
                    var9_9 = 0;
                    var22_22 = 0.0f;
                    var13_13 = null;
                }
                var14_14 /* !! */  = var11_11 + 1;
                if (var9_9 == 0) break block10;
                var17_17 = 2;
                var13_13 = new int[var17_17];
                var15_15 /* !! */  = (int)var8_8[0].getX();
                var13_13[0] = var15_15 /* !! */ ;
                var23_23 = var8_8[var12_12];
                var21_21 = var23_23.getX();
                var15_15 /* !! */  = (int)var21_21;
                var13_13[var12_12] = var15_15 /* !! */ ;
                var24_24 = var13_13;
                var25_25 = var14_14 /* !! */ ;
                var26_26 = 0;
                while (var25_25 < var6_6) {
                    var14_14 /* !! */  = (int)var24_24[0];
                    var13_13 = var0;
                    var15_15 /* !! */  = var25_25;
                    var16_16 /* !! */  = var2_2;
                    var17_17 = var26_26;
                    var27_27 = var25_25;
                    var13_13 = Detector.findGuardPattern(var0, var14_14 /* !! */ , var25_25, var2_2, false, var5_5, var10_10);
                    if (var13_13 == null) ** GOTO lbl-1000
                    var14_14 /* !! */  = (int)var24_24[0];
                    var15_15 /* !! */  = (int)var13_13[0];
                    var14_14 /* !! */  = Math.abs(var14_14 /* !! */  - var15_15 /* !! */ );
                    var15_15 /* !! */  = 5;
                    var21_21 = 7.0E-45f;
                    if (var14_14 /* !! */  >= var15_15 /* !! */ ) ** GOTO lbl-1000
                    var14_14 /* !! */  = (int)var24_24[var12_12];
                    var16_16 /* !! */  = (int)var13_13[var12_12];
                    if ((var14_14 /* !! */  = Math.abs(var14_14 /* !! */  - var16_16 /* !! */ )) < var15_15 /* !! */ ) {
                        var24_24 = var13_13;
                        var26_26 = 0;
                    } else lbl-1000:
                    // 3 sources

                    {
                        var9_9 = 25;
                        var22_22 = 3.5E-44f;
                        if (var17_17 > var9_9) break block9;
                        var26_26 = var17_17 + 1;
                    }
                    var25_25 = var27_27 + 1;
                    var17_17 = 2;
                }
                var17_17 = var26_26;
                var27_27 = var25_25;
            }
            var26_26 = var17_17 + 1;
            var14_14 /* !! */  = var27_27 - var26_26;
            var22_22 = (float)var24_24[0];
            var21_21 = var14_14 /* !! */ ;
            var28_28 = new ResultPoint(var22_22, var21_21);
            var8_8[2] = var28_28;
            var22_22 = (float)var24_24[var12_12];
            var28_28 = new ResultPoint(var22_22, var21_21);
            var9_9 = 3;
            var22_22 = 4.2E-45f;
            var8_8[var9_9] = var28_28;
        }
        if ((var14_14 /* !! */  -= var11_11) < (var6_6 = 10)) {
            var6_6 = 0;
            var28_28 = null;
            Arrays.fill(var8_8, null);
        }
        return var8_8;
    }

    private static ResultPoint[] findVertices(BitMatrix resultPointArray, int n3, int n4) {
        Object object;
        int n7 = resultPointArray.getHeight();
        int n8 = resultPointArray.getWidth();
        ResultPoint[] resultPointArray2 = new ResultPoint[8];
        int[] nArray = START_PATTERN;
        ResultPoint[] resultPointArray3 = resultPointArray;
        resultPointArray3 = Detector.findRowsWithPattern((BitMatrix)resultPointArray, n7, n8, n3, n4, nArray);
        Object object2 = INDEXES_START_PATTERN;
        Detector.copyToResult(resultPointArray2, resultPointArray3, (int[])object2);
        int n10 = 4;
        object2 = resultPointArray2[n10];
        if (object2 != null) {
            n4 = (int)((ResultPoint)object2).getX();
            object = resultPointArray2[n10];
            float f5 = ((ResultPoint)object).getY();
            n3 = (int)f5;
        }
        nArray = STOP_PATTERN;
        resultPointArray3 = resultPointArray;
        resultPointArray = Detector.findRowsWithPattern((BitMatrix)resultPointArray, n7, n8, n3, n4, nArray);
        object = INDEXES_STOP_PATTERN;
        Detector.copyToResult(resultPointArray2, resultPointArray, (int[])object);
        return resultPointArray2;
    }

    private static float patternMatchVariance(int[] nArray, int[] nArray2, float f5) {
        int n3;
        int n4;
        int n7 = nArray.length;
        int n8 = 0;
        float f6 = 0.0f;
        int n10 = 0;
        float f7 = 0.0f;
        int n14 = 0;
        float f8 = 0.0f;
        for (n4 = 0; n4 < n7; ++n4) {
            n3 = nArray[n4];
            n10 += n3;
            n3 = nArray2[n4];
            n14 += n3;
        }
        n4 = 2139095040;
        f6 = 1.0f / 0.0f;
        if (n10 < n14) {
            return f6;
        }
        f7 = n10;
        f8 = n14;
        f8 = f7 / f8;
        f5 *= f8;
        n3 = 0;
        float f11 = 0.0f;
        while (n8 < n7) {
            int n15 = nArray[n8];
            float f12 = n15;
            int n16 = nArray2[n8];
            float f14 = (float)n16 * f8;
            float f15 = f12 - f14;
            Object object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            f12 = object > 0 ? (f12 -= f14) : f14 - f12;
            n16 = (int)(f12 == f5 ? 0 : (f12 > f5 ? 1 : -1));
            if (n16 > 0) {
                return f6;
            }
            f11 += f12;
            ++n8;
        }
        return f11 / f7;
    }
}

