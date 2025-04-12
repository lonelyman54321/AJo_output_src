/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$1;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ClosingFuture$Combiner$1;
import com.google.common.util.concurrent.ClosingFuture$Combiner$2;
import com.google.common.util.concurrent.ClosingFuture$Combiner$AsyncCombiningCallable;
import com.google.common.util.concurrent.ClosingFuture$Combiner$CombiningCallable;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.Futures$FutureCombiner;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class ClosingFuture$Combiner {
    private final boolean allMustSucceed;
    private final ClosingFuture$CloseableList closeables;
    protected final ImmutableList inputs;

    private ClosingFuture$Combiner(boolean bl2, Iterable object) {
        boolean bl3;
        ClosingFuture$CloseableList closingFuture$CloseableList;
        this.closeables = closingFuture$CloseableList = new ClosingFuture$CloseableList(null);
        this.allMustSucceed = bl2;
        Object object2 = ImmutableList.copyOf((Iterable)object);
        this.inputs = object2;
        object2 = object.iterator();
        while (bl3 = object2.hasNext()) {
            object = (ClosingFuture)object2.next();
            closingFuture$CloseableList = this.closeables;
            ClosingFuture.access$1000((ClosingFuture)object, closingFuture$CloseableList);
        }
    }

    public /* synthetic */ ClosingFuture$Combiner(boolean bl2, Iterable iterable, ClosingFuture$1 closingFuture$1) {
        this(bl2, iterable);
    }

    public static /* synthetic */ FluentFuture a(ClosingFuture closingFuture) {
        return ClosingFuture$Combiner.lambda$inputFutures$0(closingFuture);
    }

    public static /* synthetic */ ClosingFuture$CloseableList access$1300(ClosingFuture$Combiner closingFuture$Combiner) {
        return closingFuture$Combiner.closeables;
    }

    private Futures$FutureCombiner futureCombiner() {
        boolean bl2 = this.allMustSucceed;
        Futures$FutureCombiner futureCombiner = bl2 ? Futures.whenAllSucceed(this.inputFutures()) : Futures.whenAllComplete(this.inputFutures());
        return futureCombiner;
    }

    private ImmutableList inputFutures() {
        FluentIterable fluentIterable = FluentIterable.from(this.inputs);
        gw_1 gw_12 = new Object();
        return fluentIterable.transform(gw_12).toList();
    }

    private static /* synthetic */ FluentFuture lambda$inputFutures$0(ClosingFuture closingFuture) {
        return ClosingFuture.access$000(closingFuture);
    }

    public ClosingFuture call(ClosingFuture$Combiner$CombiningCallable object, Executor object2) {
        Object object3 = new ClosingFuture$Combiner$1(this, (ClosingFuture$Combiner$CombiningCallable)object);
        object2 = this.futureCombiner().call((Callable)object3, (Executor)object2);
        object = new ClosingFuture((ListenableFuture)object2, null);
        object2 = ClosingFuture.access$200((ClosingFuture)object);
        object3 = this.closeables;
        Executor executor = MoreExecutors.directExecutor();
        ((ClosingFuture$CloseableList)object2).add((Closeable)object3, executor);
        return object;
    }

    public ClosingFuture callAsync(ClosingFuture$Combiner$AsyncCombiningCallable object, Executor object2) {
        Object object3 = new ClosingFuture$Combiner$2(this, (ClosingFuture$Combiner$AsyncCombiningCallable)object);
        object2 = this.futureCombiner().callAsync((AsyncCallable)object3, (Executor)object2);
        object = new ClosingFuture((ListenableFuture)object2, null);
        object2 = ClosingFuture.access$200((ClosingFuture)object);
        object3 = this.closeables;
        Executor executor = MoreExecutors.directExecutor();
        ((ClosingFuture$CloseableList)object2).add((Closeable)object3, executor);
        return object;
    }
}

