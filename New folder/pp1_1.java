/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from Pp1
 */
public final class pp1_1
extends LP1$c
implements rp1_1 {
    public gx0_2 n;

    public pp1_1() {
        throw null;
    }

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 xk1_02, long l2) {
        gx0_2 gx0_22 = this.n;
        c60 c602 = new c60(l2);
        return (bl1_0)gx0_22.invoke(dl1_12, xk1_02, c602);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.d(this, rj1, qj1, n3);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LayoutModifierImpl(measureBlock=");
        gx0_2 gx0_22 = this.n;
        stringBuilder.append(gx0_22);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

