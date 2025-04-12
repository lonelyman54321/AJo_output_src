/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public abstract class b
implements CoroutineContext$a {
    public final Function1 a;
    public final CoroutineContext$a b;

    public b(CoroutineContext$a coroutineContext$a, Function1 function1) {
        Intrinsics.checkNotNullParameter(coroutineContext$a, "baseKey");
        String string2 = "safeCast";
        Intrinsics.checkNotNullParameter(function1, string2);
        this.a = function1;
        boolean bl2 = coroutineContext$a instanceof b;
        if (bl2) {
            coroutineContext$a = ((b)coroutineContext$a).b;
        }
        this.b = coroutineContext$a;
    }
}

