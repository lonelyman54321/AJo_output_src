/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.utils.io;

import io.ktor.utils.io.ClosedByteChannelException;

public final class ClosedWriteChannelException
extends ClosedByteChannelException {
    public ClosedWriteChannelException() {
        super(null, null);
    }
}

