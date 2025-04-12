/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class B83
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;

    public B83(Function1 function1, Function1 function12) {
        this.c = function1;
        this.d = function12;
        super(1);
    }

    public final Object invoke(Object object) {
        this.c.invoke(object);
        this.d.invoke(object);
        return Unit.a;
    }
}

