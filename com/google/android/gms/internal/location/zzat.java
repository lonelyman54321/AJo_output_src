/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbb;
import com.google.android.gms.location.LocationRequest;

final class zzat
extends zzba {
    final /* synthetic */ PendingIntent zza;
    final /* synthetic */ LocationRequest zzb;

    public zzat(zzbb zzbb2, GoogleApiClient googleApiClient, PendingIntent pendingIntent, LocationRequest locationRequest) {
        this.zza = pendingIntent;
        this.zzb = locationRequest;
        super(googleApiClient);
    }
}

