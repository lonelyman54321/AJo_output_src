/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbb;
import com.google.android.gms.location.LocationRequest;

final class zzar
extends zzba {
    final /* synthetic */ ListenerHolder zza;
    final /* synthetic */ LocationRequest zzb;

    public zzar(zzbb zzbb2, GoogleApiClient googleApiClient, ListenerHolder listenerHolder, LocationRequest locationRequest) {
        this.zza = listenerHolder;
        this.zzb = locationRequest;
        super(googleApiClient);
    }
}

