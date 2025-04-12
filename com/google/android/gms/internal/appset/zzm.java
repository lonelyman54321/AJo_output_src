/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.appset;

import com.google.android.gms.appset.zza;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.appset.zzd;
import com.google.android.gms.internal.appset.zzg;
import com.google.android.gms.internal.appset.zzo;
import com.google.android.gms.internal.appset.zzp;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzm
implements RemoteCall {
    public final /* synthetic */ zzp zza;

    public /* synthetic */ zzm(zzp zzp2) {
        this.zza = zzp2;
    }

    public final void accept(Object object, Object object2) {
        zzp zzp2 = this.zza;
        object = (zzd)object;
        object2 = (TaskCompletionSource)object2;
        object = (zzg)((BaseGmsClient)object).getService();
        zza zza2 = new zza(null, null);
        zzo zzo2 = new zzo(zzp2, (TaskCompletionSource)object2);
        ((zzg)object).zzc(zza2, zzo2);
    }
}

