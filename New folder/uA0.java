/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class uA0
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;

    public uA0(Function1 function1) {
        this.c = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (int)(((bj1)object).a & 0xFFFFFFFFL);
        int n3 = ((Number)this.c.invoke(object)).intValue();
        long l2 = Ti1.a(0, n3);
        object = new Si1(l2);
        return object;
    }
}

