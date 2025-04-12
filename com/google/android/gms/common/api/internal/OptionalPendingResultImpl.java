/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

public final class OptionalPendingResultImpl
extends OptionalPendingResult {
    private final BasePendingResult zaa;

    public OptionalPendingResultImpl(PendingResult pendingResult) {
        pendingResult = (BasePendingResult)pendingResult;
        this.zaa = pendingResult;
    }

    public final void addStatusListener(PendingResult$StatusListener pendingResult$StatusListener) {
        this.zaa.addStatusListener(pendingResult$StatusListener);
    }

    public final Result await() {
        return this.zaa.await();
    }

    public final Result await(long l2, TimeUnit timeUnit) {
        return this.zaa.await(l2, timeUnit);
    }

    public final void cancel() {
        this.zaa.cancel();
    }

    public final Result get() {
        Object object = this.zaa;
        boolean bl2 = ((BasePendingResult)object).isReady();
        if (bl2) {
            object = this.zaa;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return ((BasePendingResult)object).await(0L, timeUnit);
        }
        object = new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
        throw object;
    }

    public final boolean isCanceled() {
        return this.zaa.isCanceled();
    }

    public final boolean isDone() {
        return this.zaa.isReady();
    }

    public final void setResultCallback(ResultCallback resultCallback) {
        this.zaa.setResultCallback(resultCallback);
    }

    public final void setResultCallback(ResultCallback resultCallback, long l2, TimeUnit timeUnit) {
        this.zaa.setResultCallback(resultCallback, l2, timeUnit);
    }

    public final TransformedResult then(ResultTransform resultTransform) {
        return this.zaa.then(resultTransform);
    }
}

