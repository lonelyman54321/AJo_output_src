/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;

public final class HS2 {
    public static final vc3_1 a;
    public static final float b;

    static {
        vc3_1 vc3_12;
        HS2$a hS2$a = HS2$a.c;
        a = vc3_12 = new H30(hS2$a);
        b = 16;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void a(LP1 var0, VS2 var1_1, Function2 var2_2, Function2 var3_3, gx0_2 var4_4, Function2 var5_5, int var6_6, boolean var7_7, gx0_2 var8_8, boolean var9_9, i13 var10_10, float var11_11, long var12_12, long var14_13, long var16_14, long var18_15, long var20_16, u10 var22_17, b30_0 var23_18, int var24_19, int var25_20, int var26_21) {
        var27_22 = var24_19;
        var28_23 = var25_20;
        var29_24 = 1037492569;
        var30_25 = var23_18;
        var31_26 = var23_18.g(var29_24);
        var32_27 = var24_19 | 6;
        var33_28 = var24_19 & 48;
        if (var33_28 == 0) {
            var32_27 = var24_19 | 22;
        }
        if ((var33_28 = var26_21 & 4) != 0) {
            var32_27 |= 384;
            while (true) {
                var34_30 = var2_2;
                break;
            }
        } else {
            if ((var35_29 = var27_22 & 384) != 0) ** continue;
            var34_30 = var2_2;
            var36_31 = (int)var31_26.x(var2_2);
            if (var36_31 != 0) {
                var36_31 = 256;
                var37_32 = 3.59E-43f;
            } else {
                var36_31 = 128;
                var37_32 = 1.8E-43f;
            }
            var32_27 |= var36_31;
        }
        var36_31 = var26_21 & 8;
        if (var36_31 != 0) {
            var32_27 |= 3072;
            while (true) {
                var38_33 = var3_3;
                break;
            }
        } else {
            if ((var39_34 = var27_22 & 3072) != 0) ** continue;
            var38_33 = var3_3;
            var40_35 = (int)var31_26.x(var3_3);
            var40_35 = var40_35 != 0 ? 2048 : 1024;
            var32_27 |= var40_35;
        }
        var40_35 = var32_27 | 24576;
        var41_36 = var26_21 & 32;
        var42_37 = 196608;
        var43_38 = 65536;
        if (var41_36 != 0) {
            var40_35 = 221184 | var32_27;
            while (true) {
                var30_25 = var5_5;
                break;
            }
        } else {
            if ((var32_27 = var27_22 & var42_37) != 0) ** continue;
            var30_25 = var5_5;
            var44_39 = var31_26.x(var5_5);
            if (var44_39 != 0) {
                var44_39 = 131072;
                var45_40 = 1.83671E-40f;
            } else {
                var44_39 = 65536;
                var45_40 = 9.1835E-41f;
            }
            var40_35 |= var44_39;
        }
        var45_40 = 6.4373016E-6f;
        var40_35 |= 920125440;
        var44_39 = var28_23 & 6;
        var44_39 = var44_39 == 0 ? var28_23 | 2 : var28_23;
        var46_41 = var44_39 | 48;
        var47_42 = var28_23 & 384;
        if (var47_42 == 0) {
            var46_41 = var44_39 | 176;
        }
        if ((var44_39 = var28_23 & 3072) == 0) {
            var46_41 |= 1024;
        }
        if ((var44_39 = var28_23 & 24576) == 0) {
            var46_41 |= 8192;
        }
        var44_39 = 32768;
        var45_40 = 4.5918E-41f;
        if ((var42_37 &= var28_23) == 0) {
            var42_37 = var26_21 & var44_39;
            if (var42_37 == 0) {
                var48_43 = var18_15;
                var47_42 = (int)var31_26.d(var18_15);
                if (var47_42 != 0) {
                    var43_38 = 131072;
                }
            } else {
                var48_43 = var18_15;
            }
            var46_41 |= var43_38;
        } else {
            var48_43 = var18_15;
        }
        var43_38 = 0x180000 & var28_23;
        if (var43_38 == 0) {
            var43_38 = 524288;
            var46_41 |= var43_38;
        }
        if ((var43_38 = 0xC00000 & var28_23) == 0) {
            var43_38 = (int)var31_26.x(var22_17);
            var43_38 = var43_38 != 0 ? 0x800000 : 0x400000;
            var46_41 |= var43_38;
        }
        var43_38 = 306783379 & var40_35;
        var44_39 = 306783378;
        var45_40 = 6.3469493E-28f;
        if (var43_38 != var44_39) ** GOTO lbl-1000
        var43_38 = 4793491 & var46_41;
        var44_39 = 0x492492;
        var45_40 = 6.71711E-39f;
        if (var43_38 == var44_39 && (var43_38 = (int)var31_26.h()) != 0) {
            var31_26.D();
            var50_44 = var1_1;
            var41_36 = var6_6;
            var43_38 = var9_9;
            var51_45 = var10_10;
            var52_46 = var11_11;
            var53_47 = var12_12;
            var55_48 = var14_13;
            var57_49 = var16_14;
            var59_50 = var20_16;
            var61_51 = var30_25;
            var62_52 = var38_33;
            var63_53 = var48_43;
            var30_25 = var0;
            var38_33 = var4_4;
            var65_54 = var7_7;
            var66_55 = var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var31_26.r0();
            var43_38 = var27_22 & 1;
            var67_56 = -3670017;
            var68_57 = -524175;
            var69_58 = -65423;
            if (var43_38 != 0 && (var43_38 = (int)var31_26.c0()) == 0) {
                var31_26.D();
                var33_28 = var40_35 & -113;
                var36_31 = var46_41 & var69_58;
                var40_35 = var26_21 & 32768;
                if (var40_35 != 0) {
                    var36_31 = var46_41 & var68_57;
                }
                var36_31 &= var67_56;
                var70_59 /* !! */  = var0;
                var46_41 = var6_6;
                var71_60 = var8_8;
                var45_40 = var11_11;
                var72_61 = var12_12;
                var74_62 = var14_13;
                var76_63 = var16_14;
                var78_64 = var20_16;
                var61_51 = var30_25;
                var68_57 = var33_28;
                var69_58 = var36_31;
                var80_65 = var48_43;
                var30_25 = var1_1;
                var50_44 = var4_4;
                var36_31 = var7_7;
                var65_54 = var9_9;
                var66_55 = var10_10;
            } else {
                var70_59 /* !! */  = LP1$a.b;
                var51_45 = Tu0.c(zu0_0.Closed, (b30_0)var31_26);
                var30_25 = b30$a.a;
                var34_30 = var31_26.v();
                if (var34_30 == var30_25) {
                    var34_30 = new R73();
                    var31_26.o(var34_30);
                }
                var34_30 = (R73)var34_30;
                var38_33 = var31_26.v();
                if (var38_33 == var30_25) {
                    var38_33 = new VS2((yu0_0)var51_45, (R73)var34_30);
                    var31_26.o(var38_33);
                }
                var30_25 = var38_33;
                var30_25 = (VS2)var38_33;
                var35_29 = var40_35 & -113;
                var50_44 = var33_28 != 0 ? f20_0.a : var2_2;
                var62_52 = var36_31 != 0 ? f20_0.b : var3_3;
                var38_33 = f20_0.c;
                var61_51 = var41_36 != 0 ? f20_0.d : var5_5;
                var71_60 = B13.a;
                var71_60 = ((A13)var31_26.j((H30)var71_60)).c;
                var45_40 = zu0_1.a;
                var0 = var30_25;
                var30_25 = mz_0.a;
                var82_66 = (lZ)var31_26.j((H30)var30_25);
                var2_2 = var50_44;
                var83_67 = var35_29;
                var84_68 = var82_66.h();
                var86_69 = mz_0.b(var84_68, (b30_0)var31_26);
                var88_70 = var84_68;
                var50_44 = mz_0.a;
                var50_44 = (lZ)var31_26.j((H30)var50_44);
                var84_68 = var50_44.e();
                var90_71 = var62_52;
                var37_32 = 0.32f;
                var84_68 = OX.b(var84_68, var37_32);
                var36_31 = var46_41 & var69_58;
                var69_58 = var26_21 & 32768;
                if (var69_58 != 0) {
                    var30_25 = (lZ)var31_26.j((H30)var30_25);
                    var48_43 = var30_25.b();
                    var36_31 = var46_41 & var68_57;
                }
                var57_49 = mz_0.b(var48_43, (b30_0)var31_26);
                var36_31 &= var67_56;
                var32_27 = 1;
                var46_41 = 2;
                var52_46 = 2.8E-45f;
                var67_56 = 0;
                var91_72 = null;
                var30_25 = var0;
                var72_61 = var88_70;
                var76_63 = var84_68;
                var50_44 = var38_33;
                var80_65 = var48_43;
                var78_64 = var57_49;
                var74_62 = var86_69;
                var65_54 = 1;
                var68_57 = var83_67;
                var34_30 = var2_2;
                var38_33 = var90_71;
                var69_58 = var36_31;
                var66_55 = var71_60;
                var41_36 = 0;
                var71_60 = null;
                var36_31 = 0;
                var37_32 = 0.0f;
                var62_52 = null;
            }
            var31_26.U();
            var92_73 = (float)false;
            var91_72 = ch3_0.a(var92_73);
            var28_23 = var68_57 << 3;
            var93_74 = 0x7FFFFFF0;
            var94_75 = var28_23 & var93_74;
            var28_23 = var68_57 >> 27 & 14;
            var47_42 = var69_58 << 3;
            var27_22 = var47_42 & 896;
            var28_23 |= var27_22;
            var27_22 = 0x380000 & var47_42;
            var28_23 |= var27_22;
            var27_22 = 0xE000000;
            var95_76 = var28_23 | (var47_42 &= var27_22);
            var82_66 = var38_33;
            var96_77 = var50_44;
            var97_78 = var66_55;
            HS2.b(var91_72, var70_59 /* !! */ , (VS2)var30_25, (Function2)var34_30, (Function2)var38_33, (gx0_2)var50_44, (Function2)var61_51, var46_41, (boolean)var36_31, (gx0_2)var71_60, (boolean)var65_54, (i13)var66_55, var45_40, var72_61, var74_62, var76_63, var80_65, var78_64, var22_17, (b30_0)var31_26, var94_75, var95_76);
            var53_47 = var72_61;
            var55_48 = var74_62;
            var57_49 = var76_63;
            var63_53 = var80_65;
            var59_50 = var78_64;
            var50_44 = var30_25;
            var30_25 = var70_59 /* !! */ ;
            var43_38 = var65_54;
            var65_54 = var36_31;
            var62_52 = var38_33;
            var38_33 = var96_77;
            var66_55 = var71_60;
            var41_36 = var46_41;
            var52_46 = var45_40;
            var51_45 = var97_78;
        }
        var31_26 = var31_26.X();
        if (var31_26 != null) {
            var99_80 = var31_26;
            var31_26 = var98_79;
            var98_79 = new ks2_0((LP1)var30_25, (VS2)var50_44, (Function2)var34_30, (Function2)var62_52, (gx0_2)var38_33, (Function2)var61_51, var41_36, (boolean)var65_54, (gx0_2)var66_55, (boolean)var43_38, (i13)var51_45, var52_46, var53_47, var55_48, var57_49, var63_53, var59_50, var22_17, var24_19, var25_20, var26_21);
            var31_26 = var99_80;
            var30_25 = var98_79;
            var99_80.d = var98_79;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void b(oO0 oO02, LP1 lP1, VS2 vS2, Function2 function2, Function2 function22, gx0_2 gx0_22, Function2 function23, int n3, boolean bl2, gx0_2 gx0_23, boolean bl3, i13 i132, float f5, long l2, long l3, long l4, long l7, long l8, u10 u102, b30_0 b30_02, int n4, int n7) {
        Object object;
        Object object2;
        int n8;
        int n10;
        int n14;
        int n15;
        Object object3 = oO02;
        Object object4 = lP1;
        Object object5 = vS2;
        Object object6 = gx0_23;
        int n17 = n4;
        int n18 = n7;
        Object object7 = b30_02;
        Object object8 = b30_02.g(-1288630565);
        int n19 = n4 & 6;
        if (n19 == 0) {
            n19 = ((j30_0)object8).J(oO02) ? 1 : 0;
            n19 = n19 != 0 ? 4 : 2;
            n19 |= n17;
        } else {
            n19 = n4;
        }
        int n20 = n17 & 0x30;
        int n21 = 16;
        if (n20 == 0) {
            n20 = ((j30_0)object8).J(object4) ? 1 : 0;
            n20 = n20 != 0 ? 32 : 16;
            n19 |= n20;
        }
        n20 = n17 & 0x180;
        int n22 = 128;
        if (n20 == 0) {
            n20 = ((j30_0)object8).J(object5) ? 1 : 0;
            n20 = n20 != 0 ? 256 : 128;
            n19 |= n20;
        }
        n20 = n17 & 0xC00;
        int n24 = 1024;
        int n25 = 2048;
        if (n20 == 0) {
            void var41_39;
            boolean n16 = ((j30_0)object8).x(function2);
            if (n16) {
                int n26 = 2048;
            } else {
                int n27 = 1024;
            }
            n19 |= var41_39;
        }
        int n28 = n17 & 0x6000;
        int n29 = 8192;
        if (n28 == 0) {
            object7 = function22;
            n15 = ((j30_0)object8).x(function22) ? 1 : 0;
            n15 = n15 != 0 ? 16384 : 8192;
            n19 |= n15;
        } else {
            object7 = function22;
        }
        n15 = 196608;
        int n30 = n17 & n15;
        int n32 = 65536;
        Object object9 = gx0_22;
        if (n30 == 0) {
            n14 = ((j30_0)object8).x(gx0_22) ? 1 : 0;
            n14 = n14 != 0 ? 131072 : 65536;
            n19 |= n14;
        }
        n14 = 0x180000;
        int n34 = n17 & n14;
        int n35 = 524288;
        object4 = function23;
        if (n34 == 0) {
            n34 = ((j30_0)object8).x(function23) ? 1 : 0;
            n34 = n34 != 0 ? 0x100000 : 524288;
            n19 |= n34;
        }
        n34 = 0xC00000;
        int n36 = n17 & n34;
        int n37 = 0x400000;
        if (n36 == 0) {
            n36 = ((j30_0)object8).c(n3) ? 1 : 0;
            n36 = n36 != 0 ? 0x800000 : 0x400000;
            n19 |= n36;
        }
        n36 = 0x6000000;
        int n38 = n17 & n36;
        int n39 = 0x2000000;
        if (n38 == 0) {
            n38 = ((j30_0)object8).a(bl2) ? 1 : 0;
            n38 = n38 != 0 ? 0x4000000 : 0x2000000;
            n19 |= n38;
        }
        if ((n10 = n17 & (n38 = 0x30000000)) == 0) {
            n10 = ((j30_0)object8).x(object6) ? 1 : 0;
            n10 = n10 != 0 ? 0x20000000 : 0x10000000;
            n19 |= n10;
        }
        n10 = n19;
        n19 = n18 & 6;
        if (n19 == 0) {
            n19 = bl3 ? 1 : 0;
            n8 = ((j30_0)object8).a(bl3) ? 1 : 0;
            n8 = n8 != 0 ? 4 : 2;
            n8 = n18 | n8;
        } else {
            n19 = bl3 ? 1 : 0;
            n8 = n18;
        }
        int n41 = n18 & 0x30;
        object4 = i132;
        if (n41 == 0) {
            n41 = ((j30_0)object8).J(i132) ? 1 : 0;
            if (n41 != 0) {
                n21 = 32;
            }
            n8 |= n21;
        }
        if ((n21 = n18 & 0x180) == 0) {
            n21 = ((j30_0)object8).b(f5) ? 1 : 0;
            if (n21 != 0) {
                n22 = 256;
            }
            n8 |= n22;
        }
        if ((n21 = n18 & 0xC00) == 0) {
            n21 = ((j30_0)object8).d(l2) ? 1 : 0;
            if (n21 != 0) {
                n24 = 2048;
            }
            n8 |= n24;
        }
        if ((n21 = n18 & 0x6000) == 0) {
            int n42;
            n21 = ((j30_0)object8).d(l3) ? 1 : 0;
            if (n21 != 0) {
                n42 = 16384;
            }
            n8 |= n42;
        }
        if ((n21 = n18 & n15) == 0) {
            n21 = ((j30_0)object8).d(l4) ? 1 : 0;
            if (n21 != 0) {
                n32 = 131072;
            }
            n8 |= n32;
        }
        if ((n21 = n18 & n14) == 0) {
            n21 = ((j30_0)object8).d(l7) ? 1 : 0;
            if (n21 != 0) {
                n35 = 0x100000;
            }
            n8 |= n35;
        }
        if ((n21 = n18 & n34) == 0) {
            n21 = ((j30_0)object8).d(l8) ? 1 : 0;
            if (n21 != 0) {
                n37 = 0x800000;
            }
            n8 |= n37;
        }
        if ((n21 = n18 & n36) == 0) {
            n21 = ((j30_0)object8).x(u102) ? 1 : 0;
            if (n21 != 0) {
                n39 = 0x4000000;
            }
            n8 |= n39;
        }
        if ((n21 = n10 & 0x12492493) == (n19 = 306783378) && (n19 = n8 & 0x2492493) == (n21 = 0x2492492) && (n19 = (int)(((j30_0)object8).h() ? 1 : 0)) != 0) {
            ((j30_0)object8).D();
            object9 = lP1;
            object3 = object8;
        } else {
            ((j30_0)object8).r0();
            n19 = n17 & 1;
            if (n19 != 0 && (n19 = (int)(((j30_0)object8).c0() ? 1 : 0)) == 0) {
                ((j30_0)object8).D();
            }
            ((j30_0)object8).U();
            n19 = n10 & 0xE;
            n21 = 4;
            if (n19 == n21) {
                n19 = 1;
            } else {
                n19 = 0;
                object2 = null;
            }
            object = ((j30_0)object8).v();
            if (n19 != 0 || object == (object2 = b30$a.a)) {
                object = new zr1_0((lg3_0)object3);
                ((j30_0)object8).o(object);
            }
            object7 = object = (zr1_0)object;
            object9 = oO02;
            n24 = n3;
            object3 = object8;
            object8 = function2;
            object6 = function22;
            object4 = vS2;
            object5 = gx0_22;
            object2 = new os2_0((zr1_0)object, oO02, l7, l8, bl2, n3, function2, u102, function23, function22, gx0_22, vS2);
            n19 = -219833176;
            object7 = object2;
            object2 = v10.c(n19, (fx0_2)object2, (b30_0)object3);
            if (gx0_23 != null) {
                ((j30_0)object3).K(651509775);
                object9 = vS2.a;
                object7 = new is2_0((u10)object2);
                object6 = v10.c(-1409196448, (fx0_2)object7, (b30_0)object3);
                n19 = n10 >> 27 & 0xE | n38;
                n28 = n10 & 0x70;
                n19 |= n28;
                n28 = n8 << 9;
                n20 = n28 & 0x1C00;
                n19 |= n20;
                n20 = 0xE000 & n28;
                n19 |= n20;
                n20 = 0x70000 & n28;
                n19 |= n20;
                n20 = 0x380000 & n28;
                n19 |= n20;
                n20 = 0x1C00000 & n28;
                n25 = (n19 |= n20) | (n28 &= 0xE000000);
                object2 = gx0_23;
                object7 = lP1;
                n20 = bl3 ? 1 : 0;
                object = i132;
                object5 = object3;
                Tu0.a(gx0_23, lP1, (yu0_0)object9, bl3, i132, f5, l2, l3, l4, (u10)object6, (b30_0)object3, n25);
                n19 = 0;
                object2 = null;
                ((j30_0)object3).T(false);
                object9 = lP1;
            } else {
                ((j30_0)object3).K(652000071);
                n28 = n10 >> 3 & 0xE | 0x30;
                object7 = n28;
                object9 = lP1;
                ((u10)object2).invoke(lP1, object3, object7);
                n19 = 0;
                object2 = null;
                ((j30_0)object3).T(false);
            }
        }
        object4 = ((j30_0)object3).X();
        if (object4 != null) {
            object2 = object3;
            object7 = oO02;
            object9 = lP1;
            object = function2;
            n24 = n3;
            n17 = bl3 ? 1 : 0;
            object6 = i132;
            n35 = n4;
            object3 = new js2_0(oO02, lP1, vS2, function2, function22, gx0_22, function23, n3, bl2, gx0_23, bl3, i132, f5, l2, l3, l4, l7, l8, u102, n4, n7);
            object2 = object4;
            object7 = object3;
            ((CF2)object4).d = object3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void c(boolean bl2, int n3, Function2 function2, u10 u102, u10 u103, Function2 function22, lg3_0 lg3_02, Function2 function23, b30_0 b30_02, int n4) {
        Object object;
        Object object2;
        Object object3;
        int n7;
        int n8;
        int n10;
        Object object4;
        int n14;
        int n15;
        int n16;
        int n18;
        int n19 = n4;
        int n20 = -468424875;
        Object object5 = b30_02.g(n20);
        int n21 = n4 & 6;
        if (n21 == 0) {
            n21 = bl2 ? 1 : 0;
            n18 = ((j30_0)object5).a(bl2) ? 1 : 0;
            n18 = n18 != 0 ? 4 : 2;
            n18 |= n19;
        } else {
            n21 = bl2 ? 1 : 0;
            n18 = n4;
        }
        int n22 = n19 & 0x30;
        if (n22 == 0) {
            void var16_19;
            n22 = n3;
            boolean n17 = ((j30_0)object5).c(n3);
            if (n17) {
                int n24 = 32;
            } else {
                int n25 = 16;
            }
            n18 |= var16_19;
        } else {
            n22 = n3;
        }
        int n26 = n19 & 0x180;
        int n27 = 256;
        if (n26 == 0) {
            void var18_25;
            boolean bl3 = ((j30_0)object5).x(function2);
            if (bl3) {
                int n28 = 256;
            } else {
                int n29 = 128;
            }
            n18 |= var18_25;
        }
        if ((n16 = n19 & 0xC00) == 0) {
            void var19_30;
            boolean bl4 = ((j30_0)object5).x(u102);
            if (bl4) {
                int n30 = 2048;
            } else {
                int n32 = 1024;
            }
            n18 |= var19_30;
        }
        int n34 = n19 & 0x6000;
        int n35 = 16384;
        if (n34 == 0) {
            void var19_35;
            boolean bl5 = ((j30_0)object5).x(u103);
            if (bl5) {
                int n36 = 16384;
            } else {
                int n37 = 8192;
            }
            n18 |= var19_35;
        }
        if ((n15 = 0x30000 & n19) == 0) {
            void var19_40;
            boolean bl6 = ((j30_0)object5).x(function22);
            if (bl6) {
                int n38 = 131072;
            } else {
                int n39 = 65536;
            }
            n18 |= var19_40;
        }
        if ((n14 = 0x180000 & n19) == 0) {
            void var22_47;
            object4 = lg3_02;
            boolean bl7 = ((j30_0)object5).J(lg3_02);
            if (bl7) {
                int n41 = 0x100000;
            } else {
                int n42 = 524288;
            }
            n18 |= var22_47;
        } else {
            object4 = lg3_02;
        }
        int n43 = n19 & 0xC00000;
        if (n43 == 0) {
            n10 = ((j30_0)object5).x(function23) ? 1 : 0;
            n10 = n10 != 0 ? 0x800000 : 0x400000;
            n18 |= n10;
        }
        if ((n8 = n18 & (n10 = 4793491)) == (n7 = 0x492492) && (n8 = (int)(((j30_0)object5).h() ? 1 : 0)) != 0) {
            ((j30_0)object5).D();
        } else {
            n8 = n18 & 0x380;
            n7 = 0;
            if (n8 == n27) {
                n8 = 1;
            } else {
                n8 = 0;
                object3 = null;
            }
            n27 = 0xE000 & n18;
            n27 = n27 == n35 ? 1 : 0;
            n8 |= n27;
            n27 = 0x380000 & n18;
            n35 = 0x100000;
            n27 = n27 == n35 ? 1 : 0;
            n8 |= n27;
            n27 = 0x70000 & n18;
            n35 = 131072;
            n27 = n27 == n35 ? 1 : 0;
            n8 |= n27;
            n27 = n18 & 0x70;
            n35 = 32;
            n27 = n27 == n35 ? 1 : 0;
            n8 |= n27;
            n27 = n18 & 0xE;
            n35 = 4;
            n27 = n27 == n35 ? 1 : 0;
            n8 |= n27;
            n27 = 0x1C00000 & n18;
            n35 = 0x800000;
            n27 = n27 == n35 ? 1 : 0;
            n8 |= n27;
            n27 = 2048;
            if ((n18 &= 0x1C00) == n27) {
                n18 = 1;
            } else {
                n18 = 0;
                object2 = null;
            }
            object3 = ((j30_0)object5).v();
            if ((n18 |= n8) == 0 && object3 != (object2 = b30$a.a)) {
                n18 = 1;
                n27 = 0;
            } else {
                n18 = 1;
                object = object3;
                object4 = function2;
                n27 = 0;
                object3 = new ss2_1(function2, u103, function22, n3, bl2, lg3_02, function23, u102);
                ((j30_0)object5).o(object3);
            }
            object3 = (Function2)object3;
            object = null;
            tf3.a(null, (Function2)object3, (b30_0)object5, 0, n18);
        }
        object = ((j30_0)object5).X();
        if (object != null) {
            object5 = object4;
            n21 = bl2 ? 1 : 0;
            object2 = function2;
            object3 = u103;
            n19 = n4;
            ((CF2)object).d = object4 = new ts2_1(bl2, n3, function2, u102, u103, function22, lg3_02, function23, n4);
        }
    }
}

