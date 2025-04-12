/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from sk
 */
public final class sk_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ j70_0 d;

    public sk_0(Ns2 ns2, j70_0 j70_02) {
        this.c = ns2;
        this.d = j70_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        float f5 = this.d.c.c();
        object.getClass();
        long l2 = Ti1.a(0, 0);
        Ns2 ns2 = this.c;
        Ns2$a.a((Ns2$a)object, ns2);
        long l3 = ns2.e;
        l2 = Si1.d(l2, l3);
        ns2.k0(l2, f5, null);
        return Unit.a;
    }
}

