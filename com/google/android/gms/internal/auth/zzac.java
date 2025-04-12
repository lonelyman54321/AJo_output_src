/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.internal.auth.zzaj;
import com.google.android.gms.internal.auth.zzal;

final class zzac
extends BaseImplementation$ApiMethodImpl {
    final /* synthetic */ boolean zza;

    public zzac(zzal zzal2, Api api, GoogleApiClient googleApiClient, boolean bl2) {
        this.zza = bl2;
        super(api, googleApiClient);
    }

    public final Result createFailedResult(Status status) {
        zzaj zzaj2 = new zzaj(status);
        return zzaj2;
    }
}

