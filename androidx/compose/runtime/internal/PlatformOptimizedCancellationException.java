/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.runtime.internal;

import java.util.concurrent.CancellationException;

public abstract class PlatformOptimizedCancellationException
extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super((String)null);
    }

    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{};
        this.setStackTrace(stackTraceElementArray);
        return this;
    }
}

