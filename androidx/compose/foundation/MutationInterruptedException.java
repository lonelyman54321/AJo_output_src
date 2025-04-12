/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import java.util.concurrent.CancellationException;

public final class MutationInterruptedException
extends CancellationException {
    public MutationInterruptedException() {
        super("Mutation interrupted");
    }

    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{};
        this.setStackTrace(stackTraceElementArray);
        return this;
    }
}

