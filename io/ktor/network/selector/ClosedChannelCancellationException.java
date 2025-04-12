/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.network.selector;

import java.util.concurrent.CancellationException;

public final class ClosedChannelCancellationException
extends CancellationException {
    public ClosedChannelCancellationException() {
        super("Closed channel.");
    }
}

