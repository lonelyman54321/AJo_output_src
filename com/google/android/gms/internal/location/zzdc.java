/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzdm;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdc
implements RemoteCall {
    static final /* synthetic */ zzdc zza;

    static {
        zzdc zzdc2;
        zza = zzdc2 = new zzdc();
    }

    private /* synthetic */ zzdc() {
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzv)((zzdz)object).getService();
        zzdm zzdm2 = new zzdm((TaskCompletionSource)object2);
        object.zzE(zzdm2);
    }
}

