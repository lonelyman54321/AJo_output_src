/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from J63
 */
public final class j63_0
extends LP1$c
implements rp1_1 {
    public float n;
    public float o;
    public float p;
    public float q;
    public boolean r;

    public final int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        long l2 = this.r1(rj1);
        int n4 = c60.f(l2);
        n4 = n4 != 0 ? c60.h(l2) : f60.g(qj1.v(n3), l2);
        return n4;
    }

    public final int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        long l2 = this.r1(rj1);
        int n4 = c60.g(l2);
        n4 = n4 != 0 ? c60.i(l2) : f60.h(qj1.P(n3), l2);
        return n4;
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        int n3;
        int n4;
        long l3 = this.r1(dl1_12);
        int n7 = this.r;
        if (n7 != 0) {
            l2 = f60.f(l2, l3);
        } else {
            int n8;
            int n10;
            float f5 = this.n;
            int n14 = 2143289344;
            float f6 = 0.0f / 0.0f;
            n7 = xs0_0.a(f5, f6);
            if (n7 == 0) {
                n7 = c60.k(l3);
            } else {
                n7 = c60.k(l2);
                if (n7 > (n10 = c60.i(l3))) {
                    n7 = n10;
                }
            }
            float f7 = this.p;
            n10 = (int)(xs0_0.a(f7, f6) ? 1 : 0);
            if (n10 == 0) {
                n10 = c60.i(l3);
            } else {
                n10 = c60.i(l2);
                if (n10 < (n8 = c60.k(l3))) {
                    n10 = n8;
                }
            }
            float f8 = this.o;
            n8 = (int)(xs0_0.a(f8, f6) ? 1 : 0);
            if (n8 == 0) {
                n8 = c60.j(l3);
            } else {
                int n15;
                n8 = c60.j(l2);
                if (n8 > (n15 = c60.h(l3))) {
                    n8 = n15;
                }
            }
            float f11 = this.q;
            n14 = (int)(xs0_0.a(f11, f6) ? 1 : 0);
            if (n14 == 0) {
                n4 = c60.h(l3);
            } else {
                n4 = c60.h(l2);
                if (n4 < (n3 = c60.j(l3))) {
                    n4 = n3;
                }
            }
            l2 = f60.a(n7, n10, n8, n4);
        }
        object = object.Q(l2);
        n4 = ((Ns2)object).a;
        n3 = ((Ns2)object).b;
        j63$a_0 j63$a_0 = new j63$a_0((Ns2)object);
        return cl1_0.a(dl1_12, n4, n3, j63$a_0);
    }

    public final int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        long l2 = this.r1(rj1);
        int n4 = c60.f(l2);
        n4 = n4 != 0 ? c60.h(l2) : f60.g(qj1.I(n3), l2);
        return n4;
    }

    public final int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        long l2 = this.r1(rj1);
        int n4 = c60.g(l2);
        n4 = n4 != 0 ? c60.i(l2) : f60.h(qj1.N(n3), l2);
        return n4;
    }

    public final long r1(Vo0 vo0) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        float f5;
        int n14;
        block17: {
            float f6;
            block16: {
                float f7;
                float f8 = this.p;
                n14 = 2143289344;
                f5 = 0.0f / 0.0f;
                n10 = xs0_0.a(f8, f5);
                n8 = -1 >>> 1;
                n7 = 0;
                if (n10 == 0) {
                    f8 = this.p;
                    n10 = vo0.e0(f8);
                    if (n10 < 0) {
                        n10 = 0;
                        f8 = 0.0f;
                    }
                } else {
                    n10 = -1 >>> 1;
                    f8 = 0.0f / 0.0f;
                }
                if ((n4 = xs0_0.a(f7 = this.q, f5)) == 0) {
                    f7 = this.q;
                    n4 = vo0.e0(f7);
                    if (n4 < 0) {
                        n4 = 0;
                        f7 = 0.0f;
                    }
                } else {
                    n4 = -1 >>> 1;
                    f7 = 0.0f / 0.0f;
                }
                if ((n3 = xs0_0.a(f6 = this.n, f5)) != 0) break block16;
                f6 = this.n;
                n3 = vo0.e0(f6);
                if (n3 > n10) {
                    n3 = n10;
                }
                if (n3 < 0) {
                    n3 = 0;
                    f6 = 0.0f;
                }
                if (n3 != n8) break block17;
            }
            n3 = 0;
            f6 = 0.0f;
        }
        float f11 = this.o;
        n14 = (int)(xs0_0.a(f11, f5) ? 1 : 0);
        if (n14 == 0) {
            f5 = this.o;
            int n15 = vo0.e0(f5);
            if (n15 > n4) {
                n15 = n4;
            }
            if (n15 < 0) {
                n15 = 0;
                vo0 = null;
            }
            if (n15 != n8) {
                n7 = n15;
            }
        }
        return f60.a(n3, n10, n7, n4);
    }
}

