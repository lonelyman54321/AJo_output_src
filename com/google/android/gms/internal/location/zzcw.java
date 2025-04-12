/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzcw
implements RemoteCall {
    private final /* synthetic */ GeofencingRequest zza;
    private final /* synthetic */ PendingIntent zzb;

    public /* synthetic */ zzcw(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.zza = geofencingRequest;
        this.zzb = pendingIntent;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        GeofencingRequest geofencingRequest = this.zza;
        PendingIntent pendingIntent = this.zzb;
        ((zzdz)object).zzE(geofencingRequest, pendingIntent, (TaskCompletionSource)object2);
    }
}

