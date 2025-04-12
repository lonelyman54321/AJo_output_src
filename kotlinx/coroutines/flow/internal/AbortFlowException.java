/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

public final class AbortFlowException
extends CancellationException {
    public final transient Object a;

    public AbortFlowException(fs0_2 fs0_22) {
        super("Flow was aborted, no more elements needed");
        this.a = fs0_22;
    }

    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{};
        this.setStackTrace(stackTraceElementArray);
        return this;
    }
}

