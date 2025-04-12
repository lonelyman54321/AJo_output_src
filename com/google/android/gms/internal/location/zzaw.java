/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbb;
import com.google.android.gms.location.LocationCallback;

final class zzaw
extends zzba {
    final /* synthetic */ LocationCallback zza;

    public zzaw(zzbb zzbb2, GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        this.zza = locationCallback;
        super(googleApiClient);
    }
}

