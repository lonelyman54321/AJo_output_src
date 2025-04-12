/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbb;
import com.google.android.gms.location.LocationListener;

final class zzau
extends zzba {
    final /* synthetic */ LocationListener zza;

    public zzau(zzbb zzbb2, GoogleApiClient googleApiClient, LocationListener locationListener) {
        this.zza = locationListener;
        super(googleApiClient);
    }
}

