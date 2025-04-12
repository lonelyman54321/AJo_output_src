/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class f
implements CoroutineContext,
Serializable {
    public static final f a;
    private static final long serialVersionUID;

    static {
        f f5;
        a = f5 = new Object();
    }

    private final Object readResolve() {
        return a;
    }

    public final Object fold(Object object, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "operation");
        return object;
    }

    public final CoroutineContext$Element get(CoroutineContext$a coroutineContext$a) {
        Intrinsics.checkNotNullParameter(coroutineContext$a, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final CoroutineContext minusKey(CoroutineContext$a coroutineContext$a) {
        Intrinsics.checkNotNullParameter(coroutineContext$a, "key");
        return this;
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "context");
        return coroutineContext;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}

