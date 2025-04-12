/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.websocket;

import kotlin.jvm.internal.Intrinsics;

public final class FrameTooBigException
extends Exception
implements d80_0 {
    public final long a;

    public FrameTooBigException() {
        this.a = 0L;
    }

    public final Throwable a() {
        FrameTooBigException frameTooBigException = new FrameTooBigException();
        Intrinsics.checkNotNullParameter(frameTooBigException, "<this>");
        Intrinsics.checkNotNullParameter(this, "cause");
        frameTooBigException.initCause(this);
        return frameTooBigException;
    }

    public final String getMessage() {
        StringBuilder stringBuilder = new StringBuilder("Frame is too big: ");
        long l2 = this.a;
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }
}

