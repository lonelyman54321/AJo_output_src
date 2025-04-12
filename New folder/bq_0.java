/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from bq
 */
public final class bq_0
extends LP1$c
implements rp1_1 {
    public float n;
    public boolean o;

    public final int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = -1 >>> 1;
        float f5 = 0.0f / 0.0f;
        if (n3 != n4) {
            f5 = n3;
            float f6 = this.n;
            n4 = Math.round(f5 /= f6);
        } else {
            n4 = qj1.v(n3);
        }
        return n4;
    }

    public final int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = -1 >>> 1;
        float f5 = 0.0f / 0.0f;
        if (n3 != n4) {
            f5 = n3;
            float f6 = this.n;
            n4 = Math.round(f5 *= f6);
        } else {
            n4 = qj1.P(n3);
        }
        return n4;
    }

    public final bl1_0 measure-3p2s80s(dl1_1 object, xk1_0 object2, long l2) {
        int n3;
        int n4;
        long l3;
        boolean bl2 = this.o;
        boolean bl3 = true;
        long l4 = 0L;
        if (!(!bl2 ? !(bl2 = bj1.b(l3 = this.s1(l2, bl3), l4)) || !(bl2 = bj1.b(l3 = this.r1(l2, bl3), l4)) || !(bl2 = bj1.b(l3 = this.u1(l2, bl3), l4)) || !(bl2 = bj1.b(l3 = this.t1(l2, bl3), l4)) || !(bl2 = bj1.b(l3 = this.s1(l2, false), l4)) || !(bl2 = bj1.b(l3 = this.r1(l2, false), l4)) || !(bl2 = bj1.b(l3 = this.u1(l2, false), l4)) || !(bl2 = bj1.b(l3 = this.t1(l2, false), l4)) : !(bl2 = bj1.b(l3 = this.r1(l2, bl3), l4)) || !(bl2 = bj1.b(l3 = this.s1(l2, bl3), l4)) || !(bl2 = bj1.b(l3 = this.t1(l2, bl3), l4)) || !(bl2 = bj1.b(l3 = this.u1(l2, bl3), l4)) || !(bl2 = bj1.b(l3 = this.r1(l2, false), l4)) || !(bl2 = bj1.b(l3 = this.s1(l2, false), l4)) || !(bl2 = bj1.b(l3 = this.t1(l2, false), l4)) || !(bl2 = bj1.b(l3 = this.u1(l2, false), l4)))) {
            l3 = l4;
        }
        if (!(bl2 = bj1.b(l3, l4))) {
            l2 = l3 >> 32;
            n4 = (int)l2;
            long l7 = 0xFFFFFFFFL & l3;
            n3 = (int)l7;
            if (n4 >= 0 && n3 >= 0) {
                l2 = f60.i(n4, n4, n3, n3);
            } else {
                object = new StringBuilder("width(");
                ((StringBuilder)object).append(n4);
                ((StringBuilder)object).append(") and height(");
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append(") must be >= 0");
                hz0.a(((StringBuilder)object).toString());
                throw null;
            }
        }
        object2 = object2.Q(l2);
        n3 = ((Ns2)object2).a;
        n4 = ((Ns2)object2).b;
        bq$a_0 bq$a_0 = new bq$a_0((Ns2)object2);
        return cl1_0.a((dl1_1)object, n3, n4, bq$a_0);
    }

    public final int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = -1 >>> 1;
        float f5 = 0.0f / 0.0f;
        if (n3 != n4) {
            f5 = n3;
            float f6 = this.n;
            n4 = Math.round(f5 /= f6);
        } else {
            n4 = qj1.I(n3);
        }
        return n4;
    }

    public final int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = -1 >>> 1;
        float f5 = 0.0f / 0.0f;
        if (n3 != n4) {
            f5 = n3;
            float f6 = this.n;
            n4 = Math.round(f5 *= f6);
        } else {
            n4 = qj1.N(n3);
        }
        return n4;
    }

    public final long r1(long l2, boolean bl2) {
        int n3 = c60.h(l2);
        int n4 = -1 >>> 1;
        float f5 = 0.0f / 0.0f;
        if (n3 != n4) {
            f5 = n3;
            float f6 = this.n;
            n4 = Math.round(f5 *= f6);
            if (n4 > 0) {
                boolean bl3;
                long l3 = dj1.a(n4, n3);
                if (!bl2 || (bl3 = f60.j(l2, l3))) {
                    return l3;
                }
            }
        }
        return 0L;
    }

    public final long s1(long l2, boolean bl2) {
        int n3 = c60.i(l2);
        int n4 = -1 >>> 1;
        float f5 = 0.0f / 0.0f;
        if (n3 != n4) {
            f5 = n3;
            float f6 = this.n;
            n4 = Math.round(f5 /= f6);
            if (n4 > 0) {
                boolean bl3;
                long l3 = dj1.a(n3, n4);
                if (!bl2 || (bl3 = f60.j(l2, l3))) {
                    return l3;
                }
            }
        }
        return 0L;
    }

    public final long t1(long l2, boolean bl2) {
        int n3 = c60.j(l2);
        float f5 = n3;
        float f6 = this.n;
        int n4 = Math.round(f5 *= f6);
        if (n4 > 0) {
            boolean bl3;
            long l3 = dj1.a(n4, n3);
            if (!bl2 || (bl3 = f60.j(l2, l3))) {
                return l3;
            }
        }
        return 0L;
    }

    public final long u1(long l2, boolean bl2) {
        int n3 = c60.k(l2);
        float f5 = n3;
        float f6 = this.n;
        int n4 = Math.round(f5 /= f6);
        if (n4 > 0) {
            boolean bl3;
            long l3 = dj1.a(n3, n4);
            if (!bl2 || (bl3 = f60.j(l2, l3))) {
                return l3;
            }
        }
        return 0L;
    }
}

