/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzcq;
import com.google.android.gms.internal.location.zzcr;
import com.google.android.gms.location.GeofencingRequest;

final class zzcn
extends zzcq {
    final /* synthetic */ GeofencingRequest zza;
    final /* synthetic */ PendingIntent zzb;

    public zzcn(zzcr zzcr2, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.zza = geofencingRequest;
        this.zzb = pendingIntent;
        super(googleApiClient);
    }
}

