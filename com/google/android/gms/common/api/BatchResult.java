/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.api.BatchResultToken;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

public final class BatchResult
implements Result {
    private final Status zaa;
    private final PendingResult[] zab;

    public BatchResult(Status status, PendingResult[] pendingResultArray) {
        this.zaa = status;
        this.zab = pendingResultArray;
    }

    public Status getStatus() {
        return this.zaa;
    }

    public Result take(BatchResultToken object) {
        int n3 = ((BatchResultToken)object).mId;
        PendingResult[] pendingResultArray = this.zab;
        int n4 = pendingResultArray.length;
        if (n3 < n4) {
            n4 = 1;
        } else {
            n4 = 0;
            pendingResultArray = null;
        }
        Preconditions.checkArgument(n4 != 0, "The result token does not belong to this batch");
        pendingResultArray = this.zab;
        int n7 = ((BatchResultToken)object).mId;
        object = pendingResultArray[n7];
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return ((PendingResult)object).await(0L, timeUnit);
    }
}

