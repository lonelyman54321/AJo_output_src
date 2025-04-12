/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class un2 {
    public static final void a(gn2 gn22, double d2, double d5, double d7, double d9, double d12, double d13, double d14, boolean bl2, boolean bl3) {
        double d15 = d7;
        double d16 = d12;
        boolean bl4 = bl3;
        double d17 = 180;
        d17 = d14 / d17 * Math.PI;
        double d18 = Math.cos(d17);
        double d19 = Math.sin(d17);
        double d20 = d2 * d18;
        double d22 = (d5 * d19 + d20) / d12;
        double d23 = -d2 * d19;
        double d24 = (d5 * d18 + d23) / d13;
        d23 = d7 * d18;
        double d25 = (d9 * d19 + d23) / d12;
        d23 = -d7 * d19;
        double d26 = (d9 * d18 + d23) / d13;
        d23 = d22 - d25;
        double d27 = d24 - d26;
        double d28 = d22 + d25;
        int n3 = 2;
        double d29 = n3;
        d28 /= d29;
        double d30 = (d24 + d26) / d29;
        double d32 = d23 * d23;
        double d34 = d27 * d27 + d32;
        double d35 = d34 - (d32 = 0.0);
        Object object = d35 == 0.0 ? 0 : (d35 < 0.0 ? -1 : 1);
        if (object == false) {
            return;
        }
        double d36 = 1.0 / d34;
        double d37 = 0.25;
        double d38 = (d36 -= d37) - d32;
        object = d38 == 0.0 ? 0 : (d38 < 0.0 ? -1 : 1);
        if (object < 0) {
            d29 = (float)(Math.sqrt(d34) / 1.99999);
            d23 = d12 * d29;
            d18 = d13 * d29;
            d16 = d5;
            d17 = d9;
            d19 = d14;
            bl4 = bl2;
            un2.a(gn22, d2, d5, d7, d9, d23, d18, d14, bl2, bl3);
            return;
        }
        d15 = Math.sqrt(d36);
        d23 *= d15;
        d15 *= d27;
        object = bl2;
        if (bl2 == bl3) {
            d28 -= d15;
            d30 += d23;
        } else {
            d28 += d15;
            d30 -= d23;
        }
        d15 = d24 - d30;
        d23 = d22 - d28;
        d15 = Math.atan2(d15, d23);
        d23 = d26 - d30;
        d22 = d29;
        d29 = d25 - d28;
        d29 = Math.atan2(d23, d29) - d15;
        double d39 = d29 == d32 ? 0 : (d29 > d32 ? 1 : -1);
        object = d39 >= 0 ? (Object)true : (Object)false;
        if (bl4 != object) {
            d24 = Math.PI * 2;
            d29 = d39 > 0 ? (d29 -= d24) : (d29 += d24);
        }
        d24 = (d28 *= d16) * d18;
        d25 = (d30 *= d13) * d19;
        d24 -= d25;
        d30 = d30 * d18 + (d28 *= d19);
        double d40 = 4;
        object = (int)Math.ceil(Math.abs(d29 * d40 / Math.PI));
        double d41 = Math.cos(d17);
        d17 = Math.sin(d17);
        double d42 = Math.cos(d15);
        d20 = Math.sin(d15);
        d25 = d40;
        d23 = -d16;
        d26 = d23 * d41;
        d27 = d26 * d20;
        d28 = d13 * d17;
        d32 = d28 * d42;
        d27 -= d32;
        d32 = d13 * d41;
        d42 = d42 * d32 + (d20 *= (d23 *= d17));
        d9 = d15;
        d15 = object;
        d29 /= d15;
        d15 = d2;
        d20 = d9;
        d34 = d27;
        d27 = d42;
        d42 = d5;
        for (int i3 = 0; i3 < object; ++i3) {
            d36 = d20 + d29;
            d37 = Math.sin(d36);
            double d43 = Math.cos(d36);
            double d44 = d16 * d41 * d43 + d24;
            double d45 = d28 * d37;
            d9 = d29;
            d29 = d44 - d45;
            d44 = d16 * d17 * d43 + d30;
            d45 = d32 * d37;
            double d46 = object;
            double d47 = d45 + d44;
            d44 = d26 * d37;
            d45 = d28 * d43;
            d44 -= d45;
            d37 *= d23;
            d37 = d43 * d32 + d37;
            d20 = d36 - d20;
            d43 = Math.tan(d20 / d22);
            d20 = Math.sin(d20);
            d45 = 3.0 * d43 * d43 + d25;
            d43 = Math.sqrt(d45);
            d7 = d17;
            d46 = 1.0;
            d17 = d46;
            d43 = (d43 - d17) * d20;
            int n4 = 3;
            d17 = n4;
            d15 = d34 * (d43 /= d17) + d15;
            d17 = d27 * d43 + d42;
            d42 = d43 * d44;
            d42 = d29 - d42;
            d14 = d23;
            d23 = d47 - (d43 *= d37);
            float f5 = (float)d15;
            float f6 = (float)d17;
            float f7 = (float)d42;
            float f8 = (float)d23;
            float f11 = (float)d29;
            float f12 = (float)d47;
            gn22.c(f5, f6, f7, f8, f11, f12);
            d17 = d7;
            d23 = d14;
            d15 = d29;
            d42 = d47;
            d20 = d36;
            d27 = d37;
            d34 = d44;
            d29 = d9;
            d16 = d12;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void b(List var0, gn2 var1_1) {
        var2_2 = var0;
        var3_3 = var1_1;
        var4_4 = var1_1.o();
        var1_1.rewind();
        var1_1.i((int)var4_4);
        var4_4 = var0.isEmpty();
        var5_5 = 0.0f;
        var6_6 = var4_4 != false ? qn2$b.c : (qn2)var0.get(0);
        var7_7 = var0.size();
        var5_5 = 0.0f;
        var8_8 = 0.0f;
        var9_9 = null;
        var10_10 = 0.0f;
        var11_11 /* !! */  = null;
        var12_12 = false;
        var13_13 = 0.0f;
        var14_14 = 0;
        var15_15 = 0.0f;
        var16_16 = 0.0f;
        while (var14_14 < var7_7) {
            block28: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                block32: {
                                    block31: {
                                        block30: {
                                            block29: {
                                                var18_18 /* !! */  = var17_17 = var2_2.get(var14_14);
                                                var18_18 /* !! */  = (qn2)var17_17;
                                                var19_19 = var18_18 /* !! */  instanceof qn2$b;
                                                if (!var19_19) break block29;
                                                var1_1.close();
                                                var20_20 /* !! */  = var18_18 /* !! */ ;
                                                var21_21 = var14_14;
                                                var22_22 = var7_7;
                                                var5_5 = var15_15;
                                                var10_10 = var15_15;
                                                var8_8 = var16_16;
                                                var13_13 = var16_16;
                                                break block28;
                                            }
                                            var19_19 = var18_18 /* !! */  instanceof qn2$n;
                                            if (var19_19) {
                                                var6_6 = var18_18 /* !! */ ;
                                                var6_6 = (qn2$n)var18_18 /* !! */ ;
                                                var23_23 = var6_6.c;
                                                var24_24 = var6_6.d;
                                                var3_3.f(var23_23, var24_24);
                                                var15_15 = var10_10 += var23_23;
                                                var16_16 = var13_13 += var24_24;
lbl44:
                                                // 9 sources

                                                while (true) {
                                                    var20_20 /* !! */  = var18_18 /* !! */ ;
                                                    var21_21 = var14_14;
                                                    var22_22 = var7_7;
                                                    break block28;
                                                    break;
                                                }
                                            }
                                            var19_19 = var18_18 /* !! */  instanceof qn2$f;
                                            if (!var19_19) break block30;
                                            var6_6 = var18_18 /* !! */ ;
                                            var6_6 = (qn2$f)var18_18 /* !! */ ;
                                            var23_23 = var6_6.c;
                                            var24_24 = var6_6.d;
                                            var3_3.a(var23_23, var24_24);
                                            var13_13 = var24_24;
                                            var16_16 = var24_24;
                                            var10_10 = var23_23;
                                            var15_15 = var23_23;
                                            ** GOTO lbl44
                                        }
                                        var19_19 = var18_18 /* !! */  instanceof qn2$m;
                                        if (!var19_19) break block31;
                                        var6_6 = var18_18 /* !! */ ;
                                        var6_6 = (qn2$m)var18_18 /* !! */ ;
                                        var23_23 = var6_6.c;
                                        var25_25 = var6_6.d;
                                        var3_3.q(var23_23, var25_25);
                                        var24_24 = var6_6.c;
                                        var10_10 += var24_24;
                                        var13_13 += var25_25;
                                        ** GOTO lbl44
                                    }
                                    var19_19 = var18_18 /* !! */  instanceof qn2$e;
                                    if (!var19_19) break block32;
                                    var6_6 = var18_18 /* !! */ ;
                                    var6_6 = (qn2$e)var18_18 /* !! */ ;
                                    var23_23 = var6_6.c;
                                    var25_25 = var6_6.d;
                                    var3_3.d(var23_23, var25_25);
                                    var10_10 = var24_24 = var6_6.c;
lbl82:
                                    // 2 sources

                                    while (true) {
                                        var13_13 = var25_25;
                                        ** GOTO lbl44
                                        break;
                                    }
                                }
                                var19_19 = var18_18 /* !! */  instanceof qn2$l;
                                if (!var19_19) break block33;
                                var6_6 = var18_18 /* !! */ ;
                                var6_6 = (qn2$l)var18_18 /* !! */ ;
                                var23_23 = var6_6.c;
                                var3_3.q(var23_23, 0.0f);
                                var24_24 = var6_6.c;
                                var10_10 += var24_24;
                                ** GOTO lbl44
                            }
                            var19_19 = var18_18 /* !! */  instanceof qn2$d;
                            if (!var19_19) break block34;
                            var6_6 = var18_18 /* !! */ ;
                            var6_6 = (qn2$d)var18_18 /* !! */ ;
                            var23_23 = var6_6.c;
                            var3_3.d(var23_23, var13_13);
                            var10_10 = var24_24 = var6_6.c;
                            ** GOTO lbl44
                        }
                        var19_19 = var18_18 /* !! */  instanceof qn2$r;
                        if (!var19_19) break block35;
                        var6_6 = var18_18 /* !! */ ;
                        var6_6 = (qn2$r)var18_18 /* !! */ ;
                        var23_23 = var6_6.c;
                        var3_3.q(0.0f, var23_23);
                        var24_24 = var6_6.c;
                        var13_13 += var24_24;
                        ** GOTO lbl44
                    }
                    var19_19 = var18_18 /* !! */  instanceof qn2$s;
                    if (!var19_19) break block36;
                    var6_6 = var18_18 /* !! */ ;
                    var6_6 = (qn2$s)var18_18 /* !! */ ;
                    var23_23 = var6_6.c;
                    var3_3.d(var10_10, var23_23);
                    var13_13 = var24_24 = var6_6.c;
                    ** GOTO lbl44
                }
                var19_19 = var18_18 /* !! */  instanceof qn2$k;
                if (var19_19) {
                    var26_26 /* !! */  = var18_18 /* !! */ ;
                    var26_26 /* !! */  = (qn2$k)var18_18 /* !! */ ;
                    var5_5 = var26_26 /* !! */ .c;
                    var8_8 = var26_26 /* !! */ .d;
                    var23_23 = var26_26 /* !! */ .e;
                    var25_25 = var26_26 /* !! */ .f;
                    var27_27 = var26_26 /* !! */ .g;
                    var28_28 = var26_26 /* !! */ .h;
                    var6_6 = var1_1;
                    var1_1.g(var5_5, var8_8, var23_23, var25_25, var27_27, var28_28);
                    var24_24 = var26_26 /* !! */ .e + var10_10;
                    var5_5 = var26_26 /* !! */ .f + var13_13;
                    var8_8 = var26_26 /* !! */ .g;
                    var10_10 += var8_8;
                    var8_8 = var26_26 /* !! */ .h;
lbl141:
                    // 2 sources

                    while (true) {
                        var13_13 += var8_8;
lbl143:
                        // 2 sources

                        while (true) {
                            var8_8 = var5_5;
                            var20_20 /* !! */  = var18_18 /* !! */ ;
                            var21_21 = var14_14;
                            var22_22 = var7_7;
lbl148:
                            // 2 sources

                            while (true) {
                                var5_5 = var24_24;
                                ** GOTO lbl361
                                break;
                            }
                            break;
                        }
                        break;
                    }
                } else {
                    var19_19 = var18_18 /* !! */  instanceof qn2$c;
                    if (var19_19) {
                        var11_11 /* !! */  = (qn2$c)var18_18 /* !! */ ;
                        var11_11 /* !! */  = (qn2$c)var18_18 /* !! */ ;
                        var5_5 = var11_11 /* !! */ .c;
                        var8_8 = var11_11 /* !! */ .d;
                        var23_23 = var11_11 /* !! */ .e;
                        var25_25 = var11_11 /* !! */ .f;
                        var27_27 = var11_11 /* !! */ .g;
                        var28_28 = var11_11 /* !! */ .h;
                        var6_6 = var1_1;
                        var1_1.c(var5_5, var8_8, var23_23, var25_25, var27_27, var28_28);
                        var24_24 = var11_11 /* !! */ .e;
                        var5_5 = var11_11 /* !! */ .f;
                        var8_8 = var11_11 /* !! */ .g;
                        var23_23 = var11_11 /* !! */ .h;
lbl167:
                        // 2 sources

                        while (true) {
                            var10_10 = var8_8;
                            var13_13 = var23_23;
                            var20_20 /* !! */  = var18_18 /* !! */ ;
                            var21_21 = var14_14;
                            var22_22 = var7_7;
                            var8_8 = var5_5;
                            ** continue;
                            break;
                        }
                    }
                    var19_19 = var18_18 /* !! */  instanceof qn2$p;
                    if (var19_19) {
                        var4_4 = ((qn2)var6_6).a;
                        if (var4_4) {
                            var24_24 = var10_10 - var5_5;
                            var8_8 = var13_13 - var8_8;
                            var5_5 = var24_24;
                        } else {
                            var5_5 = 0.0f;
                            var8_8 = 0.0f;
                            var9_9 = null;
                        }
                        var26_26 /* !! */  = var18_18 /* !! */ ;
                        var26_26 /* !! */  = (qn2$p)var18_18 /* !! */ ;
                        var23_23 = var26_26 /* !! */ .c;
                        var25_25 = var26_26 /* !! */ .d;
                        var27_27 = var26_26 /* !! */ .e;
                        var28_28 = var26_26 /* !! */ .f;
                        var6_6 = var1_1;
                        var1_1.g(var5_5, var8_8, var23_23, var25_25, var27_27, var28_28);
                        var24_24 = var26_26 /* !! */ .c + var10_10;
                        var5_5 = var26_26 /* !! */ .d + var13_13;
                        var8_8 = var26_26 /* !! */ .e;
                        var10_10 += var8_8;
                        var8_8 = var26_26 /* !! */ .f;
                        ** continue;
                    }
                    var19_19 = var18_18 /* !! */  instanceof qn2$h;
                    var29_29 = 2;
                    var25_25 = 2.8E-45f;
                    if (var19_19) {
                        var4_4 = ((qn2)var6_6).a;
                        if (var4_4) {
                            var24_24 = var29_29;
                            var10_10 = var10_10 * var24_24 - var5_5;
                            var8_8 = var24_24 = var24_24 * var13_13 - var8_8;
                            var5_5 = var10_10;
                        } else {
                            var5_5 = var10_10;
                            var8_8 = var13_13;
                        }
                        var11_11 /* !! */  = var18_18 /* !! */ ;
                        var11_11 /* !! */  = (qn2$h)var18_18 /* !! */ ;
                        var23_23 = var11_11 /* !! */ .c;
                        var25_25 = var11_11 /* !! */ .d;
                        var27_27 = var11_11 /* !! */ .e;
                        var28_28 = var11_11 /* !! */ .f;
                        var6_6 = var1_1;
                        var1_1.c(var5_5, var8_8, var23_23, var25_25, var27_27, var28_28);
                        var24_24 = var11_11 /* !! */ .c;
                        var5_5 = var11_11 /* !! */ .d;
                        var8_8 = var11_11 /* !! */ .e;
                        var23_23 = var11_11 /* !! */ .f;
                        ** continue;
                    }
                    var19_19 = var18_18 /* !! */  instanceof qn2$o;
                    if (var19_19) {
                        var6_6 = var18_18 /* !! */ ;
                        var6_6 = (qn2$o)var18_18 /* !! */ ;
                        var5_5 = var6_6.c;
                        var8_8 = var6_6.d;
                        var23_23 = var6_6.e;
                        var25_25 = var6_6.f;
                        var3_3.l(var5_5, var8_8, var23_23, var25_25);
                        var24_24 = var6_6.c + var10_10;
                        var8_8 += var13_13;
                        var10_10 += var23_23;
                        var13_13 += var25_25;
                        var5_5 = var24_24;
                        ** continue;
                    }
                    var19_19 = var18_18 /* !! */  instanceof qn2$g;
                    if (var19_19) {
                        var6_6 = var18_18 /* !! */ ;
                        var6_6 = (qn2$g)var18_18 /* !! */ ;
                        var5_5 = var6_6.c;
                        var8_8 = var6_6.d;
                        var23_23 = var6_6.e;
                        var25_25 = var6_6.f;
                        var3_3.j(var5_5, var8_8, var23_23, var25_25);
                        var5_5 = var24_24 = var6_6.c;
                        var10_10 = var23_23;
                        ** continue;
                    }
                    var19_19 = var18_18 /* !! */  instanceof qn2$q;
                    if (var19_19) {
                        var4_4 = ((qn2)var6_6).b;
                        if (var4_4) {
                            var24_24 = var10_10 - var5_5;
                            var5_5 = var13_13 - var8_8;
                        } else {
                            var4_4 = false;
                            var24_24 = 0.0f;
                            var6_6 = null;
                            var5_5 = 0.0f;
                        }
                        var9_9 = (qn2$q)var18_18 /* !! */ ;
                        var9_9 = (qn2$q)var18_18 /* !! */ ;
                        var23_23 = var9_9.c;
                        var25_25 = var9_9.d;
                        var3_3.l(var24_24, var5_5, var23_23, var25_25);
                        var24_24 += var10_10;
                        var5_5 += var13_13;
                        var8_8 = var9_9.c;
                        var10_10 += var8_8;
                        var13_13 += var25_25;
                        ** continue;
                    }
                    var19_19 = var18_18 /* !! */  instanceof qn2$i;
                    if (var19_19) {
                        var4_4 = ((qn2)var6_6).b;
                        if (var4_4) {
                            var24_24 = var29_29;
                            var10_10 = var10_10 * var24_24 - var5_5;
                            var24_24 *= var13_13;
                            var13_13 = var24_24 - var8_8;
                        }
                        var6_6 = var18_18 /* !! */ ;
                        var6_6 = (qn2$i)var18_18 /* !! */ ;
                        var5_5 = var6_6.c;
                        var8_8 = var6_6.d;
                        var3_3.j(var10_10, var13_13, var5_5, var8_8);
                        var24_24 = var6_6.c;
                        var5_5 = var10_10;
                        var20_20 /* !! */  = var18_18 /* !! */ ;
                        var21_21 = var14_14;
                        var22_22 = var7_7;
                        var10_10 = var24_24;
                        var30_30 = var13_13;
                        var13_13 = var8_8;
                        var8_8 = var30_30;
                    } else {
                        var4_4 = var18_18 /* !! */  instanceof qn2$j;
                        if (var4_4) {
                            var6_6 = var18_18 /* !! */ ;
                            var6_6 = (qn2$j)var18_18 /* !! */ ;
                            var31_31 = var6_6.h + var10_10;
                            var27_27 = var6_6.i + var13_13;
                            var32_32 = var10_10;
                            var34_33 = var13_13;
                            var36_34 = var31_31;
                            var21_21 = var14_14;
                            var38_35 = var27_27;
                            var13_13 = var6_6.c;
                            var20_20 /* !! */  = var18_18 /* !! */ ;
                            var40_36 = var13_13;
                            var42_37 = var6_6.d;
                            var13_13 = var6_6.e;
                            var44_38 = var42_37;
                            var42_37 = var13_13;
                            var46_39 = var12_12 = var6_6.f;
                            var4_4 = var6_6.g;
                            var6_6 = var1_1;
                            var47_40 = var36_34;
                            var49_41 = var38_35;
                            var2_2 = var18_18 /* !! */ ;
                            var38_35 = var44_38;
                            var22_22 = var7_7;
                            un2.a(var1_1, var32_32, var34_33, var36_34, var49_41, var40_36, var44_38, var42_37, var12_12, var4_4);
                            var5_5 = var31_31;
                            var10_10 = var31_31;
                            var8_8 = var27_27;
                            var13_13 = var27_27;
                            while (true) {
                                var20_20 /* !! */  = var2_2;
                                break;
                            }
                        } else {
                            var2_2 = var18_18 /* !! */ ;
                            var21_21 = var14_14;
                            var22_22 = var7_7;
                            if (!(var4_4 = var18_18 /* !! */  instanceof qn2$a)) ** continue;
                            var32_32 = var10_10;
                            var34_33 = var13_13;
                            var3_3 = var18_18 /* !! */ ;
                            var3_3 = (qn2$a)var18_18 /* !! */ ;
                            var47_40 = var3_3.h;
                            var51_42 = var3_3.i;
                            var49_41 = var51_42;
                            var40_36 = var3_3.c;
                            var38_35 = var3_3.d;
                            var24_24 = var3_3.e;
                            var52_43 = var38_35;
                            var38_35 = var24_24;
                            var46_39 = var3_3.f;
                            var4_4 = var3_3.g;
                            var6_6 = var1_1;
                            var54_44 = var38_35;
                            var38_35 = var52_43;
                            var20_20 /* !! */  = var18_18 /* !! */ ;
                            var2_2 = var3_3;
                            var42_37 = var54_44;
                            un2.a(var1_1, var32_32, var34_33, var47_40, var49_41, var40_36, var52_43, var54_44, var46_39, var4_4);
                            var5_5 = var56_45 = var3_3.h;
                            var10_10 = var56_45;
                            var8_8 = var51_42;
                            var13_13 = var51_42;
                        }
                    }
                }
            }
            var14_14 = var21_21 + 1;
            var2_2 = var0;
            var3_3 = var1_1;
            var6_6 = var20_20 /* !! */ ;
            var7_7 = var22_22;
        }
    }
}

