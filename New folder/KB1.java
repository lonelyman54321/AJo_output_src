/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class KB1
extends LP1$c
implements rp1_1 {
    public int n;
    public int o;

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(dl1_12, "$this$measure");
        Object object2 = "measurable";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n7 = this.n;
        int n8 = this.o;
        long l3 = dj1.a(n7, n8);
        l3 = f60.e(l2, l3);
        int n10 = c60.h(l2);
        int n14 = 32;
        int n15 = -1 >>> 1;
        if (n10 == n15 && (n10 = c60.i(l2)) != n15) {
            n4 = (int)(l3 >> n14);
            n3 = this.o * n4;
            n7 = this.n;
            l2 = f60.a(n4, n4, n3 /= n7, n3);
        } else {
            n10 = c60.i(l2);
            long l4 = 0xFFFFFFFFL;
            if (n10 == n15 && (n3 = c60.h(l2)) != n15) {
                n4 = (int)(l3 & l4);
                n3 = this.n * n4;
                n7 = this.o;
                l2 = f60.a(n3 /= n7, n3, n4, n4);
            } else {
                n4 = (int)(l3 >> n14);
                n3 = (int)(l3 &= l4);
                l2 = f60.a(n4, n4, n3, n3);
            }
        }
        object = object.Q(l2);
        n3 = ((Ns2)object).a;
        n4 = ((Ns2)object).b;
        object2 = new KB1$a((Ns2)object);
        return cl1_0.a(dl1_12, n3, n4, (Function1)object2);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.d(this, rj1, qj1, n3);
    }
}

