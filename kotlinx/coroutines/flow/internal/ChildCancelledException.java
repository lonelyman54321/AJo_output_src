/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

public final class ChildCancelledException
extends CancellationException {
    public ChildCancelledException() {
        super("Child of the scoped flow was cancelled");
    }

    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{};
        this.setStackTrace(stackTraceElementArray);
        return this;
    }
}

