/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class Uj1
extends LP1$c
implements rp1_1 {
    public int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qj1.v(n3);
    }

    public int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qj1.P(n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        long l3 = this.r1((xk1_0)object, l2);
        boolean bl2 = this.s1();
        if (bl2) {
            l3 = f60.f(l2, l3);
        }
        object = object.Q(l3);
        int n3 = ((Ns2)object).a;
        int n4 = ((Ns2)object).b;
        Uj1$a uj1$a = new Uj1$a((Ns2)object);
        return cl1_0.a(dl1_12, n3, n4, uj1$a);
    }

    public int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qj1.I(n3);
    }

    public int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qj1.N(n3);
    }

    public abstract long r1(xk1_0 var1, long var2);

    public abstract boolean s1();
}

