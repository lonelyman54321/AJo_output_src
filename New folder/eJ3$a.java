/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class eJ3$a
extends Lambda
implements Function1 {
    public final /* synthetic */ ej3_0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Ns2 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ dl1_1 g;

    public eJ3$a(ej3_0 ej3_02, int n3, Ns2 ns2, int n4, dl1_1 dl1_12) {
        this.c = ej3_02;
        this.d = n3;
        this.e = ns2;
        this.f = n4;
        this.g = dl1_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Function2 function2 = this.c.p;
        Ns2 ns2 = this.e;
        int n3 = ns2.a;
        int n4 = this.d - n3;
        n3 = ns2.b;
        int n7 = this.f - n3;
        long l2 = dj1.a(n4, n7);
        bj1 bj12 = new bj1(l2);
        bp1_0 bp1_02 = this.g.getLayoutDirection();
        l2 = ((Si1)function2.invoke((Object)bj12, (Object)((Object)bp1_02))).a;
        Ns2$a.e((Ns2$a)object, ns2, l2);
        return Unit.a;
    }
}

