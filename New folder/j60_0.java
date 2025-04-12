/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from j60
 */
public final class j60_0
implements L63,
op1_1 {
    public final kb3_2 b;

    public j60_0() {
        kb3_2 kb3_22;
        long l2 = Lz3.a;
        c60 c602 = new c60(l2);
        this.b = kb3_22 = lb3_2.a(c602);
    }

    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final Object j(pe2_0 pe2_02) {
        kb3_2 kb3_22 = this.b;
        h60_0 h60_02 = new h60_0(kb3_22);
        return ms0_1.j(h60_02, pe2_02);
    }

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        Object object2 = new c60(l2);
        kb3_2 kb3_22 = this.b;
        kb3_22.getClass();
        kb3_22.k(null, object2);
        object = object.Q(l2);
        int n3 = ((Ns2)object).a;
        int n4 = ((Ns2)object).b;
        object2 = new O7(object, 1);
        return cl1_0.a(dl1_12, n3, n4, (Function1)object2);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.d(this, rj1, qj1, n3);
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

