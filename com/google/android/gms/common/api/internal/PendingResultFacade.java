/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

public abstract class PendingResultFacade
extends PendingResult {
    public final void addStatusListener(PendingResult$StatusListener pendingResult$StatusListener) {
        throw null;
    }

    public final Result await() {
        throw null;
    }

    public final Result await(long l2, TimeUnit timeUnit) {
        throw null;
    }

    public final void cancel() {
        throw null;
    }

    public final boolean isCanceled() {
        throw null;
    }

    public final void setResultCallback(ResultCallback resultCallback) {
        throw null;
    }

    public final void setResultCallback(ResultCallback resultCallback, long l2, TimeUnit timeUnit) {
        throw null;
    }

    public final TransformedResult then(ResultTransform resultTransform) {
        throw null;
    }
}

