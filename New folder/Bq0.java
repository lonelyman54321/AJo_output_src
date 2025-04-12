/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

public final class Bq0 {
    public static final Zw$a a;

    static {
        Zw$a zw$a;
        a = zw$a = new Object();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean a(Y50 var0) {
        var1_1 /* !! */  = var0.W;
        var2_2 = false;
        var3_3 = var1_1 /* !! */ [0];
        var4_4 = 1;
        var1_1 /* !! */  = var1_1 /* !! */ [var4_4];
        var5_5 /* !! */  = var0.X;
        if (var5_5 /* !! */  != null) {
            var5_5 /* !! */  = (Z50)var5_5 /* !! */ ;
        } else {
            var6_6 = false;
            var5_5 /* !! */  = null;
        }
        if (var5_5 /* !! */  != null) {
            var5_5 /* !! */ .W[0];
            var7_7 = Y50$b.FIXED;
        }
        if (var5_5 /* !! */  != null) {
            var5_5 /* !! */  = var5_5 /* !! */ .W[var4_4];
        }
        if (var3_3 == (var5_5 /* !! */  = Y50$b.FIXED) || (var8_8 = var0.F()) != 0 || var3_3 == (var7_7 = Y50$b.WRAP_CONTENT) || var3_3 == (var7_7 = Y50$b.MATCH_CONSTRAINT) && (var9_9 = var0.t) == 0 && (var9_9 = (int)((cfr_temp_0 = (var10_10 = var0.a0) - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) == 0 && (var9_9 = (int)var0.y(0)) != 0) ** GOTO lbl-1000
        if (var3_3 != var7_7 || (var11_11 = var0.t) != var4_4) ** GOTO lbl-1000
        var11_11 = var0.v();
        if ((var11_11 = (int)var0.z(0, var11_11)) == 0) lbl-1000:
        // 2 sources

        {
            var11_11 = 0;
            var3_3 = null;
        } else lbl-1000:
        // 2 sources

        {
            var11_11 = 1;
        }
        if (var1_1 /* !! */  == var5_5 /* !! */  || (var6_6 = var0.G()) || var1_1 /* !! */  == (var5_5 /* !! */  = Y50$b.WRAP_CONTENT) || var1_1 /* !! */  == (var5_5 /* !! */  = Y50$b.MATCH_CONSTRAINT) && (var8_8 = var0.u) == 0 && (var8_8 = (int)((cfr_temp_1 = (var12_12 = var0.a0) - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) == 0 && (var8_8 = (int)var0.y(var4_4)) != 0) ** GOTO lbl-1000
        if (var1_1 /* !! */  != var5_5 /* !! */  || (var13_13 = var0.u) != var4_4) ** GOTO lbl-1000
        var13_13 = var0.p();
        if ((var13_13 = (int)var0.z(var4_4, var13_13)) == 0) lbl-1000:
        // 2 sources

        {
            var13_13 = 0;
            var1_1 /* !! */  = null;
        } else lbl-1000:
        // 2 sources

        {
            var13_13 = 1;
        }
        var14_14 = var0.a0;
        cfr_temp_2 = var14_14 - 0.0f;
        var15_15 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
        if (var15_15 > 0 && (var11_11 != 0 || var13_13 != 0)) {
            return (boolean)var4_4;
        }
        if (var11_11 != 0 && var13_13 != 0) {
            var2_2 = true;
        }
        return var2_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(int n3, Zw.b b2, Y50 y50, boolean bl2) {
        block26: {
            int n4;
            float f5;
            int n7;
            v50_0 v50_02;
            boolean bl3;
            int n8;
            Object object;
            int n10;
            Object object2;
            int n14;
            int n15;
            Object object3;
            Object object4;
            boolean bl4;
            boolean bl5;
            Y50 y502;
            Zw.b b3;
            block22: {
                b3 = b2;
                y502 = y50;
                bl5 = bl2;
                bl4 = y50.o;
                if (bl4) {
                    return;
                }
                bl4 = y50 instanceof Z50;
                if (!bl4 && (bl4 = y50.E()) && (bl4 = Bq0.a(y50))) {
                    object4 = new Object();
                    Z50.e0(y50, b2, (Zw$a)object4);
                }
                object4 = v50$a.LEFT;
                object4 = y502.n((v50$a)((Object)object4));
                object3 = v50$a.RIGHT;
                object3 = y502.n((v50$a)((Object)object3));
                int n16 = ((v50_0)object4).d();
                n15 = ((v50_0)object3).d();
                Object object5 = ((v50_0)object4).a;
                n14 = 0;
                object2 = null;
                if (object5 == null || !(bl4 = ((v50_0)object4).c)) break block22;
                object4 = ((HashSet)object5).iterator();
                while ((n10 = object4.hasNext()) != 0) {
                    block24: {
                        boolean bl6;
                        v50_0 v50_03;
                        Object object6;
                        block23: {
                            block25: {
                                object5 = (v50_0)object4.next();
                                object = ((v50_0)object5).d;
                                n8 = n3 + 1;
                                bl3 = Bq0.a((Y50)object);
                                boolean bl7 = ((Y50)object).E();
                                if (bl7 && bl3) {
                                    object6 = new Object();
                                    Z50.e0((Y50)object, b3, (Zw$a)object6);
                                }
                                object6 = ((Y50)object).L;
                                v50_03 = ((Y50)object).N;
                                if (object5 == object6 && (v50_02 = v50_03.f) != null && (bl6 = v50_02.c) || object5 == v50_03 && (v50_02 = ((v50_0)object6).f) != null && (bl6 = v50_02.c)) {
                                    bl6 = true;
                                } else {
                                    bl6 = false;
                                    v50_02 = null;
                                }
                                Y50$b y50$b = ((Y50)object).W[0];
                                object2 = Y50$b.MATCH_CONSTRAINT;
                                if (y50$b != object2 || bl3) break block23;
                                if (y50$b != object2 || (n10 = ((Y50)object).x) < 0 || (n10 = ((Y50)object).w) < 0) break block24;
                                n10 = ((Y50)object).k0;
                                n7 = 8;
                                if (n10 == n7) break block25;
                                n10 = ((Y50)object).t;
                                if (n10 != 0) break block24;
                                f5 = ((Y50)object).a0;
                                n7 = 0;
                                v50_03 = null;
                                float f6 = f5 - 0.0f;
                                n10 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                                if (n10 != 0) break block24;
                            }
                            if ((n10 = (int)(((Y50)object).C() ? 1 : 0)) == 0 && (n10 = (int)(((Y50)object).I ? 1 : 0)) == 0 && bl6 && (n10 = (int)(((Y50)object).C() ? 1 : 0)) == 0) {
                                Bq0.d(n8, y502, b3, (Y50)object, bl5);
                            }
                            break block24;
                        }
                        n14 = ((Y50)object).E();
                        if (n14 == 0) {
                            if (object5 == object6 && (object2 = v50_03.f) == null) {
                                n10 = ((v50_0)object6).e() + n16;
                                n7 = ((Y50)object).v() + n10;
                                ((Y50)object).P(n10, n7);
                                Bq0.b(n8, b3, (Y50)object, bl5);
                            } else if (object5 == v50_03 && (object5 = ((v50_0)object6).f) == null) {
                                n10 = v50_03.e();
                                n10 = n16 - n10;
                                n7 = ((Y50)object).v();
                                n7 = n10 - n7;
                                ((Y50)object).P(n7, n10);
                                Bq0.b(n8, b3, (Y50)object, bl5);
                            } else if (bl6 && (n10 = (int)(((Y50)object).C() ? 1 : 0)) == 0) {
                                Bq0.c(n8, b3, (Y50)object, bl5);
                            }
                        }
                    }
                    n14 = 0;
                    object2 = null;
                }
            }
            if (bl4 = y502 instanceof w11_0) {
                return;
            }
            object4 = ((v50_0)object3).a;
            if (object4 == null || (n4 = ((v50_0)object3).c) == 0) break block26;
            object4 = ((HashSet)object4).iterator();
            while ((n4 = object4.hasNext()) != 0) {
                v50_0 v50_04;
                boolean bl8;
                Y50 y503;
                block28: {
                    block31: {
                        block29: {
                            block32: {
                                block30: {
                                    Y50$b y50$b;
                                    block27: {
                                        v50_0 v50_05;
                                        v50_0 v50_06;
                                        object3 = (v50_0)object4.next();
                                        y503 = ((v50_0)object3).d;
                                        f5 = Float.MIN_VALUE;
                                        n7 = n3 + 1;
                                        n10 = Bq0.a(y503);
                                        n14 = y503.E();
                                        if (n14 != 0 && n10 != 0) {
                                            object2 = new Object();
                                            Z50.e0(y503, b3, (Zw$a)object2);
                                        }
                                        object2 = y503.L;
                                        v50_02 = y503.N;
                                        if (object3 == object2 && (v50_06 = v50_02.f) != null && (bl8 = v50_06.c) || object3 == v50_02 && (v50_05 = ((v50_0)object2).f) != null && (bl8 = v50_05.c)) {
                                            bl8 = true;
                                        } else {
                                            bl8 = false;
                                            Object var24_29 = null;
                                        }
                                        object = y503.W;
                                        n8 = 0;
                                        object = object[0];
                                        y50$b = Y50$b.MATCH_CONSTRAINT;
                                        if (object == y50$b && n10 == 0) break block27;
                                        n10 = 8;
                                        f5 = 1.1E-44f;
                                        object = null;
                                        bl3 = y503.E();
                                        if (bl3) {
                                            continue;
                                        }
                                        break block28;
                                    }
                                    if (object != y50$b || (n4 = y503.x) < 0 || (n4 = y503.w) < 0) break block29;
                                    n4 = y503.k0;
                                    n10 = 8;
                                    f5 = 1.1E-44f;
                                    if (n4 == n10) break block30;
                                    n4 = y503.t;
                                    if (n4 != 0) break block31;
                                    float f7 = y503.a0;
                                    object = null;
                                    float f8 = f7 - 0.0f;
                                    n4 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                                    if (n4 != 0) continue;
                                    break block32;
                                }
                                object = null;
                            }
                            if ((n4 = (int)(y503.C() ? 1 : 0)) != 0 || (n4 = (int)(y503.I ? 1 : 0)) != 0 || !bl8 || (n4 = (int)(y503.C() ? 1 : 0)) != 0) continue;
                            Bq0.d(n7, y502, b3, y503, bl5);
                            continue;
                        }
                        n10 = 8;
                        f5 = 1.1E-44f;
                    }
                    object = null;
                    continue;
                }
                if (object3 == object2 && (v50_04 = v50_02.f) == null) {
                    n4 = ((v50_0)object2).e() + n15;
                    n14 = y503.v() + n4;
                    y503.P(n4, n14);
                    Bq0.b(n7, b3, y503, bl5);
                    continue;
                }
                if (object3 == v50_02 && (object3 = ((v50_0)object2).f) == null) {
                    n4 = v50_02.e();
                    n4 = n15 - n4;
                    n14 = y503.v();
                    n14 = n4 - n14;
                    y503.P(n14, n4);
                    Bq0.b(n7, b3, y503, bl5);
                    continue;
                }
                if (!bl8 || (n4 = (int)(y503.C() ? 1 : 0)) != 0) continue;
                Bq0.c(n7, b3, y503, bl5);
            }
        }
        y502.o = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void c(int n3, Zw.b b2, Y50 y50, boolean bl2) {
        int n4;
        float f5 = y50.h0;
        v50_0 v50_02 = y50.L;
        v50_0 v50_03 = v50_02.f;
        int n7 = v50_03.d();
        v50_0 v50_04 = y50.N;
        v50_0 v50_05 = v50_04.f;
        int n8 = v50_05.d();
        int n10 = v50_02.e() + n7;
        int n14 = v50_04.e();
        n14 = n8 - n14;
        float f6 = 0.5f;
        if (n7 == n8) {
            n4 = 0x3F000000;
            f5 = 0.5f;
        } else {
            n7 = n10;
            n8 = n14;
        }
        n10 = y50.v();
        n14 = n8 - n7 - n10;
        if (n7 > n8) {
            n14 = n7 - n8 - n10;
        }
        if (n14 > 0) {
            float f7 = n14;
            f5 = f5 * f7 + f6;
        } else {
            float f8 = n14;
            f5 *= f8;
        }
        n4 = (int)f5;
        n14 = (n4 += n7) + n10;
        if (n7 > n8) {
            n14 = n4 - n10;
        }
        y50.P(n4, n14);
        Bq0.b(n3 + 1, b2, y50, bl2);
    }

    public static void d(int n3, Y50 y50, Zw.b b2, Y50 y502, boolean bl2) {
        float f5 = y502.h0;
        v50_0 v50_02 = y502.L;
        int n4 = v50_02.f.d();
        int n7 = v50_02.e() + n4;
        v50_0 v50_03 = y502.N;
        v50_0 v50_04 = v50_03.f;
        int n8 = v50_04.d();
        n4 = v50_03.e();
        if ((n8 -= n4) >= n7) {
            float f6;
            int n10;
            n4 = y502.v();
            int n14 = y502.k0;
            int n15 = 8;
            float f7 = 0.5f;
            if (n14 != n15) {
                n14 = y502.t;
                n15 = 2;
                if (n14 == n15) {
                    n4 = y50 instanceof Z50;
                    if (n4 != 0) {
                        n10 = y50.v();
                    } else {
                        y50 = y50.X;
                        n10 = y50.v();
                    }
                    float f8 = y502.h0 * f7;
                    f6 = n10;
                    n4 = (int)(f8 *= f6);
                } else if (n14 == 0) {
                    n4 = n8 - n7;
                }
                n4 = Math.max(y502.w, n4);
                n10 = y502.x;
                if (n10 > 0) {
                    n4 = Math.min(n10, n4);
                }
            }
            n8 = n8 - n7 - n4;
            f6 = n8;
            f5 = f5 * f6 + f7;
            n10 = (int)f5;
            y502.P(n7, n4 += (n7 += n10));
            Bq0.b(++n3, b2, y502, bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void e(int n3, Zw.b b2, Y50 y50) {
        int n4;
        float f5 = y50.i0;
        v50_0 v50_02 = y50.M;
        v50_0 v50_03 = v50_02.f;
        int n7 = v50_03.d();
        v50_0 v50_04 = y50.O;
        v50_0 v50_05 = v50_04.f;
        int n8 = v50_05.d();
        int n10 = v50_02.e() + n7;
        int n14 = v50_04.e();
        n14 = n8 - n14;
        int n15 = 0x3F000000;
        float f6 = 0.5f;
        if (n7 == n8) {
            n4 = 0x3F000000;
            f5 = 0.5f;
        } else {
            n7 = n10;
            n8 = n14;
        }
        n10 = y50.p();
        n14 = n8 - n7 - n10;
        if (n7 > n8) {
            n14 = n7 - n8 - n10;
        }
        if (n14 > 0) {
            float f7 = n14;
            f5 = f5 * f7 + f6;
        } else {
            float f8 = n14;
            f5 *= f8;
        }
        n4 = (int)f5;
        n14 = n7 + n4;
        n15 = n14 + n10;
        if (n7 > n8) {
            n14 = n7 - n4;
            n15 = n14 - n10;
        }
        y50.Q(n14, n15);
        Bq0.g(n3 + 1, b2, y50);
    }

    public static void f(int n3, Y50 y50, Zw.b b2, Y50 y502) {
        float f5 = y502.i0;
        v50_0 v50_02 = y502.M;
        int n4 = v50_02.f.d();
        int n7 = v50_02.e() + n4;
        v50_0 v50_03 = y502.O;
        v50_0 v50_04 = v50_03.f;
        int n8 = v50_04.d();
        n4 = v50_03.e();
        if ((n8 -= n4) >= n7) {
            float f6;
            int n10;
            n4 = y502.p();
            int n14 = y502.k0;
            int n15 = 8;
            float f7 = 0.5f;
            if (n14 != n15) {
                n14 = y502.u;
                n15 = 2;
                if (n14 == n15) {
                    n4 = y50 instanceof Z50;
                    if (n4 != 0) {
                        n10 = y50.p();
                    } else {
                        y50 = y50.X;
                        n10 = y50.p();
                    }
                    float f8 = f5 * f7;
                    f6 = n10;
                    n4 = (int)(f8 *= f6);
                } else if (n14 == 0) {
                    n4 = n8 - n7;
                }
                n4 = Math.max(y502.z, n4);
                n10 = y502.A;
                if (n10 > 0) {
                    n4 = Math.min(n10, n4);
                }
            }
            n8 = n8 - n7 - n4;
            f6 = n8;
            f5 = f5 * f6 + f7;
            n10 = (int)f5;
            y502.Q(n7, n4 += (n7 += n10));
            Bq0.g(++n3, b2, y502);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void g(int var0, Zw.b var1_1, Y50 var2_2) {
        block38: {
            block31: {
                var3_3 = var1_1;
                var4_5 = var2_2;
                var5_6 = var2_2.p;
                if (var5_6) {
                    return;
                }
                var5_6 = var2_2 instanceof Z50;
                if (!var5_6 && (var5_6 = var2_2.E()) && (var5_6 = Bq0.a(var2_2))) {
                    var6_7 = new Object();
                    Z50.e0(var2_2, var1_1, (Zw$a)var6_7);
                }
                var6_7 = v50$a.TOP;
                var6_7 = var4_5.n((v50$a)var6_7);
                var7_8 = v50$a.BOTTOM;
                var7_8 = var4_5.n((v50$a)var7_8);
                var8_9 = var6_7.d();
                var9_10 = var7_8.d();
                var10_11 = var6_7.a;
                var11_12 = 1;
                var12_13 = 8;
                if (var10_11 == null || !(var5_6 = var6_7.c)) break block31;
                var6_7 = var10_11.iterator();
                block2: while ((var13_14 = var6_7.hasNext()) != 0) {
                    block37: {
                        block36: {
                            block35: {
                                block33: {
                                    block32: {
                                        block34: {
                                            var10_11 = (v50_0)var6_7.next();
                                            var14_15 = var10_11.d;
                                            var15_16 = var0 + 1;
                                            var16_17 = Bq0.a((Y50)var14_15);
                                            var17_18 = var14_15.E();
                                            if (var17_18 && var16_17 != 0) {
                                                var18_19 = new Object();
                                                Z50.e0((Y50)var14_15, var3_3, (Zw$a)var18_19);
                                            }
                                            var18_19 = var14_15.M;
                                            var19_20 = var14_15.O;
                                            if (var10_11 == var18_19 && (var20_21 = var19_20.f) != null && (var21_22 = var20_21.c) != 0 || var10_11 == var19_20 && (var20_21 = var18_19.f) != null && (var21_22 = var20_21.c) != 0) {
                                                var21_22 = 1;
                                            } else {
                                                var21_22 = 0;
                                                var20_21 = null;
                                            }
                                            var22_23 /* !! */  = var14_15.W[var11_12];
                                            var23_24 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                                            if (var22_23 /* !! */  != var23_24 /* !! */  || var16_17 != 0) break block32;
                                            if (var22_23 /* !! */  != var23_24 /* !! */  || (var13_14 = var14_15.A) < 0 || (var13_14 = var14_15.z) < 0) break block33;
                                            var13_14 = var14_15.k0;
                                            if (var13_14 == var12_13) break block34;
                                            var13_14 = var14_15.u;
                                            if (var13_14 != 0) break block33;
                                            var24_25 = var14_15.a0;
                                            var11_12 = 0;
                                            var23_24 /* !! */  = null;
                                            cfr_temp_0 = var24_25 - 0.0f;
                                            var13_14 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                            if (var13_14 != 0) break block33;
                                        }
                                        if ((var13_14 = (int)var14_15.D()) == 0 && (var13_14 = (int)var14_15.I) == 0 && var21_22 != 0 && (var13_14 = (int)var14_15.D()) == 0) {
                                            Bq0.f(var15_16, (Y50)var4_5, var3_3, (Y50)var14_15);
                                            ** GOTO lbl60
                                        }
                                        break block33;
                                    }
                                    var11_12 = (int)var14_15.E();
                                    if (var11_12 == 0) break block35;
                                }
lbl61:
                                // 5 sources

                                while (true) {
                                    var11_12 = 1;
                                    continue block2;
                                    break;
                                }
                            }
                            if (var10_11 != var18_19 || (var23_24 /* !! */  = var19_20.f) != null) break block36;
                            var13_14 = var18_19.e() + var8_9;
                            var11_12 = var14_15.p() + var13_14;
                            var14_15.Q(var13_14, var11_12);
                            Bq0.g(var15_16, var3_3, (Y50)var14_15);
                            ** GOTO lbl61
                        }
                        if (var10_11 != var19_20 || (var10_11 = var18_19.f) != null) break block37;
                        var13_14 = var19_20.e();
                        var13_14 = var8_9 - var13_14;
                        var11_12 = var14_15.p();
                        var11_12 = var13_14 - var11_12;
                        var14_15.Q(var11_12, var13_14);
                        Bq0.g(var15_16, var3_3, (Y50)var14_15);
                        ** GOTO lbl61
                    }
                    if (var21_22 == 0 || (var13_14 = (int)var14_15.D()) != 0) ** GOTO lbl61
                    Bq0.e(var15_16, var3_3, (Y50)var14_15);
                    ** continue;
                }
            }
            if (var5_6 = var4_5 instanceof w11_0) {
                return;
            }
            var6_7 = var7_8.a;
            if (var6_7 == null || (var25_26 = var7_8.c) == 0) break block38;
            var6_7 = var6_7.iterator();
            while ((var25_26 = var6_7.hasNext()) != 0) {
                block39: {
                    var7_8 = (v50_0)var6_7.next();
                    var26_27 = var7_8.d;
                    var13_14 = var0 + 1;
                    var11_12 = Bq0.a((Y50)var26_27);
                    var21_22 = var26_27.E();
                    if (var21_22 != 0 && var11_12 != 0) {
                        var20_21 = new Object();
                        Z50.e0((Y50)var26_27, var3_3, (Zw$a)var20_21);
                    }
                    var20_21 = var26_27.M;
                    var22_23 /* !! */  = var26_27.O;
                    if (var7_8 == var20_21 && (var14_15 = var22_23 /* !! */ .f) != null && (var27_28 = var14_15.c) || var7_8 == var22_23 /* !! */  && (var14_15 = var20_21.f) != null && (var27_28 = var14_15.c)) {
                        var27_28 = true;
                    } else {
                        var27_28 = false;
                        var14_15 = null;
                    }
                    var28_29 /* !! */  = var26_27.W;
                    var16_17 = 1;
                    var28_29 /* !! */  = var28_29 /* !! */ [var16_17];
                    var29_30 = Y50$b.MATCH_CONSTRAINT;
                    if (var28_29 /* !! */  != var29_30 || var11_12 != 0) break block39;
                    if (var28_29 /* !! */  != var29_30 || (var25_26 = var26_27.A) < 0 || (var25_26 = var26_27.z) < 0) ** GOTO lbl-1000
                    var25_26 = var26_27.k0;
                    if (var25_26 != var12_13) {
                        var25_26 = var26_27.u;
                        ** if (var25_26 != 0) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            var30_31 = var26_27.a0;
                            var11_12 = 0;
                            var23_24 /* !! */  = null;
                            cfr_temp_1 = var30_31 - 0.0f;
                            var25_26 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                            if (var25_26 != 0) continue;
                            ** GOTO lbl129
                        }
                    }
                    ** GOTO lbl127
lbl-1000:
                    // 2 sources

                    {
                        var11_12 = 0;
                        var23_24 /* !! */  = null;
                        continue;
lbl127:
                        // 1 sources

                        var11_12 = 0;
                        var23_24 /* !! */  = null;
                    }
lbl129:
                    // 2 sources

                    if ((var25_26 = (int)var26_27.D()) != 0 || (var25_26 = (int)var26_27.I) != 0 || !var27_28 || (var25_26 = (int)var26_27.D()) != 0) continue;
                    Bq0.f(var13_14, (Y50)var4_5, var3_3, (Y50)var26_27);
                    continue;
                }
                var11_12 = 0;
                var23_24 /* !! */  = null;
                var15_16 = (int)var26_27.E();
                if (var15_16 != 0) continue;
                if (var7_8 == var20_21 && (var28_29 /* !! */  = var22_23 /* !! */ .f) == null) {
                    var25_26 = var20_21.e() + var9_10;
                    var21_22 = var26_27.p() + var25_26;
                    var26_27.Q(var25_26, var21_22);
                    Bq0.g(var13_14, var3_3, (Y50)var26_27);
                    continue;
                }
                if (var7_8 == var22_23 /* !! */  && (var7_8 = var20_21.f) == null) {
                    var25_26 = var22_23 /* !! */ .e();
                    var25_26 = var9_10 - var25_26;
                    var21_22 = var26_27.p();
                    var21_22 = var25_26 - var21_22;
                    var26_27.Q(var21_22, var25_26);
                    Bq0.g(var13_14, var3_3, (Y50)var26_27);
                    continue;
                }
                if (!var27_28 || (var25_26 = (int)var26_27.D()) != 0) continue;
                Bq0.e(var13_14, var3_3, (Y50)var26_27);
            }
        }
        var6_7 = v50$a.BASELINE;
        var6_7 = var4_5.n((v50$a)var6_7);
        var7_8 = var6_7.a;
        if (var7_8 != null && (var25_26 = var6_7.c) != 0) {
            var25_26 = var6_7.d();
            var6_7 = var6_7.a.iterator();
            while ((var8_9 = (int)var6_7.hasNext()) != 0) {
                var26_27 = (v50_0)var6_7.next();
                var31_32 = var26_27.d;
                var24_25 = 1.4E-45f;
                var11_12 = var0 + 1;
                var13_14 = (int)Bq0.a(var31_32);
                var21_22 = var31_32.E();
                if (var21_22 != 0 && var13_14 != 0) {
                    var20_21 = new Object();
                    Z50.e0(var31_32, var3_3, (Zw$a)var20_21);
                }
                var20_21 = var31_32.W;
                var32_33 = 1;
                var22_23 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                if ((var20_21 = var20_21[var32_33]) == var22_23 /* !! */  && var13_14 == 0 || (var13_14 = (int)var31_32.E()) != 0 || var26_27 != (var10_11 = var31_32.P)) continue;
                var8_9 = var26_27.e() + var25_26;
                var21_22 = var31_32.G;
                if (var21_22 != 0) {
                    var21_22 = var31_32.e0;
                    var21_22 = var8_9 - var21_22;
                    var32_33 = var31_32.Z + var21_22;
                    var31_32.d0 = var21_22;
                    var33_34 = var31_32.M;
                    var33_34.l(var21_22);
                    var20_21 = var31_32.O;
                    var20_21.l(var32_33);
                    var10_11.l(var8_9);
                    var8_9 = 1;
                    var31_32.n = var8_9;
                }
                try {
                    Bq0.g(var11_12, var3_3, var31_32);
                }
                catch (Throwable var3_4) {
                    var4_5 = var3_4;
                    throw var3_4;
                }
            }
        }
        var4_5.p = true;
    }
}

