/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui;

import java.util.concurrent.CancellationException;

public final class ModifierNodeDetachedCancellationException
extends CancellationException {
    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }

    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArray = VP1.a;
        this.setStackTrace(stackTraceElementArray);
        return this;
    }
}

