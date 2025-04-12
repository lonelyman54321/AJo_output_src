/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;

public final class DiagnosticCoroutineContextException
extends RuntimeException {
    public final transient CoroutineContext a;

    public DiagnosticCoroutineContextException(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{};
        this.setStackTrace(stackTraceElementArray);
        return this;
    }

    public final String getLocalizedMessage() {
        return String.valueOf(this.a);
    }
}

