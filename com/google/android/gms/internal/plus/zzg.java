/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.plus.zzf;
import com.google.android.gms.plus.Plus$zza;

abstract class zzg
extends Plus$zza {
    private zzg(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public /* synthetic */ zzg(GoogleApiClient googleApiClient, zzf zzf2) {
        this(googleApiClient);
    }

    public /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}

