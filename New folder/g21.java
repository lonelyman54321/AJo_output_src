/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.base.Preconditions;
import java.util.Collections;

public final class g21
implements qy0_0 {
    public final DX2 a;
    public String b;
    public wp3 c;
    public g21$a d;
    public boolean e;
    public final boolean[] f;
    public final BS1 g;
    public final BS1 h;
    public final BS1 i;
    public final BS1 j;
    public final BS1 k;
    public long l;
    public long m;
    public final Xm2 n;

    public g21(DX2 object) {
        this.a = object;
        object = new boolean[3];
        this.f = (boolean[])object;
        this.g = object = new BS1(32);
        this.h = object = new BS1(33);
        this.i = object = new BS1(34);
        this.j = object = new BS1(39);
        this.k = object = new BS1(40);
        this.m = -9223372036854775807L;
        this.n = object = new Xm2();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Xm2 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = 3;
        var5_5 = this.c;
        ct3.h(var5_5);
        var6_6 = gz3.a;
        while ((var6_6 = var1_1.a()) > 0) {
            var6_6 = var3_3.b;
            var7_7 = var3_3.c;
            var8_8 /* !! */  = var3_3.a;
            var9_9 = var2_2.l;
            var11_10 = var1_1.a();
            var12_11 = var11_10;
            var2_2.l = var9_9 += var12_11;
            var14_12 = var2_2.c;
            var15_13 = var1_1.a();
            var14_12.f(var15_13, (Xm2)var3_3);
            while (var6_6 < var7_7) {
                var14_12 = var2_2.f;
                var16_14 = DS1.b(var8_8 /* !! */ , var6_6, var7_7, (boolean[])var14_12);
                if (var16_14 == var7_7) {
                    var2_2.b(var6_6, var8_8 /* !! */ , var7_7);
                    return;
                }
                var15_13 = var16_14 + 3;
                var11_10 = var8_8 /* !! */ [var15_13] & 126;
                var17_15 = 1;
                var11_10 >>= var17_15;
                var18_16 = var16_14 - var6_6;
                if (var18_16 > 0) {
                    var2_2.b(var6_6, var8_8 /* !! */ , var16_14);
                }
                var6_6 = var7_7 - var16_14;
                var19_17 = var2_2.l;
                var21_18 = var6_6;
                var19_17 -= var21_18;
                var16_14 = 0;
                var14_12 = null;
                var18_16 = var18_16 < 0 ? -var18_16 : 0;
                var21_18 = var2_2.m;
                var23_19 = var2_2.d;
                var4_4 = (int)var2_2.e;
                var17_15 = (int)var23_19.j;
                if (var17_15 != 0 && (var17_15 = (int)var23_19.g) != 0) {
                    var4_4 = (int)var23_19.c;
                    var23_19.m = var4_4;
                    var23_19.j = false;
                    while (true) {
                        var4_4 = var15_13;
                        break;
                    }
                } else {
                    if ((var17_15 = (int)var23_19.h) == 0 && (var17_15 = (int)var23_19.g) == 0) ** continue;
                    if (var4_4 != 0 && (var4_4 = (int)var23_19.i) != 0) {
                        var4_4 = var15_13;
                        var9_9 = var23_19.b;
                        var9_9 = var19_17 - var9_9;
                        var15_13 = (int)var9_9 + var6_6;
                        var23_19.a(var15_13);
                    } else {
                        var4_4 = var15_13;
                    }
                    var23_19.k = var9_9 = var23_19.b;
                    var23_19.l = var9_9 = var23_19.e;
                    var16_14 = (int)var23_19.c;
                    var23_19.m = var16_14;
                    var16_14 = 1;
                    var23_19.i = var16_14;
                }
                var16_14 = (int)var2_2.e;
                var24_20 = var2_2.i;
                var23_19 = var2_2.h;
                var25_21 = var2_2.g;
                var3_3 = var2_2.a;
                if (var16_14 != 0) ** GOTO lbl-1000
                var25_21.b(var18_16);
                var23_19.b(var18_16);
                var24_20.b(var18_16);
                var16_14 = (int)var25_21.c;
                if (var16_14 != 0 && (var16_14 = (int)var23_19.c) != 0 && (var16_14 = (int)var24_20.c) != 0) {
                    var14_12 = var2_2.b;
                    var26_22 = var4_4;
                    var4_4 = var25_21.e;
                    var27_23 = var7_7;
                    var7_7 = var23_19.e + var4_4;
                    var28_24 = var8_8 /* !! */ ;
                    var29_25 = var24_20.e;
                    var30_26 = new byte[var7_7 += var29_25];
                    var8_8 /* !! */  = var25_21.d;
                    var31_27 = var6_6;
                    var6_6 = 0;
                    System.arraycopy(var8_8 /* !! */ , 0, var30_26, 0, var4_4);
                    var32_28 = var23_19.d;
                    var29_25 = var25_21.e;
                    var33_29 = var11_10;
                    var11_10 = var23_19.e;
                    System.arraycopy(var32_28, 0, var30_26, var29_25, var11_10);
                    var32_28 = var24_20.d;
                    var29_25 = var25_21.e;
                    var11_10 = var23_19.e;
                    var29_25 += var11_10;
                    var11_10 = var24_20.e;
                    System.arraycopy(var32_28, 0, var30_26, var29_25, var11_10);
                    var5_5 = var23_19.d;
                    var29_25 = var23_19.e;
                    var11_10 = 0;
                    var34_30 /* !! */  = null;
                    var4_4 = 3;
                    var5_5 = DS1.g((byte[])var5_5, var4_4, var29_25, null);
                    var8_8 /* !! */  = (byte[])var5_5.a;
                    if (var8_8 /* !! */  != null) {
                        var34_30 /* !! */  = var8_8 /* !! */ .e;
                        var4_4 = var8_8 /* !! */ .f;
                        var35_31 = var24_20;
                        var15_13 = var8_8 /* !! */ .a;
                        var36_32 = var23_19;
                        var37_33 = var8_8 /* !! */ .b;
                        var38_34 = var25_21;
                        var17_15 = var8_8 /* !! */ .c;
                        var29_25 = var8_8 /* !! */ .d;
                        var34_30 /* !! */  = (int[])LW.a(var15_13, var37_33, var17_15, var29_25, var34_30 /* !! */ , var4_4);
                    } else {
                        var35_31 = var24_20;
                        var38_34 = var25_21;
                        var36_32 = var23_19;
                    }
                    var32_28 = new d$a();
                    var32_28.a = var14_12;
                    var8_8 /* !! */  = (byte[])ip1_0.l("video/hevc");
                    var32_28.n = var8_8 /* !! */ ;
                    var32_28.j = var34_30 /* !! */ ;
                    var32_28.u = var29_25 = var5_5.d;
                    var32_28.v = var29_25 = var5_5.e;
                    var39_35 = var5_5.b + 8;
                    var29_25 = var5_5.c;
                    var40_36 = var29_25 + 8;
                    var8_8 /* !! */  = (byte[])new VX;
                    var16_14 = var5_5.j;
                    var15_13 = var5_5.h;
                    var11_10 = var5_5.i;
                    var8_8 /* !! */ (var15_13, var11_10, var16_14, var39_35, var40_36, null);
                    var32_28.B = var8_8 /* !! */ ;
                    var32_28.y = var41_37 = var5_5.f;
                    var32_28.p = var6_6 = var5_5.g;
                    var5_5 = Collections.singletonList(var30_26);
                    var32_28.q = var5_5;
                    var5_5 = new d((d$a)var32_28);
                    var32_28 = var2_2.c;
                    var32_28.d((d)var5_5);
                    var4_4 = -1;
                    var6_6 = var5_5.q;
                    if (var6_6 != var4_4) {
                        var4_4 = 1;
                    } else {
                        var4_4 = 0;
                        var32_28 = null;
                    }
                    Preconditions.checkState((boolean)var4_4);
                    var32_28 = var3_3.c;
                    var32_28.getClass();
                    if (var6_6 >= 0) {
                        var7_7 = 1;
                    } else {
                        var7_7 = 0;
                        var30_26 = null;
                    }
                    ct3.f((boolean)var7_7);
                    var32_28.e = var6_6;
                    var32_28.b(var6_6);
                    var4_4 = 1;
                    var2_2.e = var4_4;
                } else lbl-1000:
                // 2 sources

                {
                    var26_22 = var4_4;
                    var31_27 = var6_6;
                    var27_23 = var7_7;
                    var28_24 = var8_8 /* !! */ ;
                    var35_31 = var24_20;
                    var33_29 = var11_10;
                    var38_34 = var25_21;
                    var36_32 = var23_19;
                }
                var32_28 = var2_2.j;
                var6_6 = (int)var32_28.b(var18_16);
                var7_7 = 5;
                var8_8 /* !! */  = (byte[])var2_2.n;
                if (var6_6 != 0) {
                    var5_5 = var32_28.d;
                    var16_14 = var32_28.e;
                    var6_6 = DS1.k(var16_14, (byte[])var5_5);
                    var14_12 = var32_28.d;
                    var8_8 /* !! */ .G(var6_6, (byte[])var14_12);
                    var8_8 /* !! */ .J(var7_7);
                    var5_5 = var3_3.c;
                    var5_5.a(var21_18, (Xm2)var8_8 /* !! */ );
                }
                if ((var16_14 = (int)(var5_5 = var2_2.k).b(var18_16)) != 0) {
                    var14_12 = var5_5.d;
                    var15_13 = var5_5.e;
                    var16_14 = DS1.k(var15_13, (byte[])var14_12);
                    var24_20 = var5_5.d;
                    var8_8 /* !! */ .G(var16_14, (byte[])var24_20);
                    var8_8 /* !! */ .J(var7_7);
                    var3_3 = var3_3.c;
                    var3_3.a(var21_18, (Xm2)var8_8 /* !! */ );
                }
                var42_38 = var2_2.m;
                var3_3 = var2_2.d;
                var16_14 = (int)var2_2.e;
                var24_20 = null;
                var3_3.g = false;
                var3_3.h = false;
                var3_3.e = var42_38;
                var3_3.d = 0;
                var3_3.b = var19_17;
                var29_25 = 32;
                var41_37 = 4.5E-44f;
                var15_13 = var33_29;
                if (var33_29 < var29_25 || var33_29 == (var11_10 = 40)) {
                    var29_25 = 1;
                    var41_37 = 1.4E-45f;
                    var16_14 = 0;
                    var14_12 = null;
                } else {
                    var11_10 = (int)var3_3.i;
                    if (var11_10 != 0 && (var11_10 = (int)var3_3.j) == 0) {
                        if (var16_14 != 0) {
                            var16_14 = var31_27;
                            var3_3.a(var31_27);
                        }
                        var16_14 = 0;
                        var14_12 = null;
                        var3_3.i = false;
                    } else {
                        var16_14 = 0;
                        var14_12 = null;
                    }
                    if (var29_25 <= var15_13 && var15_13 <= (var7_7 = 35) || var15_13 == (var7_7 = 39)) {
                        var7_7 = (int)var3_3.j;
                        var29_25 = 1;
                        var41_37 = 1.4E-45f;
                        var3_3.h = var7_7 ^= var29_25;
                        var3_3.j = var29_25;
                    } else {
                        var29_25 = 1;
                        var41_37 = 1.4E-45f;
                    }
                }
                var7_7 = 16;
                if (var15_13 >= var7_7 && var15_13 <= (var7_7 = 21)) {
                    var7_7 = 1;
                } else {
                    var7_7 = 0;
                    var30_26 = null;
                }
                var3_3.c = var7_7;
                if (var7_7 == 0 && var15_13 > (var7_7 = 9)) {
                    var17_15 = 0;
                    var25_21 = null;
                } else {
                    var17_15 = 1;
                }
                var3_3.f = var17_15;
                var44_39 = var2_2.e;
                if (!var44_39) {
                    var3_3 = var38_34;
                    var38_34.d(var15_13);
                    var3_3 = var36_32;
                    var36_32.d(var15_13);
                    var3_3 = var35_31;
                    var35_31.d(var15_13);
                }
                var32_28.d(var15_13);
                var5_5.d(var15_13);
                var3_3 = var1_1;
                var6_6 = var26_22;
                var7_7 = var27_23;
                var8_8 /* !! */  = var28_24;
                var4_4 = 3;
            }
            var3_3 = var1_1;
        }
    }

    public final void b(int n3, byte[] byArray, int n4) {
        boolean bl2;
        Object object = this.d;
        int n7 = ((g21$a)object).f;
        if (n7 != 0) {
            n7 = n3 + 2;
            int n8 = ((g21$a)object).d;
            if ((n7 -= n8) < n4) {
                n7 = byArray[n7] & 0x80;
                n8 = 0;
                n7 = n7 != 0 ? 1 : 0;
                ((g21$a)object).g = n7;
                ((g21$a)object).f = false;
            } else {
                ((g21$a)object).d = n7 = n4 - n3 + n8;
            }
        }
        if (!(bl2 = this.e)) {
            this.g.a(n3, byArray, n4);
            this.h.a(n3, byArray, n4);
            object = this.i;
            ((BS1)object).a(n3, byArray, n4);
        }
        this.j.a(n3, byArray, n4);
        this.k.a(n3, byArray, n4);
    }

    public final void c() {
        long l2;
        this.l = 0L;
        this.m = l2 = -9223372036854775807L;
        DS1.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.a.c.b(0);
        g21$a g21$a = this.d;
        if (g21$a != null) {
            g21$a.f = false;
            g21$a.g = false;
            g21$a.h = false;
            g21$a.i = false;
            g21$a.j = false;
        }
    }

    public final void d(boolean bl2) {
        wp3 wp32 = this.c;
        ct3.h(wp32);
        if (bl2) {
            boolean bl3;
            Object object = this.a.c;
            wp32 = null;
            ((wJ2)object).b(0);
            object = this.d;
            long l2 = this.l;
            ((g21$a)object).m = bl3 = ((g21$a)object).c;
            long l3 = ((g21$a)object).b;
            int n3 = (int)(l2 - l3);
            ((g21$a)object).a(n3);
            ((g21$a)object).k = l3 = ((g21$a)object).b;
            ((g21$a)object).b = l2;
            ((g21$a)object).a(0);
            ((g21$a)object).i = false;
        }
    }

    public final void e(gi0_0 gi0_02, Gs3$d gs3$d) {
        g21$a g21$a;
        gs3$d.a();
        gs3$d.b();
        Object object = gs3$d.e;
        this.b = object;
        gs3$d.b();
        int n3 = gs3$d.d;
        this.c = object = gi0_02.n(n3, 2);
        this.d = g21$a = new g21$a((wp3)object);
        this.a.a(gi0_02, gs3$d);
    }

    public final void f(int n3, long l2) {
        this.m = l2;
    }
}

