/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from Jy
 */
public final class jy_1
extends LP1$c
implements rp1_1 {
    public Function1 n;

    public jy_1(Function1 function1) {
        this.n = function1;
    }

    public final boolean g1() {
        return false;
    }

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        object = object.Q(l2);
        int n3 = ((Ns2)object).a;
        int n4 = ((Ns2)object).b;
        Jy$a jy$a = new Jy$a((Ns2)object, this);
        return cl1_0.a(dl1_12, n3, n4, jy$a);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.d(this, rj1, qj1, n3);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BlockGraphicsLayerModifier(block=");
        Function1 function1 = this.n;
        stringBuilder.append(function1);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

