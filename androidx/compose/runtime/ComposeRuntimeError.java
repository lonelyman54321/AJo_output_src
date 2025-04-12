/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.runtime;

public final class ComposeRuntimeError
extends IllegalStateException {
    public final String a;

    public ComposeRuntimeError(String string2) {
        this.a = string2;
    }

    public final String getMessage() {
        return this.a;
    }
}

