/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from gQ2
 */
public final class gq2_0 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static bl1_0 a(eq2_0 var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, dl1_1 var6_6, List var7_7, Ns2[] var8_8, int var9_9) {
        block53: {
            block49: {
                block52: {
                    var10_10 = var0;
                    var11_14 = var1_1;
                    var12_15 = var3_3;
                    var13_16 = var4_4;
                    var14_17 = var5_5;
                    var15_18 = var7_7;
                    var16_19 = var9_9;
                    var17_20 = var5_5;
                    var19_21 /* !! */  = new int[var9_9];
                    var20_22 = 0;
                    var21_23 = 0.0f;
                    var22_24 = null;
                    var23_25 = 0;
                    var24_26 = null;
                    var25_29 = 0;
                    var26_30 = 0.0f;
                    var27_31 = 0;
                    var28_32 = 0.0f;
                    var29_33 = null;
                    var30_34 = 0;
                    var31_35 = null;
                    var32_36 = 0;
                    var33_37 = null;
                    var34_38 = 0;
                    while (true) {
                        var35_39 = 0;
                        var36_40 = 0.0f;
                        if (var23_25 >= var16_19) break;
                        var37_41 /* !! */  = var15_18.get(var23_25);
                        var38_42 = var37_41 /* !! */ ;
                        var38_42 = (xk1_0)var37_41 /* !! */ ;
                        var39_43 = dq2_0.a(var38_42);
                        var40_44 = dq2_0.b((hQ2)var39_43);
                        if (var27_31 != 0) ** GOTO lbl-1000
                        if (var39_43 != null) {
                            var39_43 = var39_43.c;
                        } else {
                            var11_14 = 0;
                            var39_43 = null;
                            var41_45 = 0.0f;
                        }
                        if (var39_43 != null) {
                            var11_14 = var39_43 instanceof je0_0.a;
                        } else {
                            var11_14 = 0;
                            var41_45 = 0.0f;
                            var39_43 = null;
                        }
                        if (var11_14 == 0) {
                            var11_14 = 0;
                            var41_45 = 0.0f;
                            var39_43 = null;
                            var27_31 = 0;
                            var28_32 = 0.0f;
                            var29_33 = null;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var11_14 = 0;
                            var41_45 = 0.0f;
                            var39_43 = null;
                            var27_31 = 1;
                            var28_32 = 1.4E-45f;
                        }
                        var35_39 = (cfr_temp_0 = var40_44 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                        if (var35_39 > 0) {
                            var21_23 += var40_44;
                            ++var25_29;
                            var42_46 = var17_20;
                            var35_39 = var27_31;
                            var36_40 = var28_32;
                        } else {
                            var11_14 = var12_15 - var30_34;
                            var33_37 = var8_8[var23_25];
                            if (var33_37 == null) {
                                var35_39 = var27_31;
                                var36_40 = var28_32;
                                var27_31 = -1 >>> 1;
                                var28_32 = 0.0f / 0.0f;
                                if (var12_15 == var27_31) {
                                    var42_46 = var17_20;
                                    var44_47 = 0;
                                    var15_18 = null;
                                    var27_31 = -1 >>> 1;
                                    var28_32 = 0.0f / 0.0f;
                                } else {
                                    if (var11_14 < 0) {
                                        var27_31 = 0;
                                        var28_32 = 0.0f;
                                        var29_33 = null;
                                    } else {
                                        var27_31 = var11_14;
                                    }
                                    var42_46 = var17_20;
                                    var44_47 = 0;
                                    var15_18 = null;
                                }
                                var45_48 = var10_10.f(0, var27_31, var13_16, false);
                                var33_37 = var38_42.Q(var45_48);
lbl93:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var42_46 = var17_20;
                            var35_39 = var27_31;
                            var36_40 = var28_32;
                            ** continue;
                            var15_18 = var33_37;
                            var16_19 = var10_10.e((Ns2)var33_37);
                            var47_49 = var10_10.d((Ns2)var33_37);
                            var19_21 /* !! */ [var23_25] = var16_19;
                            if ((var11_14 -= var16_19) < 0) {
                                var11_14 = 0;
                                var41_45 = 0.0f;
                                var39_43 = null;
                            }
                            var32_36 = Math.min(var14_17, var11_14);
                            var30_34 += (var16_19 += var32_36);
                            var11_14 = var34_38;
                            var11_14 = Math.max(var34_38, var47_49);
                            var8_8[var23_25] = var15_18;
                            var34_38 = var11_14;
                        }
                        ++var23_25;
                        var11_14 = var1_1;
                        var15_18 = var7_7;
                        var16_19 = var9_9;
                        var27_31 = var35_39;
                        var28_32 = var36_40;
                        var17_20 = var42_46;
                    }
                    var42_46 = var17_20;
                    var11_14 = var34_38;
                    if (var25_29 != 0) break block52;
                    var30_34 -= var32_36;
                    var13_16 = var1_1;
                    var22_24 = var10_10;
                    var23_25 = var34_38;
                    var37_41 /* !! */  = (E)var19_21 /* !! */ ;
                    var34_38 = var27_31;
                    var44_47 = 0;
                    var15_18 = null;
                    break block53;
                }
                var14_17 = -1 >>> 1;
                var14_17 = var12_15 != var14_17 ? var12_15 : var1_1;
                var48_50 = var25_29 + -1;
                var17_20 = var42_46 * var48_50;
                var44_47 = var14_17 - var30_34;
                var48_50 = (long)var44_47 - var17_20;
                var50_51 = 0L;
                var48_50 = f.b(var48_50, var50_51);
                var52_52 = (float)var48_50 / var21_23;
                var32_36 = var11_14;
                var53_53 = var48_50;
                var23_25 = 0;
                var24_26 = null;
                while (true) lbl-1000:
                // 2 sources

                {
                    var34_38 = var27_31;
                    var37_41 /* !! */  = (E)var19_21 /* !! */ ;
                    var55_54 = "remainingToTarget ";
                    var56_55 = "weightedSize ";
                    var39_43 = "arrangementSpacingTotal ";
                    var57_56 = "weightUnitSpace ";
                    var29_33 = "fixedSpace ";
                    var58_57 = var21_23;
                    var22_24 = "weightChildrenCount ";
                    var59_58 = "totalWeight ";
                    var19_21 /* !! */  = (int[])"arrangementSpacingPx ";
                    var60_59 = var48_50;
                    var15_18 = "targetSpace ";
                    var62_60 = "mainAxisMin ";
                    var63_61 = var9_9;
                    if (var23_25 >= var9_9) break block49;
                    var10_10 = var7_7;
                    var64_62 = dq2_0.a((xk1_0)var7_7.get(var23_25));
                    var65_63 = var39_43;
                    var41_45 = dq2_0.b((hQ2)var64_62);
                    var64_62 = var55_54;
                    var66_64 = var52_52 * var41_45;
                    var11_14 = Math.round(var66_64);
                    break;
                }
                catch (IllegalArgumentException var24_27) {
                    var33_37 = var24_27;
                    var67_65 = var66_64;
                    var13_16 = var1_1;
                    var68_67 = fQ2.a("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ", (String)var62_60, (String)var15_18, var12_15, var1_1);
                    var68_67.append(var14_17);
                    var68_67.append((String)var19_21 /* !! */ );
                    var68_67.append(var42_46);
                    var68_67.append((String)var22_24);
                    var68_67.append(var25_29);
                    var68_67.append((String)var29_33);
                    var68_67.append(var30_34);
                    var24_28 = var64_62;
                    var55_54 = var65_63;
                    fn0_2.b(var68_67, (String)var65_63, var17_20, (String)var64_62);
                    var68_67.append(var60_59);
                    var55_54 = var59_58;
                    var68_67.append((String)var59_58);
                    var66_64 = var58_57;
                    var68_67.append(var58_57);
                    var55_54 = var57_56;
                    var68_67.append((String)var57_56);
                    var68_67.append(var52_52);
                    var68_67.append("itemWeight ");
                    var68_67.append(var41_45);
                    var39_43 = var56_55;
                    var68_67.append(var56_55);
                    var52_52 = var67_65;
                    var68_67.append(var67_65);
                    var39_43 = var68_67.toString();
                    var10_10 = new IllegalArgumentException((String)var39_43);
                    var39_43 = var33_37;
                    throw var10_10.initCause((Throwable)var33_37);
                }
                {
                    var48_50 = var11_14;
                    var53_53 -= var48_50;
                    ++var23_25;
                    var10_10 = var0;
                    var13_16 = var4_4;
                    var19_21 /* !! */  = (int[])var37_41 /* !! */ ;
                    var48_50 = var60_59;
                    ** while (true)
                }
            }
            var64_62 = var55_54;
            var69_70 = var48_50;
            var13_16 = var1_1;
            var71_71 = var17_20;
            var17_20 = var42_46;
            var42_46 = var71_71;
            var65_63 = var39_43;
            var73_72 = var29_33;
            var23_25 = var32_36;
            var10_10 = null;
            var11_14 = 0;
            var41_45 = 0.0f;
            var39_43 = null;
            var27_31 = var9_9;
            var32_36 = var30_34;
            var31_35 = var7_7;
            for (var63_61 = 0; var63_61 < var27_31; ++var63_61) {
                block56: {
                    block54: {
                        block55: {
                            block51: {
                                block50: {
                                    var74_73 = var8_8[var63_61];
                                    if (var74_73 != null) break block54;
                                    var29_33 = var74_73 = var31_35.get(var63_61);
                                    var29_33 = (xk1_0)var74_73;
                                    var31_35 = dq2_0.a((Qj1)var29_33);
                                    var75_74 = var25_29;
                                    var26_30 = dq2_0.b((hQ2)var31_35);
                                    cfr_temp_1 = var26_30 - 0.0f;
                                    var76_75 /* !! */  = (float)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                    if (var76_75 /* !! */  > 0) {
                                        var76_75 /* !! */  = (float)true;
                                        var67_66 = 1.4E-45f;
                                    } else {
                                        var76_75 /* !! */  = (float)false;
                                        var67_66 = 0.0f;
                                        var77_76 = null;
                                    }
                                    if (var76_75 /* !! */  == false) break block55;
                                    var78_77 = 0L;
                                    cfr_temp_2 = var53_53 - var78_77;
                                    var76_75 /* !! */  = (float)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                    if (var76_75 /* !! */  < 0) {
                                        var76_75 /* !! */  = -1;
                                        var67_66 = 0.0f / 0.0f;
                                        var80_78 = var17_20;
                                        var77_76 = var22_24;
                                        var20_22 = -1;
                                        var21_23 = 0.0f / 0.0f;
                                    } else if (var76_75 /* !! */  > 0) {
                                        var80_78 = var17_20;
                                        var77_76 = var22_24;
                                        var20_22 = 1;
                                        var21_23 = 1.4E-45f;
                                    } else {
                                        var80_78 = var17_20;
                                        var77_76 = var22_24;
                                        var20_22 = 0;
                                        var21_23 = 0.0f;
                                        var22_24 = null;
                                    }
                                    var17_20 = var20_22;
                                    var53_53 -= var17_20;
                                    var82_79 = var52_52 * var26_30;
                                    var83_80 = Math.round(var82_79) + var20_22;
                                    var84_81 = var20_22;
                                    var85_82 = var21_23;
                                    var20_22 = 0;
                                    var21_23 = 0.0f;
                                    var22_24 = null;
                                    var83_80 = Math.max(0, var83_80);
                                    if (var31_35 != null) {
                                        try {
                                            var20_22 = (int)var31_35.b;
                                            break block50;
                                        }
                                        catch (IllegalArgumentException var10_11) {
                                            var86_83 = var82_79;
                                            var87_84 /* !! */  = var19_21 /* !! */ ;
                                            var88_85 = var52_52;
                                            var38_42 = var64_62;
                                            var89_86 = var26_30;
                                            break block51;
                                        }
                                    }
                                    var20_22 = 1;
                                    var21_23 = 1.4E-45f;
                                }
                                if (var20_22 != 0) {
                                    var20_22 = -1 >>> 1;
                                    var21_23 = 0.0f / 0.0f;
                                    if (var83_80 != var20_22) {
                                        var22_24 = var0;
                                        var86_83 = var82_79;
                                        var30_34 = var83_80;
                                        var87_84 /* !! */  = var19_21 /* !! */ ;
                                        var88_85 = var52_52;
                                        var38_42 = var64_62;
lbl320:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                } else {
                                    var20_22 = -1 >>> 1;
                                    var21_23 = 0.0f / 0.0f;
                                }
                                var22_24 = var0;
                                var86_83 = var82_79;
                                var87_84 /* !! */  = var19_21 /* !! */ ;
                                var88_85 = var52_52;
                                var38_42 = var64_62;
                                var30_34 = 0;
                                var31_35 = null;
                                ** continue;
                                var47_49 = var4_4;
                                var89_86 = var26_30;
                                var25_29 = 1;
                                var26_30 = 1.4E-45f;
                                try {
                                    var90_87 = var22_24.f(var30_34, var83_80, var4_4, (boolean)var25_29);
                                }
                                catch (IllegalArgumentException var10_12) {
                                    // empty catch block
                                }
                                var92_88 = var29_33.Q(var90_87);
                                var93_89 = var22_24.e(var92_88);
                                var27_31 = var22_24.d(var92_88);
                                var37_41 /* !! */ [var63_61] = var93_89;
                                var11_14 += var93_89;
                                var93_89 = Math.max(var23_25, var27_31);
                                var8_8[var63_61] = var92_88;
                                var23_25 = var93_89;
                                var86_83 = var58_57;
                                var64_62 = var59_58;
                                var83_80 = var75_74;
                                var94_90 = var80_78;
                                var96_91 = var88_85;
                                var19_21 /* !! */  = var87_84 /* !! */ ;
                                var74_73 = var57_56;
                                var97_92 = var69_70;
                                var99_93 = var77_76;
                                var77_76 = var73_72;
                                var73_72 = var56_55;
                                break block56;
                            }
                            var68_68 /* !! */  = fQ2.a("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", (String)var62_60, (String)var15_18, var12_15, var13_16);
                            var68_68 /* !! */ .append(var14_17);
                            var19_21 /* !! */  = var87_84 /* !! */ ;
                            var68_68 /* !! */ .append((String)var87_84 /* !! */ );
                            var94_90 = var80_78;
                            var68_68 /* !! */ .append(var80_78);
                            var55_54 = var77_76;
                            var68_68 /* !! */ .append((String)var77_76);
                            var13_16 = var75_74;
                            var68_68 /* !! */ .append(var75_74);
                            var55_54 = var73_72;
                            var68_68 /* !! */ .append((String)var73_72);
                            var13_16 = var32_36;
                            var68_68 /* !! */ .append(var32_36);
                            var15_18 = var65_63;
                            fn0_2.b(var68_68 /* !! */ , (String)var65_63, var42_46, (String)var38_42);
                            var68_68 /* !! */ .append(var69_70);
                            var55_54 = var59_58;
                            var68_68 /* !! */ .append((String)var59_58);
                            var66_64 = var58_57;
                            var68_68 /* !! */ .append(var58_57);
                            var55_54 = var57_56;
                            var68_68 /* !! */ .append((String)var57_56);
                            var66_64 = var88_85;
                            var68_68 /* !! */ .append(var88_85);
                            var68_68 /* !! */ .append("weight ");
                            var66_64 = var89_86;
                            var68_68 /* !! */ .append(var89_86);
                            var55_54 = var56_55;
                            var68_68 /* !! */ .append(var56_55);
                            var52_52 = var86_83;
                            var68_68 /* !! */ .append(var86_83);
                            var68_68 /* !! */ .append("crossAxisDesiredSize nullremainderUnit ");
                            var13_16 = var84_81;
                            var66_64 = var85_82;
                            var68_68 /* !! */ .append(var84_81);
                            var68_68 /* !! */ .append("childMainAxisSize ");
                            var68_68 /* !! */ .append(var83_80);
                            var68_68 /* !! */  = var68_68 /* !! */ .toString();
                            var39_43 = new IllegalArgumentException((String)var68_68 /* !! */ );
                            throw var39_43.initCause((Throwable)var10_13);
                        }
                        var39_43 = "All weights <= 0 should have placeables".toString();
                        var10_10 = new IllegalStateException((String)var39_43);
                        throw var10_10;
                    }
                    var94_90 = var17_20;
                    var83_80 = var25_29;
                    var74_73 = var57_56;
                    var86_83 = var58_57;
                    var77_76 = var73_72;
                    var97_92 = var69_70;
                    var25_29 = 1;
                    var26_30 = 1.4E-45f;
                    var78_77 = 0L;
                    var47_49 = var4_4;
                    var73_72 = var56_55;
                    var99_93 = var22_24;
                    var22_24 = var0;
                    var100_94 = var59_58;
                    var96_91 = var52_52;
                    var38_42 = var64_62;
                    var64_62 = var59_58;
                }
                var25_29 = var83_80;
                var17_20 = var94_90;
                var56_55 = var73_72;
                var73_72 = var77_76;
                var22_24 = var99_93;
                var31_35 = var7_7;
                var27_31 = var9_9;
                var69_70 = var97_92;
                var57_56 = var74_73;
                var58_57 = var86_83;
                var100_94 = var64_62;
                var64_62 = var38_42;
                var52_52 = var96_91;
                var59_58 = var100_94;
            }
            var22_24 = var0;
            var101_95 = (long)var11_14 + var42_46;
            var11_14 = (int)var101_95;
            var63_61 = var12_15 - var32_36;
            var12_15 = 0;
            var68_69 = null;
            var44_47 = f.g(var11_14, 0, var63_61);
            var30_34 = var32_36;
        }
        var14_17 = var9_9;
        var10_10 = null;
        if (var34_38 != 0) {
            var11_14 = 0;
            var41_45 = 0.0f;
            var39_43 = null;
            var12_15 = 0;
            var68_69 = null;
            for (var63_61 = 0; var63_61 < var14_17; ++var63_61) {
                var62_60 = var8_8[var63_61];
                Intrinsics.checkNotNull(var62_60);
                var103_96 = var62_60.B();
                var83_80 = var103_96 instanceof hQ2;
                if (var83_80 != 0) {
                    var103_96 = (hQ2)var103_96;
                } else {
                    var47_49 = 0;
                    var103_96 = null;
                    var82_79 = 0.0f;
                }
                if (var103_96 != null) {
                    var103_96 = var103_96.c;
                } else {
                    var47_49 = 0;
                    var103_96 = null;
                    var82_79 = 0.0f;
                }
                if (var103_96 != null) {
                    var103_96 = var103_96.b((Ns2)var62_60);
                } else {
                    var47_49 = 0;
                    var103_96 = null;
                    var82_79 = 0.0f;
                }
                if (var103_96 == null) continue;
                var83_80 = var103_96.intValue();
                var16_19 = var22_24.d((Ns2)var62_60);
                var93_89 = -1 << -1;
                if (var83_80 != var93_89) {
                    var47_49 = var103_96.intValue();
                } else {
                    var47_49 = 0;
                    var82_79 = 0.0f;
                    var103_96 = null;
                }
                var11_14 = Math.max(var11_14, var47_49);
                if (var83_80 == var93_89) {
                    var83_80 = var16_19;
                }
                var12_15 = Math.max(var12_15, var16_19 -= var83_80);
            }
            var63_61 = var11_14;
        } else {
            var12_15 = 0;
            var68_69 = null;
        }
        if ((var44_47 += var30_34) < 0) {
            var44_47 = 0;
            var15_18 = null;
        }
        var16_19 = Math.max(var44_47, var13_16);
        var11_14 = var2_2;
        var11_14 = Math.max(var2_2, var12_15 += var63_61);
        var47_49 = Math.max(var23_25, var11_14);
        var15_18 = new int[var14_17];
        var41_45 = 0.0f;
        var39_43 = null;
        for (var11_14 = 0; var11_14 < var14_17; ++var11_14) {
            var12_15 = 0;
            var68_69 = null;
            var15_18[var11_14] = false;
        }
        var55_54 = var6_6;
        var39_43 = var37_41 /* !! */ ;
        var22_24.b(var16_19, (int[])var37_41 /* !! */ , (int[])var15_18, var6_6);
        var39_43 = var0;
        var68_69 = var8_8;
        var14_17 = var63_61;
        return var0.g(var8_8, var6_6, var63_61, (int[])var15_18, var16_19, var47_49);
    }
}

