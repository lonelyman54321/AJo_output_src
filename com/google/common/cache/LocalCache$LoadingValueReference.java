/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Function;
import com.google.common.base.Stopwatch;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$ValueReference;
import com.google.common.cache.ReferenceEntry;
import com.google.common.cache.b;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.Uninterruptibles;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

class LocalCache$LoadingValueReference
implements LocalCache$ValueReference {
    final SettableFuture futureValue;
    volatile LocalCache$ValueReference oldValue;
    final Stopwatch stopwatch;

    public LocalCache$LoadingValueReference() {
        LocalCache$ValueReference localCache$ValueReference = LocalCache.unset();
        this(localCache$ValueReference);
    }

    public LocalCache$LoadingValueReference(LocalCache$ValueReference localCache$ValueReference) {
        Object object = SettableFuture.create();
        this.futureValue = object;
        this.stopwatch = object = Stopwatch.createUnstarted();
        this.oldValue = localCache$ValueReference;
    }

    public static /* synthetic */ Object a(LocalCache$LoadingValueReference localCache$LoadingValueReference, Object object) {
        return localCache$LoadingValueReference.lambda$loadFuture$0(object);
    }

    private ListenableFuture fullyFailedFuture(Throwable throwable) {
        return Futures.immediateFailedFuture(throwable);
    }

    private /* synthetic */ Object lambda$loadFuture$0(Object object) {
        this.set(object);
        return object;
    }

    public LocalCache$ValueReference copyFor(ReferenceQueue referenceQueue, Object object, ReferenceEntry referenceEntry) {
        return this;
    }

    public long elapsedNanos() {
        Stopwatch stopwatch = this.stopwatch;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return stopwatch.elapsed(timeUnit);
    }

    public Object get() {
        return this.oldValue.get();
    }

    public ReferenceEntry getEntry() {
        return null;
    }

    public LocalCache$ValueReference getOldValue() {
        return this.oldValue;
    }

    public int getWeight() {
        return this.oldValue.getWeight();
    }

    public boolean isActive() {
        return this.oldValue.isActive();
    }

    public boolean isLoading() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ListenableFuture loadFuture(Object object, CacheLoader object2) {
        Throwable throwable2;
        block4: {
            Object object3;
            try {
                object3 = this.stopwatch;
                ((Stopwatch)object3).start();
                object3 = this.oldValue;
                object3 = object3.get();
                if (object3 == null) {
                    boolean bl2 = this.set(object = ((CacheLoader)object2).load(object));
                    if (!bl2) return Futures.immediateFuture(object);
                    return this.futureValue;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            if ((object = ((CacheLoader)object2).reload(object, object3)) == null) {
                return Futures.immediateFuture(null);
            }
            object2 = new b(this);
            object3 = MoreExecutors.directExecutor();
            return Futures.transform((ListenableFuture)object, (Function)object2, (Executor)object3);
        }
        boolean bl3 = this.setException(throwable2);
        object2 = bl3 ? this.futureValue : this.fullyFailedFuture(throwable2);
        boolean bl4 = throwable2 instanceof InterruptedException;
        if (!bl4) return object2;
        Thread thread2 = Thread.currentThread();
        thread2.interrupt();
        return object2;
    }

    public void notifyNewValue(Object object) {
        if (object != null) {
            this.set(object);
        } else {
            this.oldValue = object = LocalCache.unset();
        }
    }

    public boolean set(Object object) {
        return this.futureValue.set(object);
    }

    public boolean setException(Throwable throwable) {
        return this.futureValue.setException(throwable);
    }

    public Object waitForValue() {
        return Uninterruptibles.getUninterruptibly(this.futureValue);
    }
}

