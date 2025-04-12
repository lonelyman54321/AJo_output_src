/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zacp;

public abstract class ResultTransform {
    public final PendingResult createFailedResult(Status status) {
        zacp zacp2 = new zacp(status);
        return zacp2;
    }

    public Status onFailure(Status status) {
        return status;
    }

    public abstract PendingResult onSuccess(Result var1);
}

