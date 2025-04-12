/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public abstract class a
implements CoroutineContext$Element {
    private final CoroutineContext$a key;

    public a(CoroutineContext$a coroutineContext$a) {
        Intrinsics.checkNotNullParameter(coroutineContext$a, "key");
        this.key = coroutineContext$a;
    }

    public Object fold(Object object, Function2 function2) {
        return CoroutineContext$Element$a.a(this, object, function2);
    }

    public CoroutineContext$Element get(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.b(this, coroutineContext$a);
    }

    public CoroutineContext$a getKey() {
        return this.key;
    }

    public CoroutineContext minusKey(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.c(this, coroutineContext$a);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext$Element$a.d(coroutineContext, this);
    }
}

