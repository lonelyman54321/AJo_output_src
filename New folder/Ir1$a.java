/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Ir1$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Gr1 c;
    public final /* synthetic */ long d;

    public Ir1$a(Gr1 gr1, long l2) {
        this.c = gr1;
        this.d = l2;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((Si1)((Lj)object).d()).a;
        long l3 = this.d;
        l2 = Si1.c(l2, l3);
        object = this.c;
        ((Gr1)object).g(l2);
        ((Gr1)object).c.invoke();
        return Unit.a;
    }
}

