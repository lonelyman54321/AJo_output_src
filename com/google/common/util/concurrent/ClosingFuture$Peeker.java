/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$1;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ClosingFuture$Combiner$AsyncCombiningCallable;
import com.google.common.util.concurrent.ClosingFuture$Combiner$CombiningCallable;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

public final class ClosingFuture$Peeker {
    private volatile boolean beingCalled;
    private final ImmutableList futures;

    private ClosingFuture$Peeker(ImmutableList immutableList) {
        this.futures = immutableList = (ImmutableList)Preconditions.checkNotNull(immutableList);
    }

    public /* synthetic */ ClosingFuture$Peeker(ImmutableList immutableList, ClosingFuture$1 closingFuture$1) {
        this(immutableList);
    }

    public static /* synthetic */ Object access$1500(ClosingFuture$Peeker closingFuture$Peeker, ClosingFuture$Combiner$CombiningCallable closingFuture$Combiner$CombiningCallable, ClosingFuture$CloseableList closingFuture$CloseableList) {
        return closingFuture$Peeker.call(closingFuture$Combiner$CombiningCallable, closingFuture$CloseableList);
    }

    public static /* synthetic */ FluentFuture access$1700(ClosingFuture$Peeker closingFuture$Peeker, ClosingFuture$Combiner$AsyncCombiningCallable closingFuture$Combiner$AsyncCombiningCallable, ClosingFuture$CloseableList closingFuture$CloseableList) {
        return closingFuture$Peeker.callAsync(closingFuture$Combiner$AsyncCombiningCallable, closingFuture$CloseableList);
    }

    private Object call(ClosingFuture$Combiner$CombiningCallable object, ClosingFuture$CloseableList closingFuture$CloseableList) {
        Object object2;
        boolean bl2;
        this.beingCalled = bl2 = true;
        ClosingFuture$CloseableList closingFuture$CloseableList2 = new ClosingFuture$CloseableList(null);
        try {
            object2 = ClosingFuture$CloseableList.access$300(closingFuture$CloseableList2);
            object = object.call((ClosingFuture$DeferredCloser)object2, this);
            return object;
        }
        finally {
            object2 = MoreExecutors.directExecutor();
            closingFuture$CloseableList.add(closingFuture$CloseableList2, (Executor)object2);
            this.beingCalled = false;
        }
    }

    private FluentFuture callAsync(ClosingFuture$Combiner$AsyncCombiningCallable object, ClosingFuture$CloseableList closingFuture$CloseableList) {
        Object object2;
        boolean bl2;
        this.beingCalled = bl2 = true;
        ClosingFuture$CloseableList closingFuture$CloseableList2 = new ClosingFuture$CloseableList(null);
        try {
            object2 = ClosingFuture$CloseableList.access$300(closingFuture$CloseableList2);
            object = object.call((ClosingFuture$DeferredCloser)object2, this);
            ClosingFuture.access$1000((ClosingFuture)object, closingFuture$CloseableList);
            object = ClosingFuture.access$000((ClosingFuture)object);
            return object;
        }
        finally {
            object2 = MoreExecutors.directExecutor();
            closingFuture$CloseableList.add(closingFuture$CloseableList2, (Executor)object2);
            this.beingCalled = false;
        }
    }

    public final Object getDone(ClosingFuture closingFuture) {
        Preconditions.checkState(this.beingCalled);
        Preconditions.checkArgument(this.futures.contains(closingFuture));
        return Futures.getDone(ClosingFuture.access$000(closingFuture));
    }
}

