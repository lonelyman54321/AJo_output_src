/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.zzac;
import com.google.android.gms.location.zzad;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbr
implements RemoteCall {
    static final /* synthetic */ zzbr zza;

    static {
        zzbr zzbr2;
        zza = zzbr2 = new zzbr();
    }

    private /* synthetic */ zzbr() {
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        Object object3 = zzbi.zzb;
        object3 = zzac.zza();
        ((zzdz)object).zzp((zzad)object3, (TaskCompletionSource)object2);
    }
}

