/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zp1
 */
public final class zp1_2
implements Kt0,
E60 {
    public final xl_0 a;
    public it0_0 b;

    public zp1_2() {
        xl_0 xl_02 = new xl_0();
        this.a = xl_02;
    }

    public final void D(long l2, float f5, long l3, float f6, Qt0 qt0, TX tX, int n3) {
        this.a.D(l2, f5, l3, f6, qt0, tX, n3);
    }

    public final float D0(int n3) {
        return this.a.D0(n3);
    }

    public final float E0(float f5) {
        float f6 = this.a.getDensity();
        return f5 / f6;
    }

    public final float H(long l2) {
        xl_0 xl_02 = this.a;
        xl_02.getClass();
        return mv0_0.a(l2, xl_02);
    }

    public final float H0() {
        return this.a.H0();
    }

    public final float J0(float f5) {
        return this.a.getDensity() * f5;
    }

    public final void M(long l2, float f5, float f6, long l3, long l4, float f7, Qt0 qt0, TX tX, int n3) {
        this.a.M(l2, f5, f6, l3, l4, f7, qt0, tX, n3);
    }

    public final xL$b M0() {
        return this.a.b;
    }

    public final long O(float f5) {
        return this.a.O(f5);
    }

    public final int O0(long l2) {
        return this.a.O0(l2);
    }

    public final void Q0(long l2, long l3, long l4, long l7, Qt0 qt0, float f5, TX tX, int n3) {
        this.a.Q0(l2, l3, l4, l7, qt0, f5, tX, n3);
    }

    public final void S0(hd1_0 hd1_02, long l2, float f5, Qt0 qt0, TX tX, int n3) {
        this.a.S0(hd1_02, l2, f5, qt0, tX, n3);
    }

    public final void T0(gn2 gn22, ZD zD, float f5, Qt0 qt0, TX tX, int n3) {
        this.a.T0(gn22, zD, f5, qt0, tX, n3);
    }

    public final void U0(long l2, long l3, long l4, float f5, Qt0 qt0, TX tX, int n3) {
        this.a.U0(l2, l3, l4, f5, qt0, tX, n3);
    }

    public final long X0() {
        return this.a.X0();
    }

    public final void Y(long l2, long l3, long l4, float f5, int n3, li li2, float f6, TX tX, int n4) {
        this.a.Y(l2, l3, l4, f5, n3, li2, f6, tX, n4);
    }

    public final long Z0(long l2) {
        xl_0 xl_02 = this.a;
        xl_02.getClass();
        return Uo0.d(l2, xl_02);
    }

    public final void d1(ZD zD, long l2, long l3, float f5, Qt0 qt0, TX tX, int n3) {
        this.a.d1(zD, l2, l3, f5, qt0, tX, n3);
    }

    public final void e(iL iL2, long l2, w32_0 w32_02, it0_0 it0_02, W01 w01) {
        it0_0 it0_03 = this.b;
        this.b = it0_02;
        bp1_0 bp1_02 = w32_02.m.s;
        Object object = this.a;
        Vo0 vo0 = ((xl_0)object).b.c();
        object = ((xl_0)object).b;
        bp1_0 bp1_03 = ((xL$b)object).e();
        iL iL3 = ((xL$b)object).a();
        long l3 = ((xL$b)object).l();
        W01 w012 = ((xL$b)object).b;
        ((xL$b)object).g(w32_02);
        ((xL$b)object).i(bp1_02);
        ((xL$b)object).f(iL2);
        ((xL$b)object).b(l2);
        ((xL$b)object).b = w01;
        iL2.p();
        try {
            it0_02.n(this);
            this.b = it0_03;
            return;
        }
        finally {
            iL2.h();
            ((xL$b)object).g(vo0);
            ((xL$b)object).i(bp1_03);
            ((xL$b)object).f(iL3);
            ((xL$b)object).b(l3);
            ((xL$b)object).b = w012;
        }
    }

    public final int e0(float f5) {
        xl_0 xl_02 = this.a;
        xl_02.getClass();
        return Uo0.a(f5, xl_02);
    }

    /*
     * Unable to fully structure code
     */
    public final void e1() {
        block16: {
            var1_1 = this.a;
            var2_2 = var1_1.b.a();
            var3_3 = this.b;
            Intrinsics.checkNotNull(var3_3);
            var4_4 = var3_3.e().f;
            var5_5 = 4;
            if (var4_4 == null) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var4_4 = null;
                    break block16;
                    break;
                }
            }
            var6_6 = var4_4.d & var5_5;
            if (var6_6 == 0) ** GOTO lbl-1000
            while (true) {
                if (var4_4 != null && (var7_7 = (var6_6 = var4_4.c) & 2) == 0) ** break;
                ** continue;
                if ((var6_6 &= 4) != 0) break;
                var4_4 = var4_4.f;
            }
        }
        if (var4_4 != null) {
            var8_8 = null;
            while (var4_4 != null) {
                var9_9 = var4_4 instanceof it0_0;
                if (var9_9 != 0) {
                    var10_10 = var4_4;
                    var10_10 = (it0_0)var4_4;
                    var11_11 = var1_1.b.b;
                    var12_12 = go0.d((fo0)var10_10, var5_5);
                    var13_13 = var12_12.c;
                    var15_14 = dj1.b(var13_13);
                    var3_3 = var12_12.m;
                    var3_3.getClass();
                    var3_3 = aq1_0.a((xp1_0)var3_3).getSharedDrawScope();
                    var4_4 = var2_2;
                    var3_3.e(var2_2, var15_14, var12_12, (it0_0)var10_10, var11_11);
                } else {
                    var9_9 = ((LP1$c)var4_4).c & var5_5;
                    if (var9_9 != 0 && (var9_9 = var4_4 instanceof mo0_0) != 0) {
                        var3_3 = var4_4;
                        var3_3 = ((mo0_0)var4_4).o;
                        var6_6 = 0;
                        var17_15 = null;
                        while (true) {
                            var7_7 = 1;
                            if (var3_3 == null) break;
                            var18_17 = var3_3.c & var5_5;
                            if (var18_17 != 0) {
                                if (++var6_6 == var7_7) {
                                    var4_4 = var3_3;
                                } else {
                                    if (var8_8 == null) {
                                        var7_7 = 16;
                                        var19_18 = new LP1$c[var7_7];
                                        var8_8 = new WR1(var19_18);
                                    }
                                    if (var4_4 != null) {
                                        var8_8.b(var4_4);
                                        var4_4 = null;
                                    }
                                    var8_8.b(var3_3);
                                }
                            }
                            var3_3 = var3_3.f;
                        }
                        if (var6_6 == var7_7) continue;
                    }
                }
                var4_4 = go0.b(var8_8);
            }
        } else {
            var4_4 = go0.d((fo0)var3_3, var5_5);
            var17_16 = var4_4.j1();
            if (var17_16 == (var3_3 = var3_3.e())) {
                var4_4 = var4_4.p;
                Intrinsics.checkNotNull(var4_4);
            }
            var1_1 = var1_1.b.b;
            var4_4.v1(var2_2, (W01)var1_1);
        }
    }

    public final void g0(ZD zD, long l2, long l3, long l4, float f5, Qt0 qt0, TX tX, int n3) {
        this.a.g0(zD, l2, l3, l4, f5, qt0, tX, n3);
    }

    public final float getDensity() {
        return this.a.getDensity();
    }

    public final bp1_0 getLayoutDirection() {
        return this.a.a.b;
    }

    public final float h0(long l2) {
        xl_0 xl_02 = this.a;
        xl_02.getClass();
        return Uo0.c(l2, xl_02);
    }

    public final long l() {
        return this.a.l();
    }

    public final void l0(ZD zD, long l2, long l3, float f5, int n3, li li2, float f6, TX tX, int n4) {
        this.a.l0(zD, l2, l3, f5, n3, li2, f6, tX, n4);
    }

    public final void t0(hd1_0 hd1_02, long l2, long l3, long l4, long l7, float f5, Qt0 qt0, TX tX, int n3, int n4) {
        this.a.t0(hd1_02, l2, l3, l4, l7, f5, qt0, tX, n3, n4);
    }

    public final void v0(gn2 gn22, long l2, float f5, Qt0 qt0, TX tX, int n3) {
        this.a.v0(gn22, l2, f5, qt0, tX, n3);
    }

    public final long z(long l2) {
        xl_0 xl_02 = this.a;
        xl_02.getClass();
        return Uo0.b(l2, xl_02);
    }
}

