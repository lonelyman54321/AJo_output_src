/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.location.LocationSettingsResult;

abstract class zzcy
extends BaseImplementation$ApiMethodImpl {
    public zzcy(GoogleApiClient googleApiClient) {
        Api api = zzbi.zzb;
        super(api, googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        LocationSettingsResult locationSettingsResult = new LocationSettingsResult(status, null);
        return locationSettingsResult;
    }
}

