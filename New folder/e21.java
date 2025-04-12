/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.util.Arrays;
import java.util.Collections;

public final class e21
implements qy0_0 {
    public static final float[] l;
    public final tx3 a;
    public final Xm2 b;
    public final boolean[] c;
    public final e21$a d;
    public final BS1 e;
    public e21$b f;
    public long g;
    public String h;
    public wp3 i;
    public boolean j;
    public long k;

    static {
        float[] fArray;
        float[] fArray2 = fArray = new float[7];
        float[] fArray3 = fArray;
        fArray2[0] = 1.0f;
        fArray3[1] = 1.0f;
        fArray2[2] = 1.0909091f;
        fArray3[3] = 0.90909094f;
        fArray2[4] = 1.4545455f;
        fArray3[5] = 1.2121212f;
        fArray3[6] = 1.0f;
        l = fArray;
    }

    public e21(tx3 object) {
        this.a = object;
        object = new boolean[4];
        this.c = (boolean[])object;
        object = new Object();
        byte[] byArray = new byte[128];
        ((e21$a)object).e = byArray;
        this.d = object;
        this.k = -9223372036854775807L;
        this.e = object = new BS1(178);
        this.b = object = new Xm2();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Xm2 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = 3;
        var5_5 = 4.2E-45f;
        var6_6 = 1;
        var7_7 = 1.4E-45f;
        ct3.h(this.f);
        var8_8 = this.i;
        ct3.h(var8_8);
        var9_9 = var1_1.b;
        var10_10 = var1_1.c;
        var11_11 = var1_1.a;
        var12_12 = this.g;
        var14_13 = var1_1.a();
        var15_14 = var14_13;
        this.g = var12_12 += var15_14;
        var17_15 = this.i;
        var18_16 = var1_1.a();
        var17_15.f(var18_16, var1_1);
        while (true) {
            block34: {
                block35: {
                    block42: {
                        block36: {
                            block37: {
                                block38: {
                                    block39: {
                                        block40: {
                                            block45: {
                                                block43: {
                                                    block44: {
                                                        block41: {
                                                            var17_15 = var2_2.c;
                                                            var19_17 = DS1.b(var11_11, var9_9, var10_10, (boolean[])var17_15);
                                                            var20_18 = var2_2.d;
                                                            var21_19 = var2_2.e;
                                                            if (var19_17 == var10_10) {
                                                                var22_36 = var2_2.j;
                                                                if (!var22_36) {
                                                                    var20_18.a(var9_9, var11_11, var10_10);
                                                                }
                                                                var3_3 = var2_2.f;
                                                                var3_3.a(var9_9, var11_11, var10_10);
                                                                if (var21_19 != null) {
                                                                    var21_19.a(var9_9, var11_11, var10_10);
                                                                }
                                                                return;
                                                            }
                                                            var23_20 = var3_3.a;
                                                            var24_21 = var19_17 + 3;
                                                            var25_22 = var23_20[var24_21];
                                                            var26_23 = var25_22 & 255;
                                                            var27_24 = var19_17 - var9_9;
                                                            var28_25 = var2_2.j;
                                                            if (var28_25 != 0) break block35;
                                                            if (var27_24 > 0) {
                                                                var20_18.a(var9_9, var11_11, var19_17);
                                                            }
                                                            if (var27_24 < 0) {
                                                                var28_25 = -var27_24;
                                                            } else {
                                                                var28_25 = 0;
                                                                var29_26 = null;
                                                            }
                                                            var4_4 = var20_18.b;
                                                            if (var4_4 == 0) break block36;
                                                            var30_27 = "Unexpected start code value";
                                                            if (var4_4 == var6_6) break block37;
                                                            var6_6 = 2;
                                                            var7_7 = 2.8E-45f;
                                                            if (var4_4 == var6_6) break block38;
                                                            var6_6 = 4;
                                                            var7_7 = 5.6E-45f;
                                                            var31_28 /* !! */  = 3;
                                                            if (var4_4 == var31_28 /* !! */ ) break block39;
                                                            if (var4_4 != var6_6) break block40;
                                                            var31_28 /* !! */  = 179;
                                                            if (var26_23 == var31_28 /* !! */  || var26_23 == (var31_28 /* !! */  = 181)) break block41;
                                                            var32_29 = var24_21;
                                                            break block42;
                                                        }
                                                        var20_18.c = var31_28 /* !! */  = var20_18.c - var28_25;
                                                        var31_28 /* !! */  = 0;
                                                        var20_18.a = false;
                                                        var33_30 = var2_2.i;
                                                        var4_4 = var20_18.d;
                                                        var23_20 = var2_2.h;
                                                        var23_20.getClass();
                                                        var29_26 = var20_18.e;
                                                        var18_16 = var20_18.c;
                                                        var20_18 = Arrays.copyOf((byte[])var29_26, var18_16);
                                                        var29_26 = new Vm2;
                                                        var6_6 = ((Object)var20_18).length;
                                                        var29_26((byte[])var20_18, var6_6);
                                                        var29_26.p(var4_4);
                                                        var4_4 = 4;
                                                        var5_5 = 5.6E-45f;
                                                        var29_26.p(var4_4);
                                                        var29_26.n();
                                                        var6_6 = 8;
                                                        var7_7 = 1.1E-44f;
                                                        var29_26.o(var6_6);
                                                        var34_31 = var29_26.f();
                                                        if (var34_31 != 0) {
                                                            var29_26.o(var4_4);
                                                            var6_6 = 3;
                                                            var7_7 = 4.2E-45f;
                                                            var29_26.o(var6_6);
                                                        }
                                                        var4_4 = var29_26.g(var4_4);
                                                        var35_32 = "Invalid aspect ratio";
                                                        var6_6 = 15;
                                                        var7_7 = 2.1E-44f;
                                                        if (var4_4 != var6_6) break block43;
                                                        var6_6 = 8;
                                                        var7_7 = 1.1E-44f;
                                                        var4_4 = var29_26.g(var6_6);
                                                        if ((var6_6 = var29_26.g(var6_6)) != 0) break block44;
                                                        Cx.f(var35_32);
                                                        ** GOTO lbl117
                                                    }
                                                    var5_5 = var4_4;
                                                    var7_7 = var6_6;
                                                    var7_7 = var5_5 / var7_7;
                                                    break block45;
                                                }
                                                var6_6 = 7;
                                                var7_7 = 9.8E-45f;
                                                if (var4_4 < var6_6) {
                                                    var36_33 = e21.l;
                                                    var7_7 = var36_33[var4_4];
                                                } else {
                                                    Cx.f(var35_32);
lbl117:
                                                    // 2 sources

                                                    var6_6 = 1065353216;
                                                    var7_7 = 1.0f;
                                                }
                                            }
                                            var4_4 = (int)var29_26.f();
                                            if (var4_4 != 0) {
                                                var29_26.o(2);
                                                var5_5 = 1.4E-45f;
                                                var29_26.o(1);
                                                var4_4 = (int)var29_26.f();
                                                if (var4_4 != 0) {
                                                    var4_4 = 15;
                                                    var29_26.o(var4_4);
                                                    var29_26.n();
                                                    var29_26.o(var4_4);
                                                    var29_26.n();
                                                    var29_26.o(var4_4);
                                                    var29_26.n();
                                                    var29_26.o(3);
                                                    var29_26.o(11);
                                                    var29_26.n();
                                                    var4_4 = 15;
                                                    var5_5 = 2.1E-44f;
                                                    var29_26.o(var4_4);
                                                    var29_26.n();
                                                }
                                            }
                                            var4_4 = 2;
                                            var5_5 = 2.8E-45f;
                                            var34_31 = var29_26.g(var4_4);
                                            if (var34_31 != 0) {
                                                var37_34 /* !! */  = (byte[])"Unhandled video object layer shape";
                                                Cx.f((String)var37_34 /* !! */ );
                                            }
                                            var29_26.n();
                                            var5_5 = 2.2E-44f;
                                            var4_4 = var29_26.g(16);
                                            var29_26.n();
                                            var34_31 = (int)var29_26.f();
                                            if (var34_31 == 0) ** GOTO lbl156
                                            if (var4_4 == 0) {
                                                var37_34 /* !! */  = (byte[])"Invalid vop_increment_time_resolution";
                                                Cx.f((String)var37_34 /* !! */ );
lbl156:
                                                // 2 sources

                                                var32_29 = var24_21;
                                            } else {
                                                var4_4 += -1;
                                                var32_29 = var24_21;
                                                var24_21 = 0;
                                                while (var4_4 > 0) {
                                                    var34_31 = 1;
                                                    ++var24_21;
                                                    var4_4 >>= 1;
                                                }
                                                var29_26.o(var24_21);
                                            }
                                            var29_26.n();
                                            var4_4 = 13;
                                            var5_5 = 1.8E-44f;
                                            var24_21 = var29_26.g(var4_4);
                                            var29_26.n();
                                            var4_4 = var29_26.g(var4_4);
                                            var29_26.n();
                                            var29_26.n();
                                            var29_26 = new d$a();
                                            var29_26.a = var23_20;
                                            var29_26.n = var23_20 = ip1_0.l("video/mp4v-es");
                                            var29_26.u = var24_21;
                                            var29_26.v = var4_4;
                                            var29_26.y = var7_7;
                                            var37_34 /* !! */  = (byte[])Collections.singletonList(var20_18);
                                            var29_26.q = var37_34 /* !! */ ;
                                            var37_34 /* !! */  = (byte[])new d;
                                            var37_34 /* !! */ ((d$a)var29_26);
                                            var33_30.d((d)var37_34 /* !! */ );
                                            var31_28 /* !! */  = 1;
                                            var2_2.j = var31_28 /* !! */ ;
lbl188:
                                            // 2 sources

                                            while (true) {
                                                var6_6 = 3;
                                                var7_7 = 4.2E-45f;
                                                break block34;
                                                break;
                                            }
                                        }
                                        var3_3 = new IllegalStateException();
                                        throw var3_3;
                                    }
                                    var32_29 = var24_21;
                                    var31_28 /* !! */  = var25_22 & 240;
                                    var4_4 = 32;
                                    var5_5 = 4.5E-44f;
                                    if (var31_28 /* !! */  != var4_4) {
                                        Cx.f(var30_27);
                                        var31_28 /* !! */  = 0;
                                        var33_30 = null;
                                        var20_18.a = false;
                                        var20_18.c = 0;
                                        var20_18.b = 0;
                                    } else {
                                        var31_28 /* !! */  = 0;
                                        var33_30 = null;
                                        var20_18.d = var4_4 = var20_18.c;
                                        var4_4 = 4;
                                        var5_5 = 5.6E-45f;
                                        var20_18.b = var4_4;
                                    }
                                    break block42;
                                }
                                var32_29 = var24_21;
                                var31_28 /* !! */  = 0;
                                var33_30 = null;
                                var4_4 = 31;
                                var5_5 = 4.3E-44f;
                                if (var26_23 > var4_4) {
                                    Cx.f(var30_27);
                                    var20_18.a = false;
                                    var20_18.c = 0;
                                    var20_18.b = 0;
                                } else {
                                    var4_4 = 3;
                                    var5_5 = 4.2E-45f;
                                    var20_18.b = var4_4;
                                }
                                break block42;
                            }
                            var32_29 = var24_21;
                            var31_28 /* !! */  = 0;
                            var33_30 = null;
                            var4_4 = 181;
                            var5_5 = 2.54E-43f;
                            if (var26_23 != var4_4) {
                                Cx.f(var30_27);
                                var20_18.a = false;
                                var20_18.c = 0;
                                var20_18.b = 0;
                            } else {
                                var20_18.b = var31_28 /* !! */  = 2;
                            }
                            break block42;
                        }
                        var32_29 = var24_21;
                        var31_28 /* !! */  = 176;
                        if (var26_23 == var31_28 /* !! */ ) {
                            var20_18.b = var31_28 /* !! */  = 1;
                            var20_18.a = var31_28 /* !! */ ;
                        }
                    }
                    var33_30 = e21$a.f;
                    var4_4 = 0;
                    var5_5 = 0.0f;
                    var37_34 /* !! */  = null;
                    var6_6 = 3;
                    var7_7 = 4.2E-45f;
                    var20_18.a(0, (byte[])var33_30, var6_6);
                    break block34;
                }
                var32_29 = var24_21;
                ** continue;
            }
            var33_30 = var2_2.f;
            var33_30.a(var9_9, var11_11, var19_17);
            if (var21_19 == null) ** GOTO lbl-1000
            if (var27_24 > 0) {
                var21_19.a(var9_9, var11_11, var19_17);
                var31_28 /* !! */  = 0;
                var33_30 = null;
            } else {
                var31_28 /* !! */  = -var27_24;
            }
            var31_28 /* !! */  = (int)var21_19.b(var31_28 /* !! */ );
            if (var31_28 /* !! */  != 0) {
                var33_30 = var21_19.d;
                var31_28 /* !! */  = DS1.k(var21_19.e, (byte[])var33_30);
                var4_4 = gz3.a;
                var37_34 /* !! */  = var21_19.d;
                var8_8 = var2_2.b;
                var8_8.G(var31_28 /* !! */ , var37_34 /* !! */ );
                var38_35 = var2_2.k;
                var20_18 = var2_2.a;
                var20_18.a(var38_35, (Xm2)var8_8);
            }
            if (var26_23 == (var31_28 /* !! */  = 178)) {
                var33_30 = var3_3.a;
                var4_4 = 2;
                var5_5 = 2.8E-45f;
                var9_9 = var19_17 + 2;
                var31_28 /* !! */  = (int)var33_30[var9_9];
                if (var31_28 /* !! */  == (var9_9 = 1)) {
                    var21_19.d(var26_23);
                }
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = 2;
                var5_5 = 2.8E-45f;
                var9_9 = 1;
            }
            var31_28 /* !! */  = var10_10 - var19_17;
            var12_12 = var2_2.g;
            var15_14 = var31_28 /* !! */ ;
            var21_19 = var2_2.f;
            var25_22 = (int)var2_2.j;
            var21_19.b(var12_12 -= var15_14, var31_28 /* !! */ , (boolean)var25_22);
            var33_30 = var2_2.f;
            var12_12 = var2_2.k;
            var33_30.e = var26_23;
            var21_19 = null;
            var33_30.d = false;
            var14_13 = 182;
            if (var26_23 != var14_13 && var26_23 != (var25_22 = 179)) {
                var25_22 = 0;
                var23_20 = null;
            } else {
                var25_22 = 1;
            }
            var33_30.b = var25_22;
            if (var26_23 == var14_13) {
                var14_13 = 1;
            } else {
                var14_13 = 0;
                var21_19 = null;
            }
            var33_30.c = var14_13;
            var14_13 = 0;
            var21_19 = null;
            var33_30.f = 0;
            var33_30.h = var12_12;
            var9_9 = var32_29;
            var4_4 = 3;
            var5_5 = 4.2E-45f;
            var6_6 = 1;
            var7_7 = 1.4E-45f;
        }
    }

    public final void c() {
        DS1.a(this.c);
        Object object = this.d;
        int n3 = 0;
        ((e21$a)object).a = false;
        ((e21$a)object).c = 0;
        ((e21$a)object).b = 0;
        object = this.f;
        if (object != null) {
            ((e21$b)object).b = false;
            ((e21$b)object).c = false;
            ((e21$b)object).d = false;
            ((e21$b)object).e = n3 = -1;
        }
        if ((object = this.e) != null) {
            ((BS1)object).c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    public final void d(boolean bl2) {
        e21$b e21$b = this.f;
        ct3.h(e21$b);
        if (bl2) {
            int n3;
            e21$b e21$b2 = this.f;
            long l2 = this.g;
            boolean bl3 = this.j;
            e21$b2.b(l2, 0, bl3);
            e21$b2 = this.f;
            e21$b2.b = false;
            e21$b2.c = false;
            e21$b2.d = false;
            e21$b2.e = n3 = -1;
        }
    }

    public final void e(gi0_0 gi0_02, Gs3$d gs3$d) {
        e21$b e21$b;
        gs3$d.a();
        gs3$d.b();
        Object object = gs3$d.e;
        this.h = object;
        gs3$d.b();
        int n3 = gs3$d.d;
        int n4 = 2;
        this.i = object = gi0_02.n(n3, n4);
        this.f = e21$b = new e21$b((wp3)object);
        object = this.a;
        if (object != null) {
            ((tx3)object).b(gi0_02, gs3$d);
        }
    }

    public final void f(int n3, long l2) {
        this.k = l2;
    }
}

