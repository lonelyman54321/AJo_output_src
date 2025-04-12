/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Z01$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Z01 c;

    public Z01$a(Z01 z01) {
        this.c = z01;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Kt0)object;
        iL iL2 = object.M0().a();
        Function2 function2 = this.c.d;
        if (function2 != null) {
            object = object.M0().b;
            function2.invoke(iL2, object);
        }
        return Unit.a;
    }
}

