/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.client.plugins.sse;

public final class SSEClientException
extends IllegalStateException {
    public final Throwable a = null;
    public final String b;

    public SSEClientException() {
        this.b = null;
    }

    public final Throwable getCause() {
        return this.a;
    }

    public final String getMessage() {
        return this.b;
    }
}

