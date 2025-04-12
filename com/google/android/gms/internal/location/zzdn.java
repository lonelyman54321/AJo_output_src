/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.internal.location.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdn
extends zzq {
    final /* synthetic */ Object zza;
    final /* synthetic */ TaskCompletionSource zzb;

    public zzdn(Object object, TaskCompletionSource taskCompletionSource) {
        this.zza = object;
        this.zzb = taskCompletionSource;
    }

    public final void zzd(zzl abstractSafeParcelable) {
        abstractSafeParcelable = abstractSafeParcelable.getStatus();
        Object object = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        TaskUtil.setResultOrApiException((Status)abstractSafeParcelable, object, taskCompletionSource);
    }

    public final void zze() {
    }
}

