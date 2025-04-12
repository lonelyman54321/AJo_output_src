/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.zip.Inflater;

public final class AB2 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ArrayList a(Xm2 var0) {
        block22: {
            var1_1 = var0 /* !! */ ;
            var2_3 = var0 /* !! */ .w();
            var3_4 = 0;
            var4_5 = null;
            if (var2_3 != 0) {
                return null;
            }
            var2_3 = 7;
            var0 /* !! */ .J(var2_3);
            var5_6 = var0 /* !! */ .i();
            var6_7 = 1684433976;
            var7_8 = 1;
            if (var5_6 == var6_7) {
                var8_9 = new Xm2();
                var9_10 = new Inflater((boolean)var7_8);
                try {
                    var10_11 = gz3.C((Xm2)var0 /* !! */ , var8_9, (Inflater)var9_10);
                    if (!var10_11) {
                        var9_10.end();
                        return null;
                    }
                    var9_10.end();
                    var1_1 = var8_9;
                }
                catch (Throwable var1_2) {
                    var11_12 = var1_2;
                    var9_10.end();
                    throw var1_2;
                }
            } else {
                var6_7 = 1918990112;
                if (var5_6 != var6_7) {
                    return null;
                }
            }
            var8_9 = new ArrayList();
            var6_7 = var1_1.b;
            var12_14 = var1_1.c;
            while (var6_7 < var12_14) {
                block26: {
                    block24: {
                        block25: {
                            block23: {
                                block21: {
                                    var13_15 = var1_1.i() + var6_7;
                                    if (var13_15 <= var6_7 || var13_15 > var12_14) break block23;
                                    var6_7 = var1_1.i();
                                    if (var6_7 != (var14_16 = 1835365224)) break block24;
                                    var6_7 = var1_1.i();
                                    if (var6_7 > (var14_16 = 10000)) {
                                        while (true) {
                                            var2_3 = 0;
                                            var11_13 = null;
                                            var0 /* !! */  = var8_9;
                                            var15_17 = var12_14;
lbl45:
                                            // 2 sources

                                            while (true) {
                                                var16_18 = 1;
                                                var17_19 = 1.4E-45f;
                                                break block21;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var18_20 /* !! */  = new float[var6_7];
                                    for (var19_21 = 0; var19_21 < var6_7; ++var19_21) {
                                        var20_22 = var1_1.i();
                                        var18_20 /* !! */ [var19_21] = var21_23 = Float.intBitsToFloat(var20_22);
                                    }
                                    var19_21 = var1_1.i();
                                    var20_22 = 32000;
                                    var21_23 = 4.4842E-41f;
                                    if (var19_21 > var20_22) ** continue;
                                    var22_24 = 2.0;
                                    var24_25 = Math.log(var22_24);
                                    var0 /* !! */  = var8_9;
                                    var26_26 = Math.ceil(Math.log((double)var6_7 * var22_24) / var24_25);
                                    var3_4 = (int)var26_26;
                                    var28_27 /* !! */  = var1_1.a;
                                    var29_28 = var28_27 /* !! */ .length;
                                    var8_9 = new Vm2(var28_27 /* !! */ , var29_28);
                                    var30_29 = var1_1.b * 8;
                                    var8_9.m(var30_29);
                                    var30_29 = var19_21 * 5;
                                    var28_27 /* !! */  = (byte[])new float[var30_29];
                                    var20_22 = 5;
                                    var21_23 = 7.0E-45f;
                                    var31_30 = new int[var20_22];
                                    var32_31 = 0;
                                    for (var29_28 = 0; var29_28 < var19_21; ++var29_28) {
                                        var11_13 = null;
                                        for (var2_3 = 0; var2_3 < var20_22; ++var2_3) {
                                            var15_17 = var31_30[var2_3];
                                            var16_18 = var8_9.g(var3_4);
                                            var33_32 = var16_18 >> 1;
                                            var20_22 = -(var16_18 & 1);
                                            if ((var20_22 = (var33_32 ^ var20_22) + var15_17) < var6_7 && var20_22 >= 0) {
                                                var15_17 = var32_31 + 1;
                                                var17_19 = var18_20 /* !! */ [var20_22];
                                                var28_27 /* !! */ [var32_31] = (byte)var17_19;
                                                var31_30[var2_3] = var20_22;
                                                var32_31 = var15_17;
                                                var20_22 = 5;
                                                var21_23 = 7.0E-45f;
                                                continue;
                                            }
                                            while (true) {
                                                var15_17 = var12_14;
                                                var2_3 = 0;
                                                var11_13 = null;
                                                ** continue;
                                                break;
                                            }
lbl95:
                                            // 1 sources

                                            ** GOTO lbl45
                                        }
                                        var2_3 = 7;
                                        var20_22 = 5;
                                        var21_23 = 7.0E-45f;
                                    }
                                    var2_3 = var8_9.e();
                                    var3_4 = 7;
                                    var2_3 = var2_3 + var3_4 & -8;
                                    var8_9.m(var2_3);
                                    var2_3 = 32;
                                    var6_7 = var8_9.g(var2_3);
                                    var18_20 /* !! */  = (float[])new zB2$b[var6_7];
                                    var21_23 = 0.0f;
                                    for (var20_22 = 0; var20_22 < var6_7; ++var20_22) {
                                        var34_33 = 8;
                                        var29_28 = var8_9.g(var34_33);
                                        var3_4 = var8_9.g(var34_33);
                                        if ((var34_33 = var8_9.g(var2_3)) > (var2_3 = 128000)) ** continue;
                                        var15_17 = var12_14;
                                        var35_34 = var19_21;
                                        var37_35 = 2.0;
                                        var35_34 = Math.ceil(Math.log(var35_34 * var37_35) / var24_25);
                                        var7_8 = (int)var35_34;
                                        var12_14 = var34_33 * 3;
                                        var39_36 = new float[var12_14];
                                        var40_37 = new float[var34_33 * 2];
                                        var11_13 = null;
                                        var41_38 = 0;
                                        for (var2_3 = 0; var2_3 < var34_33; ++var2_3) {
                                            var42_39 = var8_9.g(var7_8);
                                            var43_40 = var42_39 >> 1;
                                            var16_18 = 1;
                                            var17_19 = 1.4E-45f;
                                            var5_6 = var42_39 & 1;
                                            var33_32 = var6_7;
                                            var9_10 = var40_37;
                                            var5_6 = -var5_6;
                                            if ((var5_6 = (var43_40 ^ var5_6) + var41_38) >= 0 && var5_6 < var19_21) {
                                                var41_38 = var2_3 * 3;
                                                var42_39 = var5_6 * 5;
                                                var44_41 = var28_27 /* !! */ [var42_39];
                                                var39_36[var41_38] = var44_41;
                                                var43_40 = var41_38 + 1;
                                                var45_42 = var42_39 + 1;
                                                var46_43 = var28_27 /* !! */ [var45_42];
                                                var39_36[var43_40] = var46_43;
                                                var43_40 = var42_39 + 2;
                                                var44_41 = var28_27 /* !! */ [var43_40];
                                                var39_36[var41_38 += 2] = var44_41;
                                                var41_38 = var2_3 * 2;
                                                var43_40 = var42_39 + 3;
                                                var44_41 = var28_27 /* !! */ [var43_40];
                                                var40_37[var41_38] = var44_41;
                                                var16_18 = 1;
                                                var17_19 = 1.4E-45f;
                                                var47_44 = var28_27 /* !! */ [var42_39 += 4];
                                                var40_37[++var41_38] = var47_44;
                                                var41_38 = var5_6;
                                                continue;
                                            }
                                            var16_18 = 1;
                                            var17_19 = 1.4E-45f;
                                            var2_3 = 0;
                                            var11_13 = null;
                                            break block21;
                                        }
                                        var16_18 = 1;
                                        var17_19 = 1.4E-45f;
                                        var33_32 = var6_7;
                                        var9_10 = var40_37;
                                        var11_13 = new zB2$b(var29_28, var3_4, var39_36, var40_37);
                                        var18_20 /* !! */ [var20_22] = (float)var11_13;
                                        var12_14 = var15_17;
                                        var2_3 = 32;
                                        var3_4 = 7;
                                        var7_8 = 1;
                                    }
                                    var15_17 = var12_14;
                                    var16_18 = 1;
                                    var17_19 = 1.4E-45f;
                                    var11_13 = new zB2$a((zB2$b[])var18_20 /* !! */ );
                                }
                                if (var11_13 != null) break block25;
                            }
                            var3_4 = 0;
                            var4_5 = null;
                            break block22;
                        }
                        var4_5 = var0 /* !! */ ;
                        var0 /* !! */ .add((zB2$a)var11_13);
                        break block26;
                    }
                    var4_5 = var8_9;
                    var15_17 = var12_14;
                    var16_18 = 1;
                    var17_19 = 1.4E-45f;
                }
                var1_1.I(var13_15);
                var8_9 = var4_5;
                var6_7 = var13_15;
                var12_14 = var15_17;
                var2_3 = 7;
                var3_4 = 0;
                var4_5 = null;
                var7_8 = 1;
            }
            var4_5 = var8_9;
        }
        return var4_5;
    }
}

