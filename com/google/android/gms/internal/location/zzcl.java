/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzcl
implements RemoteCall {
    private final /* synthetic */ ListenerHolder zza;
    private final /* synthetic */ DeviceOrientationRequest zzb;

    public /* synthetic */ zzcl(ListenerHolder listenerHolder, DeviceOrientationRequest deviceOrientationRequest) {
        this.zza = listenerHolder;
        this.zzb = deviceOrientationRequest;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        ListenerHolder listenerHolder = this.zza;
        DeviceOrientationRequest deviceOrientationRequest = this.zzb;
        ((zzdz)object).zzC(listenerHolder, deviceOrientationRequest, (TaskCompletionSource)object2);
    }
}

