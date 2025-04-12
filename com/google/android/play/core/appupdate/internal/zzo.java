/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzx;

public final class zzo
implements OnCompleteListener {
    public final /* synthetic */ zzx zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzo(zzx zzx2, TaskCompletionSource taskCompletionSource) {
        this.zza = zzx2;
        this.zzb = taskCompletionSource;
    }

    public final void onComplete(Task task2) {
        zzx zzx2 = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzx2.zzt(taskCompletionSource, task2);
    }
}

