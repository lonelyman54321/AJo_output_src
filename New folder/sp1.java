/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class sp1 {
    public static final Gm1$a a = Gm1$a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final Gm1$a b = Gm1$a.a("d", "a");
    public static final Gm1$a c = Gm1$a.a("ty", "nm");

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static pp1 a(vm1_1 var0, QB1 var1_1) {
        var2_2 = var0;
        var3_3 = var1_1;
        var4_4 = 1;
        var5_5 = 1.4E-45f;
        var6_6 /* !! */  = pp1$b.NONE;
        var7_7 /* !! */  = Zo1.NORMAL;
        var8_8 = new ArrayList();
        var9_9 = new ArrayList();
        var0.b();
        var10_10 = 0;
        var11_11 /* !! */  = null;
        var12_12 = Float.valueOf(0.0f);
        var13_13 = Float.valueOf(1.0f);
        var14_14 = "UNSET";
        var15_15 = null;
        var16_16 = 0L;
        var18_17 = 0;
        var19_18 = 0.0f;
        var20_19 = null;
        var21_20 = -1;
        var23_21 = var6_6 /* !! */ ;
        var24_22 = var7_7 /* !! */ ;
        var25_23 = 0;
        var6_6 /* !! */  = null;
        var26_24 = 0;
        var27_25 = null;
        var28_26 /* !! */  = null;
        var29_27 = null;
        var30_28 = false;
        var31_29 = null;
        var32_30 = null;
        var33_31 = null;
        var34_32 = null;
        var35_33 = null;
        var36_34 = 0.0f;
        var7_7 /* !! */  = null;
        var37_35 = 0;
        var38_36 = 0;
        var39_37 = 0;
        var40_38 = 1.0f;
        var41_39 = 0.0f;
        var42_40 = 0.0f;
        var43_41 = 0.0f;
        var44_42 = 0;
        var45_43 = 0.0f;
        var46_44 = null;
        var47_45 = 0;
        var48_46 = 0.0f;
        block65: while (var49_47 = var0.k()) {
            var11_11 /* !! */  = sp1.a;
            var10_10 = var2_2.C(var11_11 /* !! */ );
            switch (var10_10) {
                default: {
                    var0.G();
                    var0.H();
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var51_49 = var27_25;
lbl58:
                    // 2 sources

                    while (true) {
                        var10_10 = 0;
                        var11_11 /* !! */  = null;
                        ** GOTO lbl690
                        break;
                    }
                }
                case 24: {
                    var10_10 = var0.u();
                    var52_50 /* !! */  = Zo1.values();
                    var53_51 = var52_50 /* !! */ .length;
                    if (var10_10 >= var53_51) {
                        var54_52 = "Unsupported Blend Mode: ";
                        var52_50 /* !! */  = new StringBuilder((String)var54_52);
                        var52_50 /* !! */ .append(var10_10);
                        var52_50 /* !! */  = var52_50 /* !! */ .toString();
                        var3_3.a((String)var52_50 /* !! */ );
                        var24_22 = Zo1.NORMAL;
lbl74:
                        // 10 sources

                        while (true) {
                            var10_10 = 0;
                            var11_11 /* !! */  = null;
                            continue block65;
                            break;
                        }
                    }
                    var52_50 /* !! */  = Zo1.values();
                    var24_22 = var52_50 /* !! */ [var10_10];
                    ** GOTO lbl74
                }
                case 23: {
                    var53_51 = var0.u();
                    if (var53_51 != var4_4) ** GOTO lbl87
                    var47_45 = 1;
                    var48_46 = 1.4E-45f;
                    ** GOTO lbl74
lbl87:
                    // 1 sources

                    var47_45 = 0;
                    var48_46 = 0.0f;
                    ** GOTO lbl74
                }
                case 22: {
                    var44_42 = var0.n();
                    ** GOTO lbl74
                }
                case 21: {
                    var6_6 /* !! */  = var0.w();
                    ** GOTO lbl74
                }
                case 20: {
                    var32_30 = gk_1.c((gm1_0)var2_2, var3_3, false);
                    ** GOTO lbl74
                }
                case 19: {
                    var11_11 /* !! */  = var6_6 /* !! */ ;
                    var55_53 = var0.p();
                    var45_43 = var57_54 = (float)var55_53;
lbl103:
                    // 2 sources

                    while (true) {
                        var6_6 /* !! */  = var11_11 /* !! */ ;
                        ** GOTO lbl74
                        break;
                    }
                }
                case 18: {
                    var11_11 /* !! */  = var6_6 /* !! */ ;
                    var55_53 = var0.p();
                    var36_34 = (float)var55_53;
                    ** continue;
                }
                case 17: {
                    var11_11 /* !! */  = var6_6 /* !! */ ;
                    var55_53 = var0.p();
                    var57_54 = wz3.c();
                    var58_55 = var57_54;
                    var43_41 = var60_56 = (float)(var55_53 *= var58_55);
lbl117:
                    // 2 sources

                    while (true) {
                        var6_6 /* !! */  = var11_11 /* !! */ ;
lbl119:
                        // 3 sources

                        while (true) {
                            var18_17 = 0;
                            var19_18 = 0.0f;
                            var20_19 = null;
                            ** GOTO lbl74
                            break;
                        }
                        break;
                    }
                }
                case 16: {
                    var11_11 /* !! */  = var6_6 /* !! */ ;
                    var58_55 = var0.p();
                    var57_54 = wz3.c();
                    var55_53 = var57_54;
                    var42_40 = var60_56 = (float)(var58_55 *= var55_53);
                    ** continue;
                }
                case 15: {
                    var11_11 /* !! */  = var6_6 /* !! */ ;
                    var58_55 = var0.p();
                    var41_39 = var60_56 = (float)var58_55;
                    ** GOTO lbl119
                }
                case 14: {
                    var11_11 /* !! */  = var6_6 /* !! */ ;
                    var58_55 = var0.p();
                    var40_38 = var60_56 = (float)var58_55;
                    ** continue;
                }
                case 13: {
                    var11_11 /* !! */  = var6_6 /* !! */ ;
                    var0.a();
                    var52_50 /* !! */  = new ArrayList();
                    while ((var18_17 = var0.k()) != 0) {
                        var0.b();
                        while ((var18_17 = (int)var0.k()) != 0) {
                            var20_19 = sp1.c;
                            var18_17 = var2_2.C((Gm1$a)var20_19);
                            if (var18_17 == 0) ** GOTO lbl159
                            if (var18_17 != var4_4) {
                                var0.G();
                                var0.H();
                            } else {
                                var20_19 = var0.w();
                                var52_50 /* !! */ .add(var20_19);
                            }
                            ** GOTO lbl310
lbl159:
                            // 1 sources

                            var18_17 = var0.u();
                            var61_57 = 29;
                            var57_54 = 4.1E-44f;
                            if (var18_17 == var61_57) {
                                var20_19 = qy_0.a;
                                var33_31 = null;
                                while ((var18_17 = (int)var0.k()) != 0) {
                                    var20_19 = qy_0.a;
                                    var18_17 = var2_2.C((Gm1$a)var20_19);
                                    if (var18_17 != 0) {
                                        var0.G();
                                        var0.H();
                                        continue;
                                    }
                                    var0.a();
                                    while ((var18_17 = (int)var0.k()) != 0) {
                                        var0.b();
                                        var61_57 = 0;
                                        var54_52 = null;
                                        var57_54 = 0.0f;
                                        block75: while (true) {
                                            var18_17 = 0;
                                            var19_18 = 0.0f;
                                            var20_19 = null;
                                            while ((var62_58 = (int)var0.k()) != 0) {
                                                var63_59 = qy_0.b;
                                                var62_58 = var2_2.C((Gm1$a)var63_59);
                                                if (var62_58 != 0) {
                                                    if (var62_58 != var4_4) {
                                                        var0.G();
                                                        var0.H();
                                                        continue;
                                                    }
                                                    if (var18_17 != 0) {
                                                        var63_59 = gk_1.c((gm1_0)var2_2, var3_3, (boolean)var4_4);
                                                        var54_52 = new py_0((oj_1)var63_59);
                                                        continue;
                                                    }
                                                    var0.H();
                                                    continue;
                                                }
                                                var18_17 = var0.u();
                                                if (var18_17 != 0) continue block75;
                                                var18_17 = 1;
                                                var19_18 = 1.4E-45f;
                                            }
                                            break;
                                        }
                                        var0.d();
                                        if (var54_52 == null) continue;
                                        var33_31 = var54_52;
                                    }
                                    var0.c();
                                }
                                continue;
                            }
                            var61_57 = 25;
                            var57_54 = 3.5E-44f;
                            if (var18_17 != var61_57) ** GOTO lbl310
                            var20_19 = new Object();
                            while ((var61_57 = (int)var0.k()) != 0) {
                                var54_52 = dw0_0.f;
                                var61_57 = var2_2.C((Gm1$a)var54_52);
                                if (var61_57 != 0) {
                                    var0.G();
                                    var0.H();
                                    continue;
                                }
                                var0.a();
                                while ((var61_57 = (int)var0.k()) != 0) {
                                    var0.b();
                                    var54_52 = "";
                                    block79: while ((var62_58 = (int)var0.k()) != 0) {
                                        var63_59 = dw0_0.g;
                                        var62_58 = var2_2.C((Gm1$a)var63_59);
                                        if (var62_58 == 0) ** GOTO lbl293
                                        if (var62_58 != var4_4) {
                                            var0.G();
                                            var0.H();
                                            continue;
                                        }
                                        var54_52.getClass();
                                        var62_58 = var54_52.hashCode();
                                        switch (var62_58) lbl-1000:
                                        // 6 sources

                                        {
                                            default: {
                                                var62_58 = -1;
                                                break;
                                            }
                                            case 1383710113: {
                                                var63_59 = "Softness";
                                                var62_58 = (int)var54_52.equals(var63_59);
                                                if (var62_58 == 0) ** GOTO lbl-1000
                                                var62_58 = 4;
                                                break;
                                            }
                                            case 1379387491: {
                                                var63_59 = "Shadow Color";
                                                var62_58 = (int)var54_52.equals(var63_59);
                                                if (var62_58 == 0) ** GOTO lbl-1000
                                                var62_58 = 3;
                                                break;
                                            }
                                            case 1041377119: {
                                                var63_59 = "Direction";
                                                var62_58 = (int)var54_52.equals(var63_59);
                                                if (var62_58 == 0) ** GOTO lbl-1000
                                                var62_58 = 2;
                                                break;
                                            }
                                            case 397447147: {
                                                var63_59 = "Opacity";
                                                var62_58 = (int)var54_52.equals(var63_59);
                                                if (var62_58 == 0) ** GOTO lbl-1000
                                                var62_58 = 1;
                                                break;
                                            }
                                            case 353103893: {
                                                var63_59 = "Distance";
                                                var62_58 = (int)var54_52.equals(var63_59);
                                                if (var62_58 == 0) ** GOTO lbl-1000
                                                var62_58 = 0;
                                                var63_59 = null;
                                            }
                                        }
                                        switch (var62_58) {
                                            default: {
                                                var0.H();
                                                continue block79;
                                            }
                                            case 4: {
                                                var20_19.e = var63_59 = gk_1.c((gm1_0)var2_2, var3_3, (boolean)var4_4);
                                                continue block79;
                                            }
                                            case 3: {
                                                var20_19.a = var63_59 = gk_1.b(var0, var1_1);
                                                continue block79;
                                            }
                                            case 2: {
                                                var62_58 = 0;
                                                var63_59 = null;
                                                var6_6 /* !! */  = gk_1.c((gm1_0)var2_2, var3_3, false);
                                                var20_19.c = var6_6 /* !! */ ;
                                                continue block79;
                                            }
                                            case 1: {
                                                var62_58 = 0;
                                                var63_59 = null;
                                                var6_6 /* !! */  = gk_1.c((gm1_0)var2_2, var3_3, false);
                                                var20_19.b = var6_6 /* !! */ ;
                                                continue block79;
                                            }
                                            case 0: 
                                        }
                                        var20_19.d = var63_59 = gk_1.c((gm1_0)var2_2, var3_3, (boolean)var4_4);
                                        continue;
lbl293:
                                        // 1 sources

                                        var54_52 = var0.w();
                                    }
                                    var0.d();
                                }
                                var0.c();
                            }
                            var54_52 = var20_19.a;
                            if (var54_52 != null && (var63_59 = var20_19.b) != null && (var6_6 /* !! */  = var20_19.c) != null && (var64_60 = var20_19.d) != null && (var20_19 = var20_19.e) != null) {
                                var50_48 /* !! */  = var34_32;
                                var51_49 = var54_52;
                                var65_61 = var63_59;
                                var66_62 /* !! */  = var6_6 /* !! */ ;
                                var67_63 = var64_60;
                                var68_64 = var20_19;
                                var34_32 = new cw0_1((nj_1)var54_52, (oj_1)var63_59, (oj_1)var6_6 /* !! */ , (oj_1)var64_60, (oj_1)var20_19);
                            } else {
                                var34_32 = null;
                            }
lbl310:
                            // 5 sources

                            var4_4 = 1;
                            var5_5 = 1.4E-45f;
                        }
                        var0.d();
                        var4_4 = 1;
                        var5_5 = 1.4E-45f;
                    }
                    var0.c();
                    var54_52 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ";
                    var20_19 = new StringBuilder((String)var54_52);
                    var20_19.append(var52_50 /* !! */ );
                    var52_50 /* !! */  = var20_19.toString();
                    var3_3.a((String)var52_50 /* !! */ );
                    var6_6 /* !! */  = var11_11 /* !! */ ;
lbl325:
                    // 11 sources

                    while (true) {
                        var18_17 = 0;
                        var19_18 = 0.0f;
                        var20_19 = null;
                        var4_4 = 1;
                        var5_5 = 1.4E-45f;
                        ** continue;
                        break;
                    }
                }
                case 12: {
                    var11_11 /* !! */  = var6_6 /* !! */ ;
                    var0.b();
                    block82: while ((var53_51 = (int)var0.k()) != 0) {
                        var52_50 /* !! */  = sp1.b;
                        var53_51 = var2_2.C((Gm1$a)var52_50 /* !! */ );
                        if (var53_51 == 0) ** GOTO lbl496
                        var18_17 = 1;
                        var19_18 = 1.4E-45f;
                        if (var53_51 != var18_17) {
                            var0.G();
                            var0.H();
                            continue;
                        }
                        var0.a();
                        var53_51 = (int)var0.k();
                        if (var53_51 == 0) ** GOTO lbl486
                        var52_50 /* !! */  = ak.a;
                        var0.b();
                        var18_17 = 0;
                        var20_19 = null;
                        var19_18 = 0.0f;
                        var61_57 = 0;
                        var54_52 = null;
                        var57_54 = 0.0f;
                        while ((var53_51 = (int)var0.k()) != 0) {
                            var52_50 /* !! */  = ak.a;
                            var53_51 = var2_2.C((Gm1$a)var52_50 /* !! */ );
                            if (var53_51 != 0) {
                                var4_4 = 1;
                                var5_5 = 1.4E-45f;
                                if (var53_51 != var4_4) {
                                    var0.G();
                                    var0.H();
                                    continue;
                                }
                                var0.b();
                                var51_49 = null;
                                var65_61 = null;
                                var66_62 /* !! */  = null;
                                var67_63 = null;
                                var68_64 = null;
                                while ((var53_51 = (int)var0.k()) != 0) {
                                    var52_50 /* !! */  = ak.c;
                                    var18_17 = var2_2.C((Gm1$a)var52_50 /* !! */ );
                                    if (var18_17 != 0) {
                                        var4_4 = 1;
                                        var5_5 = 1.4E-45f;
                                        if (var18_17 != var4_4) {
                                            var53_51 = 2;
                                            var60_56 = 2.8E-45f;
                                            if (var18_17 != var53_51) {
                                                var62_58 = 3;
                                                if (var18_17 != var62_58) {
                                                    var62_58 = 4;
                                                    if (var18_17 != var62_58) {
                                                        var0.G();
                                                        var0.H();
                                                        continue;
                                                    }
                                                    var68_64 = gk_1.e(var0, var1_1);
                                                    continue;
                                                }
                                                var62_58 = 4;
                                                var67_63 = gk_1.c((gm1_0)var2_2, var3_3, (boolean)var4_4);
                                                continue;
                                            }
                                            var62_58 = 4;
                                            var66_62 /* !! */  = gk_1.c((gm1_0)var2_2, var3_3, (boolean)var4_4);
                                            continue;
                                        }
                                        var62_58 = 4;
                                        var65_61 = gk_1.b(var0, var1_1);
                                        continue;
                                    }
                                    var62_58 = 4;
                                    var51_49 = gk_1.b(var0, var1_1);
                                }
                                var62_58 = 4;
                                var0.d();
                                var50_48 /* !! */  = var20_19;
                                var20_19 = new ck_0((nj_1)var51_49, (nj_1)var65_61, (oj_1)var66_62 /* !! */ , (oj_1)var67_63, (qj_0)var68_64);
                                continue;
                            }
                            var62_58 = 4;
                            var0.b();
                            var53_51 = 0;
                            var52_50 /* !! */  = null;
                            var60_56 = 0.0f;
                            var61_57 = 0;
                            var54_52 = null;
                            var57_54 = 0.0f;
                            var4_4 = 0;
                            var64_60 = null;
                            var5_5 = 0.0f;
                            var25_23 = 0;
                            var6_6 /* !! */  = null;
                            block85: while (var30_28 = var0.k()) {
                                var63_59 = ak.b;
                                var62_58 = var2_2.C((Gm1$a)var63_59);
                                if (var62_58 == 0) ** GOTO lbl461
                                var50_48 /* !! */  = var11_11 /* !! */ ;
                                var10_10 = 1;
                                if (var62_58 == var10_10) ** GOTO lbl459
                                var10_10 = 2;
                                if (var62_58 == var10_10) ** GOTO lbl457
                                var10_10 = 3;
                                if (var62_58 != var10_10) {
                                    var0.G();
                                    var0.H();
lbl434:
                                    // 6 sources

                                    while (true) {
                                        var11_11 /* !! */  = var50_48 /* !! */ ;
lbl436:
                                        // 2 sources

                                        while (true) {
                                            var62_58 = 4;
                                            continue block85;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                var53_51 = var0.u();
                                if (var53_51 == (var62_58 = 1)) ** GOTO lbl452
                                var62_58 = 2;
                                if (var53_51 == var62_58) ** GOTO lbl451
                                var11_11 /* !! */  = "Unsupported text range units: ";
                                var63_59 = new StringBuilder((String)var11_11 /* !! */ );
                                var63_59.append(var53_51);
                                var52_50 /* !! */  = var63_59.toString();
                                var3_3.a((String)var52_50 /* !! */ );
                                var52_50 /* !! */  = qm3.INDEX;
                                ** GOTO lbl434
lbl451:
                                // 1 sources

                                var62_58 = 1;
lbl452:
                                // 2 sources

                                if (var53_51 != var62_58) ** GOTO lbl455
                                var52_50 /* !! */  = qm3.PERCENT;
                                ** GOTO lbl434
lbl455:
                                // 1 sources

                                var52_50 /* !! */  = qm3.INDEX;
                                ** GOTO lbl434
lbl457:
                                // 1 sources

                                var6_6 /* !! */  = gk_1.e(var0, var1_1);
                                ** GOTO lbl434
lbl459:
                                // 1 sources

                                var64_60 = gk_1.e(var0, var1_1);
                                ** continue;
lbl461:
                                // 1 sources

                                var50_48 /* !! */  = var11_11 /* !! */ ;
                                var54_52 = gk_1.e(var0, var1_1);
                                ** continue;
                            }
                            var50_48 /* !! */  = var11_11 /* !! */ ;
                            var0.d();
                            if (var54_52 == null && var64_60 != null) {
                                var51_49 = var27_25;
                                var10_10 = 0;
                                var11_11 /* !! */  = null;
                                var27_25 = 0;
                                var63_59 = new Bo1(var27_25);
                                var63_59 = Collections.singletonList(var63_59);
                                var54_52 = new tv_0((List)var63_59);
                            } else {
                                var51_49 = var27_25;
                            }
                            var54_52 = var63_59 = new bk((qj_0)var54_52, (qj_0)var64_60, (qj_0)var6_6 /* !! */ , (qm3)var52_50 /* !! */ );
                            var11_11 /* !! */  = var50_48 /* !! */ ;
                            var27_25 = var51_49;
                        }
                        var50_48 /* !! */  = var11_11 /* !! */ ;
                        var51_49 = var27_25;
                        var0.d();
                        var52_50 /* !! */  = new Zj((ck_0)var20_19, (bk)var54_52);
                        var31_29 = var52_50 /* !! */ ;
                        ** GOTO lbl488
lbl486:
                        // 1 sources

                        var50_48 /* !! */  = var11_11 /* !! */ ;
                        var51_49 = var27_25;
lbl488:
                        // 3 sources

                        while ((var53_51 = (int)var0.k()) != 0) {
                            var0.H();
                        }
                        var0.c();
lbl492:
                        // 2 sources

                        while (true) {
                            var11_11 /* !! */  = var50_48 /* !! */ ;
                            var27_25 = var51_49;
                            continue block82;
                            break;
                        }
lbl496:
                        // 1 sources

                        var50_48 /* !! */  = var11_11 /* !! */ ;
                        var51_49 = var27_25;
                        var19_18 = wz3.c();
                        var54_52 = xr0_0.a;
                        var4_4 = 0;
                        var5_5 = 0.0f;
                        var64_60 = null;
                        var20_19 = Fo1.a((gm1_0)var2_2, var3_3, var19_18, (qA3)var54_52, false);
                        var52_50 /* !! */  = new tv_0((List)var20_19);
                        var29_27 = var52_50 /* !! */ ;
                        ** continue;
                    }
                    var50_48 /* !! */  = var11_11 /* !! */ ;
                    var51_49 = var27_25;
                    var0.d();
lbl510:
                    // 3 sources

                    while (true) {
                        var6_6 /* !! */  = var50_48 /* !! */ ;
                        ** GOTO lbl325
                        break;
                    }
                }
                case 11: {
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var51_49 = var27_25;
                    var0.a();
                    while ((var53_51 = (int)var0.k()) != 0) {
                        var52_50 /* !! */  = Z60.a(var0, var1_1);
                        if (var52_50 /* !! */  == null) continue;
                        var9_9.add(var52_50 /* !! */ );
                    }
                    var0.c();
                    ** continue;
                }
                case 10: {
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var51_49 = var27_25;
                    var0.a();
                    while ((var53_51 = (int)var0.k()) != 0) {
                        var0.b();
                        var53_51 = 0;
                        var52_50 /* !! */  = null;
                        var60_56 = 0.0f;
                        var18_17 = 0;
                        var20_19 = null;
                        var19_18 = 0.0f;
                        var61_57 = 0;
                        var54_52 = null;
                        var57_54 = 0.0f;
                        var62_58 = 0;
                        var63_59 = null;
                        block93: while ((var4_4 = (int)var0.k()) != 0) {
                            var64_60 = var0.Q();
                            var64_60.getClass();
                            var25_23 = var64_60.hashCode();
                            switch (var25_23) lbl-1000:
                            // 5 sources

                            {
                                default: {
                                    var25_23 = -1;
                                    break;
                                }
                                case 0x3339A3: {
                                    var6_6 /* !! */  = "mode";
                                    var25_23 = (int)var64_60.equals((Object)var6_6 /* !! */ );
                                    if (var25_23 == 0) ** GOTO lbl-1000
                                    var25_23 = 3;
                                    break;
                                }
                                case 104433: {
                                    var6_6 /* !! */  = "inv";
                                    var25_23 = (int)var64_60.equals((Object)var6_6 /* !! */ );
                                    if (var25_23 == 0) ** GOTO lbl-1000
                                    var25_23 = 2;
                                    break;
                                }
                                case 3588: {
                                    var6_6 /* !! */  = "pt";
                                    var25_23 = (int)var64_60.equals((Object)var6_6 /* !! */ );
                                    if (var25_23 == 0) ** GOTO lbl-1000
                                    var25_23 = 1;
                                    break;
                                }
                                case 111: {
                                    var6_6 /* !! */  = "o";
                                    var25_23 = (int)var64_60.equals((Object)var6_6 /* !! */ );
                                    if (var25_23 == 0) ** GOTO lbl-1000
                                    var25_23 = 0;
                                    var6_6 /* !! */  = null;
                                }
                            }
                            switch (var25_23) {
                                default: {
                                    var0.H();
lbl578:
                                    // 7 sources

                                    while (true) {
                                        var10_10 = 0;
                                        var11_11 /* !! */  = null;
                                        continue block93;
                                        break;
                                    }
                                }
                                case 3: {
                                    var52_50 /* !! */  = var0.w();
                                    var52_50 /* !! */ .getClass();
                                    var25_23 = var52_50 /* !! */ .hashCode();
                                    switch (var25_23) lbl-1000:
                                    // 5 sources

                                    {
                                        default: {
                                            var53_51 = -1;
                                            var60_56 = 0.0f / 0.0f;
                                            break;
                                        }
                                        case 115: {
                                            var6_6 /* !! */  = "s";
                                            var53_51 = (int)var52_50 /* !! */ .equals((Object)var6_6 /* !! */ );
                                            if (var53_51 == 0) ** GOTO lbl-1000
                                            var53_51 = 3;
                                            var60_56 = 4.2E-45f;
                                            break;
                                        }
                                        case 110: {
                                            var6_6 /* !! */  = "n";
                                            var53_51 = (int)var52_50 /* !! */ .equals((Object)var6_6 /* !! */ );
                                            if (var53_51 == 0) ** GOTO lbl-1000
                                            var53_51 = 2;
                                            var60_56 = 2.8E-45f;
                                            break;
                                        }
                                        case 105: {
                                            var6_6 /* !! */  = "i";
                                            var53_51 = (int)var52_50 /* !! */ .equals((Object)var6_6 /* !! */ );
                                            if (var53_51 == 0) ** GOTO lbl-1000
                                            var53_51 = 1;
                                            var60_56 = 1.4E-45f;
                                            break;
                                        }
                                        case 97: {
                                            var6_6 /* !! */  = "a";
                                            var53_51 = (int)var52_50 /* !! */ .equals((Object)var6_6 /* !! */ );
                                            if (var53_51 == 0) ** GOTO lbl-1000
                                            var53_51 = 0;
                                            var60_56 = 0.0f;
                                            var52_50 /* !! */  = null;
                                        }
                                    }
                                    switch (var53_51) {
                                        default: {
                                            var6_6 /* !! */  = "Unknown mask mode ";
                                            var52_50 /* !! */  = new StringBuilder((String)var6_6 /* !! */ );
                                            var52_50 /* !! */ .append((String)var64_60);
                                            var64_60 = ". Defaulting to Add.";
                                            var52_50 /* !! */ .append((String)var64_60);
                                            rx1.b(var52_50 /* !! */ .toString());
                                            var52_50 /* !! */  = kH1$a.MASK_MODE_ADD;
                                            ** GOTO lbl578
                                        }
                                        case 3: {
                                            var52_50 /* !! */  = kH1$a.MASK_MODE_SUBTRACT;
                                            ** GOTO lbl578
                                        }
                                        case 2: {
                                            var52_50 /* !! */  = kH1$a.MASK_MODE_NONE;
                                            ** GOTO lbl578
                                        }
                                        case 1: {
                                            var3_3.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            var52_50 /* !! */  = kH1$a.MASK_MODE_INTERSECT;
                                            ** GOTO lbl578
                                        }
                                        case 0: 
                                    }
                                    var52_50 /* !! */  = kH1$a.MASK_MODE_ADD;
                                    ** GOTO lbl578
                                }
                                case 2: {
                                    var62_58 = var4_4 = (int)var0.n();
                                    ** continue;
                                }
                                case 1: {
                                    var5_5 = wz3.c();
                                    var6_6 /* !! */  = m13.a;
                                    var10_10 = 0;
                                    var11_11 /* !! */  = null;
                                    var64_60 = Fo1.a((gm1_0)var2_2, var3_3, var5_5, (qA3)var6_6 /* !! */ , false);
                                    var20_19 = new tv_0((List)var64_60);
                                    continue block93;
                                }
                                case 0: 
                            }
                            var10_10 = 0;
                            var11_11 /* !! */  = null;
                            var54_52 = gk_1.e(var0, var1_1);
                        }
                        var10_10 = 0;
                        var11_11 /* !! */  = null;
                        var0.d();
                        var64_60 = new kh1_0((kH1$a)var52_50 /* !! */ , (wj_0)var20_19, (qj_0)var54_52, (boolean)var62_58);
                        var8_8.add(var64_60);
                    }
                    var10_10 = 0;
                    var11_11 /* !! */  = null;
                    var53_51 = var8_8.size();
                    var18_17 = var3_3.p + var53_51;
                    var3_3.p = var18_17;
                    var0.c();
                    ** GOTO lbl690
                }
                case 9: {
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var51_49 = var27_25;
                    var10_10 = 0;
                    var11_11 /* !! */  = null;
                    var53_51 = var0.u();
                    var20_19 = pp1$b.values();
                    var18_17 = ((pp1$b[])var20_19).length;
                    if (var53_51 < var18_17) ** GOTO lbl694
                    var54_52 = "Unsupported matte type: ";
                    var20_19 = new StringBuilder((String)var54_52);
                    var20_19.append(var53_51);
                    var52_50 /* !! */  = var20_19.toString();
                    var3_3.a((String)var52_50 /* !! */ );
lbl690:
                    // 4 sources

                    while (true) {
                        var6_6 /* !! */  = var50_48 /* !! */ ;
                        var27_25 = var51_49;
                        ** GOTO lbl325
                        break;
                    }
lbl694:
                    // 1 sources

                    var20_19 = pp1$b.values();
                    var23_21 = var20_19[var53_51];
                    var52_50 /* !! */  = (Zo1[])sp1$a.a;
                    var18_17 = var23_21.ordinal();
                    var53_51 = (int)var52_50 /* !! */ [var18_17];
                    var18_17 = 1;
                    var19_18 = 1.4E-45f;
                    if (var53_51 != var18_17) {
                        var61_57 = 2;
                        var57_54 = 2.8E-45f;
                        if (var53_51 == var61_57) {
                            var52_50 /* !! */  = "Unsupported matte type: Luma Inverted";
                            var3_3.a((String)var52_50 /* !! */ );
                        }
                    } else {
                        var61_57 = 2;
                        var57_54 = 2.8E-45f;
                        var52_50 /* !! */  = "Unsupported matte type: Luma";
                        var3_3.a((String)var52_50 /* !! */ );
                    }
                    var3_3.p = var53_51 = var3_3.p + var18_17;
                    ** continue;
                }
                case 8: {
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var51_49 = var27_25;
                    var18_17 = 1;
                    var19_18 = 1.4E-45f;
                    var61_57 = 2;
                    var57_54 = 2.8E-45f;
                    var10_10 = 0;
                    var11_11 /* !! */  = null;
                    var35_33 = ek_0.a(var0, var1_1);
                    ** GOTO lbl325
                }
                case 7: {
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var51_49 = var27_25;
                    var18_17 = 1;
                    var19_18 = 1.4E-45f;
                    var61_57 = 2;
                    var57_54 = 2.8E-45f;
                    var10_10 = 0;
                    var11_11 /* !! */  = null;
                    var52_50 /* !! */  = var0.w();
                    var39_37 = Color.parseColor((String)var52_50 /* !! */ );
                    ** GOTO lbl325
                }
                case 6: {
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var51_49 = var27_25;
                    var18_17 = 1;
                    var19_18 = 1.4E-45f;
                    var61_57 = 2;
                    var57_54 = 2.8E-45f;
                    var10_10 = 0;
                    var11_11 /* !! */  = null;
                    var60_56 = var0.u();
                    var5_5 = wz3.c() * var60_56;
                    var53_51 = (int)var5_5;
                    var38_36 = var53_51;
                    ** GOTO lbl325
                }
                case 5: {
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var51_49 = var27_25;
                    var18_17 = 1;
                    var19_18 = 1.4E-45f;
                    var61_57 = 2;
                    var57_54 = 2.8E-45f;
                    var10_10 = 0;
                    var11_11 /* !! */  = null;
                    var60_56 = var0.u();
                    var5_5 = wz3.c() * var60_56;
                    var53_51 = (int)var5_5;
                    var37_35 = var53_51;
                    ** GOTO lbl325
                }
                case 4: {
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var51_49 = var27_25;
                    var18_17 = 1;
                    var19_18 = 1.4E-45f;
                    var61_57 = 2;
                    var57_54 = 2.8E-45f;
                    var10_10 = 0;
                    var11_11 /* !! */  = null;
                    var53_51 = var0.u();
                    var21_20 = var69_65 = (long)var53_51;
                    ** GOTO lbl325
                }
                case 3: {
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var18_17 = 1;
                    var19_18 = 1.4E-45f;
                    var61_57 = 2;
                    var57_54 = 2.8E-45f;
                    var10_10 = 0;
                    var11_11 /* !! */  = null;
                    var53_51 = var0.u();
                    if (var53_51 >= (var4_4 = (var27_25 = pp1$a.UNKNOWN).ordinal())) ** GOTO lbl510
                    var64_60 = pp1$a.values();
                    var27_25 = var64_60[var53_51];
                    ** continue;
                }
                case 2: {
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var51_49 = var27_25;
                    var18_17 = 1;
                    var19_18 = 1.4E-45f;
                    var61_57 = 2;
                    var57_54 = 2.8E-45f;
                    var10_10 = 0;
                    var11_11 /* !! */  = null;
                    var28_26 /* !! */  = var0.w();
                    ** GOTO lbl325
                }
                case 1: {
                    var50_48 /* !! */  = var6_6 /* !! */ ;
                    var51_49 = var27_25;
                    var18_17 = 1;
                    var19_18 = 1.4E-45f;
                    var61_57 = 2;
                    var57_54 = 2.8E-45f;
                    var10_10 = 0;
                    var11_11 /* !! */  = null;
                    var53_51 = var0.u();
                    var16_16 = var69_65 = (long)var53_51;
                    ** GOTO lbl325
                }
                case 0: 
            }
            var50_48 /* !! */  = var6_6 /* !! */ ;
            var51_49 = var27_25;
            var18_17 = 1;
            var19_18 = 1.4E-45f;
            var61_57 = 2;
            var57_54 = 2.8E-45f;
            var10_10 = 0;
            var11_11 /* !! */  = null;
            var14_14 = var0.w();
            ** continue;
        }
        var50_48 /* !! */  = var6_6 /* !! */ ;
        var51_49 = var27_25;
        var0.d();
        var27_25 = new ArrayList();
        var71_66 = 0;
        var72_67 = 0.0f;
        var2_2 = null;
        cfr_temp_0 = var36_34 - 0.0f;
        var53_51 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
        if (var53_51 > 0) {
            var6_6 /* !! */  = Float.valueOf(var36_34);
            var4_4 = 0;
            var5_5 = 0.0f;
            var64_60 = null;
            var62_58 = 0;
            var63_59 = null;
            var2_2 = var11_11 /* !! */ ;
            var52_50 /* !! */  = var1_1;
            var20_19 = var12_12;
            var54_52 = var12_12;
            var15_15 = var8_8;
            var8_8 = var50_48 /* !! */ ;
            var11_11 /* !! */  = new Bo1(var1_1, (Object)var12_12, (Object)var12_12, null, 0.0f, (Float)var6_6 /* !! */ );
            var27_25.add(var11_11 /* !! */ );
lbl849:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var15_15 = var8_8;
        var8_8 = var6_6 /* !! */ ;
        ** while (true)
        var71_66 = 0;
        var72_67 = 0.0f;
        var2_2 = null;
        cfr_temp_1 = var45_43 - 0.0f;
        var71_66 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
        if (var71_66 <= 0) {
            var45_43 = var72_67 = var3_3.m;
        }
        var6_6 /* !! */  = Float.valueOf(var45_43);
        var4_4 = 0;
        var5_5 = 0.0f;
        var64_60 = null;
        var2_2 = var11_11 /* !! */ ;
        var52_50 /* !! */  = var1_1;
        var20_19 = var13_13;
        var54_52 = var13_13;
        var11_11 /* !! */  = new Bo1(var1_1, (Object)var13_13, (Object)var13_13, null, var36_34, (Float)var6_6 /* !! */ );
        var27_25.add(var11_11 /* !! */ );
        var72_67 = 3.4028235E38f;
        var6_6 /* !! */  = Float.valueOf(var72_67);
        var2_2 = var7_7 /* !! */ ;
        var20_19 = var12_12;
        var54_52 = var12_12;
        var7_7 /* !! */  = new Bo1(var1_1, (Object)var12_12, (Object)var12_12, null, var45_43, (Float)var6_6 /* !! */ );
        var27_25.add(var7_7 /* !! */ );
        var2_2 = ".ai";
        var71_66 = (int)var14_14.endsWith((String)var2_2);
        if (var71_66 == 0 && (var71_66 = (int)(var2_2 = "ai").equals(var8_8)) == 0) lbl-1000:
        // 2 sources

        {
            while (true) {
                continue;
                break;
            }
        }
        var2_2 = "Convert your Illustrator layers to shape layers.";
        var3_3.a((String)var2_2);
        ** while (true)
        var18_17 = var47_45;
        var19_18 = var48_46;
        if (var47_45 != 0) {
            if (var35_33 == null) {
                var35_33 = new dk_0();
            }
            var2_2 = var35_33;
            var35_33.j = var18_17;
            var11_11 /* !! */  = var35_33;
        } else {
            var11_11 /* !! */  = var35_33;
        }
        var2_2 = var46_44;
        var52_50 /* !! */  = var9_9;
        var20_19 = var1_1;
        var54_52 = var14_14;
        var69_65 = var16_16;
        var6_6 /* !! */  = var51_49;
        var9_9 = var28_26 /* !! */ ;
        var8_8 = var15_15;
        var26_24 = var38_36;
        var28_26 /* !! */  = var23_21;
        var38_36 = var44_42;
        var46_44 = new pp1((List)var52_50 /* !! */ , var1_1, var14_14, var16_16, (pp1$a)var51_49, var21_20, (String)var9_9, var15_15, (dk_0)var11_11 /* !! */ , var37_35, var26_24, var39_37, var40_38, var41_39, var42_40, var43_41, (yj_0)var29_27, (Zj)var31_29, (List)var27_25, var23_21, var32_30, (boolean)var44_42, (py_0)var33_31, var34_32, var24_22);
        return var46_44;
    }
}

