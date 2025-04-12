/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from lk2
 */
public final class lk2_1
extends LP1$c
implements rp1_1 {
    public float n;
    public float o;
    public float p;
    public float q;
    public boolean r;

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        float f5 = this.n;
        int n3 = dl1_12.e0(f5);
        float f6 = this.p;
        int n4 = dl1_12.e0(f6) + n3;
        f5 = this.o;
        n3 = dl1_12.e0(f5);
        float f7 = this.q;
        int n7 = dl1_12.e0(f7) + n3;
        n3 = -n4;
        int n8 = -n7;
        long l3 = f60.k(n3, n8, l2);
        object = object.Q(l3);
        n3 = f60.h(((Ns2)object).a + n4, l2);
        int n10 = f60.g(((Ns2)object).b + n7, l2);
        lk2$a lk2$a = new lk2$a(this, (Ns2)object, dl1_12);
        return cl1_0.a(dl1_12, n3, n10, lk2$a);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.d(this, rj1, qj1, n3);
    }
}

