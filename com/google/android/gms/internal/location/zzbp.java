/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbp
implements RemoteCall {
    private final /* synthetic */ CurrentLocationRequest zza;
    private final /* synthetic */ CancellationToken zzb;

    public /* synthetic */ zzbp(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken) {
        this.zza = currentLocationRequest;
        this.zzb = cancellationToken;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        Object object3 = zzbi.zzb;
        object3 = this.zza;
        CancellationToken cancellationToken = this.zzb;
        ((zzdz)object).zzr((CurrentLocationRequest)object3, cancellationToken, (TaskCompletionSource)object2);
    }
}

