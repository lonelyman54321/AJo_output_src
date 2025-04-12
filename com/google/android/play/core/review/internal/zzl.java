/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzt;

public final class zzl
implements OnCompleteListener {
    public final /* synthetic */ zzt zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzl(zzt zzt2, TaskCompletionSource taskCompletionSource) {
        this.zza = zzt2;
        this.zzb = taskCompletionSource;
    }

    public final void onComplete(Task task2) {
        zzt zzt2 = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzt2.zzt(taskCompletionSource, task2);
    }
}

