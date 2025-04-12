/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class ME {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void a(Function0 var0, LP1 var1_1, boolean var2_2, wr1_1 var3_3, rl0_0 var4_4, i13 var5_5, nz var6_6, ol0 var7_7, mk2_0 var8_8, u10 var9_9, b30_0 var10_10, int var11_11, int var12_12) {
        block53: {
            block49: {
                block52: {
                    block51: {
                        block50: {
                            var13_13 = var7_7;
                            var14_14 = var9_9;
                            var15_15 = var11_11;
                            var16_16 = var12_12;
                            var17_17 = 8;
                            var18_18 = 1.1E-44f;
                            var19_19 = 256;
                            var20_20 = 4;
                            var21_21 = 5.6E-45f;
                            var22_22 = 2;
                            var23_23 = 2.8E-45f;
                            var24_24 = -2116133464;
                            var25_25 = var10_10;
                            var26_26 = var10_10.g(var24_24);
                            var27_27 = var11_11 & 6;
                            if (var27_27 == 0) {
                                var25_25 = var0;
                                var28_28 = (int)var26_26.x(var0);
                                var28_28 = var28_28 != 0 ? 4 : 2;
                                var28_28 |= var15_15;
                            } else {
                                var25_25 = var0;
                                var28_28 = var11_11;
                            }
                            var29_29 = var16_16 & 2;
                            if (var29_29 != 0) {
                                var28_28 |= 48;
                                while (true) {
                                    var30_31 = var1_1;
                                    break;
                                }
                            } else {
                                if ((var31_30 = var15_15 & 48) != 0) ** continue;
                                var30_31 = var1_1;
                                var32_32 = (int)var26_26.J(var1_1);
                                var32_32 = var32_32 != 0 ? 32 : 16;
                                var28_28 |= var32_32;
                            }
                            var32_32 = var16_16 & 4;
                            if (var32_32 != 0) {
                                var28_28 |= 384;
                                while (true) {
                                    var20_20 = (int)var2_2;
                                    break;
                                }
                            } else {
                                if ((var20_20 = var15_15 & 384) != 0) ** continue;
                                var20_20 = (int)var2_2;
                                var33_33 = (int)var26_26.a(var2_2);
                                var33_33 = var33_33 != 0 ? 256 : 128;
                                var28_28 |= var33_33;
                            }
                            var33_33 = var16_16 & 8;
                            if (var33_33 != 0) {
                                var28_28 |= 3072;
                                while (true) {
                                    var34_34 = var3_3;
                                    break;
                                }
                            } else {
                                if ((var17_17 = var15_15 & 3072) != 0) ** continue;
                                var34_34 = var3_3;
                                var35_35 = var26_26.J(var3_3);
                                var35_35 = var35_35 != 0 ? 2048 : 1024;
                                var28_28 |= var35_35;
                            }
                            var22_22 = var15_15 & 24576;
                            if (var22_22 != 0) break block49;
                            var22_22 = var16_16 & 16;
                            if (var22_22 != 0) break block50;
                            var36_36 = var4_4;
                            var37_37 = (int)var26_26.J(var4_4);
                            if (var37_37 == 0) break block51;
                            var37_37 = 16384;
                            break block52;
                        }
                        var36_36 = var4_4;
                    }
                    var37_37 = 8192;
                }
                var28_28 |= var37_37;
                break block53;
            }
            var36_36 = var4_4;
        }
        var37_37 = var15_15 & 196608;
        if (var37_37 == 0) {
            var37_37 = var16_16 & 32;
            var38_38 = var5_5;
            if (var37_37 == 0 && (var39_39 = (int)var26_26.J(var5_5)) != 0) {
                var39_39 = 131072;
                var40_40 = 1.83671E-40f;
            } else {
                var39_39 = 65536;
                var40_40 = 9.1835E-41f;
            }
            var28_28 |= var39_39;
        } else {
            var38_38 = var5_5;
        }
        var39_39 = var16_16 & 64;
        var41_41 = 0x180000;
        if (var39_39 != 0) {
            var28_28 |= var41_41;
            var42_42 = var6_6;
        } else {
            var41_41 = var15_15 & var41_41;
            var42_42 = var6_6;
            if (var41_41 == 0) {
                var43_43 = (int)var26_26.J(var6_6);
                var43_43 = var43_43 != 0 ? 0x100000 : 524288;
                var28_28 |= var43_43;
            }
        }
        var43_43 = var15_15 & 0xC00000;
        if (var43_43 == 0) {
            var43_43 = (int)var26_26.J(var13_13);
            var43_43 = var43_43 != 0 ? 0x800000 : 0x400000;
            var28_28 |= var43_43;
        }
        var43_43 = 0x6000000;
        if ((var19_19 &= var16_16) != 0) {
            var28_28 |= var43_43;
            var44_44 = var8_8;
        } else {
            var43_43 = var15_15 & var43_43;
            var44_44 = var8_8;
            if (var43_43 == 0) {
                var45_45 = (int)var26_26.J(var8_8);
                var45_45 = var45_45 != 0 ? 0x4000000 : 0x2000000;
                var28_28 |= var45_45;
            }
        }
        var45_45 = 0x30000000;
        var46_46 = var15_15 & var45_45;
        if (var46_46 == 0) {
            var46_46 = (int)var26_26.x(var14_14);
            var46_46 = var46_46 != 0 ? 0x20000000 : 0x10000000;
            var28_28 |= var46_46;
        }
        var46_46 = 306783379;
        var47_47 = var28_28 & var46_46;
        var17_17 = 306783378;
        var18_18 = 6.3469493E-28f;
        if (var47_47 == var17_17 && (var47_47 = (int)var26_26.h()) != 0) {
            var26_26.D();
            var48_48 = var8_8;
            var25_25 = var42_42;
            var49_49 = var30_31;
            var42_42 = var36_36;
            var36_36 = var3_3;
        } else {
            var26_26.r0();
            var47_47 = 1;
            var17_17 = var15_15 & 1;
            var44_44 = b30$a.a;
            var20_20 = 0;
            var21_21 = 0.0f;
            var50_50 = null;
            var46_46 = -458753;
            var51_51 = -57345;
            var52_52 = null;
            if (var17_17 != 0 && (var17_17 = (int)var26_26.c0()) == 0) {
                var26_26.D();
                var18_18 = 2.2E-44f;
                var17_17 = 16 & var16_16;
                if (var17_17 != 0) {
                    var28_28 &= var51_51;
                }
                var18_18 = 4.5E-44f;
                var17_17 = 32 & var16_16;
                if (var17_17 != 0) {
                    var28_28 &= var46_46;
                }
                var19_19 = (int)var2_2;
                var50_50 = var3_3;
                var34_34 = var30_31;
lbl158:
                // 2 sources

                while (true) {
                    var30_31 = var8_8;
                    break;
                }
            } else {
                if (var29_29 != 0) {
                    var30_31 = var34_34 = LP1$a.b;
                }
                var43_43 = var32_32 != 0 ? 1 : (int)var2_2;
                if (var33_33 != 0) {
                    var17_17 = 0;
                    var34_34 = null;
                    var18_18 = 0.0f;
lbl168:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var34_34 = var3_3;
                ** continue;
                var29_29 = 16;
                var53_53 = 2.2E-44f;
                if ((var29_29 &= var16_16) != 0) {
                    var36_36 = GE.a;
                    var22_22 = 2;
                    var23_23 = var22_22;
                    var29_29 = 8;
                    var53_53 = var29_29;
                    var1_1 = var34_34;
                    var18_18 = (float)false;
                    var20_20 = 4;
                    var21_21 = var20_20;
                    var32_32 = (int)var26_26.b(var23_23);
                    var54_55 = var26_26.b(var53_53);
                    var32_32 |= var54_55;
                    var54_55 = (int)var26_26.b(var18_18);
                    var32_32 |= var54_55;
                    var54_55 = (int)var26_26.b(var21_21);
                    var32_32 |= var54_55;
                    var54_55 = (int)var26_26.b(var21_21);
                    var42_42 = var26_26.v();
                    if ((var32_32 |= var54_55) != 0 || var42_42 == var44_44) {
                        var55_54 = var42_42;
                        var42_42 = new rl0_0(var23_23, var53_53, var18_18, var21_21, var21_21);
                        var26_26.o(var42_42);
                    }
                    var34_34 = var42_42;
                    var34_34 = (rl0_0)var42_42;
                    var28_28 &= var51_51;
                    var36_36 = var34_34;
lbl201:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var1_1 = var34_34;
                ** continue;
                var17_17 = 32;
                var18_18 = 4.5E-44f;
                if ((var17_17 &= var16_16) != 0) {
                    var34_34 = B13.a;
                    var34_34 = ((A13)var26_26.j((H30)var34_34)).a;
                    var20_20 = var28_28 & var46_46;
                    var38_38 = var34_34;
                    var28_28 = var20_20;
                }
                if (var39_39 != 0) {
                    var17_17 = 0;
                    var34_34 = null;
                    var18_18 = 0.0f;
                } else {
                    var34_34 = var6_6;
                }
                if (var19_19 != 0) {
                    var49_49 = GE.a;
                    var50_50 = var1_1;
                    var42_42 = var34_34;
                    var34_34 = var30_31;
                    var30_31 = var49_49;
                    var19_19 = var43_43;
                } else {
                    var50_50 = var1_1;
                    var42_42 = var34_34;
                    var34_34 = var30_31;
                    var19_19 = var43_43;
                    ** continue;
                }
            }
            var26_26.U();
            if (var50_50 == null) {
                var29_29 = 1050577827;
                var53_53 = 0.3096591f;
                var26_26.K(var29_29);
                var56_56 = var26_26.v();
                if (var56_56 == var44_44) {
                    var56_56 = new xr1_1();
                    var26_26.o(var56_56);
                }
                var56_56 = (wr1_1)var56_56;
                var47_47 = 0;
                var44_44 = null;
                var26_26.T(false);
            } else {
                var47_47 = 0;
                var44_44 = null;
                var29_29 = -243205708;
                var53_53 = -1.2773105E30f;
                var26_26.K(var29_29);
                var26_26.T(false);
                var56_56 = var50_50;
            }
            var47_47 = var28_28 >> 6;
            var1_1 = var50_50;
            var50_50 = var13_13.b((boolean)var19_19, (b30_0)var26_26);
            var25_25 = HE.c;
            var15_15 = 0;
            var25_25 = CY2.b((LP1)var34_34, false, (Function1)var25_25);
            var48_48 = (OX)var13_13.a((boolean)var19_19, (b30_0)var26_26).getValue();
            var57_57 = var48_48.a;
            var59_58 = var50_50.getValue();
            var55_54 = var34_34;
            var34_34 = var59_58;
            var34_34 = (OX)var59_58;
            var60_59 = var57_57;
            var57_57 = var34_34.a;
            var17_17 = 1065353216;
            var18_18 = 1.0f;
            var62_60 = OX.b(var57_57, var18_18);
            if (var36_36 == null) {
                var26_26.K(1050984484);
                var17_17 = 0;
                var18_18 = 0.0f;
                var34_34 = null;
lbl275:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var17_17 = 0;
            var18_18 = 0.0f;
            var34_34 = null;
            var26_26.K(-243191939);
            var15_15 = var47_47 & 910;
            var52_52 = var36_36.a((boolean)var19_19, (wr1_1)var56_56, (b30_0)var26_26, var15_15);
            ** continue;
            var26_26.T(false);
            var34_34 = var52_52;
            if (var52_52 != null) {
                var34_34 = (xs0_0)var52_52.b.getValue();
                var18_18 = var34_34.a;
lbl289:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var17_17 = 0;
            var34_34 = null;
            var18_18 = (float)false;
            ** continue;
            var40_40 = var18_18;
            var34_34 = new ke_0((ib3_0)var50_50, (mk2_0)var30_31, var14_14);
            var21_21 = 1.054375E-38f;
            var64_61 = v10.c(7524271, (fx0_2)var34_34, (b30_0)var26_26);
            var17_17 = var28_28 & 14 | var45_45;
            var20_20 = var28_28 & 896;
            var47_47 = var47_47 & 7168 | (var17_17 |= var20_20);
            var18_18 = 5.142788E-39f;
            var17_17 = 0x380000 & var28_28;
            var46_46 = var47_47 | var17_17;
            var51_51 = 0;
            var65_62 = var0;
            var50_50 = var56_56;
            var56_56 = var25_25;
            var44_44 = var30_31;
            var31_30 = var19_19;
            var59_58 = var38_38;
            jg3_0.b(var0, (LP1)var25_25, (boolean)var19_19, (i13)var38_38, var60_59, var62_60, (nz)var42_42, var40_40, (wr1_1)var50_50, var64_61, (b30_0)var26_26, var46_46, 0);
            var48_48 = var30_31;
            var20_20 = var19_19;
            var25_25 = var42_42;
            var49_49 = var55_54;
            var42_42 = var36_36;
            var36_36 = var1_1;
        }
        var65_62 = var26_26.X();
        if (var65_62 != null) {
            var44_44 = var56_56;
            var34_34 = var0;
            var26_26 = var25_25;
            var13_13 = var7_7;
            var25_25 = var48_48;
            var14_14 = var9_9;
            var15_15 = var11_11;
            var16_16 = var12_12;
            var56_56 = new LE(var0, (LP1)var49_49, (boolean)var20_20, (wr1_1)var36_36, (rl0_0)var42_42, (i13)var38_38, (nz)var26_26, var7_7, (mk2_0)var48_48, var9_9, var11_11, var12_12);
            var65_62.d = var56_56;
        }
    }

    public static final void b(Function0 function0, LP1 lP1, boolean bl2, rp2_0 rp2_02, nz nz4, ol0 ol02, nk2_0 nk2_02, u10 u102, b30_0 b30_02, int n3, int n4) {
        nk2_0 nk2_03;
        Object object;
        boolean bl3;
        int n7 = n4;
        int n8 = n4 & 4;
        if (n8 != 0) {
            n8 = 1;
            bl3 = true;
        } else {
            bl3 = bl2;
        }
        n8 = n7 & 0x80;
        if (n8 != 0) {
            long l2 = 0L;
            long l3 = 0L;
            int n10 = 7;
            object = b30_02;
            ol0 ol03 = GE.b(l2, l3, b30_02, n10);
            object = ol03;
        } else {
            object = ol02;
        }
        nk2_0 nk2_04 = (n7 &= 0x100) != 0 ? (nk2_03 = GE.a) : nk2_02;
        int n14 = n3 & 0x7FFFFFFE;
        ME.a(function0, lP1, bl3, null, null, rp2_02, nz4, (ol0)object, nk2_04, u102, b30_02, n14, 0);
    }
}

