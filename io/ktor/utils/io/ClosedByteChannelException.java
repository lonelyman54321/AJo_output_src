/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.utils.io;

import java.io.IOException;

public class ClosedByteChannelException
extends IOException {
    public ClosedByteChannelException() {
        this((Throwable)null);
    }

    public ClosedByteChannelException(Throwable throwable) {
        String string2 = throwable != null ? throwable.getMessage() : null;
        super(string2, throwable);
    }
}

