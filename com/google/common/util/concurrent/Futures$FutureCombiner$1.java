/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.Futures$FutureCombiner;
import java.util.concurrent.Callable;

class Futures$FutureCombiner$1
implements Callable {
    final /* synthetic */ Runnable val$combiner;

    public Futures$FutureCombiner$1(Futures$FutureCombiner futures$FutureCombiner, Runnable runnable2) {
        this.val$combiner = runnable2;
    }

    public Void call() {
        this.val$combiner.run();
        return null;
    }
}

