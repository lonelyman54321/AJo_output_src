/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbj
implements RemoteCall {
    private final /* synthetic */ LastLocationRequest zza;

    public /* synthetic */ zzbj(LastLocationRequest lastLocationRequest) {
        this.zza = lastLocationRequest;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        Object object3 = zzbi.zzb;
        object3 = this.zza;
        ((zzdz)object).zzq((LastLocationRequest)object3, (TaskCompletionSource)object2);
    }
}

