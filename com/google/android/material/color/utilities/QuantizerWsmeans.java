/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.PointProviderLab;
import com.google.android.material.color.utilities.QuantizerWsmeans$Distance;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0;

    private QuantizerWsmeans() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Map quantize(int[] var0, int[] var1_1, int var2_2) {
        block27: {
            var3_3 = var0 /* !! */ ;
            var4_4 /* !! */  = var1_1;
            var5_5 = 1;
            var7_7 = 272008L;
            var6_6 = new Random(var7_7);
            var9_8 = new LinkedHashMap<Integer, Object>();
            var10_9 = var0 /* !! */ .length;
            var11_10 = new double[var10_9][];
            var12_11 = var0 /* !! */ .length;
            var13_12 /* !! */  = new int[var12_11];
            var14_13 = new PointProviderLab();
            var16_15 /* !! */  = null;
            var17_16 = 0;
            var18_17 = null;
            for (var15_14 = 0; var15_14 < (var19_18 = ((int[])var3_3).length); var15_14 += var5_5) {
                var19_18 = var3_3[var15_14];
                var20_19 /* !! */  = var19_18;
                if ((var20_19 /* !! */  = (Integer)var9_8.get(var20_19 /* !! */ )) == null) {
                    var20_19 /* !! */  = (QuantizerWsmeans$Distance[])var14_13.fromInt(var19_18);
                    var11_10[var17_16] = (double[])var20_19 /* !! */ ;
                    var13_12 /* !! */ [var17_16] = var19_18;
                    var17_16 += var5_5;
                    var21_20 = var19_18;
                    var20_19 /* !! */  = var5_5;
                    var9_8.put((Integer)var21_20, var20_19 /* !! */ );
                    continue;
                }
                var21_20 = var19_18;
                var22_21 /* !! */  = var20_19 /* !! */ .intValue() + var5_5;
                var20_19 /* !! */  = var22_21 /* !! */ ;
                var9_8.put((Integer)var21_20, var20_19 /* !! */ );
            }
            var3_3 = new int[var17_16];
            var16_15 /* !! */  = null;
            for (var15_14 = 0; var15_14 < var17_16; var15_14 += var5_5) {
                var21_20 = var13_12 /* !! */ [var15_14];
                var21_20 = (Integer)var9_8.get(var21_20);
                var3_3[var15_14] = var19_18 = var21_20.intValue();
            }
            var15_14 = var2_2;
            var23_22 = Math.min(var2_2, var17_16);
            var12_11 = var4_4 /* !! */ .length;
            if (var12_11 != 0) {
                var12_11 = var4_4 /* !! */ .length;
                var23_22 = Math.min(var23_22, var12_11);
            }
            var13_12 /* !! */  = (int[])new double[var23_22][];
            var16_15 /* !! */  = null;
            var19_18 = 0;
            var21_20 = null;
            for (var15_14 = 0; var15_14 < (var22_21 /* !! */  = var4_4 /* !! */ .length); var15_14 += var5_5) {
                var22_21 /* !! */  = var4_4 /* !! */ [var15_14];
                var20_19 /* !! */  = (QuantizerWsmeans$Distance[])var14_13.fromInt(var22_21 /* !! */ );
                var13_12 /* !! */ [var15_14] = (int)var20_19 /* !! */ ;
                var19_18 += var5_5;
            }
            var24_23 /* !! */  = var23_22 - var19_18;
            if (var24_23 /* !! */  > 0) {
                var16_15 /* !! */  = null;
                for (var15_14 = 0; var15_14 < var24_23 /* !! */ ; var15_14 += var5_5) {
                }
            }
            var4_4 /* !! */  = new int[var17_16];
            var16_15 /* !! */  = null;
            for (var15_14 = 0; var15_14 < var17_16; var15_14 += var5_5) {
                var4_4 /* !! */ [var15_14] = var19_18 = var6_6.nextInt(var23_22);
            }
            var6_6 = new int[var23_22][];
            var16_15 /* !! */  = null;
            for (var15_14 = 0; var15_14 < var23_22; var15_14 += var5_5) {
                var6_6[var15_14] = var21_20 = (Object)new int[var23_22];
            }
            var16_15 /* !! */  = new QuantizerWsmeans$Distance[var23_22][];
            var21_20 = null;
            for (var19_18 = 0; var19_18 < var23_22; var19_18 += var5_5) {
                var20_19 /* !! */  = new QuantizerWsmeans$Distance[var23_22];
                var16_15 /* !! */ [var19_18] = var20_19 /* !! */ ;
                var20_19 /* !! */  = null;
                for (var22_21 /* !! */  = 0; var22_21 /* !! */  < var23_22; var22_21 /* !! */  += var5_5) {
                    var25_24 /* !! */  = var16_15 /* !! */ [var19_18];
                    var25_24 /* !! */ [var22_21 /* !! */ ] = var26_25 = new QuantizerWsmeans$Distance();
                }
            }
            var21_20 = new int[var23_22];
            var22_21 /* !! */  = 0;
            var20_19 /* !! */  = null;
            while (var22_21 /* !! */  < (var27_26 = 10)) {
                var27_26 = 0;
                var25_24 /* !! */  = null;
                while (var27_26 < var23_22) {
                    for (var29_28 = var28_27 = var27_26 + 1; var29_28 < var23_22; var29_28 += var5_5) {
                        var30_29 = (double[])var13_12 /* !! */ [var27_26];
                        var31_30 /* !! */  = (double[])var13_12 /* !! */ [var29_28];
                        var0 /* !! */  = (int[])var21_20;
                        var32_31 = var22_21 /* !! */ ;
                        var33_32 = var14_13.distance(var30_29, var31_30 /* !! */ );
                        var31_30 /* !! */  = (double[])var16_15 /* !! */ [var29_28][var27_26];
                        var31_30 /* !! */ .distance = var33_32;
                        var31_30 /* !! */ .index = var27_26;
                        var31_30 /* !! */  = (double[])var16_15 /* !! */ [var27_26][var29_28];
                        var31_30 /* !! */ .distance = var33_32;
                        var31_30 /* !! */ .index = var29_28;
                        var5_5 = 1;
                    }
                    var0 /* !! */  = (int[])var21_20;
                    var32_31 = var22_21 /* !! */ ;
                    Arrays.sort(var16_15 /* !! */ [var27_26]);
                    var30_29 = null;
                    for (var35_33 = 0; var35_33 < var23_22; var35_33 += var5_5) {
                        var21_20 = var6_6[var27_26];
                        var20_19 /* !! */  = var16_15 /* !! */ [var27_26][var35_33];
                        var22_21 /* !! */  = var20_19 /* !! */ .index;
                        var21_20[var35_33] = var22_21 /* !! */ ;
                    }
                    var21_20 = var0 /* !! */ ;
                    var22_21 /* !! */  = var32_31;
                    var27_26 = var28_27;
                }
                var0 /* !! */  = (int[])var21_20;
                var32_31 = var22_21 /* !! */ ;
                var31_30 /* !! */  = null;
                var35_33 = 0;
                var30_29 = null;
                for (var5_5 = 0; var5_5 < var17_16; var5_5 += var15_14) {
                    var21_20 = var11_10[var5_5];
                    var22_21 /* !! */  = var4_4 /* !! */ [var5_5];
                    var25_24 /* !! */  = (QuantizerWsmeans$Distance[])var13_12 /* !! */ [var22_21 /* !! */ ];
                    var36_34 = var14_13.distance((double[])var21_20, (double[])var25_24 /* !! */ );
                    var38_35 = var6_6;
                    var39_36 = var36_34;
                    var41_37 = -1;
                    var42_38 = null;
                    for (var29_28 = 0; var29_28 < var23_22; var29_28 += var15_14) {
                        var43_39 /* !! */  = var16_15 /* !! */ [var22_21 /* !! */ ];
                        var44_40 = var16_15 /* !! */ ;
                        var16_15 /* !! */  = var43_39 /* !! */ [var29_28];
                        var45_41 = var17_16;
                        var46_42 = var16_15 /* !! */ .distance;
                        var48_43 = 4.0 * var36_34;
                        cfr_temp_0 = var46_42 - var48_43;
                        var50_44 /* !! */  = (double)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                        if (var50_44 /* !! */  < 0 && (var51_45 = (cfr_temp_1 = (var46_42 = var14_13.distance((double[])var21_20, (double[])(var16_15 /* !! */  = (QuantizerWsmeans$Distance[][])var13_12 /* !! */ [var29_28]))) - var39_36) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1)) < 0) {
                            var39_36 = var46_42;
                            var41_37 = var29_28;
                        }
                        var15_14 = 1;
                        var17_16 = var45_41;
                        var16_15 /* !! */  = var44_40;
                    }
                    var44_40 = var16_15 /* !! */ ;
                    var45_41 = var17_16;
                    var15_14 = 1;
                    var17_16 = -1;
                    if (var41_37 != var17_16) {
                        var52_46 = Math.sqrt(var39_36);
                        var54_47 = Math.sqrt(var36_34);
                        cfr_temp_2 = (var52_46 = Math.abs(var52_46 - var54_47)) - (var54_47 = 3.0);
                        var28_27 = (int)(cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
                        if (var28_27 > 0) {
                            var35_33 += var15_14;
                            var4_4 /* !! */ [var5_5] = var41_37;
                        }
                    }
                    var6_6 = var38_35;
                    var17_16 = var45_41;
                    var16_15 /* !! */  = var44_40;
                }
                var38_35 = var6_6;
                var44_40 = var16_15 /* !! */ ;
                var45_41 = var17_16;
                if (var35_33 == 0 && var32_31 != 0) {
                    var28_27 = 0;
                    var26_25 = null;
                    var18_17 = var0 /* !! */ ;
                    break block27;
                }
                var31_30 /* !! */  = new double[var23_22];
                var6_6 = new double[var23_22];
                var30_29 = new double[var23_22];
                var18_17 = var0 /* !! */ ;
                var15_14 = 0;
                var16_15 /* !! */  = null;
                Arrays.fill(var0 /* !! */ , 0);
                var19_18 = 0;
                var21_20 = null;
                while (true) {
                    var27_26 = var45_41;
                    if (var19_18 >= var45_41) break;
                    var28_27 = var4_4 /* !! */ [var19_18];
                    var42_38 = var11_10[var19_18];
                    var22_21 /* !! */  = (int)var3_3[var19_18];
                    var18_17[var28_27] = var56_48 = var18_17[var28_27] + var22_21 /* !! */ ;
                    var39_36 = var31_30 /* !! */ [var28_27];
                    var48_43 = var42_38[0];
                    var16_15 /* !! */  = var3_3;
                    var43_39 /* !! */  = (QuantizerWsmeans$Distance[])var4_4 /* !! */ ;
                    var57_49 = var22_21 /* !! */ ;
                    var31_30 /* !! */ [var28_27] = var48_43 = var48_43 * var57_49 + var39_36;
                    var39_36 = (double)var6_6[var28_27];
                    var22_21 /* !! */  = 1;
                    var48_43 = var42_38[var22_21 /* !! */ ] * var57_49 + var39_36;
                    var6_6[var28_27] = var48_43;
                    var39_36 = var30_29[var28_27];
                    var59_50 = 2;
                    var30_29[var28_27] = var48_43 = var42_38[var59_50] * var57_49 + var39_36;
                    var19_18 += var22_21 /* !! */ ;
                    var15_14 = 0;
                    var16_15 /* !! */  = null;
                }
                var16_15 /* !! */  = var3_3;
                var43_39 /* !! */  = (QuantizerWsmeans$Distance[])var4_4 /* !! */ ;
                var3_3 = null;
                for (var60_51 = 0; var60_51 < var23_22; var60_51 += var19_18) {
                    var24_23 /* !! */  = (int)var18_17[var60_51];
                    if (var24_23 /* !! */  == 0) {
                        var24_23 /* !! */  = 3;
                        v0 /* !! */  = var4_4 /* !! */  = (int[])new double[var24_23 /* !! */ ];
                        var4_4 /* !! */ [0] = (int)0.0;
                        v0 /* !! */ [1] = (int)0.0;
                        v0 /* !! */ [2] = (int)0.0;
                        var13_12 /* !! */ [var60_51] = (int)var4_4 /* !! */ ;
                        var19_18 = 1;
                        var22_21 /* !! */  = 2;
                        var28_27 = 0;
                        var26_25 = null;
                        continue;
                    }
                    var33_32 = var31_30 /* !! */ [var60_51];
                    var61_52 = var24_23 /* !! */ ;
                    var33_32 /= var61_52;
                    var39_36 = (double)(var6_6[var60_51] / var61_52);
                    var48_43 = var30_29[var60_51] / var61_52;
                    var4_4 /* !! */  = (int[])var13_12 /* !! */ [var60_51];
                    var28_27 = 0;
                    var26_25 = null;
                    var4_4 /* !! */ [0] = (int)var33_32;
                    var19_18 = 1;
                    var4_4 /* !! */ [var19_18] = (int)var39_36;
                    var22_21 /* !! */  = 2;
                    var4_4 /* !! */ [var22_21 /* !! */ ] = (int)var48_43;
                }
                var19_18 = 1;
                var28_27 = 0;
                var26_25 = null;
                var22_21 /* !! */  = var32_31 + 1;
                var3_3 = var16_15 /* !! */ ;
                var21_20 = var18_17;
                var17_16 = var27_26;
                var6_6 = var38_35;
                var4_4 /* !! */  = (int[])var43_39 /* !! */ ;
                var16_15 /* !! */  = var44_40;
                var5_5 = 1;
            }
            var18_17 = var21_20;
            var28_27 = 0;
            var26_25 = null;
        }
        var3_3 = new LinkedHashMap;
        var3_3();
        var30_29 = null;
        for (var35_33 = 0; var35_33 < var23_22; var35_33 += var24_23 /* !! */ ) {
            var24_23 /* !! */  = (int)var18_17[var35_33];
            if (var24_23 /* !! */  == 0) lbl-1000:
            // 3 sources

            {
                while (true) {
                    continue;
                    break;
                }
            }
            var31_30 /* !! */  = (double[])var13_12 /* !! */ [var35_33];
            var5_5 = var14_13.toInt(var31_30 /* !! */ );
            var6_6 = var5_5;
            var41_37 = var3_3.containsKey(var6_6);
            if (var41_37 != 0) ** GOTO lbl-1000
            var31_30 /* !! */  = (double[])var5_5;
            var4_4 /* !! */  = (int[])var24_23 /* !! */ ;
            var3_3.put(var31_30 /* !! */ , var4_4 /* !! */ );
            ** continue;
            var24_23 /* !! */  = 1;
        }
        return var3_3;
    }
}

