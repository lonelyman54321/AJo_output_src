/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzaf;

public final class zzw
implements OnCompleteListener {
    public final /* synthetic */ zzaf zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzw(zzaf zzaf2, TaskCompletionSource taskCompletionSource) {
        this.zza = zzaf2;
        this.zzb = taskCompletionSource;
    }

    public final void onComplete(Task task2) {
        zzaf zzaf2 = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzaf2.zzt(taskCompletionSource, task2);
    }
}

