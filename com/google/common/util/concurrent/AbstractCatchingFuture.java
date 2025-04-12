/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractCatchingFuture$AsyncCatchingFuture;
import com.google.common.util.concurrent.AbstractCatchingFuture$CatchingFuture;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.FluentFuture$TrustedFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.NullnessCasts;
import com.google.common.util.concurrent.Platform;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

abstract class AbstractCatchingFuture
extends FluentFuture$TrustedFuture
implements Runnable {
    Class exceptionType;
    Object fallback;
    ListenableFuture inputFuture;

    public AbstractCatchingFuture(ListenableFuture object, Class clazz, Object object2) {
        object = (ListenableFuture)Preconditions.checkNotNull(object);
        this.inputFuture = object;
        this.exceptionType = object = (Class)Preconditions.checkNotNull(clazz);
        this.fallback = object = Preconditions.checkNotNull(object2);
    }

    public static ListenableFuture create(ListenableFuture listenableFuture, Class object, Function function, Executor executor) {
        AbstractCatchingFuture$CatchingFuture abstractCatchingFuture$CatchingFuture = new AbstractCatchingFuture$CatchingFuture(listenableFuture, (Class)object, function);
        object = MoreExecutors.rejectionPropagatingExecutor(executor, abstractCatchingFuture$CatchingFuture);
        listenableFuture.addListener(abstractCatchingFuture$CatchingFuture, (Executor)object);
        return abstractCatchingFuture$CatchingFuture;
    }

    public static ListenableFuture create(ListenableFuture listenableFuture, Class object, AsyncFunction asyncFunction, Executor executor) {
        AbstractCatchingFuture$AsyncCatchingFuture abstractCatchingFuture$AsyncCatchingFuture = new AbstractCatchingFuture$AsyncCatchingFuture(listenableFuture, (Class)object, asyncFunction);
        object = MoreExecutors.rejectionPropagatingExecutor(executor, abstractCatchingFuture$AsyncCatchingFuture);
        listenableFuture.addListener(abstractCatchingFuture$AsyncCatchingFuture, (Executor)object);
        return abstractCatchingFuture$AsyncCatchingFuture;
    }

    public final void afterDone() {
        ListenableFuture listenableFuture = this.inputFuture;
        this.maybePropagateCancellationTo(listenableFuture);
        this.inputFuture = null;
        this.exceptionType = null;
        this.fallback = null;
    }

    public abstract Object doFallback(Object var1, Throwable var2);

    public String pendingToString() {
        Object object = this.inputFuture;
        Class clazz = this.exceptionType;
        Object object2 = this.fallback;
        CharSequence charSequence = super.pendingToString();
        if (object != null) {
            String string2 = "inputFuture=[";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            stringBuilder.append("], ");
            object = stringBuilder.toString();
        } else {
            object = "";
        }
        if (clazz != null && object2 != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("exceptionType=[");
            ((StringBuilder)charSequence).append(clazz);
            ((StringBuilder)charSequence).append("], fallback=[");
            ((StringBuilder)charSequence).append(object2);
            ((StringBuilder)charSequence).append("]");
            return ((StringBuilder)charSequence).toString();
        }
        if (charSequence != null) {
            return Ft2.a((String)object, (String)charSequence);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        Object object2;
        Object object3;
        Class clazz;
        Object object4;
        block22: {
            boolean bl2;
            block20: {
                ExecutionException executionException2;
                StringBuilder stringBuilder;
                block21: {
                    block19: {
                        boolean bl3;
                        object4 = this.inputFuture;
                        clazz = this.exceptionType;
                        object3 = this.fallback;
                        boolean bl4 = false;
                        boolean bl5 = true;
                        if (object4 == null) {
                            bl2 = true;
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        if (clazz == null) {
                            bl3 = true;
                        } else {
                            bl3 = false;
                            stringBuilder = null;
                        }
                        bl2 |= bl3;
                        if (object3 == null) {
                            bl4 = true;
                        }
                        if (bl4 |= bl2) return;
                        bl4 = this.isCancelled();
                        if (bl4) {
                            return;
                        }
                        bl4 = false;
                        this.inputFuture = null;
                        bl5 = object4 instanceof InternalFutureFailureAccess;
                        if (bl5) {
                            object = object4;
                            try {
                                object = (InternalFutureFailureAccess)object4;
                                object = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess)object);
                                break block19;
                            }
                            catch (Error error) {
                                break block20;
                            }
                            catch (RuntimeException runtimeException) {
                                break block20;
                            }
                            catch (ExecutionException executionException2) {
                                break block21;
                            }
                        }
                        bl5 = false;
                        object = null;
                    }
                    if (object != null) break block20;
                    object2 = Futures.getDone((Future)object4);
                    break block22;
                }
                object2 = executionException2.getCause();
                if (object2 == null) {
                    stringBuilder = new StringBuilder("Future type ");
                    Object object5 = object4.getClass();
                    stringBuilder.append(object5);
                    object5 = " threw ";
                    stringBuilder.append((String)object5);
                    object = executionException2.getClass();
                    stringBuilder.append(object);
                    stringBuilder.append(" without a cause");
                    object = stringBuilder.toString();
                    object2 = new NullPointerException((String)object);
                }
                object = object2;
            }
            bl2 = false;
            object2 = null;
        }
        if (object == null) {
            object4 = NullnessCasts.uncheckedCastNullableTToT(object2);
            this.set(object4);
            return;
        }
        boolean bl6 = Platform.isInstanceOfThrowableClass((Throwable)object, clazz);
        if (!bl6) {
            this.setFuture((ListenableFuture)object4);
            return;
        }
        try {
            object4 = this.doFallback(object3, (Throwable)object);
            this.exceptionType = null;
            this.fallback = null;
            this.setResult(object4);
            return;
        }
        catch (Throwable throwable) {
            try {
                Platform.restoreInterruptIfIsInterruptedException(throwable);
                this.setException(throwable);
                return;
            }
            finally {
                this.exceptionType = null;
                this.fallback = null;
            }
        }
    }

    public abstract void setResult(Object var1);
}

