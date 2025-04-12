/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;

public final class PointerEventTimeoutCancellationException
extends CancellationException {
    public PointerEventTimeoutCancellationException(long l2) {
        String string2 = Ov2.a(l2, "Timed out waiting for ", " ms");
        super(string2);
    }

    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArray = ug3_0.a;
        this.setStackTrace(stackTraceElementArray);
        return this;
    }
}

