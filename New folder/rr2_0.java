/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from rr2
 */
public final class rr2_0
implements Gs3 {
    public final qy0_0 a;
    public final Vm2 b;
    public int c;
    public int d;
    public On3 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public rr2_0(qy0_0 object) {
        this.a = object;
        int n3 = 10;
        byte[] byArray = new byte[n3];
        this.b = object = new Vm2(byArray, n3);
        this.c = 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(int var1_1, Xm2 var2_2) {
        block25: {
            block26: {
                var3_3 = this;
                var4_4 = var2_2;
                var5_5 = this.e;
                ct3.h(var5_5);
                var6_6 = var1_1 & 1;
                var7_7 = 1;
                var8_8 = this.a;
                var9_9 = -1;
                var10_10 = 3;
                var11_11 = 2;
                var12_12 = 0;
                if (var6_6 == 0) break block25;
                var6_6 = this.c;
                if (var6_6 == 0 || var6_6 == var7_7) break block26;
                if (var6_6 == var11_11) ** GOTO lbl37
                if (var6_6 == var10_10) {
                    var6_6 = this.j;
                    if (var6_6 != var9_9) {
                        var5_5 = new StringBuilder("Unexpected start indicator: expected ");
                        var13_13 = this.j;
                        var5_5.append(var13_13);
                        var14_14 = " more bytes";
                        var5_5.append((String)var14_14);
                        var5_5 = var5_5.toString();
                        Cx.f((String)var5_5);
                    }
                    if ((var6_6 = var4_4.c) == 0) {
                        var6_6 = 1;
                    } else {
                        var6_6 = 0;
                        var5_5 = null;
                    }
                    var8_8.d((boolean)var6_6);
                } else {
                    var4_4 = new IllegalStateException();
                    throw var4_4;
lbl37:
                    // 1 sources

                    var5_5 = "Unexpected start indicator reading extended header";
                    Cx.f((String)var5_5);
                }
            }
            var3_3.c = var7_7;
            var3_3.d = 0;
        }
        var6_6 = var1_1;
        block0: while ((var13_13 = var2_2.a()) > 0) {
            block27: {
                block28: {
                    block24: {
                        var13_13 = var3_3.c;
                        if (var13_13 == 0) break block27;
                        var15_15 = var3_3.b;
                        if (var13_13 == var7_7) break block28;
                        if (var13_13 != var11_11) {
                            if (var13_13 == var10_10) {
                                var13_13 = var2_2.a();
                                var16_16 = var3_3.j;
                                if (var16_16 == var9_9) {
                                    var16_16 = 0;
                                    var15_15 = null;
                                } else {
                                    var16_16 = var13_13 - var16_16;
                                }
                                if (var16_16 > 0) {
                                    var13_13 -= var16_16;
                                    var16_16 = var4_4.b + var13_13;
                                    var4_4.H(var16_16);
                                }
                                var8_8.a((Xm2)var4_4);
                                var16_16 = var3_3.j;
                                if (var16_16 != var9_9) {
                                    var3_3.j = var16_16 -= var13_13;
                                    if (var16_16 == 0) {
                                        var8_8.d(false);
                                        var3_3.c = var7_7;
                                        var3_3.d = 0;
                                    }
                                }
lbl70:
                                // 7 sources

                                while (true) {
                                    var9_9 = 3;
                                    while (true) {
                                        var10_10 = -1;
                                        var11_11 = 0;
                                        var17_17 /* !! */  = null;
                                        var12_12 = 2;
                                        break block24;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var4_4 = new IllegalStateException();
                            throw var4_4;
                        }
                        var18_18 = var3_3.i;
                        var13_13 = Math.min(10, var18_18);
                        var19_19 = var15_15.a;
                        if ((var13_13 = (int)var3_3.d((Xm2)var4_4, var19_19, var13_13)) == 0) ** GOTO lbl70
                        var14_14 = null;
                        var18_18 = var3_3.i;
                        var13_13 = (int)var3_3.d((Xm2)var4_4, null, var18_18);
                        if (var13_13 != 0) ** break;
                        ** continue;
                        var15_15.m(0);
                        var3_3.l = var20_20 = -9223372036854775807L;
                        var13_13 = (int)var3_3.f;
                        var18_18 = 4;
                        if (var13_13 != 0) {
                            var15_15.o(var18_18);
                            var22_21 = var15_15.g(var10_10);
                            var13_13 = 30;
                            var15_15.o(var7_7);
                            var24_22 = 15;
                            var25_23 = var15_15.g(var24_22) << var24_22;
                            var26_24 = (long)var25_23 | (var22_21 <<= var13_13);
                            var15_15.o(var7_7);
                            var22_21 = var15_15.g(var24_22);
                            var26_24 |= var22_21;
                            var15_15.o(var7_7);
                            var28_25 = var3_3.h;
                            if (var28_25 == 0 && (var28_25 = var3_3.g) != 0) {
                                var15_15.o(var18_18);
                                var28_25 = var15_15.g(var10_10);
                                var22_21 = (long)var28_25 << var13_13;
                                var15_15.o(var7_7);
                                var29_26 = (long)(var15_15.g(var24_22) << var24_22) | var22_21;
                                var15_15.o(var7_7);
                                var13_13 = var15_15.g(var24_22);
                                var22_21 = var13_13;
                                var15_15.o(var7_7);
                                var14_14 = var3_3.e;
                                var14_14.b(var29_26 |= var22_21);
                                var3_3.h = var7_7;
                            }
                            var31_27 = var3_3.e;
                            var3_3.l = var29_26 = var31_27.b(var26_24);
                        }
                        if ((var9_9 = (int)var3_3.k) == 0) {
                            var18_18 = 0;
                            var19_19 = null;
                        }
                        var29_26 = var3_3.l;
                        var8_8.f(var6_6 |= var18_18, var29_26);
                        var3_3.c = var9_9 = 3;
                        var10_10 = 0;
                        var32_28 /* !! */  = null;
                        var3_3.d = 0;
                    }
lbl132:
                    // 3 sources

                    while (true) {
                        var9_9 = -1;
                        var10_10 = 3;
                        var11_11 = 2;
                        var12_12 = 0;
                        continue block0;
                        break;
                    }
                }
                var9_9 = 3;
                var10_10 = 0;
                var32_28 /* !! */  = null;
                if ((var11_11 = (int)var3_3.d((Xm2)var4_4, var17_17 /* !! */  = var15_15.a, var12_12 = 9)) == 0) ** continue;
                var15_15.m(0);
                var10_10 = var15_15.g(24);
                if (var10_10 != var7_7) {
                    CS1.a(var10_10, "Unexpected start code prefix: ");
                    var3_3.j = -1;
                    var10_10 = -1;
                    var11_11 = 0;
                    var17_17 /* !! */  = null;
                    var12_12 = 2;
                } else {
                    var10_10 = 8;
                    var15_15.o(var10_10);
                    var11_11 = var15_15.g(16);
                    var15_15.o(5);
                    var12_12 = (int)var15_15.f();
                    var3_3.k = var12_12;
                    var12_12 = 2;
                    var15_15.o(var12_12);
                    var13_13 = (int)var15_15.f();
                    var3_3.f = var13_13;
                    var13_13 = (int)var15_15.f();
                    var3_3.g = var13_13;
                    var13_13 = 6;
                    var15_15.o(var13_13);
                    var3_3.i = var10_10 = var15_15.g(var10_10);
                    if (var11_11 == 0) {
                        var3_3.j = var13_13 = -1;
                        while (true) {
                            var10_10 = -1;
                            break;
                        }
                    } else {
                        var3_3.j = var11_11 = var11_11 + -3 - var10_10;
                        if (var11_11 >= 0) ** continue;
                        var17_17 /* !! */  = (byte[])"Found negative packet payload size: ";
                        var32_28 /* !! */  = new StringBuilder((String)var17_17 /* !! */ );
                        var11_11 = var3_3.j;
                        var32_28 /* !! */ .append(var11_11);
                        var32_28 /* !! */  = var32_28 /* !! */ .toString();
                        Cx.f((String)var32_28 /* !! */ );
                        var3_3.j = var10_10 = -1;
                    }
                    var11_11 = 2;
                }
                var3_3.c = var11_11;
                var11_11 = 0;
                var17_17 /* !! */  = null;
                var3_3.d = 0;
                ** GOTO lbl132
            }
            var9_9 = 3;
            var10_10 = -1;
            var11_11 = 0;
            var17_17 /* !! */  = null;
            var12_12 = 2;
            var13_13 = var2_2.a();
            var4_4.J(var13_13);
            ** continue;
        }
    }

    public final void b(On3 on3, gi0_0 gi0_02, Gs3$d gs3$d) {
        this.e = on3;
        this.a.e(gi0_02, gs3$d);
    }

    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d(Xm2 xm2, byte[] byArray, int n3) {
        boolean bl2;
        int n4;
        int n7 = xm2.a();
        int n8 = this.d;
        n8 = n3 - n8;
        n7 = Math.min(n7, n8);
        boolean bl3 = true;
        if (n7 <= 0) {
            return bl3;
        }
        if (byArray == null) {
            xm2.J(n7);
        } else {
            int n10 = this.d;
            xm2.g(n10, byArray, n7);
        }
        this.d = n4 = this.d + n7;
        if (n4 != n3) {
            bl2 = false;
        }
        return bl2;
    }
}

