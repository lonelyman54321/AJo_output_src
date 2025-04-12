/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.client.network.sockets;

import java.net.ConnectException;
import kotlin.jvm.internal.Intrinsics;

public final class ConnectTimeoutException
extends ConnectException {
    public final Throwable a;

    public ConnectTimeoutException(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2);
        this.a = throwable;
    }

    public final Throwable getCause() {
        return this.a;
    }
}

