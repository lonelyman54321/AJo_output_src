/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.material;

import java.util.concurrent.CancellationException;

public final class AnchoredDragFinishedSignal
extends CancellationException {
    public AnchoredDragFinishedSignal() {
        super("Anchored drag finished");
    }

    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{};
        this.setStackTrace(stackTraceElementArray);
        return this;
    }
}

