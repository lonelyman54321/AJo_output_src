/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.text.Layout
 */
import android.graphics.RectF;
import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

public final class Rl3 {
    public static final float a(float[] fArray, int n3, int n4) {
        n3 = (n3 - n4) * 2 + 1;
        return fArray[n3];
    }

    /*
     * Unable to fully structure code
     */
    public static final int b(Ql3 var0, Layout var1_1, cp1_0 var2_2, int var3_3, RectF var4_4, xx2_0 var5_5, gi$b var6_6, boolean var7_7) {
        block58: {
            block59: {
                var8_8 = var0;
                var9_9 = var1_1;
                var10_10 = var2_2;
                var11_11 = var3_3;
                var12_12 = var4_4;
                var13_13 = var5_5;
                var14_14 = var6_6;
                var15_15 = 1;
                var16_16 = 1.4E-45f;
                var17_17 = var1_1.getLineTop(var3_3);
                var18_18 = var1_1.getLineBottom(var3_3);
                var19_19 = var1_1.getLineStart(var3_3);
                var20_20 = var1_1.getLineEnd(var3_3);
                var21_21 = -1;
                var22_22 = 0.0f / 0.0f;
                if (var19_19 == var20_20) {
                    return var21_21;
                }
                var20_20 = (var20_20 - var19_19) * 2;
                var23_23 = new float[var20_20];
                var24_24 = var0.f;
                var25_25 = var24_24.getLineStart(var3_3);
                var21_21 = var0.f(var3_3);
                var26_26 = var21_21 - var25_25;
                var27_27 = var26_26 * 2;
                if (var20_20 < var27_27) break block58;
                var9_9 = new q91(var0);
                var28_28 = var24_24.getParagraphDirection(var3_3);
                if (var28_28 == var15_15) {
                    var28_28 = 1;
                    var29_29 = 1.4E-45f;
                } else {
                    var28_28 = 0;
                    var29_29 = 0.0f;
                    var8_8 = null;
                }
                var27_27 = 0;
                var30_30 = null;
                while (var25_25 < var21_21) {
                    var26_26 = (int)var24_24.isRtlCharAt(var25_25);
                    if (var28_28 != 0 && var26_26 == 0) {
                        var31_31 = var21_21;
                        var32_32 = null;
                        var33_33 = var9_9.a(var25_25, false, false, (boolean)var15_15);
                        var21_21 = var25_25 + 1;
                        var22_22 = var9_9.a(var21_21, (boolean)var15_15, (boolean)var15_15, (boolean)var15_15);
                        var34_34 = var28_28;
                        var35_35 = var29_29;
                    } else {
                        var31_31 = var21_21;
                        if (var28_28 != 0 && var26_26 != 0) {
                            var21_21 = 0;
                            var32_32 = null;
                            var33_33 = var9_9.a(var25_25, false, false, false);
                            var34_34 = var28_28;
                            var35_35 = var29_29;
                            var28_28 = var25_25 + 1;
                            var29_29 = var9_9.a(var28_28, (boolean)var15_15, (boolean)var15_15, false);
                            var22_22 = var33_33;
                            var33_33 = var29_29;
                        } else {
                            var34_34 = var28_28;
                            var35_35 = var29_29;
                            var21_21 = 0;
                            var22_22 = 0.0f;
                            var32_32 = null;
                            if (var26_26 != 0) {
                                var29_29 = var9_9.a(var25_25, false, false, (boolean)var15_15);
                                var21_21 = var25_25 + 1;
                                var33_33 = var9_9.a(var21_21, (boolean)var15_15, (boolean)var15_15, (boolean)var15_15);
                                var22_22 = var29_29;
                            } else {
                                var28_28 = 0;
                                var29_29 = 0.0f;
                                var8_8 = null;
                                var33_33 = var9_9.a(var25_25, false, false, false);
                                var21_21 = var25_25 + 1;
                                var22_22 = var9_9.a(var21_21, (boolean)var15_15, (boolean)var15_15, false);
                            }
                        }
                    }
                    var23_23[var27_27] = var33_33;
                    var28_28 = var27_27 + 1;
                    var23_23[var28_28] = var22_22;
                    var27_27 += 2;
                    var25_25 += var15_15;
                    var28_28 = var34_34;
                    var29_29 = var35_35;
                    var21_21 = var31_31;
                }
                var8_8 = var10_10.a;
                var20_20 = var8_8.getLineStart(var11_11);
                var11_11 = var8_8.getLineEnd(var11_11);
                var30_30 = null;
                var21_21 = var10_10.d(var20_20, false);
                var27_27 = var10_10.e(var21_21);
                var36_36 = var20_20 - var27_27;
                var27_27 = var11_11 - var27_27;
                if ((var10_10 = var10_10.a(var21_21)) != null && (var10_10 = var10_10.createLineBidi(var36_36, var27_27)) != null) {
                    var28_28 = var10_10.getRunCount();
                    var37_37 = new Cp1$a[var28_28];
                    var30_30 = null;
                    for (var27_27 = 0; var27_27 < var28_28; var27_27 += var15_15) {
                        var36_36 = var10_10.getRunStart(var27_27) + var20_20;
                        var25_25 = var10_10.getRunLimit(var27_27) + var20_20;
                        var26_26 = var10_10.getRunLevel(var27_27);
                        var34_34 = var28_28;
                        var28_28 = var26_26 % 2;
                        if (var28_28 == var15_15) {
                            var28_28 = 1;
                            var29_29 = 1.4E-45f;
                        } else {
                            var28_28 = 0;
                            var29_29 = 0.0f;
                            var8_8 = null;
                        }
                        var37_37[var27_27] = var32_32 = new Cp1$a(var36_36, var25_25, (boolean)var28_28);
                        var28_28 = var34_34;
                    }
                    var28_28 = 0;
                    var29_29 = 0.0f;
                    var8_8 = null;
                } else {
                    var28_28 = var8_8.isRtlCharAt(var20_20);
                    var10_10 = new Cp1$a(var20_20, var11_11, (boolean)var28_28);
                    var37_37 = new Cp1$a[var15_15];
                    var28_28 = 0;
                    var29_29 = 0.0f;
                    var8_8 = null;
                    var37_37[0] = var10_10;
                }
                var9_9 = "<this>";
                if (var7_7) {
                    Intrinsics.checkNotNullParameter(var37_37, (String)var9_9);
                    Intrinsics.checkNotNullParameter(var37_37, (String)var9_9);
                    var20_20 = ((Cp1$a[])var37_37).length - var15_15;
                    var10_10 = new c(0, var20_20, var15_15);
                } else {
                    Intrinsics.checkNotNullParameter(var37_37, (String)var9_9);
                    var28_28 = ((Cp1$a[])var37_37).length - var15_15;
                    var9_9 = c.d;
                    var9_9.getClass();
                    var20_20 = -1;
                    var27_27 = 0;
                    var30_30 = null;
                    var10_10 = new c(var28_28, 0, var20_20);
                }
                var28_28 = var10_10.a;
                var20_20 = var10_10.b;
                var38_38 = var10_10.c;
                if ((var38_38 <= 0 || var28_28 > var20_20) && (var38_38 >= 0 || var20_20 > var28_28)) break block59;
                while (true) {
                    block63: {
                        block65: {
                            block64: {
                                block60: {
                                    block57: {
                                        block61: {
                                            block62: {
                                                var30_30 = var37_37[var28_28];
                                                var21_21 = (int)var30_30.c;
                                                var36_36 = var30_30.a;
                                                var25_25 = var30_30.b;
                                                if (var21_21 != 0) {
                                                    var26_26 = (var25_25 + -1 - var19_19) * 2;
                                                    var33_33 = var23_23[var26_26];
                                                } else {
                                                    var26_26 = (var36_36 - var19_19) * 2;
                                                    var33_33 = var23_23[var26_26];
                                                }
                                                if (var21_21 != 0) {
                                                    var22_22 = Rl3.a(var23_23, var36_36, var19_19);
                                                } else {
                                                    var21_21 = var25_25 + -1;
                                                    var22_22 = Rl3.a(var23_23, var21_21, var19_19);
                                                }
                                                var27_27 = (int)var30_30.c;
                                                if (!var7_7) break block60;
                                                var16_16 = var12_12.left;
                                                cfr_temp_0 = var22_22 - var16_16;
                                                var31_31 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                if (var31_31 < 0) break block61;
                                                var39_39 = var37_37;
                                                var40_40 = var12_12.right;
                                                cfr_temp_1 = var33_33 - var40_40;
                                                var41_41 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                if (var41_41 > 0) break block62;
                                                if (var27_27 == 0 && (var15_15 = (int)(var16_16 == var33_33 ? 0 : (var16_16 < var33_33 ? -1 : 1))) <= 0 || var27_27 != 0 && (var11_11 = (int)(var40_40 == var22_22 ? 0 : (var40_40 > var22_22 ? 1 : -1))) >= 0) {
                                                    var41_41 = var38_38;
                                                    var11_11 = var36_36;
                                                } else {
                                                    block56: {
                                                        var15_15 = var36_36;
                                                        var11_11 = var25_25;
                                                        block3: while (true) {
                                                            var21_21 = var11_11 - var15_15;
                                                            var41_41 = var38_38;
                                                            var38_38 = 1;
                                                            var42_42 = 1.4E-45f;
                                                            if (var21_21 <= var38_38) break block56;
                                                            var38_38 = (var11_11 + var15_15) / 2;
                                                            var21_21 = (var38_38 - var19_19) * 2;
                                                            var22_22 = var23_23[var21_21];
                                                            var43_43 = var38_38;
                                                            if ((var27_27 != 0 || (var38_38 = (int)((cfr_temp_2 = var22_22 - (var42_42 = var12_12.left)) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) <= 0) && (var27_27 == 0 || (var38_38 = (int)((cfr_temp_3 = var22_22 - (var42_42 = var12_12.right)) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1))) >= 0)) break;
                                                            var11_11 = var43_43;
lbl190:
                                                            // 2 sources

                                                            while (true) {
                                                                var38_38 = var41_41;
                                                                continue block3;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        var15_15 = var43_43;
                                                        ** continue;
                                                    }
                                                    if (var27_27 == 0) {
                                                        var11_11 = var15_15;
                                                    }
                                                }
                                                var38_38 = var13_13.l(var11_11);
                                                var11_11 = -1;
                                                var40_40 = 0.0f / 0.0f;
                                                if (var38_38 == var11_11) lbl-1000:
                                                // 5 sources

                                                {
                                                    while (true) {
                                                        var36_36 = -1;
                                                        break block57;
                                                        break;
                                                    }
                                                }
                                                var11_11 = var13_13.j(var38_38);
                                                if (var11_11 >= var25_25) ** GOTO lbl-1000
                                                if (var11_11 >= var36_36) {
                                                    var36_36 = var11_11;
                                                }
                                                if (var38_38 > var25_25) {
                                                    var38_38 = var25_25;
                                                }
                                                var16_16 = var17_17;
                                                var22_22 = var18_18;
                                                var43_43 = var38_38;
                                                var42_42 = 0.0f;
                                                var10_10 = null;
                                                var37_37 = new RectF(0.0f, var16_16, 0.0f, var22_22);
                                                while (true) {
                                                    if (var27_27 != 0) {
                                                        var15_15 = 1;
                                                        var21_21 = (var38_38 + -1 - var19_19) * 2;
                                                        var16_16 = var23_23[var21_21];
                                                    } else {
                                                        var15_15 = (var36_36 - var19_19) * 2;
                                                        var16_16 = var23_23[var15_15];
                                                    }
                                                    var37_37.left = var16_16;
                                                    if (var27_27 != 0) {
                                                        var42_42 = Rl3.a(var23_23, var36_36, var19_19);
                                                    } else {
                                                        var15_15 = 1;
                                                        var16_16 = 1.4E-45f;
                                                        var42_42 = Rl3.a(var23_23, var38_38 -= var15_15, var19_19);
                                                    }
                                                    var37_37.right = var42_42;
                                                    var10_10 = (Boolean)var14_14.invoke(var37_37, var12_12);
                                                    var38_38 = (int)var10_10.booleanValue();
                                                    if (var38_38 != 0) break block57;
                                                    var36_36 = var13_13.h(var36_36);
                                                    var38_38 = -1;
                                                    var42_42 = 0.0f / 0.0f;
                                                    if (var36_36 == var38_38 || var36_36 >= var25_25) ** GOTO lbl-1000
                                                    var38_38 = var13_13.l(var36_36);
                                                    if (var38_38 <= var25_25) continue;
                                                    var38_38 = var25_25;
                                                }
                                            }
                                            var41_41 = var38_38;
                                            ** GOTO lbl-1000
                                        }
                                        var41_41 = var38_38;
                                        var39_39 = var37_37;
                                        ** continue;
                                    }
                                    var38_38 = 1;
                                    var42_42 = 1.4E-45f;
                                    break block63;
                                }
                                var41_41 = var38_38;
                                var39_39 = var37_37;
                                var42_42 = var12_12.left;
                                cfr_temp_4 = var22_22 - var42_42;
                                var11_11 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                                if (var11_11 < 0 || (var15_15 = (int)((cfr_temp_5 = var33_33 - (var40_40 = var12_12.right)) == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1))) > 0) ** GOTO lbl-1000
                                if (var27_27 == 0 && (var11_11 = (int)(var40_40 == var22_22 ? 0 : (var40_40 > var22_22 ? 1 : -1))) >= 0) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                if (var27_27 != 0 && (var38_38 = (int)(var42_42 == var33_33 ? 0 : (var42_42 < var33_33 ? -1 : 1))) <= 0) {
                                    ** continue;
                                }
                                break block64;
                                var38_38 = 1;
                                var42_42 = 1.4E-45f;
                                var11_11 = var25_25 + -1;
                                break block65;
                            }
                            var38_38 = 1;
                            var42_42 = 1.4E-45f;
                            var15_15 = var36_36;
                            var11_11 = var25_25;
                            block8: while ((var21_21 = var11_11 - var15_15) > var38_38) {
                                var38_38 = (var11_11 + var15_15) / 2;
                                var21_21 = (var38_38 - var19_19) * 2;
                                var22_22 = var23_23[var21_21];
                                var43_43 = var38_38;
                                if (var27_27 == 0 && (var38_38 = (int)((cfr_temp_6 = var22_22 - (var42_42 = var12_12.right)) == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1))) > 0 || var27_27 != 0 && (var38_38 = (int)((cfr_temp_7 = var22_22 - (var42_42 = var12_12.left)) == 0.0f ? 0 : (cfr_temp_7 < 0.0f ? -1 : 1))) < 0) {
                                    var11_11 = var43_43;
lbl284:
                                    // 2 sources

                                    while (true) {
                                        var38_38 = 1;
                                        var42_42 = 1.4E-45f;
                                        continue block8;
                                        break;
                                    }
                                }
                                var15_15 = var43_43;
                                ** continue;
                            }
                            if (var27_27 == 0) {
                                var11_11 = var15_15;
                            }
                            var38_38 = 1;
                            var42_42 = 1.4E-45f;
                        }
                        var11_11 += var38_38;
                        var38_38 = var13_13.j(var11_11);
                        var11_11 = -1;
                        var40_40 = 0.0f / 0.0f;
                        if (var38_38 == var11_11) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                var38_38 = 1;
                                var42_42 = 1.4E-45f;
                                while (true) {
                                    var25_25 = -1;
                                    ** GOTO lbl348
                                    break;
                                }
                                break;
                            }
                        } else {
                            if ((var11_11 = var13_13.l(var38_38)) <= var36_36) ** continue;
                            if (var38_38 < var36_36) {
                                var38_38 = var36_36;
                            }
                            if (var11_11 <= var25_25) {
                                var25_25 = var11_11;
                            }
                            var16_16 = var17_17;
                            var22_22 = var18_18;
                            var43_43 = var38_38;
                            var42_42 = 0.0f;
                            var10_10 = null;
                            var37_37 = new RectF(0.0f, var16_16, 0.0f, var22_22);
                            while (true) {
                                if (var27_27 != 0) {
                                    var15_15 = 1;
                                    var21_21 = (var25_25 + -1 - var19_19) * 2;
                                    var16_16 = var23_23[var21_21];
                                } else {
                                    var15_15 = (var38_38 - var19_19) * 2;
                                    var16_16 = var23_23[var15_15];
                                }
                                var37_37.left = var16_16;
                                if (var27_27 != 0) {
                                    var16_16 = Rl3.a(var23_23, var38_38, var19_19);
                                    var38_38 = 1;
                                    var42_42 = 1.4E-45f;
                                } else {
                                    var38_38 = 1;
                                    var42_42 = 1.4E-45f;
                                    var15_15 = var25_25 + -1;
                                    var16_16 = Rl3.a(var23_23, var15_15, var19_19);
                                }
                                var37_37.right = var16_16;
                                var44_44 = (Boolean)var14_14.invoke(var37_37, var12_12);
                                var15_15 = (int)var44_44.booleanValue();
                                if (var15_15 != 0) break;
                                var25_25 = var13_13.G(var25_25);
                                var15_15 = -1;
                                var16_16 = 0.0f / 0.0f;
                                if (var25_25 == var15_15 || var25_25 <= var36_36) ** continue;
                                var15_15 = var13_13.j(var25_25);
                                if (var15_15 < var36_36) {
                                    var15_15 = var36_36;
                                }
                                var38_38 = var15_15;
                            }
                        }
lbl348:
                        // 2 sources

                        var36_36 = var25_25;
                    }
                    if (var36_36 >= 0) {
                        return var36_36;
                    }
                    if (var28_28 == var20_20) break;
                    var28_28 += var41_41;
                    var37_37 = var39_39;
                    var38_38 = var41_41;
                    var15_15 = 1;
                    var16_16 = 1.4E-45f;
                }
            }
            return -1;
        }
        var9_9 = "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2".toString();
        var8_8 = new IllegalArgumentException((String)var9_9);
        throw var8_8;
    }
}

