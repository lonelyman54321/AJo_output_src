/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbh;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzdr;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbt
implements RemoteCall {
    private final /* synthetic */ zzbh zza;
    private final /* synthetic */ LocationRequest zzb;

    public /* synthetic */ zzbt(zzbh zzbh2, LocationRequest locationRequest) {
        this.zza = zzbh2;
        this.zzb = locationRequest;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        Object object3 = zzbi.zzb;
        object3 = this.zza;
        LocationRequest locationRequest = this.zzb;
        ((zzdz)object).zzs((zzdr)object3, locationRequest, (TaskCompletionSource)object2);
    }
}

