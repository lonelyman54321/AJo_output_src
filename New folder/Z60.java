/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path$FillType
 */
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Z60 {
    public static final Gm1$a a = Gm1$a.a("ty", "d");

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Y60 a(vm1_1 var0, QB1 var1_1) {
        block192: {
            block191: {
                var2_2 = var0;
                var3_3 /* !! */  = var1_1;
                var4_4 = "o";
                var5_5 = "g";
                var6_6 = "d";
                var7_7 = 3;
                var8_8 = 4;
                var9_9 = 5.6E-45f;
                var10_10 = 5;
                var11_11 = 7.0E-45f;
                var12_12 = false;
                var13_13 = 1;
                var0.b();
                var14_14 = 2;
                var15_15 = 2;
                var16_16 = 2.8E-45f;
                while (true) {
                    var17_17 = var0.k();
                    var18_18 = null;
                    if (var17_17 == 0) break block191;
                    var19_19 = Z60.a;
                    var17_17 = var2_2.C((Gm1$a)var19_19);
                    if (var17_17 == 0) break;
                    if (var17_17 != var13_13) {
                        var0.G();
                        var0.H();
                        continue;
                    }
                    var15_15 = var0.u();
                }
                var19_19 = var0.w();
                break block192;
            }
            var17_17 = 0;
            var19_19 = null;
        }
        if (var19_19 == null) {
            return null;
        }
        var20_20 = 0;
        var21_21 /* !! */  = null;
        var22_22 = 100;
        var23_23 = var19_19.hashCode();
        switch (var23_23) lbl-1000:
        // 15 sources

        {
            default: {
                var24_24 = -1;
                break;
            }
            case 3710: {
                var25_25 /* !! */  = "tr";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 13;
                break;
            }
            case 3705: {
                var25_25 /* !! */  = "tm";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 12;
                break;
            }
            case 3681: {
                var25_25 /* !! */  = "st";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 11;
                break;
            }
            case 3679: {
                var25_25 /* !! */  = "sr";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 10;
                break;
            }
            case 3669: {
                var25_25 /* !! */  = "sh";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 9;
                break;
            }
            case 3646: {
                var25_25 /* !! */  = "rp";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 8;
                break;
            }
            case 3634: {
                var25_25 /* !! */  = "rd";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 7;
                break;
            }
            case 3633: {
                var25_25 /* !! */  = "rc";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 6;
                break;
            }
            case 3488: {
                var25_25 /* !! */  = "mm";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 5;
                break;
            }
            case 3308: {
                var25_25 /* !! */  = "gs";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 4;
                break;
            }
            case 3307: {
                var25_25 /* !! */  = "gr";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 3;
                break;
            }
            case 3295: {
                var25_25 /* !! */  = "gf";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 2;
                break;
            }
            case 3270: {
                var25_25 /* !! */  = "fl";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 1;
                break;
            }
            case 3239: {
                var25_25 /* !! */  = "el";
                var24_24 = (int)var19_19.equals(var25_25 /* !! */ );
                if (var24_24 == 0) ** GOTO lbl-1000
                var24_24 = 0;
                var25_25 /* !! */  = null;
            }
        }
        block16 : switch (var24_24) {
            default: {
                var3_3 /* !! */  = "Unknown shape type ".concat((String)var19_19);
                rx1.b((String)var3_3 /* !! */ );
                break;
            }
            case 13: {
                var18_18 = ek_0.a(var0, var1_1);
                break;
            }
            case 12: {
                var4_4 = z13.a;
                var22_22 = 0;
                var26_26 = null;
                var23_23 = 0;
                var27_27 /* !! */  = null;
                var28_28 = null;
                var29_29 = 0;
                var30_30 = null;
                var31_31 = false;
                var32_32 /* !! */  = null;
                var33_33 = false;
                var34_34 = null;
                while ((var35_35 = (int)var0.k()) != 0) {
                    var4_4 = z13.a;
                    var35_35 = var2_2.C((Gm1$a)var4_4);
                    if (var35_35 != 0) {
                        if (var35_35 != var13_13) {
                            if (var35_35 != var14_14) {
                                if (var35_35 != var7_7) {
                                    if (var35_35 != var8_8) {
                                        if (var35_35 != var10_10) {
                                            var0.H();
                                            continue;
                                        }
                                        var33_33 = var0.n();
                                        continue;
                                    }
                                    var35_35 = var0.u();
                                    var27_27 /* !! */  = y13$a.forId(var35_35);
                                    continue;
                                }
                                var26_26 = var0.w();
                                continue;
                            }
                            var32_32 /* !! */  = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , false);
                            continue;
                        }
                        var30_30 = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , false);
                        continue;
                    }
                    var28_28 = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , false);
                }
                var21_21 /* !! */  = var18_18;
                var18_18 = new y13(var26_26, (y13$a)var27_27 /* !! */ , (oj_1)var28_28, (oj_1)var30_30, (oj_1)var32_32 /* !! */ , var33_33);
                break;
            }
            case 11: {
                var36_36 = x13.a;
                var36_36 = new ArrayList<Object>();
                var8_8 = 0;
                var37_37 = null;
                var9_9 = 0.0f;
                var10_10 = 0;
                var38_38 = null;
                var11_11 = 0.0f;
                var24_24 = 0;
                var25_25 /* !! */  = null;
                var29_29 = 0;
                var30_30 = null;
                var31_31 = false;
                var32_32 /* !! */  = null;
                var39_39 /* !! */  = null;
                var40_40 /* !! */  = null;
                var41_41 = 0.0f;
                var42_42 = null;
                var43_43 = false;
                var44_44 = 0.0f;
                block92: while ((var15_15 = (int)var0.k()) != 0) {
                    var45_45 = x13.a;
                    var15_15 = var2_2.C((Gm1$a)var45_45);
                    switch (var15_15) {
                        default: {
                            var0.H();
                            continue block92;
                        }
                        case 8: {
                            var0.a();
                            block93: while ((var15_15 = (int)var0.k()) != 0) {
                                var0.b();
                                var15_15 = 0;
                                var45_45 = null;
                                var16_16 = 0.0f;
                                var17_17 = 0;
                                var19_19 = null;
                                while ((var20_20 = var0.k()) != 0) {
                                    var21_21 /* !! */  = x13.b;
                                    var20_20 = var2_2.C((Gm1$a)var21_21 /* !! */ );
                                    if (var20_20 != 0) {
                                        if (var20_20 != var13_13) {
                                            var0.G();
                                            var0.H();
                                            continue;
                                        }
                                        var19_19 = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , (boolean)var13_13);
                                        continue;
                                    }
                                    var45_45 = var0.w();
                                }
                                var0.d();
                                var45_45.getClass();
                                var20_20 = var45_45.hashCode();
                                switch (var20_20) lbl-1000:
                                // 4 sources

                                {
                                    default: {
                                        var15_15 = -1;
                                        var16_16 = 0.0f / 0.0f;
                                        break;
                                    }
                                    case 111: {
                                        var15_15 = (int)var45_45.equals(var4_4);
                                        if (var15_15 == 0) ** GOTO lbl-1000
                                        var15_15 = 2;
                                        var16_16 = 2.8E-45f;
                                        break;
                                    }
                                    case 103: {
                                        var15_15 = (int)var45_45.equals(var5_5);
                                        if (var15_15 == 0) ** GOTO lbl-1000
                                        var15_15 = 1;
                                        var16_16 = 1.4E-45f;
                                        break;
                                    }
                                    case 100: {
                                        var15_15 = (int)var45_45.equals(var6_6);
                                        if (var15_15 == 0) ** GOTO lbl-1000
                                        var15_15 = 0;
                                        var16_16 = 0.0f;
                                        var45_45 = null;
                                    }
                                }
                                switch (var15_15) {
                                    default: {
                                        continue block93;
                                    }
                                    case 2: {
                                        var32_32 /* !! */  = var19_19;
                                        continue block93;
                                    }
                                    case 0: 
                                    case 1: 
                                }
                                var3_3 /* !! */ .o = var13_13;
                                var36_36.add(var19_19);
                            }
                            var0.c();
                            var15_15 = var36_36.size();
                            if (var15_15 != var13_13) continue block92;
                            var45_45 = (oj_1)var36_36.get(0);
                            var36_36.add(var45_45);
                            continue block92;
                        }
                        case 7: {
                            var43_43 = var0.n();
                            continue block92;
                        }
                        case 6: {
                            var46_46 = var0.p();
                            var41_41 = var16_16 = (float)var46_46;
                            continue block92;
                        }
                        case 5: {
                            var25_25 /* !! */  = w13$b.values();
                            var15_15 = var0.u() - var13_13;
                            var25_25 /* !! */  = var25_25 /* !! */ [var15_15];
                            continue block92;
                        }
                        case 4: {
                            var38_38 = w13$a.values();
                            var15_15 = var0.u() - var13_13;
                            var38_38 = var38_38[var15_15];
                            continue block92;
                        }
                        case 3: {
                            var37_37 = gk_1.e(var0, var1_1);
                            continue block92;
                        }
                        case 2: {
                            var40_40 /* !! */  = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , (boolean)var13_13);
                            continue block92;
                        }
                        case 1: {
                            var39_39 /* !! */  = gk_1.b(var0, var1_1);
                            continue block92;
                        }
                        case 0: 
                    }
                    var30_30 = var0.w();
                }
                if (var37_37 == null) {
                    var5_5 = var22_22;
                    var4_4 = new Object(var5_5);
                    var4_4 = Collections.singletonList(var4_4);
                    var48_47 = var3_3 /* !! */  = new tv_0((List)var4_4);
                } else {
                    var48_47 = var37_37;
                }
                if (var38_38 == null) {
                    var3_3 /* !! */  = w13$a.BUTT;
                    var49_48 = var3_3 /* !! */ ;
                } else {
                    var49_48 = var38_38;
                }
                if (var25_25 /* !! */  == null) {
                    var3_3 /* !! */  = w13$b.MITER;
                    var50_49 /* !! */  = var3_3 /* !! */ ;
                } else {
                    var50_49 /* !! */  = var25_25 /* !! */ ;
                }
                var28_28 = var18_18;
                var34_34 = var36_36;
                var18_18 = new w13((String)var30_30, (oj_1)var32_32 /* !! */ , var36_36, (nj_1)var39_39 /* !! */ , (qj_0)var48_47, (oj_1)var40_40 /* !! */ , (w13$a)var49_48, (w13$b)var50_49 /* !! */ , var41_41, var43_43);
                break;
            }
            case 10: {
                var4_4 = tw2.a;
                if (var15_15 == var7_7) {
                    var35_35 = 1;
                } else {
                    var35_35 = 0;
                    var4_4 = null;
                }
                var51_50 = var35_35;
                var22_22 = 0;
                var26_26 = null;
                var23_23 = 0;
                var27_27 /* !! */  = null;
                var28_28 = null;
                var29_29 = 0;
                var30_30 = null;
                var31_31 = false;
                var32_32 /* !! */  = null;
                var33_33 = false;
                var34_34 = null;
                var39_39 /* !! */  = null;
                var52_51 = false;
                var48_47 = null;
                var40_40 /* !! */  = null;
                var53_52 = false;
                var49_48 = null;
                block96: while ((var35_35 = (int)var0.k()) != 0) {
                    var4_4 = tw2.a;
                    var35_35 = var2_2.C((Gm1$a)var4_4);
                    switch (var35_35) {
                        default: {
                            var0.G();
                            var0.H();
                            continue block96;
                        }
                        case 10: {
                            var35_35 = var0.u();
                            if (var35_35 == var7_7) {
                                var51_50 = 1;
                                continue block96;
                            }
                            var51_50 = 0;
                            var50_49 /* !! */  = null;
                            continue block96;
                        }
                        case 9: {
                            var53_52 = var0.n();
                            continue block96;
                        }
                        case 8: {
                            var48_47 = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , false);
                            continue block96;
                        }
                        case 7: {
                            var34_34 = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , (boolean)var13_13);
                            continue block96;
                        }
                        case 6: {
                            var40_40 /* !! */  = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , false);
                            continue block96;
                        }
                        case 5: {
                            var39_39 /* !! */  = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , (boolean)var13_13);
                            continue block96;
                        }
                        case 4: {
                            var32_32 /* !! */  = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , false);
                            continue block96;
                        }
                        case 3: {
                            var30_30 = Tj.b(var0, var1_1);
                            continue block96;
                        }
                        case 2: {
                            var28_28 = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , false);
                            continue block96;
                        }
                        case 1: {
                            var35_35 = var0.u();
                            var27_27 /* !! */  = sw2$a.forValue(var35_35);
                            continue block96;
                        }
                        case 0: 
                    }
                    var26_26 = var0.w();
                }
                var21_21 /* !! */  = var18_18;
                var18_18 = new sw2(var26_26, (sw2$a)var27_27 /* !! */ , (oj_1)var28_28, (fk_0)var30_30, (oj_1)var32_32 /* !! */ , (oj_1)var34_34, (oj_1)var39_39 /* !! */ , (oj_1)var48_47, (oj_1)var40_40 /* !! */ , var53_52, (boolean)var51_50);
                break;
            }
            case 9: {
                var4_4 = v13.a;
                var35_35 = 0;
                var4_4 = null;
                var54_53 = 0;
                var5_5 = null;
                var55_54 = 0;
                var6_6 = null;
                while ((var8_8 = (int)var0.k()) != 0) {
                    var37_37 = v13.a;
                    var8_8 = var2_2.C((Gm1$a)var37_37);
                    if (var8_8 != 0) {
                        if (var8_8 != var13_13) {
                            if (var8_8 != var14_14) {
                                if (var8_8 != var7_7) {
                                    var0.H();
                                    continue;
                                }
                                var55_54 = (int)var0.n();
                                continue;
                            }
                            var9_9 = wz3.c();
                            var38_38 = m13.a;
                            var37_37 = Fo1.a(var2_2, (QB1)var3_3 /* !! */ , var9_9, (qA3)var38_38, false);
                            var4_4 = new Object((List)var37_37);
                            continue;
                        }
                        var54_53 = var0.u();
                        continue;
                    }
                    var18_18 = var0.w();
                }
                var3_3 /* !! */  = new u13((String)var18_18, var54_53, (wj_0)var4_4, (boolean)var55_54);
lbl426:
                // 2 sources

                while (true) {
                    var18_18 = var3_3 /* !! */ ;
                    break block16;
                    break;
                }
            }
            case 8: {
                var4_4 = BJ2.a;
                var22_22 = 0;
                var26_26 = null;
                var23_23 = 0;
                var27_27 /* !! */  = null;
                var28_28 = null;
                var29_29 = 0;
                var30_30 = null;
                var31_31 = false;
                var32_32 /* !! */  = null;
                while ((var35_35 = var0.k()) != 0) {
                    var4_4 = BJ2.a;
                    var35_35 = var2_2.C((Gm1$a)var4_4);
                    if (var35_35 != 0) {
                        if (var35_35 != var13_13) {
                            if (var35_35 != var14_14) {
                                if (var35_35 != var7_7) {
                                    if (var35_35 != var8_8) {
                                        var0.H();
                                        continue;
                                    }
                                    var31_31 = var0.n();
                                    continue;
                                }
                                var30_30 = ek_0.a(var0, var1_1);
                                continue;
                            }
                            var28_28 = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , false);
                            continue;
                        }
                        var27_27 /* !! */  = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , false);
                        continue;
                    }
                    var26_26 = var0.w();
                }
                var21_21 /* !! */  = var18_18;
                var18_18 = new zj2_0(var26_26, (oj_1)var27_27 /* !! */ , (oj_1)var28_28, (dk_0)var30_30, var31_31);
                break;
            }
            case 7: {
                var4_4 = VP2.a;
                var35_35 = 0;
                var4_4 = null;
                var54_53 = 0;
                var5_5 = null;
                while ((var55_54 = var0.k()) != 0) {
                    var6_6 = VP2.a;
                    var55_54 = var2_2.C((Gm1$a)var6_6);
                    if (var55_54 != 0) {
                        if (var55_54 != var13_13) {
                            if (var55_54 != var14_14) {
                                var0.H();
                                continue;
                            }
                            var12_12 = var0.n();
                            continue;
                        }
                        var5_5 = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , (boolean)var13_13);
                        continue;
                    }
                    var4_4 = var0.w();
                }
                if (var12_12) break;
                var18_18 = new TP2((String)var4_4, (oj_1)var5_5);
                break;
            }
            case 6: {
                var4_4 = gg2_0.a;
                var22_22 = 0;
                var26_26 = null;
                var23_23 = 0;
                var27_27 /* !! */  = null;
                var28_28 = null;
                var29_29 = 0;
                var30_30 = null;
                var31_31 = false;
                var32_32 /* !! */  = null;
                while ((var35_35 = var0.k()) != 0) {
                    var4_4 = gg2_0.a;
                    var35_35 = var2_2.C((Gm1$a)var4_4);
                    if (var35_35 != 0) {
                        if (var35_35 != var13_13) {
                            if (var35_35 != var14_14) {
                                if (var35_35 != var7_7) {
                                    if (var35_35 != var8_8) {
                                        var0.H();
                                        continue;
                                    }
                                    var31_31 = var0.n();
                                    continue;
                                }
                                var30_30 = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , (boolean)var13_13);
                                continue;
                            }
                            var28_28 = gk_1.f(var0, var1_1);
                            continue;
                        }
                        var27_27 /* !! */  = Tj.b(var0, var1_1);
                        continue;
                    }
                    var26_26 = var0.w();
                }
                var21_21 /* !! */  = var18_18;
                var18_18 = new eg2_1(var26_26, (fk_0)var27_27 /* !! */ , (Uj)var28_28, (oj_1)var30_30, var31_31);
                break;
            }
            case 5: {
                var4_4 = lo1_0.a;
                var35_35 = 0;
                var4_4 = null;
                while ((var54_53 = var0.k()) != 0) {
                    var5_5 = lo1_0.a;
                    var54_53 = var2_2.C((Gm1$a)var5_5);
                    if (var54_53 != 0) {
                        if (var54_53 != var13_13) {
                            if (var54_53 != var14_14) {
                                var0.G();
                                var0.H();
                                continue;
                            }
                            var12_12 = var0.n();
                            continue;
                        }
                        var35_35 = var0.u();
                        var4_4 = jO1$a.forId(var35_35);
                        continue;
                    }
                    var18_18 = var0.w();
                }
                var5_5 = new jo1_0((String)var18_18, (jO1$a)var4_4, var12_12);
                var4_4 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().";
                var3_3 /* !! */ .a((String)var4_4);
                var18_18 = var5_5;
                break;
            }
            case 4: {
                var36_36 = K01.a;
                var36_36 = new ArrayList<Object>();
                var8_8 = 0;
                var37_37 = null;
                var9_9 = 0.0f;
                var29_29 = 0;
                var30_30 = null;
                var31_31 = false;
                var32_32 /* !! */  = null;
                var33_33 = false;
                var34_34 = null;
                var52_51 = false;
                var48_47 = null;
                var40_40 /* !! */  = null;
                var53_52 = false;
                var49_48 = null;
                var51_50 = 0;
                var50_49 /* !! */  = null;
                var42_42 = null;
                var41_41 = 0.0f;
                var56_55 /* !! */  = null;
                var43_43 = false;
                var44_44 = 0.0f;
                var57_56 = false;
                block103: while ((var10_10 = (int)var0.k()) != 0) {
                    var38_38 = K01.a;
                    var10_10 = var2_2.C((Gm1$a)var38_38);
                    switch (var10_10) {
                        default: {
                            var0.G();
                            var0.H();
                            continue block103;
                        }
                        case 11: {
                            var0.a();
                            while ((var10_10 = (int)var0.k()) != 0) {
                                var0.b();
                                var10_10 = 0;
                                var38_38 = null;
                                var11_11 = 0.0f;
                                var24_24 = 0;
                                var25_25 /* !! */  = null;
                                while ((var14_14 = (int)var0.k()) != 0) {
                                    var58_57 = K01.c;
                                    var14_14 = var2_2.C(var58_57);
                                    if (var14_14 != 0) {
                                        if (var14_14 != var13_13) {
                                            var0.G();
                                            var0.H();
                                            continue;
                                        }
                                        var25_25 /* !! */  = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , (boolean)var13_13);
                                        continue;
                                    }
                                    var38_38 = var0.w();
                                }
                                var0.d();
                                var14_14 = (int)var38_38.equals(var4_4);
                                if (var14_14 != 0) {
                                    var56_55 /* !! */  = var25_25 /* !! */ ;
                                    continue;
                                }
                                var14_14 = var38_38.equals(var6_6);
                                if (var14_14 == 0 && (var10_10 = var38_38.equals(var5_5)) == 0) continue;
                                var3_3 /* !! */ .o = var13_13;
                                var36_36.add(var25_25 /* !! */ );
                            }
                            var0.c();
                            var10_10 = var36_36.size();
                            if (var10_10 != var13_13) continue block103;
                            var38_38 = (oj_1)var36_36.get(0);
                            var36_36.add(var38_38);
                            continue block103;
                        }
                        case 10: {
                            var57_56 = var0.n();
                            continue block103;
                        }
                        case 9: {
                            var59_58 = var0.p();
                            var44_44 = var11_11 = (float)var59_58;
                            continue block103;
                        }
                        case 8: {
                            var38_38 = w13$b.values();
                            var24_24 = var0.u() - var13_13;
                            var42_42 = var38_38[var24_24];
                            continue block103;
                        }
                        case 7: {
                            var38_38 = w13$a.values();
                            var24_24 = var0.u() - var13_13;
                            var50_49 /* !! */  = var38_38[var24_24];
                            continue block103;
                        }
                        case 6: {
                            var49_48 = gk_1.c(var2_2, (QB1)var3_3 /* !! */ , (boolean)var13_13);
                            continue block103;
                        }
                        case 5: {
                            var40_40 /* !! */  = gk_1.f(var0, var1_1);
                            continue block103;
                        }
                        case 4: {
                            var48_47 = gk_1.f(var0, var1_1);
                            continue block103;
                        }
                        case 3: {
                            var10_10 = var0.u();
                            if (var10_10 == var13_13) {
                                var38_38 = L01.LINEAR;
lbl647:
                                // 2 sources

                                while (true) {
                                    var32_32 /* !! */  = var38_38;
                                    continue block103;
                                    break;
                                }
                            }
                            var38_38 = L01.RADIAL;
                            ** continue;
                        }
                        case 2: {
                            var37_37 = gk_1.e(var0, var1_1);
                            continue block103;
                        }
                        case 1: {
                            var0.b();
                            var10_10 = -1;
                            var11_11 = 0.0f / 0.0f;
                            while ((var24_24 = (int)var0.k()) != 0) {
                                var25_25 /* !! */  = K01.b;
                                var24_24 = var2_2.C((Gm1$a)var25_25 /* !! */ );
                                if (var24_24 != 0) {
                                    if (var24_24 != var13_13) {
                                        var0.G();
                                        var0.H();
                                        continue;
                                    }
                                    var34_34 = gk_1.d(var2_2, (QB1)var3_3 /* !! */ , var10_10);
                                    continue;
                                }
                                var10_10 = var0.u();
                            }
                            var0.d();
                            continue block103;
                        }
                        case 0: 
                    }
                    var30_30 = var0.w();
                }
                if (var37_37 == null) {
                    var5_5 = var22_22;
                    var4_4 = new Object(var5_5);
                    var4_4 = Collections.singletonList(var4_4);
                    var39_39 /* !! */  = var3_3 /* !! */  = new tv_0((List)var4_4);
                } else {
                    var39_39 /* !! */  = var37_37;
                }
                var28_28 = var18_18;
                var18_18 = new i01_0((String)var30_30, (L01)var32_32 /* !! */ , (pj_0)var34_34, (qj_0)var39_39 /* !! */ , (Uj)var48_47, var40_40 /* !! */ , (oj_1)var49_48, (w13$a)var50_49 /* !! */ , (w13$b)var42_42, var44_44, var36_36, (oj_1)var56_55 /* !! */ , var57_56);
                break;
            }
            case 3: {
                var4_4 = q13.a;
                var4_4 = new Object();
                while ((var54_53 = var0.k()) != 0) {
                    var5_5 = q13.a;
                    var54_53 = var2_2.C((Gm1$a)var5_5);
                    if (var54_53 != 0) {
                        if (var54_53 != var13_13) {
                            if (var54_53 != var14_14) {
                                var0.H();
                                continue;
                            }
                            var0.a();
                            while ((var54_53 = (int)var0.k()) != 0) {
                                var5_5 = Z60.a(var0, var1_1);
                                if (var5_5 == null) continue;
                                var4_4.add(var5_5);
                            }
                            var0.c();
                            continue;
                        }
                        var12_12 = var0.n();
                        continue;
                    }
                    var18_18 = var0.w();
                }
                var3_3 /* !! */  = new p13((String)var18_18, (List)var4_4, var12_12);
                ** continue;
            }
            case 2: {
                var4_4 = H01.a;
                var4_4 = Path.FillType.WINDING;
                var34_34 = var4_4;
                var29_29 = 0;
                var30_30 = null;
                var31_31 = false;
                var32_32 /* !! */  = null;
                var39_39 /* !! */  = null;
                var40_40 /* !! */  = null;
                var53_52 = false;
                var49_48 = null;
                var51_50 = 0;
                var50_49 /* !! */  = null;
                block110: while ((var35_35 = (int)var0.k()) != 0) {
                    var4_4 = H01.a;
                    var35_35 = var2_2.C((Gm1$a)var4_4);
                    switch (var35_35) {
                        default: {
                            var0.G();
                            var0.H();
                            continue block110;
                        }
                        case 7: {
                            var51_50 = var0.n();
                            continue block110;
                        }
                        case 6: {
                            var35_35 = var0.u();
                            if (var35_35 == var13_13) {
                                var4_4 = Path.FillType.WINDING;
lbl741:
                                // 2 sources

                                while (true) {
                                    var34_34 = var4_4;
                                    continue block110;
                                    break;
                                }
                            }
                            var4_4 = Path.FillType.EVEN_ODD;
                            ** continue;
                        }
                        case 5: {
                            var49_48 = gk_1.f(var0, var1_1);
                            continue block110;
                        }
                        case 4: {
                            var40_40 /* !! */  = gk_1.f(var0, var1_1);
                            continue block110;
                        }
                        case 3: {
                            var35_35 = var0.u();
                            if (var35_35 == var13_13) {
                                var4_4 = L01.LINEAR;
lbl756:
                                // 2 sources

                                while (true) {
                                    var32_32 /* !! */  = var4_4;
                                    continue block110;
                                    break;
                                }
                            }
                            var4_4 = L01.RADIAL;
                            ** continue;
                        }
                        case 2: {
                            var18_18 = gk_1.e(var0, var1_1);
                            continue block110;
                        }
                        case 1: {
                            var0.b();
                            var35_35 = -1;
                            while ((var54_53 = (int)var0.k()) != 0) {
                                var5_5 = H01.b;
                                var54_53 = var2_2.C((Gm1$a)var5_5);
                                if (var54_53 != 0) {
                                    if (var54_53 != var13_13) {
                                        var0.G();
                                        var0.H();
                                        continue;
                                    }
                                    var39_39 /* !! */  = gk_1.d(var2_2, (QB1)var3_3 /* !! */ , var35_35);
                                    continue;
                                }
                                var35_35 = var0.u();
                            }
                            var0.d();
                            continue block110;
                        }
                        case 0: 
                    }
                    var30_30 = var0.w();
                }
                if (var18_18 == null) {
                    var5_5 = var22_22;
                    var4_4 = new Object(var5_5);
                    var4_4 = Collections.singletonList(var4_4);
                    var48_47 = var3_3 /* !! */  = new tv_0((List)var4_4);
                } else {
                    var48_47 = var18_18;
                }
                var28_28 = var18_18;
                var18_18 = new F01((String)var30_30, (L01)var32_32 /* !! */ , (Path.FillType)var34_34, (pj_0)var39_39 /* !! */ , (qj_0)var48_47, var40_40 /* !! */ , (Uj)var49_48, (boolean)var51_50);
                break;
            }
            case 1: {
                var4_4 = o13.a;
                var28_28 = null;
                var33_33 = false;
                var34_34 = null;
                var35_35 = 1;
                var29_29 = 0;
                var30_30 = null;
                var52_51 = false;
                var48_47 = null;
                while ((var54_53 = (int)var0.k()) != 0) {
                    var5_5 = o13.a;
                    var54_53 = var2_2.C((Gm1$a)var5_5);
                    if (var54_53 != 0) {
                        if (var54_53 != var13_13) {
                            if (var54_53 != var14_14) {
                                if (var54_53 != var7_7) {
                                    if (var54_53 != var8_8) {
                                        if (var54_53 != var10_10) {
                                            var0.G();
                                            var0.H();
                                            continue;
                                        }
                                        var52_51 = var0.n();
                                        continue;
                                    }
                                    var35_35 = var0.u();
                                    continue;
                                }
                                var29_29 = (int)var0.n();
                                continue;
                            }
                            var18_18 = gk_1.e(var0, var1_1);
                            continue;
                        }
                        var34_34 = gk_1.b(var0, var1_1);
                        continue;
                    }
                    var28_28 = var0.w();
                }
                if (var18_18 == null) {
                    var6_6 = var22_22;
                    var5_5 = new Bo1(var6_6);
                    var5_5 = Collections.singletonList(var5_5);
                    var39_39 /* !! */  = var3_3 /* !! */  = new tv_0((List)var5_5);
                } else {
                    var39_39 /* !! */  = var18_18;
                }
                if (var35_35 == var13_13) {
                    var3_3 /* !! */  = Path.FillType.WINDING;
lbl837:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var3_3 /* !! */  = Path.FillType.EVEN_ODD;
                ** continue;
                var32_32 /* !! */  = var3_3 /* !! */ ;
                var27_27 /* !! */  = var18_18;
                var18_18 = new n13((String)var28_28, (boolean)var29_29, (Path.FillType)var3_3 /* !! */ , (nj_1)var34_34, (qj_0)var39_39 /* !! */ , var52_51);
                break;
            }
            case 0: {
                var4_4 = MU.a;
                if (var15_15 == var7_7) {
                    var35_35 = 1;
                } else {
                    var35_35 = 0;
                    var4_4 = null;
                }
                var29_29 = var35_35;
                var22_22 = 0;
                var26_26 = null;
                var23_23 = 0;
                var27_27 /* !! */  = null;
                var28_28 = null;
                var31_31 = false;
                var32_32 /* !! */  = null;
                while ((var35_35 = (int)var0.k()) != 0) {
                    var4_4 = MU.a;
                    var35_35 = var2_2.C((Gm1$a)var4_4);
                    if (var35_35 != 0) {
                        if (var35_35 != var13_13) {
                            if (var35_35 != var14_14) {
                                if (var35_35 != var7_7) {
                                    if (var35_35 != var8_8) {
                                        var0.G();
                                        var0.H();
                                        continue;
                                    }
                                    var35_35 = var0.u();
                                    if (var35_35 == var7_7) {
                                        var29_29 = 1;
                                        continue;
                                    }
                                    var29_29 = 0;
                                    var30_30 = null;
                                    continue;
                                }
                                var31_31 = var0.n();
                                continue;
                            }
                            var28_28 = gk_1.f(var0, var1_1);
                            continue;
                        }
                        var27_27 /* !! */  = Tj.b(var0, var1_1);
                        continue;
                    }
                    var26_26 = var0.w();
                }
                var21_21 /* !! */  = var18_18;
                var18_18 = new LU(var26_26, (fk_0)var27_27 /* !! */ , (Uj)var28_28, (boolean)var29_29, var31_31);
            }
        }
        while (var61_59 = var0.k()) {
            var0.H();
        }
        var0.d();
        return var18_18;
    }
}

