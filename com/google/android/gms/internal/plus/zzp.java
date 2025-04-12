/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.plus.zzk;
import com.google.android.gms.internal.plus.zzq;
import com.google.android.gms.plus.Plus$zza;

abstract class zzp
extends Plus$zza {
    private zzp(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public /* synthetic */ zzp(GoogleApiClient googleApiClient, zzk zzk2) {
        this(googleApiClient);
    }

    public /* synthetic */ Result createFailedResult(Status status) {
        zzq zzq2 = new zzq(this, status);
        return zzq2;
    }
}

