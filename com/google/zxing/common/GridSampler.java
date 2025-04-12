/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DefaultGridSampler;
import com.google.zxing.common.PerspectiveTransform;

public abstract class GridSampler {
    private static GridSampler gridSampler;

    static {
        DefaultGridSampler defaultGridSampler = new DefaultGridSampler();
        gridSampler = defaultGridSampler;
    }

    /*
     * Unable to fully structure code
     */
    public static void checkAndNudgePoints(BitMatrix var0, float[] var1_1) {
        block17: {
            var2_2 = var0.getWidth();
            var3_3 = var0.getHeight();
            var4_4 = 0;
            var5_5 = 1;
            var6_6 = 1.4E-45f;
            while (true) {
                var7_7 = var1_1.length;
                var8_8 = -1;
                if (var4_4 >= var7_7 || var5_5 == 0) break block17;
                var6_6 = var1_1[var4_4];
                var5_5 = (int)var6_6;
                var7_7 = var4_4 + 1;
                var9_9 = var1_1[var7_7];
                var10_10 = (int)var9_9;
                if (var5_5 < var8_8 || var5_5 > var2_2 || var10_10 < var8_8 || var10_10 > var3_3) break;
                if (var5_5 == var8_8) {
                    var1_1[var4_4] = 0.0f;
lbl18:
                    // 2 sources

                    while (true) {
                        var5_5 = 1;
                        var6_6 = 1.4E-45f;
                        break;
                    }
                } else {
                    if (var5_5 == var2_2) {
                        var5_5 = var2_2 + -1;
                        var1_1[var4_4] = var6_6 = (float)var5_5;
                        ** continue;
                    }
                    var5_5 = 0;
                    var6_6 = 0.0f;
                }
                if (var10_10 == var8_8) {
                    var1_1[var7_7] = 0.0f;
lbl30:
                    // 2 sources

                    while (true) {
                        var5_5 = 1;
                        var6_6 = 1.4E-45f;
                        break;
                    }
                } else if (var10_10 == var3_3) {
                    var5_5 = var3_3 + -1;
                    var1_1[var7_7] = var6_6 = (float)var5_5;
                    ** continue;
                }
                var4_4 += 2;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        var5_5 = 1;
        var6_6 = 1.4E-45f;
        block3: for (var4_4 = var1_1.length + -2; var4_4 >= 0 && var5_5 != 0; var4_4 += -2) {
            var6_6 = var1_1[var4_4];
            var5_5 = (int)var6_6;
            var7_7 = var4_4 + 1;
            var9_9 = var1_1[var7_7];
            var10_10 = (int)var9_9;
            if (var5_5 >= var8_8 && var5_5 <= var2_2 && var10_10 >= var8_8 && var10_10 <= var3_3) {
                if (var5_5 == var8_8) {
                    var1_1[var4_4] = 0.0f;
lbl53:
                    // 2 sources

                    while (true) {
                        var5_5 = 1;
                        var6_6 = 1.4E-45f;
                        break;
                    }
                } else {
                    if (var5_5 == var2_2) {
                        var5_5 = var2_2 + -1;
                        var1_1[var4_4] = var6_6 = (float)var5_5;
                        ** continue;
                    }
                    var5_5 = 0;
                    var6_6 = 0.0f;
                }
                if (var10_10 == var8_8) {
                    var1_1[var7_7] = 0.0f;
lbl65:
                    // 2 sources

                    while (true) {
                        var5_5 = 1;
                        var6_6 = 1.4E-45f;
                        continue block3;
                        break;
                    }
                }
                if (var10_10 != var3_3) continue;
                var5_5 = var3_3 + -1;
                var1_1[var7_7] = var6_6 = (float)var5_5;
                ** continue;
            }
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public static GridSampler getInstance() {
        return gridSampler;
    }

    public static void setGridSampler(GridSampler gridSampler) {
        GridSampler.gridSampler = gridSampler;
    }

    public abstract BitMatrix sampleGrid(BitMatrix var1, int var2, int var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19);

    public abstract BitMatrix sampleGrid(BitMatrix var1, int var2, int var3, PerspectiveTransform var4);
}

