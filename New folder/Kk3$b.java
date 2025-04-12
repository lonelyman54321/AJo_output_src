/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Kk3$b
extends Lambda
implements Function1 {
    public final /* synthetic */ ib3_0 c;

    public Kk3$b(tr1_0 tr1_02) {
        this.c = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((e72)object).a;
        object = (Function1)this.c.getValue();
        e72 e722 = new e72(l2);
        object.invoke(e722);
        return Unit.a;
    }
}

