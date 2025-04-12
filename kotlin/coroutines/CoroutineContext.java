/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;

public interface CoroutineContext {
    public Object fold(Object var1, Function2 var2);

    public CoroutineContext$Element get(CoroutineContext$a var1);

    public CoroutineContext minusKey(CoroutineContext$a var1);

    public CoroutineContext plus(CoroutineContext var1);
}

