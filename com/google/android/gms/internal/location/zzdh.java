/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdh
extends LocationCallback {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzdz zzb;

    public zzdh(zzdz zzdz2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        this.zzb = zzdz2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onLocationResult(LocationResult object) {
        Object object2 = this.zza;
        object = ((LocationResult)object).getLastLocation();
        ((TaskCompletionSource)object2).trySetResult(object);
        try {
            object = this.zzb;
            object2 = "GetCurrentLocation";
        }
        catch (RemoteException remoteException) {
            return;
        }
        object2 = ListenerHolders.createListenerKey(this, (String)object2);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((zzdz)object).zzw((ListenerHolder$ListenerKey)object2, false, taskCompletionSource);
    }
}

