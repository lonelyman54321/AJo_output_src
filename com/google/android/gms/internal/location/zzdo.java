/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.internal.location.zzq;
import com.google.android.gms.location.zzz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdo
extends zzq {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzz zzb;

    public zzdo(TaskCompletionSource taskCompletionSource, zzz zzz2) {
        this.zza = taskCompletionSource;
        this.zzb = zzz2;
    }

    public final void zzd(zzl abstractSafeParcelable) {
        abstractSafeParcelable = abstractSafeParcelable.getStatus();
        TaskCompletionSource taskCompletionSource = this.zza;
        TaskUtil.setResultOrApiException((Status)abstractSafeParcelable, taskCompletionSource);
    }

    public final void zze() {
        this.zzb.zze();
    }
}

