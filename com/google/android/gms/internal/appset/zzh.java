/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.appset;

import com.google.android.gms.internal.appset.zzl;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzh
implements Runnable {
    public final /* synthetic */ zzl zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzh(zzl zzl2, TaskCompletionSource taskCompletionSource) {
        this.zza = zzl2;
        this.zzb = taskCompletionSource;
    }

    public final void run() {
        zzl zzl2 = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzl2.zzd(taskCompletionSource);
    }
}

