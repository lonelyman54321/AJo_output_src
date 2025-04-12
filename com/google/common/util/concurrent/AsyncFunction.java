/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ListenableFuture;

public interface AsyncFunction {
    public ListenableFuture apply(Object var1);
}

