/*
 * Decompiled with CFR 0.152.
 */
public final class DS0$a {
    public int a;
    public Y50 b = null;
    public int c = 0;
    public v50_0 d;
    public v50_0 e;
    public v50_0 f;
    public v50_0 g;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public final /* synthetic */ ds0_1 r;

    public DS0$a(ds0_1 ds0_12, int n3, v50_0 v50_02, v50_0 v50_03, v50_0 v50_04, v50_0 v50_05, int n4) {
        int n7;
        this.r = ds0_12;
        this.a = n3;
        this.d = v50_02;
        this.e = v50_03;
        this.f = v50_04;
        this.g = v50_05;
        this.h = n3 = ds0_12.D0;
        this.i = n3 = ds0_12.z0;
        this.j = n3 = ds0_12.E0;
        this.k = n7 = ds0_12.A0;
        this.q = n4;
    }

    public final void a(Y50 y50) {
        int n3;
        int n4 = this.a;
        int n7 = 8;
        int n8 = 1;
        int n10 = 0;
        ds0_1 ds0_12 = this.r;
        if (n4 == 0) {
            n4 = this.q;
            n4 = ds0_12.d0(y50, n4);
            Y50$b y50$b = y50.W[0];
            Y50$b y50$b2 = Y50$b.MATCH_CONSTRAINT;
            if (y50$b == y50$b2) {
                this.p = n4 = this.p + n8;
                n4 = 0;
            }
            int n14 = ds0_12.W0;
            int n15 = y50.k0;
            if (n15 != n7) {
                n10 = n14;
            }
            n7 = this.l;
            this.l = n4 = n4 + n10 + n7;
            n4 = this.q;
            n4 = ds0_12.c0(y50, n4);
            Y50 y502 = this.b;
            if (y502 == null || (n7 = this.c) < n4) {
                this.b = y50;
                this.c = n4;
                this.m = n4;
            }
        } else {
            n4 = this.q;
            n4 = ds0_12.d0(y50, n4);
            int n16 = this.q;
            n16 = ds0_12.c0(y50, n16);
            Y50$b y50$b = y50.W[n8];
            Y50$b y50$b3 = Y50$b.MATCH_CONSTRAINT;
            if (y50$b == y50$b3) {
                this.p = n16 = this.p + n8;
                n16 = 0;
                Object var7_8 = null;
            }
            int n17 = ds0_12.X0;
            int n18 = y50.k0;
            if (n18 != n7) {
                n10 = n17;
            }
            n7 = this.m;
            this.m = n16 = n16 + n10 + n7;
            Y50 y503 = this.b;
            if (y503 == null || (n7 = this.c) < n4) {
                this.b = y50;
                this.c = n4;
                this.l = n4;
            }
        }
        this.o = n3 = this.o + n8;
    }

    /*
     * Unable to fully structure code
     */
    public final void b(int var1_1, boolean var2_2, boolean var3_3) {
        block70: {
            block71: {
                var4_4 = this;
                var5_5 = this.o;
                var6_6 = 0;
                var7_7 = 0.0f;
                var8_8 = null;
                var9_9 = 0;
                var10_10 = null;
                while (true) {
                    var11_11 = var4_4.r;
                    if (var9_9 >= var5_5 || (var12_12 = var4_4.n + var9_9) >= (var13_13 = var11_11.i1)) break;
                    var11_11 = var11_11.h1[var12_12];
                    if (var11_11 != null) {
                        var11_11.I();
                    }
                    ++var9_9;
                }
                if (var5_5 == 0 || (var10_10 = var4_4.b) == null) break block70;
                var12_12 = var3_3 != false && var1_1 == 0 ? 1 : 0;
                var13_13 = -1;
                var14_14 = 0.0f / 0.0f;
                var16_16 = null;
                var17_17 = -1;
                var18_18 = -1;
                for (var15_15 = 0; var15_15 < var5_5; ++var15_15) {
                    var19_19 = var2_2 != false ? var5_5 + -1 - var15_15 : var15_15;
                    var20_20 = var4_4.n + var19_19;
                    if (var20_20 >= (var19_19 = var11_11.i1)) break;
                    var21_21 = var11_11.h1[var20_20];
                    if (var21_21 == null || (var19_19 = var21_21.k0) != 0) continue;
                    if (var17_17 == var13_13) {
                        var17_17 = var15_15;
                    }
                    var18_18 = var15_15;
                }
                if ((var15_15 = var4_4.a) != 0) break block71;
                var16_16 = var4_4.b;
                var16_16.p0 = var20_20 = var11_11.L0;
                var20_20 = var4_4.i;
                if (var1_1 > 0) {
                    var22_22 = var11_11.X0;
                    var20_20 += var22_22;
                }
                var23_24 = var4_4.e;
                var24_26 = var16_16.M;
                var24_26.a((v50_0)var23_24, var20_20);
                var25_28 = var16_16.O;
                if (var3_3) {
                    var23_24 = var4_4.g;
                    var26_30 = var4_4.k;
                    var25_28.a((v50_0)var23_24, var26_30);
                }
                if (var1_1 > 0) {
                    var23_24 = var4_4.e.d.O;
                    var23_24.a(var24_26, 0);
                }
                var22_22 = var11_11.Z0;
                var26_30 = 3;
                var27_32 = 4.2E-45f;
                if (var22_22 == var26_30 && (var22_22 = (int)var16_16.G) == 0) {
                    var23_24 = null;
                    for (var22_22 = 0; var22_22 < var5_5; ++var22_22) {
                        var28_34 = var2_2 != false ? var5_5 + -1 - var22_22 : var22_22;
                        var19_19 = var4_4.n + var28_34;
                        if (var19_19 >= (var28_34 = var11_11.i1)) break;
                        var29_36 = var11_11.h1;
                        var21_21 = var29_36[var19_19];
                        var28_34 = (int)var21_21.G;
                        if (var28_34 == 0) {
                            continue;
                        }
                        break;
                    }
                } else {
                    var21_21 = var16_16;
                }
                var22_22 = 0;
                var23_24 = null;
                var29_36 = null;
                for (var28_34 = 0; var28_34 < var5_5 && (var26_30 = var4_4.n + (var30_37 = var2_2 != false ? var5_5 + -1 - var28_34 : var28_34)) < (var9_9 = var11_11.i1); ++var28_34) {
                    block73: {
                        block74: {
                            block77: {
                                block76: {
                                    block75: {
                                        block72: {
                                            var10_10 = var11_11.h1[var26_30];
                                            if (var10_10 != null) break block72;
                                            var31_39 = var5_5;
                                            var6_6 = 3;
                                            var7_7 = 4.2E-45f;
                                            break block73;
                                        }
                                        var32_41 = var10_10.L;
                                        if (var28_34 == 0) {
                                            var8_8 = var4_4.d;
                                            var13_13 = var4_4.h;
                                            var10_10.j(var32_41, var8_8, var13_13);
                                        }
                                        if (var30_37 != 0) break block74;
                                        var6_6 = var11_11.K0;
                                        var13_13 = 1065353216;
                                        var14_14 = 1.0f;
                                        if (var2_2) {
                                            var30_37 = var6_6;
                                            var7_7 = var11_11.Q0;
                                            var7_7 = var14_14 - var7_7;
                                        } else {
                                            var30_37 = var6_6;
                                            var7_7 = var11_11.Q0;
                                        }
                                        var13_13 = var4_4.n;
                                        if (var13_13 != 0) break block75;
                                        var13_13 = var11_11.M0;
                                        var33_43 = var7_7;
                                        var6_6 = -1;
                                        var7_7 = 0.0f / 0.0f;
                                        if (var13_13 == var6_6) break block76;
                                        if (var2_2) {
                                            var7_7 = var11_11.S0;
                                            var30_37 = 1065353216;
                                            var34_44 = 1.0f;
                                            var7_7 = var34_44 - var7_7;
                                        } else {
                                            var7_7 = var11_11.S0;
                                        }
                                        var14_14 = var7_7;
                                        var6_6 = var13_13;
                                        break block77;
                                    }
                                    var33_43 = var7_7;
                                }
                                if (!var3_3) ** GOTO lbl-1000
                                var6_6 = var11_11.O0;
                                var13_13 = -1;
                                var14_14 = 0.0f / 0.0f;
                                if (var6_6 != var13_13) {
                                    if (var2_2) {
                                        var14_14 = var11_11.U0;
                                        var30_37 = 1065353216;
                                        var34_44 = 1.0f;
                                        var14_14 = var34_44 - var14_14;
                                    } else {
                                        var14_14 = var11_11.U0;
                                    }
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var6_6 = var30_37;
                                    var14_14 = var33_43;
                                }
                            }
                            var10_10.o0 = var6_6;
                            var10_10.h0 = var14_14;
                        }
                        if (var28_34 == (var6_6 = var5_5 + -1)) {
                            var8_8 = var4_4.f;
                            var13_13 = var4_4.j;
                            var31_39 = var5_5;
                            var35_45 = var10_10.N;
                            var10_10.j(var35_45, var8_8, var13_13);
                        } else {
                            var31_39 = var5_5;
                        }
                        if (var23_24 != null) {
                            var5_5 = var11_11.W0;
                            var8_8 = var23_24.N;
                            var32_41.a(var8_8, var5_5);
                            if (var28_34 == var17_17) {
                                var5_5 = var4_4.h;
                                var13_13 = (int)var32_41.h();
                                if (var13_13 != 0) {
                                    var32_41.h = var5_5;
                                }
                            }
                            var35_45 = null;
                            var8_8.a(var32_41, 0);
                            var5_5 = 1;
                            var13_13 = var18_18 + 1;
                            if (var28_34 == var13_13) {
                                var5_5 = var4_4.j;
                                var13_13 = (int)var8_8.h();
                                if (var13_13 != 0) {
                                    var8_8.h = var5_5;
                                }
                            }
                        }
                        if (var10_10 != var16_16) {
                            var5_5 = var11_11.Z0;
                            var6_6 = 3;
                            var7_7 = 4.2E-45f;
                            if (var5_5 == var6_6 && (var13_13 = (int)var21_21.G) != 0 && var10_10 != var21_21 && (var13_13 = (int)var10_10.G) != 0) {
                                var35_45 = var10_10.P;
                                var36_47 = var21_21.P;
                                var22_22 = 0;
                                var23_24 = null;
                                var35_45.a(var36_47, 0);
                            } else {
                                var36_47 = var10_10.M;
                                if (var5_5 != 0) {
                                    var23_24 = var10_10.O;
                                    var26_30 = 1;
                                    var27_32 = 1.4E-45f;
                                    if (var5_5 != var26_30) {
                                        if (var12_12 != 0) {
                                            var35_45 = var4_4.e;
                                            var26_30 = var4_4.i;
                                            var36_47.a(var35_45, var26_30);
                                            var35_45 = var4_4.g;
                                            var13_13 = var4_4.k;
                                            var23_24.a(var35_45, var13_13);
                                        } else {
                                            var5_5 = 0;
                                            var35_45 = null;
                                            var36_47.a(var24_26, 0);
                                            var23_24.a(var25_28, 0);
                                        }
                                    } else {
                                        var5_5 = 0;
                                        var35_45 = null;
                                        var23_24.a(var25_28, 0);
                                    }
                                } else {
                                    var5_5 = 0;
                                    var35_45 = null;
                                    var36_47.a(var24_26, 0);
                                }
                            }
                        } else {
                            var6_6 = 3;
                            var7_7 = 4.2E-45f;
                        }
                        var23_24 = var10_10;
                    }
                    var5_5 = var31_39;
                    var6_6 = 0;
                    var7_7 = 0.0f;
                    var8_8 = null;
                    var13_13 = -1;
                    var14_14 = 0.0f / 0.0f;
                    var26_30 = 3;
                    var27_32 = 4.2E-45f;
                }
                break block70;
            }
            var31_40 = var5_5;
            var35_46 = var4_4.b;
            var35_46.o0 = var6_6 = var11_11.K0;
            var6_6 = var4_4.h;
            if (var1_1 > 0) {
                var9_9 = var11_11.W0;
                var6_6 += var9_9;
            }
            var10_10 = var35_46.L;
            var36_48 = var35_46.N;
            if (var2_2) {
                var16_16 = var4_4.f;
                var36_48.a((v50_0)var16_16, var6_6);
                if (var3_3) {
                    var8_8 = var4_4.d;
                    var15_15 = var4_4.j;
                    var10_10.a(var8_8, var15_15);
                }
                if (var1_1 > 0) {
                    var8_8 = var4_4.f.d.L;
                    var15_15 = 0;
                    var16_16 = null;
                    var8_8.a(var36_48, 0);
                }
            } else {
                var16_16 = var4_4.d;
                var10_10.a((v50_0)var16_16, var6_6);
                if (var3_3) {
                    var8_8 = var4_4.f;
                    var15_15 = var4_4.j;
                    var36_48.a(var8_8, var15_15);
                }
                if (var1_1 > 0) {
                    var8_8 = var4_4.d.d.N;
                    var15_15 = 0;
                    var16_16 = null;
                    var8_8.a((v50_0)var10_10, 0);
                }
            }
            var15_15 = var31_40;
            var7_7 = 0.0f;
            var8_8 = null;
            var19_19 = 0;
            var21_21 = null;
            for (var6_6 = 0; var6_6 < var15_15 && (var20_20 = var4_4.n + var6_6) < (var22_23 = var11_11.i1); ++var6_6) {
                block82: {
                    block78: {
                        block81: {
                            block80: {
                                block79: {
                                    var23_25 = var11_11.h1;
                                    var25_29 = var23_25[var20_20];
                                    if (var25_29 == null) {
                                        var37_49 = 0;
                                        var24_27 = null;
                                        var28_35 = 1;
                                        continue;
                                    }
                                    var23_25 = var25_29.M;
                                    if (var6_6 != 0) break block78;
                                    var24_27 = var4_4.e;
                                    var26_31 = var4_4.i;
                                    var25_29.j((v50_0)var23_25, var24_27, var26_31);
                                    var37_49 = var11_11.L0;
                                    var27_33 = var11_11.R0;
                                    var28_35 = var4_4.n;
                                    if (var28_35 != 0) break block79;
                                    var28_35 = var11_11.N0;
                                    var30_38 = var37_49;
                                    var37_49 = -1;
                                    if (var28_35 == var37_49) break block80;
                                    var27_33 = var11_11.T0;
                                    break block81;
                                }
                                var30_38 = var37_49;
                                var37_49 = -1;
                            }
                            if (var3_3 && (var28_35 = var11_11.P0) != var37_49) {
                                var27_33 = var11_11.V0;
                            } else {
                                var28_35 = var30_38;
                            }
                        }
                        var25_29.p0 = var28_35;
                        var25_29.i0 = var27_33;
                        break block82;
                    }
                    var37_49 = -1;
                }
                var26_31 = var15_15 + -1;
                if (var6_6 == var26_31) {
                    var32_42 = var4_4.g;
                    var28_35 = var4_4.k;
                    var24_27 = var25_29.O;
                    var25_29.j(var24_27, var32_42, var28_35);
                }
                if (var21_21 != null) {
                    var37_49 = var11_11.X0;
                    var21_21 = var21_21.O;
                    var23_25.a((v50_0)var21_21, var37_49);
                    if (var6_6 == var17_17) {
                        var37_49 = var4_4.i;
                        var26_31 = (int)var23_25.h();
                        if (var26_31 != 0) {
                            var23_25.h = var37_49;
                        }
                    }
                    var24_27 = null;
                    var21_21.a((v50_0)var23_25, 0);
                    var22_23 = 1;
                    var37_49 = var18_18 + 1;
                    if (var6_6 == var37_49) {
                        var22_23 = var4_4.k;
                        var37_49 = (int)var21_21.h();
                        if (var37_49 != 0) {
                            var21_21.h = var22_23;
                        }
                    }
                }
                if (var25_29 == var35_46) ** GOTO lbl334
                var21_21 = var25_29.N;
                var23_25 = var25_29.L;
                var37_49 = 2;
                if (var2_2) {
                    var26_31 = var11_11.Y0;
                    if (var26_31 != 0) {
                        var28_35 = 1;
                        if (var26_31 != var28_35) {
                            if (var26_31 == var37_49) {
                                var37_49 = 0;
                                var24_27 = null;
                                var23_25.a((v50_0)var10_10, 0);
                                var21_21.a(var36_48, 0);
                            }
                        } else {
                            var37_49 = 0;
                            var24_27 = null;
                            var23_25.a((v50_0)var10_10, 0);
                        }
                    } else {
                        var37_49 = 0;
                        var24_27 = null;
                        var21_21.a(var36_48, 0);
                    }
lbl334:
                    // 4 sources

                    var37_49 = 0;
                    var24_27 = null;
                    var28_35 = 1;
                } else {
                    var26_31 = var11_11.Y0;
                    if (var26_31 != 0) {
                        var28_35 = 1;
                        if (var26_31 != var28_35) {
                            if (var26_31 != var37_49) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var37_49 = 0;
                                    var24_27 = null;
                                    break;
                                }
                            } else {
                                if (var12_12 != 0) {
                                    var24_27 = var4_4.d;
                                    var26_31 = var4_4.h;
                                    var23_25.a(var24_27, var26_31);
                                    var23_25 = var4_4.f;
                                    var37_49 = var4_4.j;
                                    var21_21.a((v50_0)var23_25, var37_49);
                                    ** continue;
                                }
                                var37_49 = 0;
                                var24_27 = null;
                                var23_25.a((v50_0)var10_10, 0);
                                var21_21.a(var36_48, 0);
                            }
                        } else {
                            var37_49 = 0;
                            var24_27 = null;
                            var21_21.a(var36_48, 0);
                        }
                    } else {
                        var37_49 = 0;
                        var24_27 = null;
                        var28_35 = 1;
                        var23_25.a((v50_0)var10_10, 0);
                    }
                }
                var21_21 = var25_29;
            }
        }
    }

    public final int c() {
        int n3 = this.a;
        int n4 = 1;
        if (n3 == n4) {
            n3 = this.m;
            n4 = this.r.X0;
            return n3 - n4;
        }
        return this.m;
    }

    public final int d() {
        int n3 = this.a;
        if (n3 == 0) {
            n3 = this.l;
            int n4 = this.r.W0;
            return n3 - n4;
        }
        return this.l;
    }

    public final void e(int n3) {
        int n4;
        int n7;
        Object object;
        Y50$b y50$b;
        Object object2;
        int n8;
        Object object3;
        int n10;
        int n14;
        int n15 = this.p;
        if (n15 == 0) {
            return;
        }
        int n16 = this.o;
        n3 /= n15;
        n15 = 0;
        for (int i3 = 0; i3 < n16; ++i3) {
            Object object4;
            Object object5;
            n14 = this.n;
            n10 = n14 + i3;
            object3 = this.r;
            n8 = object3.i1;
            if (n10 >= n8) break;
            object2 = object3.h1;
            object2 = object2[n14 += i3];
            n14 = this.a;
            n8 = 1;
            if (n14 == 0) {
                if (object2 == null || (y50$b = (object = ((Y50)object2).W)[0]) != (object5 = Y50$b.MATCH_CONSTRAINT) || (n7 = ((Y50)object2).t) != 0) continue;
                y50$b = Y50$b.FIXED;
                object5 = object[n8];
                int n17 = ((Y50)object2).p();
                object = object3;
                object3 = y50$b;
                n8 = n3;
                y50$b = object5;
                n4 = n17;
                ((se3_0)object).b0((Y50)object2, (Y50$b)((Object)object3), n3, (Y50$b)((Object)object5), n17);
                continue;
            }
            if (object2 == null || (object4 = (object = ((Y50)object2).W)[n8]) != (y50$b = Y50$b.MATCH_CONSTRAINT) || (n8 = ((Y50)object2).u) != 0) continue;
            object4 = object[0];
            n7 = ((Y50)object2).v();
            object5 = Y50$b.FIXED;
            object = object3;
            object3 = object4;
            n8 = n7;
            y50$b = object5;
            n4 = n3;
            ((se3_0)object).b0((Y50)object2, (Y50$b)((Object)object4), n7, (Y50$b)((Object)object5), n3);
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        n3 = this.o;
        for (n16 = 0; n16 < n3; ++n16) {
            n14 = this.n + n16;
            object2 = this.r;
            int n18 = ((ds0_1)object2).i1;
            if (n14 >= n18) break;
            object3 = ((ds0_1)object2).h1;
            object = object3[n14];
            n18 = this.a;
            n8 = 8;
            if (n18 == 0) {
                n18 = ((Y50)object).v();
                n7 = ((ds0_1)object2).W0;
                n4 = ((Y50)object).k0;
                if (n4 == n8) {
                    n7 = 0;
                    y50$b = null;
                }
                n8 = this.l;
                this.l = n18 = n18 + n7 + n8;
                n18 = this.q;
                n10 = ((ds0_1)object2).c0((Y50)object, n18);
                object3 = this.b;
                if (object3 != null && (n18 = this.c) >= n10) continue;
                this.b = object;
                this.c = n10;
                this.m = n10;
                continue;
            }
            n18 = this.q;
            n18 = ((ds0_1)object2).d0((Y50)object, n18);
            n7 = this.q;
            n7 = ((ds0_1)object2).c0((Y50)object, n7);
            n10 = ((ds0_1)object2).X0;
            n4 = ((Y50)object).k0;
            if (n4 == n8) {
                n10 = 0;
                object2 = null;
            }
            n8 = this.m;
            this.m = n7 = n7 + n10 + n8;
            object2 = this.b;
            if (object2 != null && (n10 = this.c) >= n18) continue;
            this.b = object;
            this.c = n18;
            this.l = n18;
        }
    }

    public final void f(int n3, v50_0 v50_02, v50_0 v50_03, v50_0 v50_04, v50_0 v50_05, int n4, int n7, int n8, int n10, int n14) {
        this.a = n3;
        this.d = v50_02;
        this.e = v50_03;
        this.f = v50_04;
        this.g = v50_05;
        this.h = n4;
        this.i = n7;
        this.j = n8;
        this.k = n10;
        this.q = n14;
    }
}

