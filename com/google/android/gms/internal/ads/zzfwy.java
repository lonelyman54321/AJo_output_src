/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxg;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzfwy
implements OnCompleteListener {
    public final /* synthetic */ zzfxg zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzfwy(zzfxg zzfxg2, TaskCompletionSource taskCompletionSource) {
        this.zza = zzfxg2;
        this.zzb = taskCompletionSource;
    }

    public final void onComplete(Task task2) {
        zzfxg zzfxg2 = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzfxg2.zzt(taskCompletionSource, task2);
    }
}

