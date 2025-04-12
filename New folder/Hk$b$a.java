/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Hk$b$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Hk c;
    public final /* synthetic */ Ns2 d;
    public final /* synthetic */ long e;

    public Hk$b$a(Hk hk, Ns2 ns2, long l2) {
        this.c = hk;
        this.d = ns2;
        this.e = l2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Nc nc = this.c.b;
        Ns2 ns2 = this.d;
        int n3 = ns2.a;
        int n4 = ns2.b;
        long l2 = dj1.a(n3, n4);
        long l3 = this.e;
        bp1_0 bp1_02 = bp1_0.Ltr;
        long l4 = nc.a(l2, l3, bp1_02);
        Ns2$a.e((Ns2$a)object, ns2, l4);
        return Unit.a;
    }
}

