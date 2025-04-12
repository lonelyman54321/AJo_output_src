/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.internal.icing.zzaa;
import com.google.android.gms.internal.icing.zze;

abstract class zzai
extends BaseImplementation$ApiMethodImpl {
    public zzai(GoogleApiClient googleApiClient) {
        Api api = zze.zzb;
        super(api, googleApiClient);
    }

    public abstract void zza(zzaa var1);
}

