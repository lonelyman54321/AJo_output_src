/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbs
implements RemoteCall {
    private final /* synthetic */ PendingIntent zza;
    private final /* synthetic */ LocationRequest zzb;

    public /* synthetic */ zzbs(PendingIntent pendingIntent, LocationRequest locationRequest) {
        this.zza = pendingIntent;
        this.zzb = locationRequest;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        Api api = zzbi.zzb;
        api = this.zza;
        LocationRequest locationRequest = this.zzb;
        ((zzdz)object).zzu((PendingIntent)api, locationRequest, (TaskCompletionSource)object2);
    }
}

