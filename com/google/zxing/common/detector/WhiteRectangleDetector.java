/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.detector.MathUtils;

public final class WhiteRectangleDetector {
    private static final int CORR = 1;
    private static final int INIT_SIZE = 10;
    private final int downInit;
    private final int height;
    private final BitMatrix image;
    private final int leftInit;
    private final int rightInit;
    private final int upInit;
    private final int width;

    public WhiteRectangleDetector(BitMatrix bitMatrix) {
        int n3 = bitMatrix.getWidth() / 2;
        int n4 = bitMatrix.getHeight() / 2;
        this(bitMatrix, 10, n3, n4);
    }

    public WhiteRectangleDetector(BitMatrix bitMatrix, int n3, int n4, int n7) {
        int n8;
        int n10;
        int n14;
        int n15;
        this.image = bitMatrix;
        this.height = n15 = bitMatrix.getHeight();
        this.width = n14 = bitMatrix.getWidth();
        this.leftInit = n10 = n4 - (n3 /= 2);
        this.rightInit = n4 += n3;
        this.upInit = n8 = n7 - n3;
        this.downInit = n7 += n3;
        if (n8 >= 0 && n10 >= 0 && n7 < n15 && n4 < n14) {
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private ResultPoint[] centerEdges(ResultPoint resultPointArray, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        int n8 = 4;
        float f5 = resultPointArray.getX();
        float f6 = resultPointArray.getY();
        float f7 = resultPoint.getX();
        float f8 = resultPoint.getY();
        float f11 = resultPoint2.getX();
        float f12 = resultPoint2.getY();
        float f14 = resultPoint3.getX();
        float f15 = resultPoint3.getY();
        float f16 = (float)this.width / 2.0f;
        float f17 = 1.0f;
        Object object = f5 == f16 ? 0 : (f5 < f16 ? -1 : 1);
        if (object < 0) {
            ResultPoint resultPoint4 = new ResultPoint(f14 -= f17, f15 += f17);
            resultPoint3 = new ResultPoint(f7 += f17, f8 += f17);
            resultPoint = new ResultPoint(f11 -= f17, f12 -= f17);
            resultPoint2 = new ResultPoint(f5 += f17, f6 -= f17);
            resultPointArray = new ResultPoint[n8];
            resultPointArray[0] = resultPoint4;
            resultPointArray[n7] = resultPoint3;
            resultPointArray[n4] = resultPoint;
            resultPointArray[n3] = resultPoint2;
            return resultPointArray;
        }
        ResultPoint resultPoint5 = new ResultPoint(f14 += f17, f15 += f17);
        resultPoint3 = new ResultPoint(f7 += f17, f8 -= f17);
        resultPoint = new ResultPoint(f11 -= f17, f12 += f17);
        resultPoint2 = new ResultPoint(f5 -= f17, f6 -= f17);
        resultPointArray = new ResultPoint[n8];
        resultPointArray[0] = resultPoint5;
        resultPointArray[n7] = resultPoint3;
        resultPointArray[n4] = resultPoint;
        resultPointArray[n3] = resultPoint2;
        return resultPointArray;
    }

    private boolean containsBlackPoint(int n3, int n4, int n7, boolean bl2) {
        boolean bl3 = true;
        if (bl2) {
            while (n3 <= n4) {
                BitMatrix bitMatrix = this.image;
                bl2 = bitMatrix.get(n3, n7);
                if (bl2) {
                    return bl3;
                }
                ++n3;
            }
        } else {
            while (n3 <= n4) {
                BitMatrix bitMatrix = this.image;
                bl2 = bitMatrix.get(n7, n3);
                if (bl2) {
                    return bl3;
                }
                ++n3;
            }
        }
        return false;
    }

    private ResultPoint getBlackPointOnSegment(float f5, float f6, float f7, float f8) {
        float f11 = MathUtils.distance(f5, f6, f7, f8);
        int n3 = MathUtils.round(f11);
        f7 -= f5;
        float f12 = n3;
        f7 /= f12;
        f8 = (f8 - f6) / f12;
        f12 = 0.0f;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            float f14 = i3;
            BitMatrix bitMatrix = this.image;
            float f15 = f14 * f7 + f5;
            int n7 = MathUtils.round(f15);
            boolean bl2 = bitMatrix.get(n7, n4 = MathUtils.round(f14 = f14 * f8 + f6));
            if (!bl2) continue;
            f6 = n7;
            f7 = n4;
            ResultPoint resultPoint = new ResultPoint(f6, f7);
            return resultPoint;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public ResultPoint[] detect() {
        var1_1 = this.leftInit;
        var2_2 = this.rightInit;
        var3_3 = this.upInit;
        var4_4 = this.downInit;
        var5_5 = 0;
        var6_6 = 1;
        var7_7 = 1;
        var8_8 = 1.4E-45f;
        var9_9 = false;
        var10_10 = 0.0f;
        var11_11 = null;
        var12_12 = 0;
        var13_13 = 0.0f;
        var14_14 = null;
        var15_15 = 0;
        var16_16 = 0.0f;
        var17_17 = 0;
        var18_18 = 0.0f;
        var19_19 = 0;
        var20_20 = 0.0f;
        block0: while (var7_7 != 0) {
            var7_7 = 1;
            var8_8 = 1.4E-45f;
            var21_21 = 0;
            var22_22 = 0.0f;
            while (!(var7_7 == 0 && var9_9 || var2_2 >= (var7_7 = this.width))) {
                var7_7 = (int)this.containsBlackPoint(var3_3, var4_4, var2_2, false);
                if (var7_7 != 0) {
                    ++var2_2;
                    var9_9 = true;
                    var10_10 = 1.4E-45f;
                    var21_21 = 1;
                    var22_22 = 1.4E-45f;
                    continue;
                }
                if (var9_9) continue;
                ++var2_2;
            }
            var7_7 = this.width;
            if (var2_2 >= var7_7) lbl-1000:
            // 4 sources

            {
                while (true) {
                    var5_5 = 1;
                    break block0;
                    break;
                }
            }
            var7_7 = 1;
            var8_8 = 1.4E-45f;
            while ((var7_7 != 0 || var12_12 == 0) && var4_4 < (var7_7 = this.height)) {
                var7_7 = (int)this.containsBlackPoint(var1_1, var2_2, var4_4, (boolean)var6_6);
                if (var7_7 != 0) {
                    ++var4_4;
                    var12_12 = 1;
                    var13_13 = 1.4E-45f;
                    var21_21 = 1;
                    var22_22 = 1.4E-45f;
                    continue;
                }
                if (var12_12 != 0) continue;
                ++var4_4;
            }
            var7_7 = this.height;
            if (var4_4 >= var7_7) ** GOTO lbl-1000
            var7_7 = 1;
            var8_8 = 1.4E-45f;
            while ((var7_7 != 0 || var15_15 == 0) && var1_1 >= 0) {
                var7_7 = (int)this.containsBlackPoint(var3_3, var4_4, var1_1, false);
                if (var7_7 != 0) {
                    var1_1 += -1;
                    var15_15 = 1;
                    var16_16 = 1.4E-45f;
                    var21_21 = 1;
                    var22_22 = 1.4E-45f;
                    continue;
                }
                if (var15_15 != 0) continue;
                var1_1 += -1;
            }
            if (var1_1 < 0) ** GOTO lbl-1000
            var7_7 = var21_21;
            var8_8 = var22_22;
            var21_21 = 1;
            var22_22 = 1.4E-45f;
            while ((var21_21 != 0 || var19_19 == 0) && var3_3 >= 0) {
                var21_21 = (int)this.containsBlackPoint(var1_1, var2_2, var3_3, (boolean)var6_6);
                if (var21_21 != 0) {
                    var3_3 += -1;
                    var7_7 = 1;
                    var8_8 = 1.4E-45f;
                    var19_19 = 1;
                    var20_20 = 1.4E-45f;
                    continue;
                }
                if (var19_19 != 0) continue;
                var3_3 += -1;
            }
            if (var3_3 >= 0) ** break;
            ** continue;
            if (var7_7 == 0) continue;
            var17_17 = 1;
            var18_18 = 1.4E-45f;
        }
        if (var5_5 == 0 && var17_17 != 0) {
            var5_5 = var2_2 - var1_1;
            var7_7 = 0;
            var8_8 = 0.0f;
            var23_23 = null;
            var9_9 = false;
            var11_11 = null;
            var10_10 = 0.0f;
            var13_13 = 1.4E-45f;
            for (var12_12 = 1; var11_11 == null && var12_12 < var5_5; ++var12_12) {
                var10_10 = var1_1;
                var15_15 = var4_4 - var12_12;
                var16_16 = var15_15;
                var17_17 = var1_1 + var12_12;
                var18_18 = var17_17;
                var20_20 = var4_4;
                var11_11 = this.getBlackPointOnSegment(var10_10, var16_16, var18_18, var20_20);
            }
            if (var11_11 != null) {
                var12_12 = 0;
                var14_14 = null;
                var13_13 = 0.0f;
                var16_16 = 1.4E-45f;
                for (var15_15 = 1; var14_14 == null && var15_15 < var5_5; ++var15_15) {
                    var13_13 = var1_1;
                    var17_17 = var3_3 + var15_15;
                    var18_18 = var17_17;
                    var19_19 = var1_1 + var15_15;
                    var20_20 = var19_19;
                    var22_22 = var3_3;
                    var14_14 = this.getBlackPointOnSegment(var13_13, var18_18, var20_20, var22_22);
                }
                if (var14_14 != null) {
                    var1_1 = 0;
                    var24_24 = null;
                    var25_25 = 0.0f;
                    var16_16 = 1.4E-45f;
                    for (var15_15 = 1; var24_24 == null && var15_15 < var5_5; ++var15_15) {
                        var25_25 = var2_2;
                        var17_17 = var3_3 + var15_15;
                        var18_18 = var17_17;
                        var19_19 = var2_2 - var15_15;
                        var20_20 = var19_19;
                        var22_22 = var3_3;
                        var24_24 = this.getBlackPointOnSegment(var25_25, var18_18, var20_20, var22_22);
                    }
                    if (var24_24 != null) {
                        while (var23_23 == null && var6_6 < var5_5) {
                            var26_26 = var2_2;
                            var7_7 = var4_4 - var6_6;
                            var8_8 = var7_7;
                            var15_15 = var2_2 - var6_6;
                            var16_16 = var15_15;
                            var18_18 = var4_4;
                            var23_23 = this.getBlackPointOnSegment(var26_26, var8_8, var16_16, var18_18);
                            ++var6_6;
                        }
                        if (var23_23 != null) {
                            return this.centerEdges(var23_23, var11_11, var24_24, var14_14);
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                throw NotFoundException.getNotFoundInstance();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

