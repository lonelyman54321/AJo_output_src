/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzem;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

final class zzcv
implements RemoteCall {
    private final /* synthetic */ List zza;

    public /* synthetic */ zzcv(List list) {
        this.zza = list;
    }

    public final /* synthetic */ void accept(Object object, Object object2) {
        object2 = (TaskCompletionSource)object2;
        object = (zzdz)object;
        zzem zzem2 = zzem.zza(this.zza);
        ((zzdz)object).zzF(zzem2, (TaskCompletionSource)object2);
    }
}

