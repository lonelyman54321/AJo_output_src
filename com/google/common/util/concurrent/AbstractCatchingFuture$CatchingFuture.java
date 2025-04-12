/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.util.concurrent.AbstractCatchingFuture;
import com.google.common.util.concurrent.ListenableFuture;

final class AbstractCatchingFuture$CatchingFuture
extends AbstractCatchingFuture {
    public AbstractCatchingFuture$CatchingFuture(ListenableFuture listenableFuture, Class clazz, Function function) {
        super(listenableFuture, clazz, function);
    }

    public Object doFallback(Function function, Throwable throwable) {
        return function.apply(throwable);
    }

    public void setResult(Object object) {
        this.set(object);
    }
}

