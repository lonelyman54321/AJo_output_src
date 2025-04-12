/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class X53$a$b
extends X53$a {
    public final Function2 a;
    public final w00_0 b;
    public final gb3_0 c;
    public final CoroutineContext d;

    public X53$a$b(Function2 function2, x00_0 x00_02, gb3_0 gb3_02, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(function2, "transform");
        Intrinsics.checkNotNullParameter(x00_02, "ack");
        Intrinsics.checkNotNullParameter(coroutineContext, "callerContext");
        this.a = function2;
        this.b = x00_02;
        this.c = gb3_02;
        this.d = coroutineContext;
    }
}

