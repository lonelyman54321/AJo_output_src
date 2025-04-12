/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 *  android.view.animation.PathInterpolator
 */
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

public final class Eo1 {
    public static final LinearInterpolator a;
    public static final Gm1$a b;
    public static final Gm1$a c;

    static {
        LinearInterpolator linearInterpolator;
        a = linearInterpolator = new LinearInterpolator();
        b = Gm1$a.a("t", "s", "e", "o", "i", "h", "to", "ti");
        c = Gm1$a.a("x", "y");
    }

    public static Interpolator a(PointF object, PointF pointF) {
        PathInterpolator pathInterpolator;
        block7: {
            float f5 = object.x;
            float f6 = -1.0f;
            float f7 = 1.0f;
            object.x = f5 = mp1_0.b(f5, f6, f7);
            f5 = object.y;
            float f8 = -100.0f;
            float f11 = 100.0f;
            object.y = f5 = mp1_0.b(f5, f8, f11);
            pointF.x = f5 = mp1_0.b(pointF.x, f6, f7);
            pointF.y = f5 = mp1_0.b(pointF.y, f8, f11);
            Object object2 = wz3.a;
            object2 = Yo1.a;
            f6 = object.x;
            f8 = object.y;
            f11 = pointF.x;
            try {
                pathInterpolator = new PathInterpolator(f6, f8, f11, f5);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object2 = "The Path cannot loop back on itself.";
                String string2 = illegalArgumentException.getMessage();
                boolean bl2 = ((String)object2).equals(string2);
                if (bl2) {
                    f5 = Math.min(object.x, f7);
                    float f12 = object.y;
                    f6 = pointF.x;
                    f7 = 0.0f;
                    f6 = Math.max(f6, 0.0f);
                    float f14 = pointF.y;
                    pathInterpolator = new PathInterpolator(f5, f12, f6, f14);
                    break block7;
                }
                pathInterpolator = new LinearInterpolator();
            }
        }
        object = Yo1.a;
        return pathInterpolator;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Bo1 b(gm1_0 var0, QB1 var1_1, float var2_2, qA3 var3_3, boolean var4_4, boolean var5_5) {
        block58: {
            block57: {
                var6_6 = var0;
                var7_7 = var2_2;
                var8_8 = var3_3;
                var9_9 /* !! */  = Eo1.a;
                var10_10 /* !! */  = Eo1.b;
                if (!var4_4 || !var5_5) break block57;
                var0.b();
                var11_11 = 0.0f;
                var12_13 = null;
                var13_15 = 0;
                var14_17 = 0.0f;
                var15_18 /* !! */  = null;
                var16_20 = 0;
                var17_22 = 0.0f;
                var18_24 /* !! */  = null;
                var19_26 = 0;
                var20_28 = null;
                var21_30 = null;
                var22_32 = false;
                var23_34 /* !! */  = null;
                var24_35 = 0;
                var25_37 = 0.0f;
                var26_39 /* !! */  = null;
                var27_40 = 0;
                var28_41 /* !! */  = null;
                var29_42 /* !! */  = null;
                var30_43 = 0.0f;
                var31_44 = null;
                var32_45 = 0.0f;
                var33_46 = null;
                block20: while ((var34_47 = var0.k()) != 0) {
                    var34_47 = var6_6.C(var10_10 /* !! */ );
                    var35_48 = Eo1.c;
                    switch (var34_47) {
                        default: {
                            var0.H();
                            continue block20;
                        }
                        case 7: {
                            var18_24 /* !! */  = Xm1.b((gm1_0)var6_6, var7_7);
                            continue block20;
                        }
                        case 6: {
                            var15_18 /* !! */  = Xm1.b((gm1_0)var6_6, var7_7);
                            continue block20;
                        }
                        case 5: {
                            var36_50 = var0.u();
                            var19_26 = 1;
                            if (var36_50 == var19_26) {
                                var19_26 = 1;
                                continue block20;
                            }
                            var19_26 = 0;
                            var20_28 = null;
                            continue block20;
                        }
                        case 4: {
                            var37_52 = var9_9 /* !! */ ;
                            var9_9 /* !! */  = var0.z();
                            var38_54 = var10_10 /* !! */ ;
                            var10_10 /* !! */  = Gm1$b.BEGIN_OBJECT;
                            if (var9_9 /* !! */  != var10_10 /* !! */ ) ** GOTO lbl139
                            var0.b();
                            var39_56 = 0.0f;
                            var9_9 /* !! */  = null;
                            var40_58 = 0.0f;
                            var10_10 /* !! */  = null;
                            var11_11 = 0.0f;
                            var12_13 = null;
                            var30_43 = 0.0f;
                            var31_44 = null;
                            block21: while (var41_60 = var0.k()) {
                                var42_61 = var18_24 /* !! */ ;
                                var16_20 = var6_6.C(var35_48);
                                if (var16_20 == 0) ** GOTO lbl105
                                var43_62 = var15_18 /* !! */ ;
                                var13_15 = 1;
                                var14_17 = 1.4E-45f;
                                if (var16_20 != var13_15) {
                                    var0.H();
lbl77:
                                    // 3 sources

                                    while (true) {
                                        var18_24 /* !! */  = var42_61;
                                        continue block21;
                                        break;
                                    }
                                }
                                var10_10 /* !! */  = var0.z();
                                if (var10_10 /* !! */  != (var15_18 /* !! */  = Gm1$b.NUMBER)) ** GOTO lbl87
                                var44_63 = var0.p();
                                var30_43 = (float)var44_63;
                                var15_18 /* !! */  = var43_62;
                                var40_58 = var30_43;
                                ** GOTO lbl77
lbl87:
                                // 1 sources

                                var0.a();
                                var46_64 = var28_41 /* !! */ ;
                                var18_24 /* !! */  = var29_42 /* !! */ ;
                                var47_65 = var0.p();
                                var40_58 = (float)var47_65;
                                var28_41 /* !! */  = var0.z();
                                if (var28_41 /* !! */  == var15_18 /* !! */ ) {
                                    var47_65 = var0.p();
                                    var30_43 = var14_17 = (float)var47_65;
                                } else {
                                    var30_43 = var40_58;
                                }
                                var0.c();
lbl99:
                                // 2 sources

                                while (true) {
                                    var15_18 /* !! */  = var43_62;
                                    var28_41 /* !! */  = var46_64;
lbl102:
                                    // 2 sources

                                    while (true) {
                                        var29_42 /* !! */  = var18_24 /* !! */ ;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
lbl105:
                                // 1 sources

                                var43_62 = var15_18 /* !! */ ;
                                var46_64 = var28_41 /* !! */ ;
                                var18_24 /* !! */  = var29_42 /* !! */ ;
                                var9_9 /* !! */  = var0.z();
                                if (var9_9 /* !! */  == (var12_13 = Gm1$b.NUMBER)) {
                                    var49_66 = var0.p();
                                    var39_56 = var11_11 = (float)var49_66;
                                    ** continue;
                                }
                                var0.a();
                                var47_65 = var0.p();
                                var39_56 = (float)var47_65;
                                var15_18 /* !! */  = var0.z();
                                if (var15_18 /* !! */  == var12_13) {
                                    var49_66 = var0.p();
                                    var11_11 = (float)var49_66;
                                } else {
                                    var11_11 = var39_56;
                                }
                                var0.c();
                                ** continue;
                            }
                            var43_62 = var15_18 /* !! */ ;
                            var42_61 = var18_24 /* !! */ ;
                            var46_64 = var28_41 /* !! */ ;
                            var18_24 /* !! */  = var29_42 /* !! */ ;
                            var35_48 = new PointF(var39_56, var40_58);
                            var9_9 /* !! */  = new PointF(var11_11, var30_43);
                            var0.d();
                            var12_13 = var9_9 /* !! */ ;
                            var31_44 = var35_48;
lbl133:
                            // 5 sources

                            while (true) {
                                var9_9 /* !! */  = var37_52;
                                var10_10 /* !! */  = var38_54;
lbl136:
                                // 3 sources

                                while (true) {
                                    var18_24 /* !! */  = var42_61;
                                    continue block20;
                                    break;
                                }
                                break;
                            }
lbl139:
                            // 1 sources

                            var43_62 = var15_18 /* !! */ ;
                            var42_61 = var18_24 /* !! */ ;
                            var46_64 = var28_41 /* !! */ ;
                            var18_24 /* !! */  = var29_42 /* !! */ ;
                            var23_34 /* !! */  = Xm1.b((gm1_0)var6_6, var7_7);
                            ** GOTO lbl133
                        }
                        case 3: {
                            var37_52 = var9_9 /* !! */ ;
                            var38_54 = var10_10 /* !! */ ;
                            var43_62 = var15_18 /* !! */ ;
                            var42_61 = var18_24 /* !! */ ;
                            var46_64 = var28_41 /* !! */ ;
                            var18_24 /* !! */  = var29_42 /* !! */ ;
                            var9_9 /* !! */  = var0.z();
                            var10_10 /* !! */  = Gm1$b.BEGIN_OBJECT;
                            if (var9_9 /* !! */  != var10_10 /* !! */ ) ** GOTO lbl211
                            var0.b();
                            var39_56 = 0.0f;
                            var9_9 /* !! */  = null;
                            var40_58 = 0.0f;
                            var10_10 /* !! */  = null;
                            var13_15 = 0;
                            var14_17 = 0.0f;
                            var15_18 /* !! */  = null;
                            var16_20 = 0;
                            var17_22 = 0.0f;
                            var18_24 /* !! */  = null;
                            while ((var24_35 = var0.k()) != 0) {
                                var24_35 = var6_6.C(var35_48);
                                if (var24_35 != 0) {
                                    var27_40 = 1;
                                    if (var24_35 != var27_40) {
                                        var0.H();
                                        continue;
                                    }
                                    var10_10 /* !! */  = var0.z();
                                    if (var10_10 /* !! */  == (var18_24 /* !! */  = Gm1$b.NUMBER)) {
                                        var51_67 = var0.p();
                                        var40_58 = var17_22 = (float)var51_67;
                                        continue;
                                    }
                                    var0.a();
                                    var51_67 = var0.p();
                                    var40_58 = (float)var51_67;
                                    var26_39 /* !! */  = var0.z();
                                    if (var26_39 /* !! */  == var18_24 /* !! */ ) {
                                        var51_67 = var0.p();
                                        var17_22 = (float)var51_67;
                                    } else {
                                        var17_22 = var40_58;
                                    }
                                    var0.c();
                                    continue;
                                }
                                var9_9 /* !! */  = var0.z();
                                if (var9_9 /* !! */  == (var15_18 /* !! */  = Gm1$b.NUMBER)) {
                                    var51_67 = var0.p();
                                    var39_56 = var14_17 = (float)var51_67;
                                    continue;
                                }
                                var0.a();
                                var51_67 = var0.p();
                                var39_56 = (float)var51_67;
                                var26_39 /* !! */  = var0.z();
                                if (var26_39 /* !! */  == var15_18 /* !! */ ) {
                                    var51_67 = var0.p();
                                    var14_17 = (float)var51_67;
                                } else {
                                    var14_17 = var39_56;
                                }
                                var0.c();
                            }
                            var26_39 /* !! */  = new PointF(var39_56, var40_58);
                            var29_42 /* !! */  = new PointF(var14_17, var17_22);
                            var0.d();
                            var15_18 /* !! */  = var43_62;
                            var28_41 /* !! */  = var46_64;
                            ** GOTO lbl133
lbl211:
                            // 1 sources

                            var21_30 = Xm1.b((gm1_0)var6_6, var7_7);
                            ** GOTO lbl133
                        }
                        case 2: {
                            var37_52 = var9_9 /* !! */ ;
                            var38_54 = var10_10 /* !! */ ;
                            var43_62 = var15_18 /* !! */ ;
                            var42_61 = var18_24 /* !! */ ;
                            var46_64 = var28_41 /* !! */ ;
                            var18_24 /* !! */  = var29_42 /* !! */ ;
                            var33_46 = var8_8.a((gm1_0)var6_6, var7_7);
                            ** GOTO lbl136
                        }
                        case 1: {
                            var37_52 = var9_9 /* !! */ ;
                            var38_54 = var10_10 /* !! */ ;
                            var43_62 = var15_18 /* !! */ ;
                            var42_61 = var18_24 /* !! */ ;
                            var18_24 /* !! */  = var29_42 /* !! */ ;
                            var28_41 /* !! */  = var8_8.a((gm1_0)var6_6, var7_7);
                            ** continue;
                        }
                        case 0: 
                    }
                    var37_52 = var9_9 /* !! */ ;
                    var38_54 = var10_10 /* !! */ ;
                    var43_62 = var15_18 /* !! */ ;
                    var42_61 = var18_24 /* !! */ ;
                    var46_64 = var28_41 /* !! */ ;
                    var18_24 /* !! */  = var29_42 /* !! */ ;
                    var53_69 = var0.p();
                    var32_45 = var39_56 = (float)var53_69;
                    ** continue;
                }
                var37_52 = var9_9 /* !! */ ;
                var43_62 = var15_18 /* !! */ ;
                var42_61 = var18_24 /* !! */ ;
                var46_64 = var28_41 /* !! */ ;
                var18_24 /* !! */  = var29_42 /* !! */ ;
                var0.d();
                if (var19_26 != 0) {
                    var29_42 /* !! */  = var28_41 /* !! */ ;
lbl248:
                    // 2 sources

                    while (true) {
                        var30_43 = 0.0f;
                        var31_44 = null;
                        var55_70 = 0.0f;
                        var56_71 = null;
                        break;
                    }
                } else {
                    if (var21_30 != null && var23_34 /* !! */  != null) {
                        var37_52 = var9_9 /* !! */  = Eo1.a(var21_30, var23_34 /* !! */ );
                        while (true) {
                            var29_42 /* !! */  = var33_46;
                            ** continue;
                            break;
                        }
                    }
                    if (var26_39 /* !! */  == null || var18_24 /* !! */  == null || var31_44 == null || var12_13 == null) ** continue;
                    var6_6 = Eo1.a(var26_39 /* !! */ , var31_44);
                    var57_72 = Eo1.a(var18_24 /* !! */ , var12_13);
                    var31_44 = var6_6;
                    var56_71 = var57_72;
                    var29_42 /* !! */  = var33_46;
                    var34_47 = 0;
                    var37_52 = null;
                }
                if (var31_44 != null && var56_71 != null) {
                    var23_34 /* !! */  = var6_6;
                    var26_39 /* !! */  = var1_1;
                    var28_41 /* !! */  = var46_64;
                    var6_6 = new Bo1(var1_1, var46_64, (Object)var29_42 /* !! */ , (Interpolator)var31_44, var56_71, var32_45);
lbl272:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var7_7 = 0.0f;
                var57_72 = null;
                var23_34 /* !! */  = var6_6;
                var26_39 /* !! */  = var1_1;
                var28_41 /* !! */  = var46_64;
                var31_44 = var37_52;
                var55_70 = var32_45;
                var32_45 = 0.0f;
                var6_6 = new Bo1(var1_1, var46_64, (Object)var29_42 /* !! */ , (Interpolator)var37_52, var55_70, null);
                ** while (true)
                var15_18 /* !! */  = var43_62;
                var6_6.o = var43_62;
                var18_24 /* !! */  = var42_61;
                var6_6.p = var42_61;
                return var6_6;
            }
            var37_53 = var9_9 /* !! */ ;
            var38_55 = var10_10 /* !! */ ;
            if (!var4_4) break block58;
            var0.b();
            var39_57 = 0.0f;
            var9_9 /* !! */  = null;
            var40_59 = 0.0f;
            var10_10 /* !! */  = null;
            var36_51 = 0;
            var35_49 /* !! */  = null;
            var11_12 = 0.0f;
            var12_14 = null;
            var16_21 = false;
            var17_23 = 0.0f;
            var18_25 = null;
            var19_27 = false;
            var20_29 = null;
            var21_31 = null;
            var58_75 = null;
            block31: while (var13_16 = var0.k()) {
                var15_19 = var38_55;
                var22_33 = var6_6.C(var38_55);
                var24_36 = 1065353216;
                var25_38 = 1.0f;
                switch (var22_33) {
                    default: {
                        var0.H();
lbl317:
                        // 10 sources

                        while (true) {
                            var38_55 = var15_19;
                            continue block31;
                            break;
                        }
                    }
                    case 7: {
                        var21_31 = Xm1.b((gm1_0)var6_6, var7_7);
                        ** GOTO lbl317
                    }
                    case 6: {
                        var20_29 = Xm1.b((gm1_0)var6_6, var7_7);
                        ** GOTO lbl317
                    }
                    case 5: {
                        var36_51 = var0.u();
                        var22_33 = 1;
                        if (var36_51 != var22_33) ** GOTO lbl332
                        var36_51 = 1;
                        ** GOTO lbl317
lbl332:
                        // 1 sources

                        var36_51 = 0;
                        var35_49 /* !! */  = null;
                        ** GOTO lbl317
                    }
                    case 4: {
                        var22_33 = 1;
                        var10_10 /* !! */  = Xm1.b((gm1_0)var6_6, var25_38);
                        ** GOTO lbl317
                    }
                    case 3: {
                        var22_33 = 1;
                        var18_25 = Xm1.b((gm1_0)var6_6, var25_38);
                        ** GOTO lbl317
                    }
                    case 2: {
                        var22_33 = 1;
                        var58_75 = var8_8.a((gm1_0)var6_6, var7_7);
                        ** GOTO lbl317
                    }
                    case 1: {
                        var22_33 = 1;
                        var9_9 /* !! */  = var8_8.a((gm1_0)var6_6, var7_7);
                        ** GOTO lbl317
                    }
                    case 0: 
                }
                var22_33 = 1;
                var51_68 = var0.p();
                var11_12 = (float)var51_68;
                ** continue;
            }
            var0.d();
            if (var36_51 != 0) {
                var10_10 /* !! */  = var9_9 /* !! */ ;
lbl359:
                // 2 sources

                while (true) {
                    var35_49 /* !! */  = var37_53;
                    break;
                }
            } else if (var18_25 != null && var10_10 /* !! */  != null) {
                var6_6 = Eo1.a(var18_25, (PointF)var10_10 /* !! */ );
                var35_49 /* !! */  = var6_6;
                var10_10 /* !! */  = var58_75;
            } else {
                var10_10 /* !! */  = var58_75;
                ** continue;
            }
            var57_73 = var6_6;
            var8_8 = var1_1;
            var6_6 = new Bo1(var1_1, (Object)var9_9 /* !! */ , (Object)var10_10 /* !! */ , (Interpolator)var35_49 /* !! */ , var11_12, null);
            var6_6.o = var20_29;
            var6_6.p = var21_31;
            return var6_6;
        }
        var6_6 = var8_8.a((gm1_0)var6_6, var7_7);
        var57_74 = new Bo1(var6_6);
        return var57_74;
    }
}

