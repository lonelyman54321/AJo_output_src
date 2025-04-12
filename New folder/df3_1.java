/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.text.handwriting.a;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from df3
 */
public final class df3_1
extends cf3_1
implements rp1_1 {
    public df3_1() {
        throw null;
    }

    public final boolean Y0() {
        return true;
    }

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        float f5 = androidx.compose.foundation.text.handwriting.a.a;
        int n3 = dl1_12.e0(f5);
        float f6 = androidx.compose.foundation.text.handwriting.a.b;
        int n4 = dl1_12.e0(f6);
        int n7 = n4 * 2;
        int n8 = n3 * 2;
        l2 = f60.k(n7, n8, l2);
        object = object.Q(l2);
        int n10 = ((Ns2)object).b - n8;
        int n14 = ((Ns2)object).a - n7;
        df3$a_1 df3$a_1 = new df3$a_1(n4, n3, (Ns2)object);
        return cl1_0.a(dl1_12, n14, n10, df3$a_1);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.d(this, rj1, qj1, n3);
    }
}

