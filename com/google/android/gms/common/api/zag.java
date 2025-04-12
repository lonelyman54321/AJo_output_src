/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class zag
extends BasePendingResult {
    private final Result zae;

    public zag(GoogleApiClient googleApiClient, Result result2) {
        super(googleApiClient);
        this.zae = result2;
    }

    public final Result createFailedResult(Status status) {
        return this.zae;
    }
}

