/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.f;
import kotlin.jvm.functions.Function2;

public final class IK1 {
    /*
     * Unable to fully structure code
     */
    public static final void a(lZ var0, At3 var1_1, A13 var2_2, u10 var3_3, b30_0 var4_4, int var5_5) {
        block28: {
            block27: {
                var6_6 = var0;
                var7_7 = var1_1;
                var8_8 = var2_2;
                var9_9 = var3_3;
                var10_10 = var5_5;
                var11_11 = 7;
                var12_12 = 9.8E-45f;
                var13_13 = 0;
                var14_14 = null;
                var15_15 = 2;
                var16_16 = 4;
                var17_17 = 1;
                var18_18 = -7276292.5f;
                var19_19 = var4_4;
                var20_20 = var4_4.g(-891417079);
                var21_21 = 6;
                var22_22 = var5_5 & 6;
                if (var22_22 == 0) {
                    var22_22 = (int)var20_20.J(var0);
                    if (var22_22 != 0) {
                        var22_22 = 4;
                        var18_18 = 5.6E-45f;
                    } else {
                        var22_22 = 2;
                        var18_18 = 2.8E-45f;
                    }
                    var22_22 |= var10_10;
                } else {
                    var22_22 = var5_5;
                }
                var23_23 = var10_10 & 48;
                if (var23_23 == 0) {
                    var23_23 = (int)var20_20.J(var7_7);
                    var23_23 = var23_23 != 0 ? 32 : 16;
                    var22_22 |= var23_23;
                }
                if ((var23_23 = var10_10 & 384) == 0) {
                    var23_23 = (int)var20_20.J(var8_8);
                    var23_23 = var23_23 != 0 ? 256 : 128;
                    var22_22 |= var23_23;
                }
                if ((var23_23 = var10_10 & 3072) == 0) {
                    var23_23 = (int)var20_20.x(var9_9);
                    var23_23 = var23_23 != 0 ? 2048 : 1024;
                    var22_22 |= var23_23;
                }
                if ((var22_22 &= 1171) != (var23_23 = 1170) || (var22_22 = (int)var20_20.h()) == 0) break block27;
                var20_20.D();
                var6_6 = var20_20;
                var24_24 = var9_9;
                var20_20 = var7_7;
                break block28;
            }
            var20_20.r0();
            var22_22 = var10_10 & 1;
            if (var22_22 != 0 && (var22_22 = (int)var20_20.c0()) == 0) {
                var20_20.D();
            }
            var20_20.U();
            var25_25 = var20_20.v();
            var26_26 = b30$a.a;
            if (var25_25 == var26_26) {
                var27_27 = 0L;
                var29_28 = 0L;
                var31_29 = 0L;
                var33_30 = 0L;
                var35_31 = 0L;
                var37_32 = 0L;
                var39_33 = var26_26;
                var40_34 = var37_32;
                var42_35 = 0L;
                var44_36 = 0.0;
                var46_37 = 0L;
                var48_38 = 8191;
                var49_39 = 1.1478E-41f;
                var6_6 = var0;
                var25_25 = lZ.a((lZ)var0, var31_29, var33_30, var35_31, var37_32, var37_32, var37_32, var37_32, var37_32, var42_35, var46_37, var27_27, var29_28, var48_38);
                var6_6 = var20_20;
                var20_20.o(var25_25);
            } else {
                var39_33 = var26_26;
                var6_6 = var20_20;
            }
            var25_25 = (lZ)var25_25;
            var19_19 = mz_0.a;
            var50_40 = var0.f();
            var24_24 = var25_25.a;
            var52_41 = new OX(var50_40);
            var24_24.setValue(var52_41);
            var14_14 = var0;
            var50_40 = ((OX)var0.b.getValue()).a;
            var24_24 = new OX(var50_40);
            var25_25.b.setValue(var24_24);
            var50_40 = var0.g();
            var24_24 = new OX(var50_40);
            var25_25.c.setValue(var24_24);
            var50_40 = ((OX)var0.d.getValue()).a;
            var24_24 = new OX(var50_40);
            var25_25.d.setValue(var24_24);
            var50_40 = var0.b();
            var24_24 = new OX(var50_40);
            var25_25.e.setValue(var24_24);
            var50_40 = var0.h();
            var24_24 = new OX(var50_40);
            var25_25.f.setValue(var24_24);
            var50_40 = var0.c();
            var24_24 = new OX(var50_40);
            var25_25.g.setValue(var24_24);
            var50_40 = ((OX)var0.h.getValue()).a;
            var24_24 = new OX(var50_40);
            var25_25.h.setValue(var24_24);
            var50_40 = ((OX)var0.i.getValue()).a;
            var24_24 = new OX(var50_40);
            var25_25.i.setValue(var24_24);
            var50_40 = var0.d();
            var24_24 = new OX(var50_40);
            var25_25.j.setValue(var24_24);
            var50_40 = var0.e();
            var24_24 = new OX(var50_40);
            var25_25.k.setValue(var24_24);
            var50_40 = ((OX)var0.l.getValue()).a;
            var24_24 = new OX(var50_40);
            var25_25.l.setValue(var24_24);
            var19_19 = var0.i();
            var25_25.m.setValue(var19_19);
            var53_42 = null;
            var54_43 = 0L;
            var56_44 = 0.0;
            var23_23 = 0;
            var26_26 = null;
            var58_45 = 7;
            var19_19 = vp2_0.a(false, 0.0f, var54_43, (b30_0)var6_6, 0, var58_45);
            var33_30 = var25_25.f();
            var35_31 = var25_25.b();
            var59_46 = 1102762072;
            var6_6.K(var59_46);
            var40_34 = mz_0.a((lZ)var25_25, var35_31);
            var60_47 = 16;
            var62_48 = 7.9E-323;
            var11_11 = var40_34 == var60_47 ? 0 : (var40_34 < var60_47 ? -1 : 1);
            if (var11_11 != 0) lbl-1000:
            // 2 sources

            {
                while (true) {
                    continue;
                    break;
                }
            }
            var26_26 = w60_0.a;
            var26_26 = (OX)var6_6.j((H30)var26_26);
            var40_34 = var26_26.a;
            ** while (true)
            var64_49 = 0;
            var7_7 = null;
            var6_6.T(false);
            var20_20 = w60_0.a;
            var20_20 = (OX)var6_6.j((H30)var20_20);
            var60_47 = var20_20.a;
            var65_50 = mz_0.a;
            var65_50 = (lZ)var6_6.j((H30)var65_50);
            var11_11 = (int)var65_50.i();
            var42_35 = 4602678819172646912L;
            var44_36 = 0.5;
            if (var11_11 != 0 ? (var11_11 = (int)((cfr_temp_0 = (var62_48 = (double)(var66_51 = zx_0.h(var60_47))) - var44_36) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1))) > 0 : (var11_11 = (int)((cfr_temp_1 = (var62_48 = (double)(var66_51 = zx_0.h(var60_47))) - var44_36) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1))) < 0) {
                var67_52 = 1060991140;
                var66_51 = 0.74f;
            } else {
                var67_52 = 1058642330;
                var66_51 = 0.6f;
            }
            var40_34 = OX.b(var40_34, var66_51);
            var67_52 = (int)var6_6.d(var33_30);
            var10_10 = (int)var6_6.d(var35_31);
            var67_52 |= var10_10;
            var10_10 = (int)var6_6.d(var40_34);
            var68_53 = var6_6.v();
            var69_54 = 1.0f;
            if ((var67_52 |= var10_10) != 0) ** GOTO lbl-1000
            var20_20 = var39_33;
            if (var68_53 != var39_33) {
                var4_4 = var25_25;
                var70_55 = var19_19;
                var13_13 = 7;
            } else lbl-1000:
            // 2 sources

            {
                var60_47 = var25_25.f();
                var4_4 = var25_25;
                var70_55 = var19_19;
                var31_29 = var60_47;
                var60_47 = var33_30;
                var71_56 = var8_8;
                var72_57 = EK1.a(var33_30, 0.4f, var40_34, var35_31);
                var12_12 = 0.2f;
                var66_51 = EK1.a(var33_30, var12_12, var40_34, var35_31);
                var10_10 = 1053609165;
                var73_58 = 0.4f;
                var74_59 = 4.5f;
                cfr_temp_2 = var72_57 - var74_59;
                var11_11 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                if (var11_11 >= 0) {
                    var13_13 = 7;
                } else {
                    var11_11 = 1045220557;
                    var12_12 = 0.2f;
                    var67_52 = var66_51 == var74_59 ? 0 : (var66_51 < var74_59 ? -1 : 1);
                    if (var67_52 < 0) {
                        var13_13 = 7;
                        var10_10 = 1045220557;
                        var73_58 = 0.2f;
                    } else {
                        block26: {
                            var75_60 = 7;
                            var64_49 = 0;
                            var7_7 = null;
                            var72_57 = 0.4f;
                            var76_61 = 0.4f;
                            var48_38 = 1045220557;
                            var49_39 = 0.2f;
                            while (var64_49 < var75_60) {
                                var60_47 = var33_30;
                                var12_12 = var72_57;
                                var13_13 = 7;
                                var77_62 = var64_49;
                                var66_51 = EK1.a(var33_30, var72_57, var40_34, var35_31) / var74_59 - var69_54;
                                var10_10 = 0;
                                var73_58 = 0.0f;
                                var68_53 = null;
                                cfr_temp_3 = 0.0f - var66_51;
                                var11_11 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                                if (var11_11 > 0 || (var11_11 = (int)((cfr_temp_4 = var66_51 - (var12_12 = 0.01f)) == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1))) > 0) {
                                    cfr_temp_5 = var66_51 - 0.0f;
                                    var67_52 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1);
                                    if (var67_52 < 0) {
                                        var76_61 = var72_57;
                                    } else {
                                        var49_39 = var72_57;
                                    }
                                    var66_51 = var76_61 + var49_39;
                                    var10_10 = 0x40000000;
                                    var73_58 = 2.0f;
                                    var72_57 = var66_51 / var73_58;
                                    var64_49 = var77_62 + 1;
                                    var75_60 = 7;
                                    var14_14 = var0;
                                    continue;
                                }
                                break block26;
                            }
                            var13_13 = 7;
                        }
                        var73_58 = var72_57;
                    }
                }
                var33_30 = OX.b(var33_30, var73_58);
                var52_41 = var71_56;
                var71_56(var31_29, var33_30);
                var6_6.o(var71_56);
                var68_53 = var71_56;
            }
            var68_53 = (sm3)var68_53;
            var25_25 = mz_0.a;
            var19_19 = var4_4;
            var19_19 = var25_25.c(var4_4);
            var53_42 = s60_0.a;
            var24_24 = w60_0.a;
            var24_24 = (OX)var6_6.j((H30)var24_24);
            var54_43 = var24_24.a;
            var25_25 = (lZ)var6_6.j((H30)var25_25);
            var22_22 = (int)var25_25.i();
            if (!(var22_22 != 0 ? (var22_22 = (int)((cfr_temp_6 = (var56_44 = (double)(var18_18 = zx_0.h(var54_43))) - var44_36) == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1))) > 0 : (var22_22 = (int)((cfr_temp_7 = (var56_44 = (double)(var18_18 = zx_0.h(var54_43))) - var44_36) == 0.0 ? 0 : (cfr_temp_7 < 0.0 ? -1 : 1))) < 0)) {
                var69_54 = 0.87f;
            }
            var25_25 = Float.valueOf(var69_54);
            var25_25 = var53_42.c(var25_25);
            var53_42 = f.a;
            var24_24 = var70_55;
            var53_42 = var53_42.c(var70_55);
            var24_24 = AP2.a;
            var52_41 = s00.a;
            var24_24 = var24_24.c(var52_41);
            var52_41 = B13.a.c(var2_2);
            var26_26 = tm3.a.c(var68_53);
            var78_63 = Bt3.b;
            var20_20 = var1_1;
            var78_63 = var78_63.c(var1_1);
            var14_14 = new MB2[var13_13];
            var14_14[0] = var19_19;
            var14_14[var17_17] = var25_25;
            var14_14[var15_15] = var53_42;
            var14_14[3] = var24_24;
            var14_14[var16_16] = var52_41;
            var22_22 = 5;
            var18_18 = 7.0E-45f;
            var14_14[var22_22] = var26_26;
            var14_14[var21_21] = var78_63;
            var24_24 = var3_3;
            var25_25 = new gk1_0(var1_1, var3_3);
            var25_25 = v10.c(-1740102967, (fx0_2)var25_25, (b30_0)var6_6);
            var23_23 = 56;
            L30.b(var14_14, (Function2)var25_25, (b30_0)var6_6, var23_23);
        }
        var26_26 = var6_6.X();
        if (var26_26 != null) {
            var6_6 = var78_63;
            var25_25 = var0;
            var19_19 = var1_1;
            var53_42 = var2_2;
            var24_24 = var3_3;
            var78_63 = new hk1_0((lZ)var0, var1_1, var2_2, var3_3, var5_5);
            var26_26.d = var78_63;
        }
    }
}

