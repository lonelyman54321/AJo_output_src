/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Jy$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ jy_1 d;

    public Jy$a(Ns2 ns2, jy_1 jy_12) {
        this.c = ns2;
        this.d = jy_12;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Ns2$a)object;
        Function1 function1 = this.d.n;
        Ns2 ns2 = this.c;
        Ns2$a.j((Ns2$a)object2, ns2, 0, 0, function1, 4);
        return Unit.a;
    }
}

