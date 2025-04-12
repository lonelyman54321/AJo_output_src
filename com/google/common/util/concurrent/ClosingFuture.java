/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ClosingFuture$1;
import com.google.common.util.concurrent.ClosingFuture$10;
import com.google.common.util.concurrent.ClosingFuture$11;
import com.google.common.util.concurrent.ClosingFuture$2;
import com.google.common.util.concurrent.ClosingFuture$3;
import com.google.common.util.concurrent.ClosingFuture$4;
import com.google.common.util.concurrent.ClosingFuture$5;
import com.google.common.util.concurrent.ClosingFuture$6;
import com.google.common.util.concurrent.ClosingFuture$7;
import com.google.common.util.concurrent.ClosingFuture$8;
import com.google.common.util.concurrent.ClosingFuture$9;
import com.google.common.util.concurrent.ClosingFuture$AsyncClosingCallable;
import com.google.common.util.concurrent.ClosingFuture$AsyncClosingFunction;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ClosingFuture$ClosingCallable;
import com.google.common.util.concurrent.ClosingFuture$ClosingFunction;
import com.google.common.util.concurrent.ClosingFuture$Combiner;
import com.google.common.util.concurrent.ClosingFuture$Combiner2;
import com.google.common.util.concurrent.ClosingFuture$Combiner3;
import com.google.common.util.concurrent.ClosingFuture$Combiner4;
import com.google.common.util.concurrent.ClosingFuture$Combiner5;
import com.google.common.util.concurrent.ClosingFuture$State;
import com.google.common.util.concurrent.ClosingFuture$ValueAndCloser;
import com.google.common.util.concurrent.ClosingFuture$ValueAndCloserConsumer;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ClosingFuture {
    private static final Logger logger = Logger.getLogger(ClosingFuture.class.getName());
    private final ClosingFuture$CloseableList closeables;
    private final FluentFuture future;
    private final AtomicReference state;

    private ClosingFuture(ClosingFuture$AsyncClosingCallable object, Executor executor) {
        ClosingFuture$State closingFuture$State = ClosingFuture$State.OPEN;
        Object object2 = new AtomicReference(closingFuture$State);
        this.state = object2;
        super((ClosingFuture$1)null);
        this.closeables = object2;
        Preconditions.checkNotNull(object);
        object2 = new ClosingFuture$3(this, (ClosingFuture$AsyncClosingCallable)object);
        object = TrustedListenableFutureTask.create((AsyncCallable)object2);
        executor.execute((Runnable)object);
        this.future = object;
    }

    private ClosingFuture(ClosingFuture$ClosingCallable object, Executor executor) {
        ClosingFuture$State closingFuture$State = ClosingFuture$State.OPEN;
        Object object2 = new AtomicReference(closingFuture$State);
        this.state = object2;
        super((ClosingFuture$1)null);
        this.closeables = object2;
        Preconditions.checkNotNull(object);
        object2 = new ClosingFuture$2(this, (ClosingFuture$ClosingCallable)object);
        object = TrustedListenableFutureTask.create((Callable)object2);
        executor.execute((Runnable)object);
        this.future = object;
    }

    private ClosingFuture(ListenableFuture listenableFuture) {
        Serializable serializable;
        ClosingFuture$State closingFuture$State = ClosingFuture$State.OPEN;
        this.state = serializable = new Serializable(closingFuture$State);
        super((ClosingFuture$1)null);
        this.closeables = serializable;
        listenableFuture = FluentFuture.from(listenableFuture);
        this.future = listenableFuture;
    }

    public /* synthetic */ ClosingFuture(ListenableFuture listenableFuture, ClosingFuture$1 closingFuture$1) {
        this(listenableFuture);
    }

    public static /* synthetic */ void a(Closeable closeable) {
        ClosingFuture.lambda$closeQuietly$0(closeable);
    }

    public static /* synthetic */ FluentFuture access$000(ClosingFuture closingFuture) {
        return closingFuture.future;
    }

    public static /* synthetic */ void access$100(ClosingFuture closingFuture) {
        closingFuture.close();
    }

    public static /* synthetic */ void access$1000(ClosingFuture closingFuture, ClosingFuture$CloseableList closingFuture$CloseableList) {
        closingFuture.becomeSubsumedInto(closingFuture$CloseableList);
    }

    public static /* synthetic */ void access$1100(ClosingFuture closingFuture, ClosingFuture$State closingFuture$State, ClosingFuture$State closingFuture$State2) {
        closingFuture.checkAndUpdateState(closingFuture$State, closingFuture$State2);
    }

    public static /* synthetic */ void access$1200(ClosingFuture$ValueAndCloserConsumer closingFuture$ValueAndCloserConsumer, ClosingFuture closingFuture) {
        ClosingFuture.provideValueAndCloser(closingFuture$ValueAndCloserConsumer, closingFuture);
    }

    public static /* synthetic */ ClosingFuture$CloseableList access$200(ClosingFuture closingFuture) {
        return closingFuture.closeables;
    }

    public static /* synthetic */ void access$3200(Closeable closeable, Executor executor) {
        ClosingFuture.closeQuietly(closeable, executor);
    }

    private void becomeSubsumedInto(ClosingFuture$CloseableList closingFuture$CloseableList) {
        Object object = ClosingFuture$State.OPEN;
        Object object2 = ClosingFuture$State.SUBSUMED;
        this.checkAndUpdateState((ClosingFuture$State)((Object)object), (ClosingFuture$State)((Object)object2));
        object = this.closeables;
        object2 = MoreExecutors.directExecutor();
        closingFuture$CloseableList.add((Closeable)object, (Executor)object2);
    }

    private ClosingFuture catchingAsyncMoreGeneric(Class object, ClosingFuture$AsyncClosingFunction closingFuture$AsyncClosingFunction, Executor executor) {
        Preconditions.checkNotNull(closingFuture$AsyncClosingFunction);
        ClosingFuture$8 closingFuture$8 = new ClosingFuture$8(this, closingFuture$AsyncClosingFunction);
        object = this.future.catchingAsync((Class)object, closingFuture$8, executor);
        return this.derive((FluentFuture)object);
    }

    private ClosingFuture catchingMoreGeneric(Class object, ClosingFuture$ClosingFunction closingFuture$ClosingFunction, Executor executor) {
        Preconditions.checkNotNull(closingFuture$ClosingFunction);
        ClosingFuture$7 closingFuture$7 = new ClosingFuture$7(this, closingFuture$ClosingFunction);
        object = this.future.catchingAsync((Class)object, closingFuture$7, executor);
        return this.derive((FluentFuture)object);
    }

    private void checkAndUpdateState(ClosingFuture$State closingFuture$State, ClosingFuture$State closingFuture$State2) {
        Preconditions.checkState(this.compareAndUpdateState(closingFuture$State, closingFuture$State2), "Expected state to be %s, but it was %s", (Object)closingFuture$State, (Object)closingFuture$State2);
    }

    private void close() {
        Logger logger = ClosingFuture.logger;
        Level level = Level.FINER;
        logger.log(level, "closing {0}", this);
        this.closeables.close();
    }

    private static void closeQuietly(Closeable closeable, Executor object) {
        if (closeable == null) {
            return;
        }
        fw_0 fw_02 = new fw_0(closeable, 0);
        try {
            object.execute(fw_02);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            Logger logger = ClosingFuture.logger;
            Level level = Level.WARNING;
            boolean bl2 = logger.isLoggable(level);
            if (bl2) {
                String string2 = "while submitting close to %s; will close inline";
                int n3 = 1;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                object = String.format(string2, objectArray);
                logger.log(level, (String)object, rejectedExecutionException);
            }
            object = MoreExecutors.directExecutor();
            ClosingFuture.closeQuietly(closeable, (Executor)object);
        }
    }

    private boolean compareAndUpdateState(ClosingFuture$State closingFuture$State, ClosingFuture$State closingFuture$State2) {
        boolean bl2;
        block1: {
            Object v4;
            AtomicReference atomicReference = this.state;
            do {
                boolean bl3;
                if (!(bl3 = atomicReference.compareAndSet(closingFuture$State, closingFuture$State2))) continue;
                bl2 = true;
                break block1;
            } while ((v4 = atomicReference.get()) == closingFuture$State);
            bl2 = false;
            closingFuture$State = null;
        }
        return bl2;
    }

    private ClosingFuture derive(FluentFuture object) {
        ClosingFuture closingFuture = new ClosingFuture((ListenableFuture)object);
        object = closingFuture.closeables;
        this.becomeSubsumedInto((ClosingFuture$CloseableList)object);
        return closingFuture;
    }

    public static ClosingFuture eventuallyClosing(ListenableFuture listenableFuture, Executor executor) {
        Preconditions.checkNotNull(executor);
        Object object = Futures.nonCancellationPropagating(listenableFuture);
        ClosingFuture closingFuture = new ClosingFuture((ListenableFuture)object);
        object = new ClosingFuture$1(closingFuture, executor);
        executor = MoreExecutors.directExecutor();
        Futures.addCallback(listenableFuture, (FutureCallback)object, executor);
        return closingFuture;
    }

    public static ClosingFuture from(ListenableFuture listenableFuture) {
        ClosingFuture closingFuture = new ClosingFuture(listenableFuture);
        return closingFuture;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void lambda$closeQuietly$0(Closeable closeable) {
        block3: {
            void var0_3;
            try {
                closeable.close();
                break block3;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            Logger logger = ClosingFuture.logger;
            Level level = Level.WARNING;
            String string2 = "thrown by close()";
            logger.log(level, string2, (Throwable)var0_3);
        }
    }

    private static void provideValueAndCloser(ClosingFuture$ValueAndCloserConsumer closingFuture$ValueAndCloserConsumer, ClosingFuture closingFuture) {
        ClosingFuture$ValueAndCloser closingFuture$ValueAndCloser = new ClosingFuture$ValueAndCloser(closingFuture);
        closingFuture$ValueAndCloserConsumer.accept(closingFuture$ValueAndCloser);
    }

    public static ClosingFuture submit(ClosingFuture$ClosingCallable closingFuture$ClosingCallable, Executor executor) {
        ClosingFuture closingFuture = new ClosingFuture(closingFuture$ClosingCallable, executor);
        return closingFuture;
    }

    public static ClosingFuture submitAsync(ClosingFuture$AsyncClosingCallable closingFuture$AsyncClosingCallable, Executor executor) {
        ClosingFuture closingFuture = new ClosingFuture(closingFuture$AsyncClosingCallable, executor);
        return closingFuture;
    }

    public static ClosingFuture$Combiner whenAllComplete(ClosingFuture closingFuture, ClosingFuture ... closingFutureArray) {
        return ClosingFuture.whenAllComplete(Lists.asList(closingFuture, closingFutureArray));
    }

    public static ClosingFuture$Combiner whenAllComplete(Iterable iterable) {
        ClosingFuture$Combiner closingFuture$Combiner = new ClosingFuture$Combiner(false, iterable, null);
        return closingFuture$Combiner;
    }

    public static ClosingFuture$Combiner2 whenAllSucceed(ClosingFuture closingFuture, ClosingFuture closingFuture2) {
        ClosingFuture$Combiner2 closingFuture$Combiner2 = new ClosingFuture$Combiner2(closingFuture, closingFuture2, null);
        return closingFuture$Combiner2;
    }

    public static ClosingFuture$Combiner3 whenAllSucceed(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3) {
        ClosingFuture$Combiner3 closingFuture$Combiner3 = new ClosingFuture$Combiner3(closingFuture, closingFuture2, closingFuture3, null);
        return closingFuture$Combiner3;
    }

    public static ClosingFuture$Combiner4 whenAllSucceed(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4) {
        ClosingFuture$Combiner4 closingFuture$Combiner4 = new ClosingFuture$Combiner4(closingFuture, closingFuture2, closingFuture3, closingFuture4, null);
        return closingFuture$Combiner4;
    }

    public static ClosingFuture$Combiner5 whenAllSucceed(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture closingFuture5) {
        ClosingFuture$Combiner5 closingFuture$Combiner5 = new ClosingFuture$Combiner5(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5, null);
        return closingFuture$Combiner5;
    }

    public static ClosingFuture$Combiner whenAllSucceed(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture closingFuture5, ClosingFuture closingFuture6, ClosingFuture ... closingFutureArray) {
        Object[] objectArray = new ClosingFuture[]{closingFuture2, closingFuture3, closingFuture4, closingFuture5, closingFuture6};
        return ClosingFuture.whenAllSucceed(FluentIterable.of(closingFuture, objectArray).append(closingFutureArray));
    }

    public static ClosingFuture$Combiner whenAllSucceed(Iterable iterable) {
        ClosingFuture$Combiner closingFuture$Combiner = new ClosingFuture$Combiner(true, iterable, null);
        return closingFuture$Combiner;
    }

    public static ClosingFuture$AsyncClosingFunction withoutCloser(AsyncFunction asyncFunction) {
        Preconditions.checkNotNull(asyncFunction);
        ClosingFuture$6 closingFuture$6 = new ClosingFuture$6(asyncFunction);
        return closingFuture$6;
    }

    public boolean cancel(boolean bl2) {
        Object object = logger;
        Level level = Level.FINER;
        String string2 = "cancelling {0}";
        ((Logger)object).log(level, string2, this);
        object = this.future;
        bl2 = ((AbstractFuture)object).cancel(bl2);
        if (bl2) {
            this.close();
        }
        return bl2;
    }

    public ClosingFuture catching(Class clazz, ClosingFuture$ClosingFunction closingFuture$ClosingFunction, Executor executor) {
        return this.catchingMoreGeneric(clazz, closingFuture$ClosingFunction, executor);
    }

    public ClosingFuture catchingAsync(Class clazz, ClosingFuture$AsyncClosingFunction closingFuture$AsyncClosingFunction, Executor executor) {
        return this.catchingAsyncMoreGeneric(clazz, closingFuture$AsyncClosingFunction, executor);
    }

    public void finalize() {
        Object object;
        Object object2 = (ClosingFuture$State)((Object)this.state.get());
        boolean bl2 = ((Object)object2).equals(object = ClosingFuture$State.OPEN);
        if (bl2) {
            object2 = logger;
            object = Level.SEVERE;
            String string2 = "Uh oh! An open ClosingFuture has leaked and will close: {0}";
            ((Logger)object2).log((Level)object, string2, this);
            this.finishToFuture();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public FluentFuture finishToFuture() {
        ClosingFuture$State closingFuture$State = ClosingFuture$State.OPEN;
        ClosingFuture$State closingFuture$State2 = ClosingFuture$State.WILL_CLOSE;
        boolean bl2 = this.compareAndUpdateState(closingFuture$State, closingFuture$State2);
        if (bl2) {
            Logger logger = ClosingFuture.logger;
            Level level = Level.FINER;
            logger.log(level, "will close {0}", this);
            FluentFuture fluentFuture = this.future;
            ClosingFuture$9 closingFuture$9 = new ClosingFuture$9(this);
            Executor executor = MoreExecutors.directExecutor();
            fluentFuture.addListener(closingFuture$9, executor);
            return this.future;
        }
        int[] nArray = ClosingFuture$11.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State;
        ClosingFuture$State closingFuture$State3 = (ClosingFuture$State)((Object)this.state.get());
        int n3 = closingFuture$State3.ordinal();
        int n4 = nArray[n3];
        switch (n4) {
            default: {
                return this.future;
            }
            case 6: {
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            case 3: 
            case 4: 
            case 5: {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot call finishToFuture() twice");
                throw illegalStateException;
            }
            case 2: {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                throw illegalStateException;
            }
            case 1: 
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot call finishToFuture() after deriving another step");
        throw illegalStateException;
    }

    public void finishToValueAndCloser(ClosingFuture$ValueAndCloserConsumer object, Executor object2) {
        Preconditions.checkNotNull(object);
        Object object3 = ClosingFuture$State.OPEN;
        Object object4 = ClosingFuture$State.WILL_CREATE_VALUE_AND_CLOSER;
        boolean bl2 = this.compareAndUpdateState((ClosingFuture$State)((Object)object3), (ClosingFuture$State)((Object)object4));
        if (!bl2) {
            object = ClosingFuture$11.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State;
            object2 = (ClosingFuture$State)((Object)this.state.get());
            int n3 = ((Enum)object2).ordinal();
            Object object5 = object[n3];
            if (object5 != (n3 = 1)) {
                n3 = 2;
                if (object5 != n3) {
                    n3 = 3;
                    if (object5 != n3 && object5 != (n3 = 4) && object5 != (n3 = 5)) {
                        object2 = this.state;
                        object = new AssertionError(object2);
                        throw object;
                    }
                    object = new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
                    throw object;
                }
                object = new IllegalStateException("Cannot call finishToValueAndCloser() twice");
                throw object;
            }
            object = new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
            throw object;
        }
        object3 = this.future;
        object4 = new ClosingFuture$10(this, (ClosingFuture$ValueAndCloserConsumer)object);
        ((AbstractFuture)object3).addListener((Runnable)object4, (Executor)object2);
    }

    public ListenableFuture statusFuture() {
        FluentFuture fluentFuture = this.future;
        Function function = Functions.constant(null);
        Executor executor = MoreExecutors.directExecutor();
        return Futures.nonCancellationPropagating(fluentFuture.transform(function, executor));
    }

    public String toString() {
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = MoreObjects.toStringHelper(this);
        Object object = this.state.get();
        moreObjects$ToStringHelper = moreObjects$ToStringHelper.add("state", object);
        object = this.future;
        return moreObjects$ToStringHelper.addValue(object).toString();
    }

    public ClosingFuture transform(ClosingFuture$ClosingFunction object, Executor executor) {
        Preconditions.checkNotNull(object);
        ClosingFuture$4 closingFuture$4 = new ClosingFuture$4(this, (ClosingFuture$ClosingFunction)object);
        object = this.future.transformAsync(closingFuture$4, executor);
        return this.derive((FluentFuture)object);
    }

    public ClosingFuture transformAsync(ClosingFuture$AsyncClosingFunction object, Executor executor) {
        Preconditions.checkNotNull(object);
        ClosingFuture$5 closingFuture$5 = new ClosingFuture$5(this, (ClosingFuture$AsyncClosingFunction)object);
        object = this.future.transformAsync(closingFuture$5, executor);
        return this.derive((FluentFuture)object);
    }

    public CountDownLatch whenClosedCountDown() {
        return this.closeables.whenClosedCountDown();
    }
}

