/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from tM0
 */
public final class tm0_0
extends LP1$c
implements rp1_1 {
    public Hq0 n;
    public float o;

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        int n3;
        int n4;
        Hq0 hq0;
        Hq0 hq02;
        int n7;
        int n8;
        Hq0 hq03;
        Object object2;
        int n10 = c60.e(l2);
        if (n10 != 0 && (object2 = this.n) != (hq03 = Hq0.Vertical)) {
            float f5 = c60.i(l2);
            float f6 = this.o;
            n10 = Math.round(f5 *= f6);
            n8 = c60.k(l2);
            n7 = c60.i(l2);
            n8 = n10 = kotlin.ranges.f.g(n10, n8, n7);
        } else {
            n10 = c60.k(l2);
            n8 = c60.i(l2);
        }
        n7 = c60.d(l2);
        if (n7 != 0 && (hq02 = this.n) != (hq0 = Hq0.Horizontal)) {
            float f7 = c60.h(l2);
            float f8 = this.o;
            n7 = Math.round(f7 *= f8);
            int n14 = c60.j(l2);
            n4 = c60.h(l2);
            n3 = n4 = kotlin.ranges.f.g(n7, n14, n4);
        } else {
            n7 = c60.j(l2);
            n3 = c60.h(l2);
            n4 = n7;
        }
        l2 = f60.a(n10, n8, n4, n3);
        object = object.Q(l2);
        n4 = ((Ns2)object).a;
        n3 = ((Ns2)object).b;
        object2 = new tM0$a((Ns2)object);
        return cl1_0.a(dl1_12, n4, n3, (Function1)object2);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.d(this, rj1, qj1, n3);
    }
}

