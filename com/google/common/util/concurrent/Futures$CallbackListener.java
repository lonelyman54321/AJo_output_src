/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class Futures$CallbackListener
implements Runnable {
    final FutureCallback callback;
    final Future future;

    public Futures$CallbackListener(Future future, FutureCallback futureCallback) {
        this.future = future;
        this.callback = futureCallback;
    }

    /*
     * WARNING - void declaration
     */
    public void run() {
        ExecutionException executionException2;
        block7: {
            void var1_5;
            block6: {
                Object object = this.future;
                boolean bl2 = object instanceof InternalFutureFailureAccess;
                if (bl2 && (object = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess)object)) != null) {
                    this.callback.onFailure((Throwable)object);
                    return;
                }
                object = this.future;
                try {
                    object = Futures.getDone((Future)object);
                }
                catch (Error error) {
                    break block6;
                }
                catch (RuntimeException runtimeException) {
                    break block6;
                }
                catch (ExecutionException executionException2) {
                    break block7;
                }
                this.callback.onSuccess(object);
                return;
            }
            this.callback.onFailure((Throwable)var1_5);
            return;
        }
        FutureCallback futureCallback = this.callback;
        Throwable throwable = executionException2.getCause();
        futureCallback.onFailure(throwable);
    }

    public String toString() {
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = MoreObjects.toStringHelper(this);
        FutureCallback futureCallback = this.callback;
        return moreObjects$ToStringHelper.addValue(futureCallback).toString();
    }
}

