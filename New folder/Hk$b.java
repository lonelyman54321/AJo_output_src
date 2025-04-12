/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Hk$b
extends vp1_1 {
    public final gr3$a b;
    public final ib3_0 c;
    public final /* synthetic */ Hk d;

    public Hk$b(Hk hk, gr3$a gr3$a, tr1_0 tr1_02) {
        this.d = hk;
        this.b = gr3$a;
        this.c = tr1_02;
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        long l3;
        int n3;
        object = object.Q(l2);
        Hk hk = this.d;
        Object object2 = new Hk$b$b(hk, this);
        Hk$b$c hk$b$c = new Hk$b$c(hk);
        gr3$a gr3$a = this.b;
        hk.e = object2 = gr3$a.a((Function1)object2, hk$b$c);
        int n4 = dl1_12.W();
        if (n4 != 0) {
            n3 = ((Ns2)object).a;
            n4 = ((Ns2)object).b;
            l3 = dj1.a(n3, n4);
        } else {
            object2 = (bj1)((gr3$a$a)object2).getValue();
            l3 = ((bj1)object2).a;
        }
        n3 = (int)(l3 >> 32);
        int n7 = (int)(0xFFFFFFFFL & l3);
        Hk$b$a hk$b$a = new Hk$b$a(hk, (Ns2)object, l3);
        return cl1_0.a(dl1_12, n3, n7, hk$b$a);
    }
}

