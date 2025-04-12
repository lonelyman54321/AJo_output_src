/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class IV$b
extends Lambda
implements Function1 {
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ Function1 d;

    public IV$b(tr1_0 tr1_02, Function1 function1) {
        this.c = tr1_02;
        this.d = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Tl3)object;
        this.c.setValue(object);
        this.d.invoke(object);
        return Unit.a;
    }
}

