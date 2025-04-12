/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class gJ2$b
extends Lambda
implements Function1 {
    public final /* synthetic */ Function2 c;

    public gJ2$b(Function2 function2) {
        this.c = function2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (iL)object;
        this.c.invoke(object, null);
        return Unit.a;
    }
}

