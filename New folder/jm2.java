/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class jm2
extends LP1$c
implements rp1_1,
it0_0 {
    public im2 n;
    public boolean o;
    public Nc p;
    public i70_0 q;
    public float r;
    public TX s;

    public static boolean s1(long l2) {
        boolean bl2;
        float f5;
        boolean bl3;
        long l3 = 9205357640488583168L;
        boolean bl4 = C63.a(l2, l3);
        if (!(bl4 || (bl3 = Float.isInfinite(f5 = C63.b(l2))) || (bl2 = Float.isNaN(f5)))) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
        }
        return bl2;
    }

    public static boolean t1(long l2) {
        boolean bl2;
        float f5;
        boolean bl3;
        long l3 = 9205357640488583168L;
        boolean bl4 = C63.a(l2, l3);
        if (!(bl4 || (bl3 = Float.isInfinite(f5 = C63.d(l2))) || (bl2 = Float.isNaN(f5)))) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
        }
        return bl2;
    }

    public final /* synthetic */ void C0() {
    }

    public final boolean g1() {
        return false;
    }

    public final int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = this.r1();
        if (n4 != 0) {
            long l2 = f60.b(n3, 0, 13);
            l2 = this.u1(l2);
            n4 = qj1.v(n3);
            int n7 = c60.j(l2);
            n4 = Math.max(n7, n4);
        } else {
            n4 = qj1.v(n3);
        }
        return n4;
    }

    public final int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = this.r1();
        if (n4 != 0) {
            long l2 = f60.b(0, n3, 7);
            l2 = this.u1(l2);
            n4 = qj1.P(n3);
            int n7 = c60.k(l2);
            n4 = Math.max(n7, n4);
        } else {
            n4 = qj1.P(n3);
        }
        return n4;
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        l2 = this.u1(l2);
        object = object.Q(l2);
        int n3 = ((Ns2)object).a;
        int n4 = ((Ns2)object).b;
        jm2$a jm2$a = new jm2$a((Ns2)object);
        return cl1_0.a(dl1_12, n3, n4, jm2$a);
    }

    public final int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = this.r1();
        if (n4 != 0) {
            long l2 = f60.b(n3, 0, 13);
            l2 = this.u1(l2);
            n4 = qj1.I(n3);
            int n7 = c60.j(l2);
            n4 = Math.max(n7, n4);
        } else {
            n4 = qj1.I(n3);
        }
        return n4;
    }

    public final int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = this.r1();
        if (n4 != 0) {
            long l2 = f60.b(0, n3, 7);
            l2 = this.u1(l2);
            n4 = qj1.N(n3);
            int n7 = c60.k(l2);
            n4 = Math.max(n7, n4);
        } else {
            n4 = qj1.N(n3);
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(E60 object) {
        Object object2;
        long l2;
        float f5;
        float f6;
        long l3;
        float f7;
        im2 im22 = this.n;
        long l4 = im22.getIntrinsicSize-NH-jbRc();
        int n3 = jm2.t1(l4);
        if (n3 != 0) {
            f7 = C63.d(l4);
        } else {
            l3 = object.l();
            f7 = C63.d(l3);
        }
        int n4 = jm2.s1(l4);
        if (n4 != 0) {
            f6 = C63.b(l4);
        } else {
            l4 = object.l();
            f6 = C63.b(l4);
        }
        l4 = bo1_1.a(f7, f6);
        l3 = object.l();
        f7 = C63.d(l3);
        n4 = 0;
        float f8 = f7 - 0.0f;
        n3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (n3 == 0 || (n3 = (f5 = (f7 = C63.b(l2 = object.l())) - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) == 0) {
            l4 = 0L;
        } else {
            object2 = this.q;
            long l7 = object.l();
            l3 = object2.a(l4, l7);
            l4 = ZS2.d(l4, l3);
        }
        l2 = l4;
        Nc nc = this.p;
        int n7 = Math.round(C63.d(l4));
        int n8 = Math.round(C63.b(l4));
        long l8 = dj1.a(n7, n8);
        n7 = Math.round(C63.d(object.l()));
        long l12 = object.l();
        float f11 = C63.b(l12);
        n8 = Math.round(f11);
        long l14 = dj1.a(n7, n8);
        bp1_0 bp1_02 = object.getLayoutDirection();
        l4 = nc.a(l8, l14, bp1_02);
        n3 = 32;
        f7 = 4.5E-44f;
        n4 = (int)(l4 >> n3);
        float f12 = n4;
        l3 = 0xFFFFFFFFL;
        n8 = (int)(l4 &= l3);
        f6 = n8;
        yl_0 yl_02 = object.M0().a;
        yl_02.g(f12, f6);
        try {
            object2 = this.n;
            float f14 = this.r;
            TX tX = this.s;
            ((im2)object2).draw-x_KDEd0((Kt0)object, l2, f14, tX);
            object.e1();
            return;
        }
        finally {
            yl_02 = object.M0().a;
            f7 = -f12;
            f6 = -f6;
            yl_02.g(f7, f6);
        }
    }

    public final boolean r1() {
        long l2;
        im2 im22;
        long l3;
        long l4;
        long l7;
        boolean bl2 = this.o;
        if (bl2 && (l7 = (l4 = (l3 = (im22 = this.n).getIntrinsicSize-NH-jbRc()) - (l2 = 9205357640488583168L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            bl2 = true;
        } else {
            bl2 = false;
            im22 = null;
        }
        return bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PainterModifier(painter=");
        Object object = this.n;
        stringBuilder.append(object);
        stringBuilder.append(", sizeToIntrinsics=");
        boolean bl2 = this.o;
        stringBuilder.append(bl2);
        stringBuilder.append(", alignment=");
        object = this.p;
        stringBuilder.append(object);
        stringBuilder.append(", alpha=");
        float f5 = this.r;
        stringBuilder.append(f5);
        stringBuilder.append(", colorFilter=");
        object = this.s;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final long u1(long l2) {
        int n3;
        long l3;
        im2 im22;
        float f5;
        int n4 = c60.e(l2);
        int n7 = 0;
        float f6 = 0.0f;
        int n8 = 1;
        float f7 = Float.MIN_VALUE;
        if (n4 != 0 && (n4 = c60.d(l2)) != 0) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f5 = 0.0f;
            im22 = null;
        }
        boolean bl2 = c60.g(l2);
        if (bl2 && (bl2 = c60.f(l2))) {
            n7 = 1;
            f6 = Float.MIN_VALUE;
        }
        if ((n8 = this.r1()) == 0 && n4 != 0 || n7 != 0) {
            int n10 = c60.i(l2);
            int n14 = c60.h(l2);
            long l4 = l2;
            return c60.b(l2, n10, 0, n14, 0, 10);
        }
        im22 = this.n;
        long l7 = im22.getIntrinsicSize-NH-jbRc();
        n8 = jm2.t1(l7);
        if (n8 != 0) {
            f7 = C63.d(l7);
            n8 = Math.round(f7);
        } else {
            n8 = c60.k(l2);
        }
        bl2 = jm2.s1(l7);
        if (bl2) {
            f5 = C63.b(l7);
            n4 = Math.round(f5);
        } else {
            n4 = c60.j(l2);
        }
        n7 = f60.h(n8, l2);
        n4 = f60.g(n4, l2);
        f6 = n7;
        f5 = n4;
        l7 = bo1_1.a(f6, f5);
        n8 = (int)(this.r1() ? 1 : 0);
        if (n8 != 0) {
            float f8;
            float f11;
            im2 im23 = this.n;
            long l8 = im23.getIntrinsicSize-NH-jbRc();
            n8 = (int)(jm2.t1(l8) ? 1 : 0);
            if (n8 == 0) {
                f7 = C63.d(l7);
            } else {
                im23 = this.n;
                l8 = im23.getIntrinsicSize-NH-jbRc();
                f7 = C63.d(l8);
            }
            im2 im24 = this.n;
            l3 = im24.getIntrinsicSize-NH-jbRc();
            bl2 = jm2.s1(l3);
            if (!bl2) {
                f11 = C63.b(l7);
            } else {
                im24 = this.n;
                l3 = im24.getIntrinsicSize-NH-jbRc();
                f11 = C63.b(l3);
            }
            l8 = bo1_1.a(f7, f11);
            float f12 = C63.d(l7);
            n3 = 0;
            float f14 = f12 - 0.0f;
            float f15 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
            if (f15 == false || (f15 = (f8 = (f12 = C63.b(l7)) - 0.0f) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) == false) {
                l7 = 0L;
            } else {
                i70_0 i70_02 = this.q;
                l7 = i70_02.a(l8, l7);
                l7 = ZS2.d(l8, l7);
            }
        }
        n3 = f60.h(Math.round(C63.d(l7)), l2);
        int n15 = f60.g(Math.round(C63.b(l7)), l2);
        l3 = l2;
        return c60.b(l2, n3, 0, n15, 0, 10);
    }
}

