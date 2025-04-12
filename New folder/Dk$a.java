/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Dk$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2[] c;
    public final /* synthetic */ Dk d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public Dk$a(Ns2[] ns2Array, Dk dk2, int n3, int n4) {
        this.c = ns2Array;
        this.d = dk2;
        this.e = n3;
        this.f = n4;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        for (Ns2 ns2 : this.c) {
            if (ns2 == null) continue;
            Hk hk = this.d.a;
            Nc nc = hk.b;
            int n3 = ns2.a;
            int n4 = ns2.b;
            long l2 = dj1.a(n3, n4);
            n3 = this.e;
            int n7 = this.f;
            long l3 = dj1.a(n3, n7);
            bp1_0 bp1_02 = bp1_0.Ltr;
            long l4 = nc.a(l2, l3, bp1_02);
            n4 = 32;
            l2 = l4 >> n4;
            int n8 = (int)l2;
            l3 = 0xFFFFFFFFL;
            int n10 = (int)(l4 &= l3);
            Ns2$a.d((Ns2$a)object, ns2, n8, n10);
        }
        return Unit.a;
    }
}

