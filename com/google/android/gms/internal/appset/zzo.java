/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.appset;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.appset.zze;
import com.google.android.gms.internal.appset.zzp;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzo
extends zze {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzp zzp2, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, zzc object) {
        AppSetIdInfo appSetIdInfo;
        if (object != null) {
            String string2 = ((zzc)object).zzb();
            int n3 = ((zzc)object).zza();
            appSetIdInfo = new AppSetIdInfo(string2, n3);
        } else {
            appSetIdInfo = null;
        }
        object = this.zza;
        TaskUtil.setResultOrApiException(status, appSetIdInfo, (TaskCompletionSource)object);
    }
}

