/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AggregateFuture;
import com.google.common.util.concurrent.ListenableFuture;

public final class h
implements Runnable {
    public final /* synthetic */ AggregateFuture a;
    public final /* synthetic */ ListenableFuture b;
    public final /* synthetic */ int c;

    public /* synthetic */ h(AggregateFuture aggregateFuture, ListenableFuture listenableFuture, int n3) {
        this.a = aggregateFuture;
        this.b = listenableFuture;
        this.c = n3;
    }

    public final void run() {
        ListenableFuture listenableFuture = this.b;
        int n3 = this.c;
        AggregateFuture.b(this.a, listenableFuture, n3);
    }
}

