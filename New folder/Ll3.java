/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class Ll3 {
    public static final nw0_1 a;

    static {
        nw0_1 nw0_12;
        J83.l();
        qi_2 qi_22 = qi_2.b;
        Ll3$a ll3$a = Ll3$a.c;
        a = nw0_12 = new nw0_1(qi_22, ll3$a);
    }

    public static final void a(xm3 xm32, Function2 function2, b30_0 object, int n3) {
        int n4;
        object = object.g(1772272796);
        int n7 = n3 & 6;
        if (n7 == 0) {
            n7 = ((j30_0)object).J(xm32) ? 1 : 0;
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n8 = n3 & 0x30;
        if (n8 == 0) {
            n8 = ((j30_0)object).x(function2) ? 1 : 0;
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x13) == (n4 = 18) && (n8 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Object object2 = a;
            xm3 xm33 = ((xm3)((j30_0)object).j((H30)object2)).d(xm32);
            object2 = ((nw0_1)object2).c(xm33);
            n7 &= 0x70;
            n4 = 8;
            L30.a((MB2)object2, function2, (b30_0)object, n7 |= n4);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            Ll3$b ll3$b = new Ll3$b(xm32, function2, n3);
            ((CF2)object).d = ll3$b;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final void b(String var0, LP1 var1_1, long var2_2, long var4_3, nV0 var6_4, tv0_0 var7_5, RU0 var8_6, long var9_7, Jj3 var11_8, Cj3 var12_9, long var13_10, int var15_11, boolean var16_12, int var17_13, int var18_14, Function1 var19_15, xm3 var20_16, b30_0 var21_17, int var22_18, int var23_19, int var24_20) {
        var25_21 = var22_18;
        var26_22 = var23_19;
        var27_23 = var24_20;
        var28_24 = 1028090691;
        var29_25 = var21_17;
        var30_26 = var21_17.g(var28_24);
        var31_27 = var22_18 & 6;
        if (var31_27 == 0) {
            var29_25 = var0;
            var32_28 = (int)var30_26.J(var0);
            var32_28 = var32_28 != 0 ? 4 : 2;
            var32_28 |= var25_21;
        } else {
            var29_25 = var0;
            var32_28 = var22_18;
        }
        var33_29 = var27_23 & 2;
        if (var33_29 != 0) {
            var32_28 |= 48;
            while (true) {
                var34_31 = var1_1;
                break;
            }
        } else {
            if ((var35_30 = var25_21 & 48) != 0) ** continue;
            var34_31 = var1_1;
            var36_32 = (int)var30_26.J(var1_1);
            var36_32 = var36_32 != 0 ? 32 : 16;
            var32_28 |= var36_32;
        }
        var36_32 = var27_23 & 4;
        if (var36_32 != 0) {
            var32_28 |= 384;
        } else {
            var37_33 = var25_21 & 384;
            if (var37_33 == 0) {
                var38_34 = (int)var30_26.d(var2_2);
                var38_34 = var38_34 != 0 ? 256 : 128;
                var32_28 |= var38_34;
            }
        }
        var38_34 = var27_23 & 8;
        var39_35 = 2048;
        var40_36 = 1024;
        if (var38_34 != 0) {
            var32_28 |= 3072;
        } else {
            var41_37 = var25_21 & 3072;
            if (var41_37 == 0) {
                var42_38 = (int)var30_26.d(var4_3);
                var42_38 = var42_38 != 0 ? 2048 : 1024;
                var32_28 |= var42_38;
            }
        }
        var42_38 = var27_23 & 16;
        var43_39 = 16384;
        if (var42_38 != 0) {
            var32_28 |= 24576;
        } else {
            var41_37 = var25_21 & 24576;
            if (var41_37 == 0) {
                var44_40 = (int)var30_26.J(var6_4);
                var44_40 = var44_40 != 0 ? 16384 : 8192;
                var32_28 |= var44_40;
            }
        }
        var44_40 = var27_23 & 32;
        var45_41 = 131072;
        var46_42 = 196608;
        var47_43 = 65536;
        if (var44_40 != 0) {
            var32_28 |= var46_42;
        } else {
            var48_44 = var25_21 & var46_42;
            if (var48_44 == 0) {
                var49_45 = (int)var30_26.J(var7_5);
                var49_45 = var49_45 != 0 ? 131072 : 65536;
                var32_28 |= var49_45;
            }
        }
        var49_45 = var27_23 & 64;
        var50_46 = 524288;
        var51_47 = 0x180000;
        if (var49_45 != 0) {
            var32_28 |= var51_47;
            var52_48 = var8_6;
        } else {
            var53_49 = var25_21 & var51_47;
            var52_48 = var8_6;
            if (var53_49 == 0) {
                var54_50 = var30_26.J(var8_6);
                var54_50 = var54_50 != 0 ? 0x100000 : 524288;
                var32_28 |= var54_50;
            }
        }
        var37_33 = var27_23 & 128;
        var55_51 = 0xC00000;
        if (var37_33 != 0) {
            var32_28 |= var55_51;
        } else if ((var55_51 = var25_21 & var55_51) == 0) {
            var56_52 = (int)var30_26.d(var9_7);
            var56_52 = var56_52 != 0 ? 0x800000 : 0x400000;
            var32_28 |= var56_52;
        }
        var56_52 = var27_23 & 256;
        var55_51 = 0x6000000;
        if (var56_52 != 0) {
            var32_28 |= var55_51;
            var29_25 = var11_8;
        } else {
            var55_51 = var25_21 & var55_51;
            var29_25 = var11_8;
            if (var55_51 == 0) {
                var57_53 = (int)var30_26.J(var11_8);
                var57_53 = var57_53 != 0 ? 0x4000000 : 0x2000000;
                var32_28 |= var57_53;
            }
        }
        var57_53 = var27_23 & 512;
        var55_51 = 0x30000000;
        if (var57_53 != 0) {
            var32_28 |= var55_51;
            var29_25 = var12_9;
        } else {
            var55_51 = var25_21 & var55_51;
            var29_25 = var12_9;
            if (var55_51 == 0) {
                var55_51 = (int)var30_26.J(var12_9);
                var55_51 = var55_51 != 0 ? 0x20000000 : 0x10000000;
                var32_28 |= var55_51;
            }
        }
        var31_27 = var27_23 & 1024;
        if (var31_27 != 0) {
            var54_50 = var26_22 | 6;
        } else {
            var55_51 = var26_22 & 6;
            if (var55_51 == 0) {
                var35_30 = (int)var30_26.d(var13_10);
                var54_50 = var35_30 != 0 ? 4 : 2;
                var54_50 = var26_22 | var54_50;
            } else {
                var54_50 = var26_22;
            }
        }
        var35_30 = var27_23 & 2048;
        if (var35_30 != 0) {
            var54_50 |= 48;
            var41_37 = var15_11;
lbl130:
            // 3 sources

            while (true) {
                continue;
                break;
            }
        }
        var55_51 = var26_22 & 48;
        var41_37 = var15_11;
        if (var55_51 != 0) ** GOTO lbl130
        var58_54 = (int)var30_26.c(var15_11);
        var59_55 = var58_54 != 0 ? 32 : 16;
        var54_50 |= var59_55;
        ** while (true)
        var58_54 = var54_50;
        var41_37 = var27_23 & 4096;
        if (var41_37 != 0) {
            var58_54 = var54_50 | 384;
            while (true) {
                var60_56 = (int)var16_12;
                break;
            }
        } else {
            if ((var60_56 = var26_22 & 384) != 0) ** continue;
            var60_56 = (int)var16_12;
            var61_57 = var30_26.a(var16_12);
            var48_44 = var61_57 != 0 ? 256 : 128;
            var58_54 |= var48_44;
        }
        var60_56 = var27_23 & 8192;
        if (var60_56 != 0) {
            var58_54 |= 3072;
            while (true) {
                var62_58 = var17_13;
                break;
            }
        } else {
            if ((var62_58 = var26_22 & 3072) != 0) ** continue;
            var62_58 = var17_13;
            var61_57 = var30_26.c(var17_13);
            if (var61_57 == 0) {
                var39_35 = 1024;
            }
            var58_54 |= var39_35;
        }
        var62_58 = var27_23 & 16384;
        if (var62_58 != 0) {
            var58_54 |= 24576;
            var39_35 = var62_58;
            while (true) {
                var62_58 = var18_14;
                break;
            }
        } else {
            var39_35 = var62_58;
            if ((var62_58 = var26_22 & 24576) != 0) ** continue;
            var62_58 = var18_14;
            var40_36 = (int)var30_26.c(var18_14);
            if (var40_36 == 0) {
                var43_39 = 8192;
            }
            var58_54 |= var43_39;
        }
        var40_36 = var27_23 & 32768;
        if (var40_36 != 0) {
            var58_54 |= var46_42;
            var52_48 = var19_15;
        } else {
            var61_57 = var26_22 & var46_42;
            var52_48 = var19_15;
            if (var61_57 == 0) {
                var61_57 = (int)var30_26.x(var19_15);
                if (var61_57 == 0) {
                    var45_41 = 65536;
                }
                var58_54 |= var45_41;
            }
        }
        var61_57 = var26_22 & var51_47;
        if (var61_57 == 0) {
            var61_57 = var27_23 & var47_43;
            var52_48 = var20_16;
            if (var61_57 == 0 && (var61_57 = (int)var30_26.J(var20_16)) != 0) {
                var50_46 = 0x100000;
            }
            var58_54 |= var50_46;
        } else {
            var52_48 = var20_16;
        }
        var61_57 = 306783379;
        var62_58 = var32_28 & var61_57;
        var26_22 = 306783378;
        var63_59 = 6.3469493E-28f;
        if (var62_58 != var26_22) ** GOTO lbl-1000
        var62_58 = 599187 & var58_54;
        var26_22 = 599186;
        var63_59 = 8.39638E-40f;
        if (var62_58 == var26_22 && (var62_58 = (int)var30_26.h()) != 0) {
            var30_26.D();
            var64_60 = var1_1;
            var65_61 = var2_2;
            var67_62 = var4_3;
            var69_63 = var6_4;
            var34_31 = var7_5;
            var70_64 = var8_6;
            var71_65 = var9_7;
            var73_66 = var11_8;
            var74_67 = var12_9;
            var75_68 = var13_10;
            var38_34 = var15_11;
            var39_35 = (int)var16_12;
            var40_36 = var17_13;
            var61_57 = var18_14;
            var77_69 = var19_15;
            var78_70 = var20_16;
        } else lbl-1000:
        // 2 sources

        {
            var30_26.r0();
            var62_58 = var25_21 & 1;
            var26_22 = -3670017;
            var63_59 = 0.0f / 0.0f;
            if (var62_58 != 0 && (var62_58 = (int)var30_26.c0()) == 0) {
                var30_26.D();
                var31_27 = var27_23 & var47_43;
                if (var31_27 != 0) {
                    var58_54 &= var26_22;
                }
                var79_71 = var1_1;
                var80_72 = var2_2;
                var82_73 = var4_3;
                var52_48 = var6_4;
                var84_74 = var7_5;
                var85_75 = var8_6;
                var86_76 = var9_7;
                var88_77 = var11_8;
                var64_60 = var12_9;
                var89_78 = var13_10;
                var35_30 = var15_11;
                var41_37 = (int)var16_12;
                var60_56 = var17_13;
                var31_27 = var18_14;
                var70_64 = var19_15;
                while (true) {
                    var73_66 = var20_16;
                    break;
                }
            } else {
                var79_71 = var33_29 != 0 ? LP1$a.b : var1_1;
                var80_72 = var36_32 != 0 ? OX.l : var2_2;
                var82_73 = var38_34 != 0 ? Dm3.c : var4_3;
                var36_32 = 0;
                var70_64 = null;
                if (var42_38 != 0) {
                    var62_58 = 0;
                    var52_48 = null;
                } else {
                    var52_48 = var6_4;
                }
                if (var44_40 != 0) {
                    var38_34 = 0;
                    var84_74 = null;
                } else {
                    var84_74 = var7_5;
                }
                if (var49_45 != 0) {
                    var61_57 = 0;
                    var85_75 = null;
                } else {
                    var85_75 = var8_6;
                }
                var86_76 = var37_33 != 0 ? Dm3.c : var9_7;
                if (var56_52 != 0) {
                    var56_52 = 0;
                    var88_77 = null;
                } else {
                    var88_77 = var11_8;
                }
                if (var57_53 != 0) {
                    var57_53 = 0;
                    var64_60 = null;
                } else {
                    var64_60 = var12_9;
                }
                var89_78 = var31_27 != 0 ? Dm3.c : var13_10;
                var31_27 = 1;
                var35_30 = var35_30 != 0 ? 1 : var15_11;
                var41_37 = var41_37 != 0 ? 1 : (int)var16_12;
                var60_56 = var60_56 != 0 ? -1 >>> 1 : var17_13;
                if (var39_35 == 0) {
                    var31_27 = var18_14;
                }
                if (var40_36 == 0) {
                    var70_64 = var19_15;
                }
                if ((var37_33 = var27_23 & var47_43) == 0) ** continue;
                var73_66 = Ll3.a;
                var73_66 = (xm3)var30_26.j((H30)var73_66);
                var58_54 &= var26_22;
            }
            var30_26.U();
            var91_79 = w60_0.a;
            var92_80 = ((OX)var30_26.j((H30)var91_79)).a;
            var91_79 = s60_0.a;
            var91_79 = (Number)var30_26.j((H30)var91_79);
            var63_59 = var91_79.floatValue();
            var94_81 = 16;
            var42_38 = var80_72 == var94_81 ? 0 : (var80_72 < var94_81 ? -1 : 1);
            var92_80 = var42_38 != 0 ? var80_72 : ((var42_38 = (int)((cfr_temp_0 = (var96_82 = var73_66.b()) - var94_81) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) != 0 ? var73_66.b() : OX.b(var92_80, var63_59));
            if (var64_60 != null) {
                var26_22 = var64_60.a;
            } else {
                var26_22 = -1 << -1;
                var63_59 = -0.0f;
            }
            var96_82 = 0L;
            var1_1 = var73_66;
            var2_2 = var96_82;
            var4_3 = var82_73;
            var6_4 = var84_74;
            var7_5 = var52_48;
            var8_6 = var85_75;
            var9_7 = var86_76;
            var11_8 = var88_77;
            var13_10 = var89_78;
            var15_11 = 16609105;
            var91_79 = xm3.e((xm3)var73_66, var96_82, var82_73, var84_74, (nV0)var52_48, var85_75, var86_76, (Jj3)var88_77, var26_22, var89_78, var15_11);
            var39_35 = (int)var30_26.d(var92_80);
            var98_83 = var64_60;
            var64_60 = var30_26.v();
            var99_84 = var88_77;
            if (var39_35 != 0 || var64_60 == (var88_77 = b30$a.a)) {
                var64_60 = new Ll3$c(var92_80);
                var30_26.o(var64_60);
            }
            var64_60 = (gy_1)var64_60;
            var56_52 = var32_28 & 126;
            var32_28 = var58_54 >> 6 & 7168;
            var56_52 |= var32_28;
            var32_28 = var58_54 << 9;
            var58_54 = 57344 & var32_28;
            var56_52 |= var58_54;
            var58_54 = 458752 & var32_28;
            var56_52 |= var58_54;
            var58_54 = 0x380000 & var32_28;
            var56_52 |= var58_54;
            var58_54 = 0x1C00000;
            var32_28 = 0;
            var1_1 = var0;
            var12_9 = null;
            dx.b(var0, (LP1)var79_71, (xm3)var91_79, (Function1)var70_64, var35_30, (boolean)var41_37, var60_56, var31_27, (gy_1)var64_60, (b30_0)var30_26, var56_52 |= (var32_28 &= var58_54), 0);
            var74_67 = var98_83;
            var64_60 = var79_71;
            var39_35 = var41_37;
            var77_69 = var70_64;
            var40_36 = var60_56;
            var69_63 = var52_48;
            var70_64 = var85_75;
            var65_61 = var80_72;
            var71_65 = var86_76;
            var67_62 = var82_73;
            var75_68 = var89_78;
            var61_57 = var31_27;
            var78_70 = var73_66;
            var73_66 = var99_84;
            var38_34 = var35_30;
            var34_31 = var84_74;
        }
        var29_25 = var30_26.X();
        if (var29_25 != null) {
            var1_1 = var30_26;
            var100_85 = var29_25;
            var29_25 = var0;
            var59_55 = var23_19;
            var44_40 = var24_20;
            var29_25 = var30_26 = new Ll3$d(var0, (LP1)var64_60, var65_61, var67_62, (nV0)var69_63, (tv0_0)var34_31, (RU0)var70_64, var71_65, (Jj3)var73_66, (Cj3)var74_67, var75_68, var38_34, (boolean)var39_35, var40_36, var61_57, (Function1)var77_69, (xm3)var78_70, var22_18, var23_19, var24_20);
            var30_26 = var100_85;
            var100_85.d = var1_1;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void c(Sl var0, LP1 var1_1, long var2_2, long var4_3, nV0 var6_4, tv0_0 var7_5, RU0 var8_6, long var9_7, Jj3 var11_8, Cj3 var12_9, long var13_10, int var15_11, boolean var16_12, int var17_13, int var18_14, Map var19_15, Function1 var20_16, xm3 var21_17, b30_0 var22_18, int var23_19, int var24_20, int var25_21) {
        var26_22 = var23_19;
        var27_23 = var25_21;
        var28_24 = 744129681;
        var29_25 = var22_18;
        var30_26 = var22_18.g(var28_24);
        var31_27 = var23_19 & 6;
        if (var31_27 == 0) {
            var29_25 = var0;
            var32_28 = (int)var30_26.J(var0);
            var32_28 = var32_28 != 0 ? 4 : 2;
            var32_28 |= var26_22;
        } else {
            var29_25 = var0;
            var32_28 = var23_19;
        }
        var33_29 = var27_23 & 2;
        if (var33_29 != 0) {
            var32_28 |= 48;
            while (true) {
                var34_31 = var1_1;
                break;
            }
        } else {
            if ((var35_30 = var26_22 & 48) != 0) ** continue;
            var34_31 = var1_1;
            var36_32 = (int)var30_26.J(var1_1);
            var36_32 = var36_32 != 0 ? 32 : 16;
            var32_28 |= var36_32;
        }
        var36_32 = var27_23 & 4;
        if (var36_32 != 0) {
            var32_28 |= 384;
            while (true) {
                var37_33 = var2_2;
                break;
            }
        } else {
            if ((var39_34 = var26_22 & 384) != 0) ** continue;
            var37_33 = var2_2;
            var40_35 = (int)var30_26.d(var2_2);
            var40_35 = var40_35 != 0 ? 256 : 128;
            var32_28 |= var40_35;
        }
        var40_35 = var27_23 & 8;
        if (var40_35 != 0) {
            var32_28 |= 3072;
            while (true) {
                var41_36 = var4_3;
                break;
            }
        } else {
            if ((var43_37 = var26_22 & 3072) != 0) ** continue;
            var41_36 = var4_3;
            var44_38 = (int)var30_26.d(var4_3);
            var44_38 = var44_38 != 0 ? 2048 : 1024;
            var32_28 |= var44_38;
        }
        var44_38 = var32_28 | 24576;
        var45_39 = var27_23 & 32;
        if (var45_39 != 0) {
            var44_38 = 221184 | var32_28;
            while (true) {
                var46_40 = var7_5;
                break;
            }
        } else {
            if ((var32_28 = 196608 & var26_22) != 0) ** continue;
            var46_40 = var7_5;
            var47_41 = (int)var30_26.J(var7_5);
            var47_41 = var47_41 != 0 ? 131072 : 65536;
            var44_38 |= var47_41;
        }
        var47_41 = var27_23 & 64;
        var48_42 = 0x180000;
        if (var47_41 != 0) {
            var44_38 |= var48_42;
            var29_25 = var8_6;
        } else {
            var48_42 = var26_22 & var48_42;
            var29_25 = var8_6;
            if (var48_42 == 0) {
                var48_42 = (int)var30_26.J(var8_6);
                var48_42 = var48_42 != 0 ? 0x100000 : 524288;
                var44_38 |= var48_42;
            }
        }
        var48_42 = var44_38 | 0x6C00000;
        var31_27 = var27_23 & 512;
        if (var31_27 != 0) {
            var48_42 = var44_38 | 918552576;
            while (true) {
                var49_43 = var12_9;
                break;
            }
        } else {
            if ((var44_38 = 0x30000000 & var26_22) != 0) ** continue;
            var49_43 = var12_9;
            var50_44 = (int)var30_26.J(var12_9);
            var50_44 = var50_44 != 0 ? 0x20000000 : 0x10000000;
            var48_42 |= var50_44;
        }
        var50_44 = var24_20 | 1797558;
        var51_45 = var24_20 & 0xC00000;
        if (var51_45 == 0) {
            var50_44 = var24_20 | 5991862;
        }
        var51_45 = 306783379;
        var32_28 = var48_42 & var51_45;
        var35_30 = 306783378;
        var52_46 = 6.3469493E-28f;
        if (var32_28 != var35_30) ** GOTO lbl-1000
        var32_28 = var50_44 & 4793491;
        var35_30 = 0x492492;
        var52_46 = 6.71711E-39f;
        if (var32_28 == var35_30 && (var32_28 = (int)var30_26.h()) != 0) {
            var30_26.D();
            var46_40 = var1_1;
            var53_47 = var7_5;
            var54_48 = var11_8;
            var55_49 = var13_10;
            var48_42 = var15_11;
            var50_44 = (int)var16_12;
            var51_45 = var17_13;
            var57_50 = var18_14;
            var58_51 = var19_15;
            var59_52 = var20_16;
            var60_53 = var21_17;
            var61_54 = var37_33;
            var63_55 = var41_36;
            var65_56 = var49_43;
            var66_57 = var6_4;
            var67_58 = var8_6;
            var68_59 = var9_7;
        } else lbl-1000:
        // 2 sources

        {
            var30_26.r0();
            var32_28 = var26_22 & 1;
            var35_30 = -29360129;
            var52_46 = -6.380294E37f;
            if (var32_28 != 0 && (var32_28 = (int)var30_26.c0()) == 0) {
                var30_26.D();
                var31_27 = var50_44 & var35_30;
                var46_40 = var1_1;
                var70_60 = var7_5;
                var71_61 = var9_7;
                var73_62 = var11_8;
                var74_63 = var13_10;
                var35_30 = var15_11;
                var57_50 = (int)var16_12;
                var76_64 = var17_13;
                var77_65 = var18_14;
                var60_53 = var19_15;
                var78_66 = var20_16;
                var79_67 = var21_17;
                var80_68 = var31_27;
                var81_69 = var41_36;
                var29_25 = var6_4;
                var83_70 = var8_6;
            } else {
                var46_40 = var33_29 != 0 ? LP1$a.b : var1_1;
                if (var36_32 != 0) {
                    var37_33 = var63_55 = OX.l;
                }
                var81_69 = var40_35 != 0 ? Dm3.c : var41_36;
                if (var45_39 != 0) {
                    var36_32 = 0;
                    var70_60 = null;
                } else {
                    var70_60 = var7_5;
                }
                var83_70 = var47_41 != 0 ? null : var8_6;
                var71_61 = Dm3.c;
                if (var31_27 != 0) {
                    var44_38 = 0;
                    var49_43 = null;
                }
                var29_25 = fh1_2.f();
                var84_71 = Ll3$e.c;
                var73_62 = Ll3.a;
                var73_62 = (xm3)var30_26.j((H30)var73_62);
                var35_30 = var50_44 & var35_30;
                var50_44 = 1;
                var60_53 = var29_25;
                var79_67 = var73_62;
                var80_68 = var35_30;
                var78_66 = var84_71;
                var31_27 = 0;
                var29_25 = null;
                var33_29 = 0;
                var73_62 = null;
                var35_30 = 1;
                var52_46 = 1.4E-45f;
                var57_50 = 1;
                var76_64 = -1 >>> 1;
                var77_65 = 1;
                var74_63 = var71_61;
            }
            var30_26.U();
            var85_72 = w60_0.a;
            var85_72 = (OX)var30_26.j((H30)var85_72);
            var55_49 = var85_72.a;
            var16_12 = var35_30;
            var34_31 = s60_0.a;
            var34_31 = (Number)var30_26.j((H30)var34_31);
            var52_46 = var34_31.floatValue();
            var86_73 = 16;
            var88_74 = var37_33 == var86_73 ? 0 : (var37_33 < var86_73 ? -1 : 1);
            var55_49 = var88_74 != false ? var37_33 : ((var91_76 = (cfr_temp_0 = (var89_75 = var79_67.b()) - var86_73) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != false ? var79_67.b() : OX.b(var55_49, var52_46));
            if (var49_43 != null) {
                var35_30 = var49_43.a;
            } else {
                var35_30 = -1 << -1;
                var52_46 = -0.0f;
            }
            var92_77 = 0L;
            var1_1 = var79_67;
            var2_2 = var92_77;
            var4_3 = var81_69;
            var6_4 = var70_60;
            var7_5 = var29_25;
            var8_6 = var83_70;
            var9_7 = var71_61;
            var11_8 = var73_62;
            var13_10 = var74_63;
            var15_11 = 16609105;
            var34_31 = xm3.e((xm3)var79_67, var92_77, var81_69, var70_60, (nV0)var29_25, var83_70, var71_61, (Jj3)var73_62, var35_30, var74_63, var15_11);
            var94_78 = var30_26.d(var55_49);
            var95_79 = var29_25;
            var29_25 = var30_26.v();
            var96_80 = var73_62;
            if (var94_78 || var29_25 == (var73_62 = b30$a.a)) {
                var29_25 = new Ll3$f(var55_49);
                var30_26.o(var29_25);
            }
            var29_25 = (gy_1)var29_25;
            var33_29 = var48_42 & 126;
            var26_22 = var80_68 >> 9 & 7168;
            var33_29 |= var26_22;
            var26_22 = var80_68 << 9;
            var27_23 = 57344 & var26_22;
            var33_29 |= var27_23;
            var27_23 = 458752 & var26_22;
            var33_29 |= var27_23;
            var27_23 = 0x380000 & var26_22;
            var33_29 |= var27_23;
            var27_23 = 0x1C00000 & var26_22;
            var33_29 |= var27_23;
            var27_23 = 0xE000000;
            var26_22 = 0;
            var85_72 = null;
            var1_1 = var0;
            var11_8 = var30_26;
            dx.a(var0, (LP1)var46_40, (xm3)var34_31, var78_66, (int)var16_12, (boolean)var57_50, var76_64, var77_65, (Map)var60_53, (gy_1)var29_25, (b30_0)var30_26, var33_29 |= (var26_22 &= var27_23), 0);
            var48_42 = (int)var16_12;
            var61_54 = var37_33;
            var55_49 = var74_63;
            var50_44 = var57_50;
            var51_45 = var76_64;
            var57_50 = var77_65;
            var58_51 = var60_53;
            var59_52 = var78_66;
            var60_53 = var79_67;
            var66_57 = var95_79;
            var54_48 = var96_80;
            var65_56 = var49_43;
            var53_47 = var70_60;
            var63_55 = var81_69;
            var67_58 = var83_70;
            var68_59 = var71_61;
        }
        var29_25 = var30_26.X();
        if (var29_25 != null) {
            var1_1 = var30_26;
            var97_81 = var29_25;
            var29_25 = var0;
            var80_68 = var25_21;
            var29_25 = var30_26 = new Ll3$g(var0, (LP1)var46_40, var61_54, var63_55, (nV0)var66_57, var53_47, var67_58, var68_59, (Jj3)var54_48, var65_56, var55_49, var48_42, (boolean)var50_44, var51_45, var57_50, (Map)var58_51, var59_52, (xm3)var60_53, var23_19, var24_20, var25_21);
            var30_26 = var97_81;
            var97_81.d = var1_1;
        }
    }

    public static final void d(LP1 lP1, long l2, long l3, nV0 nV02, tv0_0 tv0_02, RU0 rU0, long l4, Jj3 jj3, Cj3 cj3, long l7, int n3, boolean n4, int n7, Function1 function1, xm3 xm32, b30_0 object, int n8, int n10) {
        Object object2;
        Function1 function12;
        int n14;
        int n15;
        long l8;
        Object object3;
        Object object4;
        long l12;
        RU0 rU02;
        tv0_0 tv0_03;
        Object object5;
        long l14;
        long l15;
        int n16;
        int n17 = n10;
        int n18 = -366126944;
        Object object6 = object;
        Object object7 = object.g(n18);
        int n19 = n8 & 6;
        String string2 = "Next";
        if (n19 == 0) {
            n19 = ((j30_0)object7).J(string2) ? 1 : 0;
            n19 = n19 != 0 ? 4 : 2;
            n19 = n8 | n19;
        } else {
            n19 = n8;
        }
        n19 |= 0x36DB6DB0;
        int n20 = n17 | 0x6DB6;
        int n21 = 0x30000 & n17;
        if (n21 == 0) {
            n20 = 0x16DB6 | n17;
        }
        if ((n21 = 0x12492493 & n19) == (n16 = 306783378) && (n21 = 0x12493 & n20) == (n16 = 74898) && (n21 = (int)(((j30_0)object7).h() ? 1 : 0)) != 0) {
            ((j30_0)object7).D();
            object6 = lP1;
            l15 = l2;
            l14 = l3;
            object5 = nV02;
            tv0_03 = tv0_02;
            rU02 = rU0;
            l12 = l4;
            object4 = jj3;
            object3 = cj3;
            l8 = l7;
            n17 = n3;
            n15 = n4;
            n14 = n7;
            function12 = function1;
            object2 = xm32;
            object = object7;
        } else {
            tv0_0 tv0_04;
            Object object8;
            Function1 function13;
            int n22;
            int n24;
            int n25;
            long l16;
            Cj3 cj32;
            Jj3 jj32;
            long l17;
            RU0 rU03;
            long l18;
            long l19;
            LP1 lP12;
            ((j30_0)object7).r0();
            n21 = n8 & 1;
            n16 = -458753;
            if (n21 != 0 && (n21 = (int)(((j30_0)object7).c0() ? 1 : 0)) == 0) {
                ((j30_0)object7).D();
                n20 &= n16;
                lP12 = lP1;
                l19 = l2;
                l18 = l3;
                object3 = nV02;
                rU03 = rU0;
                l17 = l4;
                jj32 = jj3;
                cj32 = cj3;
                l16 = l7;
                n25 = n3;
                n24 = n4;
                n22 = n7;
                function13 = function1;
                object8 = xm32;
                n17 = n20;
                tv0_04 = tv0_02;
            } else {
                lP12 = LP1$a.b;
                l19 = OX.l;
                l18 = Dm3.c;
                Ml3 ml3 = Ml3.c;
                object4 = a;
                object4 = (xm3)((j30_0)object7).j((H30)object4);
                object3 = null;
                n17 = n20 &= n16;
                l16 = l18;
                function13 = ml3;
                object8 = object4;
                n20 = 0;
                tv0_04 = null;
                n16 = 0;
                rU03 = null;
                jj32 = null;
                cj32 = null;
                n25 = 1;
                n24 = 1;
                n22 = -1 >>> 1;
                l17 = l18;
            }
            ((j30_0)object7).U();
            int n26 = n19 & 0x7FFFFFFE;
            n19 = n17 & 0xE | 0x6000;
            n15 = n17 & 0x70;
            object = object7;
            n18 = n17 & 0x380 | (n19 |= n15);
            n19 = n17 & 0x1C00;
            n18 |= n19;
            n19 = n17 << 3 & 0x70000;
            int n27 = n18 | n19;
            int n28 = 1;
            Ll3.b(string2, lP12, l19, l18, (nV0)object3, tv0_04, rU03, l17, jj32, cj32, l16, n25, n24 != 0, n22, n28, function13, (xm3)object8, (b30_0)object7, n26, n27, 0);
            object6 = lP12;
            n17 = n25;
            n15 = n24;
            n14 = n22;
            function12 = function13;
            object2 = object8;
            tv0_03 = tv0_04;
            l15 = l19;
            object5 = object3;
            object3 = cj32;
            rU02 = rU03;
            l14 = l18;
            l12 = l17;
            object4 = jj32;
            l8 = l16;
        }
        object7 = ((j30_0)object).X();
        if (object7 != null) {
            Nl3 nl3;
            Object object9 = object7;
            object7 = nl3;
            nl3 = new Nl3((LP1)object6, l15, l14, (nV0)object5, tv0_03, rU02, l12, (Jj3)object4, (Cj3)object3, l8, n17, n15 != 0, n14, function12, (xm3)object2, n8, n10);
            object7 = object9;
            object6 = nl3;
            ((CF2)object9).d = nl3;
        }
    }
}

