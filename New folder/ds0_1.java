/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * Renamed from DS0
 */
public final class ds0_1
extends se3_0 {
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public float U0;
    public float V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public int a1;
    public int b1;
    public int c1;
    public final ArrayList d1;
    public Y50[] e1;
    public Y50[] f1;
    public int[] g1;
    public Y50[] h1;
    public int i1;

    public ds0_1() {
        ArrayList arrayList;
        int n3;
        float f5;
        int n4;
        this.K0 = n4 = -1;
        this.L0 = n4;
        this.M0 = n4;
        this.N0 = n4;
        this.O0 = n4;
        this.P0 = n4;
        this.Q0 = f5 = 0.5f;
        this.R0 = f5;
        this.S0 = f5;
        this.T0 = f5;
        this.U0 = f5;
        this.V0 = f5;
        this.W0 = 0;
        this.X0 = 0;
        this.Y0 = n3 = 2;
        this.Z0 = n3;
        this.a1 = 0;
        this.b1 = n4;
        this.c1 = 0;
        this.d1 = arrayList = new ArrayList();
        this.e1 = null;
        this.f1 = null;
        this.g1 = null;
        this.i1 = 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a0(int var1_1, int var2_2, int var3_3, int var4_4) {
        block125: {
            block130: {
                block124: {
                    block126: {
                        block127: {
                            block128: {
                                var5_5 = this;
                                var6_6 = var1_1;
                                var7_7 = var2_2;
                                var8_8 = var3_3;
                                var9_9 = var4_4;
                                var10_10 = this.y0;
                                var11_11 = 0;
                                var12_12 /* !! */  = null;
                                var13_13 = 1;
                                if (var10_10 > 0) {
                                    var14_14 = this.X;
                                    if (var14_14 != null) {
                                        var14_14 = ((Z50)var14_14).B0;
                                    } else {
                                        var10_10 = 0;
                                        var14_14 = null;
                                    }
                                    if (var14_14 == null) {
                                        var5_5.G0 = 0;
                                        var5_5.H0 = 0;
                                        var5_5.F0 = false;
                                        return;
                                    }
                                    var16_16 /* !! */  = null;
                                    for (var15_15 = 0; var15_15 < (var17_17 = var5_5.y0); ++var15_15) {
                                        var18_18 /* !! */  = var5_5.x0[var15_15];
                                        if (var18_18 /* !! */  == null || (var19_19 = var18_18 /* !! */  instanceof w11_0) != 0) continue;
                                        var20_20 /* !! */  = (int[])var18_18 /* !! */ .o(0);
                                        var21_21 /* !! */  = var18_18 /* !! */ .o(var13_13);
                                        var22_22 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                                        if (var20_20 /* !! */  == var22_22 /* !! */  && (var23_23 = var18_18 /* !! */ .t) != var13_13 && var21_21 /* !! */  == var22_22 /* !! */  && (var23_23 = var18_18 /* !! */ .u) != var13_13) continue;
                                        if (var20_20 /* !! */  == var22_22 /* !! */ ) {
                                            var20_20 /* !! */  = (int[])Y50$b.WRAP_CONTENT;
                                        }
                                        if (var21_21 /* !! */  == var22_22 /* !! */ ) {
                                            var21_21 /* !! */  = Y50$b.WRAP_CONTENT;
                                        }
                                        var22_22 /* !! */  = var5_5.I0;
                                        var22_22 /* !! */ .a = (Y50$b)var20_20 /* !! */ ;
                                        var22_22 /* !! */ .b = var21_21 /* !! */ ;
                                        var22_22 /* !! */ .c = var19_19 = var18_18 /* !! */ .v();
                                        var22_22 /* !! */ .d = var19_19 = var18_18 /* !! */ .p();
                                        var14_14.b((Y50)var18_18 /* !! */ , (Zw$a)var22_22 /* !! */ );
                                        var19_19 = var22_22 /* !! */ .e;
                                        var18_18 /* !! */ .W(var19_19);
                                        var19_19 = var22_22 /* !! */ .f;
                                        var18_18 /* !! */ .R(var19_19);
                                        var19_19 = var22_22 /* !! */ .g;
                                        var18_18 /* !! */ .N(var19_19);
                                    }
                                }
                                var24_24 = var5_5.D0;
                                var23_23 = var5_5.E0;
                                var25_25 = var5_5.z0;
                                var26_26 = var5_5.A0;
                                var10_10 = 2;
                                var20_20 /* !! */  = new int[var10_10];
                                var15_15 = var7_7 - var24_24 - var23_23;
                                var17_17 = var5_5.c1;
                                if (var17_17 == var13_13) {
                                    var15_15 = var9_9 - var25_25 - var26_26;
                                }
                                var27_27 = -1;
                                var28_28 = 0.0f / 0.0f;
                                if (var17_17 == 0) {
                                    var17_17 = var5_5.K0;
                                    if (var17_17 == var27_27) {
                                        var5_5.K0 = 0;
                                    }
                                    if ((var17_17 = var5_5.L0) == var27_27) {
                                        var5_5.L0 = 0;
                                    }
                                } else {
                                    var17_17 = var5_5.K0;
                                    if (var17_17 == var27_27) {
                                        var5_5.K0 = 0;
                                    }
                                    if ((var17_17 = var5_5.L0) == var27_27) {
                                        var5_5.L0 = 0;
                                    }
                                }
                                var29_29 /* !! */  = var5_5.x0;
                                var17_17 = 0;
                                var30_30 = 0.0f;
                                var18_18 /* !! */  = null;
                                var31_31 = 0;
                                var32_32 = null;
                                while (true) {
                                    var11_11 = var5_5.y0;
                                    var10_10 = 8;
                                    if (var17_17 >= var11_11) break;
                                    var12_12 /* !! */  = var5_5.x0[var17_17];
                                    var11_11 = var12_12 /* !! */ .k0;
                                    if (var11_11 == var10_10) {
                                        ++var31_31;
                                    }
                                    ++var17_17;
                                    var10_10 = 2;
                                }
                                if (var31_31 > 0) {
                                    var29_29 /* !! */  = new Y50[var11_11 - var31_31];
                                    var30_30 = 0.0f;
                                    var18_18 /* !! */  = null;
                                    var11_11 = 0;
                                    var12_12 /* !! */  = null;
                                    for (var17_17 = 0; var17_17 < (var13_13 = var5_5.y0); ++var17_17) {
                                        var33_33 /* !! */  = var5_5.x0[var17_17];
                                        var31_31 = var15_15;
                                        var15_15 = var33_33 /* !! */ .k0;
                                        if (var15_15 != var10_10) {
                                            var29_29 /* !! */ [var11_11] = var33_33 /* !! */ ;
                                            ++var11_11;
                                        }
                                        var15_15 = var31_31;
                                    }
                                }
                                var31_31 = var15_15;
                                var13_13 = var11_11;
                                var12_12 /* !! */  = var29_29 /* !! */ ;
                                var5_5.h1 = var29_29 /* !! */ ;
                                var5_5.i1 = var11_11;
                                var10_10 = var5_5.a1;
                                var18_18 /* !! */  = var5_5.d1;
                                if (var10_10 == 0) break block126;
                                var16_16 /* !! */  = var5_5.M;
                                var29_29 /* !! */  = var5_5.L;
                                var34_34 = var5_5.N;
                                var35_35 = var5_5.O;
                                var36_37 /* !! */  = var29_29 /* !! */ ;
                                var27_27 = 1;
                                var28_28 = 1.4E-45f;
                                if (var10_10 == var27_27) break block127;
                                var27_27 = 2;
                                var28_28 = 2.8E-45f;
                                if (var10_10 == var27_27) break block128;
                                var27_27 = 3;
                                var28_28 = 4.2E-45f;
                                if (var10_10 != var27_27) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var37_39 /* !! */  = var20_20 /* !! */ ;
                                        var38_40 = var26_26;
                                        var39_41 = var25_25;
                                        var40_42 = var23_23;
                                        var41_43 = var24_24;
lbl131:
                                        // 6 sources

                                        while (true) {
                                            var27_27 = 0;
                                            var28_28 = 0.0f;
                                            var29_29 /* !! */  = null;
                                            var15_15 = 1;
                                            break block124;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                var27_27 = var5_5.c1;
                                ** while (var11_11 == 0)
lbl139:
                                // 1 sources

                                var18_18 /* !! */ .clear();
                                var42_45 = var18_18 /* !! */ ;
                                var18_18 /* !! */  = var5_5.L;
                                var43_48 /* !! */  = var20_20 /* !! */ ;
                                var20_20 /* !! */  = (int[])var5_5.M;
                                var21_21 /* !! */  = var5_5.N;
                                var22_22 /* !! */  = var5_5.O;
                                var44_51 = var27_27;
                                var45_53 /* !! */  = var29_29 /* !! */ ;
                                var29_29 /* !! */  = this;
                                var41_43 = var15_15;
                                var32_32 = var16_16 /* !! */ ;
                                var15_15 = var27_27;
                                var46_56 = var35_35;
                                var35_35 = var42_45;
                                var37_39 /* !! */  = var43_48 /* !! */ ;
                                var38_40 = var26_26;
                                var39_41 = var25_25;
                                var40_42 = var23_23;
                                var23_23 = var31_31;
                                var14_14 = new DS0$a(this, var27_27, (v50_0)var18_18 /* !! */ , (v50_0)var20_20 /* !! */ , (v50_0)var21_21 /* !! */ , (v50_0)var22_22 /* !! */ , var31_31);
                                var42_45.add(var14_14);
                                if (var27_27 == 0) {
                                    var27_27 = 0;
                                    var28_28 = 0.0f;
                                    var29_29 /* !! */  = null;
                                    var15_15 = 0;
                                    var16_16 /* !! */  = null;
                                    var17_17 = 0;
                                    var30_30 = 0.0f;
                                    var18_18 /* !! */  = null;
                                    var23_23 = 0;
                                    var47_58 /* !! */  = null;
                                    while (var23_23 < var13_13) {
                                        var19_19 = 1;
                                        var48_44 = 1.4E-45f;
                                        var27_27 += var19_19;
                                        var22_22 /* !! */  = var12_12 /* !! */ [var23_23];
                                        var26_26 = var41_43;
                                        var49_62 = var5_5.d0((Y50)var22_22 /* !! */ , var41_43);
                                        var20_20 /* !! */  = (int[])var22_22 /* !! */ .W;
                                        var50_64 = 0;
                                        var20_20 /* !! */  = (int[])var20_20 /* !! */ [0];
                                        var36_37 /* !! */  = var22_22 /* !! */ ;
                                        var22_22 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                                        if (var20_20 /* !! */  == var22_22 /* !! */ ) {
                                            // empty if block
                                        }
                                        var51_66 = ++var15_15;
                                        if ((var17_17 == var26_26 || (var15_15 = var5_5.W0 + var17_17 + var49_62) > var26_26) && (var16_16 /* !! */  = var14_14.b) != null) {
                                            var15_15 = 1;
                                        } else {
                                            var15_15 = 0;
                                            var16_16 /* !! */  = null;
                                        }
                                        if (var15_15 == 0 && var23_23 > 0 && (var19_19 = var5_5.b1) > 0 && var27_27 > var19_19) {
                                            var15_15 = 1;
                                        }
                                        if (var15_15 != 0) {
                                            var18_18 /* !! */  = var5_5.L;
                                            var20_20 /* !! */  = (int[])var5_5.M;
                                            var16_16 /* !! */  = var5_5.N;
                                            var29_29 /* !! */  = var5_5.O;
                                            var14_14 = var22_22 /* !! */ ;
                                            var43_48 /* !! */  = (int[])var29_29 /* !! */ ;
                                            var29_29 /* !! */  = this;
                                            var15_15 = var44_51;
                                            var41_43 = var26_26;
                                            var21_21 /* !! */  = var16_16 /* !! */ ;
                                            var52_67 = var22_22 /* !! */ ;
                                            var53_70 /* !! */  = var36_37 /* !! */ ;
                                            var22_22 /* !! */  = (Y50$b[])var43_48 /* !! */ ;
                                            var6_6 = var23_23;
                                            var23_23 = var26_26;
                                            var14_14 = new DS0$a(this, var44_51, (v50_0)var18_18 /* !! */ , (v50_0)var20_20 /* !! */ , (v50_0)var16_16 /* !! */ , (v50_0)var43_48 /* !! */ , var26_26);
                                            var14_14.n = var6_6;
                                            var35_35.add(var14_14);
                                            var17_17 = var49_62;
                                            var27_27 = 1;
                                            var28_28 = 1.4E-45f;
                                        } else {
                                            var41_43 = var26_26;
                                            var6_6 = var23_23;
                                            var53_70 /* !! */  = var36_37 /* !! */ ;
                                            var17_17 = var23_23 > 0 ? (var15_15 = var5_5.W0 + var49_62 + var17_17) : var49_62;
                                        }
                                        var14_14.a((Y50)var53_70 /* !! */ );
                                        var23_23 = var6_6 + 1;
                                        var6_6 = var1_1;
                                        var7_7 = var2_2;
                                        var8_8 = var3_3;
                                        var15_15 = var51_66;
                                    }
                                    while (true) {
                                        break;
                                    }
                                } else {
                                    var27_27 = 0;
                                    var28_28 = 0.0f;
                                    var29_29 /* !! */  = null;
                                    var15_15 = 0;
                                    var16_16 /* !! */  = null;
                                    var17_17 = 0;
                                    var30_30 = 0.0f;
                                    var18_18 /* !! */  = null;
                                    var6_6 = 0;
                                    var54_71 = null;
                                    while (true) {
                                        if (var6_6 >= var13_13) ** continue;
                                        var19_19 = 1;
                                        var48_44 = 1.4E-45f;
                                        var27_27 += var19_19;
                                        var52_67 = var12_12 /* !! */ [var6_6];
                                        var8_8 = var41_43;
                                        var49_62 = var5_5.c0((Y50)var52_67, var41_43);
                                        var21_21 /* !! */  = var52_67.W[var19_19];
                                        var20_20 /* !! */  = (int[])Y50$b.MATCH_CONSTRAINT;
                                        if (var21_21 /* !! */  == var20_20 /* !! */ ) {
                                            // empty if block
                                        }
                                        var50_64 = ++var15_15;
                                        if ((var17_17 == var8_8 || (var15_15 = var5_5.X0 + var17_17 + var49_62) > var8_8) && (var16_16 /* !! */  = var14_14.b) != null) {
                                            var15_15 = 1;
                                        } else {
                                            var15_15 = 0;
                                            var16_16 /* !! */  = null;
                                        }
                                        if (var15_15 == 0 && var6_6 > 0 && (var19_19 = var5_5.b1) > 0 && var27_27 > var19_19) {
                                            var15_15 = 1;
                                        }
                                        if (var15_15 != 0) {
                                            var18_18 /* !! */  = var5_5.L;
                                            var20_20 /* !! */  = (int[])var5_5.M;
                                            var21_21 /* !! */  = var5_5.N;
                                            var22_22 /* !! */  = var5_5.O;
                                            var14_14 = var47_58 /* !! */ ;
                                            var29_29 /* !! */  = this;
                                            var15_15 = var44_51;
                                            var41_43 = var24_24;
                                            var55_75 = var47_58 /* !! */ ;
                                            var23_23 = var8_8;
                                            var47_58 /* !! */  = new DS0$a(this, var44_51, (v50_0)var18_18 /* !! */ , (v50_0)var20_20 /* !! */ , (v50_0)var21_21 /* !! */ , (v50_0)var22_22 /* !! */ , var8_8);
                                            var47_58 /* !! */ .n = var6_6;
                                            var35_35.add(var47_58 /* !! */ );
                                            var17_17 = var49_62;
                                            var27_27 = 1;
                                            var28_28 = 1.4E-45f;
                                        } else {
                                            var41_43 = var24_24;
                                            var17_17 = var6_6 > 0 ? (var15_15 = var5_5.X0 + var49_62 + var17_17) : var49_62;
                                        }
                                        var14_14.a((Y50)var52_67);
                                        ++var6_6;
                                        var15_15 = var50_64;
                                        var24_24 = var41_43;
                                        var41_43 = var8_8;
                                    }
                                }
                                var8_8 = var41_43;
                                var41_43 = var24_24;
                                var10_10 = var35_35.size();
                                var27_27 = var5_5.D0;
                                var17_17 = var5_5.z0;
                                var19_19 = var5_5.E0;
                                var26_26 = var5_5.A0;
                                var22_22 /* !! */  = var5_5.W;
                                var23_23 = 0;
                                var54_71 = var22_22 /* !! */ [0];
                                var47_58 /* !! */  = Y50$b.WRAP_CONTENT;
                                if (var54_71 != var47_58 /* !! */  && (var22_22 /* !! */  = var22_22 /* !! */ [var6_6 = 1]) != var47_58 /* !! */ ) {
                                    var25_25 = 0;
                                    var22_22 /* !! */  = null;
                                } else {
                                    var25_25 = 1;
                                }
                                if (var15_15 > 0 && var25_25 != 0) {
                                    var16_16 /* !! */  = null;
                                    for (var15_15 = 0; var15_15 < var10_10; ++var15_15) {
                                        var22_22 /* !! */  = (DS0$a)var35_35.get(var15_15);
                                        if (var44_51 == 0) {
                                            var23_23 = var22_22 /* !! */ .d();
                                            var23_23 = var8_8 - var23_23;
                                            var22_22 /* !! */ .e(var23_23);
                                            continue;
                                        }
                                        var23_23 = var22_22 /* !! */ .c();
                                        var23_23 = var8_8 - var23_23;
                                        var22_22 /* !! */ .e(var23_23);
                                    }
                                }
                                var25_25 = var17_17;
                                var16_16 /* !! */  = var32_32;
                                var33_33 /* !! */  = var34_34;
                                var12_12 /* !! */  = var46_56;
                                var47_58 /* !! */  = null;
                                var6_6 = 0;
                                var54_71 = null;
                                var7_7 = 0;
                                var52_67 = null;
                                var17_17 = var27_27;
                                var29_29 /* !! */  = var45_53 /* !! */ ;
                                for (var23_23 = 0; var23_23 < var10_10; ++var23_23) {
                                    var55_75 = (DS0$a)var35_35.get(var23_23);
                                    if (var44_51 == 0) {
                                        var26_26 = var10_10 + -1;
                                        if (var23_23 < var26_26) {
                                            var26_26 = var23_23 + 1;
                                            var12_12 /* !! */  = ((DS0$a)var35_35.get((int)var26_26)).b.M;
                                            var56_77 = var35_35;
                                            var26_26 = 0;
                                            var21_21 /* !! */  = null;
                                        } else {
                                            var26_26 = var5_5.A0;
                                            var56_77 = var35_35;
                                            var12_12 /* !! */  = var46_56;
                                        }
                                        var35_35 = var55_75.b.O;
                                        var31_31 = var44_51;
                                        var45_53 /* !! */  = var29_29 /* !! */ ;
                                        var36_37 /* !! */  = var16_16 /* !! */ ;
                                        var42_45 = var33_33 /* !! */ ;
                                        var43_48 /* !! */  = (int[])var12_12 /* !! */ ;
                                        var55_75.f(var44_51, (v50_0)var29_29 /* !! */ , (v50_0)var16_16 /* !! */ , (v50_0)var33_33 /* !! */ , (v50_0)var12_12 /* !! */ , var17_17, var25_25, var19_19, var26_26, var8_8);
                                        var15_15 = var55_75.d();
                                        var15_15 = Math.max(var6_6, var15_15);
                                        var25_25 = var55_75.c() + var7_7;
                                        if (var23_23 > 0) {
                                            var6_6 = var5_5.X0;
                                            var25_25 += var6_6;
                                        }
                                        var6_6 = var15_15;
                                        var7_7 = var25_25;
                                        var16_16 /* !! */  = var35_35;
                                        var35_35 = var56_77;
                                        var25_25 = 0;
                                        var22_22 /* !! */  = null;
                                        var57_79 = var10_10;
                                    } else {
                                        var56_77 = var35_35;
                                        var19_19 = var10_10 + -1;
                                        if (var23_23 < var19_19) {
                                            var19_19 = var23_23 + 1;
                                            var20_20 /* !! */  = (int[])((DS0$a)var35_35.get((int)var19_19)).b.L;
                                            var57_79 = var10_10;
                                            var33_33 /* !! */  = var20_20 /* !! */ ;
                                            var19_19 = 0;
                                            var48_44 = 0.0f;
                                            var20_20 /* !! */  = null;
                                        } else {
                                            var19_19 = var5_5.E0;
                                            var57_79 = var10_10;
                                            var33_33 /* !! */  = var34_34;
                                        }
                                        var14_14 = var55_75.b.N;
                                        var31_31 = var44_51;
                                        var45_53 /* !! */  = var29_29 /* !! */ ;
                                        var36_37 /* !! */  = var16_16 /* !! */ ;
                                        var42_45 = var33_33 /* !! */ ;
                                        var43_48 /* !! */  = (int[])var12_12 /* !! */ ;
                                        var55_75.f(var44_51, (v50_0)var29_29 /* !! */ , (v50_0)var16_16 /* !! */ , (v50_0)var33_33 /* !! */ , (v50_0)var12_12 /* !! */ , var17_17, var25_25, var19_19, var26_26, var8_8);
                                        var27_27 = var55_75.d() + var6_6;
                                        var17_17 = var55_75.c();
                                        var17_17 = Math.max(var7_7, var17_17);
                                        if (var23_23 > 0) {
                                            var6_6 = var5_5.W0;
                                            var27_27 += var6_6;
                                        }
                                        var6_6 = var27_27;
                                        var7_7 = var17_17;
                                        var17_17 = 0;
                                        var30_30 = 0.0f;
                                        var18_18 /* !! */  = null;
                                        var29_29 /* !! */  = var14_14;
                                    }
                                    var10_10 = var57_79;
                                }
                                var14_14 = null;
                                var37_39 /* !! */ [0] = var6_6;
                                var10_10 = 1;
                                var37_39 /* !! */ [var10_10] = var7_7;
                                ** GOTO lbl131
                            }
                            var37_39 /* !! */  = var20_20 /* !! */ ;
                            var38_40 = var26_26;
                            var39_41 = var25_25;
                            var40_42 = var23_23;
                            var41_43 = var24_24;
                            var8_8 = var15_15;
                            var10_10 = var5_5.c1;
                            if (var10_10 != 0) ** GOTO lbl439
                            var27_27 = var5_5.b1;
                            if (var27_27 <= 0) {
                                var28_28 = 0.0f;
                                var29_29 /* !! */  = null;
                                var15_15 = 0;
                                var16_16 /* !! */  = null;
                                var17_17 = 0;
                                var30_30 = 0.0f;
                                var18_18 /* !! */  = null;
                                for (var27_27 = 0; var27_27 < var13_13; ++var27_27) {
                                    if (var27_27 > 0) {
                                        var19_19 = var5_5.W0;
                                        var15_15 += var19_19;
                                    }
                                    if ((var20_20 /* !! */  = (int[])var12_12 /* !! */ [var27_27]) == null) continue;
                                    var19_19 = var5_5.d0((Y50)var20_20 /* !! */ , var8_8) + var15_15;
                                    if (var19_19 > var8_8) break;
                                    ++var17_17;
                                    var15_15 = var19_19;
                                }
lbl432:
                                // 3 sources

                                while (true) {
                                    var27_27 = 0;
                                    var28_28 = 0.0f;
                                    var29_29 /* !! */  = null;
                                    break;
                                }
                            } else {
                                var17_17 = var27_27;
                                ** continue;
lbl439:
                                // 1 sources

                                var27_27 = var5_5.b1;
                                if (var27_27 <= 0) {
                                    var28_28 = 0.0f;
                                    var29_29 /* !! */  = null;
                                    var15_15 = 0;
                                    var16_16 /* !! */  = null;
                                    var17_17 = 0;
                                    var30_30 = 0.0f;
                                    var18_18 /* !! */  = null;
                                    for (var27_27 = 0; var27_27 < var13_13; ++var27_27) {
                                        if (var27_27 > 0) {
                                            var19_19 = var5_5.X0;
                                            var15_15 += var19_19;
                                        }
                                        if ((var20_20 /* !! */  = (int[])var12_12 /* !! */ [var27_27]) == null) continue;
                                        var19_19 = var5_5.c0((Y50)var20_20 /* !! */ , var8_8) + var15_15;
                                        if (var19_19 > var8_8) break;
                                        ++var17_17;
                                        var15_15 = var19_19;
                                    }
                                    var27_27 = var17_17;
                                }
                                var17_17 = 0;
                                var30_30 = 0.0f;
                                var18_18 /* !! */  = null;
                            }
                            var16_16 /* !! */  = (Y50$b[])var5_5.g1;
                            if (var16_16 /* !! */  == null) {
                                var15_15 = 2;
                                var16_16 /* !! */  = (Y50$b[])new int[var15_15];
                                var5_5.g1 = (int[])var16_16 /* !! */ ;
                            }
                            if (var27_27 == 0 && var10_10 == (var15_15 = 1) || var17_17 == 0 && var10_10 == 0) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    var15_15 = 1;
                                    break;
                                }
                            } else {
                                var15_15 = 0;
                                var16_16 /* !! */  = null;
                            }
                            while (var15_15 == 0) {
                                block129: {
                                    if (var10_10 == 0) {
                                        var28_28 = var13_13;
                                        var48_44 = var17_17;
                                        var58_81 = Math.ceil(var28_28 /= var48_44);
                                        var27_27 = (int)var58_81;
                                    } else {
                                        var30_30 = var13_13;
                                        var48_44 = var27_27;
                                        var60_82 = Math.ceil(var30_30 /= var48_44);
                                        var17_17 = (int)var60_82;
                                    }
                                    var20_20 /* !! */  = (int[])var5_5.f1;
                                    if (var20_20 /* !! */  != null && (var26_26 = var20_20 /* !! */ .length) >= var17_17) {
                                        var26_26 = 0;
                                        var21_21 /* !! */  = null;
                                        Arrays.fill((Object[])var20_20 /* !! */ , null);
                                    } else {
                                        var26_26 = 0;
                                        var21_21 /* !! */  = null;
                                        var20_20 /* !! */  = (int[])new Y50[var17_17];
                                        var5_5.f1 = (Y50[])var20_20 /* !! */ ;
                                    }
                                    var20_20 /* !! */  = (int[])var5_5.e1;
                                    if (var20_20 /* !! */  != null && (var25_25 = var20_20 /* !! */ .length) >= var27_27) {
                                        Arrays.fill((Object[])var20_20 /* !! */ , null);
                                    } else {
                                        var20_20 /* !! */  = (int[])new Y50[var27_27];
                                        var5_5.e1 = (Y50[])var20_20 /* !! */ ;
                                    }
                                    var48_44 = 0.0f;
                                    var20_20 /* !! */  = null;
                                    for (var19_19 = 0; var19_19 < var17_17; ++var19_19) {
                                        var21_21 /* !! */  = null;
                                        for (var26_26 = 0; var26_26 < var27_27; ++var26_26) {
                                            var25_25 = var26_26 * var17_17 + var19_19;
                                            var23_23 = 1;
                                            if (var10_10 == var23_23) {
                                                var25_25 = var19_19 * var27_27 + var26_26;
                                            }
                                            if (var25_25 >= (var23_23 = var12_12 /* !! */ .length) || (var22_22 /* !! */  = var12_12 /* !! */ [var25_25]) == null) continue;
                                            var23_23 = var5_5.d0((Y50)var22_22 /* !! */ , var8_8);
                                            var54_72 = var5_5.f1[var19_19];
                                            if (var54_72 == null || (var6_6 = var54_72.v()) < var23_23) {
                                                var47_59 = var5_5.f1;
                                                var47_59[var19_19] = var22_22 /* !! */ ;
                                            }
                                            var23_23 = var5_5.c0((Y50)var22_22 /* !! */ , var8_8);
                                            var54_72 = var5_5.e1[var26_26];
                                            if (var54_72 != null && (var6_6 = var54_72.p()) >= var23_23) continue;
                                            var47_59 = var5_5.e1;
                                            var47_59[var26_26] = var22_22 /* !! */ ;
                                        }
                                    }
                                    var48_44 = 0.0f;
                                    var20_20 /* !! */  = null;
                                    var26_26 = 0;
                                    var21_21 /* !! */  = null;
                                    for (var19_19 = 0; var19_19 < var17_17; ++var19_19) {
                                        var22_22 /* !! */  = var5_5.f1[var19_19];
                                        if (var22_22 /* !! */  == null) continue;
                                        if (var19_19 > 0) {
                                            var23_23 = var5_5.W0;
                                            var26_26 += var23_23;
                                        }
                                        var26_26 = var25_25 = var5_5.d0((Y50)var22_22 /* !! */ , var8_8) + var26_26;
                                    }
                                    var48_44 = 0.0f;
                                    var20_20 /* !! */  = null;
                                    var25_25 = 0;
                                    var22_22 /* !! */  = null;
                                    for (var19_19 = 0; var19_19 < var27_27; ++var19_19) {
                                        var47_59 = var5_5.e1[var19_19];
                                        if (var47_59 == null) continue;
                                        if (var19_19 > 0) {
                                            var6_6 = var5_5.X0;
                                            var25_25 += var6_6;
                                        }
                                        var25_25 = var23_23 = var5_5.c0((Y50)var47_59, var8_8) + var25_25;
                                    }
                                    var20_20 /* !! */  = null;
                                    var37_39 /* !! */ [0] = var26_26;
                                    var19_19 = 1;
                                    var48_44 = 1.4E-45f;
                                    var37_39 /* !! */ [var19_19] = var25_25;
                                    if (var10_10 != 0) break block129;
                                    if (var26_26 <= var8_8 || var17_17 <= var19_19) ** GOTO lbl-1000
                                    var17_17 += -1;
                                    continue;
                                }
                                if (var25_25 > var8_8 && var27_27 > var19_19) ** break;
                                ** continue;
                                var27_27 += -1;
                            }
                            var19_19 = 1;
                            var48_44 = 1.4E-45f;
                            var14_14 = var5_5.g1;
                            var15_15 = 0;
                            var16_16 /* !! */  = null;
                            var14_14[0] = (Y50)var17_17;
                            var14_14[var19_19] = (Y50)var27_27;
                            ** GOTO lbl131
                        }
                        var37_39 /* !! */  = var20_20 /* !! */ ;
                        var38_40 = var26_26;
                        var39_41 = var25_25;
                        var40_42 = var23_23;
                        var46_57 = var35_35;
                        var41_43 = var24_24;
                        var8_8 = var15_15;
                        var45_54 /* !! */  = var29_29 /* !! */ ;
                        var32_32 = var16_16 /* !! */ ;
                        var35_35 = var18_18 /* !! */ ;
                        var6_6 = var5_5.c1;
                        if (var11_11 == 0) ** GOTO lbl131
                        var18_18 /* !! */ .clear();
                        var18_18 /* !! */  = var5_5.L;
                        var20_20 /* !! */  = (int[])var5_5.M;
                        var21_21 /* !! */  = var5_5.N;
                        var22_22 /* !! */  = var5_5.O;
                        var14_14 = var52_68;
                        var29_29 /* !! */  = this;
                        var15_15 = var6_6;
                        var23_23 = var31_31;
                        var52_68 = new DS0$a(this, var6_6, (v50_0)var18_18 /* !! */ , (v50_0)var20_20 /* !! */ , (v50_0)var21_21 /* !! */ , (v50_0)var22_22 /* !! */ , var31_31);
                        var35_35.add(var52_68);
                        if (var6_6 == 0) {
                            var10_10 = 0;
                            var14_14 = null;
                            var27_27 = 0;
                            var28_28 = 0.0f;
                            var29_29 /* !! */  = null;
                            var55_76 = null;
                            for (var24_24 = 0; var24_24 < var13_13; ++var24_24) {
                                var47_60 /* !! */  = var12_12 /* !! */ [var24_24];
                                var49_63 = var5_5.d0(var47_60 /* !! */ , var8_8);
                                var16_16 /* !! */  = var47_60 /* !! */ .W;
                                var17_17 = 0;
                                var30_30 = 0.0f;
                                var18_18 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                                if ((var16_16 /* !! */  = var16_16 /* !! */ [0]) == var18_18 /* !! */ ) {
                                    // empty if block
                                }
                                var50_65 = ++var10_10;
                                if ((var27_27 == var8_8 || (var10_10 = var5_5.W0 + var27_27 + var49_63) > var8_8) && (var14_14 = var52_68.b) != null) {
                                    var10_10 = 1;
                                } else {
                                    var10_10 = 0;
                                    var14_14 = null;
                                }
                                if (var10_10 == 0 && var24_24 > 0 && (var15_15 = var5_5.b1) > 0 && (var15_15 = var24_24 % var15_15) == 0) {
                                    var10_10 = 1;
                                }
                                if (var10_10 != 0) {
                                    var18_18 /* !! */  = var5_5.L;
                                    var20_20 /* !! */  = (int[])var5_5.M;
                                    var21_21 /* !! */  = var5_5.N;
                                    var22_22 /* !! */  = var5_5.O;
                                    var14_14 = var52_68;
                                    var29_29 /* !! */  = this;
                                    var15_15 = var6_6;
                                    var44_52 = var6_6;
                                    var54_73 /* !! */  = var47_60 /* !! */ ;
                                    var23_23 = var8_8;
                                    var52_68 = new DS0$a(this, var6_6, (v50_0)var18_18 /* !! */ , (v50_0)var20_20 /* !! */ , (v50_0)var21_21 /* !! */ , (v50_0)var22_22 /* !! */ , var8_8);
                                    var52_68.n = var24_24;
                                    var35_35.add(var52_68);
                                    while (true) {
                                        var27_27 = var49_63;
                                        break;
                                    }
                                } else {
                                    var44_52 = var6_6;
                                    var54_73 /* !! */  = var47_60 /* !! */ ;
                                    if (var24_24 <= 0) ** continue;
                                    var27_27 = var10_10 = var5_5.W0 + var49_63 + var27_27;
                                }
                                var52_68.a((Y50)var54_73 /* !! */ );
                                var10_10 = var50_65;
                                var6_6 = var44_52;
                            }
                            var44_52 = var6_6;
                        } else {
                            var44_52 = var6_6;
                            var10_10 = 0;
                            var14_14 = null;
                            var27_27 = 0;
                            var28_28 = 0.0f;
                            var29_29 /* !! */  = null;
                            var54_73 /* !! */  = null;
                            for (var6_6 = 0; var6_6 < var13_13; ++var6_6) {
                                var55_76 = var12_12 /* !! */ [var6_6];
                                var49_63 = var5_5.c0((Y50)var55_76, var8_8);
                                var16_16 /* !! */  = var55_76.W;
                                var17_17 = 1;
                                var30_30 = 1.4E-45f;
                                var18_18 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                                if ((var16_16 /* !! */  = var16_16 /* !! */ [var17_17]) == var18_18 /* !! */ ) {
                                    // empty if block
                                }
                                var50_65 = ++var10_10;
                                if ((var27_27 == var8_8 || (var10_10 = var5_5.X0 + var27_27 + var49_63) > var8_8) && (var14_14 = var52_68.b) != null) {
                                    var10_10 = 1;
                                } else {
                                    var10_10 = 0;
                                    var14_14 = null;
                                }
                                if (var10_10 == 0 && var6_6 > 0 && (var15_15 = var5_5.b1) > 0 && (var15_15 = var6_6 % var15_15) == 0) {
                                    var10_10 = 1;
                                }
                                if (var10_10 != 0) {
                                    var18_18 /* !! */  = var5_5.L;
                                    var20_20 /* !! */  = (int[])var5_5.M;
                                    var21_21 /* !! */  = var5_5.N;
                                    var22_22 /* !! */  = var5_5.O;
                                    var14_14 = var52_68;
                                    var29_29 /* !! */  = this;
                                    var15_15 = var44_52;
                                    var23_23 = var8_8;
                                    var52_68 = new DS0$a(this, var44_52, (v50_0)var18_18 /* !! */ , (v50_0)var20_20 /* !! */ , (v50_0)var21_21 /* !! */ , (v50_0)var22_22 /* !! */ , var8_8);
                                    var52_68.n = var6_6;
                                    var35_35.add(var52_68);
                                    while (true) {
                                        var27_27 = var49_63;
                                        break;
                                    }
                                } else {
                                    if (var6_6 <= 0) ** continue;
                                    var27_27 = var10_10 = var5_5.X0 + var49_63 + var27_27;
                                }
                                var52_68.a((Y50)var55_76);
                                var10_10 = var50_65;
                            }
                        }
                        var27_27 = var35_35.size();
                        var15_15 = var5_5.D0;
                        var17_17 = var5_5.z0;
                        var19_19 = var5_5.E0;
                        var26_26 = var5_5.A0;
                        var22_22 /* !! */  = var5_5.W;
                        var23_23 = 0;
                        var54_73 /* !! */  = var22_22 /* !! */ [0];
                        var47_60 /* !! */  = Y50$b.WRAP_CONTENT;
                        if (var54_73 /* !! */  != var47_60 /* !! */  && (var22_22 /* !! */  = var22_22 /* !! */ [var6_6 = 1]) != var47_60 /* !! */ ) {
                            var25_25 = 0;
                            var22_22 /* !! */  = null;
                        } else {
                            var25_25 = 1;
                        }
                        if (var10_10 > 0 && var25_25 != 0) {
                            var14_14 = null;
                            for (var10_10 = 0; var10_10 < var27_27; ++var10_10) {
                                var22_22 /* !! */  = (DS0$a)var35_35.get(var10_10);
                                if (var44_52 == 0) {
                                    var23_23 = var22_22 /* !! */ .d();
                                    var23_23 = var8_8 - var23_23;
                                    var22_22 /* !! */ .e(var23_23);
                                    continue;
                                }
                                var23_23 = var22_22 /* !! */ .c();
                                var23_23 = var8_8 - var23_23;
                                var22_22 /* !! */ .e(var23_23);
                            }
                        }
                        var25_25 = var17_17;
                        var14_14 = var45_54 /* !! */ ;
                        var33_33 /* !! */  = var34_34;
                        var12_12 /* !! */  = var46_57;
                        var47_60 /* !! */  = null;
                        var6_6 = 0;
                        var54_73 /* !! */  = null;
                        var7_7 = 0;
                        var52_68 = null;
                        var17_17 = var15_15;
                        var16_16 /* !! */  = var32_32;
                        for (var23_23 = 0; var23_23 < var27_27; ++var23_23) {
                            var55_76 = (DS0$a)var35_35.get(var23_23);
                            if (var44_52 == 0) {
                                var26_26 = var27_27 + -1;
                                if (var23_23 < var26_26) {
                                    var26_26 = var23_23 + 1;
                                    var12_12 /* !! */  = ((DS0$a)var35_35.get((int)var26_26)).b.M;
                                    var56_78 = var35_35;
                                    var26_26 = 0;
                                    var21_21 /* !! */  = null;
                                } else {
                                    var26_26 = var5_5.A0;
                                    var56_78 = var35_35;
                                    var12_12 /* !! */  = var46_57;
                                }
                                var35_35 = var55_76.b.O;
                                var31_31 = var44_52;
                                var45_54 /* !! */  = var14_14;
                                var36_37 /* !! */  = var16_16 /* !! */ ;
                                var42_46 /* !! */  = var33_33 /* !! */ ;
                                var43_49 /* !! */  = var12_12 /* !! */ ;
                                var55_76.f(var44_52, (v50_0)var14_14, (v50_0)var16_16 /* !! */ , (v50_0)var33_33 /* !! */ , (v50_0)var12_12 /* !! */ , var17_17, var25_25, var19_19, var26_26, var8_8);
                                var15_15 = var55_76.d();
                                var15_15 = Math.max(var6_6, var15_15);
                                var25_25 = var55_76.c() + var7_7;
                                if (var23_23 > 0) {
                                    var6_6 = var5_5.X0;
                                    var25_25 += var6_6;
                                }
                                var6_6 = var15_15;
                                var7_7 = var25_25;
                                var16_16 /* !! */  = var35_35;
                                var35_35 = var56_78;
                                var25_25 = 0;
                                var22_22 /* !! */  = null;
                                var57_80 = var27_27;
                            } else {
                                var56_78 = var35_35;
                                var19_19 = var27_27 + -1;
                                if (var23_23 < var19_19) {
                                    var19_19 = var23_23 + 1;
                                    var20_20 /* !! */  = (int[])((DS0$a)var35_35.get((int)var19_19)).b.L;
                                    var57_80 = var27_27;
                                    var33_33 /* !! */  = var20_20 /* !! */ ;
                                    var19_19 = 0;
                                    var48_44 = 0.0f;
                                    var20_20 /* !! */  = null;
                                } else {
                                    var19_19 = var5_5.E0;
                                    var57_80 = var27_27;
                                    var33_33 /* !! */  = var34_34;
                                }
                                var29_29 /* !! */  = var55_76.b.N;
                                var31_31 = var44_52;
                                var45_54 /* !! */  = var14_14;
                                var36_37 /* !! */  = var16_16 /* !! */ ;
                                var42_46 /* !! */  = var33_33 /* !! */ ;
                                var43_49 /* !! */  = var12_12 /* !! */ ;
                                var55_76.f(var44_52, (v50_0)var14_14, (v50_0)var16_16 /* !! */ , (v50_0)var33_33 /* !! */ , (v50_0)var12_12 /* !! */ , var17_17, var25_25, var19_19, var26_26, var8_8);
                                var10_10 = var55_76.d() + var6_6;
                                var17_17 = var55_76.c();
                                var17_17 = Math.max(var7_7, var17_17);
                                if (var23_23 > 0) {
                                    var6_6 = var5_5.W0;
                                    var10_10 += var6_6;
                                }
                                var6_6 = var10_10;
                                var14_14 = var29_29 /* !! */ ;
                                var7_7 = var17_17;
                                var17_17 = 0;
                                var30_30 = 0.0f;
                                var18_18 /* !! */  = null;
                            }
                            var27_27 = var57_80;
                        }
                        var14_14 = null;
                        var37_39 /* !! */ [0] = var6_6;
                        var10_10 = 1;
                        var37_39 /* !! */ [var10_10] = var7_7;
                        ** GOTO lbl131
                    }
                    var35_36 = var18_18 /* !! */ ;
                    var37_39 /* !! */  = var20_20 /* !! */ ;
                    var38_40 = var26_26;
                    var39_41 = var25_25;
                    var40_42 = var23_23;
                    var41_43 = var24_24;
                    var8_8 = var15_15;
                    var15_15 = var5_5.c1;
                    if (var11_11 != 0) ** break;
                    ** while (true)
                    var10_10 = var18_18 /* !! */ .size();
                    if (var10_10 == 0) {
                        var18_18 /* !! */  = var5_5.L;
                        var20_20 /* !! */  = (int[])var5_5.M;
                        var21_21 /* !! */  = var5_5.N;
                        var22_22 /* !! */  = var5_5.O;
                        var14_14 = var54_74;
                        var29_29 /* !! */  = this;
                        var23_23 = var31_31;
                        var54_74 = new DS0$a(this, var15_15, (v50_0)var18_18 /* !! */ , (v50_0)var20_20 /* !! */ , (v50_0)var21_21 /* !! */ , (v50_0)var22_22 /* !! */ , var31_31);
                        var35_36.add(var54_74);
                    } else {
                        var14_14 = null;
                        var29_29 /* !! */  = var18_18 /* !! */ .get(0);
                        var54_74 = var29_29 /* !! */ ;
                        var54_74 = (DS0$a)var29_29 /* !! */ ;
                        var54_74.c = 0;
                        var28_28 = 0.0f;
                        var29_29 /* !! */  = null;
                        var54_74.b = null;
                        var54_74.l = 0;
                        var54_74.m = 0;
                        var54_74.n = 0;
                        var54_74.o = 0;
                        var54_74.p = 0;
                        var10_10 = var5_5.D0;
                        var27_27 = var5_5.z0;
                        var17_17 = var5_5.E0;
                        var19_19 = var5_5.A0;
                        var21_21 /* !! */  = var5_5.N;
                        var22_22 /* !! */  = var5_5.O;
                        var47_61 = var5_5.L;
                        var52_69 = var5_5.M;
                        var31_31 = var15_15;
                        var45_55 = var47_61;
                        var36_38 = var52_69;
                        var42_47 /* !! */  = var21_21 /* !! */ ;
                        var43_50 /* !! */  = var22_22 /* !! */ ;
                        var54_74.f(var15_15, var47_61, var52_69, (v50_0)var21_21 /* !! */ , (v50_0)var22_22 /* !! */ , var10_10, var27_27, var17_17, var19_19, var8_8);
                    }
                    var14_14 = null;
                    for (var10_10 = 0; var10_10 < var13_13; ++var10_10) {
                        var29_29 /* !! */  = var12_12 /* !! */ [var10_10];
                        var54_74.a((Y50)var29_29 /* !! */ );
                    }
                    var10_10 = var54_74.d();
                    var27_27 = 0;
                    var28_28 = 0.0f;
                    var29_29 /* !! */  = null;
                    var37_39 /* !! */ [0] = var10_10;
                    var10_10 = var54_74.c();
                    var15_15 = 1;
                    var37_39 /* !! */ [var15_15] = var10_10;
                }
                var10_10 = var37_39 /* !! */ [0] + var41_43 + var40_42;
                var17_17 = var37_39 /* !! */ [var15_15] + var39_41 + var38_40;
                var19_19 = -1 << -1;
                var48_44 = -0.0f;
                var26_26 = 0x40000000;
                var25_25 = var1_1;
                if (var1_1 == var26_26) {
                    var10_10 = var2_2;
lbl876:
                    // 3 sources

                    while (true) {
                        var25_25 = var3_3;
                        break block125;
                        break;
                    }
                }
                if (var1_1 != var19_19) break block130;
                var23_23 = var2_2;
                var10_10 = Math.min(var10_10, var2_2);
                ** GOTO lbl876
            }
            if (var1_1 != 0) ** break;
            ** while (true)
            var25_25 = var3_3;
            var10_10 = 0;
            var14_14 = null;
        }
        if (var25_25 == var26_26) {
            var17_17 = var4_4;
        } else if (var25_25 == var19_19) {
            var19_19 = var4_4;
            var17_17 = Math.min(var17_17, var4_4);
        } else if (var25_25 != 0) {
            var17_17 = 0;
            var30_30 = 0.0f;
            var18_18 /* !! */  = null;
        }
        var5_5.G0 = var10_10;
        var5_5.H0 = var17_17;
        var5_5.W(var10_10);
        var5_5.R(var17_17);
        var10_10 = var5_5.y0;
        if (var10_10 > 0) {
            var11_11 = 1;
        } else {
            var11_11 = 0;
            var12_12 /* !! */  = null;
        }
        var5_5.F0 = var11_11;
    }

    public final int c0(Y50 y50, int n3) {
        if (y50 == null) {
            return 0;
        }
        Object object = y50.W;
        int n4 = 1;
        Object object2 = Y50$b.MATCH_CONSTRAINT;
        if ((object = object[n4]) == object2) {
            int n7 = y50.u;
            if (n7 == 0) {
                return 0;
            }
            int n8 = 2;
            if (n7 == n8) {
                float f5 = y50.B;
                float f6 = n3;
                n7 = y50.p();
                if ((n3 = (int)(f5 *= f6)) != n7) {
                    y50.g = n4;
                    object = y50.W;
                    Y50$b y50$b = object[0];
                    int n10 = y50.v();
                    Y50$b y50$b2 = Y50$b.FIXED;
                    object2 = this;
                    this.b0(y50, y50$b, n10, y50$b2, n3);
                }
                return n3;
            }
            if (n7 == n4) {
                return y50.p();
            }
            n3 = 3;
            float f7 = 4.2E-45f;
            if (n7 == n3) {
                f7 = y50.v();
                float f8 = y50.a0;
                return (int)(f7 * f8 + 0.5f);
            }
        }
        return y50.p();
    }

    public final int d0(Y50 y50, int n3) {
        int n4 = 0;
        float f5 = 0.0f;
        Y50$b[] y50$bArray = null;
        if (y50 == null) {
            return 0;
        }
        Y50$b y50$b = y50.W[0];
        Y50$b y50$b2 = Y50$b.MATCH_CONSTRAINT;
        if (y50$b == y50$b2) {
            int n7 = y50.t;
            if (n7 == 0) {
                return 0;
            }
            n4 = 2;
            f5 = 2.8E-45f;
            int n8 = 1;
            if (n7 == n4) {
                f5 = y50.y;
                float f6 = n3;
                n4 = y50.v();
                if ((n3 = (int)(f5 *= f6)) != n4) {
                    y50.g = n8;
                    Y50$b y50$b3 = Y50$b.FIXED;
                    y50$bArray = y50.W;
                    Y50$b y50$b4 = y50$bArray[n8];
                    int n10 = y50.p();
                    this.b0(y50, y50$b3, n3, y50$b4, n10);
                }
                return n3;
            }
            if (n7 == n8) {
                return y50.v();
            }
            n3 = 3;
            float f7 = 4.2E-45f;
            if (n7 == n3) {
                f7 = y50.p();
                float f8 = y50.a0;
                return (int)(f7 * f8 + 0.5f);
            }
        }
        return y50.v();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void f(Eu1 var1_1, boolean var2_2) {
        super.f((Eu1)var1_1, var2_2);
        var1_1 = this.X;
        var2_2 = false;
        var3_3 = 1;
        if (var1_1 == null) ** GOTO lbl-1000
        var1_1 = (Z50)var1_1;
        var4_4 = var1_1.C0;
        if (var4_4 != 0) {
            var4_4 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = 0;
            var1_1 = null;
        }
        var5_5 = this.a1;
        var6_6 = this.d1;
        if (var5_5 != 0) {
            if (var5_5 != var3_3) {
                var7_7 = 2;
                var8_9 = 2.8E-45f;
                if (var5_5 != var7_7) {
                    var7_7 = 3;
                    var8_9 = 4.2E-45f;
                    if (var5_5 == var7_7) {
                        var5_5 = var6_6.size();
                        var8_9 = 0.0f;
                        var9_11 = null;
                        for (var7_7 = 0; var7_7 < var5_5; ++var7_7) {
                            var10_14 = (DS0$a)var6_6.get(var7_7);
                            var11_17 = var5_5 + -1;
                            if (var7_7 == var11_17) {
                                var11_17 = 1;
                            } else {
                                var11_17 = 0;
                                var12_20 = null;
                            }
                            var10_14.b(var7_7, (boolean)var4_4, (boolean)var11_17);
                        }
                    }
                } else {
                    var13_23 /* !! */  = this.g1;
                    if (var13_23 /* !! */  != null && (var13_23 /* !! */  = (int[])this.f1) != null && (var13_23 /* !! */  = (int[])this.e1) != null) {
                        var13_23 /* !! */  = null;
                        for (var5_5 = 0; var5_5 < (var14_25 = this.i1); ++var5_5) {
                            var6_6 = this.h1[var5_5];
                            var6_6.I();
                        }
                        var13_23 /* !! */  = this.g1;
                        var14_25 = var13_23 /* !! */ [0];
                        var5_5 = var13_23 /* !! */ [var3_3];
                        var8_9 = this.Q0;
                        var15_26 = 0;
                        var10_15 = null;
                        var11_18 = 0;
                        var12_21 /* !! */  = null;
                        while (true) {
                            var16_27 = 8;
                            if (var11_18 >= var14_25) break;
                            if (var4_4 != 0) {
                                var7_7 = var14_25 - var11_18 - var3_3;
                                var17_28 = 1065353216;
                                var18_29 = this.Q0;
                                var19_30 = 1.0f - var18_29;
                            } else {
                                var19_30 = var8_9;
                                var7_7 = var11_18;
                            }
                            var20_31 /* !! */  = this.f1;
                            var9_12 = var20_31 /* !! */ [var7_7];
                            if (var9_12 != null && (var21_32 = var9_12.k0) != var16_27) {
                                var22_33 = var9_12.L;
                                if (var11_18 == 0) {
                                    var21_32 = this.D0;
                                    var23_34 = this.L;
                                    var9_12.j(var22_33, var23_34, var21_32);
                                    var9_12.o0 = var21_32 = this.K0;
                                    var9_12.h0 = var19_30;
                                }
                                if (var11_18 == (var21_32 = var14_25 + -1)) {
                                    var21_32 = this.E0;
                                    var23_34 = var9_12.N;
                                    var24_35 = this.N;
                                    var9_12.j(var23_34, var24_35, var21_32);
                                }
                                if (var11_18 > 0 && var10_15 != null) {
                                    var21_32 = this.W0;
                                    var23_34 = var10_15.N;
                                    var9_12.j(var22_33, var23_34, var21_32);
                                    var10_15.j(var23_34, var22_33, 0);
                                }
                                var10_15 = var9_12;
                            }
                            ++var11_18;
                            var8_9 = var19_30;
                        }
                        var1_1 = null;
                        for (var4_4 = 0; var4_4 < var5_5; ++var4_4) {
                            var9_12 = this.e1[var4_4];
                            if (var9_12 == null || (var11_18 = var9_12.k0) == var16_27) continue;
                            var12_21 /* !! */  = var9_12.M;
                            if (var4_4 == 0) {
                                var17_28 = this.z0;
                                var20_31 /* !! */  = this.M;
                                var9_12.j((v50_0)var12_21 /* !! */ , (v50_0)var20_31 /* !! */ , var17_28);
                                var9_12.p0 = var17_28 = this.L0;
                                var9_12.i0 = var19_30 = this.R0;
                            }
                            if (var4_4 == (var17_28 = var5_5 + -1)) {
                                var17_28 = this.A0;
                                var20_31 /* !! */  = var9_12.O;
                                var23_34 = this.O;
                                var9_12.j((v50_0)var20_31 /* !! */ , var23_34, var17_28);
                            }
                            if (var4_4 > 0 && var10_15 != null) {
                                var17_28 = this.X0;
                                var20_31 /* !! */  = var10_15.O;
                                var9_12.j((v50_0)var12_21 /* !! */ , (v50_0)var20_31 /* !! */ , var17_28);
                                var10_15.j((v50_0)var20_31 /* !! */ , (v50_0)var12_21 /* !! */ , 0);
                            }
                            var10_15 = var9_12;
                        }
                        var1_1 = null;
                        for (var4_4 = 0; var4_4 < var14_25; ++var4_4) {
                            var8_9 = 0.0f;
                            var9_12 = null;
                            for (var7_7 = 0; var7_7 < var5_5; ++var7_7) {
                                var15_26 = var7_7 * var14_25 + var4_4;
                                var11_18 = this.c1;
                                if (var11_18 == var3_3) {
                                    var15_26 = var4_4 * var5_5 + var7_7;
                                }
                                if (var15_26 >= (var17_28 = (var12_21 /* !! */  = this.h1).length) || (var10_15 = var12_21 /* !! */ [var15_26]) == null || (var11_18 = var10_15.k0) == var16_27) continue;
                                var12_21 /* !! */  = this.f1[var4_4];
                                var25_36 = this.e1[var7_7];
                                if (var10_15 != var12_21 /* !! */ ) {
                                    var20_31 /* !! */  = var12_21 /* !! */ .L;
                                    var23_34 = var10_15.L;
                                    var10_15.j(var23_34, (v50_0)var20_31 /* !! */ , 0);
                                    var20_31 /* !! */  = var10_15.N;
                                    var12_21 /* !! */  = var12_21 /* !! */ .N;
                                    var10_15.j((v50_0)var20_31 /* !! */ , (v50_0)var12_21 /* !! */ , 0);
                                }
                                if (var10_15 == var25_36) continue;
                                var12_21 /* !! */  = var25_36.M;
                                var20_31 /* !! */  = var10_15.M;
                                var10_15.j((v50_0)var20_31 /* !! */ , (v50_0)var12_21 /* !! */ , 0);
                                var12_21 /* !! */  = var10_15.O;
                                var25_36 = var25_36.O;
                                var10_15.j((v50_0)var12_21 /* !! */ , (v50_0)var25_36, 0);
                            }
                        }
                    }
                }
            } else {
                var5_5 = var6_6.size();
                var8_10 = 0.0f;
                var9_13 = null;
                for (var7_8 = 0; var7_8 < var5_5; ++var7_8) {
                    var10_16 = (DS0$a)var6_6.get(var7_8);
                    var11_19 = var5_5 + -1;
                    if (var7_8 == var11_19) {
                        var11_19 = 1;
                    } else {
                        var11_19 = 0;
                        var12_22 = null;
                    }
                    var10_16.b(var7_8, (boolean)var4_4, (boolean)var11_19);
                }
            }
        } else {
            var5_5 = var6_6.size();
            if (var5_5 > 0) {
                var13_24 = (DS0$a)var6_6.get(0);
                var13_24.b(0, (boolean)var4_4, (boolean)var3_3);
            }
        }
        this.F0 = false;
    }

    public final void k(Y50 y50, HashMap hashMap) {
        int n3;
        float f5;
        int n4;
        super.k(y50, hashMap);
        y50 = (ds0_1)y50;
        this.K0 = n4 = ((ds0_1)y50).K0;
        this.L0 = n4 = ((ds0_1)y50).L0;
        this.M0 = n4 = ((ds0_1)y50).M0;
        this.N0 = n4 = ((ds0_1)y50).N0;
        this.O0 = n4 = ((ds0_1)y50).O0;
        this.P0 = n4 = ((ds0_1)y50).P0;
        this.Q0 = f5 = ((ds0_1)y50).Q0;
        this.R0 = f5 = ((ds0_1)y50).R0;
        this.S0 = f5 = ((ds0_1)y50).S0;
        this.T0 = f5 = ((ds0_1)y50).T0;
        this.U0 = f5 = ((ds0_1)y50).U0;
        this.V0 = f5 = ((ds0_1)y50).V0;
        this.W0 = n4 = ((ds0_1)y50).W0;
        this.X0 = n4 = ((ds0_1)y50).X0;
        this.Y0 = n4 = ((ds0_1)y50).Y0;
        this.Z0 = n4 = ((ds0_1)y50).Z0;
        this.a1 = n4 = ((ds0_1)y50).a1;
        this.b1 = n4 = ((ds0_1)y50).b1;
        this.c1 = n3 = ((ds0_1)y50).c1;
    }
}

