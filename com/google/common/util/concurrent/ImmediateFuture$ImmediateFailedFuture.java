/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture$TrustedFuture;

final class ImmediateFuture$ImmediateFailedFuture
extends AbstractFuture$TrustedFuture {
    public ImmediateFuture$ImmediateFailedFuture(Throwable throwable) {
        this.setException(throwable);
    }
}

