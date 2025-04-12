/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$1;
import com.google.common.util.concurrent.ClosingFuture$AsyncClosingFunction;
import com.google.common.util.concurrent.ClosingFuture$ClosingFunction;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.IdentityHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

final class ClosingFuture$CloseableList
extends IdentityHashMap
implements Closeable {
    private volatile boolean closed;
    private final ClosingFuture$DeferredCloser closer;
    private volatile CountDownLatch whenClosed;

    private ClosingFuture$CloseableList() {
        ClosingFuture$DeferredCloser closingFuture$DeferredCloser;
        this.closer = closingFuture$DeferredCloser = new ClosingFuture$DeferredCloser(this);
    }

    public /* synthetic */ ClosingFuture$CloseableList(ClosingFuture.1 var1_1) {
        this();
    }

    public static /* synthetic */ ClosingFuture$DeferredCloser access$300(ClosingFuture$CloseableList closingFuture$CloseableList) {
        return closingFuture$CloseableList.closer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void add(Closeable closeable, Executor executor) {
        Preconditions.checkNotNull(executor);
        if (closeable == null) {
            return;
        }
        // MONITORENTER : this
        boolean bl2 = this.closed;
        if (!bl2) {
            ((AbstractMap)this).put(closeable, executor);
            // MONITOREXIT : this
            return;
        }
        ClosingFuture.access$3200(closeable, executor);
    }

    public FluentFuture applyAsyncClosingFunction(ClosingFuture$AsyncClosingFunction object, Object object2) {
        ClosingFuture$CloseableList closingFuture$CloseableList = new ClosingFuture$CloseableList();
        try {
            ClosingFuture$DeferredCloser closingFuture$DeferredCloser = closingFuture$CloseableList.closer;
            object = object.apply(closingFuture$DeferredCloser, object2);
            ClosingFuture.access$1000((ClosingFuture)object, closingFuture$CloseableList);
            object = ClosingFuture.access$000((ClosingFuture)object);
            return object;
        }
        finally {
            object2 = MoreExecutors.directExecutor();
            this.add(closingFuture$CloseableList, (Executor)object2);
        }
    }

    public ListenableFuture applyClosingFunction(ClosingFuture$ClosingFunction object, Object object2) {
        ClosingFuture$CloseableList closingFuture$CloseableList = new ClosingFuture$CloseableList();
        try {
            ClosingFuture$DeferredCloser closingFuture$DeferredCloser = closingFuture$CloseableList.closer;
            object = object.apply(closingFuture$DeferredCloser, object2);
            object = Futures.immediateFuture(object);
            return object;
        }
        finally {
            object2 = MoreExecutors.directExecutor();
            this.add(closingFuture$CloseableList, (Executor)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void close() {
        boolean bl3 = this.closed;
        if (bl3) {
            return;
        }
        // MONITORENTER : this
        bl3 = this.closed;
        if (bl3) {
            // MONITOREXIT : this
            return;
        }
        this.closed = bl3 = true;
        // MONITOREXIT : this
        Object object = ((AbstractMap)this).entrySet().iterator();
        while (true) {
            boolean bl2;
            if (!(bl2 = object.hasNext())) {
                ((AbstractMap)this).clear();
                object = this.whenClosed;
                if (object == null) return;
                object = this.whenClosed;
                ((CountDownLatch)object).countDown();
                return;
            }
            Object object2 = object.next();
            Closeable closeable = (Closeable)object2.getKey();
            object2 = (Executor)object2.getValue();
            ClosingFuture.access$3200(closeable, (Executor)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CountDownLatch whenClosedCountDown() {
        boolean bl2 = this.closed;
        boolean bl3 = false;
        if (bl2) {
            return new CountDownLatch(0);
        }
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    bl2 = this.closed;
                    if (bl2) {
                        return new CountDownLatch(0);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                CountDownLatch countDownLatch = this.whenClosed;
                int n3 = 1;
                if (countDownLatch == null) {
                    bl3 = true;
                }
                Preconditions.checkState(bl3);
                this.whenClosed = countDownLatch = new CountDownLatch(n3);
                return countDownLatch;
            }
            throw throwable2;
        }
    }
}

