/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Ju$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ dl1_1 d;
    public final /* synthetic */ Ns2 e;

    public Ju$a(dl1_1 dl1_12, Ns2 ns2, Ns2 ns22) {
        this.c = ns2;
        this.d = dl1_12;
        this.e = ns22;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Ns2 ns2 = this.c;
        int n3 = ns2.a;
        dl1_1 dl1_12 = this.d;
        float f5 = Iu.a;
        int n4 = dl1_12.e0(f5) * 2;
        float f6 = n3 > n4 ? Iu.e : Iu.f;
        Ns2 ns22 = this.e;
        Ns2$a.f((Ns2$a)object, ns22, 0, 0);
        n4 = ns22.a;
        n3 = dl1_12.e0(f6) + n4;
        n4 = -ns2.b / 2;
        Ns2$a.f((Ns2$a)object, ns2, n3, n4);
        return Unit.a;
    }
}

