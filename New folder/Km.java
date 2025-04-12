/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.jvm.functions.Function2;

public final class Km {
    public static final float a;
    public static final float b;
    public static final LP1 c;
    public static final LP1 d;
    public static final oO0 e;

    static {
        float f5;
        a = 56;
        b = f5 = (float)4;
        LP1 lP1 = LP1$a.b;
        float f6 = (float)16 - f5;
        c = j.k(lP1, f6);
        lP1 = j.b(lP1, 1.0f);
        f6 = (float)72 - f5;
        d = j.k(lP1, f6);
        e = ch3_0.a(0.0f);
    }

    /*
     * WARNING - void declaration
     */
    public static final void a(long l2, long l3, float f5, nk2_0 nk2_02, oO0 oO02, LP1 lP1, u10 u102, b30_0 b30_02, int n3) {
        Object object;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n142;
        nk2_0 nk2_03 = nk2_02;
        oO0 oO03 = oO02;
        u10 u103 = u102;
        int n152 = n3;
        Object object2 = fg2_1.a;
        int n162 = -712505634;
        Object object3 = b30_02.g(n162);
        int n17 = n3 & 6;
        if (n17 == 0) {
            n142 = ((j30_0)object3).d(l2) ? 1 : 0;
            n142 = n142 != 0 ? 4 : 2;
            n142 |= n152;
        } else {
            n142 = n3;
        }
        int n18 = n152 & 0x30;
        if (n18 == 0) {
            void var21_22;
            boolean n102 = ((j30_0)object3).d(l3);
            if (n102) {
                int n19 = 32;
            } else {
                int n20 = 16;
            }
            n142 |= var21_22;
        }
        if ((n16 = n152 & 0x180) == 0) {
            void var22_27;
            boolean bl2 = ((j30_0)object3).b(f5);
            if (bl2) {
                int n21 = 256;
            } else {
                int n22 = 128;
            }
            n142 |= var22_27;
        }
        if ((n15 = n152 & 0xC00) == 0) {
            void var22_32;
            boolean bl3 = ((j30_0)object3).J(nk2_03);
            if (bl3) {
                int n24 = 2048;
            } else {
                int n25 = 1024;
            }
            n142 |= var22_32;
        }
        if ((n14 = n152 & 0x6000) == 0) {
            void var22_37;
            boolean bl4 = ((j30_0)object3).J(object2);
            if (bl4) {
                int n26 = 16384;
            } else {
                int n27 = 8192;
            }
            n142 |= var22_37;
        }
        if ((n10 = 0x30000 & n152) == 0) {
            void var22_42;
            boolean bl5 = ((j30_0)object3).J(oO03);
            if (bl5) {
                int n28 = 131072;
            } else {
                int n29 = 65536;
            }
            n142 |= var22_42;
        }
        if ((n8 = n152 & (n7 = 0x180000)) == 0) {
            n8 = ((j30_0)object3).J(lP1) ? 1 : 0;
            n8 = n8 != 0 ? 0x100000 : 524288;
            n142 |= n8;
        }
        if ((n8 = 0xC00000 & n152) == 0) {
            n8 = ((j30_0)object3).x(u103) ? 1 : 0;
            n8 = n8 != 0 ? 0x800000 : 0x400000;
            n142 |= n8;
        }
        if ((n8 = 0x492493 & n142) == (n4 = 0x492492) && (n8 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
        } else {
            dm_0 dm_02 = new dm_0(oO03, nk2_03, u103);
            u10 u104 = v10.c(213273114, dm_02, (b30_0)object3);
            n8 = n142 >> 18 & 0xE;
            int n30 = n7 | n8;
            n8 = n142 >> 9 & 0x70;
            int n32 = n30 | n8;
            n8 = n142 << 6;
            n4 = n8 & 0x380;
            int n35 = n32 | n4;
            n35 = n35 | (n8 &= 0x1C00);
            n8 = 458752;
            n142 = n142 << 9 & n8;
            int n36 = n35 | n142;
            int n37 = 16;
            object = lP1;
            jg3_0.a(lP1, (i13)object2, l2, l3, null, f5, u104, (b30_0)object3, n36, n37);
        }
        object = ((j30_0)object3).X();
        if (object != null) {
            object3 = object2;
            nk2_03 = nk2_02;
            oO03 = oO02;
            u103 = u102;
            n152 = n3;
            ((CF2)object).d = object2 = new em_0(l2, l3, f5, nk2_02, oO02, lP1, u102, n3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void b(u10 u102, oO0 oO02, LP1 lP1, Function2 function2, gx0_2 gx0_22, long l2, long l3, float f5, b30_0 b30_02, int n3) {
        Object object;
        boolean bl2;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        u10 u103 = u102;
        Function2 function22 = function2;
        gx0_2 gx0_23 = gx0_22;
        int n152 = n3;
        int n162 = -763778507;
        Object object2 = b30_02.g(n162);
        int n172 = n3 & 6;
        if (n172 == 0) {
            n172 = ((j30_0)object2).x(u102) ? 1 : 0;
            n172 = n172 != 0 ? 4 : 2;
            n172 |= n152;
        } else {
            n172 = n3;
        }
        int n18 = n152 & 0x30;
        if (n18 == 0) {
            void var20_21;
            boolean n142 = ((j30_0)object2).J(oO02);
            if (n142) {
                int n19 = 32;
            } else {
                int n20 = 16;
            }
            n172 |= var20_21;
        }
        if ((n17 = n152 & 0x180) == 0) {
            void var21_26;
            boolean bl3 = ((j30_0)object2).J(lP1);
            if (bl3) {
                int n21 = 256;
            } else {
                int n22 = 128;
            }
            n172 |= var21_26;
        }
        if ((n16 = n152 & 0xC00) == 0) {
            void var21_31;
            boolean bl4 = ((j30_0)object2).x(function22);
            if (bl4) {
                int n24 = 2048;
            } else {
                int n25 = 1024;
            }
            n172 |= var21_31;
        }
        if ((n15 = n152 & 0x6000) == 0) {
            void var21_36;
            boolean bl5 = ((j30_0)object2).x(gx0_23);
            if (bl5) {
                int n26 = 16384;
            } else {
                int n27 = 8192;
            }
            n172 |= var21_36;
        }
        if ((n14 = 0x30000 & n152) == 0) {
            void var22_41;
            boolean bl6 = ((j30_0)object2).d(l2);
            if (bl6) {
                int n28 = 131072;
            } else {
                int n29 = 65536;
            }
            n172 |= var22_41;
        }
        if ((n10 = 0x180000 & n152) == 0) {
            void var23_46;
            boolean bl7 = ((j30_0)object2).d(l3);
            if (bl7) {
                int n30 = 0x100000;
            } else {
                int n32 = 524288;
            }
            n172 |= var23_46;
        }
        if ((n8 = 0xC00000 & n152) == 0) {
            void var23_51;
            boolean bl8 = ((j30_0)object2).b(f5);
            if (bl8) {
                int n34 = 0x800000;
            } else {
                int n35 = 0x400000;
            }
            n172 |= var23_51;
        }
        if ((n7 = 0x492493 & n172) == (n4 = 0x492492) && (bl2 = ((j30_0)object2).h())) {
            ((j30_0)object2).D();
        } else {
            boolean bl9;
            ((j30_0)object2).r0();
            int n36 = n152 & 1;
            if (n36 != 0 && !(bl9 = ((j30_0)object2).c0())) {
                ((j30_0)object2).D();
            }
            ((j30_0)object2).U();
            nk2_0 nk2_02 = Bm.b;
            object = new hm_0(function22, u103, gx0_23);
            u10 u104 = v10.c(1849684359, (fx0_2)object, (b30_0)object2);
            int n37 = n172 >> 15;
            n4 = n37 & 0xE | 0xC06C00;
            int n38 = n37 & 0x70;
            int n39 = n37 & 0x380 | (n4 |= n38);
            n4 = 0x70000 & (n172 <<= 12);
            int n41 = n39 | n4;
            n4 = 0x380000;
            int n42 = n41 | (n172 &= n4);
            Km.a(l2, l3, f5, nk2_02, oO02, lP1, u104, (b30_0)object2, n42);
        }
        object = ((j30_0)object2).X();
        if (object != null) {
            im_0 im_02;
            object2 = im_02;
            u103 = u102;
            function22 = function2;
            gx0_23 = gx0_22;
            n152 = n3;
            im_02 = new im_0(u102, oO02, lP1, function2, gx0_22, l2, l3, f5, n3);
            ((CF2)object).d = im_02;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void c(float var0, int var1_1, int var2_2, long var3_3, long var5_4, u10 var7_5, b30_0 var8_6, gx0_2 var9_7, LP1 var10_8, Function2 var11_9) {
        block29: {
            block25: {
                block28: {
                    block27: {
                        block26: {
                            var12_10 = var1_1;
                            var13_11 = var3_3;
                            var15_12 = var8_6;
                            var16_13 = var8_6.g(-2087748139);
                            var17_14 = var1_1 & 6;
                            if (var17_14 == 0) {
                                var17_14 = (int)var16_13.x(var7_5);
                                var17_14 = var17_14 != 0 ? 4 : 2;
                                var17_14 |= var12_10;
                            } else {
                                var17_14 = var1_1;
                            }
                            var18_15 = var2_2 & 2;
                            if (var18_15 != 0) {
                                var17_14 |= 48;
                                while (true) {
                                    var19_17 = var10_8;
                                    break;
                                }
                            } else {
                                if ((var20_16 = var12_10 & 48) != 0) ** continue;
                                var19_17 = var10_8;
                                var21_18 = (int)var16_13.J(var10_8);
                                var21_18 = var21_18 != 0 ? 32 : 16;
                                var17_14 |= var21_18;
                            }
                            var21_18 = var2_2 & 4;
                            if (var21_18 != 0) {
                                var17_14 |= 384;
                                while (true) {
                                    var22_20 /* !! */  = var11_9;
                                    break;
                                }
                            } else {
                                if ((var23_19 = var12_10 & 384) != 0) ** continue;
                                var22_20 /* !! */  = var11_9;
                                var24_21 = var16_13.x(var11_9);
                                var24_21 = var24_21 != 0 ? 256 : 128;
                                var17_14 |= var24_21;
                            }
                            var17_14 |= 3072;
                            var24_21 = var12_10 & 24576;
                            if (var24_21 == 0) {
                                var24_21 = (int)var16_13.d(var13_11);
                                var24_21 = var24_21 != 0 ? 16384 : 8192;
                                var17_14 |= var24_21;
                            }
                            if ((var24_21 = 196608 & var12_10) != 0) break block25;
                            var24_21 = var2_2 & 32;
                            if (var24_21 != 0) break block26;
                            var25_22 = var5_4;
                            var27_23 = (int)var16_13.d(var5_4);
                            if (var27_23 == 0) break block27;
                            var27_23 = 131072;
                            break block28;
                        }
                        var25_22 = var5_4;
                    }
                    var27_23 = 65536;
                }
                var17_14 |= var27_23;
                break block29;
            }
            var25_22 = var5_4;
        }
        var27_23 = var2_2 & 64;
        var28_24 = 0x180000;
        var29_25 = 2.204052E-39f;
        if (var27_23 != 0) {
            var17_14 |= var28_24;
            while (true) {
                var29_25 = var0;
                break;
            }
        } else {
            if ((var28_24 &= var12_10) != 0) ** continue;
            var29_25 = var0;
            var30_26 = (int)var16_13.b(var0);
            var30_26 = var30_26 != 0 ? 0x100000 : 524288;
            var17_14 |= var30_26;
        }
        var30_26 = 599187 & var17_14;
        var31_27 = 599186;
        if (var30_26 == var31_27 && (var30_26 = (int)var16_13.h()) != 0) {
            var16_13.D();
            var32_28 = var19_17;
            var33_29 = var22_20 /* !! */ ;
            var34_30 = var25_22;
            var36_31 = var9_7;
        } else {
            var16_13.r0();
            var30_26 = var12_10 & 1;
            var31_27 = -458753;
            if (var30_26 != 0 && (var30_26 = (int)var16_13.c0()) == 0) {
                var16_13.D();
                var18_15 = var2_2 & 32;
                if (var18_15 != 0) {
                    var17_14 &= var31_27;
                }
                var37_32 = var9_7;
                var38_33 = var19_17;
                var33_29 = var22_20 /* !! */ ;
                var39_34 = var25_22;
lbl92:
                // 2 sources

                while (true) {
                    var41_36 = var29_25;
                    break;
                }
            } else {
                var15_12 = var18_15 != 0 ? LP1$a.b : var19_17;
                if (var21_18 != 0) {
                    var20_16 = 0;
                    var19_17 = null;
                } else {
                    var19_17 = var22_20 /* !! */ ;
                }
                var42_35 = B10.a;
                var23_19 = var2_2 & 32;
                if (var23_19 != 0) {
                    var43_37 = mz_0.b(var13_11, var16_13);
                    var17_14 &= var31_27;
                } else {
                    var43_37 = var25_22;
                }
                if (var27_23 != 0) {
                    var45_38 = Bm.a;
                    var38_33 = var15_12;
                    var33_29 = var19_17;
                    var37_32 = var42_35;
                    var39_34 = var43_37;
                    var41_36 = var45_38;
                } else {
                    var38_33 = var15_12;
                    var33_29 = var19_17;
                    var37_32 = var42_35;
                    var39_34 = var43_37;
                    ** continue;
                }
            }
            var16_13.U();
            var18_15 = var17_14 & 14 | 48;
            var20_16 = (var17_14 <<= 3) & 896;
            var18_15 |= var20_16;
            var20_16 = var17_14 & 7168;
            var18_15 |= var20_16;
            var20_16 = 57344 & var17_14;
            var18_15 |= var20_16;
            var20_16 = 458752 & var17_14;
            var18_15 |= var20_16;
            var20_16 = 0x380000 & var17_14;
            var18_15 |= var20_16;
            var20_16 = 0x1C00000;
            var46_39 = var18_15 | (var17_14 &= var20_16);
            var15_12 = Km.e;
            var19_17 = var38_33;
            var42_35 = var33_29;
            var22_20 /* !! */  = var37_32;
            var25_22 = var3_3;
            var47_40 = var16_13;
            Km.b(var7_5, (oO0)var15_12, (LP1)var38_33, (Function2)var33_29, var37_32, var3_3, var39_34, var41_36, var16_13, var46_39);
            var29_25 = var41_36;
            var34_30 = var39_34;
            var36_31 = var37_32;
            var32_28 = var38_33;
        }
        var48_41 = var16_13.X();
        if (var48_41 != null) {
            var12_10 = var1_1;
            var17_14 = var2_2;
            var47_40 = new jm_0(var29_25, var1_1, var2_2, var3_3, var34_30, var7_5, var36_31, (LP1)var32_28, (Function2)var33_29);
            var48_41.d = var47_40;
        }
    }
}

