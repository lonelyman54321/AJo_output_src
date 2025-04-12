/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Ni$b
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;

    public Ni$b(Ns2 ns2) {
        this.c = ns2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Ns2 ns2 = this.c;
        Ns2$a.f((Ns2$a)object, ns2, 0, 0);
        return Unit.a;
    }
}

