/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Rc
extends LP1$c
implements rp1_1 {
    public Oc n;
    public float o;
    public float p;

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.b(this, rj1, qj1, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 xk1_02, long l2) {
        int n3;
        Qc qc;
        long l3;
        int n4;
        Object object;
        float f5;
        int n7;
        int n8;
        dl1_1 dl1_13 = dl1_12;
        Oc oc = this.n;
        float f6 = this.o;
        float f7 = this.p;
        int n10 = oc instanceof m91;
        if (n10 != 0) {
            n8 = 0;
            n7 = 0;
            f5 = 0.0f;
            object = null;
            n4 = 11;
            l3 = l2;
            l3 = c60.b(l2, 0, 0, 0, 0, n4);
        } else {
            n4 = 0;
            qc = null;
            n8 = 0;
            n7 = 0;
            f5 = 0.0f;
            int n14 = 14;
            l3 = c60.b(l2, 0, 0, 0, 0, n14);
        }
        object = xk1_02;
        object = xk1_02.Q(l3);
        int n15 = object.U(oc);
        int n16 = -1 << -1;
        if (n15 == n16) {
            n15 = 0;
        }
        n16 = n10 != 0 ? ((Ns2)object).b : ((Ns2)object).a;
        n8 = n10 != 0 ? c60.h(l2) : c60.i(l2);
        n7 = 2143289344;
        f5 = 0.0f / 0.0f;
        n4 = (int)(xs0_0.a(f6, f5) ? 1 : 0);
        n4 = n4 == 0 ? dl1_13.e0(f6) : 0;
        n4 -= n15;
        n4 = kotlin.ranges.f.g(n4, 0, n8 -= n16);
        n7 = (int)(xs0_0.a(f7, f5) ? 1 : 0);
        if (n7 == 0) {
            n3 = dl1_13.e0(f7);
        } else {
            n3 = 0;
            f7 = 0.0f;
        }
        n3 = n3 - n16 + n15;
        n16 = kotlin.ranges.f.g(n3, 0, n8 -= n4);
        if (n10 != 0) {
            n3 = ((Ns2)object).a;
        } else {
            n3 = ((Ns2)object).a + n4 + n16;
            n15 = c60.k(l2);
            n3 = Math.max(n3, n15);
        }
        n8 = n3;
        if (n10 != 0) {
            n3 = ((Ns2)object).b + n4 + n16;
            n10 = c60.j(l2);
            n3 = Math.max(n3, n10);
        } else {
            n3 = ((Ns2)object).b;
        }
        n7 = n3;
        n10 = n4;
        n15 = n8;
        qc = new Qc(oc, f6, n4, n8, n16, (Ns2)object, n3);
        return cl1_0.a(dl1_13, n8, n3, qc);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.d(this, rj1, qj1, n3);
    }
}

