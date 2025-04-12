/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason;
import com.google.common.util.concurrent.AggregateFutureState;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.h;
import com.google.common.util.concurrent.i;
import java.util.AbstractCollection;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class AggregateFuture
extends AggregateFutureState {
    private static final Logger logger = Logger.getLogger(AggregateFuture.class.getName());
    private final boolean allMustSucceed;
    private final boolean collectsValues;
    private ImmutableCollection futures;

    public AggregateFuture(ImmutableCollection immutableCollection, boolean bl2, boolean bl3) {
        int n3 = immutableCollection.size();
        super(n3);
        this.futures = immutableCollection = (ImmutableCollection)Preconditions.checkNotNull(immutableCollection);
        this.allMustSucceed = bl2;
        this.collectsValues = bl3;
    }

    public static /* synthetic */ void a(AggregateFuture aggregateFuture, ImmutableCollection immutableCollection) {
        aggregateFuture.lambda$init$1(immutableCollection);
    }

    private static boolean addCausalChain(Set set, Throwable throwable) {
        while (throwable != null) {
            boolean bl2 = set.add(throwable);
            if (!bl2) {
                return false;
            }
            throwable = throwable.getCause();
        }
        return true;
    }

    public static /* synthetic */ void b(AggregateFuture aggregateFuture, ListenableFuture listenableFuture, int n3) {
        aggregateFuture.lambda$init$0(listenableFuture, n3);
    }

    /*
     * WARNING - void declaration
     */
    private void collectValueFromNonCancelledFuture(int n3, Future object) {
        block5: {
            ExecutionException executionException2;
            block7: {
                void var3_6;
                object = Futures.getDone((Future)object);
                try {
                    this.collectOneValue(n3, object);
                    break block5;
                }
                catch (Error error) {
                }
                catch (RuntimeException runtimeException) {
                }
                catch (ExecutionException executionException2) {
                    break block7;
                }
                this.handleException((Throwable)var3_6);
                break block5;
            }
            Throwable throwable = executionException2.getCause();
            this.handleException(throwable);
        }
    }

    private void decrementCountAndMaybeComplete(ImmutableCollection immutableCollection) {
        int n3 = this.decrementRemainingAndGet();
        boolean bl2 = n3 >= 0;
        String string2 = "Less than 0 remaining futures";
        Preconditions.checkState(bl2, string2);
        if (n3 == 0) {
            this.processCompleted(immutableCollection);
        }
    }

    private void handleException(Throwable throwable) {
        Set set;
        Preconditions.checkNotNull(throwable);
        boolean bl2 = this.allMustSucceed;
        if (bl2 && !(bl2 = this.setException(throwable)) && (bl2 = AggregateFuture.addCausalChain(set = this.getOrInitSeenExceptions(), throwable))) {
            AggregateFuture.log(throwable);
            return;
        }
        bl2 = throwable instanceof Error;
        if (bl2) {
            AggregateFuture.log(throwable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$init$0(ListenableFuture listenableFuture, int n3) {
        Throwable throwable2;
        block4: {
            block3: {
                block2: {
                    try {
                        boolean bl2 = listenableFuture.isCancelled();
                        if (!bl2) break block2;
                        this.futures = null;
                        listenableFuture = null;
                        this.cancel(false);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.collectValueFromNonCancelledFuture(n3, listenableFuture);
            }
            this.decrementCountAndMaybeComplete(null);
            return;
        }
        this.decrementCountAndMaybeComplete(null);
        throw throwable2;
    }

    private /* synthetic */ void lambda$init$1(ImmutableCollection immutableCollection) {
        this.decrementCountAndMaybeComplete(immutableCollection);
    }

    private static void log(Throwable throwable) {
        boolean bl2 = throwable instanceof Error;
        String string2 = bl2 ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first";
        Logger logger = AggregateFuture.logger;
        Level level = Level.SEVERE;
        logger.log(level, string2, throwable);
    }

    private void processCompleted(ImmutableCollection object) {
        if (object != null) {
            boolean bl2;
            object = ((ImmutableCollection)object).iterator();
            int n3 = 0;
            while (bl2 = object.hasNext()) {
                Future future = (Future)object.next();
                boolean bl3 = future.isCancelled();
                if (!bl3) {
                    this.collectValueFromNonCancelledFuture(n3, future);
                }
                ++n3;
            }
        }
        this.clearSeenExceptions();
        this.handleAllCompleted();
        object = AggregateFuture$ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED;
        this.releaseResources((AggregateFuture$ReleaseResourcesReason)((Object)object));
    }

    public final void addInitialException(Set set) {
        Preconditions.checkNotNull(set);
        boolean bl2 = this.isCancelled();
        if (!bl2) {
            Throwable throwable = this.tryInternalFastPathGetFailure();
            Objects.requireNonNull(throwable);
            AggregateFuture.addCausalChain(set, throwable);
        }
    }

    public final void afterDone() {
        Future future;
        boolean bl2;
        super.afterDone();
        Object object = this.futures;
        AggregateFuture$ReleaseResourcesReason aggregateFuture$ReleaseResourcesReason = AggregateFuture$ReleaseResourcesReason.OUTPUT_FUTURE_DONE;
        this.releaseResources(aggregateFuture$ReleaseResourcesReason);
        boolean bl3 = this.isCancelled();
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            future = null;
        }
        if (bl3 &= bl2) {
            bl3 = this.wasInterrupted();
            object = ((ImmutableCollection)object).iterator();
            while (bl2 = object.hasNext()) {
                future = (Future)object.next();
                future.cancel(bl3);
            }
        }
    }

    public abstract void collectOneValue(int var1, Object var2);

    public abstract void handleAllCompleted();

    public final void init() {
        Objects.requireNonNull(this.futures);
        Object object = this.futures;
        boolean bl2 = ((AbstractCollection)object).isEmpty();
        if (bl2) {
            this.handleAllCompleted();
            return;
        }
        bl2 = this.allMustSucceed;
        if (bl2) {
            boolean bl3;
            object = this.futures.iterator();
            int n3 = 0;
            Executor executor = null;
            while (bl3 = object.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture)object.next();
                int n4 = n3 + 1;
                h h3 = new h(this, listenableFuture, n3);
                executor = MoreExecutors.directExecutor();
                listenableFuture.addListener(h3, executor);
                n3 = n4;
            }
        } else {
            boolean bl4;
            bl2 = this.collectsValues;
            if (bl2) {
                object = this.futures;
            } else {
                bl2 = false;
                object = null;
            }
            i i3 = new i(this, (ImmutableCollection)object);
            object = this.futures.iterator();
            while (bl4 = object.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture)object.next();
                Executor executor = MoreExecutors.directExecutor();
                listenableFuture.addListener(i3, executor);
            }
        }
    }

    public final String pendingToString() {
        ImmutableCollection immutableCollection = this.futures;
        if (immutableCollection != null) {
            StringBuilder stringBuilder = new StringBuilder("futures=");
            stringBuilder.append(immutableCollection);
            return stringBuilder.toString();
        }
        return super.pendingToString();
    }

    public void releaseResources(AggregateFuture$ReleaseResourcesReason aggregateFuture$ReleaseResourcesReason) {
        Preconditions.checkNotNull((Object)aggregateFuture$ReleaseResourcesReason);
        this.futures = null;
    }
}

