/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from jU2
 */
public final class ju2_2
extends LP1$c
implements rp1_1 {
    public st2_2 n;
    public boolean o;
    public boolean p;

    public final int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = this.p;
        n4 = n4 != 0 ? qj1.v(n3) : qj1.v(-1 >>> 1);
        return n4;
    }

    public final int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = this.p;
        n4 = n4 != 0 ? qj1.P(-1 >>> 1) : qj1.P(n3);
        return n4;
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        int n3;
        int n4 = this.p;
        pg2_0 pg2_02 = n4 != 0 ? pg2_0.Vertical : pg2_0.Horizontal;
        QS.a(l2, pg2_02);
        n4 = this.p;
        int n7 = -1 >>> 1;
        int n8 = n4 != 0 ? -1 >>> 1 : (n4 = c60.h(l2));
        n4 = (int)(this.p ? 1 : 0);
        int n10 = n4 != 0 ? (n7 = c60.i(l2)) : -1 >>> 1;
        v83_0 v83_02 = null;
        int n14 = 5;
        long l3 = c60.b(l2, 0, n10, 0, n8, n14);
        object = object.Q(l3);
        n4 = ((Ns2)object).a;
        n7 = c60.i(l2);
        if (n4 > n7) {
            n4 = n7;
        }
        if ((n7 = ((Ns2)object).b) > (n3 = c60.h(l2))) {
            n7 = n3;
        }
        n3 = ((Ns2)object).b - n7;
        int n15 = ((Ns2)object).a - n4;
        int n16 = this.p;
        if (n16 == 0) {
            n3 = n15;
        }
        Object object2 = this.n;
        Object object3 = ((st2_2)object2).d;
        object2 = ((st2_2)object2).a;
        ((e83_0)object3).e(n3);
        object3 = v83$a.a();
        Function1 function1 = object3 != null ? ((v83_0)object3).f() : null;
        v83_02 = v83$a.b((v83_0)object3);
        n10 = ((e83_0)object2).o();
        if (n10 > n3) {
            ((e83_0)object2).e(n3);
        }
        object2 = Unit.a;
        object2 = this.n;
        n16 = this.p;
        n16 = n16 != 0 ? n7 : n4;
        ((st2_2)object2).b.e(n16);
        object2 = new jU2$a(this, n3, (Ns2)object);
        return cl1_0.a(dl1_12, n4, n7, (Function1)object2);
        finally {
            v83$a.e((v83_0)object3, v83_02, function1);
        }
    }

    public final int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = this.p;
        n4 = n4 != 0 ? qj1.I(n3) : qj1.I(-1 >>> 1);
        return n4;
    }

    public final int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        int n4 = this.p;
        n4 = n4 != 0 ? qj1.N(-1 >>> 1) : qj1.N(n3);
        return n4;
    }
}

