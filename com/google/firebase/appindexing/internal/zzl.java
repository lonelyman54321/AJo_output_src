/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback$Stub;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.appindexing.internal.zzaf;
import com.google.firebase.appindexing.internal.zzm;
import com.google.firebase.appindexing.internal.zzn;

final class zzl
extends IStatusCallback$Stub {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzm zzb;

    public zzl(zzm zzm2, TaskCompletionSource taskCompletionSource) {
        this.zzb = zzm2;
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status object) {
        TaskCompletionSource taskCompletionSource = this.zza;
        String string2 = null;
        boolean bl2 = taskCompletionSource.trySetResult(null);
        if (bl2) {
            bl2 = ((Status)object).isSuccess();
            if (bl2) {
                zzn.zzd(this.zzb.zza).setResult(null);
                return;
            }
            taskCompletionSource = zzn.zzd(this.zzb.zza);
            string2 = "Indexing error, please try again.";
            object = zzaf.zza((Status)object, string2);
            taskCompletionSource.setException((Exception)object);
        }
    }
}

