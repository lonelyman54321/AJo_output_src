/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.network.selector;

import java.util.concurrent.CancellationException;

public final class SelectorManagerSupport$ClosedSelectorCancellationException
extends CancellationException {
    public SelectorManagerSupport$ClosedSelectorCancellationException() {
        super("Closed selector");
    }
}

