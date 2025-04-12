/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yB1
 */
public final class yb1_0
implements zp1 {
    public final xb1_0 a;

    public yb1_0(xb1_0 xb1_02) {
        this.a = xb1_02;
    }

    public final long A(long l2) {
        l2 = this.a.m.A(l2);
        long l3 = this.b();
        return e72.i(l2, l3);
    }

    public final long F(zp1 zp12, long l2) {
        return this.c(zp12, l2);
    }

    public final aG2 G(zp1 zp12, boolean bl2) {
        return this.a.m.G(zp12, bl2);
    }

    public final long J(long l2) {
        w32_0 w32_02 = this.a.m;
        long l3 = this.b();
        l2 = e72.i(l2, l3);
        return w32_02.J(l2);
    }

    public final void L(float[] fArray) {
        this.a.m.L(fArray);
    }

    public final zp1 S() {
        boolean bl2 = this.e();
        yb1_0 yb1_02 = null;
        if (bl2) {
            tb1_0 tb1_02 = this.a.m.m.y.c.q;
            if (tb1_02 != null && (tb1_02 = tb1_02.h1()) != null) {
                yb1_02 = ((xb1_0)tb1_02).p;
            }
            return yb1_02;
        }
        bh1_1.c("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final long a() {
        xb1_0 xb1_02 = this.a;
        int n3 = xb1_02.a;
        int n4 = xb1_02.b;
        return dj1.a(n3, n4);
    }

    public final long a0(long l2) {
        w32_0 w32_02 = this.a.m;
        long l3 = this.b();
        l2 = e72.i(l2, l3);
        return w32_02.a0(l2);
    }

    public final long b() {
        xb1_0 xb1_02 = this.a;
        tb1_0 tb1_02 = zB1.b(xb1_02);
        yb1_0 yb1_02 = tb1_02.p;
        long l2 = 0L;
        long l3 = this.c(yb1_02, l2);
        tb1_02 = tb1_02.m;
        long l4 = xb1_02.m.r1((zp1)((Object)tb1_02), l2);
        return e72.h(l3, l4);
    }

    public final long c(zp1 object, long l2) {
        boolean bl2 = object instanceof yb1_0;
        Object object2 = this.a;
        if (bl2) {
            long l3;
            object = ((yb1_0)object).a;
            ((xb1_0)object).m.s1();
            tb1_0 tb1_02 = ((xb1_0)object2).m;
            w32_0 w32_02 = ((xb1_0)object).m;
            tb1_02 = tb1_02.f1(w32_02).h1();
            int n3 = 0;
            w32_02 = null;
            long l4 = 0xFFFFFFFFL;
            int n4 = 32;
            if (tb1_02 != null) {
                long l7 = ((xb1_0)object).W0((xb1_0)tb1_02, false);
                l3 = Ti1.b(l2);
                l3 = Si1.d(l7, l3);
                long l8 = ((xb1_0)object2).W0((xb1_0)tb1_02, false);
                l3 = Si1.c(l3, l8);
                l8 = l3 >> n4;
                int n7 = (int)l8;
                float f5 = n7;
                int n8 = (int)(l3 & l4);
                float f6 = n8;
                l3 = h72.a(f5, f6);
            } else {
                tb1_02 = zB1.b((xb1_0)object);
                long l12 = ((xb1_0)object).W0((xb1_0)tb1_02, false);
                long l14 = ((xb1_0)tb1_02).n;
                l12 = Si1.d(l12, l14);
                l3 = Ti1.b(l2);
                l3 = Si1.d(l12, l3);
                tb1_0 tb1_03 = zB1.b((xb1_0)object2);
                long l15 = ((xb1_0)object2).W0((xb1_0)tb1_03, false);
                l12 = ((xb1_0)tb1_03).n;
                l15 = Si1.d(l15, l12);
                l3 = Si1.c(l3, l15);
                l15 = l3 >> n4;
                n3 = (int)l15;
                float f7 = n3;
                int n10 = (int)(l3 & l4);
                float f8 = n10;
                l3 = h72.a(f7, f8);
                tb1_03 = ((xb1_0)tb1_03).m.q;
                Intrinsics.checkNotNull(tb1_03);
                tb1_02 = ((xb1_0)tb1_02).m.q;
                Intrinsics.checkNotNull(tb1_02);
                l3 = ((w32_0)tb1_03).r1((zp1)((Object)tb1_02), l3);
            }
            return l3;
        }
        tb1_0 tb1_04 = zB1.b((xb1_0)object2);
        object2 = ((xb1_0)tb1_04).p;
        l2 = this.c((zp1)object2, l2);
        tb1_04 = ((xb1_0)tb1_04).m;
        tb1_04.getClass();
        long l16 = ((w32_0)tb1_04).r1((zp1)object, 0L);
        return e72.i(l2, l16);
    }

    public final boolean e() {
        return this.a.m.j1().m;
    }

    public final long n(long l2) {
        l2 = this.a.m.n(l2);
        long l3 = this.b();
        return e72.i(l2, l3);
    }

    public final void y(zp1 zp12, float[] fArray) {
        this.a.m.y(zp12, fArray);
    }
}

