/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Uj1$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;

    public Uj1$a(Ns2 ns2) {
        this.c = ns2;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3;
        object = (Ns2$a)object;
        bp1_0 bp1_02 = ((Ns2$a)object).b();
        bp1_0 bp1_03 = bp1_0.Ltr;
        Ns2 ns2 = this.c;
        long l2 = 0L;
        if (bp1_02 != bp1_03 && (n3 = ((Ns2$a)object).c()) != 0) {
            n3 = ((Ns2$a)object).c();
            int n4 = ns2.a;
            n3 -= n4;
            n4 = (int)l2;
            long l3 = Ti1.a(n3 -= n4, n4);
            Ns2$a.a((Ns2$a)object, ns2);
            l2 = ns2.e;
            l3 = Si1.d(l3, l2);
            ns2.k0(l3, 0.0f, null);
        } else {
            Ns2$a.a((Ns2$a)object, ns2);
            long l4 = ns2.e;
            l4 = Si1.d(l2, l4);
            ns2.k0(l4, 0.0f, null);
        }
        return Unit.a;
    }
}

