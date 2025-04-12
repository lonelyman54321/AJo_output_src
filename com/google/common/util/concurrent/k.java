/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.Futures$InCompletionOrderState;

public final class k
implements Runnable {
    public final /* synthetic */ Futures$InCompletionOrderState a;
    public final /* synthetic */ ImmutableList b;
    public final /* synthetic */ int c;

    public /* synthetic */ k(Futures$InCompletionOrderState futures$InCompletionOrderState, ImmutableList immutableList, int n3) {
        this.a = futures$InCompletionOrderState;
        this.b = immutableList;
        this.c = n3;
    }

    public final void run() {
        ImmutableList immutableList = this.b;
        int n3 = this.c;
        Futures.a(this.a, immutableList, n3);
    }
}

