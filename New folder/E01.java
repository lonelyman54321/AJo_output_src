/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

public final class E01
implements qA3 {
    public int a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object a(gm1_0 var1_1, float var2_2) {
        var3_3 = this;
        var4_4 = new ArrayList();
        var5_5 = var1_1.z();
        var6_6 /* !! */  = Gm1$b.BEGIN_ARRAY;
        var7_7 = 1;
        var8_8 = 1.4E-45f;
        var9_9 = 0;
        var10_10 = 0.0f;
        if (var5_5 == var6_6 /* !! */ ) {
            var11_11 = 1;
        } else {
            var11_11 = 0;
            var5_5 = null;
        }
        if (var11_11 != 0) {
            var1_1.a();
        }
        while ((var12_12 = var1_1.k()) != 0) {
            var13_13 = var1_1.p();
            var15_14 = (float)var13_13;
            var6_6 /* !! */  = Float.valueOf(var15_14);
            var4_4.add(var6_6 /* !! */ );
        }
        var12_12 = var4_4.size();
        var16_15 = 2;
        var17_16 = 4;
        var18_17 = 5.6E-45f;
        var19_18 = 3;
        if (var12_12 == var17_16 && (var12_12 = (int)((cfr_temp_0 = (var15_14 = (var6_6 /* !! */  = (Float)var4_4.get(0)).floatValue()) - (var20_19 = 1.0f)) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) == 0) {
            var12_12 = 0;
            var15_14 = 0.0f;
            var6_6 /* !! */  = Float.valueOf(0.0f);
            var4_4.set(0, var6_6 /* !! */ );
            var6_6 /* !! */  = Float.valueOf(var20_19);
            var4_4.add(var6_6 /* !! */ );
            var6_6 /* !! */  = (Float)var4_4.get(var7_7);
            var4_4.add(var6_6 /* !! */ );
            var6_6 /* !! */  = (Float)var4_4.get(var16_15);
            var4_4.add(var6_6 /* !! */ );
            var6_6 /* !! */  = (Float)var4_4.get(var19_18);
            var4_4.add(var6_6 /* !! */ );
            var3_3.a = var16_15;
        }
        if (var11_11 != 0) {
            var1_1.c();
        }
        var11_11 = var3_3.a;
        var12_12 = -1;
        var15_14 = 0.0f / 0.0f;
        if (var11_11 == var12_12) {
            var3_3.a = var11_11 = var4_4.size() / var17_16;
        }
        var11_11 = var3_3.a;
        var6_6 /* !! */  = (Gm1$b)new float[var11_11];
        var21_20 /* !! */  = new int[var11_11];
        var23_22 = null;
        var24_23 = 0;
        var25_24 = 0.0f;
        var26_25 = null;
        var27_26 = 0;
        var28_27 = 0.0f;
        for (var22_21 = 0; var22_21 < (var29_28 = var3_3.a * 4); ++var22_21) {
            block51: {
                block50: {
                    var29_28 = var22_21 / 4;
                    var30_29 = (Float)var4_4.get(var22_21);
                    var31_30 = var30_29.floatValue();
                    var32_31 = var31_30;
                    var17_16 = var22_21 % 4;
                    if (var17_16 == 0) break block50;
                    var34_32 = 255.0;
                    if (var17_16 != var7_7) {
                        if (var17_16 != var16_15) {
                            if (var17_16 == var19_18) {
                                var17_16 = (int)(var32_31 *= var34_32);
                                var36_33 = 255;
                                var31_30 = 3.57E-43f;
                                var21_20 /* !! */ [var29_28] = var17_16 = Color.argb((int)var36_33, (int)var24_23, (int)var27_26, (int)var17_16);
                            }
                        } else {
                            var27_26 = (int)(var32_31 *= var34_32);
                        }
                    } else {
                        var24_23 = (int)(var32_31 *= var34_32);
                    }
                    break block51;
                }
                if (var29_28 <= 0) ** GOTO lbl-1000
                var17_16 = var29_28 + -1;
                var18_17 = (float)var6_6 /* !! */ [var17_16];
                var8_8 = (float)var32_31;
                cfr_temp_1 = var18_17 - var8_8;
                if ((var17_16 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) >= 0) {
                    var17_16 = 1008981770;
                    var18_17 = 0.01f;
                    var6_6 /* !! */ [var29_28] = (Gm1$b)(var8_8 += var18_17);
                } else lbl-1000:
                // 2 sources

                {
                    var8_8 = (float)var32_31;
                    var6_6 /* !! */ [var29_28] = (Gm1$b)var8_8;
                }
            }
            var7_7 = 1;
            var8_8 = 1.4E-45f;
            var17_16 = 4;
            var18_17 = 5.6E-45f;
        }
        var37_34 = new B01(var21_20 /* !! */ , (float[])var6_6 /* !! */ );
        var17_16 = var4_4.size();
        if (var17_16 > var29_28) {
            var17_16 = (var4_4.size() - var29_28) / var16_15;
            var38_35 = new float[var17_16];
            var21_20 /* !! */  = (int[])new float[var17_16];
            var22_21 = 0;
            var23_22 = null;
            while (var29_28 < (var24_23 = var4_4.size())) {
                var24_23 = var29_28 % 2;
                if (var24_23 == 0) {
                    var26_25 = (Float)var4_4.get(var29_28);
                    var38_35[var22_21] = var25_24 = var26_25.floatValue();
                } else {
                    var26_25 = (Float)var4_4.get(var29_28);
                    var25_24 = var26_25.floatValue();
                    var21_20 /* !! */ [var22_21] = (int)var25_24;
                    ++var22_21;
                }
                ++var29_28;
            }
            var4_4 = var37_34.a;
            var22_21 = ((Object)var4_4).length;
            if (var22_21 == 0) {
                var4_4 = var38_35;
            } else if (var17_16 != 0) {
                var22_21 = ((Object)var4_4).length + var17_16;
                var26_25 = new float[var22_21];
                var28_27 = 0.0f;
                var29_28 = 0;
                var39_36 = 0.0f;
                var36_33 = 0;
                var31_30 = 0.0f;
                var30_29 = null;
                var40_37 = 0;
                var41_38 /* !! */  = 0.0f;
                var42_39 = null;
                for (var27_26 = 0; var27_26 < var22_21; ++var27_26) {
                    var9_9 = ((Object)var4_4).length;
                    var43_40 = 0.0f / 0.0f;
                    if (var36_33 < var9_9) {
                        var10_10 = (float)var4_4[var36_33];
                    } else {
                        var9_9 = 2143289344;
                        var10_10 = 0.0f / 0.0f;
                    }
                    if (var40_37 < var17_16) {
                        var43_40 = var38_35[var40_37];
                    }
                    if ((var44_41 = Float.isNaN(var43_40)) == 0 && (var44_41 = var10_10 == var43_40 ? 0 : (var10_10 < var43_40 ? -1 : 1)) >= 0) {
                        var44_41 = (int)Float.isNaN(var10_10);
                        if (var44_41 == 0 && (var44_41 = (int)(var43_40 == var10_10 ? 0 : (var43_40 < var10_10 ? -1 : 1))) >= 0) {
                            var26_25[var27_26] = var10_10;
                            ++var36_33;
                            ++var40_37;
                            ++var29_28;
                        } else {
                            var26_25[var27_26] = var43_40;
                            ++var40_37;
                        }
                    } else {
                        var26_25[var27_26] = var10_10;
                        ++var36_33;
                    }
                    var9_9 = 0;
                    var10_10 = 0.0f;
                }
                var4_4 = var29_28 == 0 ? var26_25 : (Object)Arrays.copyOf((float[])var26_25, var22_21 -= var29_28);
            }
            var9_9 = ((Object)var4_4).length;
            var23_22 = new int[var9_9];
            var25_24 = 0.0f;
            var26_25 = null;
            for (var24_23 = 0; var24_23 < var9_9; ++var24_23) {
                var28_27 = (float)var4_4[var24_23];
                var29_28 = Arrays.binarySearch((float[])var6_6 /* !! */ , var28_27);
                var36_33 = Arrays.binarySearch(var38_35, var28_27);
                var42_39 = "Unreachable code.";
                var43_40 = 255.0f;
                var45_42 = var37_34.b;
                if (var29_28 >= 0 && var36_33 <= 0) {
                    block48: {
                        var16_15 = var45_42[var29_28];
                        var29_28 = 2;
                        var39_36 = 2.8E-45f;
                        if (var17_16 >= var29_28) {
                            var39_36 = 0.0f;
                            var31_30 = var38_35[0];
                            cfr_temp_2 = var28_27 - var31_30;
                            var29_28 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                            if (var29_28 <= 0) {
                            } else {
                                var39_36 = 1.4E-45f;
                                for (var29_28 = 1; var29_28 < var17_16; ++var29_28) {
                                    var31_30 = var38_35[var29_28];
                                    cfr_temp_3 = var31_30 - var28_27;
                                    var48_45 /* !! */  = (float)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                                    if (var48_45 /* !! */  < 0 && var29_28 != (var46_43 = var17_16 + -1)) {
                                        var3_3 = this;
                                        continue;
                                    }
                                    if (var48_45 /* !! */  <= 0) {
                                        var47_44 = var21_20 /* !! */ [var29_28];
lbl198:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var46_43 = var29_28 + -1;
                                    var41_38 /* !! */  = var38_35[var46_43];
                                    var28_27 = (var28_27 - var41_38 /* !! */ ) / (var31_30 -= var41_38 /* !! */ );
                                    var47_44 = var21_20 /* !! */ [var46_43];
                                    var39_36 = var21_20 /* !! */ [var29_28];
                                    var47_44 = (int)mp1_0.f(var47_44, var39_36, var28_27);
                                    ** continue;
                                    var46_43 = var47_44 *= var43_40;
                                    var27_26 = Color.red((int)var16_15);
                                    var29_28 = Color.green((int)var16_15);
                                    var16_15 = Color.blue((int)var16_15);
                                    var46_43 = Color.argb((int)var46_43, (int)var27_26, (int)var29_28, (int)var16_15);
                                    break block48;
                                }
                                var3_3 = new IllegalArgumentException(var42_39);
                                throw var3_3;
                            }
                        }
                        var46_43 = 0;
                        var47_44 = (int)0.0f;
                        var3_3 = null;
                        var28_27 = var21_20 /* !! */ [0] * var43_40;
                        var46_43 = (int)var28_27;
                        var27_26 = Color.red((int)var16_15);
                        var29_28 = Color.green((int)var16_15);
                        var16_15 = Color.blue((int)var16_15);
                        var46_43 = Color.argb((int)var46_43, (int)var27_26, (int)var29_28, (int)var16_15);
                    }
                    var23_22[var24_23] = var46_43;
                    var46_43 = 0;
                    var47_44 = (int)0.0f;
                    var3_3 = null;
                } else {
                    block49: {
                        if (var36_33 < 0) {
                            var36_33 = -(var36_33 + 1);
                        }
                        var47_44 = var21_20 /* !! */ [var36_33];
                        var29_28 = var45_42.length;
                        var36_33 = 2;
                        var31_30 = 2.8E-45f;
                        if (var29_28 >= var36_33) {
                            var39_36 = 0.0f;
                            var49_46 = var6_6 /* !! */ [0];
                            cfr_temp_4 = var28_27 - var49_46;
                            var29_28 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                            if (var29_28 == 0) {
                            } else {
                                var39_36 = 1.4E-45f;
                                for (var29_28 = 1; var29_28 < var11_11; ++var29_28) {
                                    var49_46 = var6_6 /* !! */ [var29_28];
                                    cfr_temp_5 = var49_46 - var28_27;
                                    var48_45 /* !! */  = (float)(cfr_temp_5 == 0 ? 0 : (cfr_temp_5 < 0 ? -1 : 1));
                                    if (var48_45 /* !! */  < 0 && var29_28 != (var36_33 = var11_11 + -1)) {
                                        var36_33 = 2;
                                        var31_30 = 2.8E-45f;
                                        continue;
                                    }
                                    var36_33 = var11_11 + -1;
                                    if (var29_28 == var36_33 && (var36_33 = (int)(var28_27 == var49_46 ? 0 : (var28_27 > var49_46 ? 1 : -1))) >= 0) {
                                        var46_43 = var47_44 *= var43_40;
                                        var27_26 = Color.red((int)var45_42[var29_28]);
                                        var36_33 = Color.green((int)var45_42[var29_28]);
                                        var16_15 = Color.blue((int)var45_42[var29_28]);
                                        var46_43 = Color.argb((int)var46_43, (int)var27_26, (int)var36_33, (int)var16_15);
lbl259:
                                        // 2 sources

                                        while (true) {
                                            var16_15 = var46_43;
                                            var46_43 = 0;
                                            var47_44 = (int)0.0f;
                                            var3_3 = null;
                                            break block49;
                                            break;
                                        }
                                    }
                                    var36_33 = var29_28 + -1;
                                    var41_38 /* !! */  = (float)var6_6 /* !! */ [var36_33];
                                    var28_27 = (var28_27 - var41_38 /* !! */ ) / (var49_46 -= var41_38 /* !! */ );
                                    var29_28 = var45_42[var29_28];
                                    var16_15 = var45_42[var36_33];
                                    var16_15 = hh3_1.c(var28_27, var16_15, var29_28);
                                    var46_43 = var47_44 *= var43_40;
                                    var27_26 = Color.red((int)var16_15);
                                    var29_28 = Color.green((int)var16_15);
                                    var16_15 = Color.blue((int)var16_15);
                                    var46_43 = Color.argb((int)var46_43, (int)var27_26, (int)var29_28, (int)var16_15);
                                    ** continue;
                                }
                                var3_3 = new IllegalArgumentException(var42_39);
                                throw var3_3;
                            }
                        }
                        var46_43 = 0;
                        var47_44 = (int)0.0f;
                        var3_3 = null;
                        var16_15 = var45_42[0];
                    }
                    var23_22[var24_23] = var16_15;
                }
                var3_3 = this;
                var16_15 = 2;
            }
            var37_34 = new B01(var23_22, (float[])var4_4);
        }
        return var37_34;
    }
}

