/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.websocket;

import kotlin.jvm.internal.Intrinsics;

public final class ProtocolViolationException
extends Exception
implements d80_0 {
    public final String a;

    public ProtocolViolationException() {
        Intrinsics.checkNotNullParameter(null, "violation");
        this.a = null;
    }

    public final Throwable a() {
        ProtocolViolationException protocolViolationException = new ProtocolViolationException();
        Intrinsics.checkNotNullParameter(protocolViolationException, "<this>");
        Intrinsics.checkNotNullParameter(this, "cause");
        protocolViolationException.initCause(this);
        return protocolViolationException;
    }

    public final String getMessage() {
        StringBuilder stringBuilder = new StringBuilder("Received illegal frame: ");
        String string2 = this.a;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

