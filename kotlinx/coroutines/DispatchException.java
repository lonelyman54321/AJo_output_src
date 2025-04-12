/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.c;

public final class DispatchException
extends Exception {
    public final Throwable a;

    public DispatchException(Throwable throwable, c object, CoroutineContext coroutineContext) {
        StringBuilder stringBuilder = new StringBuilder("Coroutine dispatcher ");
        stringBuilder.append(object);
        stringBuilder.append(" threw an exception, context = ");
        stringBuilder.append(coroutineContext);
        object = stringBuilder.toString();
        super((String)object, throwable);
        this.a = throwable;
    }

    public final Throwable getCause() {
        return this.a;
    }
}

