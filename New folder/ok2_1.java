/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from ok2
 */
public final class ok2_1
extends LP1$c
implements rp1_1 {
    public mk2_0 n;

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 object, xk1_0 object2, long l2) {
        bp1_0 bp1_02;
        mk2_0 mk2_02 = this.n;
        Object object3 = object.getLayoutDirection();
        float f5 = mk2_02.calculateLeftPadding-u2uoSUM((bp1_0)((Object)object3));
        int n3 = 0;
        object3 = null;
        float f6 = 0.0f;
        int n4 = Float.compare(f5, f6);
        if (n4 >= 0 && (n4 = Float.compare(f5 = (mk2_02 = this.n).calculateTopPadding-D9Ej5fM(), f6)) >= 0 && (n4 = Float.compare(f5 = (mk2_02 = this.n).calculateRightPadding-u2uoSUM(bp1_02 = object.getLayoutDirection()), f6)) >= 0 && (n4 = Float.compare(f5 = (mk2_02 = this.n).calculateBottomPadding-D9Ej5fM(), f6)) >= 0) {
            mk2_02 = this.n;
            object3 = object.getLayoutDirection();
            f5 = mk2_02.calculateLeftPadding-u2uoSUM((bp1_0)((Object)object3));
            n4 = object.e0(f5);
            object3 = this.n;
            bp1_02 = object.getLayoutDirection();
            f6 = object3.calculateRightPadding-u2uoSUM(bp1_02);
            n3 = object.e0(f6) + n4;
            f5 = this.n.calculateTopPadding-D9Ej5fM();
            n4 = object.e0(f5);
            float f7 = this.n.calculateBottomPadding-D9Ej5fM();
            int n7 = object.e0(f7) + n4;
            n4 = -n3;
            int n8 = -n7;
            long l3 = f60.k(n4, n8, l2);
            object2 = object2.Q(l3);
            n4 = f60.h(((Ns2)object2).a + n3, l2);
            int n10 = f60.g(((Ns2)object2).b + n7, l2);
            ok2$a_1 ok2$a_1 = new ok2$a_1((Ns2)object2, (dl1_1)object, this);
            return cl1_0.a((dl1_1)object, n4, n10, ok2$a_1);
        }
        object2 = "Padding must be non-negative".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.d(this, rj1, qj1, n3);
    }
}

