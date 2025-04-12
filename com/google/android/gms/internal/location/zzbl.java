/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbl
implements RemoteCall {
    private final /* synthetic */ Location zza;

    public /* synthetic */ zzbl(Location location) {
        this.zza = location;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        Api api = zzbi.zzb;
        api = this.zza;
        ((zzdz)object).zzA((Location)api, (TaskCompletionSource)object2);
    }
}

