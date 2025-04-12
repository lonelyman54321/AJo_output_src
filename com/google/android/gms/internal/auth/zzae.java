/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.internal.auth.zzai;
import com.google.android.gms.internal.auth.zzal;

final class zzae
extends BaseImplementation$ApiMethodImpl {
    final /* synthetic */ String zza;

    public zzae(zzal zzal2, Api api, GoogleApiClient googleApiClient, String string2) {
        this.zza = string2;
        super(api, googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        zzai zzai2 = new zzai(status, null);
        return zzai2;
    }
}

