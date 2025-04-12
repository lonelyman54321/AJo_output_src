/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class tA0
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;

    public tA0(Function1 function1) {
        this.c = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (int)(((bj1)object).a >> 32);
        long l2 = Ti1.a(((Number)this.c.invoke(object)).intValue(), 0);
        object = new Si1(l2);
        return object;
    }
}

