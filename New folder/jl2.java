/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public final class jl2 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void a(hm0_0 var0, LP1 var1_1, mk2_0 var2_2, ok2_0 var3_3, int var4_4, float var5_5, Nc$c var6_6, pi3_0 var7_7, boolean var8_8, boolean var9_9, Function1 var10_10, oU1 var11_11, t83 var12_12, u10 var13_13, b30_0 var14_14, int var15_15, int var16_16, int var17_17) {
        var18_18 = var0;
        var19_19 = var15_15;
        var20_20 = var16_16;
        var21_21 = var17_17;
        var22_22 = var14_14.g(1870896258);
        var23_23 = var15_15 & 6;
        if (var23_23 == 0) {
            var23_23 = (int)var22_22.J(var0);
            var23_23 = var23_23 != 0 ? 4 : 2;
            var23_23 |= var19_19;
        } else {
            var23_23 = var15_15;
        }
        var24_24 = var21_21 & 2;
        if (var24_24 != 0) {
            var23_23 |= 48;
            while (true) {
                var25_26 = var1_1;
                break;
            }
        } else {
            if ((var26_25 = var19_19 & 48) != 0) ** continue;
            var25_26 = var1_1;
            var27_27 = (int)var22_22.J(var1_1);
            var27_27 = var27_27 != 0 ? 32 : 16;
            var23_23 |= var27_27;
        }
        var27_27 = var23_23 | 384;
        var28_28 = var21_21 & 8;
        if (var28_28 != 0) {
            var27_27 = var23_23 | 3456;
            while (true) {
                var29_29 = var3_3;
                break;
            }
        } else {
            if ((var23_23 = var19_19 & 3072) != 0) ** continue;
            var29_29 = var3_3;
            var30_30 = (int)var22_22.J(var3_3);
            if (var30_30 != 0) {
                var30_30 = 2048;
                var31_31 = 2.87E-42f;
            } else {
                var30_30 = 1024;
                var31_31 = 1.435E-42f;
            }
            var27_27 |= var30_30;
        }
        var30_30 = var21_21 & 16;
        if (var30_30 != 0) {
            var27_27 |= 24576;
            while (true) {
                var32_32 = var4_4;
                break;
            }
        } else {
            if ((var32_32 = var19_19 & 24576) != 0) ** continue;
            var32_32 = var4_4;
            var33_33 = (int)var22_22.c(var4_4);
            var33_33 = var33_33 != 0 ? 16384 : 8192;
            var27_27 |= var33_33;
        }
        var33_33 = var21_21 & 32;
        var34_34 = 196608;
        if (var33_33 != 0) {
            var27_27 |= var34_34;
            var35_35 = var5_5;
        } else {
            var36_36 = var19_19 & var34_34;
            var35_35 = var5_5;
            if (var36_36 == 0) {
                var36_36 = (int)var22_22.b(var5_5);
                var36_36 = var36_36 != 0 ? 131072 : 65536;
                var27_27 |= var36_36;
            }
        }
        var36_36 = var21_21 & 64;
        var37_37 = 0x180000;
        if (var36_36 != 0) {
            var27_27 |= var37_37;
            var38_38 = var6_6;
        } else {
            var37_37 = var19_19 & var37_37;
            var38_38 = var6_6;
            if (var37_37 == 0) {
                var39_39 = (int)var22_22.J(var6_6);
                var39_39 = var39_39 != 0 ? 0x100000 : 524288;
                var27_27 |= var39_39;
            }
        }
        var39_39 = var19_19 & 0xC00000;
        if (var39_39 == 0) {
            var40_40 = var21_21 & 128;
            var41_41 = var40_40 == 0 && (var41_41 = (int)var22_22.J(var7_7)) != 0 ? 0x800000 : 0x400000;
            var27_27 |= var41_41;
        }
        var23_23 = var21_21 & 256;
        var41_41 = 0x6000000;
        if (var23_23 != 0) {
            var27_27 |= var41_41;
            var40_40 = var8_8;
        } else {
            var41_41 = var19_19 & var41_41;
            var40_40 = var8_8;
            if (var41_41 == 0) {
                var41_41 = (int)var22_22.a((boolean)var8_8);
                var41_41 = var41_41 != 0 ? 0x4000000 : 0x2000000;
                var27_27 |= var41_41;
            }
        }
        var27_27 |= 0x30000000;
        var41_41 = var20_20 | 6;
        var42_42 = var20_20 & 48;
        if (var42_42 == 0) {
            var41_41 = var20_20 | 22;
        }
        var40_40 = var41_41;
        var40_40 = var41_41 | 384;
        var26_25 = var20_20 & 3072;
        if (var26_25 == 0) {
            var25_26 = var13_13;
            var42_42 = (int)var22_22.x(var13_13);
            var37_37 = var42_42 != 0 ? 2048 : 1024;
            var40_40 |= var37_37;
        } else {
            var25_26 = var13_13;
        }
        var37_37 = 306783379;
        var26_25 = var27_27 & var37_37;
        var43_43 = 306783378;
        var35_35 = 6.3469493E-28f;
        if (var26_25 != var43_43) ** GOTO lbl-1000
        var26_25 = var40_40 & 1171;
        var43_43 = 1170;
        var35_35 = 1.64E-42f;
        if (var26_25 == var43_43 && (var26_25 = (int)var22_22.h()) != 0) {
            var22_22.D();
            var44_44 = var1_1;
            var25_26 = var2_2;
            var45_45 /* !! */  = var3_3;
            var35_35 = var5_5;
            var46_46 = var7_7;
            var33_33 = (int)var9_9;
            var47_47 = var11_11;
            var48_48 = var12_12;
            var28_28 = var32_32;
            var49_49 = var22_22;
            var32_32 = var8_8;
            var22_22 = var10_10;
        } else lbl-1000:
        // 2 sources

        {
            var22_22.r0();
            var26_25 = var19_19 & 1;
            var43_43 = -29360129;
            var35_35 = -6.380294E37f;
            if (var26_25 != 0 && (var26_25 = (int)var22_22.c0()) == 0) {
                var22_22.D();
                var23_23 = var21_21 & 128;
                if (var23_23 != 0) {
                    var27_27 &= var43_43;
                }
                var23_23 = var40_40 & -113;
                var50_50 = var1_1;
                var51_51 = var2_2;
                var52_52 = var3_3;
                var53_53 = var5_5;
                var54_54 = var7_7;
                var55_55 = var8_8;
                var56_56 = var9_9;
                var57_57 = var10_10;
                var58_58 = var11_11;
                var59_59 = var12_12;
                var40_40 = var27_27;
                var60_60 = var38_38;
                var61_61 = var32_32;
            } else {
                var44_44 = var24_24 != 0 ? LP1$a.b : var1_1;
                var26_25 = 0;
                var35_35 = (float)false;
                var25_26 = new nk2_0(var35_35, var35_35, var35_35, var35_35);
                var62_62 = var28_28 != 0 ? ok2$a_0.a : var3_3;
                if (var30_30 != 0) {
                    var32_32 = 0;
                }
                var43_43 = 0;
                var35_35 = 0.0f;
                var63_63 = null;
                var31_31 = var33_33 != 0 ? (float)false : var5_5;
                if (var36_36 != 0) {
                    var38_38 = Nc$a.k;
                }
                var33_33 = var21_21 & 128;
                var43_43 = 0;
                var35_35 = 0.0f;
                var63_63 = null;
                if (var33_33 != 0) {
                    var33_33 = var27_27 & 14 | var34_34;
                    var2_2 = var44_44;
                    var24_24 = 30;
                    var44_44 = yk2_0.a((hm0_0)var18_18, null, (b30_0)var22_22, var33_33, var24_24);
                    var33_33 = -29360129;
                    var27_27 &= var33_33;
                } else {
                    var2_2 = var44_44;
                    var44_44 = var7_7;
                }
                var23_23 = var23_23 != 0 ? 1 : (int)var8_8;
                var63_63 = pg2_0.Horizontal;
                var33_33 = var27_27 & 14 | 432;
                var34_34 = var33_33 & 14;
                var64_64 = var23_23;
                var23_23 = var34_34 ^ 6;
                var6_6 = var44_44;
                var24_24 = 4;
                var33_33 = var23_23 > var24_24 && (var23_23 = (int)var22_22.J(var18_18)) != 0 || (var23_23 = var33_33 & 6) == var24_24 ? 1 : 0;
                var29_29 = var22_22.v();
                if (var33_33 != 0 || var29_29 == (var44_44 = b30$a.a)) {
                    var29_29 = new Gm0((hm0_0)var18_18, var63_63);
                    var22_22.o(var29_29);
                }
                var29_29 = (Gm0)var29_29;
                var40_40 &= -113;
                var44_44 = t83$a.a;
                var50_50 = var2_2;
                var55_55 = var64_64;
                var54_54 = var6_6;
                var58_58 = var29_29;
                var23_23 = var40_40;
                var59_59 = var44_44;
                var51_51 = var25_26;
                var40_40 = var27_27;
                var52_52 = var62_62;
                var60_60 = var38_38;
                var53_53 = var31_31;
                var61_61 = var32_32;
                var56_56 = false;
                var57_57 = null;
            }
            var22_22.U();
            var45_45 /* !! */  = pg2_0.Horizontal;
            var24_24 = var40_40 >> 3 & 14 | 24576;
            var26_25 = var40_40 << 3 & 112;
            var24_24 |= var26_25;
            var26_25 = var40_40 & 896;
            var24_24 |= var26_25;
            var26_25 = var40_40 >> 18 & 7168;
            var24_24 |= var26_25;
            var26_25 = var40_40 >> 6;
            var28_28 = 458752;
            var43_43 = var26_25 & var28_28;
            var24_24 |= var43_43;
            var24_24 |= (var26_25 &= 0x380000);
            var26_25 = var40_40 << 9;
            var43_43 = 0x1C00000 & var26_25;
            var24_24 |= var43_43;
            var26_25 = var40_40 << 18 & 0x70000000;
            var34_34 = (var24_24 |= (var26_25 &= 0xE000000)) | var26_25;
            var24_24 = var23_23 << 3 & 112 | 384;
            var40_40 = var40_40 >> 9 & 7168 | var24_24;
            var24_24 = 57344 & (var23_23 <<= 6);
            var36_36 = (var40_40 |= var24_24) | (var23_23 &= var28_28);
            var29_29 = var50_50;
            var44_44 = var51_51;
            var26_25 = (int)var56_56;
            var62_62 = var54_54;
            var43_43 = var55_55;
            var31_31 = var53_53;
            var49_49 = var22_22;
            var22_22 = var57_57;
            var47_47 = var60_60;
            var48_48 = var59_59;
            var65_65 /* !! */  = var13_13;
            var18_18 = var49_49;
            qs1_0.a((LP1)var50_50, var0, (mk2_0)var51_51, var56_56, (pg2_0)var45_45 /* !! */ , (pi3_0)var54_54, (boolean)var55_55, var61_61, var53_53, var52_52, (oU1)var58_58, var57_57, var60_60, (t83)var59_59, var13_13, (b30_0)var49_49, var34_34, var36_36);
            var44_44 = var50_50;
            var25_26 = var51_51;
            var45_45 /* !! */  = var52_52;
            var28_28 = var61_61;
            var35_35 = var53_53;
            var38_38 = var60_60;
            var46_46 = var54_54;
            var32_32 = var55_55;
            var33_33 = (int)var56_56;
            var47_47 = var58_58;
        }
        var18_18 = var49_49.X();
        if (var18_18 != null) {
            var29_29 = var65_65 /* !! */ ;
            var66_66 = var65_65 /* !! */ ;
            var65_65 /* !! */  = var13_13;
            var34_34 = var16_16;
            var36_36 = var17_17;
            var29_29 = new bl2_1(var0, (LP1)var44_44, (mk2_0)var25_26, var45_45 /* !! */ , var28_28, var35_35, var38_38, (pi3_0)var46_46, (boolean)var32_32, (boolean)var33_33, (Function1)var22_22, (oU1)var47_47, (t83)var48_48, var13_13, var15_15, var16_16, var17_17);
            var29_29 = var18_18;
            var18_18.d = var66_66;
        }
    }
}

