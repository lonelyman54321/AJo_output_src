/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from ow3
 */
public final class ow3_0
extends LP1$c
implements rp1_1 {
    public float n;
    public float o;

    public final int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        int n4;
        int n7 = qj1.v(n3);
        float f5 = this.o;
        float f6 = 0.0f / 0.0f;
        n3 = (int)(xs0_0.a(f5, f6) ? 1 : 0);
        if (n3 == 0) {
            f5 = this.o;
            n4 = rj1.e0(f5);
        } else {
            n4 = 0;
            rj1 = null;
        }
        if (n7 < n4) {
            n7 = n4;
        }
        return n7;
    }

    public final int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        int n4;
        int n7 = qj1.P(n3);
        float f5 = this.n;
        float f6 = 0.0f / 0.0f;
        n3 = (int)(xs0_0.a(f5, f6) ? 1 : 0);
        if (n3 == 0) {
            f5 = this.n;
            n4 = rj1.e0(f5);
        } else {
            n4 = 0;
            rj1 = null;
        }
        if (n7 < n4) {
            n7 = n4;
        }
        return n7;
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        ow3$a ow3$a;
        int n3;
        float f5 = this.n;
        int n4 = 2143289344;
        float f6 = 0.0f / 0.0f;
        int n7 = xs0_0.a(f5, f6);
        int n8 = 0;
        if (n7 == 0 && (n7 = c60.k(l2)) == 0) {
            f5 = this.n;
            n7 = dl1_12.e0(f5);
            if (n7 > (n3 = c60.i(l2))) {
                n7 = n3;
            }
            if (n7 < 0) {
                n7 = 0;
                f5 = 0.0f;
                ow3$a = null;
            }
        } else {
            n7 = c60.k(l2);
        }
        n3 = c60.i(l2);
        float f7 = this.o;
        n4 = (int)(xs0_0.a(f7, f6) ? 1 : 0);
        if (n4 == 0 && (n4 = c60.j(l2)) == 0) {
            int n10;
            f6 = this.o;
            n4 = dl1_12.e0(f6);
            if (n4 > (n10 = c60.h(l2))) {
                n4 = n10;
            }
            if (n4 >= 0) {
                n8 = n4;
            }
        } else {
            n8 = c60.j(l2);
        }
        int n14 = c60.h(l2);
        l2 = f60.a(n7, n3, n8, n14);
        object = object.Q(l2);
        n14 = ((Ns2)object).a;
        int n15 = ((Ns2)object).b;
        ow3$a = new ow3$a((Ns2)object);
        return cl1_0.a(dl1_12, n14, n15, ow3$a);
    }

    public final int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        int n4;
        int n7 = qj1.I(n3);
        float f5 = this.o;
        float f6 = 0.0f / 0.0f;
        n3 = (int)(xs0_0.a(f5, f6) ? 1 : 0);
        if (n3 == 0) {
            f5 = this.o;
            n4 = rj1.e0(f5);
        } else {
            n4 = 0;
            rj1 = null;
        }
        if (n7 < n4) {
            n7 = n4;
        }
        return n7;
    }

    public final int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        int n4;
        int n7 = qj1.N(n3);
        float f5 = this.n;
        float f6 = 0.0f / 0.0f;
        n3 = (int)(xs0_0.a(f5, f6) ? 1 : 0);
        if (n3 == 0) {
            f5 = this.n;
            n4 = rj1.e0(f5);
        } else {
            n4 = 0;
            rj1 = null;
        }
        if (n7 < n4) {
            n7 = n4;
        }
        return n7;
    }
}

