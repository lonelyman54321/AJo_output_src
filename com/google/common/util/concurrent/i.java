/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.AggregateFuture;

public final class i
implements Runnable {
    public final /* synthetic */ AggregateFuture a;
    public final /* synthetic */ ImmutableCollection b;

    public /* synthetic */ i(AggregateFuture aggregateFuture, ImmutableCollection immutableCollection) {
        this.a = aggregateFuture;
        this.b = immutableCollection;
    }

    public final void run() {
        AggregateFuture aggregateFuture = this.a;
        ImmutableCollection immutableCollection = this.b;
        AggregateFuture.a(aggregateFuture, immutableCollection);
    }
}

