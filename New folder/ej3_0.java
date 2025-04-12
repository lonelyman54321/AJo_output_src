/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from eJ3
 */
public final class ej3_0
extends LP1$c
implements rp1_1 {
    public Hq0 n;
    public boolean o;
    public Function2 p;

    public ej3_0() {
        throw null;
    }

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 xk1_02, long l2) {
        boolean bl2;
        int n3;
        int n4;
        Hq0 hq0 = this.n;
        Hq0 hq02 = Hq0.Vertical;
        int n7 = 0;
        if (hq0 != hq02) {
            n4 = 0;
            hq0 = null;
        } else {
            n4 = c60.k(l2);
        }
        Object object = this.n;
        Hq0 hq03 = Hq0.Horizontal;
        if (object == hq03) {
            n7 = c60.j(l2);
        }
        object = this.n;
        int n8 = -1 >>> 1;
        n3 = object != hq02 && (n3 = this.o) != 0 ? -1 >>> 1 : c60.i(l2);
        object = this.n;
        if (object == hq03 || !(bl2 = this.o)) {
            n8 = c60.h(l2);
        }
        long l3 = f60.a(n4, n3, n7, n8);
        Ns2 ns2 = xk1_02.Q(l3);
        int n10 = ns2.a;
        n4 = c60.k(l2);
        n3 = c60.i(l2);
        n10 = kotlin.ranges.f.g(n10, n4, n3);
        n4 = ns2.b;
        n3 = c60.j(l2);
        int n14 = c60.h(l2);
        n14 = kotlin.ranges.f.g(n4, n3, n14);
        object = this;
        eJ3$a eJ3$a = new eJ3$a(this, n10, ns2, n14, dl1_12);
        return cl1_0.a(dl1_12, n10, n14, eJ3$a);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.d(this, rj1, qj1, n3);
    }
}

