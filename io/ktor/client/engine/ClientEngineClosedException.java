/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.client.engine;

public final class ClientEngineClosedException
extends IllegalStateException {
    public final Throwable a = null;

    public ClientEngineClosedException() {
        this(0);
    }

    public ClientEngineClosedException(int n3) {
        super("Client already closed");
    }

    public final Throwable getCause() {
        return this.a;
    }
}

