/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class xA0$c
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Function1 f;

    public xA0$c(Ns2 ns2, long l2, long l3, Function1 function1) {
        this.c = ns2;
        this.d = l2;
        this.e = l3;
        this.f = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        long l2 = this.d;
        int n3 = 32;
        int n4 = (int)(l2 >> n3);
        long l3 = this.e;
        int n7 = (int)(l3 >> n3);
        n4 += n7;
        long l4 = 0xFFFFFFFFL;
        int n8 = (int)(l2 & l4);
        int n10 = (int)(l4 & l3);
        object.getClass();
        l2 = Ti1.a(n4, n8 += n10);
        Ns2 ns2 = this.c;
        Ns2$a.a((Ns2$a)object, ns2);
        long l7 = ns2.e;
        l2 = Si1.d(l2, l7);
        Function1 function1 = this.f;
        ns2.k0(l2, 0.0f, function1);
        return Unit.a;
    }
}

