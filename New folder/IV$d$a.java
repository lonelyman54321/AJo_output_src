/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class IV$d$a
extends Lambda
implements Function1 {
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ Function1 d;

    public IV$d$a(tr1_0 tr1_02, Function1 function1) {
        this.c = tr1_02;
        this.d = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((e72)object).a;
        object = (Tl3)this.c.getValue();
        if (object != null) {
            int n3 = ((Tl3)object).b.e(l2);
            object = n3;
            Function1 function1 = this.d;
            function1.invoke(object);
        }
        return Unit.a;
    }
}

