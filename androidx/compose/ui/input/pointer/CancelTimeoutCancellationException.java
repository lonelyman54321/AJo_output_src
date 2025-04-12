/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;

public final class CancelTimeoutCancellationException
extends CancellationException {
    public static final CancelTimeoutCancellationException a;

    static {
        CancelTimeoutCancellationException cancelTimeoutCancellationException;
        a = cancelTimeoutCancellationException = new CancelTimeoutCancellationException();
    }

    private CancelTimeoutCancellationException() {
    }

    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArray = ug3_0.a;
        this.setStackTrace(stackTraceElementArray);
        return this;
    }
}

