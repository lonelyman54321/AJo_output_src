/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Shader
 */
import android.graphics.Shader;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xL
 */
public final class xl_0
implements Kt0 {
    public final xL$a a;
    public final xL$b b;
    public ei c;
    public ei d;

    public xl_0() {
        Object object;
        bz0_1 bz0_12;
        Wo0 wo0 = ft0.a;
        bp1_0 bp1_02 = bp1_0.Ltr;
        super();
        ((xL$a)object).a = wo0;
        ((xL$a)object).b = bp1_02;
        ((xL$a)object).c = bz0_12;
        ((xL$a)object).d = 0L;
        this.a = object;
        this.b = object = new xL$b(this);
    }

    public static fm2 e(xl_0 object, long l2, Qt0 object2, float f5, TX tX, int n3) {
        int n4;
        Object object3;
        object = ((xl_0)object).v((Qt0)object2);
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object4 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object4 != false) {
            f6 = OX.d(l2) * f5;
            l2 = OX.b(l2, f6);
        }
        object2 = object;
        object2 = (ei)object;
        long l3 = ((ei)object2).a();
        boolean bl2 = OX.c(l3, l2);
        if (!bl2) {
            ((ei)object2).f(l2);
        }
        if ((object3 = ((ei)object2).c) != null) {
            n4 = 0;
            object3 = null;
            ((ei)object2).i(null);
        }
        if ((n4 = Intrinsics.areEqual(object3 = ((ei)object2).d, tX)) == 0) {
            ((ei)object2).l(tX);
        }
        if ((n4 = zy_0.a(((ei)object2).b, n3)) == 0) {
            ((ei)object2).d(n3);
        }
        object3 = ((ei)object2).a;
        n4 = object3.isFilterBitmap();
        int n7 = 1;
        if ((n4 = (int)(BM0.a(n4, n7) ? 1 : 0)) == 0) {
            ((ei)object2).q(n7);
        }
        return object;
    }

    public final void D(long l2, float f5, long l3, float f6, Qt0 qt0, TX tX, int n3) {
        iL iL2 = this.a.c;
        Object object = this;
        object = xl_0.e(this, l2, qt0, f6, tX, n3);
        iL2.t(f5, l3, (fm2)object);
    }

    public final float D0(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final float E0(float f5) {
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final /* synthetic */ float H(long l2) {
        return mv0_0.a(l2, this);
    }

    public final float H0() {
        return this.a.a.H0();
    }

    public final float J0(float f5) {
        return this.getDensity() * f5;
    }

    public final void M(long l2, float f5, float f6, long l3, long l4, float f7, Qt0 qt0, TX tX, int n3) {
        iL iL2 = this.a.c;
        float f8 = e72.d(l3);
        float f11 = e72.e(l3);
        float f12 = e72.d(l3);
        float f14 = C63.d(l4) + f12;
        f12 = e72.e(l3);
        float f15 = C63.b(l4) + f12;
        Object object = this;
        object = xl_0.e(this, l2, qt0, f7, tX, n3);
        f7 = f15;
        iL2.b(f8, f11, f14, f15, f5, f6, (fm2)object);
    }

    public final xL$b M0() {
        return this.b;
    }

    public final long O(float f5) {
        f5 = this.E0(f5);
        return this.x(f5);
    }

    public final int O0(long l2) {
        return Math.round(this.h0(l2));
    }

    public final void Q0(long l2, long l3, long l4, long l7, Qt0 qt0, float f5, TX tX, int n3) {
        iL iL2 = this.a.c;
        float f6 = e72.d(l3);
        float f7 = e72.e(l3);
        float f8 = e72.d(l3);
        float f11 = C63.d(l4) + f8;
        f8 = e72.e(l3);
        float f12 = C63.b(l4) + f8;
        float f14 = r90_0.b(l7);
        float f15 = r90_0.c(l7);
        Object object = this;
        object = xl_0.e(this, l2, qt0, f5, tX, n3);
        iL2.l(f6, f7, f11, f12, f14, f15, (fm2)object);
    }

    public final void S0(hd1_0 hd1_02, long l2, float f5, Qt0 qt0, TX tX, int n3) {
        iL iL2 = this.a.c;
        fm2 fm22 = this.n(null, qt0, f5, tX, n3, 1);
        iL2.i(hd1_02, l2, fm22);
    }

    public final void T0(gn2 gn22, ZD object, float f5, Qt0 qt0, TX tX, int n3) {
        iL iL2 = this.a.c;
        object = this.n((ZD)object, qt0, f5, tX, n3, 1);
        iL2.m(gn22, (fm2)object);
    }

    public final void U0(long l2, long l3, long l4, float f5, Qt0 qt0, TX tX, int n3) {
        iL iL2 = this.a.c;
        float f6 = e72.d(l3);
        float f7 = e72.e(l3);
        float f8 = e72.d(l3);
        float f11 = C63.d(l4) + f8;
        f8 = e72.e(l3);
        float f12 = C63.b(l4) + f8;
        Object object = this;
        object = xl_0.e(this, l2, qt0, f5, tX, n3);
        iL2.u(f6, f7, f11, f12, (fm2)object);
    }

    public final long X0() {
        return bo1_1.b(this.b.l());
    }

    public final void Y(long l2, long l3, long l4, float f5, int n3, li li2, float f6, TX tX, int n4) {
        float f7;
        float f8;
        int n7;
        Object object;
        long l7;
        float f11 = f5;
        int n8 = n3;
        li li3 = li2;
        TX tX3 = tX;
        int n10 = n4;
        iL iL2 = this.a.c;
        fm2 fm22 = this.p();
        float f12 = 1.0f;
        float f14 = f6 - f12;
        Object object2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object2 == false) {
            l7 = l2;
        } else {
            f12 = OX.d(l2) * f6;
            l7 = OX.b(l2, f12);
        }
        fm2 fm23 = fm22;
        fm23 = (ei)fm22;
        long l8 = ((ei)fm23).a();
        boolean bl2 = OX.c(l8, l7);
        if (!bl2) {
            ((ei)fm23).f(l7);
        }
        if ((object = ((ei)fm23).c) != null) {
            object2 = false;
            f12 = 0.0f;
            object = null;
            ((ei)fm23).i(null);
        }
        if ((object2 = (Object)Intrinsics.areEqual(object = ((ei)fm23).d, tX3)) == false) {
            ((ei)fm23).l(tX3);
        }
        if ((n7 = zy_0.a(((ei)fm23).b, n10)) == 0) {
            ((ei)fm23).d(n10);
        }
        if ((n7 = (f8 = (f7 = (tX3 = ((ei)fm23).a).getStrokeWidth()) - f11) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) != 0) {
            ((ei)fm23).n(f11);
        }
        Object object3 = ((ei)fm23).a;
        f11 = object3.getStrokeMiter();
        n7 = 0x40800000;
        f7 = 4.0f;
        float f15 = f11 == f7 ? 0 : (f11 < f7 ? -1 : 1);
        if (f15 != false) {
            ((ei)fm23).k(f7);
        }
        f15 = (float)Se3.a(((ei)fm23).o(), n8);
        if (f15 == false) {
            ((ei)fm23).c(n8);
        }
        f15 = ((ei)fm23).p();
        n8 = 0;
        if ((f15 = (float)Ue3.b((int)f15, 0)) == false) {
            ((ei)fm23).e(0);
        }
        if ((f15 = (float)Intrinsics.areEqual(object3 = ((ei)fm23).e, li3)) == false) {
            ((ei)fm23).g(li3);
        }
        object3 = ((ei)fm23).a;
        f15 = (float)object3.isFilterBitmap();
        n8 = 1;
        if ((f15 = (float)BM0.a((int)f15, n8)) == false) {
            ((ei)fm23).q(n8);
        }
        iL2.k(l3, l4, fm22);
    }

    public final /* synthetic */ long Z0(long l2) {
        return Uo0.d(l2, this);
    }

    public final void d1(ZD object, long l2, long l3, float f5, Qt0 qt0, TX tX, int n3) {
        iL iL2 = this.a.c;
        float f6 = e72.d(l2);
        float f7 = e72.e(l2);
        float f8 = e72.d(l2);
        float f11 = C63.d(l3) + f8;
        f8 = e72.e(l2);
        float f12 = C63.b(l3) + f8;
        Object object2 = this;
        object2 = this.n((ZD)object, qt0, f5, tX, n3, 1);
        object = iL2;
        iL2.u(f6, f7, f11, f12, (fm2)object2);
    }

    public final /* synthetic */ int e0(float f5) {
        return Uo0.a(f5, this);
    }

    public final void g0(ZD object, long l2, long l3, long l4, float f5, Qt0 qt0, TX tX, int n3) {
        iL iL2 = this.a.c;
        float f6 = e72.d(l2);
        float f7 = e72.e(l2);
        float f8 = e72.d(l2);
        float f11 = C63.d(l3) + f8;
        f8 = e72.e(l2);
        float f12 = C63.b(l3) + f8;
        float f14 = r90_0.b(l4);
        float f15 = r90_0.c(l4);
        Object object2 = this;
        object2 = this.n((ZD)object, qt0, f5, tX, n3, 1);
        object = iL2;
        iL2.l(f6, f7, f11, f12, f14, f15, (fm2)object2);
    }

    public final float getDensity() {
        return this.a.a.getDensity();
    }

    public final bp1_0 getLayoutDirection() {
        return this.a.b;
    }

    public final /* synthetic */ float h0(long l2) {
        return Uo0.c(l2, this);
    }

    public final long l() {
        return this.b.l();
    }

    public final void l0(ZD object, long l2, long l3, float f5, int n3, li li2, float f6, TX tX, int n4) {
        float f7;
        iL iL2 = this.a.c;
        fm2 fm22 = this.p();
        if (object != null) {
            long l4 = this.l();
            ((ZD)object).a(f6, l4, fm22);
        } else {
            object = fm22;
            object = (ei)fm22;
            float f8 = ((ei)object).getAlpha();
            float f11 = f8 - f6;
            Object object2 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
            if (object2 != false) {
                ((ei)object).b(f6);
            }
        }
        object = fm22;
        object = (ei)fm22;
        TX tX3 = ((ei)object).d;
        int n7 = Intrinsics.areEqual(tX3, tX);
        if (n7 == 0) {
            ((ei)object).l(tX);
        }
        if ((n7 = zy_0.a(((ei)object).b, n4)) == 0) {
            ((ei)object).d(n4);
        }
        if ((n7 = (f7 = (f6 = (tX3 = ((ei)object).a).getStrokeWidth()) - f5) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) != 0) {
            ((ei)object).n(f5);
        }
        Object object3 = ((ei)object).a;
        f5 = object3.getStrokeMiter();
        n7 = 0x40800000;
        f6 = 4.0f;
        float f12 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (f12 != false) {
            ((ei)object).k(f6);
        }
        f12 = (float)Se3.a(((ei)object).o(), n3);
        if (f12 == false) {
            ((ei)object).c(n3);
        }
        f12 = ((ei)object).p();
        n3 = 0;
        if ((f12 = (float)Ue3.b((int)f12, 0)) == false) {
            ((ei)object).e(0);
        }
        if ((f12 = (float)Intrinsics.areEqual(object3 = ((ei)object).e, li2)) == false) {
            ((ei)object).g(li2);
        }
        object3 = ((ei)object).a;
        f12 = (float)object3.isFilterBitmap();
        n3 = 1;
        if ((f12 = (float)BM0.a((int)f12, n3)) == false) {
            ((ei)object).q(n3);
        }
        object3 = iL2;
        iL2.k(l2, l3, fm22);
    }

    public final fm2 n(ZD object, Qt0 object2, float f5, TX tX, int n3, int n4) {
        object2 = this.v((Qt0)object2);
        if (object != null) {
            long l2 = this.l();
            ((ZD)object).a(f5, l2, (fm2)object2);
        } else {
            float f6;
            long l3;
            long l4;
            float f7;
            boolean bl2;
            object = object2;
            object = (ei)object2;
            Shader shader = ((ei)object).c;
            if (shader != null) {
                bl2 = false;
                f7 = 0.0f;
                shader = null;
                ((ei)object).i(null);
            }
            if (!(bl2 = OX.c(l4 = ((ei)object).a(), l3 = OX.b))) {
                ((ei)object).f(l3);
            }
            if (bl2 = (f6 = (f7 = ((ei)object).getAlpha()) - f5) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) {
                ((ei)object).b(f5);
            }
        }
        object = object2;
        object = (ei)object2;
        TX tX3 = ((ei)object).d;
        boolean bl3 = Intrinsics.areEqual(tX3, tX);
        if (!bl3) {
            ((ei)object).l(tX);
        }
        if (!(bl3 = zy_0.a(((ei)object).b, n3))) {
            ((ei)object).d(n3);
        }
        if (!(bl3 = BM0.a((int)((tX3 = ((ei)object).a).isFilterBitmap() ? 1 : 0), n4))) {
            ((ei)object).q(n4);
        }
        return object2;
    }

    public final fm2 p() {
        ei ei2 = this.d;
        if (ei2 == null) {
            ei2 = fi.a();
            int n3 = 1;
            ei2.m(n3);
            this.d = ei2;
        }
        return ei2;
    }

    public final void t0(hd1_0 hd1_02, long l2, long l3, long l4, long l7, float f5, Qt0 qt0, TX tX, int n3, int n4) {
        iL iL2 = this.a.c;
        fm2 fm22 = this.n(null, qt0, f5, tX, n3, n4);
        iL2.e(hd1_02, l2, l3, l4, l7, fm22);
    }

    public final fm2 v(Qt0 object) {
        block12: {
            block11: {
                float f5;
                boolean bl2;
                Object object2;
                block10: {
                    object2 = rM0.a;
                    bl2 = Intrinsics.areEqual(object, object2);
                    if (!bl2) break block10;
                    object = this.c;
                    if (object == null) {
                        object = fi.a();
                        bl2 = false;
                        object2 = null;
                        ((ei)object).m(0);
                        this.c = object;
                    }
                    break block11;
                }
                bl2 = object instanceof re3_1;
                if (!bl2) break block12;
                Object object3 = object2 = this.p();
                object3 = (ei)object2;
                Object object4 = ((ei)object3).a;
                float f6 = object4.getStrokeWidth();
                object = (re3_1)object;
                float f7 = ((re3_1)object).a;
                float f8 = f6 - f7;
                Object object5 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (object5 != false) {
                    ((ei)object3).n(f7);
                }
                object5 = ((ei)object3).o();
                int n3 = ((re3_1)object).c;
                object5 = Se3.a((int)object5, n3);
                if (object5 == false) {
                    ((ei)object3).c(n3);
                }
                if ((object5 = (f5 = (f6 = (object4 = ((ei)object3).a).getStrokeMiter()) - (f7 = ((re3_1)object).b)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) != false) {
                    ((ei)object3).k(f7);
                }
                object5 = ((ei)object3).p();
                n3 = ((re3_1)object).d;
                object5 = Ue3.b((int)object5, n3);
                if (object5 == false) {
                    ((ei)object3).e(n3);
                }
                if ((object5 = (Object)Intrinsics.areEqual(object4 = ((ei)object3).e, object = ((re3_1)object).e)) == false) {
                    ((ei)object3).g((li)object);
                }
                object = object2;
            }
            return object;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    public final void v0(gn2 gn22, long l2, float f5, Qt0 qt0, TX tX, int n3) {
        iL iL2 = this.a.c;
        fm2 fm22 = xl_0.e(this, l2, qt0, f5, tX, n3);
        iL2.m(gn22, fm22);
    }

    public final /* synthetic */ long x(float f5) {
        return mv0_0.b(f5, this);
    }

    public final /* synthetic */ long z(long l2) {
        return Uo0.b(l2, this);
    }
}

