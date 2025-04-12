/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;

public final class PointerInputResetException
extends CancellationException {
    public PointerInputResetException() {
        super("Pointer input was reset");
    }

    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArray = ug3_0.a;
        this.setStackTrace(stackTraceElementArray);
        return this;
    }
}

