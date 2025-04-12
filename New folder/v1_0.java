/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.util.Objects;

/*
 * Renamed from v1
 */
public final class v1_0
implements qy0_0 {
    public final Vm2 a;
    public final Xm2 b;
    public final String c;
    public final int d;
    public String e;
    public wp3 f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public d k;
    public int l;
    public long m;

    public v1_0() {
        this(null, 0);
    }

    public v1_0(String string2, int n3) {
        Xm2 xm2;
        int n4 = 128;
        byte[] byArray = new byte[n4];
        Object object = new Vm2(byArray, n4);
        this.a = object;
        object = ((Vm2)object).a;
        this.b = xm2 = new Xm2((byte[])object);
        this.g = 0;
        this.m = -9223372036854775807L;
        this.c = string2;
        this.d = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Xm2 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = this.f;
        ct3.h(var4_4);
        block0: while ((var5_5 = var1_1.a()) > 0) {
            block70: {
                block73: {
                    block71: {
                        block69: {
                            block72: {
                                var5_5 = var2_2.g;
                                var6_6 = 2;
                                var7_7 = 1;
                                var8_8 = 11;
                                var9_9 = var2_2.b;
                                var10_10 = 0;
                                var11_11 = null;
                                if (var5_5 == 0) break block70;
                                if (var5_5 != var7_7) {
                                    if (var5_5 != var6_6) continue;
                                    var5_5 = var1_1.a();
                                    var6_6 = var2_2.l;
                                    var8_8 = var2_2.h;
                                    var5_5 = Math.min(var5_5, var6_6 -= var8_8);
                                    var12_12 = var2_2.f;
                                    var12_12.f(var5_5, var3_3);
                                    var2_2.h = var6_6 = var2_2.h + var5_5;
                                    var5_5 = var2_2.l;
                                    if (var6_6 != var5_5) continue;
                                    var13_13 = var2_2.m;
                                    var15_14 = -9223372036854775807L;
                                    cfr_temp_0 = var13_13 - var15_14;
                                    var17_15 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                    if (var17_15 /* !! */  == 0) {
                                        var7_7 = 0;
                                    }
                                    ct3.f((boolean)var7_7);
                                    var18_16 = var2_2.f;
                                    var19_17 = var2_2.m;
                                    var21_18 = var2_2.l;
                                    var22_19 = null;
                                    var23_20 = 1;
                                    var24_21 = 0;
                                    var25_22 = null;
                                    var18_16.a(var19_17, var23_20, var21_18, 0, null);
                                    var13_13 = var2_2.m;
                                    var26_23 = var2_2.j;
                                    var2_2.m = var13_13 += var26_23;
                                    var2_2.g = 0;
                                    continue;
                                }
                                var4_4 = var9_9.a;
                                var17_15 /* !! */  = var1_1.a();
                                var28_24 = var2_2.h;
                                var29_25 = 128;
                                var28_24 = 128 - var28_24;
                                var17_15 /* !! */  = Math.min(var17_15 /* !! */ , var28_24);
                                var28_24 = var2_2.h;
                                var3_3.g(var28_24, (byte[])var4_4, var17_15 /* !! */ );
                                var2_2.h = var5_5 = var2_2.h + var17_15 /* !! */ ;
                                if (var5_5 != var29_25) continue;
                                var4_4 = var2_2.a;
                                var4_4.m(0);
                                var17_15 /* !! */  = var4_4.e();
                                var4_4.o(40);
                                var28_24 = 5;
                                var23_20 = var4_4.g(var28_24);
                                var21_18 = 10;
                                var23_20 = var23_20 > var21_18 ? 1 : 0;
                                var4_4.m(var17_15 /* !! */ );
                                var18_16 = w1_0.d;
                                var25_22 = w1_0.b;
                                var22_19 = "audio/ac3";
                                var30_26 = 8;
                                var10_10 = 3;
                                if (var23_20 == 0) break block71;
                                var23_20 = 16;
                                var4_4.o(var23_20);
                                var29_25 = var4_4.g(var6_6);
                                var29_25 = var29_25 != 0 ? (var29_25 != var7_7 ? (var29_25 != var6_6 ? -1 : 2) : 1) : 0;
                                var4_4.o(var10_10);
                                var8_8 = (var4_4.g(var8_8) + var7_7) * 2;
                                var23_20 = var4_4.g(var6_6);
                                if (var23_20 == var10_10) {
                                    var25_22 = w1_0.c;
                                    var31_27 = var4_4.g(var6_6);
                                    var24_21 = var25_22[var31_27];
                                    var6_6 = 6;
                                    var32_28 = 3;
                                } else {
                                    var31_27 = var4_4.g(var6_6);
                                    var33_29 = w1_0.a;
                                    var34_30 = var33_29[var31_27];
                                    var24_21 = var25_22[var23_20];
                                    var32_28 = var31_27;
                                    var6_6 = var34_30;
                                }
                                var7_7 = var6_6 * 256;
                                var31_27 = var8_8 * var24_21;
                                var35_31 = var6_6 * 32;
                                var31_27 /= var35_31;
                                var28_24 = var4_4.g(var10_10);
                                var36_32 = var4_4.f();
                                var17_15 /* !! */  = (int)(var18_16[var28_24] + var36_32);
                                var4_4.o(var21_18);
                                var21_18 = (int)var4_4.f();
                                if (var21_18 != 0) {
                                    var4_4.o(var30_26);
                                }
                                if (var28_24 == 0) {
                                    var4_4.o(5);
                                    var21_18 = (int)var4_4.f();
                                    if (var21_18 != 0) {
                                        var4_4.o(var30_26);
                                    }
                                }
                                if (var29_25 == (var21_18 = 1) && (var21_18 = (int)var4_4.f()) != 0) {
                                    var21_18 = 16;
                                    var4_4.o(var21_18);
                                }
                                if ((var21_18 = (int)var4_4.f()) == 0) ** GOTO lbl-1000
                                var21_18 = 2;
                                if (var28_24 > var21_18) {
                                    var4_4.o(var21_18);
                                }
                                if ((var34_30 = var28_24 & 1) != 0 && var28_24 > var21_18) {
                                    var21_18 = 6;
                                    var4_4.o(var21_18);
                                } else {
                                    var21_18 = 6;
                                }
                                var37_33 = var28_24 & 4;
                                if (var37_33 != 0) {
                                    var4_4.o(var21_18);
                                }
                                if (var36_32 && (var21_18 = (int)var4_4.f()) != 0) {
                                    var21_18 = 5;
                                    var4_4.o(var21_18);
                                }
                                if (var29_25 != 0) ** GOTO lbl-1000
                                var21_18 = (int)var4_4.f();
                                if (var21_18 != 0) {
                                    var21_18 = 6;
                                    var4_4.o(var21_18);
                                } else {
                                    var21_18 = 6;
                                }
                                if (var28_24 == 0 && (var37_33 = (int)var4_4.f()) != 0) {
                                    var4_4.o(var21_18);
                                }
                                if ((var37_33 = (int)var4_4.f()) != 0) {
                                    var4_4.o(var21_18);
                                }
                                if ((var30_26 = var4_4.g(var21_18 = 2)) == (var10_10 = 1)) {
                                    var10_10 = 5;
                                    var4_4.o(var10_10);
lbl138:
                                    // 3 sources

                                    while (true) {
                                        var30_26 = 2;
                                        break block69;
                                        break;
                                    }
                                }
                                var10_10 = 5;
                                if (var30_26 != var21_18) break block72;
                                var21_18 = 12;
                                var4_4.o(var21_18);
                                ** GOTO lbl138
                            }
                            var21_18 = 3;
                            if (var30_26 == var21_18) ** break;
                            ** continue;
                            var21_18 = var4_4.g(var10_10);
                            var30_26 = (int)var4_4.f();
                            if (var30_26 != 0) {
                                var4_4.o(var10_10);
                                var10_10 = (int)var4_4.f();
                                if (var10_10 != 0) {
                                    var10_10 = 4;
                                    var4_4.o(var10_10);
                                } else {
                                    var10_10 = 4;
                                }
                                var30_26 = (int)var4_4.f();
                                if (var30_26 != 0) {
                                    var4_4.o(var10_10);
                                }
                                if ((var30_26 = (int)var4_4.f()) != 0) {
                                    var4_4.o(var10_10);
                                }
                                if ((var30_26 = (int)var4_4.f()) != 0) {
                                    var4_4.o(var10_10);
                                }
                                if ((var30_26 = (int)var4_4.f()) != 0) {
                                    var4_4.o(var10_10);
                                }
                                if ((var30_26 = (int)var4_4.f()) != 0) {
                                    var4_4.o(var10_10);
                                }
                                if ((var30_26 = (int)var4_4.f()) != 0) {
                                    var4_4.o(var10_10);
                                }
                                if ((var30_26 = (int)var4_4.f()) != 0) {
                                    var30_26 = (int)var4_4.f();
                                    if (var30_26 != 0) {
                                        var4_4.o(var10_10);
                                    }
                                    if ((var30_26 = (int)var4_4.f()) != 0) {
                                        var4_4.o(var10_10);
                                    }
                                }
                            }
                            if ((var10_10 = (int)var4_4.f()) != 0) {
                                var4_4.o(5);
                                var10_10 = (int)var4_4.f();
                                if (var10_10 != 0) {
                                    var4_4.o(7);
                                    var10_10 = (int)var4_4.f();
                                    if (var10_10 != 0) {
                                        var10_10 = 8;
                                        var4_4.o(var10_10);
lbl188:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                }
                            }
                            var10_10 = 8;
                            ** continue;
                            var30_26 = 2;
                            var21_18 = (var21_18 + var30_26) * 8;
                            var4_4.o(var21_18);
                            var4_4.c();
                        }
                        if (var28_24 < var30_26) {
                            var10_10 = (int)var4_4.f();
                            var21_18 = 14;
                            if (var10_10 != 0) {
                                var4_4.o(var21_18);
                            }
                            if (var28_24 == 0 && (var10_10 = (int)var4_4.f()) != 0) {
                                var4_4.o(var21_18);
                            }
                        }
                        if ((var10_10 = (int)var4_4.f()) != 0) {
                            var10_10 = var32_28;
                            if (var32_28 == 0) {
                                var21_18 = 5;
                                var4_4.o(var21_18);
                            } else {
                                var21_18 = 5;
                                for (var30_26 = 0; var30_26 < var6_6; ++var30_26) {
                                    var32_28 = (int)var4_4.f();
                                    if (var32_28 != 0) {
                                        var4_4.o(var21_18);
                                    }
                                    var21_18 = 5;
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            var10_10 = var32_28;
                        }
                        var6_6 = (int)var4_4.f();
                        if (var6_6 != 0) {
                            var4_4.o(5);
                            var6_6 = 2;
                            if (var28_24 == var6_6) {
                                var21_18 = 4;
                                var4_4.o(var21_18);
                            }
                            if (var28_24 >= (var21_18 = 6)) {
                                var4_4.o(var6_6);
                            }
                            if ((var6_6 = (int)var4_4.f()) != 0) {
                                var6_6 = 8;
                                var4_4.o(var6_6);
                            } else {
                                var6_6 = 8;
                            }
                            if (var28_24 == 0 && (var28_24 = (int)var4_4.f()) != 0) {
                                var4_4.o(var6_6);
                            }
                            if (var23_20 < (var6_6 = 3)) {
                                var4_4.n();
                            }
                        } else {
                            var6_6 = 3;
                        }
                        if (var29_25 == 0 && var10_10 != var6_6) {
                            var4_4.n();
                        }
                        if (var29_25 != (var28_24 = 2) || var10_10 != var6_6 && (var6_6 = (int)var4_4.f()) == 0) {
                            var6_6 = 6;
                        } else {
                            var6_6 = 6;
                            var4_4.o(var6_6);
                        }
                        var10_10 = (int)var4_4.f();
                        var4_4 = var10_10 != 0 && (var6_6 = var4_4.g(var6_6)) == (var10_10 = 1) && (var5_5 = var4_4.g(var6_6 = 8)) == var10_10 ? "audio/eac3-joc" : "audio/eac3";
                        var10_10 = var31_27;
                        break block73;
                    }
                    var4_4.o(32);
                    var7_7 = var4_4.g(2);
                    var6_6 = 3;
                    if (var7_7 == var6_6) {
                        var6_6 = 0;
                        var12_12 = null;
lbl257:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var12_12 = var22_19;
                    ** continue;
                    var8_8 = 6;
                    var8_8 = var4_4.g(var8_8);
                    var11_11 = w1_0.e;
                    var28_24 = var8_8 / 2;
                    var10_10 = var11_11[var28_24] * 1000;
                    var8_8 = w1_0.a(var7_7, var8_8);
                    var4_4.o(8);
                    var29_25 = var4_4.g(3);
                    var28_24 = var29_25 & 1;
                    if (var28_24 != 0 && var29_25 != (var28_24 = 1)) {
                        var28_24 = 2;
                        var4_4.o(var28_24);
                    } else {
                        var28_24 = 2;
                    }
                    var23_20 = var29_25 & 4;
                    if (var23_20 != 0) {
                        var4_4.o(var28_24);
                    }
                    if (var29_25 == var28_24) {
                        var4_4.o(var28_24);
                    }
                    var30_26 = var7_7 < (var28_24 = 3) ? var25_22[var7_7] : -1;
                    var5_5 = (int)var4_4.f();
                    var17_15 /* !! */  = (int)(var18_16[var29_25] + var5_5);
                    var7_7 = 1536;
                    var4_4 = var12_12;
                    var24_21 = var30_26;
                }
                var12_12 = var2_2.k;
                if (var12_12 == null || var17_15 /* !! */  != (var28_24 = var12_12.D) || var24_21 != (var28_24 = var12_12.E) || (var6_6 = (int)Objects.equals(var4_4, var12_12 = var12_12.o)) == 0) {
                    var12_12 = new d$a();
                    var12_12.a = var38_34 = var2_2.e;
                    var12_12.n = var38_34 = ip1_0.l((String)var4_4);
                    var12_12.C = var17_15 /* !! */ ;
                    var12_12.D = var24_21;
                    var12_12.d = var18_16 = var2_2.c;
                    var12_12.f = var17_15 /* !! */  = var2_2.d;
                    var12_12.i = var10_10;
                    var5_5 = (int)var22_19.equals(var4_4);
                    if (var5_5 != 0) {
                        var12_12.h = var10_10;
                    }
                    var2_2.k = var4_4 = new d((d$a)var12_12);
                    var12_12 = var2_2.f;
                    var12_12.d((d)var4_4);
                }
                var2_2.l = var8_8;
                var26_23 = (long)var7_7 * 1000000L;
                var13_13 = var2_2.k.E;
                var2_2.j = var26_23 /= var13_13;
                var9_9.I(0);
                var4_4 = var2_2.f;
                var6_6 = 128;
                var4_4.f(var6_6, var9_9);
                var2_2.g = var5_5 = 2;
                continue;
            }
            while ((var5_5 = var1_1.a()) > 0) {
                var5_5 = (int)var2_2.i;
                if (var5_5 == 0) {
                    var5_5 = var1_1.w();
                    var21_18 = var5_5 == var8_8 ? 1 : 0;
                    var2_2.i = var21_18;
                    continue;
                }
                var5_5 = var1_1.w();
                if (var5_5 == (var6_6 = 119)) {
                    var21_18 = 0;
                    var2_2.i = false;
                    var2_2.g = var7_7 = 1;
                    var4_4 = var9_9.a;
                    var4_4[0] = var8_8;
                    var4_4[var7_7] = var6_6;
                    var2_2.h = var6_6 = 2;
                    continue block0;
                }
                var6_6 = 2;
                var7_7 = 1;
                var21_18 = 0;
                if (var5_5 == var8_8) {
                    var5_5 = 1;
                } else {
                    var5_5 = 0;
                    var4_4 = null;
                }
                var2_2.i = var5_5;
            }
        }
    }

    public final void c() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.m = -9223372036854775807L;
    }

    public final void d(boolean bl2) {
    }

    public final void e(gi0_0 object, Gs3$d gs3$d) {
        String string2;
        gs3$d.a();
        gs3$d.b();
        this.e = string2 = gs3$d.e;
        gs3$d.b();
        int n3 = gs3$d.d;
        this.f = object = object.n(n3, 1);
    }

    public final void f(int n3, long l2) {
        this.m = l2;
    }
}

