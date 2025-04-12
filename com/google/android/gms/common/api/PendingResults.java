/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.zaf;
import com.google.android.gms.common.api.zag;
import com.google.android.gms.common.api.zah;
import com.google.android.gms.common.internal.Preconditions;

public final class PendingResults {
    private PendingResults() {
    }

    public static PendingResult canceledPendingResult() {
        Looper looper = Looper.getMainLooper();
        StatusPendingResult statusPendingResult = new StatusPendingResult(looper);
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    /*
     * WARNING - void declaration
     */
    public static PendingResult canceledPendingResult(Result result2) {
        void var2_5;
        Preconditions.checkNotNull(result2, "Result must not be null");
        Object object = result2.getStatus();
        int bl2 = ((Status)object).getStatusCode();
        int n3 = 16;
        if (bl2 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object = null;
        }
        Preconditions.checkArgument((boolean)var2_5, "Status code must be CommonStatusCodes.CANCELED");
        object = new zaf(result2);
        ((BasePendingResult)object).cancel();
        return object;
    }

    public static PendingResult immediateFailedResult(Result result2, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(result2, "Result must not be null");
        Preconditions.checkArgument(result2.getStatus().isSuccess() ^ true, "Status code must not be SUCCESS");
        zag zag2 = new zag(googleApiClient, result2);
        zag2.setResult(result2);
        return zag2;
    }

    public static OptionalPendingResult immediatePendingResult(Result object) {
        Preconditions.checkNotNull(object, "Result must not be null");
        zah zah2 = new zah(null);
        zah2.setResult((Result)object);
        object = new OptionalPendingResultImpl(zah2);
        return object;
    }

    public static OptionalPendingResult immediatePendingResult(Result object, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(object, "Result must not be null");
        zah zah2 = new zah(googleApiClient);
        zah2.setResult((Result)object);
        object = new OptionalPendingResultImpl(zah2);
        return object;
    }

    public static PendingResult immediatePendingResult(Status status) {
        Preconditions.checkNotNull(status, "Result must not be null");
        Looper looper = Looper.getMainLooper();
        StatusPendingResult statusPendingResult = new StatusPendingResult(looper);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    public static PendingResult immediatePendingResult(Status status, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}

